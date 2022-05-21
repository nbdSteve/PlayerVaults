package gg.steve.mc.pv.vault

import java.util.*

class PlayerVault(
    val ownerId: UUID,
    val vaultId: UUID = UUID.randomUUID(),
    val contents: Map<Int, VaultItem> = emptyMap(),
    val slots: Int = 0,
    val isReadOnly: Boolean = false
)
