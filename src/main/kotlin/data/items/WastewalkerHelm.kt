package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class WastewalkerHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28224

  public override var name: String = "Wastewalker Helm"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(659)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 30,
      physicalCritRating = 22.0,
      physicalHitRating = 18.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2936)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15814, "Attack Power 56", this)
      )
}
