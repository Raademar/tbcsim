package character.classes.warrior.talents

import character.Buff
import character.Stats
import character.Talent
import mechanics.Rating
import sim.SimParticipant

class WeaponMastery(currentRank: Int) : Talent(currentRank) {
    companion object {
        const val name = "Weapon Mastery"
    }

    override val name: String = Companion.name
    override val maxRank: Int = 2

    val buff = object : Buff() {
        override val name: String = "Weapon Mastery"
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sp: SimParticipant): Stats {
            // This is slightly wrong when parry is turned on, but that's a scuffed situation anyway
            return Stats(expertiseRating = currentRank * Rating.expertisePerPct)
        }
    }

    override fun buffs(sp: SimParticipant): List<Buff> = listOf(buff)
}
