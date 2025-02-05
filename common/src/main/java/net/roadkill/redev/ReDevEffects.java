package net.roadkill.redev;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffect;
import net.roadkill.redev.platform.PlatformRegistry;

public class ReDevEffects extends PlatformRegistry<Registry<MobEffect>, ResourceKey<Registry<MobEffect>>, MobEffect> {

  @Override
  public Registry<MobEffect> getRegistry() { return BuiltInRegistries.MOB_EFFECT; }

  @Override
  public ResourceKey<Registry<MobEffect>> getResourceKey(){ return Registries.MOB_EFFECT; }

}
