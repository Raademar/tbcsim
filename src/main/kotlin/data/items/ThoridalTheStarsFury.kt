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

public class ThoridalTheStarsFury : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Thori'dal, the Stars' Fury"

  public override var itemLevel: Int = 164

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BOW

  public override var minDmg: Double = 355.6499938964844

  public override var maxDmg: Double = 523.6500244140625

  public override var speed: Double = 2700.0

  public override var stats: Stats = Stats(
      agility = 17,
      physicalCritRating = 16.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15806, "Attack Power 34", this),
      Buffs.byIdOrName(43219, "Armor Penetration 112", this),
      Buffs.byIdOrName(44972, "Legendary Bow Haste", this),
      Buffs.byIdOrName(46699, "Requires No Ammo", this)
      )
}