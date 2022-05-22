package gg.steve.mc.pv.listener

import org.bukkit.event.Listener

interface EventListener : Listener {
    fun register(): Boolean
}
