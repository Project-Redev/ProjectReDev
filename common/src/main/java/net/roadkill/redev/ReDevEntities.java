package net.roadkill.redev;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.roadkill.redev.entity.DurianThornEntity;
import net.roadkill.redev.entity.HoveringInfernoEntity;
import net.roadkill.redev.entity.LithicanEntity;
import net.roadkill.redev.entity.RevenantEntity;

public class ReDevEntities {

  public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ReDev.MOD_ID, Registries.ENTITY_TYPE);


  public static final RegistrySupplier<EntityType<?>> LITHICAN = entityType("lithican", EntityType.Builder.of(LithicanEntity::new, MobCategory.MONSTER).sized(0.6f, 1.95f));

  public static final RegistrySupplier<EntityType<?>> REVENANT = entityType("revenant", EntityType.Builder.of(RevenantEntity::new, MobCategory.MONSTER).sized(0.6f, 1.95f));

  public static final RegistrySupplier<EntityType<?>> DURIAN_THORN = entityType("durian_thorn", EntityType.Builder.of(DurianThornEntity::new, MobCategory.MISC).sized(0.5f, 0.5f));

  public static final RegistrySupplier<EntityType<?>> HOVERING_INFERNO = entityType("hovering_inferno", EntityType.Builder.of(HoveringInfernoEntity::new, MobCategory.MONSTER).sized(1.5f, 2.5f));

  private static RegistrySupplier<EntityType<?>> entityType(String name, EntityType.Builder<?> builder) {
    return ENTITIES.register(name, () -> builder.build(ResourceKey.create(Registries.ENTITY_TYPE, redevResource(name))));
  }

}
