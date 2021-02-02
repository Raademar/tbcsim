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

public class JusticarLeggings : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29063

  public override var name: String = "Justicar Leggings"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(624)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 43,
      intellect = 42
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(33820, "Increase Healing 88", this),
      Buffs.byIdOrName(21634, "Increased Mana Regen", this)
      )
}
