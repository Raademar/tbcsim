package `data`.items

import `data`.Constants
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

public class CataclysmHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Cataclysm Helm"

  public override var itemLevel: Int = 133

  public override var itemSet: ItemSet? = ItemSets.byId(636)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 41,
      agility = 32,
      stamina = 46,
      intellect = 23,
      physicalHitRating = 21.0,
      spellHitRating = 21.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2877)

  public override var buffs: List<Buff> = listOf()
}
