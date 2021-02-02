package `data`.items

import `data`.Constants
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

public class KingsDefender : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28749

  public override var name: String = "King's Defender"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 98.0

  public override var maxDmg: Double = 182.0

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 28,
      physicalHitRating = 17.0,
      defenseRating = 13.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
