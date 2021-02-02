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

public class BracersOfAbsolution : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34434

  public override var name: String = "Bracers of Absolution"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = ItemSets.byId(674)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 18,
      intellect = 23,
      spirit = 16,
      spellHasteRating = 20.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3153)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18055, "Increase Spell Dam 39", this),
      Buffs.byIdOrName(21620, "Increased Mana Regen", this)
      )
}
