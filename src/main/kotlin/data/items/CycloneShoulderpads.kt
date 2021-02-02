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

public class CycloneShoulderpads : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29031

  public override var name: String = "Cyclone Shoulderpads"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(631)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 33,
      intellect = 32
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2881)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18042, "Increase Healing 68", this)
      )
}
