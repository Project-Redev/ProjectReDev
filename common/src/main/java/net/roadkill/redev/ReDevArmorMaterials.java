package net.roadkill.redev;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import java.util.EnumMap;
import net.minecraft.Util;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class ReDevArmorMaterials {

  public static final ArmorMaterial HOGLIN_HIDE = new ArmorMaterial(
      100,
      Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.HELMET, 1);
        map.put(ArmorType.CHESTPLATE, 3);
        map.put(ArmorType.LEGGINGS, 2);
        map.put(ArmorType.BOOTS, 1);
      }), 15, SoundEvents.ARMOR_EQUIP_LEATHER,
      0.0F, 0.0F,
      ReDevItemTags.HOGLIN_HIDE_REPAIR_MATERIALS,
      ResourceKey.create(EquipmentAssets.ROOT_ID, redevResource("hoglin")));

  public static final ArmorMaterial AURUM = new ArmorMaterial(
      300,
      Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.HELMET, 1);
        map.put(ArmorType.CHESTPLATE, 2);
        map.put(ArmorType.LEGGINGS, 1);
        map.put(ArmorType.BOOTS, 1);
      }), 25, SoundEvents.ARMOR_EQUIP_GOLD,
      0.0F, 0.0F,
      ReDevItemTags.AURUM_REPAIR_MATERIALS,
      ResourceKey.create(EquipmentAssets.ROOT_ID, redevResource("aurum")));

  public static final ArmorMaterial WITHERED = new ArmorMaterial(
      800,
      Util.make(new EnumMap<>(ArmorType.class), map -> {
        map.put(ArmorType.HELMET, 2);
        map.put(ArmorType.CHESTPLATE, 7);
        map.put(ArmorType.LEGGINGS, 5);
        map.put(ArmorType.BOOTS, 2);
      }), 30, SoundEvents.ARMOR_EQUIP_NETHERITE,
      2.0F, 0.1F,
      ReDevItemTags.WITHERED_REPAIR_MATERIALS,
      ResourceKey.create(EquipmentAssets.ROOT_ID, redevResource("withered")));

  public static final ArmorMaterial HORSE_ARMOR_NETHERITE = new ArmorMaterial(
      37,
      Util.make(new EnumMap<>(ArmorType.class), (p_371743_) -> {
        p_371743_.put(ArmorType.BOOTS, 3);
        p_371743_.put(ArmorType.LEGGINGS, 6);
        p_371743_.put(ArmorType.CHESTPLATE, 8);
        p_371743_.put(ArmorType.HELMET, 3);
        p_371743_.put(ArmorType.BODY, 11);
      }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
      3.0F, 0.5F, ItemTags.REPAIRS_NETHERITE_ARMOR,
      ResourceKey.create(EquipmentAssets.ROOT_ID, redevResource("netherite")));

}
