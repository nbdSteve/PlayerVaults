package gg.steve.mc.pv.manager

import gg.steve.mc.pv.collection.PlayerVaultCollection
import java.util.*

class PlayerVaultManager {
    private val vaultsByOwnerId: Map<UUID, PlayerVaultCollection> = emptyMap()
}
