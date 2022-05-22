package gg.steve.mc.pv.command

import gg.steve.mc.pv.module.PlayerVaultsModule
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.SimpleCommandMap
import org.bukkit.plugin.Plugin
import javax.inject.Inject

class PlayerVaultCommand @Inject
constructor(
    private val module: PlayerVaultsModule,
    private val commandMap: SimpleCommandMap,
) : Command(Companion.name), VaultCommand {

    override fun execute(sender: CommandSender, commandLabel: String, args: Array<out String>): Boolean {
        sender.sendMessage("Command registered and working.")
        return true
    }

    override fun register(): Boolean {
        return commandMap.register(Companion.name, this)
    }

    override fun unregister(): Boolean {
        return commandMap.getCommand(Companion.name)?.unregister(commandMap) ?: false
    }

    override fun isSenderPermitted(sender: CommandSender): Boolean {
        return sender.hasPermission(Companion.permission)
    }

    override fun getPlugin(): Plugin {
        return module.plugin
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): MutableList<String>? {
        TODO("Not yet implemented")
    }

    companion object {
        const val name = "player-vaults"
        const val permission = "pv.use"
    }
}
