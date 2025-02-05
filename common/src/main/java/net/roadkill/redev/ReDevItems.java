package net.roadkill.redev;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.DeferredSupplier;
import dev.architectury.registry.registries.RegistrySupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.roadkill.redev.item.HangingLadderItem;
import net.roadkill.redev.item.HoglinArmorItem;
import net.roadkill.redev.item.ReDevItem;
import net.roadkill.redev.item.ReDevSpawnEggItem;

public class ReDevItems {

  public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ReDev.MOD_ID, Registries.ITEM);

  public static final RegistrySupplier<ReDevItem> HOGLIN_HIDE = noSettingsItem("hoglin_hide");
  public static final RegistrySupplier<ArmorItem> HOGLIN_HIDE_HOOVES = armorItem("hoglin_hide_hooves", () -> new ArmorItem(ReDevArmorMaterials.HOGLIN_HIDE, ArmorType.BOOTS, new Item.Properties().setId(id("hoglin_hide_hooves"))));
  public static final RegistrySupplier<ArmorItem> HOGLIN_HIDE_CAP = armorItem("hoglin_hide_head", () -> new HoglinArmorItem(ReDevArmorMaterials.HOGLIN_HIDE, ArmorType.HELMET, new Item.Properties().setId(id("hoglin_hide_head"))));
  public static final RegistrySupplier<ArmorItem> HOGLIN_HIDE_TUNIC = armorItem("hoglin_hide_cloak", () -> new HoglinArmorItem(ReDevArmorMaterials.HOGLIN_HIDE, ArmorType.CHESTPLATE, new Item.Properties().setId(id("hoglin_hide_cloak"))));
  public static final RegistrySupplier<ReDevItem> WOOD_SCRAP = noSettingsItem("wood_scrap");

  public static final RegistrySupplier<ReDevItem> AURUM_NUGGET = noSettingsItem("aurum_nugget");
  public static final RegistrySupplier<ReDevItem> AURUM_INGOT = noSettingsItem("aurum_ingot");
  public static final RegistrySupplier<Item> AURUM_SWORD = item("aurum_sword", () -> new SwordItem(ReDevToolMaterials.AURUM, 3f, 1.6f-4f, new Item.Properties().setId(id("aurum_sword"))));
  public static final RegistrySupplier<Item> AURUM_PICKAXE = item("aurum_pickaxe", () -> new PickaxeItem(ReDevToolMaterials.AURUM, 1f, 1.2f-4f,new Item.Properties().setId(id("aurum_pickaxe"))));
  public static final RegistrySupplier<Item> AURUM_AXE = item("aurum_axe", () -> new AxeItem(ReDevToolMaterials.AURUM, 7f, 0.8f-4f,new Item.Properties().setId(id("aurum_axe"))));
  public static final RegistrySupplier<Item> AURUM_SHOVEL = item("aurum_shovel",() ->  new ShovelItem(ReDevToolMaterials.AURUM, 1.5f, 1f-4f,new Item.Properties().setId(id("aurum_shovel"))));
  public static final RegistrySupplier<Item> AURUM_HOE = item("aurum_hoe",() ->  new HoeItem(ReDevToolMaterials.AURUM, -1f, 2f-4f,new Item.Properties().setId(id("aurum_hoe"))));
  public static final RegistrySupplier<Item> AURUM_HELMET = item("aurum_helmet",() ->  new ArmorItem(ReDevArmorMaterials.AURUM, ArmorType.HELMET,new Item.Properties().setId(id("aurum_helmet"))));
  public static final RegistrySupplier<Item> AURUM_CHESTPLATE = item("aurum_chestplate",() ->  new ArmorItem(ReDevArmorMaterials.AURUM, ArmorType.CHESTPLATE,new Item.Properties().setId(id("aurum_chestplate"))));
  public static final RegistrySupplier<Item> AURUM_LEGGINGS = item("aurum_leggings",() ->  new ArmorItem(ReDevArmorMaterials.AURUM, ArmorType.LEGGINGS,new Item.Properties().setId(id("aurum_leggings"))));
  public static final RegistrySupplier<Item> AURUM_BOOTS = item("aurum_boots",() ->  new ArmorItem(ReDevArmorMaterials.AURUM, ArmorType.BOOTS,new Item.Properties().setId(id("aurum_boots"))));

  public static final RegistrySupplier<ReDevItem> CHARRED_BONE = noSettingsItem("charred_bone");

  public static final RegistrySupplier<ReDevItem> WITHERED_INGOT = noSettingsItem("withered_ingot");
  public static final RegistrySupplier<Item> WITHERED_SWORD = item("withered_sword",() ->  new SwordItem(ReDevToolMaterials.WITHERED, 3f, 1.6f-4f,new Item.Properties().setId(id("withered_sword"))));
  public static final RegistrySupplier<Item> WITHERED_PICKAXE = item("withered_pickaxe",() ->  new PickaxeItem(ReDevToolMaterials.WITHERED, 1f, 1.2f-4f,new Item.Properties().setId(id("withered_pickaxe"))));
  public static final RegistrySupplier<Item> WITHERED_AXE = item("withered_axe",() ->  new AxeItem(ReDevToolMaterials.WITHERED, 6f, 0.9f-4f,new Item.Properties().setId(id("withered_axe"))));
  public static final RegistrySupplier<Item> WITHERED_SHOVEL = item("withered_shovel",() ->  new ShovelItem(ReDevToolMaterials.WITHERED, 1.5f, 1f-4f,new Item.Properties().setId(id("withered_shovel"))));
  public static final RegistrySupplier<Item> WITHERED_HOE = item("withered_hoe",() ->  new HoeItem(ReDevToolMaterials.WITHERED, 0f, 3f-4f, new Item.Properties().setId(id("withered_hoe"))));
  public static final RegistrySupplier<Item> WITHERED_HELMET = item("withered_helmet",() ->  new ArmorItem(ReDevArmorMaterials.WITHERED, ArmorType.HELMET,new Item.Properties().setId(id("withered_helmet"))));
  public static final RegistrySupplier<Item> WITHERED_CHESTPLATE = item("withered_chestplate",() ->  new ArmorItem(ReDevArmorMaterials.WITHERED, ArmorType.CHESTPLATE,new Item.Properties().setId(id("withered_chestplate"))));
  public static final RegistrySupplier<Item> WITHERED_LEGGINGS = item("withered_leggings",() ->  new ArmorItem(ReDevArmorMaterials.WITHERED, ArmorType.LEGGINGS,new Item.Properties().setId(id("withered_leggings"))));
  public static final RegistrySupplier<Item> WITHERED_BOOTS = item("withered_boots",() ->  new ArmorItem(ReDevArmorMaterials.WITHERED, ArmorType.BOOTS,new Item.Properties().setId(id("withered_boots"))));

  public static final RegistrySupplier<BlockItem> CARAMINE_RYE_SEEDS = blockItem("caramine_rye_seeds", ReDevBlocks.CARAMINE_RYE);
  public static final RegistrySupplier<ReDevItem> CHURK = settingsItem("churk", new Item.Properties().setId(id("churk")).food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.3f).build(), Consumable.builder().consumeSeconds(0.8f).build()));
  public static final RegistrySupplier<ReDevItem> CARAMINE_RYE = noSettingsItem("caramine_rye");
  public static final RegistrySupplier<ReDevItem> WARPED_DRUPEL = settingsItem("warped_drupel", new Item.Properties().setId(id("warped_drupel")).food(new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build(), Consumable.builder().consumeSeconds(0.8f).build()));

  public static final RegistrySupplier<Item> NETHERITE_HORSE_ARMOR = item("netherite_horse_armor",() ->  new AnimalArmorItem(ReDevArmorMaterials.HORSE_ARMOR_NETHERITE, AnimalArmorItem.BodyType.EQUESTRIAN,new Item.Properties().setId(id("netherite_horse_armor")).stacksTo(1).fireResistant()));

  public static final RegistrySupplier<Item> LITHICAN_SPAWN_EGG = item("lithican_spawn_egg",() -> new ReDevSpawnEggItem(
      ReDevEntities.LITHICAN, new Item.Properties().setId(id("lithican_spawn_egg"))));
  public static final RegistrySupplier<Item> REVENANT_SPAWN_EGG = item("revenant_spawn_egg",() -> new ReDevSpawnEggItem(
      ReDevEntities.REVENANT, new Item.Properties().setId(id("revenant_spawn_egg"))));
  public static final RegistrySupplier<Item> HOVERING_INFERNO_SPAWN_EGG = item("hovering_inferno_spawn_egg",() -> new ReDevSpawnEggItem(
      ReDevEntities.HOVERING_INFERNO, new Item.Properties().setId(id("hovering_inferno_spawn_egg"))));

  public static final RegistrySupplier<ReDevItem> DURIAN_SLICE = settingsItem("durian_slice", new Item.Properties().setId(id("durian_slice")).food(new FoodProperties.Builder().nutrition(4).saturationModifier(0.3F).build()));

  public static final RegistrySupplier<Item> NETHERITE_SHIELD = item("netherite_shield",() ->  new ShieldItem(new Item.Properties().setId(id("netherite_shield")).durability(1200).fireResistant()));
  public static final RegistrySupplier<Item> INFERNAL_PLATE = item("infernal_plate",() ->  new ShieldItem(new Item.Properties().setId(id("infernal_plate")).durability(600).fireResistant()));

  /*
   Block Items
   */
  public static final RegistrySupplier<BlockItem> ACACIA_BOOKSHELF = blockItem("acacia_bookshelf", ReDevBlocks.ACACIA_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> BIRCH_BOOKSHELF = blockItem("birch_bookshelf", ReDevBlocks.BIRCH_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> CRIMSON_BOOKSHELF = blockItem("crimson_bookshelf", ReDevBlocks.CRIMSON_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> DARK_OAK_BOOKSHELF = blockItem("dark_oak_bookshelf", ReDevBlocks.DARK_OAK_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> JUNGLE_BOOKSHELF = blockItem("jungle_bookshelf", ReDevBlocks.JUNGLE_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> MANGROVE_BOOKSHELF = blockItem("mangrove_bookshelf", ReDevBlocks.MANGROVE_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> SPRUCE_BOOKSHELF = blockItem("spruce_bookshelf", ReDevBlocks.SPRUCE_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> WARPED_BOOKSHELF = blockItem("warped_bookshelf", ReDevBlocks.WARPED_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_BOOKSHELF = blockItem("scrapwood_bookshelf", ReDevBlocks.SCRAPWOOD_BOOKSHELF);
  public static final RegistrySupplier<BlockItem> WHISPUR_BOOKSHELF = blockItem("whispur_bookshelf", ReDevBlocks.WHISPUR_BOOKSHELF);
public static final RegistrySupplier<BlockItem> PETRIFIED_BOOKSHELF = blockItem("petrified_bookshelf", ReDevBlocks.PETRIFIED_BOOKSHELF);
public static final RegistrySupplier<BlockItem> SHADE_BOOKSHELF = blockItem("shade_bookshelf", ReDevBlocks.SHADE_BOOKSHELF);

  public static final RegistrySupplier<BlockItem> ACACIA_LADDER = blockItem("acacia_ladder", ReDevBlocks.ACACIA_LADDER);
  public static final RegistrySupplier<BlockItem> BIRCH_LADDER = blockItem("birch_ladder", ReDevBlocks.BIRCH_LADDER);
  public static final RegistrySupplier<BlockItem> CRIMSON_LADDER = blockItem("crimson_ladder", ReDevBlocks.CRIMSON_LADDER);
  public static final RegistrySupplier<BlockItem> DARK_OAK_LADDER = blockItem("dark_oak_ladder", ReDevBlocks.DARK_OAK_LADDER);
  public static final RegistrySupplier<BlockItem> JUNGLE_LADDER = blockItem("jungle_ladder", ReDevBlocks.JUNGLE_LADDER);
  public static final RegistrySupplier<BlockItem> MANGROVE_LADDER = blockItem("mangrove_ladder", ReDevBlocks.MANGROVE_LADDER);
  public static final RegistrySupplier<BlockItem> SPRUCE_LADDER = blockItem("spruce_ladder", ReDevBlocks.SPRUCE_LADDER);
  public static final RegistrySupplier<BlockItem> WARPED_LADDER = blockItem("warped_ladder", ReDevBlocks.WARPED_LADDER);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_LADDER = blockItem("scrapwood_ladder", ReDevBlocks.SCRAPWOOD_LADDER);
  public static final RegistrySupplier<BlockItem> WHISPUR_LADDER = blockItem("whispur_ladder", ReDevBlocks.WHISPUR_LADDER);
  public static final RegistrySupplier<BlockItem> PETRIFIED_LADDER = blockItem("petrified_ladder", ReDevBlocks.PETRIFIED_LADDER);
  public static final RegistrySupplier<BlockItem> SHADE_LADDER = blockItem("shade_ladder", ReDevBlocks.SHADE_LADDER);
  public static final RegistrySupplier<Item> CHAIN_LADDER = item("chain_ladder",() ->  new HangingLadderItem(ReDevBlocks.CHAIN_LADDER.get(), new Item.Properties().setId(id("chain_ladder")).useBlockDescriptionPrefix()));
  public static final RegistrySupplier<Item> BAMBOO_LADDER = item("bamboo_ladder",() ->  new HangingLadderItem(ReDevBlocks.BAMBOO_LADDER.get(), new Item.Properties().setId(id("bamboo_ladder")).useBlockDescriptionPrefix()));

  public static final RegistrySupplier<BlockItem> ACACIA_SMITHING_TABLE = blockItem("acacia_smithing_table", ReDevBlocks.ACACIA_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> BIRCH_SMITHING_TABLE = blockItem("birch_smithing_table", ReDevBlocks.BIRCH_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> CRIMSON_SMITHING_TABLE = blockItem("crimson_smithing_table", ReDevBlocks.CRIMSON_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> DARK_OAK_SMITHING_TABLE = blockItem("dark_oak_smithing_table", ReDevBlocks.DARK_OAK_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> JUNGLE_SMITHING_TABLE = blockItem("jungle_smithing_table", ReDevBlocks.JUNGLE_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> MANGROVE_SMITHING_TABLE = blockItem("mangrove_smithing_table", ReDevBlocks.MANGROVE_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> SPRUCE_SMITHING_TABLE = blockItem("spruce_smithing_table", ReDevBlocks.SPRUCE_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> WARPED_SMITHING_TABLE = blockItem("warped_smithing_table", ReDevBlocks.WARPED_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_SMITHING_TABLE = blockItem("scrapwood_smithing_table", ReDevBlocks.SCRAPWOOD_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> WHISPUR_SMITHING_TABLE = blockItem("whispur_smithing_table", ReDevBlocks.WHISPUR_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> PETRIFIED_SMITHING_TABLE = blockItem("petrified_smithing_table", ReDevBlocks.PETRIFIED_SMITHING_TABLE);
  public static final RegistrySupplier<BlockItem> SHADE_SMITHING_TABLE = blockItem("shade_smithing_table", ReDevBlocks.SHADE_SMITHING_TABLE);

  public static final RegistrySupplier<BlockItem> ACACIA_CAMPFIRE = blockItem("acacia_campfire", ReDevBlocks.ACACIA_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> ACACIA_SOUL_CAMPFIRE = blockItem("acacia_soul_campfire", ReDevBlocks.ACACIA_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> BIRCH_CAMPFIRE = blockItem("birch_campfire", ReDevBlocks.BIRCH_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> BIRCH_SOUL_CAMPFIRE = blockItem("birch_soul_campfire", ReDevBlocks.BIRCH_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> CRIMSON_CAMPFIRE = blockItem("crimson_campfire", ReDevBlocks.CRIMSON_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> CRIMSON_SOUL_CAMPFIRE = blockItem("crimson_soul_campfire", ReDevBlocks.CRIMSON_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> DARK_OAK_CAMPFIRE = blockItem("dark_oak_campfire", ReDevBlocks.DARK_OAK_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> DARK_OAK_SOUL_CAMPFIRE = blockItem("dark_oak_soul_campfire", ReDevBlocks.DARK_OAK_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> JUNGLE_CAMPFIRE = blockItem("jungle_campfire", ReDevBlocks.JUNGLE_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> JUNGLE_SOUL_CAMPFIRE = blockItem("jungle_soul_campfire", ReDevBlocks.JUNGLE_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> MANGROVE_CAMPFIRE = blockItem("mangrove_campfire", ReDevBlocks.MANGROVE_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> MANGROVE_SOUL_CAMPFIRE = blockItem("mangrove_soul_campfire", ReDevBlocks.MANGROVE_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> SPRUCE_CAMPFIRE = blockItem("spruce_campfire", ReDevBlocks.SPRUCE_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> SPRUCE_SOUL_CAMPFIRE = blockItem("spruce_soul_campfire", ReDevBlocks.SPRUCE_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> WARPED_CAMPFIRE = blockItem("warped_campfire", ReDevBlocks.WARPED_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> WARPED_SOUL_CAMPFIRE = blockItem("warped_soul_campfire", ReDevBlocks.WARPED_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_CAMPFIRE = blockItem("scrapwood_campfire", ReDevBlocks.SCRAPWOOD_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_SOUL_CAMPFIRE = blockItem("scrapwood_soul_campfire", ReDevBlocks.SCRAPWOOD_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> BONE_CAMPFIRE = blockItem("bone_campfire", ReDevBlocks.BONE_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> BONE_SOUL_CAMPFIRE = blockItem("bone_soul_campfire", ReDevBlocks.BONE_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> PETRIFIED_CAMPFIRE = blockItem("petrified_campfire", ReDevBlocks.PETRIFIED_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> PETRIFIED_SOUL_CAMPFIRE = blockItem("petrified_soul_campfire", ReDevBlocks.PETRIFIED_SOUL_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> SHADE_CAMPFIRE = blockItem("shade_campfire", ReDevBlocks.SHADE_CAMPFIRE);
  public static final RegistrySupplier<BlockItem> SHADE_SOUL_CAMPFIRE = blockItem("shade_soul_campfire", ReDevBlocks.SHADE_SOUL_CAMPFIRE);

  public static final RegistrySupplier<BlockItem> ACACIA_RAIL = blockItem("acacia_rail", ReDevBlocks.ACACIA_RAIL);
  public static final RegistrySupplier<BlockItem> BIRCH_RAIL = blockItem("birch_rail", ReDevBlocks.BIRCH_RAIL);
  public static final RegistrySupplier<BlockItem> CRIMSON_RAIL = blockItem("crimson_rail", ReDevBlocks.CRIMSON_RAIL);
  public static final RegistrySupplier<BlockItem> DARK_OAK_RAIL = blockItem("dark_oak_rail", ReDevBlocks.DARK_OAK_RAIL);
  public static final RegistrySupplier<BlockItem> JUNGLE_RAIL = blockItem("jungle_rail", ReDevBlocks.JUNGLE_RAIL);
  public static final RegistrySupplier<BlockItem> MANGROVE_RAIL = blockItem("mangrove_rail", ReDevBlocks.MANGROVE_RAIL);
  public static final RegistrySupplier<BlockItem> SPRUCE_RAIL = blockItem("spruce_rail", ReDevBlocks.SPRUCE_RAIL);
  public static final RegistrySupplier<BlockItem> WARPED_RAIL = blockItem("warped_rail", ReDevBlocks.WARPED_RAIL);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_RAIL = blockItem("scrapwood_rail", ReDevBlocks.SCRAPWOOD_RAIL);
  public static final RegistrySupplier<BlockItem> WHISPUR_RAIL = blockItem("whispur_rail", ReDevBlocks.WHISPUR_RAIL);
  public static final RegistrySupplier<BlockItem> PETRIFIED_RAIL = blockItem("petrified_rail", ReDevBlocks.PETRIFIED_RAIL);
  public static final RegistrySupplier<BlockItem> SHADE_RAIL = blockItem("shade_rail", ReDevBlocks.SHADE_RAIL);

  public static final RegistrySupplier<BlockItem> ACACIA_DETECTOR_RAIL = blockItem("acacia_detector_rail", ReDevBlocks.ACACIA_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> BIRCH_DETECTOR_RAIL = blockItem("birch_detector_rail", ReDevBlocks.BIRCH_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> CRIMSON_DETECTOR_RAIL = blockItem("crimson_detector_rail", ReDevBlocks.CRIMSON_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> DARK_OAK_DETECTOR_RAIL = blockItem("dark_oak_detector_rail", ReDevBlocks.DARK_OAK_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> JUNGLE_DETECTOR_RAIL = blockItem("jungle_detector_rail", ReDevBlocks.JUNGLE_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> MANGROVE_DETECTOR_RAIL = blockItem("mangrove_detector_rail", ReDevBlocks.MANGROVE_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> SPRUCE_DETECTOR_RAIL = blockItem("spruce_detector_rail", ReDevBlocks.SPRUCE_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> WARPED_DETECTOR_RAIL = blockItem("warped_detector_rail", ReDevBlocks.WARPED_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_DETECTOR_RAIL = blockItem("scrapwood_detector_rail", ReDevBlocks.SCRAPWOOD_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> WHISPUR_DETECTOR_RAIL = blockItem("whispur_detector_rail", ReDevBlocks.WHISPUR_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> PETRIFIED_DETECTOR_RAIL = blockItem("petrified_detector_rail", ReDevBlocks.PETRIFIED_DETECTOR_RAIL);
  public static final RegistrySupplier<BlockItem> SHADE_DETECTOR_RAIL = blockItem("shade_detector_rail", ReDevBlocks.SHADE_DETECTOR_RAIL);

  public static final RegistrySupplier<BlockItem> ACACIA_POWERED_RAIL = blockItem("acacia_powered_rail", ReDevBlocks.ACACIA_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> BIRCH_POWERED_RAIL = blockItem("birch_powered_rail", ReDevBlocks.BIRCH_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> CRIMSON_POWERED_RAIL = blockItem("crimson_powered_rail", ReDevBlocks.CRIMSON_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> DARK_OAK_POWERED_RAIL = blockItem("dark_oak_powered_rail", ReDevBlocks.DARK_OAK_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> JUNGLE_POWERED_RAIL = blockItem("jungle_powered_rail", ReDevBlocks.JUNGLE_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> MANGROVE_POWERED_RAIL = blockItem("mangrove_powered_rail", ReDevBlocks.MANGROVE_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> SPRUCE_POWERED_RAIL = blockItem("spruce_powered_rail", ReDevBlocks.SPRUCE_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> WARPED_POWERED_RAIL = blockItem("warped_powered_rail", ReDevBlocks.WARPED_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_POWERED_RAIL = blockItem("scrapwood_powered_rail", ReDevBlocks.SCRAPWOOD_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> WHISPUR_POWERED_RAIL = blockItem("whispur_powered_rail", ReDevBlocks.WHISPUR_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> PETRIFIED_POWERED_RAIL = blockItem("petrified_powered_rail", ReDevBlocks.PETRIFIED_POWERED_RAIL);
  public static final RegistrySupplier<BlockItem> SHADE_POWERED_RAIL = blockItem("shade_powered_rail", ReDevBlocks.SHADE_POWERED_RAIL);

  public static final RegistrySupplier<BlockItem> ACACIA_ACTIVATOR_RAIL = blockItem("acacia_activator_rail", ReDevBlocks.ACACIA_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> BIRCH_ACTIVATOR_RAIL = blockItem("birch_activator_rail", ReDevBlocks.BIRCH_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> CRIMSON_ACTIVATOR_RAIL = blockItem("crimson_activator_rail", ReDevBlocks.CRIMSON_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> DARK_OAK_ACTIVATOR_RAIL = blockItem("dark_oak_activator_rail", ReDevBlocks.DARK_OAK_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> JUNGLE_ACTIVATOR_RAIL = blockItem("jungle_activator_rail", ReDevBlocks.JUNGLE_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> MANGROVE_ACTIVATOR_RAIL = blockItem("mangrove_activator_rail", ReDevBlocks.MANGROVE_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> SPRUCE_ACTIVATOR_RAIL = blockItem("spruce_activator_rail", ReDevBlocks.SPRUCE_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> WARPED_ACTIVATOR_RAIL = blockItem("warped_activator_rail", ReDevBlocks.WARPED_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_ACTIVATOR_RAIL = blockItem("scrapwood_activator_rail", ReDevBlocks.SCRAPWOOD_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> WHISPUR_ACTIVATOR_RAIL = blockItem("whispur_activator_rail", ReDevBlocks.WHISPUR_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> PETRIFIED_ACTIVATOR_RAIL = blockItem("petrified_activator_rail", ReDevBlocks.PETRIFIED_ACTIVATOR_RAIL);
  public static final RegistrySupplier<BlockItem> SHADE_ACTIVATOR_RAIL = blockItem("shade_activator_rail", ReDevBlocks.SHADE_ACTIVATOR_RAIL);

  public static final RegistrySupplier<BlockItem> ACACIA_HEDGE = blockItem("acacia_hedge", ReDevBlocks.ACACIA_HEDGE);
  public static final RegistrySupplier<BlockItem> AZALEA_HEDGE = blockItem("azalea_hedge", ReDevBlocks.AZALEA_HEDGE);
  public static final RegistrySupplier<BlockItem> FLOWERING_AZALEA_HEDGE = blockItem("flowering_azalea_hedge", ReDevBlocks.FLOWERING_AZALEA_HEDGE);
  public static final RegistrySupplier<BlockItem> BIRCH_HEDGE = blockItem("birch_hedge", ReDevBlocks.BIRCH_HEDGE);
  public static final RegistrySupplier<BlockItem> DARK_OAK_HEDGE = blockItem("dark_oak_hedge", ReDevBlocks.DARK_OAK_HEDGE);
  public static final RegistrySupplier<BlockItem> JUNGLE_HEDGE = blockItem("jungle_hedge", ReDevBlocks.JUNGLE_HEDGE);
  public static final RegistrySupplier<BlockItem> MANGROVE_HEDGE = blockItem("mangrove_hedge", ReDevBlocks.MANGROVE_HEDGE);
  public static final RegistrySupplier<BlockItem> OAK_HEDGE = blockItem("oak_hedge", ReDevBlocks.OAK_HEDGE);
  public static final RegistrySupplier<BlockItem> SPRUCE_HEDGE = blockItem("spruce_hedge", ReDevBlocks.SPRUCE_HEDGE);

  public static final RegistrySupplier<BlockItem> ACACIA_HEDGE_WALL = blockItem("acacia_hedge_wall", ReDevBlocks.ACACIA_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> AZALEA_HEDGE_WALL = blockItem("azalea_hedge_wall", ReDevBlocks.AZALEA_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> FLOWERING_AZALEA_HEDGE_WALL = blockItem("flowering_azalea_hedge_wall", ReDevBlocks.FLOWERING_AZALEA_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> BIRCH_HEDGE_WALL = blockItem("birch_hedge_wall", ReDevBlocks.BIRCH_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> DARK_OAK_HEDGE_WALL = blockItem("dark_oak_hedge_wall", ReDevBlocks.DARK_OAK_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> JUNGLE_HEDGE_WALL = blockItem("jungle_hedge_wall", ReDevBlocks.JUNGLE_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> MANGROVE_HEDGE_WALL = blockItem("mangrove_hedge_wall", ReDevBlocks.MANGROVE_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> OAK_HEDGE_WALL = blockItem("oak_hedge_wall", ReDevBlocks.OAK_HEDGE_WALL);
  public static final RegistrySupplier<BlockItem> SPRUCE_HEDGE_WALL = blockItem("spruce_hedge_wall", ReDevBlocks.SPRUCE_HEDGE_WALL);

  public static final RegistrySupplier<BlockItem> BLACKSTONE_FURNACE = blockItem("blackstone_furnace", ReDevBlocks.BLACKSTONE_FURNACE);
  public static final RegistrySupplier<BlockItem> DEEPSLATE_FURNACE = blockItem("deepslate_furnace", ReDevBlocks.DEEPSLATE_FURNACE);
  public static final RegistrySupplier<BlockItem> ANDESITE_FURNACE = blockItem("andesite_furnace", ReDevBlocks.ANDESITE_FURNACE);
  public static final RegistrySupplier<BlockItem> DIORITE_FURNACE = blockItem("diorite_furnace", ReDevBlocks.DIORITE_FURNACE);
  public static final RegistrySupplier<BlockItem> GRANITE_FURNACE = blockItem("granite_furnace", ReDevBlocks.GRANITE_FURNACE);

  public static final RegistrySupplier<BlockItem> BLACKSTONE_DISPENSER = blockItem("blackstone_dispenser", ReDevBlocks.BLACKSTONE_DISPENSER);
  public static final RegistrySupplier<BlockItem> DEEPSLATE_DISPENSER = blockItem("deepslate_dispenser", ReDevBlocks.DEEPSLATE_DISPENSER);
  public static final RegistrySupplier<BlockItem> ANDESITE_DISPENSER = blockItem("andesite_dispenser", ReDevBlocks.ANDESITE_DISPENSER);
  public static final RegistrySupplier<BlockItem> DIORITE_DISPENSER = blockItem("diorite_dispenser", ReDevBlocks.DIORITE_DISPENSER);
  public static final RegistrySupplier<BlockItem> GRANITE_DISPENSER = blockItem("granite_dispenser", ReDevBlocks.GRANITE_DISPENSER);

  public static final RegistrySupplier<BlockItem> BLACKSTONE_DROPPER = blockItem("blackstone_dropper", ReDevBlocks.BLACKSTONE_DROPPER);
  public static final RegistrySupplier<BlockItem> DEEPSLATE_DROPPER = blockItem("deepslate_dropper", ReDevBlocks.DEEPSLATE_DROPPER);
  public static final RegistrySupplier<BlockItem> ANDESITE_DROPPER = blockItem("andesite_dropper", ReDevBlocks.ANDESITE_DROPPER);
  public static final RegistrySupplier<BlockItem> DIORITE_DROPPER = blockItem("diorite_dropper", ReDevBlocks.DIORITE_DROPPER);
  public static final RegistrySupplier<BlockItem> GRANITE_DROPPER = blockItem("granite_dropper", ReDevBlocks.GRANITE_DROPPER);

  public static final RegistrySupplier<BlockItem> AURUM_BLOCK = blockItem("aurum_block", ReDevBlocks.AURUM_BLOCK);
  public static final RegistrySupplier<BlockItem> AURUM_ORE = blockItem("aurum_ore", ReDevBlocks.AURUM_ORE);
  public static final RegistrySupplier<BlockItem> NETHER_DIAMOND_ORE = blockItem("nether_diamond_ore", ReDevBlocks.NETHER_DIAMOND_ORE);
  public static final RegistrySupplier<BlockItem> BASALT_DIAMOND_ORE = blockItem("basalt_diamond_ore", ReDevBlocks.BASALT_DIAMOND_ORE);

  public static final RegistrySupplier<BlockItem> WITHERED_BLOCK = blockItem("withered_block", ReDevBlocks.WITHERED_BLOCK);

  public static final RegistrySupplier<BlockItem> NETHER_BRISTLE = blockItem("nether_bristle", ReDevBlocks.NETHER_BRISTLE);
  public static final RegistrySupplier<BlockItem> WHISPUR_ROOT = blockItem("whispur_root", ReDevBlocks.WHISPUR_ROOT);

  public static final RegistrySupplier<BlockItem> SCRAPWOOD_PLANKS = blockItem("scrapwood_planks", ReDevBlocks.SCRAPWOOD_PLANKS);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_HEAP = blockItem("scrapwood_heap", ReDevBlocks.SCRAPWOOD_HEAP);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_SLAB = blockItem("scrapwood_slab", ReDevBlocks.SCRAPWOOD_SLAB);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_STAIRS = blockItem("scrapwood_stairs", ReDevBlocks.SCRAPWOOD_STAIRS);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_FENCE = blockItem("scrapwood_fence", ReDevBlocks.SCRAPWOOD_FENCE);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_FENCE_GATE = blockItem("scrapwood_fence_gate", ReDevBlocks.SCRAPWOOD_FENCE_GATE);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_BUTTON = blockItem("scrapwood_button", ReDevBlocks.SCRAPWOOD_BUTTON);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_PRESSURE_PLATE = blockItem("scrapwood_pressure_plate", ReDevBlocks.SCRAPWOOD_PRESSURE_PLATE);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_DOOR = blockItem("scrapwood_door", ReDevBlocks.SCRAPWOOD_DOOR);
  public static final RegistrySupplier<BlockItem> SCRAPWOOD_TRAPDOOR = blockItem("scrapwood_trapdoor", ReDevBlocks.SCRAPWOOD_TRAPDOOR);
  public static final RegistrySupplier<Item> SCRAPWOOD_SIGN = item("scrapwood_sign",() ->  new SignItem(ReDevBlocks.SCRAPWOOD_SIGN.get(), ReDevBlocks.SCRAPWOOD_WALL_SIGN.get(), new Item.Properties().setId(id("scrapwood_sign")).stacksTo(16)));

  public static final RegistrySupplier<BlockItem> WHISPUR_PLANKS = blockItem("whispur_planks", ReDevBlocks.WHISPUR_PLANKS);
  public static final RegistrySupplier<BlockItem> WHISPUR_SLAB = blockItem("whispur_slab", ReDevBlocks.WHISPUR_SLAB);
  public static final RegistrySupplier<BlockItem> WHISPUR_STAIRS = blockItem("whispur_stairs", ReDevBlocks.WHISPUR_STAIRS);
  public static final RegistrySupplier<BlockItem> WHISPUR_FENCE = blockItem("whispur_fence", ReDevBlocks.WHISPUR_FENCE);
  public static final RegistrySupplier<BlockItem> WHISPUR_FENCE_GATE = blockItem("whispur_fence_gate", ReDevBlocks.WHISPUR_FENCE_GATE);
  public static final RegistrySupplier<BlockItem> WHISPUR_BUTTON = blockItem("whispur_button", ReDevBlocks.WHISPUR_BUTTON);
  public static final RegistrySupplier<BlockItem> WHISPUR_PRESSURE_PLATE = blockItem("whispur_pressure_plate", ReDevBlocks.WHISPUR_PRESSURE_PLATE);
  public static final RegistrySupplier<BlockItem> WHISPUR_DOOR = blockItem("whispur_door", ReDevBlocks.WHISPUR_DOOR);
  public static final RegistrySupplier<BlockItem> WHISPUR_TRAPDOOR = blockItem("whispur_trapdoor", ReDevBlocks.WHISPUR_TRAPDOOR);
  public static final RegistrySupplier<Item> WHISPUR_SIGN = item("whispur_sign",() ->  new SignItem(ReDevBlocks.WHISPUR_SIGN.get(), ReDevBlocks.WHISPUR_WALL_SIGN.get(), new Item.Properties().setId(id("whispur_sign")).stacksTo(16)));

  public static final RegistrySupplier<BlockItem> PETRIFIED_LOG = blockItem("petrified_log", ReDevBlocks.PETRIFIED_LOG);
  public static final RegistrySupplier<BlockItem> STRIPPED_PETRIFIED_LOG = blockItem("stripped_petrified_log", ReDevBlocks.STRIPPED_PETRIFIED_LOG);
  public static final RegistrySupplier<BlockItem> PETRIFIED_WOOD = blockItem("petrified_wood", ReDevBlocks.PETRIFIED_WOOD);
  public static final RegistrySupplier<BlockItem> STRIPPED_PETRIFIED_WOOD = blockItem("stripped_petrified_wood", ReDevBlocks.STRIPPED_PETRIFIED_WOOD);
  public static final RegistrySupplier<BlockItem> PETRIFIED_PLANKS = blockItem("petrified_planks", ReDevBlocks.PETRIFIED_PLANKS);
  public static final RegistrySupplier<BlockItem> PETRIFIED_SLAB = blockItem("petrified_slab", ReDevBlocks.PETRIFIED_SLAB);
  public static final RegistrySupplier<BlockItem> PETRIFIED_STAIRS = blockItem("petrified_stairs", ReDevBlocks.PETRIFIED_STAIRS);
  public static final RegistrySupplier<BlockItem> PETRIFIED_FENCE = blockItem("petrified_fence", ReDevBlocks.PETRIFIED_FENCE);
  public static final RegistrySupplier<BlockItem> PETRIFIED_FENCE_GATE = blockItem("petrified_fence_gate", ReDevBlocks.PETRIFIED_FENCE_GATE);
  public static final RegistrySupplier<BlockItem> PETRIFIED_BUTTON = blockItem("petrified_button", ReDevBlocks.PETRIFIED_BUTTON);
  public static final RegistrySupplier<BlockItem> PETRIFIED_PRESSURE_PLATE = blockItem("petrified_pressure_plate", ReDevBlocks.PETRIFIED_PRESSURE_PLATE);
  public static final RegistrySupplier<BlockItem> PETRIFIED_DOOR = blockItem("petrified_door", ReDevBlocks.PETRIFIED_DOOR);
  public static final RegistrySupplier<BlockItem> PETRIFIED_TRAPDOOR = blockItem("petrified_trapdoor", ReDevBlocks.PETRIFIED_TRAPDOOR);
  public static final RegistrySupplier<Item> PETRIFIED_SIGN = item("petrified_sign",() ->  new SignItem(ReDevBlocks.PETRIFIED_SIGN.get(), ReDevBlocks.PETRIFIED_WALL_SIGN.get(), new Item.Properties().setId(id("petrified_sign")).stacksTo(16)));

  public static final RegistrySupplier<BlockItem> SHADE_LOG = blockItem("shade_log", ReDevBlocks.SHADE_LOG);
  public static final RegistrySupplier<BlockItem> STRIPPED_SHADE_LOG = blockItem("stripped_shade_log", ReDevBlocks.STRIPPED_SHADE_LOG);
  public static final RegistrySupplier<BlockItem> SHADE_WOOD = blockItem("shade_wood", ReDevBlocks.SHADE_WOOD);
  public static final RegistrySupplier<BlockItem> STRIPPED_SHADE_WOOD = blockItem("stripped_shade_wood", ReDevBlocks.STRIPPED_SHADE_WOOD);
  public static final RegistrySupplier<BlockItem> SHADE_PLANKS = blockItem("shade_planks", ReDevBlocks.SHADE_PLANKS);
  public static final RegistrySupplier<BlockItem> SHADE_SLAB = blockItem("shade_slab", ReDevBlocks.SHADE_SLAB);
  public static final RegistrySupplier<BlockItem> SHADE_STAIRS = blockItem("shade_stairs", ReDevBlocks.SHADE_STAIRS);
  public static final RegistrySupplier<BlockItem> SHADE_FENCE = blockItem("shade_fence", ReDevBlocks.SHADE_FENCE);
  public static final RegistrySupplier<BlockItem> SHADE_FENCE_GATE = blockItem("shade_fence_gate", ReDevBlocks.SHADE_FENCE_GATE);
  public static final RegistrySupplier<BlockItem> SHADE_BUTTON = blockItem("shade_button", ReDevBlocks.SHADE_BUTTON);
  public static final RegistrySupplier<BlockItem> SHADE_PRESSURE_PLATE = blockItem("shade_pressure_plate", ReDevBlocks.SHADE_PRESSURE_PLATE);
  public static final RegistrySupplier<BlockItem> SHADE_DOOR = blockItem("shade_door", ReDevBlocks.SHADE_DOOR);
  public static final RegistrySupplier<BlockItem> SHADE_TRAPDOOR = blockItem("shade_trapdoor", ReDevBlocks.SHADE_TRAPDOOR);
  public static final RegistrySupplier<Item> SHADE_SIGN = item("shade_sign",() ->  new SignItem(ReDevBlocks.SHADE_SIGN.get(), ReDevBlocks.SHADE_WALL_SIGN.get(), new Item.Properties().setId(id("shade_sign")).stacksTo(16)));

  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN = blockItem("carved_pumpkin", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 0, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_CREEPY = blockItem("carved_pumpkin_creepy", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 1, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_HORRIFIED = blockItem("carved_pumpkin_horrified", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 2, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_CREEPER = blockItem("carved_pumpkin_creeper", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 3, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_SCOWLING = blockItem("carved_pumpkin_scowling", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 4, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_TWISTED = blockItem("carved_pumpkin_twisted", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 5, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_FURIOUS = blockItem("carved_pumpkin_furious", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 6, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_ZOMBIE = blockItem("carved_pumpkin_zombie", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 7, false));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_LIT = blockItem("carved_pumpkin_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 1, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_CREEPY_LIT = blockItem("carved_pumpkin_creepy_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 1, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_HORRIFIED_LIT = blockItem("carved_pumpkin_horrified_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 2, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_CREEPER_LIT = blockItem("carved_pumpkin_creeper_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 3, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_SCOWLING_LIT = blockItem("carved_pumpkin_scowling_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 4, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_TWISTED_LIT = blockItem("carved_pumpkin_twisted_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 5, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_FURIOUS_LIT = blockItem("carved_pumpkin_furious_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 6, true),() ->  new Item.Properties().setId(id(name)));
  //public static final RegistrySupplier<BlockItem> CARVED_PUMPKIN_ZOMBIE_LIT = blockItem("carved_pumpkin_zombie_lit", ReDevBlocks.CARVED_PUMPKIN, (block, props) -> new CarvedPumpkinItem(block, props, 7, true),() ->  new Item.Properties().setId(id(name)));

  public static final RegistrySupplier<BlockItem> SHADE_LEAVES = blockItem("shade_leaves", ReDevBlocks.SHADE_LEAVES);
  public static final RegistrySupplier<BlockItem> TEAL_SHADE_LEAVES = blockItem("teal_shade_leaves", ReDevBlocks.TEAL_SHADE_LEAVES);
  public static final RegistrySupplier<BlockItem> RED_SHADE_LEAVES = blockItem("red_shade_leaves", ReDevBlocks.RED_SHADE_LEAVES);
  public static final RegistrySupplier<BlockItem> PURPLE_SHADE_LEAVES = blockItem("purple_shade_leaves", ReDevBlocks.PURPLE_SHADE_LEAVES);

  public static final RegistrySupplier<BlockItem> SHADE_SAPLING = blockItem("shade_sapling", ReDevBlocks.SHADE_SAPLING);
  public static final RegistrySupplier<BlockItem> TEAL_SHADE_SAPLING = blockItem("teal_shade_sapling", ReDevBlocks.TEAL_SHADE_SAPLING);
  public static final RegistrySupplier<BlockItem> RED_SHADE_SAPLING = blockItem("red_shade_sapling", ReDevBlocks.RED_SHADE_SAPLING);
  public static final RegistrySupplier<BlockItem> PURPLE_SHADE_SAPLING = blockItem("purple_shade_sapling", ReDevBlocks.PURPLE_SHADE_SAPLING);

  public static final RegistrySupplier<BlockItem> DURIAN = blockItem("durian", ReDevBlocks.DURIAN);

  public static final RegistrySupplier<BlockItem> HADALITE = blockItem("hadalite", ReDevBlocks.HADALITE);

  public static final RegistrySupplier<BlockItem> PATINA_GOLD_BLOCK = blockItem("patina_gold_block", ReDevBlocks.PATINA_GOLD_BLOCK);
  public static final RegistrySupplier<BlockItem> PATINA_AURUM_BLOCK = blockItem("patina_aurum_block", ReDevBlocks.PATINA_AURUM_BLOCK);

  public static final RegistrySupplier<BlockItem> BASALT_SLAB = blockItem("basalt_slab", ReDevBlocks.BASALT_SLAB);
  public static final RegistrySupplier<BlockItem> SMOOTH_BASALT_SLAB = blockItem("smooth_basalt_slab", ReDevBlocks.SMOOTH_BASALT_SLAB);
  public static final RegistrySupplier<BlockItem> POLISHED_BASALT_SLAB = blockItem("polished_basalt_slab", ReDevBlocks.POLISHED_BASALT_SLAB);

  public static final RegistrySupplier<BlockItem> BASALT_STAIRS = blockItem("basalt_stairs", ReDevBlocks.BASALT_STAIRS);
  public static final RegistrySupplier<BlockItem> SMOOTH_BASALT_STAIRS = blockItem("smooth_basalt_stairs", ReDevBlocks.SMOOTH_BASALT_STAIRS);
  public static final RegistrySupplier<BlockItem> POLISHED_BASALT_STAIRS = blockItem("polished_basalt_stairs", ReDevBlocks.POLISHED_BASALT_STAIRS);

  public static final RegistrySupplier<BlockItem> BASALT_WALL = blockItem("basalt_wall", ReDevBlocks.BASALT_WALL);
  public static final RegistrySupplier<BlockItem> SMOOTH_BASALT_WALL = blockItem("smooth_basalt_wall", ReDevBlocks.SMOOTH_BASALT_WALL);
  public static final RegistrySupplier<BlockItem> POLISHED_BASALT_WALL = blockItem("polished_basalt_wall", ReDevBlocks.POLISHED_BASALT_WALL);




  private static RegistrySupplier<ReDevItem> noSettingsItem(String name) {
    return ITEMS.register(name, () -> new ReDevItem(new Item.Properties().setId(id(name))));
  }

  private static RegistrySupplier<ReDevItem> settingsItem(String name, Item.Properties settings) {
    return ITEMS.register(name, () -> new ReDevItem(settings.setId(id(name))));
  }

  private static RegistrySupplier<Item> item(String name, Supplier<Item> item) {
    return ITEMS.register(name, item);
  }

  private static RegistrySupplier<ArmorItem> armorItem(String name, Supplier<ArmorItem> item) {
    return ITEMS.register(name, item);
  }

  private static RegistrySupplier<BlockItem> blockItem(String name, RegistrySupplier<? extends Block> block) {
    return ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties().setId(id(name)).setId(id(name))));
  }

  private static ResourceKey<Item> id(String name) {
    return ResourceKey.create(Registries.ITEM, redevResource(name));
  }

}
