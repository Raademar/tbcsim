package character.classes.hunter.abilities

import character.Ability
import character.Buff
import character.Proc
import character.Stats
import character.classes.hunter.talents.ImprovedHuntersMark
import character.classes.hunter.talents.TheBeastWithin
import data.model.Item
import mechanics.General
import sim.Event
import sim.SimParticipant

class HuntersMark : Ability() {
    companion object {
        const val name = "Hunter's Mark"
    }
    override val id: Int = 14325
    override val name: String = Companion.name
    override fun gcdMs(sp: SimParticipant): Int = sp.physicalGcd().toInt()

    val baseCost = 60.0
    override fun resourceCost(sp: SimParticipant): Double {
        val tbwDiscount = if(sp.buffs[TheBeastWithin.name] != null) { 0.2 } else 0.0

        return General.resourceCostReduction(baseCost, listOf(tbwDiscount))
    }

    val baseApBonus = 110.0
    val apIncrement = 11.0
    val maxApBonus = 440.0

    class HuntersMarkState : Buff.State() {
        var rangedAttackCount: Int = 0
    }

    fun apIncProc(buff: Buff): Proc {
        // TODO: This should increase with other raid members' ranged attacks as well
        return object : Proc() {
            override val triggers: List<Trigger> = listOf(
                Trigger.RANGED_AUTO_HIT,
                Trigger.RANGED_AUTO_CRIT,
                Trigger.RANGED_WHITE_HIT,
                Trigger.RANGED_WHITE_CRIT,
                Trigger.RANGED_YELLOW_HIT,
                Trigger.RANGED_YELLOW_CRIT,
                Trigger.RANGED_BLOCK
            )
            override val type: Type = Type.STATIC

            override fun proc(sp: SimParticipant, items: List<Item>?, ability: Ability?, event: Event?) {
                val state = buff.state(sp) as HuntersMarkState
                state.rangedAttackCount += 1
            }
        }
    }

    val apBuff = object : Buff() {
        override val name: String = Companion.name
        override val durationMs: Int = 120000

        override fun stateFactory(): State {
            return HuntersMarkState()
        }

        val apProc = apIncProc(this)

        override fun modifyStats(sp: SimParticipant): Stats {
            val impHuntersMarkRanks = sp.character.klass.talents[ImprovedHuntersMark.name]?.currentRank ?: 0

            val attackCount = (state(sp) as HuntersMarkState).rangedAttackCount
            val rangedAp = (baseApBonus + (apIncrement * attackCount)).coerceAtMost(maxApBonus)

            return Stats(
                attackPower = (rangedAp * impHuntersMarkRanks * 0.2).toInt(),
                rangedAttackPower = rangedAp.toInt()
            )
        }

        override fun procs(sp: SimParticipant): List<Proc> = listOf(apProc)
    }

    override fun cast(sp: SimParticipant) {
        sp.sim.addRaidBuff(apBuff)
    }
}
