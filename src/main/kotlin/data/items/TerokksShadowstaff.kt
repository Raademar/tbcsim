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

public class TerokksShadowstaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29355

  public override var name: String = "Terokk's Shadowstaff"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 143.60000610351562

  public override var maxDmg: Double = 282.6000061035156

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 40,
      intellect = 42,
      spellCritRating = 37.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(37542, "Increase Spell Dam 168", this)
      )
}
