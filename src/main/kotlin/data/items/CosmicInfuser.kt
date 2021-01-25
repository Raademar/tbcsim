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

public class CosmicInfuser : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Cosmic Infuser"

  public override var itemLevel: Int = 175

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 14.15999984741211

  public override var maxDmg: Double = 220.16000366210938

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(
      stamina = 40,
      intellect = 40,
      spirit = 40
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(36411),
      Buffs.byId(36387),
      Buffs.byId(36488)
      )
}
