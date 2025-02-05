package net.roadkill.redev;

import static net.roadkill.redev.util.ReDevUtil.redevResource;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import java.util.Optional;
import java.util.function.Supplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DetectorRailBlock;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.DropperBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PoweredRailBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SmithingTableBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.roadkill.redev.block.CaramineRyeBlock;
import net.roadkill.redev.block.HangingLadderBlock;
import net.roadkill.redev.block.HedgeBlock;
import net.roadkill.redev.block.LeafyWallBlock;
import net.roadkill.redev.block.ModCampfireBlock;
import net.roadkill.redev.block.ModCarvedPumpkinBlock;
import net.roadkill.redev.block.ModTwistingVinesPlantBlock;
import net.roadkill.redev.block.ModWarpedRootsBlock;
import net.roadkill.redev.block.NetherBristleBlock;
import net.roadkill.redev.block.ShadeSaplingBlock;
import net.roadkill.redev.block.StrippableLogBlock;
import net.roadkill.redev.block.WhispurRootBlock;
import net.roadkill.redev.world.ShadeTree;

public class ReDevBlocks {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ReDev.MOD_ID, Registries.BLOCK);

    private static final Supplier<Properties> SCRAPWOOD_PROPERTIES = () -> BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD).instrument(
        NoteBlockInstrument.BASS).mapColor(MapColor.CRIMSON_HYPHAE);
    private static final Supplier<BlockBehaviour.Properties> WHISPUR_PROPERTIES = () -> BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD).instrument(NoteBlockInstrument.BASS).mapColor(MapColor.SAND);
    private static final Supplier<BlockBehaviour.Properties> PETRIFIED_PROPERTIES = () -> BlockBehaviour.Properties.of().strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_PLANKS).instrument(NoteBlockInstrument.BASS).mapColor(MapColor.TERRACOTTA_PURPLE);
    private static final Supplier<BlockBehaviour.Properties> SHADE_PROPERTIES = () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.TERRACOTTA_ORANGE);


    public static final RegistrySupplier<Block> SCRAPWOOD_PLANKS = block("scrapwood_planks",SCRAPWOOD_PROPERTIES.get());
    public static final RegistrySupplier<Block> WHISPUR_PLANKS = block("whispur_planks",WHISPUR_PROPERTIES.get());
    public static final RegistrySupplier<Block> PETRIFIED_PLANKS = block("petrified_planks",PETRIFIED_PROPERTIES.get());
    public static final RegistrySupplier<Block> SHADE_PLANKS = block("shade_planks",SHADE_PROPERTIES.get());

    public static final RegistrySupplier<RotatedPillarBlock> STRIPPED_PETRIFIED_LOG = rotatedPillarBlock("stripped_petrified_log", Block.Properties.of().strength(2.0F).sound(ReDevSounds.PETRIFIED_LOG).mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final RegistrySupplier<RotatedPillarBlock> STRIPPED_SHADE_LOG = rotatedPillarBlock("stripped_shade_log", Block.Properties.of().strength(2.0F).sound(SoundType.WOOD).mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final RegistrySupplier<RotatedPillarBlock> STRIPPED_PETRIFIED_WOOD = rotatedPillarBlock("stripped_petrified_wood", Block.Properties.of().strength(2.0F).sound(ReDevSounds.PETRIFIED_LOG).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final RegistrySupplier<RotatedPillarBlock> STRIPPED_SHADE_WOOD = rotatedPillarBlock("stripped_shade_wood", Block.Properties.of().strength(2.0F).sound(SoundType.WOOD).mapColor(MapColor.TERRACOTTA_ORANGE));
    public static final RegistrySupplier<RotatedPillarBlock> SCRAPWOOD_HEAP = rotatedPillarBlock("scrapwood_heap", Block.Properties.ofFullCopy(Blocks.CRIMSON_STEM).strength(2.0F, 3.0F).sound(SoundType.NETHER_WOOD));

    public static final RegistrySupplier<StrippableLogBlock> PETRIFIED_LOG = strippableLogBlock("petrified_log", Block.Properties.ofFullCopy(Blocks.OAK_LOG).strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_LOG), STRIPPED_PETRIFIED_LOG);
    public static final RegistrySupplier<StrippableLogBlock> SHADE_LOG = strippableLogBlock("shade_log", Block.Properties.of().strength(2.0F).sound(SoundType.WOOD).mapColor(MapColor.TERRACOTTA_BROWN), STRIPPED_SHADE_LOG);
    public static final RegistrySupplier<StrippableLogBlock> PETRIFIED_WOOD = strippableLogBlock("petrified_wood", Block.Properties.ofFullCopy(Blocks.OAK_WOOD).setId(id("petrified_wood")).strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_LOG).mapColor(MapColor.TERRACOTTA_PURPLE), STRIPPED_PETRIFIED_WOOD);
    public static final RegistrySupplier<StrippableLogBlock> SHADE_WOOD = strippableLogBlock("shade_wood", Block.Properties.of().strength(2.0F).sound(SoundType.WOOD).mapColor(MapColor.TERRACOTTA_ORANGE), STRIPPED_SHADE_WOOD);

    public static final RegistrySupplier<SlabBlock> SCRAPWOOD_SLAB = slabBlock("scrapwood_slab", SCRAPWOOD_PROPERTIES.get());
    public static final RegistrySupplier<SlabBlock> WHISPUR_SLAB = slabBlock("whispur_slab", WHISPUR_PROPERTIES.get());
    public static final RegistrySupplier<SlabBlock> PETRIFIED_SLAB = slabBlock("petrified_slab", PETRIFIED_PROPERTIES.get());
    public static final RegistrySupplier<SlabBlock> SHADE_SLAB = slabBlock("shade_slab", SHADE_PROPERTIES.get());

    public static final RegistrySupplier<StairBlock> SCRAPWOOD_STAIRS = stairBlock("scrapwood_stairs", SCRAPWOOD_PLANKS, SCRAPWOOD_PROPERTIES);
    public static final RegistrySupplier<StairBlock> WHISPUR_STAIRS = stairBlock("whispur_stairs", WHISPUR_PLANKS, WHISPUR_PROPERTIES);
    public static final RegistrySupplier<StairBlock> PETRIFIED_STAIRS = stairBlock("petrified_stairs", PETRIFIED_PLANKS, PETRIFIED_PROPERTIES);
    public static final RegistrySupplier<StairBlock> SHADE_STAIRS = stairBlock("shade_stairs", SHADE_PLANKS, SHADE_PROPERTIES);

    public static final RegistrySupplier<FenceBlock> SCRAPWOOD_FENCE = fenceBlock("scrapwood_fence", SCRAPWOOD_PROPERTIES.get().forceSolidOn());
    public static final RegistrySupplier<FenceBlock> WHISPUR_FENCE = fenceBlock("whispur_fence", WHISPUR_PROPERTIES.get().forceSolidOn());
    public static final RegistrySupplier<FenceBlock> PETRIFIED_FENCE = fenceBlock("petrified_fence", PETRIFIED_PROPERTIES.get().forceSolidOn());
    public static final RegistrySupplier<FenceBlock> SHADE_FENCE = fenceBlock("shade_fence", SHADE_PROPERTIES.get().forceSolidOn());

    public static final RegistrySupplier<FenceGateBlock> SCRAPWOOD_FENCE_GATE = fenceGateBlock("scrapwood_fence_gate", WoodType.CRIMSON, SCRAPWOOD_PROPERTIES);
    public static final RegistrySupplier<FenceGateBlock> WHISPUR_FENCE_GATE = fenceGateBlock("whispur_fence_gate", WoodType.WARPED, WHISPUR_PROPERTIES);
    public static final RegistrySupplier<FenceGateBlock> PETRIFIED_FENCE_GATE = fenceGateBlock("petrified_fence_gate", WoodType.OAK, PETRIFIED_PROPERTIES);
    public static final RegistrySupplier<FenceGateBlock> SHADE_FENCE_GATE = fenceGateBlock("shade_fence_gate", WoodType.OAK, SHADE_PROPERTIES);

    public static final RegistrySupplier<DoorBlock> SCRAPWOOD_DOOR = doorBlock("scrapwood_door", ReDevBlockSets.SCRAPWOOD, SCRAPWOOD_PROPERTIES.get());
    public static final RegistrySupplier<DoorBlock> WHISPUR_DOOR = doorBlock("whispur_door", ReDevBlockSets.WHISPUR,  WHISPUR_PROPERTIES.get());
    public static final RegistrySupplier<DoorBlock> PETRIFIED_DOOR = doorBlock("petrified_door", ReDevBlockSets.PETRIFIED, PETRIFIED_PROPERTIES.get());
    public static final RegistrySupplier<DoorBlock> SHADE_DOOR = doorBlock("shade_door", ReDevBlockSets.SHADE, SHADE_PROPERTIES.get());

    public static final RegistrySupplier<TrapDoorBlock> SCRAPWOOD_TRAPDOOR = trapdoorBlock("scrapwood_trapdoor", ReDevBlockSets.SCRAPWOOD, SCRAPWOOD_PROPERTIES.get().noOcclusion());
    public static final RegistrySupplier<TrapDoorBlock> WHISPUR_TRAPDOOR = trapdoorBlock("whispur_trapdoor", ReDevBlockSets.WHISPUR,  WHISPUR_PROPERTIES.get().noOcclusion());
    public static final RegistrySupplier<TrapDoorBlock> PETRIFIED_TRAPDOOR = trapdoorBlock("petrified_trapdoor", ReDevBlockSets.PETRIFIED,  PETRIFIED_PROPERTIES.get().noOcclusion());
    public static final RegistrySupplier<TrapDoorBlock> SHADE_TRAPDOOR = trapdoorBlock("shade_trapdoor", ReDevBlockSets.SHADE, SHADE_PROPERTIES.get().noOcclusion());

    public static final RegistrySupplier<ButtonBlock> SCRAPWOOD_BUTTON = buttonBlock("scrapwood_button", ReDevBlockSets.SCRAPWOOD, 30, SCRAPWOOD_PROPERTIES.get().strength(0.5f).noCollission());
    public static final RegistrySupplier<ButtonBlock> WHISPUR_BUTTON = buttonBlock("whispur_button", ReDevBlockSets.WHISPUR, 30, WHISPUR_PROPERTIES.get().strength(0.5f).noCollission());
    public static final RegistrySupplier<ButtonBlock> PETRIFIED_BUTTON = buttonBlock("petrified_button", ReDevBlockSets.PETRIFIED, 30, PETRIFIED_PROPERTIES.get().strength(0.5f).noCollission());
    public static final RegistrySupplier<ButtonBlock> SHADE_BUTTON = buttonBlock("shade_button", ReDevBlockSets.SHADE, 30, SHADE_PROPERTIES.get().strength(0.5f).noCollission());

    public static final RegistrySupplier<PressurePlateBlock> SCRAPWOOD_PRESSURE_PLATE = pressurePlateBlock("scrapwood_pressure_plate", ReDevBlockSets.SCRAPWOOD, SCRAPWOOD_PROPERTIES.get().destroyTime(1.2f).noCollission());
    public static final RegistrySupplier<PressurePlateBlock> WHISPUR_PRESSURE_PLATE = pressurePlateBlock("whispur_pressure_plate", ReDevBlockSets.WHISPUR, WHISPUR_PROPERTIES.get().destroyTime(1.2f).noCollission());
    public static final RegistrySupplier<PressurePlateBlock> PETRIFIED_PRESSURE_PLATE = pressurePlateBlock("petrified_pressure_plate", ReDevBlockSets.PETRIFIED, PETRIFIED_PROPERTIES.get().destroyTime(1.2f).noCollission());
    public static final RegistrySupplier<PressurePlateBlock> SHADE_PRESSURE_PLATE = pressurePlateBlock("shade_pressure_plate", ReDevBlockSets.SHADE, SHADE_PROPERTIES.get().destroyTime(1.2f).noCollission());

    public static final RegistrySupplier<StandingSignBlock> SCRAPWOOD_SIGN = standingSignBlock("scrapwood_sign", ReDevWoodTypes.SCRAPWOOD, SCRAPWOOD_PROPERTIES.get());
    public static final RegistrySupplier<StandingSignBlock> WHISPUR_SIGN = standingSignBlock("whispur_sign", ReDevWoodTypes.WHISPUR, WHISPUR_PROPERTIES.get());
    public static final RegistrySupplier<StandingSignBlock> PETRIFIED_SIGN = standingSignBlock("petrified_sign", ReDevWoodTypes.PETRIFIED, Block.Properties.ofFullCopy(Blocks.OAK_SIGN).strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_PLANKS).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final RegistrySupplier<StandingSignBlock> SHADE_SIGN = standingSignBlock("shade_sign", ReDevWoodTypes.SHADE, Block.Properties.of().setId(id("")).strength(2.0F).sound(SoundType.WOOD));

    public static final RegistrySupplier<WallSignBlock> SCRAPWOOD_WALL_SIGN = wallSignBlock("scrapwood_wall_sign", ReDevWoodTypes.SCRAPWOOD, SCRAPWOOD_PROPERTIES.get());
    public static final RegistrySupplier<WallSignBlock> WHISPUR_WALL_SIGN = wallSignBlock("whispur_wall_sign", ReDevWoodTypes.WHISPUR, WHISPUR_PROPERTIES.get());
    public static final RegistrySupplier<WallSignBlock> PETRIFIED_WALL_SIGN = wallSignBlock("petrified_wall_sign", ReDevWoodTypes.PETRIFIED, Block.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_PLANKS).mapColor(MapColor.TERRACOTTA_PURPLE));
    public static final RegistrySupplier<WallSignBlock> SHADE_WALL_SIGN = wallSignBlock("shade_wall_sign", ReDevWoodTypes.SHADE, Block.Properties.of().strength(2.0F).sound(SoundType.WOOD).mapColor(MapColor.TERRACOTTA_ORANGE));

    public static final RegistrySupplier<Block> ACACIA_BOOKSHELF = block("acacia_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> BIRCH_BOOKSHELF = block("birch_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> CRIMSON_BOOKSHELF = block("crimson_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> DARK_OAK_BOOKSHELF = block("dark_oak_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> JUNGLE_BOOKSHELF = block("jungle_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> MANGROVE_BOOKSHELF = block("mangrove_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> SPRUCE_BOOKSHELF = block("spruce_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> WARPED_BOOKSHELF = block("warped_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> SCRAPWOOD_BOOKSHELF = block("scrapwood_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> WHISPUR_BOOKSHELF = block("whispur_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<Block> PETRIFIED_BOOKSHELF = block("petrified_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF).strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_PLANKS));
    public static final RegistrySupplier<Block> SHADE_BOOKSHELF = block("shade_bookshelf", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));

    public static final RegistrySupplier<LadderBlock> ACACIA_LADDER = ladderBlock("acacia_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> BIRCH_LADDER = ladderBlock("birch_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> CRIMSON_LADDER = ladderBlock("crimson_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> DARK_OAK_LADDER = ladderBlock("dark_oak_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> JUNGLE_LADDER = ladderBlock("jungle_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> MANGROVE_LADDER = ladderBlock("mangrove_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> SPRUCE_LADDER = ladderBlock("spruce_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> WARPED_LADDER = ladderBlock("warped_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> SCRAPWOOD_LADDER = ladderBlock("scrapwood_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> WHISPUR_LADDER = ladderBlock("whispur_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));
    public static final RegistrySupplier<LadderBlock> PETRIFIED_LADDER = ladderBlock("petrified_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF).strength(3.0F, 8.0F).sound(ReDevSounds.PETRIFIED_PLANKS));
    public static final RegistrySupplier<LadderBlock> SHADE_LADDER = ladderBlock("shade_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF));

    public static final RegistrySupplier<HangingLadderBlock> CHAIN_LADDER = hangingLadderBlock("chain_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF).strength(3F, 8F).sound(SoundType.CHAIN));
    public static final RegistrySupplier<HangingLadderBlock> BAMBOO_LADDER = hangingLadderBlock("bamboo_ladder", Block.Properties.ofFullCopy(Blocks.BOOKSHELF).sound(SoundType.BAMBOO_WOOD));

    public static final RegistrySupplier<SmithingTableBlock> ACACIA_SMITHING_TABLE = smithingTableBlock("acacia_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> BIRCH_SMITHING_TABLE = smithingTableBlock("birch_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> CRIMSON_SMITHING_TABLE = smithingTableBlock("crimson_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> DARK_OAK_SMITHING_TABLE = smithingTableBlock("dark_oak_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> JUNGLE_SMITHING_TABLE = smithingTableBlock("jungle_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> MANGROVE_SMITHING_TABLE = smithingTableBlock("mangrove_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> SPRUCE_SMITHING_TABLE = smithingTableBlock("spruce_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> WARPED_SMITHING_TABLE = smithingTableBlock("warped_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> SCRAPWOOD_SMITHING_TABLE = smithingTableBlock("scrapwood_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> WHISPUR_SMITHING_TABLE = smithingTableBlock("whispur_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> PETRIFIED_SMITHING_TABLE = smithingTableBlock("petrified_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));
    public static final RegistrySupplier<SmithingTableBlock> SHADE_SMITHING_TABLE = smithingTableBlock("shade_smithing_table", Block.Properties.ofFullCopy(Blocks.SMITHING_TABLE));

    public static final RegistrySupplier<ModCampfireBlock> ACACIA_CAMPFIRE = campfireBlock("acacia_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> ACACIA_SOUL_CAMPFIRE = campfireBlock("acacia_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> BIRCH_CAMPFIRE = campfireBlock("birch_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> BIRCH_SOUL_CAMPFIRE = campfireBlock("birch_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> CRIMSON_CAMPFIRE = campfireBlock("crimson_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> CRIMSON_SOUL_CAMPFIRE = campfireBlock("crimson_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> DARK_OAK_CAMPFIRE = campfireBlock("dark_oak_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> DARK_OAK_SOUL_CAMPFIRE = campfireBlock("dark_oak_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> JUNGLE_CAMPFIRE = campfireBlock("jungle_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> JUNGLE_SOUL_CAMPFIRE = campfireBlock("jungle_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> MANGROVE_CAMPFIRE = campfireBlock("mangrove_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> OAK_CAMPFIRE = campfireBlock("oak_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> OAK_SOUL_CAMPFIRE = campfireBlock("oak_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> MANGROVE_SOUL_CAMPFIRE = campfireBlock("mangrove_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> SPRUCE_CAMPFIRE = campfireBlock("spruce_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> SPRUCE_SOUL_CAMPFIRE = campfireBlock("spruce_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> WARPED_CAMPFIRE = campfireBlock("warped_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> WARPED_SOUL_CAMPFIRE = campfireBlock("warped_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> PETRIFIED_CAMPFIRE = campfireBlock("petrified_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> PETRIFIED_SOUL_CAMPFIRE = campfireBlock("petrified_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> SCRAPWOOD_CAMPFIRE = campfireBlock("scrapwood_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> SCRAPWOOD_SOUL_CAMPFIRE = campfireBlock("scrapwood_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> BONE_CAMPFIRE = campfireBlock("bone_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> BONE_SOUL_CAMPFIRE = campfireBlock("bone_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> SHADE_CAMPFIRE = campfireBlock("shade_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.CAMPFIRE));
    public static final RegistrySupplier<ModCampfireBlock> SHADE_SOUL_CAMPFIRE = campfireBlock("shade_soul_campfire", true, 1, Block.Properties.ofFullCopy(Blocks.SOUL_CAMPFIRE));

    public static final RegistrySupplier<RailBlock> ACACIA_RAIL = railBlock("acacia_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> BIRCH_RAIL = railBlock("birch_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> CRIMSON_RAIL = railBlock("crimson_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> DARK_OAK_RAIL = railBlock("dark_oak_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> JUNGLE_RAIL = railBlock("jungle_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> MANGROVE_RAIL = railBlock("mangrove_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> SPRUCE_RAIL = railBlock("spruce_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> WARPED_RAIL = railBlock("warped_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> SCRAPWOOD_RAIL = railBlock("scrapwood_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> WHISPUR_RAIL = railBlock("whispur_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> PETRIFIED_RAIL = railBlock("petrified_rail", Block.Properties.ofFullCopy(Blocks.RAIL));
    public static final RegistrySupplier<RailBlock> SHADE_RAIL = railBlock("shade_rail", Block.Properties.ofFullCopy(Blocks.RAIL));

    public static final RegistrySupplier<DetectorRailBlock> ACACIA_DETECTOR_RAIL = detectorRailBlock("acacia_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> BIRCH_DETECTOR_RAIL = detectorRailBlock("birch_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> CRIMSON_DETECTOR_RAIL = detectorRailBlock("crimson_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> DARK_OAK_DETECTOR_RAIL = detectorRailBlock("dark_oak_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> JUNGLE_DETECTOR_RAIL = detectorRailBlock("jungle_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> MANGROVE_DETECTOR_RAIL = detectorRailBlock("mangrove_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> SPRUCE_DETECTOR_RAIL = detectorRailBlock("spruce_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> WARPED_DETECTOR_RAIL = detectorRailBlock("warped_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> SCRAPWOOD_DETECTOR_RAIL = detectorRailBlock("scrapwood_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> WHISPUR_DETECTOR_RAIL = detectorRailBlock("whispur_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> PETRIFIED_DETECTOR_RAIL = detectorRailBlock("petrified_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));
    public static final RegistrySupplier<DetectorRailBlock> SHADE_DETECTOR_RAIL = detectorRailBlock("shade_detector_rail", Block.Properties.ofFullCopy(Blocks.DETECTOR_RAIL));

    public static final RegistrySupplier<PoweredRailBlock> ACACIA_POWERED_RAIL = poweredRailBlock("acacia_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> BIRCH_POWERED_RAIL = poweredRailBlock("birch_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> CRIMSON_POWERED_RAIL = poweredRailBlock("crimson_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> DARK_OAK_POWERED_RAIL = poweredRailBlock("dark_oak_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> JUNGLE_POWERED_RAIL = poweredRailBlock("jungle_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> MANGROVE_POWERED_RAIL = poweredRailBlock("mangrove_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> SPRUCE_POWERED_RAIL = poweredRailBlock("spruce_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> WARPED_POWERED_RAIL = poweredRailBlock("warped_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> SCRAPWOOD_POWERED_RAIL = poweredRailBlock("scrapwood_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> WHISPUR_POWERED_RAIL = poweredRailBlock("whispur_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> PETRIFIED_POWERED_RAIL = poweredRailBlock("petrified_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));
    public static final RegistrySupplier<PoweredRailBlock> SHADE_POWERED_RAIL = poweredRailBlock("shade_powered_rail", Block.Properties.ofFullCopy(Blocks.POWERED_RAIL));

    public static final RegistrySupplier<Block> ACACIA_ACTIVATOR_RAIL = activatorRailBlock("acacia_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> BIRCH_ACTIVATOR_RAIL = activatorRailBlock("birch_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> CRIMSON_ACTIVATOR_RAIL = activatorRailBlock("crimson_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> DARK_OAK_ACTIVATOR_RAIL = activatorRailBlock("dark_oak_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> JUNGLE_ACTIVATOR_RAIL = activatorRailBlock("jungle_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> MANGROVE_ACTIVATOR_RAIL = activatorRailBlock("mangrove_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> SPRUCE_ACTIVATOR_RAIL = activatorRailBlock("spruce_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> WARPED_ACTIVATOR_RAIL = activatorRailBlock("warped_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> SCRAPWOOD_ACTIVATOR_RAIL = activatorRailBlock("scrapwood_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> WHISPUR_ACTIVATOR_RAIL = activatorRailBlock("whispur_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> PETRIFIED_ACTIVATOR_RAIL = activatorRailBlock("petrified_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));
    public static final RegistrySupplier<Block> SHADE_ACTIVATOR_RAIL = activatorRailBlock("shade_activator_rail", Block.Properties.ofFullCopy(Blocks.ACTIVATOR_RAIL));

    public static final RegistrySupplier<HedgeBlock> ACACIA_HEDGE = hedgeBlock("acacia_hedge", Block.Properties.ofFullCopy(Blocks.ACACIA_LEAVES));
    public static final RegistrySupplier<HedgeBlock> AZALEA_HEDGE = hedgeBlock("azalea_hedge", Block.Properties.ofFullCopy(Blocks.AZALEA_LEAVES));
    public static final RegistrySupplier<HedgeBlock> FLOWERING_AZALEA_HEDGE = hedgeBlock("flowering_azalea_hedge", Block.Properties.ofFullCopy(Blocks.FLOWERING_AZALEA_LEAVES));
    public static final RegistrySupplier<HedgeBlock> BIRCH_HEDGE = hedgeBlock("birch_hedge", Block.Properties.ofFullCopy(Blocks.BIRCH_LEAVES));
    public static final RegistrySupplier<HedgeBlock> DARK_OAK_HEDGE = hedgeBlock("dark_oak_hedge", Block.Properties.ofFullCopy(Blocks.DARK_OAK_LEAVES));
    public static final RegistrySupplier<HedgeBlock> JUNGLE_HEDGE = hedgeBlock("jungle_hedge", Block.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES));
    public static final RegistrySupplier<HedgeBlock> MANGROVE_HEDGE = hedgeBlock("mangrove_hedge", Block.Properties.ofFullCopy(Blocks.MANGROVE_LEAVES));
    public static final RegistrySupplier<HedgeBlock> OAK_HEDGE = hedgeBlock("oak_hedge", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<HedgeBlock> SPRUCE_HEDGE = hedgeBlock("spruce_hedge", Block.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES));
    public static final RegistrySupplier<HedgeBlock> SHADE_HEDGE = hedgeBlock("shade_hedge", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<HedgeBlock> TEAL_SHADE_HEDGE = hedgeBlock("teal_shade_hedge", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<HedgeBlock> RED_SHADE_HEDGE = hedgeBlock("red_shade_hedge", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<HedgeBlock> PURPLE_SHADE_HEDGE = hedgeBlock("purple_shade_hedge", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final RegistrySupplier<LeafyWallBlock> ACACIA_HEDGE_WALL = leafyWallBlock("acacia_hedge_wall", Block.Properties.ofFullCopy(Blocks.ACACIA_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> AZALEA_HEDGE_WALL = leafyWallBlock("azalea_hedge_wall", Block.Properties.ofFullCopy(Blocks.AZALEA_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> FLOWERING_AZALEA_HEDGE_WALL = leafyWallBlock("flowering_azalea_hedge_wall", Block.Properties.ofFullCopy(Blocks.FLOWERING_AZALEA_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> BIRCH_HEDGE_WALL = leafyWallBlock("birch_hedge_wall", Block.Properties.ofFullCopy(Blocks.BIRCH_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> DARK_OAK_HEDGE_WALL = leafyWallBlock("dark_oak_hedge_wall", Block.Properties.ofFullCopy(Blocks.DARK_OAK_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> JUNGLE_HEDGE_WALL = leafyWallBlock("jungle_hedge_wall", Block.Properties.ofFullCopy(Blocks.JUNGLE_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> MANGROVE_HEDGE_WALL = leafyWallBlock("mangrove_hedge_wall", Block.Properties.ofFullCopy(Blocks.MANGROVE_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> OAK_HEDGE_WALL = leafyWallBlock("oak_hedge_wall", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> SPRUCE_HEDGE_WALL = leafyWallBlock("spruce_hedge_wall", Block.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> SHADE_HEDGE_WALL = leafyWallBlock("shade_hedge_wall", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> TEAL_SHADE_HEDGE_WALL = leafyWallBlock("teal_shade_hedge_wall", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> RED_SHADE_HEDGE_WALL = leafyWallBlock("red_shade_hedge_wall", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final RegistrySupplier<LeafyWallBlock> PURPLE_SHADE_HEDGE_WALL = leafyWallBlock("purple_shade_hedge_wall", Block.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final RegistrySupplier<FurnaceBlock> BLACKSTONE_FURNACE = furnaceBlock("blackstone_furnace", Block.Properties.ofFullCopy(Blocks.FURNACE));
    public static final RegistrySupplier<FurnaceBlock> DEEPSLATE_FURNACE = furnaceBlock("deepslate_furnace", Block.Properties.ofFullCopy(Blocks.FURNACE));
    public static final RegistrySupplier<FurnaceBlock> ANDESITE_FURNACE = furnaceBlock("andesite_furnace", Block.Properties.ofFullCopy(Blocks.FURNACE));
    public static final RegistrySupplier<FurnaceBlock> DIORITE_FURNACE = furnaceBlock("diorite_furnace", Block.Properties.ofFullCopy(Blocks.FURNACE));
    public static final RegistrySupplier<FurnaceBlock> GRANITE_FURNACE = furnaceBlock("granite_furnace", Block.Properties.ofFullCopy(Blocks.FURNACE));

    public static final RegistrySupplier<DispenserBlock> BLACKSTONE_DISPENSER = dispenserBlock("blackstone_dispenser", Block.Properties.ofFullCopy(Blocks.DISPENSER));
    public static final RegistrySupplier<DispenserBlock> DEEPSLATE_DISPENSER = dispenserBlock("deepslate_dispenser", Block.Properties.ofFullCopy(Blocks.DISPENSER));
    public static final RegistrySupplier<DispenserBlock> ANDESITE_DISPENSER = dispenserBlock("andesite_dispenser", Block.Properties.ofFullCopy(Blocks.DISPENSER));
    public static final RegistrySupplier<DispenserBlock> DIORITE_DISPENSER = dispenserBlock("diorite_dispenser", Block.Properties.ofFullCopy(Blocks.DISPENSER));
    public static final RegistrySupplier<DispenserBlock> GRANITE_DISPENSER = dispenserBlock("granite_dispenser", Block.Properties.ofFullCopy(Blocks.DISPENSER));

    public static final RegistrySupplier<DropperBlock> BLACKSTONE_DROPPER = dropperBlock("blackstone_dropper", Block.Properties.ofFullCopy(Blocks.DROPPER));
    public static final RegistrySupplier<DropperBlock> DEEPSLATE_DROPPER = dropperBlock("deepslate_dropper", Block.Properties.ofFullCopy(Blocks.DROPPER));
    public static final RegistrySupplier<DropperBlock> ANDESITE_DROPPER = dropperBlock("andesite_dropper", Block.Properties.ofFullCopy(Blocks.DROPPER));
    public static final RegistrySupplier<DropperBlock> DIORITE_DROPPER = dropperBlock("diorite_dropper", Block.Properties.ofFullCopy(Blocks.DROPPER));
    public static final RegistrySupplier<DropperBlock> GRANITE_DROPPER = dropperBlock("granite_dropper", Block.Properties.ofFullCopy(Blocks.DROPPER));

    public static final RegistrySupplier<Block> AURUM_BLOCK = block("aurum_block",Block.Properties.ofFullCopy(Blocks.GOLD_BLOCK));
    public static final RegistrySupplier<DropExperienceBlock> AURUM_ORE = dropExperienceBlock("aurum_ore", UniformInt.of(0, 1), BlockBehaviour.Properties.of().strength(0.5F, 3.0F).sound(SoundType.NETHER_GOLD_ORE).mapColor(MapColor.NETHER));
    public static final RegistrySupplier<DropExperienceBlock> NETHER_DIAMOND_ORE = dropExperienceBlock("nether_diamond_ore", UniformInt.of(0, 6), BlockBehaviour.Properties.of().strength(2.5F, 6.0F).sound(SoundType.NETHER_GOLD_ORE).mapColor(MapColor.NETHER).requiresCorrectToolForDrops());
    public static final RegistrySupplier<DropExperienceBlock> BASALT_DIAMOND_ORE = dropExperienceBlock("basalt_diamond_ore", UniformInt.of(0, 6), BlockBehaviour.Properties.of().strength(2.0F, 6.0F).sound(SoundType.BASALT).mapColor(MapColor.NETHER).requiresCorrectToolForDrops());

    public static final RegistrySupplier<Block> WITHERED_BLOCK = block("withered_block",Block.Properties.of().strength(2.0F, 20.0F).sound(SoundType.NETHERITE_BLOCK).mapColor(MapColor.COLOR_BLACK));

    public static final RegistrySupplier<Block> NETHER_BRISTLE = BLOCKS.register("nether_bristle",() -> new NetherBristleBlock(BlockBehaviour.Properties.of().setId(id("nether_bristle")).noCollission().instabreak().sound(SoundType.AZALEA_LEAVES).offsetType(BlockBehaviour.OffsetType.XZ).mapColor(MapColor.CRIMSON_HYPHAE)));
    public static final RegistrySupplier<Block> WHISPUR_ROOT = BLOCKS.register("whispur_root",() -> new WhispurRootBlock(BlockBehaviour.Properties.of().setId(id("whispur_root")).strength(0.4F).sound(SoundType.BONE_BLOCK).mapColor(MapColor.SAND).noOcclusion()));
    public static final RegistrySupplier<Block> CARAMINE_RYE = BLOCKS.register("caramine_rye",() -> new CaramineRyeBlock(Block.Properties.of().setId(id("caramine_rye")).noCollission().randomTicks().instabreak().sound(SoundType.CROP).mapColor(MapColor.COLOR_RED)));
    public static final RegistrySupplier<Block> TWISTING_VINES_PLANT = BLOCKS.register("twisting_vines_plant",() -> new ModTwistingVinesPlantBlock(Block.Properties.ofFullCopy(Blocks.TWISTING_VINES_PLANT).setId(id("twisting_vines_plant"))));
    public static final RegistrySupplier<Block> WARPED_ROOTS = BLOCKS.register("warped_roots",() -> new ModWarpedRootsBlock(Block.Properties.ofFullCopy(Blocks.WARPED_ROOTS).setId(id("warped_roots"))));
    public static final RegistrySupplier<Block> CARVED_PUMPKIN = BLOCKS.register("carved_pumpkin",() -> new ModCarvedPumpkinBlock(Block.Properties.ofFullCopy(Blocks.CARVED_PUMPKIN).setId(id("carved_pumpkin")).lightLevel(value -> value.getValue(ModCarvedPumpkinBlock.LIT) ? 15 : 0)));

    private static final BlockBehaviour.Properties SHADE_LEAVES_PROPERTIES = Block.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion();
    public static final RegistrySupplier<LeavesBlock> SHADE_LEAVES = leavesBlock("shade_leaves", SHADE_LEAVES_PROPERTIES);
    public static final RegistrySupplier<LeavesBlock> TEAL_SHADE_LEAVES = leavesBlock("teal_shade_leaves", SHADE_LEAVES_PROPERTIES.mapColor(MapColor.COLOR_CYAN));
    public static final RegistrySupplier<LeavesBlock> RED_SHADE_LEAVES = leavesBlock("red_shade_leaves", SHADE_LEAVES_PROPERTIES.mapColor(MapColor.COLOR_RED));
    public static final RegistrySupplier<LeavesBlock> PURPLE_SHADE_LEAVES = leavesBlock("purple_shade_leaves", SHADE_LEAVES_PROPERTIES.mapColor(MapColor.COLOR_PURPLE));

    private static final BlockBehaviour.Properties SHADE_SAPLING_PROPERTIES = Block.Properties.of().mapColor(MapColor.COLOR_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS);
    public static final RegistrySupplier<ShadeSaplingBlock> SHADE_SAPLING = shadeSaplingBlock("shade_sapling", ShadeTree.Color.NORMAL, SHADE_SAPLING_PROPERTIES);
    public static final RegistrySupplier<ShadeSaplingBlock> TEAL_SHADE_SAPLING = shadeSaplingBlock("teal_shade_sapling", ShadeTree.Color.TEAL, SHADE_SAPLING_PROPERTIES.mapColor(MapColor.COLOR_CYAN));
    public static final RegistrySupplier<ShadeSaplingBlock> RED_SHADE_SAPLING = shadeSaplingBlock("red_shade_sapling", ShadeTree.Color.RED, SHADE_SAPLING_PROPERTIES.mapColor(MapColor.COLOR_RED));
    public static final RegistrySupplier<ShadeSaplingBlock> PURPLE_SHADE_SAPLING = shadeSaplingBlock("purple_shade_sapling", ShadeTree.Color.PURPLE, SHADE_SAPLING_PROPERTIES.mapColor(MapColor.COLOR_PURPLE));

    public static final RegistrySupplier<Block> DURIAN = block("durian", Block.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(0.2F).sound(SoundType.WOOD).noOcclusion());

    public static final RegistrySupplier<Block> HADALITE = block("hadalite", Block.Properties.ofFullCopy(Blocks.BEDROCK));

    public static final RegistrySupplier<SlabBlock> BASALT_SLAB = slabBlock("basalt_slab", Block.Properties.ofFullCopy(Blocks.BASALT));
    public static final RegistrySupplier<SlabBlock> SMOOTH_BASALT_SLAB = slabBlock("smooth_basalt_slab", Block.Properties.ofFullCopy(Blocks.SMOOTH_BASALT));
    public static final RegistrySupplier<SlabBlock> POLISHED_BASALT_SLAB = slabBlock("polished_basalt_slab", Block.Properties.ofFullCopy(Blocks.POLISHED_BASALT));

    public static final RegistrySupplier<StairBlock> BASALT_STAIRS = stairBlock("basalt_stairs" , Blocks.BASALT, () -> Block.Properties.ofFullCopy(Blocks.BASALT));
    public static final RegistrySupplier<StairBlock> SMOOTH_BASALT_STAIRS = stairBlock("smooth_basalt_stairs", Blocks.SMOOTH_BASALT, () -> Block.Properties.ofFullCopy(Blocks.SMOOTH_BASALT));
    public static final RegistrySupplier<StairBlock> POLISHED_BASALT_STAIRS = stairBlock("polished_basalt_stairs", Blocks.POLISHED_BASALT, () -> Block.Properties.ofFullCopy(Blocks.POLISHED_BASALT));

    public static final RegistrySupplier<WallBlock> BASALT_WALL = wallBlock("basalt_wall", Block.Properties.ofFullCopy(Blocks.BASALT));
    public static final RegistrySupplier<WallBlock> SMOOTH_BASALT_WALL = wallBlock("smooth_basalt_wall", Block.Properties.ofFullCopy(Blocks.SMOOTH_BASALT));
    public static final RegistrySupplier<WallBlock> POLISHED_BASALT_WALL = wallBlock("polished_basalt_wall", Block.Properties.ofFullCopy(Blocks.POLISHED_BASALT));

    public static final RegistrySupplier<Block> PATINA_GOLD_BLOCK = block("patina_gold_block", BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK));
    public static final RegistrySupplier<Block> PATINA_AURUM_BLOCK = block("patina_aurum_block", BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK));

    public static final TreeGrower SHADE_TREE_GROWER = new TreeGrower("shade_tree", Optional.empty(), Optional.of(ReDevFeatures.CONFIGURED_SHADE_TREE), Optional.empty());

    private static RegistrySupplier<WallSignBlock> wallSignBlock(String name, WoodType woodType, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> new WallSignBlock(woodType, properties.setId(id(name))));
    }

    private static RegistrySupplier<Block> block(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> new Block(properties.setId(id(name))));
    }

    private static RegistrySupplier<WallBlock> wallBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new WallBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<StairBlock> stairBlock(String name, RegistrySupplier<Block> blockstate, Supplier<Properties> properties) {
        return BLOCKS.register(name,() -> new StairBlock(blockstate.get().defaultBlockState(), properties.get().setId(id(name))));
    }

    private static RegistrySupplier<StairBlock> stairBlock(String name, Block blockstate, Supplier<Properties> properties) {
        return BLOCKS.register(name,() -> new StairBlock(blockstate.defaultBlockState(), properties.get().setId(id(name))));
    }

    private static RegistrySupplier<SlabBlock> slabBlock(String name,BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new SlabBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<ShadeSaplingBlock> shadeSaplingBlock(String name, ShadeTree.Color color, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new ShadeSaplingBlock(color, properties.setId(id(name))));
    }

    private static RegistrySupplier<LeavesBlock> leavesBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new LeavesBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<RotatedPillarBlock> rotatedPillarBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new RotatedPillarBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<StrippableLogBlock> strippableLogBlock(String name, BlockBehaviour.Properties properties, RegistrySupplier<? extends Block> strippedBlock) {
        return BLOCKS.register(name,() -> new StrippableLogBlock(properties.setId(id(name)), strippedBlock.get()));
    }

    private static RegistrySupplier<FenceBlock> fenceBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new FenceBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<FenceGateBlock> fenceGateBlock(String name, WoodType woodType, Supplier<Properties> properties) {
        return BLOCKS.register(name,() -> new FenceGateBlock(woodType, properties.get().setId(id(name)).forceSolidOn()));
    }

    private static RegistrySupplier<DispenserBlock> dispenserBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new DispenserBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<DropperBlock> dropperBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new DropperBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<LadderBlock> ladderBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new LadderBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<HangingLadderBlock> hangingLadderBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new HangingLadderBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<RailBlock> railBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new RailBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<Block> activatorRailBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> new Block(properties.setId(id(name))));
    }

    private static RegistrySupplier<DetectorRailBlock> detectorRailBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new DetectorRailBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<PoweredRailBlock> poweredRailBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new PoweredRailBlock(properties.setId(id(name))));
    }


    private static RegistrySupplier<LeafyWallBlock> leafyWallBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new LeafyWallBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<FurnaceBlock> furnaceBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new FurnaceBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<DropExperienceBlock> dropExperienceBlock(String name, IntProvider intProvider, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new DropExperienceBlock(intProvider, properties.setId(id(name))));
    }

    private static RegistrySupplier<DoorBlock> doorBlock(String name, BlockSetType blockSetType, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new DoorBlock(blockSetType, properties.setId(id(name))));
    }

    private static RegistrySupplier<TrapDoorBlock> trapdoorBlock(String name, BlockSetType blockSetType, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new TrapDoorBlock(blockSetType, properties.setId(id(name))));
    }

    private static RegistrySupplier<ButtonBlock> buttonBlock(String name, BlockSetType blockSetType, int i, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new ButtonBlock(blockSetType, i, properties.setId(id(name))));
    }

    private static RegistrySupplier<PressurePlateBlock> pressurePlateBlock(String name, BlockSetType blockSetType, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new PressurePlateBlock(blockSetType, properties.setId(id(name))));
    }

    private static RegistrySupplier<HedgeBlock> hedgeBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new HedgeBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<SmithingTableBlock> smithingTableBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new SmithingTableBlock(properties.setId(id(name))));
    }

    private static RegistrySupplier<StandingSignBlock> standingSignBlock(String name, WoodType woodType, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new StandingSignBlock(woodType, properties.setId(id(name))));
    }

    private static RegistrySupplier<ModCampfireBlock> campfireBlock(String name, boolean spawnParticles, int damage, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name,() -> new ModCampfireBlock(spawnParticles, damage, properties.setId(id(name))));
    }

    private static ResourceKey<Block> id(String name) {
        return ResourceKey.create(Registries.BLOCK, redevResource(name));
    }
}
