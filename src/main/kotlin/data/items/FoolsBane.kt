package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class FoolsBane : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Fool's Bane"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 159.0

  public override var maxDmg: Double = 296.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      physicalCritRating = 24.0,
      spellCritRating = 24.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2925)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(9336)
      )
}
