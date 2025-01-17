package character.auto

import character.Ability
import character.Proc
import data.Constants
import data.model.Item
import mechanics.Melee
import sim.Event
import sim.Sim
import sim.SimIteration
import sim.SimParticipant

abstract class AutoAttackBase : Ability() {
    abstract fun item(sp: SimParticipant): Item

    override fun gcdMs(sp: SimParticipant): Int = 0

    class AutoAttackState : Ability.State() {
        var lastAttackTimeMs = 0
        var count = 0
    }

    fun resetSwingTimer(sp: SimParticipant) {
        (state(sp) as AutoAttackState).lastAttackTimeMs = sp.sim.elapsedTimeMs
    }

    override fun stateFactory(): AutoAttackState {
        return AutoAttackState()
    }

    override fun available(sp: SimParticipant): Boolean {
        val nextAvailableTimeMs = (state(sp) as AutoAttackState).lastAttackTimeMs + sp.weaponSpeed(item(sp))
        return nextAvailableTimeMs <= sp.sim.elapsedTimeMs
    }

    override fun cast(sp: SimParticipant) {
        val damageRoll = Melee.baseDamageRoll(sp, item(sp))
        val result = Melee.attackRoll(sp, damageRoll, item(sp), isWhiteDmg = true)

        // Save last hit state and fire event
        (state(sp) as AutoAttackState).lastAttackTimeMs = sp.sim.elapsedTimeMs
        (state(sp) as AutoAttackState).count += 1

        val event = Event(
            eventType = Event.Type.DAMAGE,
            damageType = Constants.DamageType.PHYSICAL,
            isWhiteDamage = true,
            abilityName = name,
            amount = result.first,
            result = result.second,
        )
        sp.logEvent(event)

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
            sp.fireProc(triggerTypes, listOf(item(sp)), this, event)
        }
    }
}
