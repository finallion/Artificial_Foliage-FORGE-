package com.finallion.arfo.utils;


import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Map;

public class BlockMapping {

    public static final Map<Block, Block> slabAndBlocks = new HashMap<Block, Block>() {
        {
            put(ARFOBlocks.JUNGLE_GRASS_BLOCK, ARFOBlocks.JUNGLE_GRASS_SLAB);
            put(ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB);
            put(ARFOBlocks.BADLANDS_GRASS_BLOCK, ARFOBlocks.BADLANDS_GRASS_SLAB);
            put(ARFOBlocks.SAVANNA_GRASS_BLOCK, ARFOBlocks.SAVANNA_GRASS_SLAB);
            put(ARFOBlocks.FOREST_GRASS_BLOCK, ARFOBlocks.FOREST_GRASS_SLAB);
            put(ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, ARFOBlocks.BIRCH_FOREST_GRASS_SLAB);
            put(ARFOBlocks.DARK_FOREST_GRASS_BLOCK, ARFOBlocks.DARK_FOREST_GRASS_SLAB);
            put(ARFOBlocks.PLAINS_GRASS_BLOCK, ARFOBlocks.PLAINS_GRASS_SLAB);
            put(ARFOBlocks.SWAMP_GRASS_BLOCK, ARFOBlocks.SWAMP_GRASS_SLAB);
            put(ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, ARFOBlocks.LUSH_SWAMP_GRASS_SLAB);
            put(ARFOBlocks.MOUNTAINS_GRASS_BLOCK, ARFOBlocks.MOUNTAINS_GRASS_SLAB);
            put(ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB);
            put(ARFOBlocks.TAIGA_GRASS_BLOCK, ARFOBlocks.TAIGA_GRASS_SLAB);
            put(ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, ARFOBlocks.MEGA_TAIGA_GRASS_SLAB);
            put(ARFOBlocks.SNOWY_GRASS_BLOCK, ARFOBlocks.SNOWY_GRASS_SLAB);
            put(ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, ARFOBlocks.SNOWY_BEACH_GRASS_SLAB);
            put(ARFOBlocks.WATERS_GRASS_BLOCK, ARFOBlocks.WATERS_GRASS_SLAB);

            put(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, TraverseBlocks.TRAVERSE_MEADOW_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_SLAB);
            put(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_SLAB);
        }
    };

    public static final Map<Block, Block> glowingBlocks = new HashMap<Block, Block>() {
        {
            put(ARFOBlocks.JUNGLE_GRASS_BLOCK, ARFOBlocks.GLOWING_JUNGLE_GRASS_BLOCK);
            put(ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, ARFOBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK);
            put(ARFOBlocks.BADLANDS_GRASS_BLOCK, ARFOBlocks.GLOWING_BADLANDS_GRASS_BLOCK);
            put(ARFOBlocks.SAVANNA_GRASS_BLOCK, ARFOBlocks.GLOWING_SAVANNA_GRASS_BLOCK);
            put(ARFOBlocks.FOREST_GRASS_BLOCK, ARFOBlocks.GLOWING_FOREST_GRASS_BLOCK);
            put(ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, ARFOBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK);
            put(ARFOBlocks.DARK_FOREST_GRASS_BLOCK, ARFOBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK);
            put(ARFOBlocks.PLAINS_GRASS_BLOCK, ARFOBlocks.GLOWING_PLAINS_GRASS_BLOCK);
            put(ARFOBlocks.SWAMP_GRASS_BLOCK, ARFOBlocks.GLOWING_SWAMP_GRASS_BLOCK);
            put(ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, ARFOBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK);
            put(ARFOBlocks.MOUNTAINS_GRASS_BLOCK, ARFOBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK);
            put(ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, ARFOBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK);
            put(ARFOBlocks.TAIGA_GRASS_BLOCK, ARFOBlocks.GLOWING_TAIGA_GRASS_BLOCK);
            put(ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, ARFOBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK);
            put(ARFOBlocks.SNOWY_GRASS_BLOCK, ARFOBlocks.GLOWING_SNOWY_GRASS_BLOCK);
            put(ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, ARFOBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK);
            put(ARFOBlocks.WATERS_GRASS_BLOCK, ARFOBlocks.GLOWING_WATERS_GRASS_BLOCK);

            put(TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK);
            put(TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK);
        }
    };


}
