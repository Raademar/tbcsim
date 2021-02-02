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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class CrusadersScaledGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35477

  public override var name: String = "Crusader's Scaled Gauntlets"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(752)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 28,
      stamina = 25,
      intellect = 12,
      physicalCritRating = 12.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(23300, "Seal of the Crusader Judgement Increase", this)
      )
}
