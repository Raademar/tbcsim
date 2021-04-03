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
public class MaghariWarlordsLegplates : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28175

  public override var name: String = "Mag'hari Warlord's Legplates"

  public override var itemLevel: Int = 103

  public override var quality: Int = 3

  public override var icon: String = "inv_pants_plate_21.jpg"

  public override var inventorySlot: Int = 7

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 12,
      stamina = 64,
      armor = 917,
      physicalCritRating = 12.0,
      physicalHitRating = 15.0,
      defenseRating = 16.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}