package net.roadkill.redev;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ReDevBlockSets {

  public static final BlockSetType SCRAPWOOD = BlockSetType.register(new BlockSetType("scrapwood",
      true, true, true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      SoundType.NETHER_WOOD,
      SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN,
      SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN,
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON));

  public static final BlockSetType WHISPUR = BlockSetType.register(new BlockSetType("whispur",
      true, true, true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      SoundType.NETHER_WOOD,
      SoundEvents.NETHER_WOOD_DOOR_CLOSE, SoundEvents.NETHER_WOOD_DOOR_OPEN,
      SoundEvents.NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.NETHER_WOOD_TRAPDOOR_OPEN,
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.NETHER_WOOD_BUTTON_CLICK_ON));

  public static final BlockSetType PETRIFIED = BlockSetType.register(new BlockSetType("petrified",
      true, true, true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      ReDevSounds.PETRIFIED_PLANKS,
      ReDevSounds.PETRIFIED_DOOR_CLOSE.get(), ReDevSounds.PETRIFIED_DOOR_OPEN.get(),
      ReDevSounds.PETRIFIED_DOOR_CLOSE.get(), ReDevSounds.PETRIFIED_DOOR_OPEN.get(),
      SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.NETHER_WOOD_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));

  public static BlockSetType SHADE = BlockSetType.register(new BlockSetType("shade",
      true, true, true,
      BlockSetType.PressurePlateSensitivity.EVERYTHING,
      SoundType.WOOD,
      SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN,
      SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN,
      SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON,
      SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON));

}
