package sim

import kotlinx.coroutines.*
import mu.KotlinLogging
import sim.config.Config
import kotlin.random.Random
import kotlinx.datetime.Clock
import kotlin.time.ExperimentalTime

@ExperimentalTime
class Sim (
    val config: Config,
    val opts: SimOptions
) {
    val logger = KotlinLogging.logger {}

    suspend fun sim() {
        // Iteration coroutines
        val startTime = Clock.System.now()

        val iterations = (1..opts.iterations).map {
            GlobalScope.async(Dispatchers.Default) {
                iterate(it)
            }
        }.awaitAll()

        val endTime = Clock.System.now()
        val totalTime = endTime.minus(startTime).inMilliseconds
        println("Completed ${iterations.size} iterations in $totalTime seconds")

        // Stats
        SimStats.resourceUsage(iterations, config.character.klass.resourceType)
        SimStats.resultsByBuff(iterations)
        SimStats.resultsByDebuff(iterations)
        SimStats.resultsByDamageType(iterations)
        SimStats.resultsByAbility(iterations)
        SimStats.dps(iterations)
    }

    private fun iterate(num: Int) : SimIteration {
        // Simulate
        val iteration = SimIteration(config.character, config.rotation, opts)
//        if (num == 1) {
//            SimStats.precombatStats(iteration)
//        }

        // Randomly alter the fight duration, if configured
        val dvms = opts.durationVaribilityMs
        val variability = if(dvms != 0) { Random.nextInt(-1 * dvms, dvms) } else 0
        val durationMs = opts.durationMs + variability

        for (timeMs in 0..durationMs step opts.stepMs) {
            iteration.tickNum++
            iteration.elapsedTimeMs = timeMs
            iteration.tick()
        }

        iteration.cleanup()

        return iteration
    }
}