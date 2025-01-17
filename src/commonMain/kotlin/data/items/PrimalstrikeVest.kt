package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class PrimalstrikeVest : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29525

  public override var name: String = "Primalstrike Vest"

  public override var itemLevel: Int = 120

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_cloth_45.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = ItemSets.byId(619)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 38,
      stamina = 39,
      armor = 379,
      physicalHitRating = 12.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33782, "Attack Power 108", this)
        )}

}
