package character.auto

import character.Ability
import character.Proc
import data.Constants
import data.model.Item
import mechanics.Melee
import sim.Event
import sim.SimIteration

abstract class MeleeBase : Ability() {
    abstract fun item(sim: SimIteration): Item

    override fun gcdMs(sim: SimIteration): Int = 0

    class AutoAttackState : Ability.State() {
        var lastAttackTimeMs = 0
        var count = 0
    }

    fun resetSwingTimer(sim: SimIteration) {
        (state(sim) as AutoAttackState).lastAttackTimeMs = sim.elapsedTimeMs
    }

    override fun stateFactory(): AutoAttackState {
        return AutoAttackState()
    }

    override fun available(sim: SimIteration): Boolean {
        val nextAvailableTimeMs = (state(sim) as AutoAttackState).lastAttackTimeMs + sim.weaponSpeed(item(sim))
        return nextAvailableTimeMs <= sim.elapsedTimeMs
    }

    override fun cast(sim: SimIteration) {
        val damageRoll = Melee.baseDamageRoll(sim, item(sim))
        val result = Melee.attackRoll(sim, damageRoll, item(sim), isWhiteDmg = true)

        // Save last hit state and fire event
        (state(sim) as AutoAttackState).lastAttackTimeMs = sim.elapsedTimeMs
        (state(sim) as AutoAttackState).count += 1

        val event = Event(
            eventType = Event.Type.DAMAGE,
            damageType = Constants.DamageType.PHYSICAL,
            isWhiteDamage = true,
            abilityName = name,
            amount = result.first,
            result = result.second,
        )
        sim.logEvent(event)

        // Proc anything that can proc off a white hit
        val triggerTypes = when(result.second) {
            Event.Result.HIT -> listOf(Proc.Trigger.MELEE_AUTO_HIT, Proc.Trigger.MELEE_WHITE_HIT, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.CRIT -> listOf(Proc.Trigger.MELEE_AUTO_CRIT, Proc.Trigger.MELEE_WHITE_CRIT, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.MISS -> listOf(Proc.Trigger.MELEE_MISS)
            Event.Result.GLANCE -> listOf(Proc.Trigger.MELEE_AUTO_HIT, Proc.Trigger.MELEE_GLANCE, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.DODGE -> listOf(Proc.Trigger.MELEE_DODGE)
            Event.Result.PARRY -> listOf(Proc.Trigger.MELEE_PARRY)
            Event.Result.BLOCK -> listOf(Proc.Trigger.MELEE_AUTO_HIT, Proc.Trigger.MELEE_WHITE_HIT, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.BLOCKED_CRIT -> listOf(Proc.Trigger.MELEE_AUTO_CRIT, Proc.Trigger.MELEE_WHITE_CRIT, Proc.Trigger.PHYSICAL_DAMAGE)
            else -> null
        }

        if(triggerTypes != null) {
            sim.fireProc(triggerTypes, listOf(item(sim)), this, event)
        }
    }
}