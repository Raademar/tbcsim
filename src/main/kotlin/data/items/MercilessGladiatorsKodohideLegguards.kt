package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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

public class MercilessGladiatorsKodohideLegguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31989

  public override var name: String = "Merciless Gladiator's Kodohide Legguards"

  public override var itemLevel: Int = 136

  public override var itemSet: ItemSet? = ItemSets.byId(685)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 51,
      intellect = 40
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(23593, "Increase Healing 92", this),
      Buffs.byIdOrName(21636, "Increased Mana Regen", this)
      )
}
