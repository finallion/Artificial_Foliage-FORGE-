package com.finallion.arfo.init;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ARFOBlocks {

    public static List<Block> blocksList = new ArrayList<>();

    public static final Block ARTIFICIAL_SOIL = createBlock(new ARFOSoilBlock(), "artificial_soil");

    public static final Block JUNGLE_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "jungle_grass_block");
    public static final Block BADLANDS_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "badlands_grass_block");
    public static final Block SAVANNA_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "savanna_grass_block");
    public static final Block JUNGLE_EDGE_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "jungle_edge_grass_block");
    public static final Block FOREST_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "forest_grass_block");
    public static final Block BIRCH_FOREST_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "birch_forest_grass_block");
    public static final Block DARK_FOREST_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "dark_forest_grass_block");
    public static final Block LUSH_SWAMP_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "lush_swamp_grass_block");
    public static final Block SWAMP_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "swamp_grass_block");
    public static final Block PLAINS_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "plains_grass_block");
    public static final Block WATERS_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "waters_grass_block");
    public static final Block MUSHROOM_FIELDS_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "mushroom_fields_grass_block");
    public static final Block MOUNTAINS_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "mountains_grass_block");
    public static final Block SNOWY_BEACH_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "snowy_beach_grass_block");
    public static final Block MEGA_TAIGA_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "mega_taiga_grass_block");
    public static final Block TAIGA_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "taiga_grass_block");
    public static final Block SNOWY_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "snowy_grass_block");

    public static final Block ALPHA_GRASS_BLOCK = createBlock(new ARFOGrassBlock(), "alpha_grass_block");
    public static final Block ALPHA_LEAVES = createBlock(new LeavesBlock(AbstractBlock.Properties.copy(Blocks.OAK_LEAVES).harvestTool(ToolType.HOE).noOcclusion().sound(SoundType.GRASS)), "alpha_leaves");

    public static final Block TROPICAL_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "tropical_jungle_leaves");
    public static final Block BADLANDS_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "badlands_jungle_leaves");
    public static final Block SAVANNA_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "savanna_jungle_leaves");
    public static final Block TROPICAL_EDGE_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "tropical_edge_jungle_leaves");
    public static final Block FOREST_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "forest_jungle_leaves");
    public static final Block BIRCH_FOREST_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "birch_forest_jungle_leaves");
    public static final Block SWAMP_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "swamp_jungle_leaves");
    public static final Block PLAINS_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "plains_jungle_leaves");
    public static final Block WATERS_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "waters_jungle_leaves");
    public static final Block MOUNTAINS_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "mountains_jungle_leaves");
    public static final Block MUSHROOM_FIELDS_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "mushroom_fields_jungle_leaves");
    public static final Block TAIGA_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "taiga_jungle_leaves");
    public static final Block SNOWY_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "snowy_jungle_leaves");
    public static final Block MEGA_TAIGA_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "mega_taiga_jungle_leaves");
    public static final Block SNOWY_BEACH_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "snowy_beach_jungle_leaves");
    public static final Block LUSH_SWAMP_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "lush_swamp_jungle_leaves");
    public static final Block DARK_FOREST_JUNGLE_LEAVES = createBlock(new ARFOJungleLeavesBlock(), "dark_forest_jungle_leaves");

    public static final Block TROPICAL_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "tropical_oak_leaves");
    public static final Block BADLANDS_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "badlands_oak_leaves");
    public static final Block SAVANNA_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "savanna_oak_leaves");
    public static final Block TROPICAL_EDGE_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "tropical_edge_oak_leaves");
    public static final Block FOREST_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "forest_oak_leaves");
    public static final Block BIRCH_FOREST_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "birch_forest_oak_leaves");
    public static final Block SWAMP_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "swamp_oak_leaves");
    public static final Block PLAINS_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "plains_oak_leaves");
    public static final Block WATERS_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "waters_oak_leaves");
    public static final Block MOUNTAINS_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "mountains_oak_leaves");
    public static final Block MUSHROOM_FIELDS_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "mushroom_fields_oak_leaves");
    public static final Block TAIGA_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "taiga_oak_leaves");
    public static final Block MEGA_TAIGA_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "mega_taiga_oak_leaves");
    public static final Block SNOWY_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "snowy_oak_leaves");
    public static final Block SNOWY_BEACH_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "snowy_beach_oak_leaves");
    public static final Block LUSH_SWAMP_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "lush_swamp_oak_leaves");
    public static final Block DARK_FOREST_OAK_LEAVES = createBlock(new ARFOOakLeavesBlock(), "dark_forest_oak_leaves");

    public static final Block TROPICAL_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "tropical_dark_oak_leaves");
    public static final Block BADLANDS_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "badlands_dark_oak_leaves");
    public static final Block SAVANNA_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "savanna_dark_oak_leaves");
    public static final Block TROPICAL_EDGE_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "tropical_edge_dark_oak_leaves");
    public static final Block FOREST_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "forest_dark_oak_leaves");
    public static final Block BIRCH_FOREST_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "birch_forest_dark_oak_leaves");
    public static final Block SWAMP_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "swamp_dark_oak_leaves");
    public static final Block PLAINS_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "plains_dark_oak_leaves");
    public static final Block WATERS_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "waters_dark_oak_leaves");
    public static final Block MOUNTAINS_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "mountains_dark_oak_leaves");
    public static final Block MUSHROOM_FIELDS_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "mushroom_fields_dark_oak_leaves");
    public static final Block TAIGA_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "taiga_dark_oak_leaves");
    public static final Block MEGA_TAIGA_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "mega_taiga_dark_oak_leaves");
    public static final Block SNOWY_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "snowy_dark_oak_leaves");
    public static final Block SNOWY_BEACH_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "snowy_beach_dark_oak_leaves");
    public static final Block LUSH_SWAMP_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "lush_swamp_dark_oak_leaves");
    public static final Block DARK_FOREST_DARK_OAK_LEAVES = createBlock(new ARFODarkOakLeavesBlock(), "dark_forest_dark_oak_leaves");

    public static final Block TROPICAL_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "tropical_acacia_leaves");
    public static final Block BADLANDS_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "badlands_acacia_leaves");
    public static final Block SAVANNA_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "savanna_acacia_leaves");
    public static final Block TROPICAL_EDGE_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "tropical_edge_acacia_leaves");
    public static final Block FOREST_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "forest_acacia_leaves");
    public static final Block BIRCH_FOREST_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "birch_forest_acacia_leaves");
    public static final Block SWAMP_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "swamp_acacia_leaves");
    public static final Block PLAINS_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "plains_acacia_leaves");
    public static final Block WATERS_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "waters_acacia_leaves");
    public static final Block MOUNTAINS_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "mountains_acacia_leaves");
    public static final Block MUSHROOM_FIELDS_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "mushroom_fields_acacia_leaves");
    public static final Block TAIGA_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "taiga_acacia_leaves");
    public static final Block MEGA_TAIGA_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "mega_taiga_acacia_leaves");
    public static final Block SNOWY_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "snowy_acacia_leaves");
    public static final Block SNOWY_BEACH_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "snowy_beach_acacia_leaves");
    public static final Block LUSH_SWAMP_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "lush_swamp_acacia_leaves");
    public static final Block DARK_FOREST_ACACIA_LEAVES = createBlock(new ARFOAcaciaLeavesBlock(), "dark_forest_acacia_leaves");

    public static final Block TROPICAL_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_oak_leaves_carpet");
    public static final Block TROPICAL_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_dark_oak_leaves_carpet");
    public static final Block TROPICAL_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_jungle_leaves_carpet");
    public static final Block TROPICAL_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_acacia_leaves_carpet");
    public static final Block TROPICAL_EDGE_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_edge_oak_leaves_carpet");
    public static final Block TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_edge_dark_oak_leaves_carpet");
    public static final Block TROPICAL_EDGE_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_edge_jungle_leaves_carpet");
    public static final Block TROPICAL_EDGE_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "tropical_edge_acacia_leaves_carpet");
    public static final Block BADLANDS_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "badlands_oak_leaves_carpet");
    public static final Block BADLANDS_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "badlands_dark_oak_leaves_carpet");
    public static final Block BADLANDS_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "badlands_jungle_leaves_carpet");
    public static final Block BADLANDS_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "badlands_acacia_leaves_carpet");
    public static final Block SAVANNA_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "savanna_oak_leaves_carpet");
    public static final Block SAVANNA_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "savanna_dark_oak_leaves_carpet");
    public static final Block SAVANNA_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "savanna_jungle_leaves_carpet");
    public static final Block SAVANNA_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "savanna_acacia_leaves_carpet");
    public static final Block FOREST_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "forest_oak_leaves_carpet");
    public static final Block FOREST_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "forest_dark_oak_leaves_carpet");
    public static final Block FOREST_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "forest_jungle_leaves_carpet");
    public static final Block FOREST_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "forest_acacia_leaves_carpet");
    public static final Block BIRCH_FOREST_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "birch_forest_oak_leaves_carpet");
    public static final Block BIRCH_FOREST_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "birch_forest_dark_oak_leaves_carpet");
    public static final Block BIRCH_FOREST_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "birch_forest_jungle_leaves_carpet");
    public static final Block BIRCH_FOREST_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "birch_forest_acacia_leaves_carpet");
    public static final Block SWAMP_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "swamp_oak_leaves_carpet");
    public static final Block SWAMP_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "swamp_dark_oak_leaves_carpet");
    public static final Block SWAMP_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "swamp_jungle_leaves_carpet");
    public static final Block SWAMP_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "swamp_acacia_leaves_carpet");
    public static final Block WATERS_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "waters_oak_leaves_carpet");
    public static final Block WATERS_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "waters_dark_oak_leaves_carpet");
    public static final Block WATERS_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "waters_jungle_leaves_carpet");
    public static final Block WATERS_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "waters_acacia_leaves_carpet");
    public static final Block MOUNTAINS_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mountains_oak_leaves_carpet");
    public static final Block MOUNTAINS_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mountains_dark_oak_leaves_carpet");
    public static final Block MOUNTAINS_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mountains_jungle_leaves_carpet");
    public static final Block MOUNTAINS_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mountains_acacia_leaves_carpet");
    public static final Block MUSHROOM_FIELDS_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mushroom_fields_oak_leaves_carpet");
    public static final Block MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mushroom_fields_dark_oak_leaves_carpet");
    public static final Block MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mushroom_fields_jungle_leaves_carpet");
    public static final Block MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mushroom_fields_acacia_leaves_carpet");
    public static final Block TAIGA_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "taiga_oak_leaves_carpet");
    public static final Block TAIGA_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "taiga_dark_oak_leaves_carpet");
    public static final Block TAIGA_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "taiga_jungle_leaves_carpet");
    public static final Block TAIGA_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "taiga_acacia_leaves_carpet");
    public static final Block PLAINS_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "plains_oak_leaves_carpet");
    public static final Block PLAINS_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "plains_dark_oak_leaves_carpet");
    public static final Block PLAINS_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "plains_jungle_leaves_carpet");
    public static final Block PLAINS_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "plains_acacia_leaves_carpet");
    public static final Block MEGA_TAIGA_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mega_taiga_oak_leaves_carpet");
    public static final Block MEGA_TAIGA_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mega_taiga_dark_oak_leaves_carpet");
    public static final Block MEGA_TAIGA_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mega_taiga_jungle_leaves_carpet");
    public static final Block MEGA_TAIGA_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "mega_taiga_acacia_leaves_carpet");
    public static final Block SNOWY_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_oak_leaves_carpet");
    public static final Block SNOWY_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_dark_oak_leaves_carpet");
    public static final Block SNOWY_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_jungle_leaves_carpet");
    public static final Block SNOWY_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_acacia_leaves_carpet");
    public static final Block SNOWY_BEACH_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_beach_oak_leaves_carpet");
    public static final Block SNOWY_BEACH_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_beach_dark_oak_leaves_carpet");
    public static final Block SNOWY_BEACH_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_beach_jungle_leaves_carpet");
    public static final Block SNOWY_BEACH_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "snowy_beach_acacia_leaves_carpet");
    public static final Block DARK_FOREST_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "dark_forest_oak_leaves_carpet");
    public static final Block DARK_FOREST_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "dark_forest_dark_oak_leaves_carpet");
    public static final Block DARK_FOREST_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "dark_forest_jungle_leaves_carpet");
    public static final Block DARK_FOREST_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "dark_forest_acacia_leaves_carpet");
    public static final Block LUSH_SWAMP_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "lush_swamp_oak_leaves_carpet");
    public static final Block LUSH_SWAMP_DARK_OAK_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "lush_swamp_dark_oak_leaves_carpet");
    public static final Block LUSH_SWAMP_JUNGLE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "lush_swamp_jungle_leaves_carpet");
    public static final Block LUSH_SWAMP_ACACIA_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "lush_swamp_acacia_leaves_carpet");

    public static final Block SPRUCE_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "spruce_leaves_carpet");
    public static final Block BIRCH_LEAVES_CARPET = createBlock(new ARFOLeavesCarpetBlock(), "birch_leaves_carpet");

    // fern and large ferns
    public static final Block JUNGLE_FERN = createBlock(new ARFOFernBlock(), "jungle_fern");
    public static final Block LARGE_JUNGLE_FERN = createBlock(new ARFOLargeFernBlock(), "large_jungle_fern");
    public static final Block JUNGLE_EDGE_FERN = createBlock(new ARFOFernBlock(), "jungle_edge_fern");
    public static final Block LARGE_JUNGLE_EDGE_FERN = createBlock(new ARFOLargeFernBlock(), "large_jungle_edge_fern");
    public static final Block BADLANDS_FERN = createBlock(new ARFOFernBlock(), "badlands_fern");
    public static final Block LARGE_BADLANDS_FERN = createBlock(new ARFOLargeFernBlock(), "large_badlands_fern");
    public static final Block SAVANNA_FERN = createBlock(new ARFOFernBlock(), "savanna_fern");
    public static final Block LARGE_SAVANNA_FERN = createBlock(new ARFOLargeFernBlock(), "large_savanna_fern");
    public static final Block FOREST_FERN = createBlock(new ARFOFernBlock(), "forest_fern");
    public static final Block LARGE_FOREST_FERN = createBlock(new ARFOLargeFernBlock(), "large_forest_fern");
    public static final Block BIRCH_FOREST_FERN = createBlock(new ARFOFernBlock(), "birch_forest_fern");
    public static final Block LARGE_BIRCH_FOREST_FERN = createBlock(new ARFOLargeFernBlock(), "large_birch_forest_fern");
    public static final Block DARK_FOREST_FERN = createBlock(new ARFOFernBlock(), "dark_forest_fern");
    public static final Block LARGE_DARK_FOREST_FERN = createBlock(new ARFOLargeFernBlock(), "large_dark_forest_fern");
    public static final Block PLAINS_FERN = createBlock(new ARFOFernBlock(), "plains_fern");
    public static final Block LARGE_PLAINS_FERN = createBlock(new ARFOLargeFernBlock(), "large_plains_fern");
    public static final Block SWAMP_FERN = createBlock(new ARFOFernBlock(), "swamp_fern");
    public static final Block LARGE_SWAMP_FERN = createBlock(new ARFOLargeFernBlock(), "large_swamp_fern");
    public static final Block LUSH_SWAMP_FERN = createBlock(new ARFOFernBlock(), "lush_swamp_fern");
    public static final Block LARGE_LUSH_SWAMP_FERN = createBlock(new ARFOLargeFernBlock(), "large_lush_swamp_fern");
    public static final Block MOUNTAINS_FERN = createBlock(new ARFOFernBlock(), "mountains_fern");
    public static final Block LARGE_MOUNTAINS_FERN = createBlock(new ARFOLargeFernBlock(), "large_mountains_fern");
    public static final Block MUSHROOM_FIELDS_FERN = createBlock(new ARFOFernBlock(), "mushroom_fields_fern");
    public static final Block LARGE_MUSHROOM_FIELDS_FERN = createBlock(new ARFOLargeFernBlock(), "large_mushroom_fields_fern");
    public static final Block TAIGA_FERN = createBlock(new ARFOFernBlock(), "taiga_fern");
    public static final Block LARGE_TAIGA_FERN = createBlock(new ARFOLargeFernBlock(), "large_taiga_fern");
    public static final Block MEGA_TAIGA_FERN = createBlock(new ARFOFernBlock(), "mega_taiga_fern");
    public static final Block LARGE_MEGA_TAIGA_FERN = createBlock(new ARFOLargeFernBlock(), "large_mega_taiga_fern");
    public static final Block SNOWY_FERN = createBlock(new ARFOFernBlock(), "snowy_fern");
    public static final Block LARGE_SNOWY_FERN = createBlock(new ARFOLargeFernBlock(), "large_snowy_fern");
    public static final Block SNOWY_BEACH_FERN = createBlock(new ARFOFernBlock(), "snowy_beach_fern");
    public static final Block LARGE_SNOWY_BEACH_FERN = createBlock(new ARFOLargeFernBlock(), "large_snowy_beach_fern");
    public static final Block WATERS_FERN = createBlock(new ARFOFernBlock(), "waters_fern");
    public static final Block LARGE_WATERS_FERN = createBlock(new ARFOLargeFernBlock(), "large_waters_fern");

    // grass and tall grass
    public static final Block JUNGLE_GRASS = createBlock(new ARFOGrass(), "jungle_grass");
    public static final Block TALL_JUNGLE_GRASS = createBlock(new ARFOTallGrass(), "tall_jungle_grass");
    public static final Block JUNGLE_EDGE_GRASS = createBlock(new ARFOGrass(), "jungle_edge_grass");
    public static final Block TALL_JUNGLE_EDGE_GRASS = createBlock(new ARFOTallGrass(), "tall_jungle_edge_grass");
    public static final Block BADLANDS_GRASS = createBlock(new ARFOGrass(), "badlands_grass");
    public static final Block TALL_BADLANDS_GRASS = createBlock(new ARFOTallGrass(), "tall_badlands_grass");
    public static final Block SAVANNA_GRASS = createBlock(new ARFOGrass(), "savanna_grass");
    public static final Block TALL_SAVANNA_GRASS = createBlock(new ARFOTallGrass(), "tall_savanna_grass");
    public static final Block FOREST_GRASS = createBlock(new ARFOGrass(), "forest_grass");
    public static final Block TALL_FOREST_GRASS = createBlock(new ARFOTallGrass(), "tall_forest_grass");
    public static final Block BIRCH_FOREST_GRASS = createBlock(new ARFOGrass(), "birch_forest_grass");
    public static final Block TALL_BIRCH_FOREST_GRASS = createBlock(new ARFOTallGrass(), "tall_birch_forest_grass");
    public static final Block DARK_FOREST_GRASS = createBlock(new ARFOGrass(), "dark_forest_grass");
    public static final Block TALL_DARK_FOREST_GRASS = createBlock(new ARFOTallGrass(), "tall_dark_forest_grass");
    public static final Block PLAINS_GRASS = createBlock(new ARFOGrass(), "plains_grass");
    public static final Block TALL_PLAINS_GRASS = createBlock(new ARFOTallGrass(), "tall_plains_grass");
    public static final Block SWAMP_GRASS = createBlock(new ARFOGrass(), "swamp_grass");
    public static final Block TALL_SWAMP_GRASS = createBlock(new ARFOTallGrass(), "tall_swamp_grass");
    public static final Block LUSH_SWAMP_GRASS = createBlock(new ARFOGrass(), "lush_swamp_grass");
    public static final Block TALL_LUSH_SWAMP_GRASS = createBlock(new ARFOTallGrass(), "tall_lush_swamp_grass");
    public static final Block MOUNTAINS_GRASS = createBlock(new ARFOGrass(), "mountains_grass");
    public static final Block TALL_MOUNTAINS_GRASS = createBlock(new ARFOTallGrass(), "tall_mountains_grass");
    public static final Block MUSHROOM_FIELDS_GRASS = createBlock(new ARFOGrass(), "mushroom_fields_grass");
    public static final Block TALL_MUSHROOM_FIELDS_GRASS = createBlock(new ARFOTallGrass(), "tall_mushroom_fields_grass");
    public static final Block TAIGA_GRASS = createBlock(new ARFOGrass(), "taiga_grass");
    public static final Block TALL_TAIGA_GRASS = createBlock(new ARFOTallGrass(), "tall_taiga_grass");
    public static final Block MEGA_TAIGA_GRASS = createBlock(new ARFOGrass(), "mega_taiga_grass");
    public static final Block TALL_MEGA_TAIGA_GRASS = createBlock(new ARFOTallGrass(), "tall_mega_taiga_grass");
    public static final Block SNOWY_GRASS = createBlock(new ARFOGrass(), "snowy_grass");
    public static final Block TALL_SNOWY_GRASS = createBlock(new ARFOTallGrass(), "tall_snowy_grass");
    public static final Block SNOWY_BEACH_GRASS = createBlock(new ARFOGrass(), "snowy_beach_grass");
    public static final Block TALL_SNOWY_BEACH_GRASS = createBlock(new ARFOTallGrass(), "tall_snowy_beach_grass");
    public static final Block WATERS_GRASS = createBlock(new ARFOGrass(), "waters_grass");
    public static final Block TALL_WATERS_GRASS = createBlock(new ARFOTallGrass(), "tall_waters_grass");

    // sugar cane blocks
    public static final Block JUNGLE_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "jungle_sugar_cane");
    public static final Block JUNGLE_EDGE_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "jungle_edge_sugar_cane");
    public static final Block BADLANDS_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "badlands_sugar_cane");
    public static final Block SAVANNA_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "savanna_sugar_cane");
    public static final Block FOREST_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "forest_sugar_cane");
    public static final Block BIRCH_FOREST_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "birch_forest_sugar_cane");
    public static final Block DARK_FOREST_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "dark_forest_sugar_cane");
    public static final Block PLAINS_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "plains_sugar_cane");
    public static final Block SWAMP_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "swamp_sugar_cane");
    public static final Block LUSH_SWAMP_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "lush_swamp_sugar_cane");
    public static final Block MOUNTAINS_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "mountains_sugar_cane");
    public static final Block MUSHROOM_FIELDS_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "mushroom_fields_sugar_cane");
    public static final Block TAIGA_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "taiga_sugar_cane");
    public static final Block MEGA_TAIGA_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "mega_taiga_sugar_cane");
    public static final Block SNOWY_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "snowy_sugar_cane");
    public static final Block SNOWY_BEACH_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "snowy_beach_sugar_cane");
    public static final Block WATERS_SUGAR_CANE = createBlock(new ARFOSugarCaneBlock(), "waters_sugar_cane");

    // vine blocks
    public static final Block JUNGLE_VINE = createBlock(new ARFOVinesBlock(), "jungle_vine");
    public static final Block JUNGLE_EDGE_VINE = createBlock(new ARFOVinesBlock(), "jungle_edge_vine");
    public static final Block BADLANDS_VINE= createBlock(new ARFOVinesBlock(), "badlands_vine");
    public static final Block SAVANNA_VINE = createBlock(new ARFOVinesBlock(), "savanna_vine");
    public static final Block FOREST_VINE = createBlock(new ARFOVinesBlock(), "forest_vine");
    public static final Block BIRCH_FOREST_VINE = createBlock(new ARFOVinesBlock(), "birch_forest_vine");
    public static final Block DARK_FOREST_VINE = createBlock(new ARFOVinesBlock(), "dark_forest_vine");
    public static final Block PLAINS_VINE = createBlock(new ARFOVinesBlock(), "plains_vine");
    public static final Block SWAMP_VINE = createBlock(new ARFOVinesBlock(), "swamp_vine");
    public static final Block LUSH_SWAMP_VINE = createBlock(new ARFOVinesBlock(), "lush_swamp_vine");
    public static final Block MOUNTAINS_VINE = createBlock(new ARFOVinesBlock(), "mountains_vine");
    public static final Block MUSHROOM_FIELDS_VINE = createBlock(new ARFOVinesBlock(), "mushroom_fields_vine");
    public static final Block TAIGA_VINE = createBlock(new ARFOVinesBlock(), "taiga_vine");
    public static final Block MEGA_TAIGA_VINE = createBlock(new ARFOVinesBlock(), "mega_taiga_vine");
    public static final Block SNOWY_VINE = createBlock(new ARFOVinesBlock(), "snowy_vine");
    public static final Block SNOWY_BEACH_VINE = createBlock(new ARFOVinesBlock(), "snowy_beach_vine");
    public static final Block WATERS_VINE = createBlock(new ARFOVinesBlock(), "waters_vine");

    // slabs
    public static final Block JUNGLE_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "jungle_grass_slab");
    public static final Block JUNGLE_EDGE_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "jungle_edge_grass_slab");
    public static final Block BADLANDS_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "badlands_grass_slab");
    public static final Block SAVANNA_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "savanna_grass_slab");
    public static final Block FOREST_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "forest_grass_slab");
    public static final Block BIRCH_FOREST_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "birch_forest_grass_slab");
    public static final Block DARK_FOREST_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "dark_forest_grass_slab");
    public static final Block PLAINS_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "plains_grass_slab");
    public static final Block SWAMP_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "swamp_grass_slab");
    public static final Block LUSH_SWAMP_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "lush_swamp_grass_slab");
    public static final Block MOUNTAINS_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "mountains_grass_slab");
    public static final Block MUSHROOM_FIELDS_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "mushroom_fields_grass_slab");
    public static final Block TAIGA_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "taiga_grass_slab");
    public static final Block MEGA_TAIGA_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "mega_taiga_grass_slab");
    public static final Block SNOWY_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "snowy_grass_slab");
    public static final Block SNOWY_BEACH_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "snowy_beach_grass_slab");
    public static final Block WATERS_GRASS_SLAB = createBlock(new ARFOGrassBlockSlab(), "waters_grass_slab");

    public static final Block GRASS_SLAB = createBlock(new ARFOSlabBlock(AbstractBlock.Properties.copy(Blocks.GRASS_BLOCK).harvestTool(ToolType.SHOVEL)), "grass_slab");
    public static final Block DIRT_SLAB = createBlock(new ARFOSlabBlock(AbstractBlock.Properties.copy(Blocks.DIRT).harvestTool(ToolType.SHOVEL)), "dirt_slab");
    public static final Block COARSE_DIRT_SLAB = createBlock(new ARFOSlabBlock(AbstractBlock.Properties.copy(Blocks.COARSE_DIRT).harvestTool(ToolType.SHOVEL)), "coarse_dirt_slab");
    public static final Block PODZOL_SLAB = createBlock(new ARFOSlabBlock(AbstractBlock.Properties.copy(Blocks.PODZOL).harvestTool(ToolType.SHOVEL)), "podzol_slab");
    public static final Block MYCELIUM_SLAB = createBlock(new ARFOSlabBlock(AbstractBlock.Properties.copy(Blocks.MYCELIUM).harvestTool(ToolType.SHOVEL)), "mycelium_slab");
    public static final Block ARTIFICIAL_SOIL_SLAB = createBlock(new ARFOSlabBlock(AbstractBlock.Properties.copy(Blocks.DIRT).harvestTool(ToolType.SHOVEL)), "artificial_soil_slab");

    public static final Block GRASS_PATH_SLAB = createBlock(new ARFOSmallerSlabBlock(AbstractBlock.Properties.copy(Blocks.GRASS_PATH).harvestTool(ToolType.SHOVEL)), "grass_path_slab");
    public static final Block NETHERRACK_SLAB = createBlock(new ARFONetherSlabBlock(AbstractBlock.Properties.copy(Blocks.NETHERRACK).harvestTool(ToolType.PICKAXE)), "netherrack_slab");
    public static final Block CRIMSON_NYLIUM_SLAB = createBlock(new ARFONetherSlabBlock(AbstractBlock.Properties.copy(Blocks.CRIMSON_NYLIUM).harvestTool(ToolType.PICKAXE)), "crimson_nylium_slab");
    public static final Block WARPED_NYLIUM_SLAB = createBlock(new ARFONetherSlabBlock(AbstractBlock.Properties.copy(Blocks.WARPED_NYLIUM).harvestTool(ToolType.PICKAXE)), "warped_nylium_slab");

    public static final Block GLOWING_JUNGLE_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_jungle_grass_block");
    public static final Block GLOWING_JUNGLE_EDGE_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_jungle_edge_grass_block");
    public static final Block GLOWING_BADLANDS_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_badlands_grass_block");
    public static final Block GLOWING_SAVANNA_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_savanna_grass_block");
    public static final Block GLOWING_FOREST_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_forest_grass_block");
    public static final Block GLOWING_BIRCH_FOREST_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_birch_forest_grass_block");
    public static final Block GLOWING_DARK_FOREST_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_dark_forest_grass_block");
    public static final Block GLOWING_PLAINS_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_plains_grass_block");
    public static final Block GLOWING_SWAMP_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_swamp_grass_block");
    public static final Block GLOWING_LUSH_SWAMP_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_lush_swamp_grass_block");
    public static final Block GLOWING_MOUNTAINS_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_mountains_grass_block");
    public static final Block GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_mushroom_fields_grass_block");
    public static final Block GLOWING_TAIGA_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_taiga_grass_block");
    public static final Block GLOWING_MEGA_TAIGA_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_mega_taiga_grass_block");
    public static final Block GLOWING_SNOWY_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_snowy_grass_block");
    public static final Block GLOWING_SNOWY_BEACH_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_snowy_beach_grass_block");
    public static final Block GLOWING_WATERS_GRASS_BLOCK = createBlock(new ARFOGlowingGrassBlock(), "glowing_waters_grass_block");

    public static final Block GLOWING_CRIMSON_NYLIUM = createBlock(new ARFOGlowingGrassBlock(), "glowing_crimson_nylium");
    public static final Block GLOWING_WARPED_NYLIUM = createBlock(new ARFOGlowingGrassBlock(), "glowing_warped_nylium");

    public static final Block POTTED_JUNGLE_FERN = createPottedBlock(JUNGLE_FERN, "jungle_fern");
    public static final Block POTTED_JUNGLE_EDGE_FERN = createPottedBlock(JUNGLE_EDGE_FERN, "jungle_edge_fern");
    public static final Block POTTED_BADLANDS_FERN = createPottedBlock(BADLANDS_FERN, "badlands_fern");
    public static final Block POTTED_SAVANNA_FERN = createPottedBlock(SAVANNA_FERN, "savanna_fern");
    public static final Block POTTED_FOREST_FERN = createPottedBlock(FOREST_FERN, "forest_fern");
    public static final Block POTTED_BIRCH_FOREST_FERN = createPottedBlock(BIRCH_FOREST_FERN, "birch_forest_fern");
    public static final Block POTTED_DARK_FOREST_FERN = createPottedBlock(DARK_FOREST_FERN, "dark_forest_fern");
    public static final Block POTTED_PLAINS_FERN = createPottedBlock(PLAINS_FERN, "plains_fern");
    public static final Block POTTED_SWAMP_FERN = createPottedBlock(SWAMP_FERN, "swamp_fern");
    public static final Block POTTED_LUSH_SWAMP_FERN = createPottedBlock(LUSH_SWAMP_FERN, "lush_swamp_fern");
    public static final Block POTTED_MOUNTAINS_FERN = createPottedBlock(MOUNTAINS_FERN, "mountains_fern");
    public static final Block POTTED_MUSHROOM_FIELDS_FERN = createPottedBlock(MUSHROOM_FIELDS_FERN, "mushroom_fields_fern");
    public static final Block POTTED_TAIGA_FERN = createPottedBlock(TAIGA_FERN, "taiga_fern");
    public static final Block POTTED_MEGA_TAIGA_FERN = createPottedBlock(MEGA_TAIGA_FERN, "mega_taiga_fern");
    public static final Block POTTED_SNOWY_FERN = createPottedBlock(SNOWY_FERN, "snowy_fern");
    public static final Block POTTED_SNOWY_BEACH_FERN = createPottedBlock(SNOWY_BEACH_FERN, "snowy_beach_fern");
    public static final Block POTTED_WATERS_FERN = createPottedBlock(WATERS_FERN, "waters_fern");

    public static final Block COLD_OCEAN_WATER = createFluidBlock(ARFOFluids.STILL_COLD_OCEAN_WATER, "cold_ocean_water");
    public static final Block FROZEN_OCEAN_WATER = createFluidBlock(ARFOFluids.STILL_FROZEN_OCEAN_WATER, "frozen_ocean_water");
    public static final Block LUKEWARM_OCEAN_WATER = createFluidBlock(ARFOFluids.STILL_LUKEWARM_OCEAN_WATER, "lukewarm_ocean_water");
    public static final Block WARM_OCEAN_WATER = createFluidBlock(ARFOFluids.STILL_WARM_OCEAN_WATER, "warm_ocean_water");
    public static final Block SWAMP_WATER = createFluidBlock(ARFOFluids.STILL_SWAMP_WATER, "swamp_water");
    public static final Block OCEAN_WATER = createFluidBlock(ARFOFluids.STILL_OCEAN_WATER, "ocean_water");


    public static Block createPottedBlock(Block blockForPot, String id) {
        Block createBlock = new FlowerPotBlock(blockForPot, AbstractBlock.Properties.of(Material.DECORATION).instabreak().noOcclusion());
        createBlock.setRegistryName(new ResourceLocation(ArtificialFoliage.MODID, "potted_" + id));
        blocksList.add(createBlock);
        return createBlock;
    }

    public static Block createFluidBlock(FlowingFluid fluid, String id) {
        Block createBlock = new FlowingFluidBlock(fluid, AbstractBlock.Properties.of(Material.WATER));
        createBlock.setRegistryName(new ResourceLocation(ArtificialFoliage.MODID, id));
        blocksList.add(createBlock);
        return createBlock;
    }



    public static Block createBlock(Block block, String id) {
        block.setRegistryName(new ResourceLocation(ArtificialFoliage.MODID, id));
        blocksList.add(block);
        return block;
    }

    public static void init() {

    }


}
