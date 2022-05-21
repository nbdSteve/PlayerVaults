package gg.steve.mc.pv.file

import gg.steve.mc.pv.file.data.PluginFileDataEntry
import gg.steve.mc.pv.file.data.PluginFileDataType
import org.bukkit.plugin.java.JavaPlugin

interface IPluginFile {
    fun load(fileName: String, plugin: JavaPlugin): PluginFile
    fun save(): Boolean
    fun reload(): Boolean
    fun get(dataType: PluginFileDataType, key: String): PluginFileDataEntry
}