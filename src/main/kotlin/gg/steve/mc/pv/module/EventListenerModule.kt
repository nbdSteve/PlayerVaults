package gg.steve.mc.pv.module

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import gg.steve.mc.pv.listener.EventListener
import gg.steve.mc.pv.listener.JoinEventListener

@Module
interface EventListenerModule {
    @Binds
    @IntoMap
    @StringKey("Join")
    fun join(listener: JoinEventListener): EventListener
}
