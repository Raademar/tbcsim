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

public class VestmentsOfTheAldor : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29077

  public override var name: String = "Vestments of the Aldor"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(648)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 34,
      intellect = 32,
      spirit = 14
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2889)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(28360, "Increase Spell Dam 49", this),
      Buffs.byIdOrName(26283, "Increased Spell Penetration 20", this)
      )
}
