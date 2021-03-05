package `data`.items

import `data`.Constants
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class BarrelBladeLongrifle : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30724

  public override var name: String = "Barrel-Blade Longrifle"

  public override var itemLevel: Int = 120

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_rifle_22.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var minDmg: Double = 147.0

  public override var maxDmg: Double = 275.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      agility = 16
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2887)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}