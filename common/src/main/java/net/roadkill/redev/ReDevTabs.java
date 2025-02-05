package net.roadkill.redev;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ReDevTabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(ReDev.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> WOODEN_ITEMS = TABS.register(
        "wooden_items",
        () -> CreativeTabRegistry.create(
            Component.translatable("item_group." + ReDev.MOD_ID + ".wooden_items"),
            () -> new ItemStack(ReDevItems.SPRUCE_BOOKSHELF.get())
        )
    );

    public static void addItems() {
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.BOOKSHELF);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_BOOKSHELF.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_BOOKSHELF.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.LADDER);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_LADDER.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_LADDER.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.CAMPFIRE);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BONE_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_CAMPFIRE.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.SOUL_CAMPFIRE);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BONE_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_SOUL_CAMPFIRE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_SOUL_CAMPFIRE.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.SMITHING_TABLE);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_SMITHING_TABLE.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_SMITHING_TABLE.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.RAIL);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_RAIL.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.DETECTOR_RAIL);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_DETECTOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_DETECTOR_RAIL.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.POWERED_RAIL);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_POWERED_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_POWERED_RAIL.get());

        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.ACACIA_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.BIRCH_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.CRIMSON_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.DARK_OAK_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.JUNGLE_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.MANGROVE_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), Items.ACTIVATOR_RAIL);
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SPRUCE_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WARPED_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SCRAPWOOD_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.WHISPUR_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.PETRIFIED_ACTIVATOR_RAIL.get());
        CreativeTabRegistry.appendBuiltin(WOODEN_ITEMS.get(), ReDevItems.SHADE_ACTIVATOR_RAIL.get());    }

}
