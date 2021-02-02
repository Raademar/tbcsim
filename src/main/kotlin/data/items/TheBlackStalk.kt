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

public class TheBlackStalk : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29350

  public override var name: String = "The Black Stalk"

  public override var itemLevel: Int = 110

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 165.0

  public override var maxDmg: Double = 307.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      stamina = 10,
      spellCritRating = 11.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14799, "Increase Spell Dam 20", this)
      )
}
