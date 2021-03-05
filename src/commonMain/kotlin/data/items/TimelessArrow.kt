package `data`.items

import `data`.Constants
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
public class TimelessArrow : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31737

  public override var name: String = "Timeless Arrow"

  public override var itemLevel: Int = 145

  public override var quality: Int = 4

  public override var icon: String = "inv_misc_ammo_arrow_04.jpg"

  public override var inventorySlot: Int = 24

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.PROJECTILE

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.ARROW

  public override var minDmg: Double = 53.0

  public override var maxDmg: Double = 53.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}