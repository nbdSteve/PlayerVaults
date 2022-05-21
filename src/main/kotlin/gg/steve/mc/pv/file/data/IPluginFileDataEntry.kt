package gg.steve.mc.pv.file.data

interface IPluginFileDataEntry {
    fun obj(): Any
    fun string(): String
    fun long(): Long
    fun int(): Int
    fun double(): Double
}
