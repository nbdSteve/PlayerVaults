package gg.steve.mc.pv.manager

import gg.steve.mc.pv.PlayerVaultsPlugin
import gg.steve.mc.pv.listener.EventListener
import java.util.logging.Level
import javax.inject.Inject

class EventListenerManager @Inject
constructor(
    private val listeners: Map<String, @JvmSuppressWildcards EventListener>,
) {

    fun register(plugin: PlayerVaultsPlugin) {
        listeners.values.map { listener -> listener.register(plugin) }
        plugin.logger.log(Level.INFO, "Successfully registered ${listeners.size} events with the server.")
    }
}
