package gg.steve.mc.pv.manager

import gg.steve.mc.pv.listener.EventListener
import gg.steve.mc.pv.module.PlayerVaultsModule
import java.util.logging.Level
import javax.inject.Inject

class EventListenerManager @Inject
constructor(
    private val module: PlayerVaultsModule,
    private val listeners: Map<String, @JvmSuppressWildcards EventListener>,
) {

    fun register(): Boolean {
        val registered = listeners.values.map { listener -> listener.register() }
        module.plugin.logger.log(Level.INFO, "Successfully registered ${listeners.size} events with the server.")
        return !registered.contains(false)
    }
}
