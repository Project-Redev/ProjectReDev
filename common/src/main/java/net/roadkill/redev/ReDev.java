package net.roadkill.redev;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

public final class ReDev {

    public static final String MOD_ID = "redev";

    public static void init() {
        ReDevSounds.SOUNDS.register();
        ReDevBlocks.BLOCKS.register();
        ReDevEntities.ENTITIES.register();
        ReDevItems.ITEMS.register();
        ReDevFeatures.FEATURES.register();
        ReDevTabs.TABS.register();
        ReDevTabs.addItems();
    }
}
