package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class TheBladeOfHarbingers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34891

  public override var name: String = "The Blade of Harbingers"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_04.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 375.0

  public override var maxDmg: Double = 563.0

  public override var speed: Double = 3500.0

  public override var stats: Stats = Stats(
      physicalCritRating = 55.0,
      physicalHasteRating = 53.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33782, "Attack Power 108", this)
        )}

}