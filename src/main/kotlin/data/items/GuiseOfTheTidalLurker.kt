package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class GuiseOfTheTidalLurker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Guise of the Tidal Lurker"

  public override var itemLevel: Int = 141

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 39,
      intellect = 35
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(42089),
      Buffs.byId(21644)
      )
}
