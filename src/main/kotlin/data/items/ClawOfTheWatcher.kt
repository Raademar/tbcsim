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

public class ClawOfTheWatcher : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27846

  public override var name: String = "Claw of the Watcher"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 125.0

  public override var maxDmg: Double = 233.0

  public override var speed: Double = 2500.0

  public override var stats: Stats = Stats(
      physicalCritRating = 12.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2887)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14027, "Attack Power 24", this)
      )
}
