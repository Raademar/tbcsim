package character.classes.warlock.abilities

import character.Ability
import character.Proc
import character.classes.warlock.talents.*
import data.Constants
import mechanics.General
import mechanics.Spell
import sim.Event
import sim.SimIteration

class Incinerate : Ability() {
    companion object {
        const val name = "Incinerate"
    }

    override val id: Int = 32231
    override val name: String = Companion.name

    override fun gcdMs(sim: SimIteration): Int = sim.spellGcd().toInt()

    override fun resourceCost(sim: SimIteration): Double {
        val cataclysm = sim.subject.klass.talents[Cataclysm.name] as Cataclysm?
        val cataRed = cataclysm?.destructionCostReduction() ?: 0.0

        return General.resourceCostReduction(355.0, listOf(cataRed))
    }

    val baseCastTimeMs = 2500
    override fun castTimeMs(sim: SimIteration): Int {
        val emberstorm = sim.subject.klass.talents[Emberstorm.name] as Emberstorm?
        return (baseCastTimeMs * (emberstorm?.incinerateCastTimeMultiplier() ?: 1.0)).toInt()
    }

    val baseDamage = Pair(444.0, 515.0)
    val baseDamageWithImmolate = Pair(baseDamage.first + 111, baseDamage.second + 182)
    override fun cast(sim: SimIteration) {
        val devastation = sim.subject.klass.talents[Devastation.name] as Devastation?
        val devastationAddlCrit = devastation?.additionalDestructionCritChance() ?: 0.0

        val shadowAndFlame = sim.subject.klass.talents[ShadowAndFlame.name] as ShadowAndFlame?
        val shadowAndFlameBonusSpellDamageMultiplier = shadowAndFlame?.bonusDestructionSpellDamageMultiplier() ?: 0.0

        val spellPowerCoeff = Spell.spellPowerCoeff(baseCastTimeMs)
        val school = Constants.DamageType.FIRE

        val hasImmolate = sim.debuffs[Immolate.name] !== null
        val damagePair = if(hasImmolate) { baseDamageWithImmolate } else baseDamage

        val damageRoll = Spell.baseDamageRoll(sim, damagePair.first, damagePair.second, spellPowerCoeff, school, bonusSpellDamageMultiplier = shadowAndFlameBonusSpellDamageMultiplier)
        val result = Spell.attackRoll(sim, damageRoll, school, isBinary = false, devastationAddlCrit)

        val event = Event(
            eventType = Event.Type.DAMAGE,
            damageType = school,
            abilityName = name,
            amount = result.first,
            result = result.second,
        )
        sim.logEvent(event)

        // Proc anything that can proc off non-periodic Fire damage
        val triggerTypes = when(result.second) {
            Event.Result.HIT -> listOf(Proc.Trigger.SPELL_HIT, Proc.Trigger.FIRE_DAMAGE)
            Event.Result.CRIT -> listOf(Proc.Trigger.SPELL_CRIT, Proc.Trigger.FIRE_DAMAGE)
            Event.Result.RESIST -> listOf(Proc.Trigger.SPELL_RESIST)
            Event.Result.PARTIAL_RESIST_HIT -> listOf(Proc.Trigger.SPELL_HIT, Proc.Trigger.FIRE_DAMAGE)
            Event.Result.PARTIAL_RESIST_CRIT -> listOf(Proc.Trigger.SPELL_CRIT, Proc.Trigger.FIRE_DAMAGE)
            else -> null
        }

        if(triggerTypes != null) {
            sim.fireProc(triggerTypes, listOf(), this, event)
        }
    }
}