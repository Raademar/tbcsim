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

public class StaffOfTheRedeemer : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31038

  public override var name: String = "Staff of the Redeemer"

  public override var itemLevel: Int = 108

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 151.6999969482422

  public override var maxDmg: Double = 272.70001220703125

  public override var speed: Double = 3500.0

  public override var stats: Stats = Stats(
      stamina = 27,
      intellect = 45
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(36428, "Increase Healing 194", this),
      Buffs.byIdOrName(20959, "Increased Mana Regen", this)
      )
}
