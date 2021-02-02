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

public class BrutalGladiatorsFelweaveTrousers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35013

  public override var name: String = "Brutal Gladiator's Felweave Trousers"

  public override var itemLevel: Int = 159

  public override var itemSet: ItemSet? = ItemSets.byId(615)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 74,
      intellect = 30,
      spellCritRating = 39.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(26158, "Increase Spell Dam 60", this)
      )
}
