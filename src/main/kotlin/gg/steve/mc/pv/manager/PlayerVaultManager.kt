package gg.steve.mc.pv.manager

import dagger.Module
import gg.steve.mc.pv.collection.PlayerVaultCollection
import java.util.*

@Module
class PlayerVaultManager {
    private val vaultsByOwnerId: Map<UUID, PlayerVaultCollection> = emptyMap()
}
