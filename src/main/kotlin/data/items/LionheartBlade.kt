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

public class LionheartBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28428

  public override var name: String = "Lionheart Blade"

  public override var itemLevel: Int = 107

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var minDmg: Double = 315.0

  public override var maxDmg: Double = 474.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 47,
      agility = 42
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(34514, "Fear Resistance 5", this)
      )
}
