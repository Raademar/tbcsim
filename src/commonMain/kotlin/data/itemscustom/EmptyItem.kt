package data.itemscustom

import character.Stats
import data.Constants
import data.model.Item
import data.model.ItemSet
import data.model.Socket
import data.model.SocketBonus
import kotlin.js.JsExport

@JsExport
class EmptyItem : Item() {
    override var isAutoGenerated: Boolean = false
    override var id: Int = -1
    override var name: String = "Empty"
    override var itemLevel: Int = -1
    override var quality: Int = 0
    override var icon: String = ""
    override var itemSet: ItemSet? = null
    override var inventorySlot: Int = Constants.InventorySlot.NOT_EQUIPPABLE.ordinal
    override var itemClass: Constants.ItemClass? = null
    override var itemSubclass: Constants.ItemSubclass? = null
    override var allowableClasses: Array<Constants.AllowableClass>? = null
    override var minDmg: Double = 0.0
    override var maxDmg: Double = 1.0
    override var speed: Double = 1.0
    override var stats: Stats = Stats()
    override var sockets: Array<Socket> = arrayOf()
    override var socketBonus: SocketBonus? = null
}
