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

public class OnslaughtGreathelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30974

  public override var name: String = "Onslaught Greathelm"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = ItemSets.byId(673)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 23,
      agility = 28,
      stamina = 48,
      defenseRating = 36.0,
      blockRating = 30.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2868)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(35074, "Block Value 35", this)
      )
}
