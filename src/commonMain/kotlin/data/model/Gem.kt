package data.model

import character.Stats
import data.Constants
import kotlin.js.JsExport

@JsExport
abstract class Gem(override var id: Int, var _name: String, override var icon: String, val prefix: Prefix?, val color: Color, var _quality: Quality): Item() {
    override var isAutoGenerated: Boolean = false
    override var quality: Int = _quality.ordinal
    override var itemLevel: Int = 0
    override var itemSet: ItemSet? = null
    override var inventorySlot: Int = Constants.InventorySlot.NOT_EQUIPPABLE.ordinal

    override var itemClass: Constants.ItemClass? = Constants.ItemClass.GEM
    override var itemSubclass: Constants.ItemSubclass? = color.itemSubclass

    override var minDmg: Double = 0.0
    override var maxDmg: Double = 0.0
    override var speed: Double = 0.0

    final override var stats: Stats

    override var sockets: Array<Socket> = arrayOf()
    override var socketBonus: SocketBonus? = null

    override var phase = if(_quality == Quality.EPIC) { 3 } else 1

    private val cleanPrefixName = if(prefix != null) { "${prefix.name.toLowerCase().capitalize()} " } else ""
    override var name = "$cleanPrefixName$_name"

    init {
        // Convert GemStats to item stats
        val tmpStats = Stats()
        for(gemStat in prefix?.stat ?: listOf()) {
            val value = when(_quality) {
                Quality.UNCOMMON -> gemStat.uncommonValue
                Quality.RARE -> gemStat.rareValue
                Quality.EPIC -> gemStat.epicValue
                Quality.META -> gemStat.metaValue
                else -> 0
            }
            tmpStats.addByStatType(gemStat.stat, value)
        }

        stats = tmpStats
    }

    // Meta gem color requirements
    internal fun socketsByColor(sockets: List<Socket>): Map<Color, Int> {
        // Find all gems that match red/yellow/blue, and count them
        val byColor = mutableMapOf<Color, Int>()
        byColor[Color.RED] = 0
        byColor[Color.YELLOW] = 0
        byColor[Color.BLUE] = 0

        sockets.filter { it.gem != null }.forEach {
            if(Color.matchesColor(it.gem!!, Color.RED)) {
                byColor[Color.RED] = byColor[Color.RED]!! + 1
            }
            if(Color.matchesColor(it.gem!!, Color.YELLOW)) {
                byColor[Color.YELLOW] = byColor[Color.YELLOW]!! + 1
            }
            if(Color.matchesColor(it.gem!!, Color.BLUE)) {
                byColor[Color.BLUE] = byColor[Color.BLUE]!! + 1
            }
        }

        return byColor
    }

    open fun metaActive(sockets: List<Socket>): Boolean {
        val byColor = socketsByColor(sockets)

        // Most meta gems have a requirement of at least 2 of each color
        // Ones that do not will override this
        return byColor[Color.RED] ?: 0 >= 2 &&
                byColor[Color.YELLOW] ?: 0 >= 2 &&
                byColor[Color.BLUE] ?: 0 >= 2
    }
}
