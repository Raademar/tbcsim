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

public class HammerOfThePenitent : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Hammer of the Penitent"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 35.459999084472656

  public override var maxDmg: Double = 113.45999908447266

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      intellect = 16,
      spirit = 13
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(33273),
      Buffs.byId(21626)
      )
}
