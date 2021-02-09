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

public class CycloneHandguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29034

  public override var name: String = "Cyclone Handguards"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(632)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 26,
      intellect = 29,
      spellHitRating = 19.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18052, "Increase Spell Dam 34", this),
      Buffs.byIdOrName(21626, "Increased Mana Regen", this)
      )
}