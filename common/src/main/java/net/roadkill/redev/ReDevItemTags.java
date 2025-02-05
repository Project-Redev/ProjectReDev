package net.roadkill.redev;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ReDevItemTags {

  public static final TagKey<Item> AURUM_REPAIR_MATERIALS = create("aurum_repair_materials");
  public static final TagKey<Item> WITHERED_REPAIR_MATERIALS = create("withered_repair_materials");
  public static final TagKey<Item> HOGLIN_HIDE_REPAIR_MATERIALS = create("hoglin_hide_repair_materials");
  public static final TagKey<Item> WITHERED = create("withered");

  private static TagKey<Item> create(String name)
  {   return TagKey.create(Registries.ITEM, redevResource(name));
  }

  private static TagKey<Item> createCommon(String name)
  {   return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
  }

}
