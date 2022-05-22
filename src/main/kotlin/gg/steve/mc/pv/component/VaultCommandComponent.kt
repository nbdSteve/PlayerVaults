package gg.steve.mc.pv.component

import dagger.Component
import gg.steve.mc.pv.manager.VaultCommandManager
import gg.steve.mc.pv.module.PlayerVaultsModule
import gg.steve.mc.pv.module.VaultCommandMapModule
import gg.steve.mc.pv.module.VaultCommandModule
import javax.inject.Singleton

@Singleton
@Component(modules = [PlayerVaultsModule::class, VaultCommandMapModule::class, VaultCommandModule::class])
interface VaultCommandComponent {
    fun manager(): VaultCommandManager
}
