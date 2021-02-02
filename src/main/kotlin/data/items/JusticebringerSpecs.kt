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

public class JusticebringerSpecs : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35185

  public override var name: String = "Justicebringer 3000 Specs"

  public override var itemLevel: Int = 159

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 48,
      intellect = 26,
      spellCritRating = 52.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2951)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(40342, "Increase Healing 128", this),
      Buffs.byIdOrName(30645, "Gas Cloud Tracking", this),
      Buffs.byIdOrName(40273, "Stealth Detection", this),
      Buffs.byIdOrName(12883, "Longsight", this)
      )
}
