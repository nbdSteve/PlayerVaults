package gg.steve.mc.pv.module

import dagger.Module
import dagger.Provides
import org.bukkit.command.SimpleCommandMap
import java.util.logging.Level
import javax.inject.Singleton

@Module
class VaultCommandMapModule {
    @Singleton
    @Provides
    fun provideVaultCommandMap(module: PlayerVaultsModule): SimpleCommandMap {
        val pluginManager = module.plugin.server.pluginManager
        val commandMap = pluginManager.javaClass.getDeclaredField("commandMap")

        if (!commandMap.trySetAccessible()) {
            module.plugin.logger.log(Level.WARNING, "Unable to make internal command accessible.")
            TODO()
        }

        return commandMap.get(pluginManager) as SimpleCommandMap
    }
}
