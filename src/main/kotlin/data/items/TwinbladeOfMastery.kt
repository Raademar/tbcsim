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

public class TwinbladeOfMastery : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27814

  public override var name: String = "Twinblade of Mastery"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 80.0

  public override var maxDmg: Double = 121.0

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      stamina = 12,
      physicalCritRating = 21.0,
      expertiseRating = 11.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
