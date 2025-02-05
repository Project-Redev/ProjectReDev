package net.roadkill.redev;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ReDevToolMaterials {

  public static final ToolMaterial AURUM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 300, 3.0F, 1f, 50, ReDevItemTags.AURUM_REPAIR_MATERIALS);
  public static final ToolMaterial WITHERED = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 800, 9.0F, 2f, 18, ReDevItemTags.WITHERED_REPAIR_MATERIALS);

}
