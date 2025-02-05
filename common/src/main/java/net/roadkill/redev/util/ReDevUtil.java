package net.roadkill.redev.util;

import net.minecraft.resources.ResourceLocation;
import net.roadkill.redev.ReDev;

public class ReDevUtil {

  public static ResourceLocation redevResource(String path) {
    return ResourceLocation.fromNamespaceAndPath(ReDev.MOD_ID, path);

  }

}
