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

public class NetherbladeFacemask : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29044

  public override var name: String = "Netherblade Facemask"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(621)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 28,
      stamina = 39,
      physicalHitRating = 14.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2877)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15825, "Attack Power 78", this)
      )
}
