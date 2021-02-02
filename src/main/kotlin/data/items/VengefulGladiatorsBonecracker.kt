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

public class VengefulGladiatorsBonecracker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33662

  public override var name: String = "Vengeful Gladiator's Bonecracker"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 108.0

  public override var maxDmg: Double = 201.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      stamina = 30,
      physicalCritRating = 21.0,
      physicalHitRating = 8.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15806, "Attack Power 34", this),
      Buffs.byIdOrName(43901, "Armor Penetration 49", this)
      )
}
