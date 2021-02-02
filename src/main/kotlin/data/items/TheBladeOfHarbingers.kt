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

public class TheBladeOfHarbingers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34891

  public override var name: String = "The Blade of Harbingers"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 375.0

  public override var maxDmg: Double = 563.0

  public override var speed: Double = 3500.0

  public override var stats: Stats = Stats(
      physicalCritRating = 55.0,
      physicalHasteRating = 53.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(33782, "Attack Power 108", this)
      )
}
