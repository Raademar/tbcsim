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

public class MercilessGladiatorsGavel : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Merciless Gladiator's Gavel"

  public override var itemLevel: Int = 136

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 18.920000076293945

  public override var maxDmg: Double = 112.91999816894531

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 27,
      intellect = 18,
      spellHitRating = 15.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(42122)
      )
}
