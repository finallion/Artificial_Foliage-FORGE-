package com.finallion.arfo.client.textures;

import com.finallion.arfo.init.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class Renders {
    // renders for grass side overlay and opacity with leaves
    private static final RenderType GRASS_BLOCK_LAYER = RenderType.cutoutMipped();
    private static final RenderType LEAVE_BLOCK_LAYER = RenderType.translucent();
    private static final RenderType POTTED_BLOCK_LAYER = RenderType.cutout();


    public static void init() {
        RenderTypeLookup.setRenderLayer(ModBlocks.GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SPRUCE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_MUSHROOM_FIELDS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_MUSHROOM_FIELDS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_JUNGLE_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_JUNGLE_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_EDGE_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_EDGE_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_JUNGLE_EDGE_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_EDGE_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_JUNGLE_EDGE_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_EDGE_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.JUNGLE_EDGE_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_PLAINS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_PLAINS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.PLAINS_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_PLAINS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_FOREST_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_FOREST_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.FOREST_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_FOREST_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_BIRCH_FOREST_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_BIRCH_FOREST_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_WATERS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_WATERS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_WATERS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_WATERS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_WATERS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.WATERS_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_WATERS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_MEGA_TAIGA_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_MEGA_TAIGA_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_TAIGA_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_TAIGA_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TAIGA_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_TAIGA_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_MOUNTAINS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_MOUNTAINS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_SNOWY_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_SNOWY_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_SNOWY_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_SNOWY_BEACH_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_SNOWY_BEACH_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_DARK_FOREST_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_DARK_FOREST_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_LUSH_SWAMP_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_LUSH_SWAMP_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_SWAMP_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_SWAMP_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SWAMP_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_SWAMP_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_SAVANNA_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_SAVANNA_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.SAVANNA_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_GRASS_BLOCK, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_GRASS_SLAB, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.TALL_BADLANDS_GRASS, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.LARGE_BADLANDS_FERN, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_VINE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_SUGAR_CANE, GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_ACACIA_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_DARK_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_JUNGLE_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_OAK_LEAVES, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.BADLANDS_OAK_LEAVES_CARPET, LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK, GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_JUNGLE_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_JUNGLE_EDGE_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_MUSHROOM_FIELDS_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_FOREST_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_BADLANDS_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_SAVANNA_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_BIRCH_FOREST_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_DARK_FOREST_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_PLAINS_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_SWAMP_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_LUSH_SWAMP_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_MOUNTAINS_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_WATERS_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_TAIGA_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_MEGA_TAIGA_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_SNOWY_BEACH_FERN, POTTED_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(ModBlocks.POTTED_SNOWY_FERN, POTTED_BLOCK_LAYER);





    }
}
