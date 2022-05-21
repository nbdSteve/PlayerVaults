package gg.steve.mc.pv.listener

import gg.steve.mc.pv.PlayerVaultsPlugin
import org.bukkit.event.Listener

interface EventListener : Listener {
    fun register(plugin: PlayerVaultsPlugin)
}
