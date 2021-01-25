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

public class QuickeningBladeOfThePrince : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Quickening Blade of the Prince"

  public override var itemLevel: Int = 125

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 96.0

  public override var maxDmg: Double = 180.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      stamina = 27
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(15808),
      Buffs.byId(40680)
      )
}
