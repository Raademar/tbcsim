package `data`.items

import `data`.Constants
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

public class MercilessGladiatorsPlateLegguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Merciless Gladiator's Plate Legguards"

  public override var itemLevel: Int = 136

  public override var itemSet: ItemSet? = ItemSets.byId(567)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 47,
      stamina = 63,
      physicalCritRating = 43.0,
      physicalHitRating = 14.0,
      spellCritRating = 43.0,
      spellHitRating = 14.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
