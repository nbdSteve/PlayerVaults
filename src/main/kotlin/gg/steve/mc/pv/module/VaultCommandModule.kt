package gg.steve.mc.pv.module

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import gg.steve.mc.pv.command.PlayerVaultCommand
import gg.steve.mc.pv.command.VaultCommand

@Module
interface VaultCommandModule {
    @Binds
    @IntoMap
    @StringKey("player-vault")
    fun playerVault(command: PlayerVaultCommand): VaultCommand
}
