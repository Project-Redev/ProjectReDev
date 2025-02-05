package net.roadkill.redev;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.roadkill.redev.platform.PlatformRegistry;

public class ReDevBlockEntity extends PlatformRegistry<Registry<BlockEntityType<?>>, ResourceKey<Registry<BlockEntityType<?>>>, BlockEntityType<?>> {

  @Override
  public Registry<BlockEntityType<?>> getRegistry() { return BuiltInRegistries.BLOCK_ENTITY_TYPE; }

  @Override
  public ResourceKey<Registry<BlockEntityType<?>>> getResourceKey(){ return Registries.BLOCK_ENTITY_TYPE; }



}