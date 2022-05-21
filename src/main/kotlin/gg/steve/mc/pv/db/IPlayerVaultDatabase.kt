package gg.steve.mc.pv.db

import gg.steve.mc.pv.db.connection.PlayerVaultDatabaseConnection
import java.io.File

interface IPlayerVaultDatabase {
    fun connect(): Boolean
    fun disconnect(): Boolean
    fun runDatabaseInitialisationScript(script: File): Boolean
    fun getConnection(): PlayerVaultDatabaseConnection
    // add more functions dependent on use case
}
