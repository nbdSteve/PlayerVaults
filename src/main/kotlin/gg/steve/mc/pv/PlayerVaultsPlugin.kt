package gg.steve.mc.pv

import gg.steve.mc.pv.module.PlayerVaultsModule
import org.bukkit.plugin.java.JavaPlugin

class PlayerVaultsPlugin : JavaPlugin() {
    private val module = PlayerVaultsModule

    override fun onLoad() {
        super.onLoad()

        module.load(this)
    }

    override fun onEnable() {
        super.onEnable()

        module.enable()
    }

    override fun onDisable() {
        super.onDisable()

        module.disable()
    }
}
