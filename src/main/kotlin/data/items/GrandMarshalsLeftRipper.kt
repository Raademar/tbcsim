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

public class GrandMarshalsLeftRipper : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Grand Marshal's Left Ripper"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 90.0

  public override var maxDmg: Double = 168.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 18,
      physicalCritRating = 13.0,
      physicalHitRating = 8.0,
      spellCritRating = 13.0,
      spellHitRating = 8.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(9334)
      )
}
