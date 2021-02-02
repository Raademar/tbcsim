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

public class Doomfinger : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 22821

  public override var name: String = "Doomfinger"

  public override var itemLevel: Int = 92

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 146.0

  public override var maxDmg: Double = 271.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18384, "Increased Critical Spell", this),
      Buffs.byIdOrName(9345, "Increase Spell Dam 16", this)
      )
}
