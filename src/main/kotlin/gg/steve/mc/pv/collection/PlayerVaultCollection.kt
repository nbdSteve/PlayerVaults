package gg.steve.mc.pv.collection

import gg.steve.mc.pv.vault.PlayerVault
import java.util.*

data class PlayerVaultCollection(
    val ownerId: UUID,
    val vaults: Map<Int, PlayerVault> = emptyMap(),
)
