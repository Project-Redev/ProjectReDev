package net.roadkill.redev;

import net.minecraft.client.particle.Particle;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.roadkill.redev.item.ReDevItem;
import net.roadkill.redev.platform.PlatformRegistry;

public class ReDevParticles extends PlatformRegistry<Registry<ParticleType<?>>, ResourceKey<Registry<ParticleType<?>>>, ParticleType<?>> {

  @Override
  public Registry<ParticleType<?>> getRegistry() { return BuiltInRegistries.PARTICLE_TYPE; }

  @Override
  public ResourceKey<Registry<ParticleType<?>>> getResourceKey(){ return Registries.PARTICLE_TYPE; }



}
