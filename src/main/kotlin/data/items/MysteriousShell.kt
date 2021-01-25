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

public class MysteriousShell : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Mysterious Shell"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.PROJECTILE

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BULLET

  public override var minDmg: Double = 46.0

  public override var maxDmg: Double = 47.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOf()
}
