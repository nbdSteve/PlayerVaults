package gg.steve.mc.pv

import gg.steve.mc.pv.component.DaggerEventListenerComponent
import org.bukkit.plugin.java.JavaPlugin

class PlayerVaultsPlugin : JavaPlugin() {

    override fun onEnable() {
        // Register events
        this.registerListeners()
    }

    private fun registerListeners() {
        DaggerEventListenerComponent.create().manager().register(this)
    }
}
