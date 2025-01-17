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
public class Legionkiller : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32253

  public override var name: String = "Legionkiller"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_crossbow_20.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CROSSBOW

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 184.0

  public override var maxDmg: Double = 342.0

  public override var speed: Double = 2900.0

  public override var stats: Stats = Stats(
      agility = 21,
      stamina = 30
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 3

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
