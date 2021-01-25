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

public class NetherstrikeBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Netherstrike Bracers"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(617)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 13,
      intellect = 13,
      spellCritRating = 17.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3153)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(14799),
      Buffs.byId(21627)
      )
}
