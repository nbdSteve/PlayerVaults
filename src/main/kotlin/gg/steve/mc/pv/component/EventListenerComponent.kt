package gg.steve.mc.pv.component

import dagger.Component
import gg.steve.mc.pv.manager.EventListenerManager
import gg.steve.mc.pv.module.EventListenersModule

@Component(modules = [EventListenersModule::class])
interface EventListenerComponent {
    fun manager(): EventListenerManager
}
