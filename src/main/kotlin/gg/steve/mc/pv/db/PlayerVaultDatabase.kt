package gg.steve.mc.pv.db

import gg.steve.mc.pv.db.connection.PlayerVaultDatabaseConnection
import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

class PlayerVaultDatabase(
    private val configuration: YamlConfiguration,
) : IPlayerVaultDatabase {
    val implementationId: String = configuration.getString("type") ?: "sql"

    override fun connect(): Boolean {
        TODO("Not yet implemented")
    }

    override fun disconnect(): Boolean {
        TODO("Not yet implemented")
    }

    override fun runDatabaseInitialisationScript(script: File): Boolean {
        TODO("Not yet implemented")
    }

    override fun getConnection(): PlayerVaultDatabaseConnection {
        TODO("Prostagma")
    }
}
