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

public class JusticarFaceguard : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29068

  public override var name: String = "Justicar Faceguard"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(625)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 43,
      intellect = 24,
      defenseRating = 29.0,
      dodgeRating = 24.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2871)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14054, "Increase Spell Dam 27", this)
      )
}
