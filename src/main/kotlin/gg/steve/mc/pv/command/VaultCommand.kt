package gg.steve.mc.pv.command

import org.bukkit.command.CommandSender
import org.bukkit.command.PluginIdentifiableCommand
import org.bukkit.command.TabCompleter

interface VaultCommand : PluginIdentifiableCommand, TabCompleter {
    fun register(): Boolean
    fun unregister(): Boolean
    fun isSenderPermitted(sender: CommandSender): Boolean
}
