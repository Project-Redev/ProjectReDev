package net.roadkill.redev;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.DeferredSupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.roadkill.redev.world.feature.HadaliteLayerFeature;
import net.roadkill.redev.world.feature.PetrifiedTreeFeature;
import net.roadkill.redev.world.feature.ShadeTreeFeature;

public class ReDevFeatures {

  public static DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ReDev.MOD_ID, Registries.FEATURE);

  public static final DeferredSupplier<Feature<?>> PETRIFIED_TREE_FEATURE = feature("petrified_tree", new PetrifiedTreeFeature(NoneFeatureConfiguration.CODEC));
  public static final DeferredSupplier<Feature<?>> SHADE_TREE_FEATURE = feature("shade_tree", new ShadeTreeFeature(NoneFeatureConfiguration.CODEC));
  public static final DeferredSupplier<Feature<?>> HADALITE_LAYER_FEATURE = feature("hadalite", new HadaliteLayerFeature(NoneFeatureConfiguration.CODEC));

  public static final ResourceKey<ConfiguredFeature<?, ?>> CONFIGURED_SHADE_TREE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ReDev.MOD_ID, "shade_tree"));

  private static DeferredSupplier<Feature<?>> feature(String name, Feature<?> feature) {
    return FEATURES.register(name, () -> feature);

  }
}
