package net.roadkill.redev.item;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.SpawnEggItem;

public class ReDevSpawnEggItem extends SpawnEggItem {

    public ReDevSpawnEggItem(RegistrySupplier<EntityType<?>> entityType, Properties properties) {
        super((EntityType<? extends Mob>) entityType.get(), properties);
    }

}
