package gg.steve.mc.pv.listener

import gg.steve.mc.pv.PlayerVaultsPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import javax.inject.Inject

class JoinEventListener @Inject
constructor() : EventListener {

    override fun register(plugin: PlayerVaultsPlugin) {
        plugin.server.pluginManager.registerEvents(this, plugin)
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val ownerId = event.player.uniqueId

        event.player.sendMessage("${event.player.name}, welcome to the server.")
    }
}
