package net.roadkill.redev;

import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.alchemy.Potion;
import net.roadkill.redev.platform.PlatformRegistry;

public class ReDevPotions extends PlatformRegistry<Registry<Potion>, ResourceKey<Registry<Potion>>, Potion> {

  @Override
  public Registry<Potion> getRegistry() { return BuiltInRegistries.POTION; }

  @Override
  public ResourceKey<Registry<Potion>> getResourceKey(){ return Registries.POTION; }

}

