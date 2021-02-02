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

public class NordrassilWrathMantle : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30235

  public override var name: String = "Nordrassil Wrath-Mantle"

  public override var itemLevel: Int = 133

  public override var itemSet: ItemSet? = ItemSets.byId(643)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 26,
      intellect = 27,
      spirit = 16,
      spellHitRating = 15.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2900)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18057, "Increase Spell Dam 41", this)
      )
}
