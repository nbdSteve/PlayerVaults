package gg.steve.mc.pv.manager

import gg.steve.mc.pv.command.VaultCommand
import gg.steve.mc.pv.module.PlayerVaultsModule
import java.util.logging.Level
import javax.inject.Inject

class VaultCommandManager @Inject
constructor(
    private val module: PlayerVaultsModule,
    private val commands: Map<String, @JvmSuppressWildcards VaultCommand>
) {
    fun register(): Boolean {
        val registered = commands.values.map { command -> command.register() }
        module.plugin.logger.log(Level.INFO, "Successfully registered ${commands.size} events with the server.")
        return !registered.contains(false)
    }
}
