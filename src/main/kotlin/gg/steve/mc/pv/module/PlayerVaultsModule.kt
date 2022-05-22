package gg.steve.mc.pv.module

import dagger.Module
import dagger.Provides
import gg.steve.mc.pv.PlayerVaultsPlugin
import gg.steve.mc.pv.component.DaggerEventListenerComponent
import gg.steve.mc.pv.component.DaggerVaultCommandComponent
import java.util.logging.Level

@Module
object PlayerVaultsModule {
    lateinit var plugin: PlayerVaultsPlugin

    fun load(plugin: PlayerVaultsPlugin) {
        PlayerVaultsModule.plugin = plugin
    }

    fun enable() {
        // Register commands
        if (!DaggerVaultCommandComponent.builder().build().manager().register()) {
            plugin.logger.log(Level.WARNING, "Failed to register all plugin commands.")
        }

        // Register events
        if (!DaggerEventListenerComponent.create().manager().register()) {
            plugin.logger.log(Level.WARNING, "Failed to register all plugin events.")
        }
    }

    fun disable() {
    }

    @JvmStatic
    @Provides
    fun providePlayerVaultsModule(): PlayerVaultsModule {
        return this
    }
}
