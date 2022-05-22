package gg.steve.mc.pv.command.sub

import org.bukkit.command.CommandSender

interface VaultSubCommand {
    fun execute(sender: CommandSender, arguments: Array<out String>)
    fun addAlias(alias: String): Boolean
    fun removeAlias(alias: String): Boolean
    fun isSenderPermitted(sender: CommandSender): Boolean
    fun isValidNumberOfArguments(arguments: Array<out String>): Boolean
    fun isSubCommandExecutor(command: String): Boolean
}
