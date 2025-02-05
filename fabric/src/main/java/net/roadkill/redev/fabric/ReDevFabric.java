package net.roadkill.redev.fabric;

import net.fabricmc.api.ModInitializer;

import net.roadkill.redev.ReDev;

public final class ReDevFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ReDev.init();
    }
}
