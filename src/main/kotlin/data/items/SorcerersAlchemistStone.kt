package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class SorcerersAlchemistStone : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35749

  public override var name: String = "Sorcerer's Alchemist Stone"

  public override var itemLevel: Int = 125

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.TRADE_GOODS

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.TRADE_OTHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(42076, "Increase Spell Dam 63", this),
      Buffs.byIdOrName(17619, "Alchemist's Stone", this)
      )
}
