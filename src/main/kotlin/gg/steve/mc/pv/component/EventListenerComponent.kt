package gg.steve.mc.pv.component

import dagger.Component
import gg.steve.mc.pv.manager.EventListenerManager
import gg.steve.mc.pv.module.EventListenerModule
import gg.steve.mc.pv.module.PlayerVaultsModule
import javax.inject.Singleton

@Singleton
@Component(modules = [PlayerVaultsModule::class, EventListenerModule::class])
interface EventListenerComponent {
    fun manager(): EventListenerManager
}
