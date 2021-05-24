package com.finallion.arfo.compat.Traverse;

import com.finallion.arfo.client.textures.Renders;
import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.init.ARFOFluids;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class TraverseRender {

    public static void init() {
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_RED_AUTUMNAL_LEAVES_CARPET, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ORANGE_AUTUMNAL_LEAVES_CARPET, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_YELLOW_AUTUMNAL_LEAVES_CARPET, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_BROWN_AUTUMNAL_LEAVES_CARPET, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_CLIFFS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_CLIFFS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_MEADOW_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_MEADOW_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_LUSH_SWAMP_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_LUSH_SWAMP_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_ROLLING_HILLS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_ROLLING_HILLS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_WOODED_ISLAND_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_WOODED_ISLAND_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);

        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_SLAB, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TALL_TRAVERSE_WOODLANDS_GRASS, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.LARGE_TRAVERSE_WOODLANDS_FERN, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_VINE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_SUGAR_CANE, Renders.GRASS_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET, Renders.LEAVE_BLOCK_LAYER);
        RenderTypeLookup.setRenderLayer(TraverseBlocks.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK, Renders.GRASS_BLOCK_LAYER);




        RenderTypeLookup.setRenderLayer(TraverseFluids.STILL_TRAVERSE_CLIFFS_WATER, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(TraverseFluids.FLOWING_TRAVERSE_CLIFFS_WATER, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(TraverseFluids.STILL_TRAVERSE_LUSH_SWAMP_WATER, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(TraverseFluids.FLOWING_TRAVERSE_LUSH_SWAMP_WATER, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(TraverseFluids.STILL_TRAVERSE_MINI_JUNGLE_WATER, RenderType.translucent());
        RenderTypeLookup.setRenderLayer(TraverseFluids.FLOWING_TRAVERSE_MINI_JUNGLE_WATER, RenderType.translucent());


    }
}
