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

public class MarksmansBow : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29152

  public override var name: String = "Marksman's Bow"

  public override var itemLevel: Int = 100

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BOW

  public override var minDmg: Double = 144.0

  public override var maxDmg: Double = 269.0

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(
      agility = 12,
      physicalHitRating = 11.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(9332, "Attack Power 22", this)
      )
}
