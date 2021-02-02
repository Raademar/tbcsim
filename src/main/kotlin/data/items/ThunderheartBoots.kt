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

public class ThunderheartBoots : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34571

  public override var name: String = "Thunderheart Boots"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = ItemSets.byId(678)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 22,
      intellect = 32,
      spirit = 24,
      spellHasteRating = 19.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3097)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(32584, "Increase Healing 95", this),
      Buffs.byIdOrName(21632, "Increased Mana Regen", this)
      )
}
