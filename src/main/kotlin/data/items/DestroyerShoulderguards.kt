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

public class DestroyerShoulderguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30117

  public override var name: String = "Destroyer Shoulderguards"

  public override var itemLevel: Int = 133

  public override var itemSet: ItemSet? = ItemSets.byId(656)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 13,
      agility = 21,
      stamina = 44,
      defenseRating = 29.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3017)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(28325, "Block Value 32", this)
      )
}
