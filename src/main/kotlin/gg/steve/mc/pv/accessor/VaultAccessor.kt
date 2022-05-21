package gg.steve.mc.pv.accessor

import dagger.Module
import dagger.Provides
import gg.steve.mc.pv.collection.PlayerVaultCollection
import gg.steve.mc.pv.vault.PlayerVault
import java.util.*

@Module
object VaultAccessor {
    private val data = mutableMapOf<UUID, PlayerVaultCollection>()

    @JvmStatic
    @Provides
    fun getVaultsForOwnerId(ownerId: UUID): PlayerVaultCollection {
        // If the player's data is not in the cache, retrieve it
        if (!data.containsKey(ownerId)) {
            data[ownerId] = getOwnerVaultData(ownerId)
        }

        return data.getOrDefault(ownerId, PlayerVaultCollection(ownerId))
    }

    @JvmStatic
    @Provides
    fun getVaultById(vaultId: UUID): PlayerVault {
        val vault = data.values.map { vaultCollection ->
            vaultCollection.vaults.values.filter { vault -> vault.vaultId === vaultId }[0]
        }[0]

        return vault
    }

    private fun getOwnerVaultData(ownerId: UUID): PlayerVaultCollection {
        // TODO Add code to retrieve from sql database, if not found put an empty list.
        return PlayerVaultCollection(ownerId)
    }
}
