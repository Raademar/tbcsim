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

public class IncantersCowl : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28278

  public override var name: String = "Incanter's Cowl"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(647)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 27,
      spirit = 17,
      spellCritRating = 19.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2890)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(13881, "Increase Spell Dam 29", this)
      )
}
