package gg.steve.mc.pv.listener

import gg.steve.mc.pv.module.PlayerVaultsModule
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerJoinEvent
import javax.inject.Inject

class JoinEventListener @Inject
constructor(
    private val plugin: PlayerVaultsModule,
) : EventListener {

    override fun register(): Boolean {
        plugin.plugin.server.pluginManager.registerEvents(this, plugin.plugin)
        return true
    }

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val ownerId = event.player.uniqueId

        event.player.sendMessage("${event.player.name}, welcome to the server.")
    }
}
