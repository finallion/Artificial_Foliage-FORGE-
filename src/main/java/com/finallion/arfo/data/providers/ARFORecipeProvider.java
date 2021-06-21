package com.finallion.arfo.data.providers;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.compat.BOP.BOPBlocks;
import com.finallion.arfo.compat.BOP.BOPItems;
import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.compat.BYG.BYGItems;
import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.compat.Traverse.TraverseItems;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOItems;
import com.finallion.arfo.tags.ARFOItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ARFORecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ARFORecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        // leaves
        baseBlock(consumer, ARFOBlocks.BADLANDS_ACACIA_LEAVES, "badlands_acacia_leaves", ARFOItems.BADLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.SAVANNA_ACACIA_LEAVES, "savanna_acacia_leaves", ARFOItems.SAVANNA_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_ACACIA_LEAVES, "tropical_acacia_leaves", ARFOItems.JUNGLE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES, "tropical_edge_acacia_leaves", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.FOREST_ACACIA_LEAVES, "forest_acacia_leaves", ARFOItems.FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES, "birch_forest_acacia_leaves", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.DARK_FOREST_ACACIA_LEAVES, "dark_forest_acacia_leaves", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.PLAINS_ACACIA_LEAVES, "plains_acacia_leaves", ARFOItems.PLAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.SWAMP_ACACIA_LEAVES, "swamp_acacia_leaves", ARFOItems.SWAMP_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES, "lush_swamp_acacia_leaves", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.MOUNTAINS_ACACIA_LEAVES, "mountains_acacia_leaves", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES, "mushroom_fields_acacia_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.TAIGA_ACACIA_LEAVES, "taiga_acacia_leaves", ARFOItems.TAIGA_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES, "mega_taiga_acacia_leaves", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_ACACIA_LEAVES, "snowy_acacia_leaves", ARFOItems.SNOWY_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES, "snowy_beach_acacia_leaves", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlock(consumer, ARFOBlocks.WATERS_ACACIA_LEAVES, "waters_acacia_leaves", ARFOItems.WATERS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        slabBlock(consumer, ARFOBlocks.BADLANDS_ACACIA_LEAVES_CARPET, "badlands_acacia_leaves_carpet", ARFOBlocks.BADLANDS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SAVANNA_ACACIA_LEAVES_CARPET, "savanna_acacia_leaves_carpet", ARFOBlocks.SAVANNA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_ACACIA_LEAVES_CARPET, "tropical_acacia_leaves_carpet", ARFOBlocks.TROPICAL_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET, "tropical_edge_acacia_leaves_carpet", ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.FOREST_ACACIA_LEAVES_CARPET, "forest_acacia_leaves_carpet", ARFOBlocks.FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET, "birch_forest_acacia_leaves_carpet", ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET, "dark_forest_acacia_leaves_carpet", ARFOBlocks.DARK_FOREST_ACACIA_LEAVES,  "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.PLAINS_ACACIA_LEAVES_CARPET, "plains_acacia_leaves_carpet", ARFOBlocks.PLAINS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SWAMP_ACACIA_LEAVES_CARPET, "swamp_acacia_leaves_carpet", ARFOBlocks.SWAMP_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET, "lush_swamp_acacia_leaves_carpet", ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES,"acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET, "mountains_acacia_leaves_carpet", ARFOBlocks.MOUNTAINS_ACACIA_LEAVES,"acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET, "mushroom_fields_acacia_leaves_carpet", ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES,"acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TAIGA_ACACIA_LEAVES_CARPET, "taiga_acacia_leaves_carpet", ARFOBlocks.TAIGA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET, "mega_taiga_acacia_leaves_carpet", ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_ACACIA_LEAVES_CARPET, "snowy_acacia_leaves_carpet", ARFOBlocks.SNOWY_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET, "snowy_beach_acacia_leaves_carpet", ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.WATERS_ACACIA_LEAVES_CARPET, "waters_acacia_leaves_carpet", ARFOBlocks.WATERS_ACACIA_LEAVES, "acacia_leaves_carpet");

        baseBlock(consumer, ARFOBlocks.BADLANDS_OAK_LEAVES, "badlands_oak_leaves", ARFOItems.BADLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.SAVANNA_OAK_LEAVES, "savanna_oak_leaves", ARFOItems.SAVANNA_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_OAK_LEAVES, "tropical_oak_leaves", ARFOItems.JUNGLE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES, "tropical_edge_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.FOREST_OAK_LEAVES, "forest_oak_leaves", ARFOItems.FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.BIRCH_FOREST_OAK_LEAVES, "birch_forest_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.DARK_FOREST_OAK_LEAVES, "dark_forest_oak_leaves", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.PLAINS_OAK_LEAVES, "plains_oak_leaves", ARFOItems.PLAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.SWAMP_OAK_LEAVES, "swamp_oak_leaves", ARFOItems.SWAMP_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.LUSH_SWAMP_OAK_LEAVES, "lush_swamp_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.MOUNTAINS_OAK_LEAVES, "mountains_oak_leaves", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES, "mushroom_fields_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.TAIGA_OAK_LEAVES, "taiga_oak_leaves", ARFOItems.TAIGA_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.MEGA_TAIGA_OAK_LEAVES, "mega_taiga_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_OAK_LEAVES, "snowy_oak_leaves", ARFOItems.SNOWY_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_BEACH_OAK_LEAVES, "snowy_beach_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlock(consumer, ARFOBlocks.WATERS_OAK_LEAVES, "waters_oak_leaves", ARFOItems.WATERS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        slabBlock(consumer, ARFOBlocks.BADLANDS_OAK_LEAVES_CARPET, "badlands_oak_leaves_carpet", ARFOBlocks.BADLANDS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SAVANNA_OAK_LEAVES_CARPET, "savanna_oak_leaves_carpet", ARFOBlocks.SAVANNA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_OAK_LEAVES_CARPET, "tropical_oak_leaves_carpet", ARFOBlocks.TROPICAL_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET, "tropical_edge_oak_leaves_carpet", ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.FOREST_OAK_LEAVES_CARPET, "forest_oak_leaves_carpet", ARFOBlocks.FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET, "birch_forest_oak_leaves_carpet", ARFOBlocks.BIRCH_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_OAK_LEAVES_CARPET, "dark_forest_oak_leaves_carpet", ARFOBlocks.DARK_FOREST_OAK_LEAVES,  "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.PLAINS_OAK_LEAVES_CARPET, "plains_oak_leaves_carpet", ARFOBlocks.PLAINS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SWAMP_OAK_LEAVES_CARPET, "swamp_oak_leaves_carpet", ARFOBlocks.SWAMP_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET, "lush_swamp_oak_leaves_carpet", ARFOBlocks.LUSH_SWAMP_OAK_LEAVES,"oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_OAK_LEAVES_CARPET, "mountains_oak_leaves_carpet", ARFOBlocks.MOUNTAINS_OAK_LEAVES,"oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET, "mushroom_fields_oak_leaves_carpet", ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES,"oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TAIGA_OAK_LEAVES_CARPET, "taiga_oak_leaves_carpet", ARFOBlocks.TAIGA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET, "mega_taiga_oak_leaves_carpet", ARFOBlocks.MEGA_TAIGA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_OAK_LEAVES_CARPET, "snowy_oak_leaves_carpet", ARFOBlocks.SNOWY_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET, "snowy_beach_oak_leaves_carpet", ARFOBlocks.SNOWY_BEACH_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.WATERS_OAK_LEAVES_CARPET, "waters_oak_leaves_carpet", ARFOBlocks.WATERS_OAK_LEAVES, "oak_leaves_carpet");

        baseBlock(consumer, ARFOBlocks.BADLANDS_DARK_OAK_LEAVES, "badlands_dark_oak_leaves", ARFOItems.BADLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.SAVANNA_DARK_OAK_LEAVES, "savanna_dark_oak_leaves", ARFOItems.SAVANNA_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_DARK_OAK_LEAVES, "tropical_dark_oak_leaves", ARFOItems.JUNGLE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES, "tropical_edge_dark_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.FOREST_DARK_OAK_LEAVES, "forest_dark_oak_leaves", ARFOItems.FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES, "birch_forest_dark_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES, "dark_forest_dark_oak_leaves", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.PLAINS_DARK_OAK_LEAVES, "plains_dark_oak_leaves", ARFOItems.PLAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.SWAMP_DARK_OAK_LEAVES, "swamp_dark_oak_leaves", ARFOItems.SWAMP_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES, "lush_swamp_dark_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES, "mountains_dark_oak_leaves", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES, "mushroom_fields_dark_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.TAIGA_DARK_OAK_LEAVES, "taiga_dark_oak_leaves", ARFOItems.TAIGA_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES, "mega_taiga_dark_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_DARK_OAK_LEAVES, "snowy_dark_oak_leaves", ARFOItems.SNOWY_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES, "snowy_beach_dark_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlock(consumer, ARFOBlocks.WATERS_DARK_OAK_LEAVES, "waters_dark_oak_leaves", ARFOItems.WATERS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        slabBlock(consumer, ARFOBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET, "badlands_dark_oak_leaves_carpet", ARFOBlocks.BADLANDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET, "savanna_dark_oak_leaves_carpet", ARFOBlocks.SAVANNA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET, "tropical_dark_oak_leaves_carpet", ARFOBlocks.TROPICAL_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET, "tropical_edge_dark_oak_leaves_carpet", ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.FOREST_DARK_OAK_LEAVES_CARPET, "forest_dark_oak_leaves_carpet", ARFOBlocks.FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET, "birch_forest_dark_oak_leaves_carpet", ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET, "dark_forest_dark_oak_leaves_carpet", ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES,  "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.PLAINS_DARK_OAK_LEAVES_CARPET, "plains_dark_oak_leaves_carpet", ARFOBlocks.PLAINS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SWAMP_DARK_OAK_LEAVES_CARPET, "swamp_dark_oak_leaves_carpet", ARFOBlocks.SWAMP_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, "lush_swamp_dark_oak_leaves_carpet", ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES,"dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET, "mountains_dark_oak_leaves_carpet", ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES,"dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET, "mushroom_fields_dark_oak_leaves_carpet", ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES,"dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TAIGA_DARK_OAK_LEAVES_CARPET, "taiga_dark_oak_leaves_carpet", ARFOBlocks.TAIGA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET, "mega_taiga_dark_oak_leaves_carpet", ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_DARK_OAK_LEAVES_CARPET, "snowy_dark_oak_leaves_carpet", ARFOBlocks.SNOWY_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET, "snowy_beach_dark_oak_leaves_carpet", ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.WATERS_DARK_OAK_LEAVES_CARPET, "waters_dark_oak_leaves_carpet", ARFOBlocks.WATERS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");

        baseBlock(consumer, ARFOBlocks.BADLANDS_JUNGLE_LEAVES, "badlands_jungle_leaves", ARFOItems.BADLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.SAVANNA_JUNGLE_LEAVES, "savanna_jungle_leaves", ARFOItems.SAVANNA_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_JUNGLE_LEAVES, "tropical_jungle_leaves", ARFOItems.JUNGLE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES, "tropical_edge_jungle_leaves", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.FOREST_JUNGLE_LEAVES, "forest_jungle_leaves", ARFOItems.FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES, "birch_forest_jungle_leaves", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES, "dark_forest_jungle_leaves", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.PLAINS_JUNGLE_LEAVES, "plains_jungle_leaves", ARFOItems.PLAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.SWAMP_JUNGLE_LEAVES, "swamp_jungle_leaves", ARFOItems.SWAMP_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES, "lush_swamp_jungle_leaves", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES, "mountains_jungle_leaves", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES, "mushroom_fields_jungle_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.TAIGA_JUNGLE_LEAVES, "taiga_jungle_leaves", ARFOItems.TAIGA_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES, "mega_taiga_jungle_leaves", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_JUNGLE_LEAVES, "snowy_jungle_leaves", ARFOItems.SNOWY_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES, "snowy_beach_jungle_leaves", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlock(consumer, ARFOBlocks.WATERS_JUNGLE_LEAVES, "waters_jungle_leaves", ARFOItems.WATERS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        slabBlock(consumer, ARFOBlocks.BADLANDS_JUNGLE_LEAVES_CARPET, "badlands_jungle_leaves_carpet", ARFOBlocks.BADLANDS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SAVANNA_JUNGLE_LEAVES_CARPET, "savanna_jungle_leaves_carpet", ARFOBlocks.SAVANNA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_JUNGLE_LEAVES_CARPET, "tropical_jungle_leaves_carpet", ARFOBlocks.TROPICAL_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET, "tropical_edge_jungle_leaves_carpet", ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.FOREST_JUNGLE_LEAVES_CARPET, "forest_jungle_leaves_carpet", ARFOBlocks.FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET, "birch_forest_jungle_leaves_carpet", ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET, "dark_forest_jungle_leaves_carpet", ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES,  "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.PLAINS_JUNGLE_LEAVES_CARPET, "plains_jungle_leaves_carpet", ARFOBlocks.PLAINS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SWAMP_JUNGLE_LEAVES_CARPET, "swamp_jungle_leaves_carpet", ARFOBlocks.SWAMP_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET, "lush_swamp_jungle_leaves_carpet", ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES,"jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET, "mountains_jungle_leaves_carpet", ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES,"jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET, "mushroom_fields_jungle_leaves_carpet", ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES,"jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.TAIGA_JUNGLE_LEAVES_CARPET, "taiga_jungle_leaves_carpet", ARFOBlocks.TAIGA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET, "mega_taiga_jungle_leaves_carpet", ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_JUNGLE_LEAVES_CARPET, "snowy_jungle_leaves_carpet", ARFOBlocks.SNOWY_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET, "snowy_beach_jungle_leaves_carpet", ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, ARFOBlocks.WATERS_JUNGLE_LEAVES_CARPET, "waters_jungle_leaves_carpet", ARFOBlocks.WATERS_JUNGLE_LEAVES, "jungle_leaves_carpet");

        // grass blocks
        baseBlock(consumer, ARFOBlocks.BADLANDS_GRASS_BLOCK, "badlands_grass_block", ARFOItems.BADLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.SAVANNA_GRASS_BLOCK, "savanna_grass_block", ARFOItems.SAVANNA_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.JUNGLE_GRASS_BLOCK, "tropical_grass_block", ARFOItems.JUNGLE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, "tropical_edge_grass_block", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.FOREST_GRASS_BLOCK, "forest_grass_block", ARFOItems.FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, "birch_forest_grass_block", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.DARK_FOREST_GRASS_BLOCK, "dark_forest_grass_block", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.PLAINS_GRASS_BLOCK, "plains_grass_block", ARFOItems.PLAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.SWAMP_GRASS_BLOCK, "swamp_grass_block", ARFOItems.SWAMP_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, "lush_swamp_grass_block", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.MOUNTAINS_GRASS_BLOCK, "mountains_grass_block", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, "mushroom_fields_grass_block", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.TAIGA_GRASS_BLOCK, "taiga_grass_block", ARFOItems.TAIGA_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, "mega_taiga_grass_block", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.SNOWY_GRASS_BLOCK, "snowy_grass_block", ARFOItems.SNOWY_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, "snowy_beach_grass_block", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlock(consumer, ARFOBlocks.WATERS_GRASS_BLOCK, "waters_grass_block", ARFOItems.WATERS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");

        // glowing grass block
        glowBlock(consumer, ARFOBlocks.GLOWING_BADLANDS_GRASS_BLOCK, "glowing_badlands_grass_block", ARFOBlocks.BADLANDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_SAVANNA_GRASS_BLOCK, "glowing_savanna_grass_block", ARFOBlocks.SAVANNA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_JUNGLE_GRASS_BLOCK, "glowing_tropical_grass_block", ARFOBlocks.JUNGLE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK, "glowing_tropical_edge_grass_block", ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_FOREST_GRASS_BLOCK, "glowing_forest_grass_block", ARFOBlocks.FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK, "glowing_birch_forest_grass_block", ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK, "glowing_dark_forest_grass_block", ARFOBlocks.DARK_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_PLAINS_GRASS_BLOCK, "glowing_plains_grass_block", ARFOBlocks.PLAINS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_SWAMP_GRASS_BLOCK, "glowing_swamp_grass_block", ARFOBlocks.SWAMP_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK, "glowing_lush_swamp_grass_block", ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK, "glowing_mountains_grass_block", ARFOBlocks.MOUNTAINS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK, "glowing_mushroom_fields_grass_block", ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_TAIGA_GRASS_BLOCK, "glowing_taiga_grass_block", ARFOBlocks.TAIGA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK, "glowing_mega_taiga_grass_block", ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_SNOWY_GRASS_BLOCK, "glowing_snowy_grass_block", ARFOBlocks.SNOWY_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK, "glowing_snowy_beach_grass_block", ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_WATERS_GRASS_BLOCK, "glowing_waters_grass_block", ARFOBlocks.WATERS_GRASS_BLOCK, "glowing_grass_blocks");

        // slabs
        slabBlock(consumer, ARFOBlocks.BADLANDS_GRASS_SLAB, "badlands_grass_slabs", ARFOBlocks.BADLANDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SAVANNA_GRASS_SLAB, "savanna_grass_slabs", ARFOBlocks.SAVANNA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_GRASS_SLAB, "tropical_grass_slabs", ARFOBlocks.JUNGLE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB, "tropical_edge_grass_slabs", ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.FOREST_GRASS_SLAB, "forest_grass_slabs", ARFOBlocks.FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_GRASS_SLAB, "birch_forest_grass_slabs", ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_GRASS_SLAB, "dark_forest_grass_slabs", ARFOBlocks.DARK_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.PLAINS_GRASS_SLAB, "plains_grass_slabs", ARFOBlocks.PLAINS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SWAMP_GRASS_SLAB, "swamp_grass_slabs", ARFOBlocks.SWAMP_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_GRASS_SLAB, "lush_swamp_grass_slabs", ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_GRASS_SLAB, "mountains_grass_slabs", ARFOBlocks.MOUNTAINS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB, "mushroom_fields_grass_slabs", ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.TAIGA_GRASS_SLAB, "taiga_grass_slabs", ARFOBlocks.TAIGA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_GRASS_SLAB, "mega_taiga_grass_slabs", ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_GRASS_SLAB, "snowy_grass_slabs", ARFOBlocks.SNOWY_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_GRASS_SLAB, "snowy_beach_grass_slabs", ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, ARFOBlocks.WATERS_GRASS_SLAB, "waters_grass_slabs", ARFOBlocks.WATERS_GRASS_BLOCK, "grass_slab_blocks");

        // grass and ferns
        plantBlock(consumer, ARFOBlocks.BADLANDS_GRASS, "badlands_grass", ARFOItems.BADLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.SAVANNA_GRASS, "savanna_grass", ARFOItems.SAVANNA_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.JUNGLE_GRASS, "tropical_grass", ARFOItems.JUNGLE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.JUNGLE_EDGE_GRASS, "tropical_edge_grass", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.FOREST_GRASS, "forest_grass", ARFOItems.FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.BIRCH_FOREST_GRASS, "birch_forest_grass", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.DARK_FOREST_GRASS, "dark_forest_grass", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.PLAINS_GRASS, "plains_grass", ARFOItems.PLAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.SWAMP_GRASS, "swamp_grass", ARFOItems.SWAMP_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.LUSH_SWAMP_GRASS, "lush_swamp_grass", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.MOUNTAINS_GRASS, "mountains_grass", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_GRASS, "mushroom_fields_grass", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.TAIGA_GRASS, "taiga_grass", ARFOItems.TAIGA_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.MEGA_TAIGA_GRASS, "mega_taiga_grass", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.SNOWY_GRASS, "snowy_grass", ARFOItems.SNOWY_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.SNOWY_BEACH_GRASS, "snowy_beach_grass", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.GRASS, "grass");
        plantBlock(consumer, ARFOBlocks.WATERS_GRASS, "waters_grass", ARFOItems.WATERS_DYE, ARFOItemTags.GRASS, "grass");

        plantBlock(consumer, ARFOBlocks.TALL_BADLANDS_GRASS, "tall_badlands_grass", ARFOItems.BADLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_SAVANNA_GRASS, "tall_savanna_grass", ARFOItems.SAVANNA_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_JUNGLE_GRASS, "tall_tropical_grass", ARFOItems.JUNGLE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_JUNGLE_EDGE_GRASS, "tall_tropical_edge_grass", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_FOREST_GRASS, "tall_forest_grass", ARFOItems.FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_BIRCH_FOREST_GRASS, "tall_birch_forest_grass", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_DARK_FOREST_GRASS, "tall_dark_forest_grass", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_PLAINS_GRASS, "tall_plains_grass", ARFOItems.PLAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_SWAMP_GRASS, "tall_swamp_grass", ARFOItems.SWAMP_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_LUSH_SWAMP_GRASS, "tall_lush_swamp_grass", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_MOUNTAINS_GRASS, "tall_mountains_grass", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS, "tall_mushroom_fields_grass", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_TAIGA_GRASS, "tall_taiga_grass", ARFOItems.TAIGA_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_MEGA_TAIGA_GRASS, "tall_mega_taiga_grass", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_SNOWY_GRASS, "tall_snowy_grass", ARFOItems.SNOWY_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_SNOWY_BEACH_GRASS, "tall_snowy_beach_grass", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlock(consumer, ARFOBlocks.TALL_WATERS_GRASS, "tall_waters_grass", ARFOItems.WATERS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");

        plantBlock(consumer, ARFOBlocks.BADLANDS_FERN, "badlands_fern", ARFOItems.BADLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.SAVANNA_FERN, "savanna_fern", ARFOItems.SAVANNA_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.JUNGLE_FERN, "tropical_fern", ARFOItems.JUNGLE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.JUNGLE_EDGE_FERN, "tropical_edge_fern", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.FOREST_FERN, "forest_fern", ARFOItems.FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.BIRCH_FOREST_FERN, "birch_forest_fern", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.DARK_FOREST_FERN, "dark_forest_fern", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.PLAINS_FERN, "plains_fern", ARFOItems.PLAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.SWAMP_FERN, "swamp_fern", ARFOItems.SWAMP_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.LUSH_SWAMP_FERN, "lush_swamp_fern", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.MOUNTAINS_FERN, "mountains_fern", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_FERN, "mushroom_fields_fern", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.TAIGA_FERN, "taiga_fern", ARFOItems.TAIGA_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.MEGA_TAIGA_FERN, "mega_taiga_fern", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.SNOWY_FERN, "snowy_fern", ARFOItems.SNOWY_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.SNOWY_BEACH_FERN, "snowy_beach_fern", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlock(consumer, ARFOBlocks.WATERS_FERN, "waters_fern", ARFOItems.WATERS_DYE, ARFOItemTags.FERNS, "ferns");

        plantBlock(consumer, ARFOBlocks.LARGE_BADLANDS_FERN, "tall_badlands_fern", ARFOItems.BADLANDS_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_SAVANNA_FERN, "tall_savanna_fern", ARFOItems.SAVANNA_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_JUNGLE_FERN, "tall_tropical_fern", ARFOItems.JUNGLE_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_JUNGLE_EDGE_FERN, "tall_tropical_edge_fern", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_FOREST_FERN, "tall_forest_fern", ARFOItems.FOREST_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_BIRCH_FOREST_FERN, "tall_birch_forest_fern", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_DARK_FOREST_FERN, "tall_dark_forest_fern", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_PLAINS_FERN, "tall_plains_fern", ARFOItems.PLAINS_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_SWAMP_FERN, "tall_swamp_fern", ARFOItems.SWAMP_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_LUSH_SWAMP_FERN, "tall_lush_swamp_fern", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_MOUNTAINS_FERN, "tall_mountains_fern", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN, "tall_mushroom_fields_fern", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_TAIGA_FERN, "tall_taiga_fern", ARFOItems.TAIGA_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_MEGA_TAIGA_FERN, "tall_mega_taiga_fern", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_SNOWY_FERN, "tall_snowy_fern", ARFOItems.SNOWY_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_SNOWY_BEACH_FERN, "tall_snowy_beach_fern", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");
        plantBlock(consumer, ARFOBlocks.LARGE_WATERS_FERN, "tall_waters_fern", ARFOItems.WATERS_DYE, ARFOItemTags.LARGE_FERNS, "tall_ferns");

        // vines
        plantBlock(consumer, ARFOBlocks.BADLANDS_VINE, "badlands_vine", ARFOItems.BADLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.SAVANNA_VINE, "savanna_vine", ARFOItems.SAVANNA_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.JUNGLE_VINE, "tropical_vine", ARFOItems.JUNGLE_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.JUNGLE_EDGE_VINE, "tropical_edge_vine", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.FOREST_VINE, "forest_vine", ARFOItems.FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.BIRCH_FOREST_VINE, "birch_forest_vine", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.DARK_FOREST_VINE, "dark_forest_vine", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.PLAINS_VINE, "plains_vine", ARFOItems.PLAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.SWAMP_VINE, "swamp_vine", ARFOItems.SWAMP_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.LUSH_SWAMP_VINE, "lush_swamp_vine", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.MOUNTAINS_VINE, "mountains_vine", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_VINE, "mushroom_fields_vine", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.TAIGA_VINE, "taiga_vine", ARFOItems.TAIGA_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.MEGA_TAIGA_VINE, "mega_taiga_vine", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.SNOWY_VINE, "snowy_vine", ARFOItems.SNOWY_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.SNOWY_BEACH_VINE, "snowy_beach_vine", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.VINES, "vines");
        plantBlock(consumer, ARFOBlocks.WATERS_VINE, "waters_vine", ARFOItems.WATERS_DYE, ARFOItemTags.VINES, "vines");

        // sugar cane
        plantBlock(consumer, ARFOBlocks.BADLANDS_SUGAR_CANE, "badlands_sugar_cane", ARFOItems.BADLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.SAVANNA_SUGAR_CANE, "savanna_sugar_cane", ARFOItems.SAVANNA_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.JUNGLE_SUGAR_CANE, "tropical_sugar_cane", ARFOItems.JUNGLE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.JUNGLE_EDGE_SUGAR_CANE, "tropical_edge_sugar_cane", ARFOItems.JUNGLE_EDGE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.FOREST_SUGAR_CANE, "forest_sugar_cane", ARFOItems.FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.BIRCH_FOREST_SUGAR_CANE, "birch_forest_sugar_cane", ARFOItems.BIRCH_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.DARK_FOREST_SUGAR_CANE, "dark_forest_sugar_cane", ARFOItems.DARK_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.PLAINS_SUGAR_CANE, "plains_sugar_cane", ARFOItems.PLAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.SWAMP_SUGAR_CANE, "swamp_sugar_cane", ARFOItems.SWAMP_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.LUSH_SWAMP_SUGAR_CANE, "lush_swamp_sugar_cane", ARFOItems.LUSH_SWAMP_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.MOUNTAINS_SUGAR_CANE, "mountains_sugar_cane", ARFOItems.MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_SUGAR_CANE, "mushroom_fields_sugar_cane", ARFOItems.MUSHROOM_FIELDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.TAIGA_SUGAR_CANE, "taiga_sugar_cane", ARFOItems.TAIGA_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.MEGA_TAIGA_SUGAR_CANE, "mega_taiga_sugar_cane", ARFOItems.MEGA_TAIGA_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.SNOWY_SUGAR_CANE, "snowy_sugar_cane", ARFOItems.SNOWY_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.SNOWY_BEACH_SUGAR_CANE, "snowy_beach_sugar_cane", ARFOItems.SNOWY_BEACH_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlock(consumer, ARFOBlocks.WATERS_SUGAR_CANE, "waters_sugar_cane", ARFOItems.WATERS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");


        overgrownBaseBlock(consumer, ARFOBlocks.BADLANDS_OVERGROWN_STONE, "badlands_overgrown_stone", ARFOItems.BADLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.SAVANNA_OVERGROWN_STONE, "savanna_overgrown_stone", ARFOItems.SAVANNA_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.JUNGLE_OVERGROWN_STONE, "tropical_overgrown_stone", ARFOItems.JUNGLE_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE, "tropical_edge_overgrown_stone", ARFOItems.JUNGLE_EDGE_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.FOREST_OVERGROWN_STONE, "forest_overgrown_stone", ARFOItems.FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE, "birch_forest_overgrown_stone", ARFOItems.BIRCH_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.DARK_FOREST_OVERGROWN_STONE, "dark_forest_overgrown_stone", ARFOItems.DARK_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.PLAINS_OVERGROWN_STONE, "plains_overgrown_stone", ARFOItems.PLAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.SWAMP_OVERGROWN_STONE, "swamp_overgrown_stone", ARFOItems.SWAMP_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE, "lush_swamp_overgrown_stone", ARFOItems.LUSH_SWAMP_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.MOUNTAINS_OVERGROWN_STONE, "mountains_overgrown_stone", ARFOItems.MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE, "mushroom_fields_overgrown_stone", ARFOItems.MUSHROOM_FIELDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.TAIGA_OVERGROWN_STONE, "taiga_overgrown_stone", ARFOItems.TAIGA_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE, "mega_taiga_overgrown_stone", ARFOItems.MEGA_TAIGA_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.SNOWY_OVERGROWN_STONE, "snowy_overgrown_stone", ARFOItems.SNOWY_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE, "snowy_beach_overgrown_stone", ARFOItems.SNOWY_BEACH_DYE, Items.STONE, "overgrown_stone");
        overgrownBaseBlock(consumer, ARFOBlocks.WATERS_OVERGROWN_STONE, "waters_overgrown_stone", ARFOItems.WATERS_DYE, Items.STONE, "overgrown_stone");
        slabBlock(consumer, ARFOBlocks.BADLANDS_OVERGROWN_STONE_SLAB, "badlands_overgrown_stone_slab", ARFOBlocks.BADLANDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SAVANNA_OVERGROWN_STONE_SLAB, "savanna_overgrown_stone_slab", ARFOBlocks.SAVANNA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_OVERGROWN_STONE_SLAB, "tropical_overgrown_stone_slab", ARFOBlocks.JUNGLE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE_SLAB, "tropical_edge_overgrown_stone_slab", ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.FOREST_OVERGROWN_STONE_SLAB, "forest_overgrown_stone_slab", ARFOBlocks.FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE_SLAB, "birch_forest_overgrown_stone_slab", ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_OVERGROWN_STONE_SLAB, "dark_forest_overgrown_stone_slab", ARFOBlocks.DARK_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.PLAINS_OVERGROWN_STONE_SLAB, "plains_overgrown_stone_slab", ARFOBlocks.PLAINS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SWAMP_OVERGROWN_STONE_SLAB, "swamp_overgrown_stone_slab", ARFOBlocks.SWAMP_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE_SLAB, "lush_swamp_overgrown_stone_slab", ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_OVERGROWN_STONE_SLAB, "mountains_overgrown_stone_slab", ARFOBlocks.MOUNTAINS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE_SLAB, "mushroom_fields_overgrown_stone_slab", ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.TAIGA_OVERGROWN_STONE_SLAB, "taiga_overgrown_stone_slab", ARFOBlocks.TAIGA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE_SLAB, "mega_taiga_overgrown_stone_slab", ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_OVERGROWN_STONE_SLAB, "snowy_overgrown_stone_slab", ARFOBlocks.SNOWY_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE_SLAB, "snowy_beach_overgrown_stone_slab", ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, ARFOBlocks.WATERS_OVERGROWN_STONE_SLAB, "waters_overgrown_stone_slab", ARFOBlocks.WATERS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");

        overgrownBaseBlock(consumer, ARFOBlocks.BADLANDS_OVERGROWN_DACITE, "badlands_overgrown_dacite", ARFOItems.BADLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.SAVANNA_OVERGROWN_DACITE, "savanna_overgrown_dacite", ARFOItems.SAVANNA_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.JUNGLE_OVERGROWN_DACITE, "tropical_overgrown_dacite", ARFOItems.JUNGLE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE, "tropical_edge_overgrown_dacite", ARFOItems.JUNGLE_EDGE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.FOREST_OVERGROWN_DACITE, "forest_overgrown_dacite", ARFOItems.FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE, "birch_forest_overgrown_dacite", ARFOItems.BIRCH_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE, "dark_forest_overgrown_dacite", ARFOItems.DARK_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.PLAINS_OVERGROWN_DACITE, "plains_overgrown_dacite", ARFOItems.PLAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.SWAMP_OVERGROWN_DACITE, "swamp_overgrown_dacite", ARFOItems.SWAMP_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE, "lush_swamp_overgrown_dacite", ARFOItems.LUSH_SWAMP_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE, "mountains_overgrown_dacite", ARFOItems.MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE, "mushroom_fields_overgrown_dacite", ARFOItems.MUSHROOM_FIELDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.TAIGA_OVERGROWN_DACITE, "taiga_overgrown_dacite", ARFOItems.TAIGA_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE, "mega_taiga_overgrown_dacite", ARFOItems.MEGA_TAIGA_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.SNOWY_OVERGROWN_DACITE, "snowy_overgrown_dacite", ARFOItems.SNOWY_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE, "snowy_beach_overgrown_dacite", ARFOItems.SNOWY_BEACH_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBaseBlock(consumer, ARFOBlocks.WATERS_OVERGROWN_DACITE, "waters_overgrown_dacite", ARFOItems.WATERS_DYE, Items.DIORITE, "overgrown_dacite");
        slabBlock(consumer, ARFOBlocks.BADLANDS_OVERGROWN_DACITE_SLAB, "badlands_overgrown_dacite_slab", ARFOBlocks.BADLANDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SAVANNA_OVERGROWN_DACITE_SLAB, "savanna_overgrown_dacite_slab", ARFOBlocks.SAVANNA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_OVERGROWN_DACITE_SLAB, "tropical_overgrown_dacite_slab", ARFOBlocks.JUNGLE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE_SLAB, "tropical_edge_overgrown_dacite_slab", ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.FOREST_OVERGROWN_DACITE_SLAB, "forest_overgrown_dacite_slab", ARFOBlocks.FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE_SLAB, "birch_forest_overgrown_dacite_slab", ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE_SLAB, "dark_forest_overgrown_dacite_slab", ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.PLAINS_OVERGROWN_DACITE_SLAB, "plains_overgrown_dacite_slab", ARFOBlocks.PLAINS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SWAMP_OVERGROWN_DACITE_SLAB, "swamp_overgrown_dacite_slab", ARFOBlocks.SWAMP_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE_SLAB, "lush_swamp_overgrown_dacite_slab", ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE_SLAB, "mountains_overgrown_dacite_slab", ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE_SLAB, "mushroom_fields_overgrown_dacite_slab", ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.TAIGA_OVERGROWN_DACITE_SLAB, "taiga_overgrown_dacite_slab", ARFOBlocks.TAIGA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE_SLAB, "mega_taiga_overgrown_dacite_slab", ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_OVERGROWN_DACITE_SLAB, "snowy_overgrown_dacite_slab", ARFOBlocks.SNOWY_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE_SLAB, "snowy_beach_overgrown_dacite_slab", ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, ARFOBlocks.WATERS_OVERGROWN_DACITE_SLAB, "waters_overgrown_dacite_slab", ARFOBlocks.WATERS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");

        overgrownBaseBlock(consumer, ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK, "badlands_overgrown_netherrack", ARFOItems.BADLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK, "savanna_overgrown_netherrack", ARFOItems.SAVANNA_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK, "tropical_overgrown_netherrack", ARFOItems.JUNGLE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK, "tropical_edge_overgrown_netherrack", ARFOItems.JUNGLE_EDGE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.FOREST_OVERGROWN_NETHERRACK, "forest_overgrown_netherrack", ARFOItems.FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK, "birch_forest_overgrown_netherrack", ARFOItems.BIRCH_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK, "dark_forest_overgrown_netherrack", ARFOItems.DARK_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK, "plains_overgrown_netherrack", ARFOItems.PLAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK, "swamp_overgrown_netherrack", ARFOItems.SWAMP_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK, "lush_swamp_overgrown_netherrack", ARFOItems.LUSH_SWAMP_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK, "mountains_overgrown_netherrack", ARFOItems.MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK, "mushroom_fields_overgrown_netherrack", ARFOItems.MUSHROOM_FIELDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK, "taiga_overgrown_netherrack", ARFOItems.TAIGA_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK, "mega_taiga_overgrown_netherrack", ARFOItems.MEGA_TAIGA_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK, "snowy_overgrown_netherrack", ARFOItems.SNOWY_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK, "snowy_beach_overgrown_netherrack", ARFOItems.SNOWY_BEACH_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBaseBlock(consumer, ARFOBlocks.WATERS_OVERGROWN_NETHERRACK, "waters_overgrown_netherrack", ARFOItems.WATERS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        slabBlock(consumer, ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK_SLAB, "badlands_overgrown_netherrack_slab", ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK_SLAB, "savanna_overgrown_netherrack_slab", ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK_SLAB, "tropical_overgrown_netherrack_slab", ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK_SLAB, "tropical_edge_overgrown_netherrack_slab", ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.FOREST_OVERGROWN_NETHERRACK_SLAB, "forest_overgrown_netherrack_slab", ARFOBlocks.FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK_SLAB, "birch_forest_overgrown_netherrack_slab", ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK_SLAB, "dark_forest_overgrown_netherrack_slab", ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK_SLAB, "plains_overgrown_netherrack_slab", ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK_SLAB, "swamp_overgrown_netherrack_slab", ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK_SLAB, "lush_swamp_overgrown_netherrack_slab", ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK_SLAB, "mountains_overgrown_netherrack_slab", ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK_SLAB, "mushroom_fields_overgrown_netherrack_slab", ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK_SLAB, "taiga_overgrown_netherrack_slab", ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK_SLAB, "mega_taiga_overgrown_netherrack_slab", ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK_SLAB, "snowy_overgrown_netherrack_slab", ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK_SLAB, "snowy_beach_overgrown_netherrack_slab", ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, ARFOBlocks.WATERS_OVERGROWN_NETHERRACK_SLAB, "waters_overgrown_netherrack_slab", ARFOBlocks.WATERS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");

        /*



        TRAVERSE



         */

        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, "traverse_arid_highlands_acacia_leaves", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, "traverse_autumnal_woods_acacia_leaves", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES, "traverse_cliffs_acacia_leaves", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, "traverse_snowy_cliffs_acacia_leaves", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, "traverse_coniferous_forest_acacia_leaves", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, "traverse_snowy_coniferous_forest_acacia_leaves", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES, "traverse_meadow_acacia_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, "traverse_lush_swamp_acacia_leaves", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, "traverse_plains_plateau_acacia_leaves", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, "traverse_rolling_hills_acacia_leaves", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES, "traverse_wooded_island_acacia_leaves", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES, "traverse_woodlands_acacia_leaves", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET, "traverse_arid_highlands_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET, "traverse_autumnal_woods_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET, "traverse_cliffs_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET, "traverse_snowy_cliffs_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, "traverse_coniferous_forest_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, "traverse_snowy_coniferous_forest_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET, "traverse_meadow_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET, "traverse_lush_swamp_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET, "traverse_plains_plateau_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET, "traverse_rolling_hills_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET, "traverse_wooded_island_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES,"acacia_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET, "traverse_woodlands_acacia_leaves_carpet", TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES,"acacia_leaves_carpet");

        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, "traverse_arid_highlands_oak_leaves", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, "traverse_autumnal_woods_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES, "traverse_cliffs_oak_leaves", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, "traverse_snowy_cliffs_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, "traverse_coniferous_forest_oak_leaves", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, "traverse_snowy_coniferous_forest_oak_leaves", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES, "traverse_meadow_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, "traverse_lush_swamp_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, "traverse_plains_plateau_oak_leaves", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, "traverse_rolling_hills_oak_leaves", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES, "traverse_wooded_island_oak_leaves", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES, "traverse_woodlands_oak_leaves", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET, "traverse_arid_highlands_oak_leaves_carpet", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET, "traverse_autumnal_woods_oak_leaves_carpet", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET, "traverse_cliffs_oak_leaves_carpet", TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET, "traverse_snowy_cliffs_oak_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, "traverse_coniferous_forest_oak_leaves_carpet", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, "traverse_snowy_coniferous_forest_oak_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES_CARPET, "traverse_meadow_oak_leaves_carpet", TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET, "traverse_lush_swamp_oak_leaves_carpet", TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET, "traverse_plains_plateau_oak_leaves_carpet", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET, "traverse_rolling_hills_oak_leaves_carpet", TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET, "traverse_wooded_island_oak_leaves_carpet", TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES,"oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET, "traverse_woodlands_oak_leaves_carpet", TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES,"oak_leaves_carpet");

        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, "traverse_arid_highlands_dark_oak_leaves", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, "traverse_autumnal_woods_dark_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, "traverse_cliffs_dark_oak_leaves", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, "traverse_snowy_cliffs_dark_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "traverse_coniferous_forest_dark_oak_leaves", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "traverse_snowy_coniferous_forest_dark_oak_leaves", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES, "traverse_meadow_dark_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, "traverse_lush_swamp_dark_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, "traverse_plains_plateau_dark_oak_leaves", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, "traverse_rolling_hills_dark_oak_leaves", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES, "traverse_wooded_island_dark_oak_leaves", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES, "traverse_woodlands_dark_oak_leaves", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET, "traverse_arid_highlands_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET, "traverse_autumnal_woods_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET, "traverse_cliffs_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET, "traverse_snowy_cliffs_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, "traverse_coniferous_forest_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, "traverse_snowy_coniferous_forest_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET, "traverse_meadow_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, "traverse_lush_swamp_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET, "traverse_plains_plateau_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET, "traverse_rolling_hills_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET, "traverse_wooded_island_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES,"dark_oak_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET, "traverse_woodlands_dark_oak_leaves_carpet", TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES,"dark_oak_leaves_carpet");

        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, "traverse_arid_highlands_jungle_leaves", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, "traverse_autumnal_woods_jungle_leaves", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES, "traverse_cliffs_jungle_leaves", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, "traverse_snowy_cliffs_jungle_leaves", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, "traverse_coniferous_forest_jungle_leaves", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, "traverse_snowy_coniferous_forest_jungle_leaves", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES, "traverse_meadow_jungle_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, "traverse_lush_swamp_jungle_leaves", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, "traverse_plains_plateau_jungle_leaves", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, "traverse_rolling_hills_jungle_leaves", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES, "traverse_wooded_island_jungle_leaves", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES, "traverse_woodlands_jungle_leaves", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET, "traverse_arid_highlands_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET, "traverse_autumnal_woods_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET, "traverse_cliffs_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET, "traverse_snowy_cliffs_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, "traverse_coniferous_forest_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, "traverse_snowy_coniferous_forest_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET, "traverse_meadow_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET, "traverse_lush_swamp_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET, "traverse_plains_plateau_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET, "traverse_rolling_hills_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET, "traverse_wooded_island_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES,"jungle_leaves_carpet");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET, "traverse_woodlands_jungle_leaves_carpet", TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES,"jungle_leaves_carpet");

        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, "traverse_arid_highlands_grass_block", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, "traverse_autumnal_woods_grass_block", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, "traverse_cliffs_grass_block", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, "traverse_snowy_cliffs_grass_block", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, "traverse_coniferous_forest_grass_block", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, "traverse_snowy_coniferous_forest_grass_block", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, "traverse_meadow_grass_block", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, "traverse_lush_swamp_grass_block", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, "traverse_plains_plateau_grass_block", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, "traverse_rolling_hills_grass_block", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, "traverse_wooded_island_grass_block", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, "traverse_woodlands_grass_block", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");

        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, "glowing_traverse_arid_highlands_grass_block", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, "glowing_traverse_autumnal_woods_grass_block", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK, "glowing_traverse_cliffs_grass_block", TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, "glowing_traverse_snowy_cliffs_grass_block", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_traverse_coniferous_forest_grass_block", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_traverse_snowy_coniferous_forest_grass_block", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK, "glowing_traverse_meadow_grass_block", TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, "glowing_traverse_lush_swamp_grass_block", TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, "glowing_traverse_plains_plateau_grass_block", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, "glowing_traverse_rolling_hills_grass_block", TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, "glowing_traverse_wooded_island_grass_block", TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, TraverseBlocks.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK, "glowing_traverse_woodlands_grass_block", TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, "glowing_grass_blocks");

        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB, "traverse_arid_highlands_grass_slab", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB, "traverse_autumnal_woods_grass_slab", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_SLAB, "traverse_cliffs_grass_slab", TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB, "traverse_snowy_cliffs_grass_slab", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB, "traverse_coniferous_forest_grass_slab", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB, "traverse_snowy_coniferous_forest_grass_slab", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_GRASS_SLAB, "traverse_meadow_grass_slab", TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_SLAB, "traverse_lush_swamp_grass_slab", TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB, "traverse_plains_plateau_grass_slab", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_SLAB, "traverse_rolling_hills_grass_slab", TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_SLAB, "traverse_wooded_island_grass_slab", TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_SLAB, "traverse_woodlands_grass_slab", TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, "grass_slab_blocks");

        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS, "traverse_arid_highlands_grass", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS, "traverse_autumnal_woods_grass", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_GRASS, "traverse_cliffs_grass", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS, "traverse_snowy_cliffs_grass", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS, "traverse_coniferous_forest_grass", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, "traverse_snowy_coniferous_forest_grass", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_GRASS, "traverse_meadow_grass", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS, "traverse_lush_swamp_grass", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS, "traverse_plains_plateau_grass", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS, "traverse_rolling_hills_grass", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS, "traverse_wooded_island_grass", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS, "traverse_woodlands_grass", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.GRASS, "grass");

        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS, "tall_traverse_arid_highlands_grass", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS, "tall_traverse_autumnal_woods_grass", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_CLIFFS_GRASS, "tall_traverse_cliffs_grass", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS, "tall_traverse_snowy_cliffs_grass", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS, "tall_traverse_coniferous_forest_grass", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, "tall_traverse_snowy_coniferous_forest_grass", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_MEADOW_GRASS, "tall_traverse_meadow_grass", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_LUSH_SWAMP_GRASS, "tall_traverse_lush_swamp_grass", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS, "tall_traverse_plains_plateau_grass", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_ROLLING_HILLS_GRASS, "tall_traverse_rolling_hills_grass", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_WOODED_ISLAND_GRASS, "tall_traverse_wooded_island_grass", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, TraverseBlocks.TALL_TRAVERSE_WOODLANDS_GRASS, "tall_traverse_woodlands_grass", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");

        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_FERN, "traverse_arid_highlands_fern", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_FERN, "traverse_autumnal_woods_fern", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_FERN, "traverse_cliffs_fern", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_FERN, "traverse_snowy_cliffs_fern", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_FERN, "traverse_coniferous_forest_fern", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, "traverse_snowy_coniferous_forest_fern", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_FERN, "traverse_meadow_fern", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_FERN, "traverse_lush_swamp_fern", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_FERN, "traverse_plains_plateau_fern", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_FERN, "traverse_rolling_hills_fern", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_FERN, "traverse_wooded_island_fern", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_FERN, "traverse_woodlands_fern", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.FERNS, "ferns");

        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN, "large_traverse_arid_highlands_fern", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN, "large_traverse_autumnal_woods_fern", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_CLIFFS_FERN, "large_traverse_cliffs_fern", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN, "large_traverse_snowy_cliffs_fern", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN, "large_traverse_coniferous_forest_fern", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, "large_traverse_snowy_coniferous_forest_fern", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_MEADOW_FERN, "large_traverse_meadow_fern", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_LUSH_SWAMP_FERN, "large_traverse_lush_swamp_fern", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN, "large_traverse_plains_plateau_fern", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_ROLLING_HILLS_FERN, "large_traverse_rolling_hills_fern", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_WOODED_ISLAND_FERN, "large_traverse_wooded_island_fern", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, TraverseBlocks.LARGE_TRAVERSE_WOODLANDS_FERN, "large_traverse_woodlands_fern", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");

        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_VINE, "traverse_arid_highlands_vine", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_VINE, "traverse_autumnal_woods_vine", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_VINE, "traverse_cliffs_vine", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_VINE, "traverse_snowy_cliffs_vine", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_VINE, "traverse_coniferous_forest_vine", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_VINE, "traverse_snowy_coniferous_forest_vine", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_VINE, "traverse_meadow_vine", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_VINE, "traverse_lush_swamp_vine", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_VINE, "traverse_plains_plateau_vine", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_VINE, "traverse_rolling_hills_vine", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_VINE, "traverse_wooded_island_vine", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_VINE, "traverse_woodlands_vine", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.VINES, "vines");

        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_SUGAR_CANE, "traverse_arid_highlands_sugar_cane", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_SUGAR_CANE, "traverse_autumnal_woods_sugar_cane", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_SUGAR_CANE, "traverse_cliffs_sugar_cane", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_SUGAR_CANE, "traverse_snowy_cliffs_sugar_cane", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_SUGAR_CANE, "traverse_coniferous_forest_sugar_cane", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_SUGAR_CANE, "traverse_snowy_coniferous_forest_sugar_cane", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_SUGAR_CANE, "traverse_meadow_sugar_cane", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_SUGAR_CANE, "traverse_lush_swamp_sugar_cane", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_SUGAR_CANE, "traverse_plains_plateau_sugar_cane", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_SUGAR_CANE, "traverse_rolling_hills_sugar_cane", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_SUGAR_CANE, "traverse_wooded_island_sugar_cane", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_SUGAR_CANE, "traverse_woodlands_sugar_cane", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");

        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_STONE, "traverse_arid_highlands_overgrown_stone", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_STONE, "traverse_autumnal_woods_overgrown_stone", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_STONE, "traverse_cliffs_overgrown_stone", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_STONE, "traverse_snowy_cliffs_overgrown_stone", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_STONE, "traverse_coniferous_forest_overgrown_stone", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_STONE, "traverse_snowy_coniferous_forest_overgrown_stone", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_STONE, "traverse_meadow_overgrown_stone", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_STONE, "traverse_lush_swamp_overgrown_stone", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_STONE, "traverse_plains_plateau_overgrown_stone", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_STONE, "traverse_rolling_hills_overgrown_stone", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_STONE, "traverse_wooded_island_overgrown_stone", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_STONE, "traverse_woodlands_overgrown_stone", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, Items.STONE, "overgrown_stone");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_STONE_SLAB, "traverse_arid_highlands_overgrown_stone_slab", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_STONE_SLAB, "traverse_autumnal_woods_overgrown_stone_slab", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_STONE_SLAB, "traverse_cliffs_overgrown_stone_slab", TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_STONE_SLAB, "traverse_snowy_cliffs_overgrown_stone_slab", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_STONE_SLAB, "traverse_coniferous_forest_overgrown_stone_slab", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_STONE_SLAB, "traverse_snowy_coniferous_forest_overgrown_stone_slab", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_STONE_SLAB, "traverse_meadow_overgrown_stone_slab", TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_STONE_SLAB, "traverse_lush_swamp_overgrown_stone_slab", TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_STONE_SLAB, "traverse_plains_plateau_overgrown_stone_slab", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_STONE_SLAB, "traverse_rolling_hills_overgrown_stone_slab", TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_STONE_SLAB, "traverse_wooded_island_overgrown_stone_slab", TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_STONE_SLAB, "traverse_woodlands_overgrown_stone_slab", TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");

        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_DACITE, "traverse_arid_highlands_overgrown_dacite", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_DACITE, "traverse_autumnal_woods_overgrown_dacite", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_DACITE, "traverse_cliffs_overgrown_dacite", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_DACITE, "traverse_snowy_cliffs_overgrown_dacite", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_DACITE, "traverse_coniferous_forest_overgrown_dacite", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_DACITE, "traverse_snowy_coniferous_forest_overgrown_dacite", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_DACITE, "traverse_meadow_overgrown_dacite", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_DACITE, "traverse_lush_swamp_overgrown_dacite", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_DACITE, "traverse_plains_plateau_overgrown_dacite", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_DACITE, "traverse_rolling_hills_overgrown_dacite", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_DACITE, "traverse_wooded_island_overgrown_dacite", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_DACITE, "traverse_woodlands_overgrown_dacite", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, Items.DIORITE, "overgrown_dacite");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_DACITE_SLAB, "traverse_arid_highlands_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_DACITE_SLAB, "traverse_autumnal_woods_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_DACITE_SLAB, "traverse_cliffs_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_DACITE_SLAB, "traverse_snowy_cliffs_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_DACITE_SLAB, "traverse_coniferous_forest_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_DACITE_SLAB, "traverse_snowy_coniferous_forest_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_DACITE_SLAB, "traverse_meadow_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_DACITE_SLAB, "traverse_lush_swamp_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_DACITE_SLAB, "traverse_plains_plateau_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_DACITE_SLAB, "traverse_rolling_hills_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_DACITE_SLAB, "traverse_wooded_island_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_DACITE_SLAB, "traverse_woodlands_overgrown_dacite_slab", TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");

        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_NETHERRACK, "traverse_arid_highlands_overgrown_netherrack", ARFOItems.SAVANNA_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_NETHERRACK, "traverse_autumnal_woods_overgrown_netherrack", ARFOItems.BIRCH_FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_NETHERRACK, "traverse_cliffs_overgrown_netherrack", ARFOItems.MOUNTAINS_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_NETHERRACK, "traverse_snowy_cliffs_overgrown_netherrack", ARFOItems.SNOWY_BEACH_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "traverse_coniferous_forest_overgrown_netherrack", ARFOItems.DARK_FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "traverse_snowy_coniferous_forest_overgrown_netherrack", ARFOItems.SNOWY_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_NETHERRACK, "traverse_meadow_overgrown_netherrack", ARFOItems.MUSHROOM_FIELDS_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_NETHERRACK, "traverse_lush_swamp_overgrown_netherrack", ARFOItems.LUSH_SWAMP_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_NETHERRACK, "traverse_plains_plateau_overgrown_netherrack", ARFOItems.PLAINS_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_NETHERRACK, "traverse_rolling_hills_overgrown_netherrack", ARFOItems.JUNGLE_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_NETHERRACK, "traverse_wooded_island_overgrown_netherrack", ARFOItems.FOREST_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_NETHERRACK, "traverse_woodlands_overgrown_netherrack", ARFOItems.TAIGA_DYE, TraverseItems.TRAVERSE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_NETHERRACK_SLAB, "traverse_arid_highlands_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_NETHERRACK_SLAB, "traverse_autumnal_woods_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_NETHERRACK_SLAB, "traverse_cliffs_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_CLIFFS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_NETHERRACK_SLAB, "traverse_snowy_cliffs_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "traverse_coniferous_forest_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "traverse_snowy_coniferous_forest_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_NETHERRACK_SLAB, "traverse_meadow_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_MEADOW_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_NETHERRACK_SLAB, "traverse_lush_swamp_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_LUSH_SWAMP_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_NETHERRACK_SLAB, "traverse_plains_plateau_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_NETHERRACK_SLAB, "traverse_rolling_hills_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_ROLLING_HILLS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_NETHERRACK_SLAB, "traverse_wooded_island_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_WOODED_ISLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_NETHERRACK_SLAB, "traverse_woodlands_overgrown_netherrack_slab", TraverseBlocks.TRAVERSE_WOODLANDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");

        /*




        BYG



         */
        baseBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_ACACIA_LEAVES, "byg_ancient_forest_acacia_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_ACACIA_LEAVES, "byg_aspen_forest_acacia_leaves", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_ACACIA_LEAVES, "byg_cherry_blossom_forest_acacia_leaves", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_ACACIA_LEAVES, "byg_cika_woods_acacia_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_ACACIA_LEAVES, "byg_coniferous_forest_acacia_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_ACACIA_LEAVES, "byg_deciduous_forest_acacia_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_ACACIA_LEAVES, "byg_enchanted_forest_acacia_leaves", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_ACACIA_LEAVES, "byg_jacaranda_forest_acacia_leaves", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_ACACIA_LEAVES, "byg_red_oak_forest_acacia_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_ACACIA_LEAVES, "byg_redwood_tropics_acacia_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_ACACIA_LEAVES, "byg_seasonal_deciduous_forest_acacia_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_ACACIA_LEAVES, "byg_snowy_deciduous_forest_acacia_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_ACACIA_LEAVES, "byg_tropical_rain_forest_acacia_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_ACACIA_LEAVES, "byg_woodlands_acacia_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_ACACIA_LEAVES, "byg_zelkova_forest_acacia_leaves", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GROVE_ACACIA_LEAVES, "byg_grove_acacia_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_ACACIA_LEAVES, "byg_basalt_barrera_acacia_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_ACACIA_LEAVES, "byg_bluff_steeps_acacia_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_ACACIA_LEAVES, "byg_grass_land_plateau_acacia_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_ACACIA_LEAVES, "byg_guiana_shield_acacia_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_ACACIA_LEAVES, "byg_red_rock_mountains_acacia_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_ACACIA_LEAVES, "byg_skyris_highlands_acacia_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_ACACIA_LEAVES, "byg_volcano_acacia_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_ACACIA_LEAVES, "byg_autumnal_valley_acacia_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_ACACIA_LEAVES, "byg_cold_swamplands_acacia_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_ACACIA_LEAVES, "byg_crimson_gardens_acacia_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_ACACIA_LEAVES, "byg_glowstone_gardens_acacia_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_ACACIA_LEAVES, "byg_sythian_torrids_acacia_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_ACACIA_LEAVES, "byg_wailing_garth_acacia_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_ACACIA_LEAVES, "byg_weeping_mire_acacia_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_ACACIA_LEAVES, "byg_withering_woods_acacia_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_ACACIA_LEAVES, "byg_araucaria_savanna_acacia_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BAYOU_ACACIA_LEAVES, "byg_bayou_acacia_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_ACACIA_LEAVES, "byg_crag_gardens_acacia_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_ACACIA_LEAVES, "byg_cypress_swampland_acacia_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_ACACIA_LEAVES, "byg_fresh_water_lake_acacia_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ACACIA_LEAVES, "byg_great_lakes_acacia_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_ACACIA_LEAVES, "byg_great_lakes_isles_acacia_leaves", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_ACACIA_LEAVES, "byg_lush_tundra_acacia_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_ACACIA_LEAVES, "byg_orchard_acacia_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_ACACIA_LEAVES, "byg_polluted_lake_acacia_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_ACACIA_LEAVES, "byg_prairie_acacia_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_ACACIA_LEAVES, "byg_rose_fields_acacia_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_ACACIA_LEAVES, "byg_shrub_lands_acacia_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_ACACIA_LEAVES_CARPET, "byg_ancient_forest_acacia_leaves_carpet", BYGBlocks.BYG_ANCIENT_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_ACACIA_LEAVES_CARPET, "byg_aspen_forest_acacia_leaves_carpet", BYGBlocks.BYG_ASPEN_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_ACACIA_LEAVES_CARPET, "byg_cherry_blossom_forest_acacia_leaves_carpet", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_ACACIA_LEAVES_CARPET, "byg_cika_woods_acacia_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, "byg_coniferous_forest_acacia_leaves_carpet", BYGBlocks.BYG_CONIFEROUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_ACACIA_LEAVES_CARPET, "byg_deciduous_forest_acacia_leaves_carpet", BYGBlocks.BYG_DECIDUOUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_ACACIA_LEAVES_CARPET, "byg_enchanted_forest_acacia_leaves_carpet", BYGBlocks.BYG_ENCHANTED_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_ACACIA_LEAVES_CARPET, "byg_jacaranda_forest_acacia_leaves_carpet", BYGBlocks.BYG_JACARANDA_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_ACACIA_LEAVES_CARPET, "byg_red_oak_forest_acacia_leaves_carpet", BYGBlocks.BYG_RED_OAK_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_ACACIA_LEAVES_CARPET, "byg_redwood_tropics_acacia_leaves_carpet", BYGBlocks.BYG_REDWOOD_TROPICS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_ACACIA_LEAVES_CARPET, "byg_seasonal_deciduous_forest_acacia_leaves_carpet", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_ACACIA_LEAVES_CARPET, "byg_snowy_deciduous_forest_acacia_leaves_carpet", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_ACACIA_LEAVES_CARPET, "byg_tropical_rain_forest_acacia_leaves_carpet", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_ACACIA_LEAVES_CARPET, "byg_woodlands_acacia_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_ACACIA_LEAVES_CARPET, "byg_zelkova_forest_acacia_leaves_carpet", BYGBlocks.BYG_ZELKOVA_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_ACACIA_LEAVES_CARPET, "byg_grove_acacia_leaves_carpet", BYGBlocks.BYG_GROVE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_ACACIA_LEAVES_CARPET, "byg_basalt_barrera_acacia_leaves_carpet", BYGBlocks.BYG_BASALT_BARRERA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_ACACIA_LEAVES_CARPET, "byg_bluff_steeps_acacia_leaves_carpet", BYGBlocks.BYG_BLUFF_STEEPS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_ACACIA_LEAVES_CARPET, "byg_grass_land_plateau_acacia_leaves_carpet", BYGBlocks.BYG_GRASS_LAND_PLATEAU_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_ACACIA_LEAVES_CARPET, "byg_guiana_shield_acacia_leaves_carpet", BYGBlocks.BYG_GUIANA_SHIELD_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_ACACIA_LEAVES_CARPET, "byg_red_rock_mountains_acacia_leaves_carpet", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_ACACIA_LEAVES_CARPET, "byg_skyris_highlands_acacia_leaves_carpet", BYGBlocks.BYG_SKYRIS_HIGHLANDS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_ACACIA_LEAVES_CARPET, "byg_volcano_acacia_leaves_carpet", BYGBlocks.BYG_VOLCANO_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_ACACIA_LEAVES_CARPET, "byg_autumnal_valley_acacia_leaves_carpet", BYGBlocks.BYG_AUTUMNAL_VALLEY_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_ACACIA_LEAVES_CARPET, "byg_cold_swamplands_acacia_leaves_carpet", BYGBlocks.BYG_COLD_SWAMPLANDS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_ACACIA_LEAVES_CARPET, "byg_crimson_gardens_acacia_leaves_carpet", BYGBlocks.BYG_CRIMSON_GARDENS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_ACACIA_LEAVES_CARPET, "byg_glowstone_gardens_acacia_leaves_carpet", BYGBlocks.BYG_GLOWSTONE_GARDENS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_ACACIA_LEAVES_CARPET, "byg_sythian_torrids_acacia_leaves_carpet", BYGBlocks.BYG_SYTHIAN_TORRIDS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_ACACIA_LEAVES_CARPET, "byg_wailing_garth_acacia_leaves_carpet", BYGBlocks.BYG_WAILING_GARTH_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_ACACIA_LEAVES_CARPET, "byg_weeping_mire_acacia_leaves_carpet", BYGBlocks.BYG_WEEPING_MIRE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_ACACIA_LEAVES_CARPET, "byg_withering_woods_acacia_leaves_carpet", BYGBlocks.BYG_WITHERING_WOODS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_ACACIA_LEAVES_CARPET, "byg_araucaria_savanna_acacia_leaves_carpet", BYGBlocks.BYG_ARAUCARIA_SAVANNA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_ACACIA_LEAVES_CARPET, "byg_bayou_acacia_leaves_carpet", BYGBlocks.BYG_BAYOU_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_ACACIA_LEAVES_CARPET, "byg_crag_gardens_acacia_leaves_carpet", BYGBlocks.BYG_CRAG_GARDENS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_ACACIA_LEAVES_CARPET, "byg_cypress_swampland_acacia_leaves_carpet", BYGBlocks.BYG_CYPRESS_SWAMPLAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_ACACIA_LEAVES_CARPET, "byg_fresh_water_lake_acacia_leaves_carpet", BYGBlocks.BYG_FRESH_WATER_LAKE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_ACACIA_LEAVES_CARPET, "byg_great_lakes_acacia_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_ACACIA_LEAVES_CARPET, "byg_great_lakes_isles_acacia_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_ISLES_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_ACACIA_LEAVES_CARPET, "byg_lush_tundra_acacia_leaves_carpet", BYGBlocks.BYG_LUSH_TUNDRA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_ACACIA_LEAVES_CARPET, "byg_orchard_acacia_leaves_carpet", BYGBlocks.BYG_ORCHARD_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_ACACIA_LEAVES_CARPET, "byg_polluted_lake_acacia_leaves_carpet", BYGBlocks.BYG_POLLUTED_LAKE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_ACACIA_LEAVES_CARPET, "byg_prairie_acacia_leaves_carpet", BYGBlocks.BYG_PRAIRIE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_ACACIA_LEAVES_CARPET, "byg_rose_fields_acacia_leaves_carpet", BYGBlocks.BYG_ROSE_FIELDS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_ACACIA_LEAVES_CARPET, "byg_shrub_lands_acacia_leaves_carpet", BYGBlocks.BYG_SHRUB_LANDS_ACACIA_LEAVES, "acacia_leaves_carpet");


        baseBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OAK_LEAVES, "byg_ancient_forest_oak_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_OAK_LEAVES, "byg_aspen_forest_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OAK_LEAVES, "byg_cherry_blossom_forest_oak_leaves", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_OAK_LEAVES, "byg_cika_woods_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OAK_LEAVES, "byg_coniferous_forest_oak_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OAK_LEAVES, "byg_deciduous_forest_oak_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OAK_LEAVES, "byg_enchanted_forest_oak_leaves", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OAK_LEAVES, "byg_jacaranda_forest_oak_leaves", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OAK_LEAVES, "byg_red_oak_forest_oak_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OAK_LEAVES, "byg_redwood_tropics_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OAK_LEAVES, "byg_seasonal_deciduous_forest_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OAK_LEAVES, "byg_snowy_deciduous_forest_oak_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OAK_LEAVES, "byg_tropical_rain_forest_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_OAK_LEAVES, "byg_woodlands_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OAK_LEAVES, "byg_zelkova_forest_oak_leaves", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GROVE_OAK_LEAVES, "byg_grove_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_OAK_LEAVES, "byg_basalt_barrera_oak_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OAK_LEAVES, "byg_bluff_steeps_oak_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OAK_LEAVES, "byg_grass_land_plateau_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OAK_LEAVES, "byg_guiana_shield_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OAK_LEAVES, "byg_red_rock_mountains_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OAK_LEAVES, "byg_skyris_highlands_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_OAK_LEAVES, "byg_volcano_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OAK_LEAVES, "byg_autumnal_valley_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OAK_LEAVES, "byg_cold_swamplands_oak_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OAK_LEAVES, "byg_crimson_gardens_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OAK_LEAVES, "byg_glowstone_gardens_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OAK_LEAVES, "byg_sythian_torrids_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_OAK_LEAVES, "byg_wailing_garth_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_OAK_LEAVES, "byg_weeping_mire_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_OAK_LEAVES, "byg_withering_woods_oak_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OAK_LEAVES, "byg_araucaria_savanna_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BAYOU_OAK_LEAVES, "byg_bayou_oak_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_OAK_LEAVES, "byg_crag_gardens_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OAK_LEAVES, "byg_cypress_swampland_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OAK_LEAVES, "byg_fresh_water_lake_oak_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_OAK_LEAVES, "byg_great_lakes_oak_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_OAK_LEAVES, "byg_great_lakes_isles_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OAK_LEAVES, "byg_lush_tundra_oak_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_OAK_LEAVES, "byg_orchard_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OAK_LEAVES, "byg_polluted_lake_oak_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_OAK_LEAVES, "byg_prairie_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_OAK_LEAVES, "byg_rose_fields_oak_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_OAK_LEAVES, "byg_shrub_lands_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OAK_LEAVES_CARPET, "byg_ancient_forest_oak_leaves_carpet", BYGBlocks.BYG_ANCIENT_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_OAK_LEAVES_CARPET, "byg_aspen_forest_oak_leaves_carpet", BYGBlocks.BYG_ASPEN_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OAK_LEAVES_CARPET, "byg_cherry_blossom_forest_oak_leaves_carpet", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_OAK_LEAVES_CARPET, "byg_cika_woods_oak_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, "byg_coniferous_forest_oak_leaves_carpet", BYGBlocks.BYG_CONIFEROUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OAK_LEAVES_CARPET, "byg_deciduous_forest_oak_leaves_carpet", BYGBlocks.BYG_DECIDUOUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OAK_LEAVES_CARPET, "byg_enchanted_forest_oak_leaves_carpet", BYGBlocks.BYG_ENCHANTED_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OAK_LEAVES_CARPET, "byg_jacaranda_forest_oak_leaves_carpet", BYGBlocks.BYG_JACARANDA_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OAK_LEAVES_CARPET, "byg_red_oak_forest_oak_leaves_carpet", BYGBlocks.BYG_RED_OAK_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OAK_LEAVES_CARPET, "byg_redwood_tropics_oak_leaves_carpet", BYGBlocks.BYG_REDWOOD_TROPICS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OAK_LEAVES_CARPET, "byg_seasonal_deciduous_forest_oak_leaves_carpet", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OAK_LEAVES_CARPET, "byg_snowy_deciduous_forest_oak_leaves_carpet", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OAK_LEAVES_CARPET, "byg_tropical_rain_forest_oak_leaves_carpet", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_OAK_LEAVES_CARPET, "byg_woodlands_oak_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OAK_LEAVES_CARPET, "byg_zelkova_forest_oak_leaves_carpet", BYGBlocks.BYG_ZELKOVA_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_OAK_LEAVES_CARPET, "byg_grove_oak_leaves_carpet", BYGBlocks.BYG_GROVE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_OAK_LEAVES_CARPET, "byg_basalt_barrera_oak_leaves_carpet", BYGBlocks.BYG_BASALT_BARRERA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OAK_LEAVES_CARPET, "byg_bluff_steeps_oak_leaves_carpet", BYGBlocks.BYG_BLUFF_STEEPS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OAK_LEAVES_CARPET, "byg_grass_land_plateau_oak_leaves_carpet", BYGBlocks.BYG_GRASS_LAND_PLATEAU_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OAK_LEAVES_CARPET, "byg_guiana_shield_oak_leaves_carpet", BYGBlocks.BYG_GUIANA_SHIELD_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OAK_LEAVES_CARPET, "byg_red_rock_mountains_oak_leaves_carpet", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OAK_LEAVES_CARPET, "byg_skyris_highlands_oak_leaves_carpet", BYGBlocks.BYG_SKYRIS_HIGHLANDS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_OAK_LEAVES_CARPET, "byg_volcano_oak_leaves_carpet", BYGBlocks.BYG_VOLCANO_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OAK_LEAVES_CARPET, "byg_autumnal_valley_oak_leaves_carpet", BYGBlocks.BYG_AUTUMNAL_VALLEY_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OAK_LEAVES_CARPET, "byg_cold_swamplands_oak_leaves_carpet", BYGBlocks.BYG_COLD_SWAMPLANDS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OAK_LEAVES_CARPET, "byg_crimson_gardens_oak_leaves_carpet", BYGBlocks.BYG_CRIMSON_GARDENS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OAK_LEAVES_CARPET, "byg_glowstone_gardens_oak_leaves_carpet", BYGBlocks.BYG_GLOWSTONE_GARDENS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OAK_LEAVES_CARPET, "byg_sythian_torrids_oak_leaves_carpet", BYGBlocks.BYG_SYTHIAN_TORRIDS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_OAK_LEAVES_CARPET, "byg_wailing_garth_oak_leaves_carpet", BYGBlocks.BYG_WAILING_GARTH_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_OAK_LEAVES_CARPET, "byg_weeping_mire_oak_leaves_carpet", BYGBlocks.BYG_WEEPING_MIRE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_OAK_LEAVES_CARPET, "byg_withering_woods_oak_leaves_carpet", BYGBlocks.BYG_WITHERING_WOODS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OAK_LEAVES_CARPET, "byg_araucaria_savanna_oak_leaves_carpet", BYGBlocks.BYG_ARAUCARIA_SAVANNA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_OAK_LEAVES_CARPET, "byg_bayou_oak_leaves_carpet", BYGBlocks.BYG_BAYOU_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_OAK_LEAVES_CARPET, "byg_crag_gardens_oak_leaves_carpet", BYGBlocks.BYG_CRAG_GARDENS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OAK_LEAVES_CARPET, "byg_cypress_swampland_oak_leaves_carpet", BYGBlocks.BYG_CYPRESS_SWAMPLAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OAK_LEAVES_CARPET, "byg_fresh_water_lake_oak_leaves_carpet", BYGBlocks.BYG_FRESH_WATER_LAKE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_OAK_LEAVES_CARPET, "byg_great_lakes_oak_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_OAK_LEAVES_CARPET, "byg_great_lakes_isles_oak_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_ISLES_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OAK_LEAVES_CARPET, "byg_lush_tundra_oak_leaves_carpet", BYGBlocks.BYG_LUSH_TUNDRA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_OAK_LEAVES_CARPET, "byg_orchard_oak_leaves_carpet", BYGBlocks.BYG_ORCHARD_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OAK_LEAVES_CARPET, "byg_polluted_lake_oak_leaves_carpet", BYGBlocks.BYG_POLLUTED_LAKE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_OAK_LEAVES_CARPET, "byg_prairie_oak_leaves_carpet", BYGBlocks.BYG_PRAIRIE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_OAK_LEAVES_CARPET, "byg_rose_fields_oak_leaves_carpet", BYGBlocks.BYG_ROSE_FIELDS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_OAK_LEAVES_CARPET, "byg_shrub_lands_oak_leaves_carpet", BYGBlocks.BYG_SHRUB_LANDS_OAK_LEAVES, "oak_leaves_carpet");


        baseBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_DARK_OAK_LEAVES, "byg_ancient_forest_dark_oak_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_DARK_OAK_LEAVES, "byg_aspen_forest_dark_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_DARK_OAK_LEAVES, "byg_cherry_blossom_forest_dark_oak_leaves", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_DARK_OAK_LEAVES, "byg_cika_woods_dark_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "byg_coniferous_forest_dark_oak_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_DARK_OAK_LEAVES, "byg_deciduous_forest_dark_oak_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_DARK_OAK_LEAVES, "byg_enchanted_forest_dark_oak_leaves", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_DARK_OAK_LEAVES, "byg_jacaranda_forest_dark_oak_leaves", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_DARK_OAK_LEAVES, "byg_red_oak_forest_dark_oak_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_DARK_OAK_LEAVES, "byg_redwood_tropics_dark_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_DARK_OAK_LEAVES, "byg_seasonal_deciduous_forest_dark_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_DARK_OAK_LEAVES, "byg_snowy_deciduous_forest_dark_oak_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_DARK_OAK_LEAVES, "byg_tropical_rain_forest_dark_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_DARK_OAK_LEAVES, "byg_woodlands_dark_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_DARK_OAK_LEAVES, "byg_zelkova_forest_dark_oak_leaves", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GROVE_DARK_OAK_LEAVES, "byg_grove_dark_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_DARK_OAK_LEAVES, "byg_basalt_barrera_dark_oak_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_DARK_OAK_LEAVES, "byg_bluff_steeps_dark_oak_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_DARK_OAK_LEAVES, "byg_grass_land_plateau_dark_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_DARK_OAK_LEAVES, "byg_guiana_shield_dark_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_DARK_OAK_LEAVES, "byg_red_rock_mountains_dark_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_DARK_OAK_LEAVES, "byg_skyris_highlands_dark_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_DARK_OAK_LEAVES, "byg_volcano_dark_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_DARK_OAK_LEAVES, "byg_autumnal_valley_dark_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_DARK_OAK_LEAVES, "byg_cold_swamplands_dark_oak_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_DARK_OAK_LEAVES, "byg_crimson_gardens_dark_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_DARK_OAK_LEAVES, "byg_glowstone_gardens_dark_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_DARK_OAK_LEAVES, "byg_sythian_torrids_dark_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_DARK_OAK_LEAVES, "byg_wailing_garth_dark_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_DARK_OAK_LEAVES, "byg_weeping_mire_dark_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_DARK_OAK_LEAVES, "byg_withering_woods_dark_oak_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_DARK_OAK_LEAVES, "byg_araucaria_savanna_dark_oak_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BAYOU_DARK_OAK_LEAVES, "byg_bayou_dark_oak_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_DARK_OAK_LEAVES, "byg_crag_gardens_dark_oak_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_DARK_OAK_LEAVES, "byg_cypress_swampland_dark_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_DARK_OAK_LEAVES, "byg_fresh_water_lake_dark_oak_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_DARK_OAK_LEAVES, "byg_great_lakes_dark_oak_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_DARK_OAK_LEAVES, "byg_great_lakes_isles_dark_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_DARK_OAK_LEAVES, "byg_lush_tundra_dark_oak_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_DARK_OAK_LEAVES, "byg_orchard_dark_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_DARK_OAK_LEAVES, "byg_polluted_lake_dark_oak_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_DARK_OAK_LEAVES, "byg_prairie_dark_oak_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_DARK_OAK_LEAVES, "byg_rose_fields_dark_oak_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_DARK_OAK_LEAVES, "byg_shrub_lands_dark_oak_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_DARK_OAK_LEAVES_CARPET, "byg_ancient_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_ANCIENT_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_DARK_OAK_LEAVES_CARPET, "byg_aspen_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_ASPEN_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_DARK_OAK_LEAVES_CARPET, "byg_cherry_blossom_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_DARK_OAK_LEAVES_CARPET, "byg_cika_woods_dark_oak_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, "byg_coniferous_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_DARK_OAK_LEAVES_CARPET, "byg_deciduous_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_DECIDUOUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_DARK_OAK_LEAVES_CARPET, "byg_enchanted_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_ENCHANTED_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_DARK_OAK_LEAVES_CARPET, "byg_jacaranda_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_JACARANDA_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_DARK_OAK_LEAVES_CARPET, "byg_red_oak_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_RED_OAK_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_DARK_OAK_LEAVES_CARPET, "byg_redwood_tropics_dark_oak_leaves_carpet", BYGBlocks.BYG_REDWOOD_TROPICS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_DARK_OAK_LEAVES_CARPET, "byg_seasonal_deciduous_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_DARK_OAK_LEAVES_CARPET, "byg_snowy_deciduous_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_DARK_OAK_LEAVES_CARPET, "byg_tropical_rain_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_DARK_OAK_LEAVES_CARPET, "byg_woodlands_dark_oak_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_DARK_OAK_LEAVES_CARPET, "byg_zelkova_forest_dark_oak_leaves_carpet", BYGBlocks.BYG_ZELKOVA_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_DARK_OAK_LEAVES_CARPET, "byg_grove_dark_oak_leaves_carpet", BYGBlocks.BYG_GROVE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_DARK_OAK_LEAVES_CARPET, "byg_basalt_barrera_dark_oak_leaves_carpet", BYGBlocks.BYG_BASALT_BARRERA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_DARK_OAK_LEAVES_CARPET, "byg_bluff_steeps_dark_oak_leaves_carpet", BYGBlocks.BYG_BLUFF_STEEPS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_DARK_OAK_LEAVES_CARPET, "byg_grass_land_plateau_dark_oak_leaves_carpet", BYGBlocks.BYG_GRASS_LAND_PLATEAU_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_DARK_OAK_LEAVES_CARPET, "byg_guiana_shield_dark_oak_leaves_carpet", BYGBlocks.BYG_GUIANA_SHIELD_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_DARK_OAK_LEAVES_CARPET, "byg_red_rock_mountains_dark_oak_leaves_carpet", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_DARK_OAK_LEAVES_CARPET, "byg_skyris_highlands_dark_oak_leaves_carpet", BYGBlocks.BYG_SKYRIS_HIGHLANDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_DARK_OAK_LEAVES_CARPET, "byg_volcano_dark_oak_leaves_carpet", BYGBlocks.BYG_VOLCANO_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_DARK_OAK_LEAVES_CARPET, "byg_autumnal_valley_dark_oak_leaves_carpet", BYGBlocks.BYG_AUTUMNAL_VALLEY_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_DARK_OAK_LEAVES_CARPET, "byg_cold_swamplands_dark_oak_leaves_carpet", BYGBlocks.BYG_COLD_SWAMPLANDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_DARK_OAK_LEAVES_CARPET, "byg_crimson_gardens_dark_oak_leaves_carpet", BYGBlocks.BYG_CRIMSON_GARDENS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_DARK_OAK_LEAVES_CARPET, "byg_glowstone_gardens_dark_oak_leaves_carpet", BYGBlocks.BYG_GLOWSTONE_GARDENS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_DARK_OAK_LEAVES_CARPET, "byg_sythian_torrids_dark_oak_leaves_carpet", BYGBlocks.BYG_SYTHIAN_TORRIDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_DARK_OAK_LEAVES_CARPET, "byg_wailing_garth_dark_oak_leaves_carpet", BYGBlocks.BYG_WAILING_GARTH_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_DARK_OAK_LEAVES_CARPET, "byg_weeping_mire_dark_oak_leaves_carpet", BYGBlocks.BYG_WEEPING_MIRE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_DARK_OAK_LEAVES_CARPET, "byg_withering_woods_dark_oak_leaves_carpet", BYGBlocks.BYG_WITHERING_WOODS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_DARK_OAK_LEAVES_CARPET, "byg_araucaria_savanna_dark_oak_leaves_carpet", BYGBlocks.BYG_ARAUCARIA_SAVANNA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_DARK_OAK_LEAVES_CARPET, "byg_bayou_dark_oak_leaves_carpet", BYGBlocks.BYG_BAYOU_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_DARK_OAK_LEAVES_CARPET, "byg_crag_gardens_dark_oak_leaves_carpet", BYGBlocks.BYG_CRAG_GARDENS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_DARK_OAK_LEAVES_CARPET, "byg_cypress_swampland_dark_oak_leaves_carpet", BYGBlocks.BYG_CYPRESS_SWAMPLAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_DARK_OAK_LEAVES_CARPET, "byg_fresh_water_lake_dark_oak_leaves_carpet", BYGBlocks.BYG_FRESH_WATER_LAKE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_DARK_OAK_LEAVES_CARPET, "byg_great_lakes_dark_oak_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_DARK_OAK_LEAVES_CARPET, "byg_great_lakes_isles_dark_oak_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_ISLES_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_DARK_OAK_LEAVES_CARPET, "byg_lush_tundra_dark_oak_leaves_carpet", BYGBlocks.BYG_LUSH_TUNDRA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_DARK_OAK_LEAVES_CARPET, "byg_orchard_dark_oak_leaves_carpet", BYGBlocks.BYG_ORCHARD_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_DARK_OAK_LEAVES_CARPET, "byg_polluted_lake_dark_oak_leaves_carpet", BYGBlocks.BYG_POLLUTED_LAKE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_DARK_OAK_LEAVES_CARPET, "byg_prairie_dark_oak_leaves_carpet", BYGBlocks.BYG_PRAIRIE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_DARK_OAK_LEAVES_CARPET, "byg_rose_fields_dark_oak_leaves_carpet", BYGBlocks.BYG_ROSE_FIELDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_DARK_OAK_LEAVES_CARPET, "byg_shrub_lands_dark_oak_leaves_carpet", BYGBlocks.BYG_SHRUB_LANDS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");


        baseBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_JUNGLE_LEAVES, "byg_ancient_forest_jungle_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_JUNGLE_LEAVES, "byg_aspen_forest_jungle_leaves", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_JUNGLE_LEAVES, "byg_cherry_blossom_forest_jungle_leaves", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_JUNGLE_LEAVES, "byg_cika_woods_jungle_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_JUNGLE_LEAVES, "byg_coniferous_forest_jungle_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_JUNGLE_LEAVES, "byg_deciduous_forest_jungle_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_JUNGLE_LEAVES, "byg_enchanted_forest_jungle_leaves", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_JUNGLE_LEAVES, "byg_jacaranda_forest_jungle_leaves", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_JUNGLE_LEAVES, "byg_red_oak_forest_jungle_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_JUNGLE_LEAVES, "byg_redwood_tropics_jungle_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_JUNGLE_LEAVES, "byg_seasonal_deciduous_forest_jungle_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_JUNGLE_LEAVES, "byg_snowy_deciduous_forest_jungle_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_JUNGLE_LEAVES, "byg_tropical_rain_forest_jungle_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_JUNGLE_LEAVES, "byg_woodlands_jungle_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_JUNGLE_LEAVES, "byg_zelkova_forest_jungle_leaves", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GROVE_JUNGLE_LEAVES, "byg_grove_jungle_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_JUNGLE_LEAVES, "byg_basalt_barrera_jungle_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_JUNGLE_LEAVES, "byg_bluff_steeps_jungle_leaves", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_JUNGLE_LEAVES, "byg_grass_land_plateau_jungle_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_JUNGLE_LEAVES, "byg_guiana_shield_jungle_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_JUNGLE_LEAVES, "byg_red_rock_mountains_jungle_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_JUNGLE_LEAVES, "byg_skyris_highlands_jungle_leaves", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_JUNGLE_LEAVES, "byg_volcano_jungle_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_JUNGLE_LEAVES, "byg_autumnal_valley_jungle_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_JUNGLE_LEAVES, "byg_cold_swamplands_jungle_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_JUNGLE_LEAVES, "byg_crimson_gardens_jungle_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_JUNGLE_LEAVES, "byg_glowstone_gardens_jungle_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_JUNGLE_LEAVES, "byg_sythian_torrids_jungle_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_JUNGLE_LEAVES, "byg_wailing_garth_jungle_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_JUNGLE_LEAVES, "byg_weeping_mire_jungle_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_JUNGLE_LEAVES, "byg_withering_woods_jungle_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_JUNGLE_LEAVES, "byg_araucaria_savanna_jungle_leaves", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_BAYOU_JUNGLE_LEAVES, "byg_bayou_jungle_leaves", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_JUNGLE_LEAVES, "byg_crag_gardens_jungle_leaves", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_JUNGLE_LEAVES, "byg_cypress_swampland_jungle_leaves", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_JUNGLE_LEAVES, "byg_fresh_water_lake_jungle_leaves", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_JUNGLE_LEAVES, "byg_great_lakes_jungle_leaves", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_JUNGLE_LEAVES, "byg_great_lakes_isles_jungle_leaves", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_JUNGLE_LEAVES, "byg_lush_tundra_jungle_leaves", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_JUNGLE_LEAVES, "byg_orchard_jungle_leaves", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_JUNGLE_LEAVES, "byg_polluted_lake_jungle_leaves", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_JUNGLE_LEAVES, "byg_prairie_jungle_leaves", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_JUNGLE_LEAVES, "byg_rose_fields_jungle_leaves", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_JUNGLE_LEAVES, "byg_shrub_lands_jungle_leaves", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_JUNGLE_LEAVES_CARPET, "byg_ancient_forest_jungle_leaves_carpet", BYGBlocks.BYG_ANCIENT_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_JUNGLE_LEAVES_CARPET, "byg_aspen_forest_jungle_leaves_carpet", BYGBlocks.BYG_ASPEN_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_JUNGLE_LEAVES_CARPET, "byg_cherry_blossom_forest_jungle_leaves_carpet", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_JUNGLE_LEAVES_CARPET, "byg_cika_woods_jungle_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, "byg_coniferous_forest_jungle_leaves_carpet", BYGBlocks.BYG_CONIFEROUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_JUNGLE_LEAVES_CARPET, "byg_deciduous_forest_jungle_leaves_carpet", BYGBlocks.BYG_DECIDUOUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_JUNGLE_LEAVES_CARPET, "byg_enchanted_forest_jungle_leaves_carpet", BYGBlocks.BYG_ENCHANTED_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_JUNGLE_LEAVES_CARPET, "byg_jacaranda_forest_jungle_leaves_carpet", BYGBlocks.BYG_JACARANDA_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_JUNGLE_LEAVES_CARPET, "byg_red_oak_forest_jungle_leaves_carpet", BYGBlocks.BYG_RED_OAK_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_JUNGLE_LEAVES_CARPET, "byg_redwood_tropics_jungle_leaves_carpet", BYGBlocks.BYG_REDWOOD_TROPICS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_JUNGLE_LEAVES_CARPET, "byg_seasonal_deciduous_forest_jungle_leaves_carpet", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_JUNGLE_LEAVES_CARPET, "byg_snowy_deciduous_forest_jungle_leaves_carpet", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_JUNGLE_LEAVES_CARPET, "byg_tropical_rain_forest_jungle_leaves_carpet", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_JUNGLE_LEAVES_CARPET, "byg_woodlands_jungle_leaves_carpet", BYGBlocks.BYG_CIKA_WOODS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_JUNGLE_LEAVES_CARPET, "byg_zelkova_forest_jungle_leaves_carpet", BYGBlocks.BYG_ZELKOVA_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_JUNGLE_LEAVES_CARPET, "byg_grove_jungle_leaves_carpet", BYGBlocks.BYG_GROVE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_JUNGLE_LEAVES_CARPET, "byg_basalt_barrera_jungle_leaves_carpet", BYGBlocks.BYG_BASALT_BARRERA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_JUNGLE_LEAVES_CARPET, "byg_bluff_steeps_jungle_leaves_carpet", BYGBlocks.BYG_BLUFF_STEEPS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_JUNGLE_LEAVES_CARPET, "byg_grass_land_plateau_jungle_leaves_carpet", BYGBlocks.BYG_GRASS_LAND_PLATEAU_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_JUNGLE_LEAVES_CARPET, "byg_guiana_shield_jungle_leaves_carpet", BYGBlocks.BYG_GUIANA_SHIELD_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_JUNGLE_LEAVES_CARPET, "byg_red_rock_mountains_jungle_leaves_carpet", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_JUNGLE_LEAVES_CARPET, "byg_skyris_highlands_jungle_leaves_carpet", BYGBlocks.BYG_SKYRIS_HIGHLANDS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_JUNGLE_LEAVES_CARPET, "byg_volcano_jungle_leaves_carpet", BYGBlocks.BYG_VOLCANO_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_JUNGLE_LEAVES_CARPET, "byg_autumnal_valley_jungle_leaves_carpet", BYGBlocks.BYG_AUTUMNAL_VALLEY_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_JUNGLE_LEAVES_CARPET, "byg_cold_swamplands_jungle_leaves_carpet", BYGBlocks.BYG_COLD_SWAMPLANDS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_JUNGLE_LEAVES_CARPET, "byg_crimson_gardens_jungle_leaves_carpet", BYGBlocks.BYG_CRIMSON_GARDENS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_JUNGLE_LEAVES_CARPET, "byg_glowstone_gardens_jungle_leaves_carpet", BYGBlocks.BYG_GLOWSTONE_GARDENS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_JUNGLE_LEAVES_CARPET, "byg_sythian_torrids_jungle_leaves_carpet", BYGBlocks.BYG_SYTHIAN_TORRIDS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_JUNGLE_LEAVES_CARPET, "byg_wailing_garth_jungle_leaves_carpet", BYGBlocks.BYG_WAILING_GARTH_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_JUNGLE_LEAVES_CARPET, "byg_weeping_mire_jungle_leaves_carpet", BYGBlocks.BYG_WEEPING_MIRE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_JUNGLE_LEAVES_CARPET, "byg_withering_woods_jungle_leaves_carpet", BYGBlocks.BYG_WITHERING_WOODS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_JUNGLE_LEAVES_CARPET, "byg_araucaria_savanna_jungle_leaves_carpet", BYGBlocks.BYG_ARAUCARIA_SAVANNA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_JUNGLE_LEAVES_CARPET, "byg_bayou_jungle_leaves_carpet", BYGBlocks.BYG_BAYOU_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_JUNGLE_LEAVES_CARPET, "byg_crag_gardens_jungle_leaves_carpet", BYGBlocks.BYG_CRAG_GARDENS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_JUNGLE_LEAVES_CARPET, "byg_cypress_swampland_jungle_leaves_carpet", BYGBlocks.BYG_CYPRESS_SWAMPLAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_JUNGLE_LEAVES_CARPET, "byg_fresh_water_lake_jungle_leaves_carpet", BYGBlocks.BYG_FRESH_WATER_LAKE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_JUNGLE_LEAVES_CARPET, "byg_great_lakes_jungle_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_JUNGLE_LEAVES_CARPET, "byg_great_lakes_isles_jungle_leaves_carpet", BYGBlocks.BYG_GREAT_LAKES_ISLES_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_JUNGLE_LEAVES_CARPET, "byg_lush_tundra_jungle_leaves_carpet", BYGBlocks.BYG_LUSH_TUNDRA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_JUNGLE_LEAVES_CARPET, "byg_orchard_jungle_leaves_carpet", BYGBlocks.BYG_ORCHARD_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_JUNGLE_LEAVES_CARPET, "byg_polluted_lake_jungle_leaves_carpet", BYGBlocks.BYG_POLLUTED_LAKE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_JUNGLE_LEAVES_CARPET, "byg_prairie_jungle_leaves_carpet", BYGBlocks.BYG_PRAIRIE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_JUNGLE_LEAVES_CARPET, "byg_rose_fields_jungle_leaves_carpet", BYGBlocks.BYG_ROSE_FIELDS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_JUNGLE_LEAVES_CARPET, "byg_shrub_lands_jungle_leaves_carpet", BYGBlocks.BYG_SHRUB_LANDS_JUNGLE_LEAVES, "jungle_leaves_carpet");

        baseBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_GRASS_BLOCK, "byg_ancient_forest_grass_block", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_GRASS_BLOCK, "byg_aspen_forest_grass_block", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_GRASS_BLOCK, "byg_cherry_blossom_forest_grass_block", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_GRASS_BLOCK, "byg_cika_woods_grass_block", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS_BLOCK, "byg_coniferous_forest_grass_block", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS_BLOCK, "byg_deciduous_forest_grass_block", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_GRASS_BLOCK, "byg_enchanted_forest_grass_block", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_GRASS_BLOCK, "byg_jacaranda_forest_grass_block", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_GRASS_BLOCK, "byg_red_oak_forest_grass_block", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_GRASS_BLOCK, "byg_redwood_tropics_grass_block", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_BLOCK, "byg_seasonal_deciduous_forest_grass_block", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS_BLOCK, "byg_snowy_deciduous_forest_grass_block", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS_BLOCK, "byg_tropical_rain_forest_grass_block", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_GRASS_BLOCK, "byg_woodlands_grass_block", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_GRASS_BLOCK, "byg_zelkova_forest_grass_block", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_GROVE_GRASS_BLOCK, "byg_grove_grass_block", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_GRASS_BLOCK, "byg_basalt_barrera_grass_block", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_GRASS_BLOCK, "byg_bluff_steeps_grass_block", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS_BLOCK, "byg_grass_land_plateau_grass_block", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_GRASS_BLOCK, "byg_guiana_shield_grass_block", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS_BLOCK, "byg_red_rock_mountains_grass_block", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS_BLOCK, "byg_skyris_highlands_grass_block", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_GRASS_BLOCK, "byg_volcano_grass_block", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS_BLOCK, "byg_autumnal_valley_grass_block", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS_BLOCK, "byg_cold_swamplands_grass_block", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_GRASS_BLOCK, "byg_crimson_gardens_grass_block", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS_BLOCK, "byg_glowstone_gardens_grass_block", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS_BLOCK, "byg_sythian_torrids_grass_block", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_GRASS_BLOCK, "byg_wailing_garth_grass_block", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_GRASS_BLOCK, "byg_weeping_mire_grass_block", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_GRASS_BLOCK, "byg_withering_woods_grass_block", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS_BLOCK, "byg_araucaria_savanna_grass_block", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_BAYOU_GRASS_BLOCK, "byg_bayou_grass_block", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_GRASS_BLOCK, "byg_crag_gardens_grass_block", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS_BLOCK, "byg_cypress_swampland_grass_block", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS_BLOCK, "byg_fresh_water_lake_grass_block", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_GRASS_BLOCK, "byg_great_lakes_grass_block", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_GRASS_BLOCK, "byg_lush_tundra_grass_block", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_GRASS_BLOCK, "byg_orchard_grass_block", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_GRASS_BLOCK, "byg_polluted_lake_grass_block", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_GRASS_BLOCK, "byg_prairie_grass_block", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_GRASS_BLOCK, "byg_rose_fields_grass_block", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_GRASS_BLOCK, "byg_shrub_lands_grass_block", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");

        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ANCIENT_FOREST_GRASS_BLOCK, "glowing_byg_ancient_forest_grass_block", BYGBlocks.BYG_ANCIENT_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ASPEN_FOREST_GRASS_BLOCK, "glowing_byg_aspen_forest_grass_block", BYGBlocks.BYG_ASPEN_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_CHERRY_BLOSSOM_FOREST_GRASS_BLOCK, "glowing_byg_cherry_blossom_forest_grass_block", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_CIKA_WOODS_GRASS_BLOCK, "glowing_byg_cika_woods_grass_block", BYGBlocks.BYG_CIKA_WOODS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_byg_coniferous_forest_grass_block", BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_DECIDUOUS_FOREST_GRASS_BLOCK, "glowing_byg_deciduous_forest_grass_block", BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ENCHANTED_FOREST_GRASS_BLOCK, "glowing_byg_enchanted_forest_grass_block", BYGBlocks.BYG_ENCHANTED_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_JACARANDA_FOREST_GRASS_BLOCK, "glowing_byg_jacaranda_forest_grass_block", BYGBlocks.BYG_JACARANDA_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_RED_OAK_FOREST_GRASS_BLOCK, "glowing_byg_red_oak_forest_grass_block", BYGBlocks.BYG_RED_OAK_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_REDWOOD_TROPICS_GRASS_BLOCK, "glowing_byg_redwood_tropics_grass_block", BYGBlocks.BYG_REDWOOD_TROPICS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_BLOCK, "glowing_byg_seasonal_deciduous_forest_grass_block", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_SNOWY_DECIDUOUS_FOREST_GRASS_BLOCK, "glowing_byg_snowy_deciduous_forest_grass_block", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_TROPICAL_RAIN_FOREST_GRASS_BLOCK, "glowing_byg_tropical_rain_forest_grass_block", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_WOODLANDS_GRASS_BLOCK, "glowing_byg_woodlands_grass_block", BYGBlocks.BYG_CIKA_WOODS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ZELKOVA_FOREST_GRASS_BLOCK, "glowing_byg_zelkova_forest_grass_block", BYGBlocks.BYG_ZELKOVA_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_GROVE_GRASS_BLOCK, "glowing_byg_grove_grass_block", BYGBlocks.BYG_GROVE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_BASALT_BARRERA_GRASS_BLOCK, "glowing_byg_basalt_barrera_grass_block", BYGBlocks.BYG_BASALT_BARRERA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_BLUFF_STEEPS_GRASS_BLOCK, "glowing_byg_bluff_steeps_grass_block", BYGBlocks.BYG_BLUFF_STEEPS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_GRASS_LAND_PLATEAU_GRASS_BLOCK, "glowing_byg_grass_land_plateau_grass_block", BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_GUIANA_SHIELD_GRASS_BLOCK, "glowing_byg_guiana_shield_grass_block", BYGBlocks.BYG_GUIANA_SHIELD_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_RED_ROCK_MOUNTAINS_GRASS_BLOCK, "glowing_byg_red_rock_mountains_grass_block", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_SKYRIS_HIGHLANDS_GRASS_BLOCK, "glowing_byg_skyris_highlands_grass_block", BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_VOLCANO_GRASS_BLOCK, "glowing_byg_volcano_grass_block", BYGBlocks.BYG_VOLCANO_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_AUTUMNAL_VALLEY_GRASS_BLOCK, "glowing_byg_autumnal_valley_grass_block", BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_COLD_SWAMPLANDS_GRASS_BLOCK, "glowing_byg_cold_swamplands_grass_block", BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_CRIMSON_GARDENS_GRASS_BLOCK, "glowing_byg_crimson_gardens_grass_block", BYGBlocks.BYG_CRIMSON_GARDENS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_GLOWSTONE_GARDENS_GRASS_BLOCK, "glowing_byg_glowstone_gardens_grass_block", BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_SYTHIAN_TORRIDS_GRASS_BLOCK, "glowing_byg_sythian_torrids_grass_block", BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_WAILING_GARTH_GRASS_BLOCK, "glowing_byg_wailing_garth_grass_block", BYGBlocks.BYG_WAILING_GARTH_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_WEEPING_MIRE_GRASS_BLOCK, "glowing_byg_weeping_mire_grass_block", BYGBlocks.BYG_WEEPING_MIRE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_WITHERING_WOODS_GRASS_BLOCK, "glowing_byg_withering_woods_grass_block", BYGBlocks.BYG_WITHERING_WOODS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ARAUCARIA_SAVANNA_GRASS_BLOCK, "glowing_byg_araucaria_savanna_grass_block", BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_BAYOU_GRASS_BLOCK, "glowing_byg_bayou_grass_block", BYGBlocks.BYG_BAYOU_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_CRAG_GARDENS_GRASS_BLOCK, "glowing_byg_crag_gardens_grass_block", BYGBlocks.BYG_CRAG_GARDENS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_CYPRESS_SWAMPLAND_GRASS_BLOCK, "glowing_byg_cypress_swampland_grass_block", BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_FRESH_WATER_LAKE_GRASS_BLOCK, "glowing_byg_fresh_water_lake_grass_block", BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_GREAT_LAKES_GRASS_BLOCK, "glowing_byg_great_lakes_grass_block", BYGBlocks.BYG_GREAT_LAKES_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_LUSH_TUNDRA_GRASS_BLOCK, "glowing_byg_lush_tundra_grass_block", BYGBlocks.BYG_LUSH_TUNDRA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ORCHARD_GRASS_BLOCK, "glowing_byg_orchard_grass_block", BYGBlocks.BYG_ORCHARD_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_POLLUTED_LAKE_GRASS_BLOCK, "glowing_byg_polluted_lake_grass_block", BYGBlocks.BYG_POLLUTED_LAKE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_PRAIRIE_GRASS_BLOCK, "glowing_byg_prairie_grass_block", BYGBlocks.BYG_PRAIRIE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_ROSE_FIELDS_GRASS_BLOCK, "glowing_byg_rose_fields_grass_block", BYGBlocks.BYG_ROSE_FIELDS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BYGBlocks.GLOWING_BYG_SHRUB_LANDS_GRASS_BLOCK, "glowing_byg_shrub_lands_grass_block", BYGBlocks.BYG_SHRUB_LANDS_GRASS_BLOCK, "glowing_grass_blocks");

        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_GRASS_SLAB, "byg_ancient_forest_grass_slab", BYGBlocks.BYG_ANCIENT_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_GRASS_SLAB, "byg_aspen_forest_grass_slab", BYGBlocks.BYG_ASPEN_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_GRASS_SLAB, "byg_cherry_blossom_forest_grass_slab", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_GRASS_SLAB, "byg_cika_woods_grass_slab", BYGBlocks.BYG_CIKA_WOODS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS_SLAB, "byg_coniferous_forest_grass_slab", BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS_SLAB, "byg_deciduous_forest_grass_slab", BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_GRASS_SLAB, "byg_enchanted_forest_grass_slab", BYGBlocks.BYG_ENCHANTED_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_GRASS_SLAB, "byg_jacaranda_forest_grass_slab", BYGBlocks.BYG_JACARANDA_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_GRASS_SLAB, "byg_red_oak_forest_grass_slab", BYGBlocks.BYG_RED_OAK_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_GRASS_SLAB, "byg_redwood_tropics_grass_slab", BYGBlocks.BYG_REDWOOD_TROPICS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_SLAB, "byg_seasonal_deciduous_forest_grass_slab", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS_SLAB, "byg_snowy_deciduous_forest_grass_slab", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS_SLAB, "byg_tropical_rain_forest_grass_slab", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_GRASS_SLAB, "byg_woodlands_grass_slab", BYGBlocks.BYG_CIKA_WOODS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_GRASS_SLAB, "byg_zelkova_forest_grass_slab", BYGBlocks.BYG_ZELKOVA_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_GRASS_SLAB, "byg_grove_grass_slab", BYGBlocks.BYG_GROVE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_GRASS_SLAB, "byg_basalt_barrera_grass_slab", BYGBlocks.BYG_BASALT_BARRERA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_GRASS_SLAB, "byg_bluff_steeps_grass_slab", BYGBlocks.BYG_BLUFF_STEEPS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS_SLAB, "byg_grass_land_plateau_grass_slab", BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_GRASS_SLAB, "byg_guiana_shield_grass_slab", BYGBlocks.BYG_GUIANA_SHIELD_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS_SLAB, "byg_red_rock_mountains_grass_slab", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS_SLAB, "byg_skyris_highlands_grass_slab", BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_GRASS_SLAB, "byg_volcano_grass_slab", BYGBlocks.BYG_VOLCANO_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS_SLAB, "byg_autumnal_valley_grass_slab", BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS_SLAB, "byg_cold_swamplands_grass_slab", BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_GRASS_SLAB, "byg_crimson_gardens_grass_slab", BYGBlocks.BYG_CRIMSON_GARDENS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS_SLAB, "byg_glowstone_gardens_grass_slab", BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS_SLAB, "byg_sythian_torrids_grass_slab", BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_GRASS_SLAB, "byg_wailing_garth_grass_slab", BYGBlocks.BYG_WAILING_GARTH_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_GRASS_SLAB, "byg_weeping_mire_grass_slab", BYGBlocks.BYG_WEEPING_MIRE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_GRASS_SLAB, "byg_withering_woods_grass_slab", BYGBlocks.BYG_WITHERING_WOODS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS_SLAB, "byg_araucaria_savanna_grass_slab", BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_GRASS_SLAB, "byg_bayou_grass_slab", BYGBlocks.BYG_BAYOU_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_GRASS_SLAB, "byg_crag_gardens_grass_slab", BYGBlocks.BYG_CRAG_GARDENS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS_SLAB, "byg_cypress_swampland_grass_slab", BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS_SLAB, "byg_fresh_water_lake_grass_slab", BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_GRASS_SLAB, "byg_great_lakes_grass_slab", BYGBlocks.BYG_GREAT_LAKES_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_GRASS_SLAB, "byg_lush_tundra_grass_slab", BYGBlocks.BYG_LUSH_TUNDRA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_GRASS_SLAB, "byg_orchard_grass_slab", BYGBlocks.BYG_ORCHARD_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_GRASS_SLAB, "byg_polluted_lake_grass_slab", BYGBlocks.BYG_POLLUTED_LAKE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_GRASS_SLAB, "byg_prairie_grass_slab", BYGBlocks.BYG_PRAIRIE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_GRASS_SLAB, "byg_rose_fields_grass_slab", BYGBlocks.BYG_ROSE_FIELDS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_GRASS_SLAB, "byg_shrub_lands_grass_slab", BYGBlocks.BYG_SHRUB_LANDS_GRASS_BLOCK, "grass_slab_blocks");

        plantBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_GRASS, "byg_ancient_forest_grass", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_GRASS, "byg_aspen_forest_grass", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_GRASS, "byg_cherry_blossom_forest_grass", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_GRASS, "byg_cika_woods_grass", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS, "byg_coniferous_forest_grass", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS, "byg_deciduous_forest_grass", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_GRASS, "byg_enchanted_forest_grass", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_GRASS, "byg_jacaranda_forest_grass", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_GRASS, "byg_red_oak_forest_grass", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_GRASS, "byg_redwood_tropics_grass", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS, "byg_seasonal_deciduous_forest_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS, "byg_snowy_deciduous_forest_grass", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS, "byg_tropical_rain_forest_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_GRASS, "byg_woodlands_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_GRASS, "byg_zelkova_forest_grass", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_GROVE_GRASS, "byg_grove_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_GRASS, "byg_basalt_barrera_grass", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_GRASS, "byg_bluff_steeps_grass", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS, "byg_grass_land_plateau_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_GRASS, "byg_guiana_shield_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS, "byg_red_rock_mountains_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS, "byg_skyris_highlands_grass", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_GRASS, "byg_volcano_grass", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS, "byg_autumnal_valley_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS, "byg_cold_swamplands_grass", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_GRASS, "byg_crimson_gardens_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS, "byg_glowstone_gardens_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS, "byg_sythian_torrids_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_GRASS, "byg_wailing_garth_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_GRASS, "byg_weeping_mire_grass", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_GRASS, "byg_withering_woods_grass", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS, "byg_araucaria_savanna_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_BAYOU_GRASS, "byg_bayou_grass", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_GRASS, "byg_crag_gardens_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS, "byg_cypress_swampland_grass", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS, "byg_fresh_water_lake_grass", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_GRASS, "byg_great_lakes_grass", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        //plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_GRASS, "byg_great_lakes_isles_grass", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_GRASS, "byg_lush_tundra_grass", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_GRASS, "byg_orchard_grass", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_GRASS, "byg_polluted_lake_grass", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_GRASS, "byg_prairie_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_GRASS, "byg_rose_fields_grass", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_GRASS, "byg_shrub_lands_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.GRASS, "grass");

        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ANCIENT_FOREST_GRASS, "tall_byg_ancient_forest_grass", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ASPEN_FOREST_GRASS, "tall_byg_aspen_forest_grass", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_CHERRY_BLOSSOM_FOREST_GRASS, "tall_byg_cherry_blossom_forest_grass", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_CIKA_WOODS_GRASS, "tall_byg_cika_woods_grass", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_CONIFEROUS_FOREST_GRASS, "tall_byg_coniferous_forest_grass", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_DECIDUOUS_FOREST_GRASS, "tall_byg_deciduous_forest_grass", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ENCHANTED_FOREST_GRASS, "tall_byg_enchanted_forest_grass", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_JACARANDA_FOREST_GRASS, "tall_byg_jacaranda_forest_grass", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_RED_OAK_FOREST_GRASS, "tall_byg_red_oak_forest_grass", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_REDWOOD_TROPICS_GRASS, "tall_byg_redwood_tropics_grass", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_SEASONAL_DECIDUOUS_FOREST_GRASS, "tall_byg_seasonal_deciduous_forest_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_SNOWY_DECIDUOUS_FOREST_GRASS, "tall_byg_snowy_deciduous_forest_grass", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_TROPICAL_RAIN_FOREST_GRASS, "tall_byg_tropical_rain_forest_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_WOODLANDS_GRASS, "tall_byg_woodlands_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ZELKOVA_FOREST_GRASS, "tall_byg_zelkova_forest_grass", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_GROVE_GRASS, "tall_byg_grove_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_BASALT_BARRERA_GRASS, "tall_byg_basalt_barrera_grass", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_BLUFF_STEEPS_GRASS, "tall_byg_bluff_steeps_grass", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_GRASS_LAND_PLATEAU_GRASS, "tall_byg_grass_land_plateau_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_GUIANA_SHIELD_GRASS, "tall_byg_guiana_shield_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_RED_ROCK_MOUNTAINS_GRASS, "tall_byg_red_rock_mountains_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_SKYRIS_HIGHLANDS_GRASS, "tall_byg_skyris_highlands_grass", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_VOLCANO_GRASS, "tall_byg_volcano_grass", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_AUTUMNAL_VALLEY_GRASS, "tall_byg_autumnal_valley_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_COLD_SWAMPLANDS_GRASS, "tall_byg_cold_swamplands_grass", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_CRIMSON_GARDENS_GRASS, "tall_byg_crimson_gardens_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_GLOWSTONE_GARDENS_GRASS, "tall_byg_glowstone_gardens_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_SYTHIAN_TORRIDS_GRASS, "tall_byg_sythian_torrids_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_WAILING_GARTH_GRASS, "tall_byg_wailing_garth_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_WEEPING_MIRE_GRASS, "tall_byg_weeping_mire_grass", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_WITHERING_WOODS_GRASS, "tall_byg_withering_woods_grass", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ARAUCARIA_SAVANNA_GRASS, "tall_byg_araucaria_savanna_grass", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_BAYOU_GRASS, "tall_byg_bayou_grass", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_CRAG_GARDENS_GRASS, "tall_byg_crag_gardens_grass", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_CYPRESS_SWAMPLAND_GRASS, "tall_byg_cypress_swampland_grass", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_FRESH_WATER_LAKE_GRASS, "tall_byg_fresh_water_lake_grass", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_GREAT_LAKES_GRASS, "tall_byg_great_lakes_grass", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        //plantBlockPlus(consumer, BYGBlocks.TALL_BYG_GREAT_LAKES_ISLES_GRASS, "tall_byg_great_lakes_isles_grass", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_LUSH_TUNDRA_GRASS, "tall_byg_lush_tundra_grass", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ORCHARD_GRASS, "tall_byg_orchard_grass", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_POLLUTED_LAKE_GRASS, "tall_byg_polluted_lake_grass", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_PRAIRIE_GRASS, "tall_byg_prairie_grass", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_ROSE_FIELDS_GRASS, "tall_byg_rose_fields_grass", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BYGBlocks.TALL_BYG_SHRUB_LANDS_GRASS, "tall_byg_shrub_lands_grass", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");

        plantBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_FERN, "byg_ancient_forest_fern", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_FERN, "byg_aspen_forest_fern", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_FERN, "byg_cherry_blossom_forest_fern", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_FERN, "byg_cika_woods_fern", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_FERN, "byg_coniferous_forest_fern", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_FERN, "byg_deciduous_forest_fern", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_FERN, "byg_enchanted_forest_fern", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_FERN, "byg_jacaranda_forest_fern", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_FERN, "byg_red_oak_forest_fern", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_FERN, "byg_redwood_tropics_fern", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_FERN, "byg_seasonal_deciduous_forest_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_FERN, "byg_snowy_deciduous_forest_fern", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_FERN, "byg_tropical_rain_forest_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_FERN, "byg_woodlands_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_FERN, "byg_zelkova_forest_fern", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_GROVE_FERN, "byg_grove_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_FERN, "byg_basalt_barrera_fern", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_FERN, "byg_bluff_steeps_fern", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_FERN, "byg_grass_land_plateau_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_FERN, "byg_guiana_shield_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_FERN, "byg_red_rock_mountains_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_FERN, "byg_skyris_highlands_fern", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_FERN, "byg_volcano_fern", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_FERN, "byg_autumnal_valley_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_FERN, "byg_cold_swamplands_fern", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_FERN, "byg_crimson_gardens_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_FERN, "byg_glowstone_gardens_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_FERN, "byg_sythian_torrids_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_FERN, "byg_wailing_garth_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_FERN, "byg_weeping_mire_fern", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_FERN, "byg_withering_woods_fern", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_FERN, "byg_araucaria_savanna_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_BAYOU_FERN, "byg_bayou_fern", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_FERN, "byg_crag_gardens_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_FERN, "byg_cypress_swampland_fern", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_FERN, "byg_fresh_water_lake_fern", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_FERN, "byg_great_lakes_fern", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        //plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_FERN, "byg_great_lakes_isles_fern", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_FERN, "byg_lush_tundra_fern", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_FERN, "byg_orchard_fern", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_FERN, "byg_polluted_lake_fern", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_FERN, "byg_prairie_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_FERN, "byg_rose_fields_fern", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_FERN, "byg_shrub_lands_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FERNS, "ferns");

        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ANCIENT_FOREST_FERN, "large_byg_ancient_forest_fern", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ASPEN_FOREST_FERN, "large_byg_aspen_forest_fern", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_CHERRY_BLOSSOM_FOREST_FERN, "large_byg_cherry_blossom_forest_fern", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_CIKA_WOODS_FERN, "large_byg_cika_woods_fern", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_CONIFEROUS_FOREST_FERN, "large_byg_coniferous_forest_fern", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_DECIDUOUS_FOREST_FERN, "large_byg_deciduous_forest_fern", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ENCHANTED_FOREST_FERN, "large_byg_enchanted_forest_fern", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_JACARANDA_FOREST_FERN, "large_byg_jacaranda_forest_fern", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_RED_OAK_FOREST_FERN, "large_byg_red_oak_forest_fern", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_REDWOOD_TROPICS_FERN, "large_byg_redwood_tropics_fern", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_SEASONAL_DECIDUOUS_FOREST_FERN, "large_byg_seasonal_deciduous_forest_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_SNOWY_DECIDUOUS_FOREST_FERN, "large_byg_snowy_deciduous_forest_fern", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_TROPICAL_RAIN_FOREST_FERN, "large_byg_tropical_rain_forest_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_WOODLANDS_FERN, "large_byg_woodlands_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ZELKOVA_FOREST_FERN, "large_byg_zelkova_forest_fern", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_GROVE_FERN, "large_byg_grove_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_BASALT_BARRERA_FERN, "large_byg_basalt_barrera_fern", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_BLUFF_STEEPS_FERN, "large_byg_bluff_steeps_fern", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_GRASS_LAND_PLATEAU_FERN, "large_byg_grass_land_plateau_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_GUIANA_SHIELD_FERN, "large_byg_guiana_shield_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_RED_ROCK_MOUNTAINS_FERN, "large_byg_red_rock_mountains_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_SKYRIS_HIGHLANDS_FERN, "large_byg_skyris_highlands_fern", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_VOLCANO_FERN, "large_byg_volcano_fern", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_AUTUMNAL_VALLEY_FERN, "large_byg_autumnal_valley_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_COLD_SWAMPLANDS_FERN, "large_byg_cold_swamplands_fern", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_CRIMSON_GARDENS_FERN, "large_byg_crimson_gardens_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_GLOWSTONE_GARDENS_FERN, "large_byg_glowstone_gardens_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_SYTHIAN_TORRIDS_FERN, "large_byg_sythian_torrids_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_WAILING_GARTH_FERN, "large_byg_wailing_garth_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_WEEPING_MIRE_FERN, "large_byg_weeping_mire_fern", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_WITHERING_WOODS_FERN, "large_byg_withering_woods_fern", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ARAUCARIA_SAVANNA_FERN, "large_byg_araucaria_savanna_fern", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_BAYOU_FERN, "large_byg_bayou_fern", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_CRAG_GARDENS_FERN, "large_byg_crag_gardens_fern", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_CYPRESS_SWAMPLAND_FERN, "large_byg_cypress_swampland_fern", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_FRESH_WATER_LAKE_FERN, "large_byg_fresh_water_lake_fern", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_GREAT_LAKES_FERN, "large_byg_great_lakes_fern", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_LUSH_TUNDRA_FERN, "large_byg_lush_tundra_fern", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ORCHARD_FERN, "large_byg_orchard_fern", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_POLLUTED_LAKE_FERN, "large_byg_polluted_lake_fern", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_PRAIRIE_FERN, "large_byg_prairie_fern", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_ROSE_FIELDS_FERN, "large_byg_rose_fields_fern", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BYGBlocks.LARGE_BYG_SHRUB_LANDS_FERN, "large_byg_shrub_lands_fern", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");

        plantBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_VINE, "byg_ancient_forest_vine", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_VINE, "byg_aspen_forest_vine", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_VINE, "byg_cherry_blossom_forest_vine", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_VINE, "byg_cika_woods_vine", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_VINE, "byg_coniferous_forest_vine", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_VINE, "byg_deciduous_forest_vine", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_VINE, "byg_enchanted_forest_vine", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_VINE, "byg_jacaranda_forest_vine", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_VINE, "byg_red_oak_forest_vine", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_VINE, "byg_redwood_tropics_vine", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_VINE, "byg_seasonal_deciduous_forest_vine", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_VINE, "byg_snowy_deciduous_forest_vine", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_VINE, "byg_tropical_rain_forest_vine", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_VINE, "byg_woodlands_vine", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_VINE, "byg_zelkova_forest_vine", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_GROVE_VINE, "byg_grove_vine", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_VINE, "byg_basalt_barrera_vine", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_VINE, "byg_bluff_steeps_vine", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_VINE, "byg_grass_land_plateau_vine", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_VINE, "byg_guiana_shield_vine", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_VINE, "byg_red_rock_mountains_vine", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_VINE, "byg_skyris_highlands_vine", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_VINE, "byg_volcano_vine", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_VINE, "byg_autumnal_valley_vine", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_VINE, "byg_cold_swamplands_vine", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_VINE, "byg_crimson_gardens_vine", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_VINE, "byg_glowstone_gardens_vine", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_VINE, "byg_sythian_torrids_vine", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_VINE, "byg_wailing_garth_vine", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_VINE, "byg_weeping_mire_vine", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_VINE, "byg_withering_woods_vine", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_VINE, "byg_araucaria_savanna_vine", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_BAYOU_VINE, "byg_bayou_vine", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_VINE, "byg_crag_gardens_vine", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_VINE, "byg_cypress_swampland_vine", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_VINE, "byg_fresh_water_lake_vine", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_VINE, "byg_great_lakes_vine", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_ISLES_VINE, "byg_great_lakes_isles_vine", ARFOItems.SNOWY_BEACH_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_VINE, "byg_lush_tundra_vine", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_VINE, "byg_orchard_vine", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_VINE, "byg_polluted_lake_vine", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_VINE, "byg_prairie_vine", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_VINE, "byg_rose_fields_vine", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_VINE, "byg_shrub_lands_vine", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.VINES, "vines");

        plantBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_SUGAR_CANE, "byg_ancient_forest_sugar_cane", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_SUGAR_CANE, "byg_aspen_forest_sugar_cane", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_SUGAR_CANE, "byg_cherry_blossom_forest_sugar_cane", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_SUGAR_CANE, "byg_cika_woods_sugar_cane", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_SUGAR_CANE, "byg_coniferous_forest_sugar_cane", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_SUGAR_CANE, "byg_deciduous_forest_sugar_cane", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_SUGAR_CANE, "byg_enchanted_forest_sugar_cane", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_SUGAR_CANE, "byg_jacaranda_forest_sugar_cane", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_SUGAR_CANE, "byg_red_oak_forest_sugar_cane", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_SUGAR_CANE, "byg_redwood_tropics_sugar_cane", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_SUGAR_CANE, "byg_seasonal_deciduous_forest_sugar_cane", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_SUGAR_CANE, "byg_snowy_deciduous_forest_sugar_cane", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_SUGAR_CANE, "byg_tropical_rain_forest_sugar_cane", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_SUGAR_CANE, "byg_woodlands_sugar_cane", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_SUGAR_CANE, "byg_zelkova_forest_sugar_cane", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_GROVE_SUGAR_CANE, "byg_grove_sugar_cane", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_SUGAR_CANE, "byg_basalt_barrera_sugar_cane", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_SUGAR_CANE, "byg_bluff_steeps_sugar_cane", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_SUGAR_CANE, "byg_grass_land_plateau_sugar_cane", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_SUGAR_CANE, "byg_guiana_shield_sugar_cane", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_SUGAR_CANE, "byg_red_rock_mountains_sugar_cane", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_SUGAR_CANE, "byg_skyris_highlands_sugar_cane", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_SUGAR_CANE, "byg_volcano_sugar_cane", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_SUGAR_CANE, "byg_autumnal_valley_sugar_cane", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_SUGAR_CANE, "byg_cold_swamplands_sugar_cane", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_SUGAR_CANE, "byg_crimson_gardens_sugar_cane", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_SUGAR_CANE, "byg_glowstone_gardens_sugar_cane", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_SUGAR_CANE, "byg_sythian_torrids_sugar_cane", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_SUGAR_CANE, "byg_wailing_garth_sugar_cane", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_SUGAR_CANE, "byg_weeping_mire_sugar_cane", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_SUGAR_CANE, "byg_withering_woods_sugar_cane", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_SUGAR_CANE, "byg_araucaria_savanna_sugar_cane", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_BAYOU_SUGAR_CANE, "byg_bayou_sugar_cane", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_SUGAR_CANE, "byg_crag_gardens_sugar_cane", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_SUGAR_CANE, "byg_cypress_swampland_sugar_cane", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_SUGAR_CANE, "byg_fresh_water_lake_sugar_cane", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_SUGAR_CANE, "byg_great_lakes_sugar_cane", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_SUGAR_CANE, "byg_lush_tundra_sugar_cane", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_SUGAR_CANE, "byg_orchard_sugar_cane", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_SUGAR_CANE, "byg_polluted_lake_sugar_cane", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_SUGAR_CANE, "byg_prairie_sugar_cane", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_SUGAR_CANE, "byg_rose_fields_sugar_cane", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_SUGAR_CANE, "byg_shrub_lands_sugar_cane", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");


        overgrownBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_STONE, "byg_ancient_forest_overgrown_stone", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_STONE, "byg_aspen_forest_overgrown_stone", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_STONE, "byg_cherry_blossom_forest_overgrown_stone", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_STONE, "byg_cika_woods_overgrown_stone", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_STONE, "byg_coniferous_forest_overgrown_stone", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_STONE, "byg_deciduous_forest_overgrown_stone", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_STONE, "byg_enchanted_forest_overgrown_stone", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_STONE, "byg_jacaranda_forest_overgrown_stone", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_STONE, "byg_red_oak_forest_overgrown_stone", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_STONE, "byg_redwood_tropics_overgrown_stone", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_STONE, "byg_seasonal_deciduous_forest_overgrown_stone", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_STONE, "byg_snowy_deciduous_forest_overgrown_stone", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_STONE, "byg_tropical_rain_forest_overgrown_stone", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_OVERGROWN_STONE, "byg_woodlands_overgrown_stone", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_STONE, "byg_zelkova_forest_overgrown_stone", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GROVE_OVERGROWN_STONE, "byg_grove_overgrown_stone", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_STONE, "byg_basalt_barrera_overgrown_stone", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_STONE, "byg_bluff_steeps_overgrown_stone", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_STONE, "byg_grass_land_plateau_overgrown_stone", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_STONE, "byg_guiana_shield_overgrown_stone", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_STONE, "byg_red_rock_mountains_overgrown_stone", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_STONE, "byg_skyris_highlands_overgrown_stone", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_OVERGROWN_STONE, "byg_volcano_overgrown_stone", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_STONE, "byg_autumnal_valley_overgrown_stone", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_STONE, "byg_cold_swamplands_overgrown_stone", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_STONE, "byg_crimson_gardens_overgrown_stone", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_STONE, "byg_glowstone_gardens_overgrown_stone", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_STONE, "byg_sythian_torrids_overgrown_stone", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_STONE, "byg_wailing_garth_overgrown_stone", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_STONE, "byg_weeping_mire_overgrown_stone", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_STONE, "byg_withering_woods_overgrown_stone", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_STONE, "byg_araucaria_savanna_overgrown_stone", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BAYOU_OVERGROWN_STONE, "byg_bayou_overgrown_stone", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_STONE, "byg_crag_gardens_overgrown_stone", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_STONE, "byg_cypress_swampland_overgrown_stone", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_STONE, "byg_fresh_water_lake_overgrown_stone", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_STONE, "byg_great_lakes_overgrown_stone", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_STONE, "byg_lush_tundra_overgrown_stone", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_OVERGROWN_STONE, "byg_orchard_overgrown_stone", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_STONE, "byg_polluted_lake_overgrown_stone", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_OVERGROWN_STONE, "byg_prairie_overgrown_stone", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_STONE, "byg_rose_fields_overgrown_stone", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_STONE, "byg_shrub_lands_overgrown_stone", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.STONE, "overgrown_stone");

        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_STONE_SLAB, "byg_ancient_forest_overgrown_stone_slab", BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_STONE_SLAB, "byg_aspen_forest_overgrown_stone_slab", BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_STONE_SLAB, "byg_cherry_blossom_forest_overgrown_stone_slab", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_STONE_SLAB, "byg_cika_woods_overgrown_stone_slab", BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_STONE_SLAB, "byg_coniferous_forest_overgrown_stone_slab", BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_STONE_SLAB, "byg_deciduous_forest_overgrown_stone_slab", BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_STONE_SLAB, "byg_enchanted_forest_overgrown_stone_slab", BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_STONE_SLAB, "byg_jacaranda_forest_overgrown_stone_slab", BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_STONE_SLAB, "byg_red_oak_forest_overgrown_stone_slab", BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_STONE_SLAB, "byg_redwood_tropics_overgrown_stone_slab", BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_STONE_SLAB, "byg_seasonal_deciduous_forest_overgrown_stone_slab", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_STONE_SLAB, "byg_snowy_deciduous_forest_overgrown_stone_slab", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_STONE_SLAB, "byg_tropical_rain_forest_overgrown_stone_slab", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_OVERGROWN_STONE_SLAB, "byg_woodlands_overgrown_stone_slab", BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_STONE_SLAB, "byg_zelkova_forest_overgrown_stone_slab", BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_OVERGROWN_STONE_SLAB, "byg_grove_overgrown_stone_slab", BYGBlocks.BYG_GROVE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_STONE_SLAB, "byg_basalt_barrera_overgrown_stone_slab", BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_STONE_SLAB, "byg_bluff_steeps_overgrown_stone_slab", BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_STONE_SLAB, "byg_grass_land_plateau_overgrown_stone_slab", BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_STONE_SLAB, "byg_guiana_shield_overgrown_stone_slab", BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_STONE_SLAB, "byg_red_rock_mountains_overgrown_stone_slab", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_STONE_SLAB, "byg_skyris_highlands_overgrown_stone_slab", BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_OVERGROWN_STONE_SLAB, "byg_volcano_overgrown_stone_slab", BYGBlocks.BYG_VOLCANO_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_STONE_SLAB, "byg_autumnal_valley_overgrown_stone_slab", BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_STONE_SLAB, "byg_cold_swamplands_overgrown_stone_slab", BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_STONE_SLAB, "byg_crimson_gardens_overgrown_stone_slab", BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_STONE_SLAB, "byg_glowstone_gardens_overgrown_stone_slab", BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_STONE_SLAB, "byg_sythian_torrids_overgrown_stone_slab", BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_STONE_SLAB, "byg_wailing_garth_overgrown_stone_slab", BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_STONE_SLAB, "byg_weeping_mire_overgrown_stone_slab", BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_STONE_SLAB, "byg_withering_woods_overgrown_stone_slab", BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_STONE_SLAB, "byg_araucaria_savanna_overgrown_stone_slab", BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_OVERGROWN_STONE_SLAB, "byg_bayou_overgrown_stone_slab", BYGBlocks.BYG_BAYOU_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_STONE_SLAB, "byg_crag_gardens_overgrown_stone_slab", BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_STONE_SLAB, "byg_cypress_swampland_overgrown_stone_slab", BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_STONE_SLAB, "byg_fresh_water_lake_overgrown_stone_slab", BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_STONE_SLAB, "byg_great_lakes_overgrown_stone_slab", BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_STONE_SLAB, "byg_lush_tundra_overgrown_stone_slab", BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_OVERGROWN_STONE_SLAB, "byg_orchard_overgrown_stone_slab", BYGBlocks.BYG_ORCHARD_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_STONE_SLAB, "byg_polluted_lake_overgrown_stone_slab", BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_OVERGROWN_STONE_SLAB, "byg_prairie_overgrown_stone_slab", BYGBlocks.BYG_PRAIRIE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_STONE_SLAB, "byg_rose_fields_overgrown_stone_slab", BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_STONE_SLAB, "byg_shrub_lands_overgrown_stone_slab", BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");

        overgrownBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_DACITE, "byg_ancient_forest_overgrown_dacite", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_DACITE, "byg_aspen_forest_overgrown_dacite", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_DACITE, "byg_cherry_blossom_forest_overgrown_dacite", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_DACITE, "byg_cika_woods_overgrown_dacite", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_DACITE, "byg_coniferous_forest_overgrown_dacite", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_DACITE, "byg_deciduous_forest_overgrown_dacite", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_DACITE, "byg_enchanted_forest_overgrown_dacite", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_DACITE, "byg_jacaranda_forest_overgrown_dacite", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_DACITE, "byg_red_oak_forest_overgrown_dacite", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_DACITE, "byg_redwood_tropics_overgrown_dacite", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_DACITE, "byg_seasonal_deciduous_forest_overgrown_dacite", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_DACITE, "byg_snowy_deciduous_forest_overgrown_dacite", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_DACITE, "byg_tropical_rain_forest_overgrown_dacite", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_OVERGROWN_DACITE, "byg_woodlands_overgrown_dacite", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_DACITE, "byg_zelkova_forest_overgrown_dacite", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GROVE_OVERGROWN_DACITE, "byg_grove_overgrown_dacite", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_DACITE, "byg_basalt_barrera_overgrown_dacite", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_DACITE, "byg_bluff_steeps_overgrown_dacite", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_DACITE, "byg_grass_land_plateau_overgrown_dacite", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_DACITE, "byg_guiana_shield_overgrown_dacite", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_DACITE, "byg_red_rock_mountains_overgrown_dacite", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_DACITE, "byg_skyris_highlands_overgrown_dacite", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_OVERGROWN_DACITE, "byg_volcano_overgrown_dacite", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_DACITE, "byg_autumnal_valley_overgrown_dacite", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_DACITE, "byg_cold_swamplands_overgrown_dacite", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_DACITE, "byg_crimson_gardens_overgrown_dacite", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_DACITE, "byg_glowstone_gardens_overgrown_dacite", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_DACITE, "byg_sythian_torrids_overgrown_dacite", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_DACITE, "byg_wailing_garth_overgrown_dacite", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_DACITE, "byg_weeping_mire_overgrown_dacite", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_DACITE, "byg_withering_woods_overgrown_dacite", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_DACITE, "byg_araucaria_savanna_overgrown_dacite", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BAYOU_OVERGROWN_DACITE, "byg_bayou_overgrown_dacite", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_DACITE, "byg_crag_gardens_overgrown_dacite", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_DACITE, "byg_cypress_swampland_overgrown_dacite", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_DACITE, "byg_fresh_water_lake_overgrown_dacite", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_DACITE, "byg_great_lakes_overgrown_dacite", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_DACITE, "byg_lush_tundra_overgrown_dacite", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_OVERGROWN_DACITE, "byg_orchard_overgrown_dacite", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_DACITE, "byg_polluted_lake_overgrown_dacite", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_OVERGROWN_DACITE, "byg_prairie_overgrown_dacite", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_DACITE, "byg_rose_fields_overgrown_dacite", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_DACITE, "byg_shrub_lands_overgrown_dacite", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.DIORITE, "overgrown_dacite");
        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_DACITE_SLAB, "byg_ancient_forest_overgrown_dacite_slab", BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_DACITE_SLAB, "byg_aspen_forest_overgrown_dacite_slab", BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_DACITE_SLAB, "byg_cherry_blossom_forest_overgrown_dacite_slab", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_DACITE_SLAB, "byg_cika_woods_overgrown_dacite_slab", BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_DACITE_SLAB, "byg_coniferous_forest_overgrown_dacite_slab", BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_DACITE_SLAB, "byg_deciduous_forest_overgrown_dacite_slab", BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_DACITE_SLAB, "byg_enchanted_forest_overgrown_dacite_slab", BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_DACITE_SLAB, "byg_jacaranda_forest_overgrown_dacite_slab", BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_DACITE_SLAB, "byg_red_oak_forest_overgrown_dacite_slab", BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_DACITE_SLAB, "byg_redwood_tropics_overgrown_dacite_slab", BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_DACITE_SLAB, "byg_seasonal_deciduous_forest_overgrown_dacite_slab", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_DACITE_SLAB, "byg_snowy_deciduous_forest_overgrown_dacite_slab", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_DACITE_SLAB, "byg_tropical_rain_forest_overgrown_dacite_slab", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_OVERGROWN_DACITE_SLAB, "byg_woodlands_overgrown_dacite_slab", BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_DACITE_SLAB, "byg_zelkova_forest_overgrown_dacite_slab", BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_OVERGROWN_DACITE_SLAB, "byg_grove_overgrown_dacite_slab", BYGBlocks.BYG_GROVE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_DACITE_SLAB, "byg_basalt_barrera_overgrown_dacite_slab", BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_DACITE_SLAB, "byg_bluff_steeps_overgrown_dacite_slab", BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_DACITE_SLAB, "byg_grass_land_plateau_overgrown_dacite_slab", BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_DACITE_SLAB, "byg_guiana_shield_overgrown_dacite_slab", BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_DACITE_SLAB, "byg_red_rock_mountains_overgrown_dacite_slab", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_DACITE_SLAB, "byg_skyris_highlands_overgrown_dacite_slab", BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_OVERGROWN_DACITE_SLAB, "byg_volcano_overgrown_dacite_slab", BYGBlocks.BYG_VOLCANO_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_DACITE_SLAB, "byg_autumnal_valley_overgrown_dacite_slab", BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_DACITE_SLAB, "byg_cold_swamplands_overgrown_dacite_slab", BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_DACITE_SLAB, "byg_crimson_gardens_overgrown_dacite_slab", BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_DACITE_SLAB, "byg_glowstone_gardens_overgrown_dacite_slab", BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_DACITE_SLAB, "byg_sythian_torrids_overgrown_dacite_slab", BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_DACITE_SLAB, "byg_wailing_garth_overgrown_dacite_slab", BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_DACITE_SLAB, "byg_weeping_mire_overgrown_dacite_slab", BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_DACITE_SLAB, "byg_withering_woods_overgrown_dacite_slab", BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_DACITE_SLAB, "byg_araucaria_savanna_overgrown_dacite_slab", BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_OVERGROWN_DACITE_SLAB, "byg_bayou_overgrown_dacite_slab", BYGBlocks.BYG_BAYOU_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_DACITE_SLAB, "byg_crag_gardens_overgrown_dacite_slab", BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_DACITE_SLAB, "byg_cypress_swampland_overgrown_dacite_slab", BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_DACITE_SLAB, "byg_fresh_water_lake_overgrown_dacite_slab", BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_DACITE_SLAB, "byg_great_lakes_overgrown_dacite_slab", BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_DACITE_SLAB, "byg_lush_tundra_overgrown_dacite_slab", BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_OVERGROWN_DACITE_SLAB, "byg_orchard_overgrown_dacite_slab", BYGBlocks.BYG_ORCHARD_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_DACITE_SLAB, "byg_polluted_lake_overgrown_dacite_slab", BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_OVERGROWN_DACITE_SLAB, "byg_prairie_overgrown_dacite_slab", BYGBlocks.BYG_PRAIRIE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_DACITE_SLAB, "byg_rose_fields_overgrown_dacite_slab", BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_DACITE_SLAB, "byg_shrub_lands_overgrown_dacite_slab", BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");

        overgrownBlockPlus(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_NETHERRACK, "byg_ancient_forest_overgrown_netherrack", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_NETHERRACK, "byg_aspen_forest_overgrown_netherrack", ARFOItems.BIRCH_FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_NETHERRACK, "byg_cherry_blossom_forest_overgrown_netherrack", Items.PINK_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_NETHERRACK, "byg_cika_woods_overgrown_netherrack", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "byg_coniferous_forest_overgrown_netherrack", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK, "byg_deciduous_forest_overgrown_netherrack", ARFOItems.TAIGA_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_NETHERRACK, "byg_enchanted_forest_overgrown_netherrack", Items.BLUE_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_NETHERRACK, "byg_jacaranda_forest_overgrown_netherrack", Items.PURPLE_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_NETHERRACK, "byg_red_oak_forest_overgrown_netherrack", ARFOItems.FOREST_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_NETHERRACK, "byg_redwood_tropics_overgrown_netherrack", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK, "byg_seasonal_deciduous_forest_overgrown_netherrack", ARFOItems.SAVANNA_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK, "byg_snowy_deciduous_forest_overgrown_netherrack", ARFOItems.SNOWY_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_NETHERRACK, "byg_tropical_rain_forest_overgrown_netherrack", ARFOItems.JUNGLE_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WOODLANDS_OVERGROWN_NETHERRACK, "byg_woodlands_overgrown_netherrack", ARFOItems.BADLANDS_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_NETHERRACK, "byg_zelkova_forest_overgrown_netherrack", Items.RED_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GROVE_OVERGROWN_NETHERRACK, "byg_grove_overgrown_netherrack", ARFOItems.PLAINS_DYE, BYGItems.BYG_FOREST_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_NETHERRACK, "byg_basalt_barrera_overgrown_netherrack", ARFOItems.WATERS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_NETHERRACK, "byg_bluff_steeps_overgrown_netherrack", ARFOItems.MOUNTAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_NETHERRACK, "byg_grass_land_plateau_overgrown_netherrack", ARFOItems.PLAINS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_NETHERRACK, "byg_guiana_shield_overgrown_netherrack", ARFOItems.JUNGLE_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_NETHERRACK, "byg_red_rock_mountains_overgrown_netherrack", ARFOItems.BADLANDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_NETHERRACK, "byg_skyris_highlands_overgrown_netherrack", ARFOItems.MEGA_TAIGA_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_VOLCANO_OVERGROWN_NETHERRACK, "byg_volcano_overgrown_netherrack", ARFOItems.MUSHROOM_FIELDS_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_NETHERRACK, "byg_autumnal_valley_overgrown_netherrack", ARFOItems.SAVANNA_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_NETHERRACK, "byg_cold_swamplands_overgrown_netherrack", ARFOItems.SWAMP_DYE, BYGItems.BYG_MOUNTAINS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_NETHERRACK, "byg_crimson_gardens_overgrown_netherrack", ARFOItems.JUNGLE_DYE, BYGItems.BYG_NETHER_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_NETHERRACK, "byg_glowstone_gardens_overgrown_netherrack", ARFOItems.SAVANNA_DYE, BYGItems.BYG_NETHER_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_NETHERRACK, "byg_sythian_torrids_overgrown_netherrack", ARFOItems.BADLANDS_DYE, BYGItems.BYG_NETHER_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_NETHERRACK, "byg_wailing_garth_overgrown_netherrack", ARFOItems.PLAINS_DYE, BYGItems.BYG_NETHER_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_NETHERRACK, "byg_weeping_mire_overgrown_netherrack", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_NETHER_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_NETHERRACK, "byg_withering_woods_overgrown_netherrack", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_NETHER_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_NETHERRACK, "byg_araucaria_savanna_overgrown_netherrack", ARFOItems.SAVANNA_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_BAYOU_OVERGROWN_NETHERRACK, "byg_bayou_overgrown_netherrack", ARFOItems.SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_NETHERRACK, "byg_crag_gardens_overgrown_netherrack", ARFOItems.JUNGLE_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_NETHERRACK, "byg_cypress_swampland_overgrown_netherrack", ARFOItems.LUSH_SWAMP_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_NETHERRACK, "byg_fresh_water_lake_overgrown_netherrack", ARFOItems.WATERS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_NETHERRACK, "byg_great_lakes_overgrown_netherrack", ARFOItems.SNOWY_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_NETHERRACK, "byg_lush_tundra_overgrown_netherrack", ARFOItems.TAIGA_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ORCHARD_OVERGROWN_NETHERRACK, "byg_orchard_overgrown_netherrack", ARFOItems.JUNGLE_EDGE_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_NETHERRACK, "byg_polluted_lake_overgrown_netherrack", ARFOItems.DARK_FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_PRAIRIE_OVERGROWN_NETHERRACK, "byg_prairie_overgrown_netherrack", ARFOItems.PLAINS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_NETHERRACK, "byg_rose_fields_overgrown_netherrack", ARFOItems.FOREST_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_NETHERRACK, "byg_shrub_lands_overgrown_netherrack", ARFOItems.BADLANDS_DYE, BYGItems.BYG_LOWLANDS_DYE, Items.NETHERRACK, "overgrown_netherrack");
        slabBlock(consumer, BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_ancient_forest_overgrown_netherrack_slab", BYGBlocks.BYG_ANCIENT_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_aspen_forest_overgrown_netherrack_slab", BYGBlocks.BYG_ASPEN_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_cherry_blossom_forest_overgrown_netherrack_slab", BYGBlocks.BYG_CHERRY_BLOSSOM_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_NETHERRACK_SLAB, "byg_cika_woods_overgrown_netherrack_slab", BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_coniferous_forest_overgrown_netherrack_slab", BYGBlocks.BYG_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_deciduous_forest_overgrown_netherrack_slab", BYGBlocks.BYG_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_enchanted_forest_overgrown_netherrack_slab", BYGBlocks.BYG_ENCHANTED_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_jacaranda_forest_overgrown_netherrack_slab", BYGBlocks.BYG_JACARANDA_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_red_oak_forest_overgrown_netherrack_slab", BYGBlocks.BYG_RED_OAK_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_NETHERRACK_SLAB, "byg_redwood_tropics_overgrown_netherrack_slab", BYGBlocks.BYG_REDWOOD_TROPICS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_seasonal_deciduous_forest_overgrown_netherrack_slab", BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_snowy_deciduous_forest_overgrown_netherrack_slab", BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_tropical_rain_forest_overgrown_netherrack_slab", BYGBlocks.BYG_TROPICAL_RAIN_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WOODLANDS_OVERGROWN_NETHERRACK_SLAB, "byg_woodlands_overgrown_netherrack_slab", BYGBlocks.BYG_CIKA_WOODS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_NETHERRACK_SLAB, "byg_zelkova_forest_overgrown_netherrack_slab", BYGBlocks.BYG_ZELKOVA_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GROVE_OVERGROWN_NETHERRACK_SLAB, "byg_grove_overgrown_netherrack_slab", BYGBlocks.BYG_GROVE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_NETHERRACK_SLAB, "byg_basalt_barrera_overgrown_netherrack_slab", BYGBlocks.BYG_BASALT_BARRERA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_NETHERRACK_SLAB, "byg_bluff_steeps_overgrown_netherrack_slab", BYGBlocks.BYG_BLUFF_STEEPS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_NETHERRACK_SLAB, "byg_grass_land_plateau_overgrown_netherrack_slab", BYGBlocks.BYG_GRASS_LAND_PLATEAU_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_NETHERRACK_SLAB, "byg_guiana_shield_overgrown_netherrack_slab", BYGBlocks.BYG_GUIANA_SHIELD_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_NETHERRACK_SLAB, "byg_red_rock_mountains_overgrown_netherrack_slab", BYGBlocks.BYG_RED_ROCK_MOUNTAINS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_NETHERRACK_SLAB, "byg_skyris_highlands_overgrown_netherrack_slab", BYGBlocks.BYG_SKYRIS_HIGHLANDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_VOLCANO_OVERGROWN_NETHERRACK_SLAB, "byg_volcano_overgrown_netherrack_slab", BYGBlocks.BYG_VOLCANO_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_NETHERRACK_SLAB, "byg_autumnal_valley_overgrown_netherrack_slab", BYGBlocks.BYG_AUTUMNAL_VALLEY_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_NETHERRACK_SLAB, "byg_cold_swamplands_overgrown_netherrack_slab", BYGBlocks.BYG_COLD_SWAMPLANDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_NETHERRACK_SLAB, "byg_crimson_gardens_overgrown_netherrack_slab", BYGBlocks.BYG_CRIMSON_GARDENS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_NETHERRACK_SLAB, "byg_glowstone_gardens_overgrown_netherrack_slab", BYGBlocks.BYG_GLOWSTONE_GARDENS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_NETHERRACK_SLAB, "byg_sythian_torrids_overgrown_netherrack_slab", BYGBlocks.BYG_SYTHIAN_TORRIDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_NETHERRACK_SLAB, "byg_wailing_garth_overgrown_netherrack_slab", BYGBlocks.BYG_WAILING_GARTH_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_NETHERRACK_SLAB, "byg_weeping_mire_overgrown_netherrack_slab", BYGBlocks.BYG_WEEPING_MIRE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_NETHERRACK_SLAB, "byg_withering_woods_overgrown_netherrack_slab", BYGBlocks.BYG_WITHERING_WOODS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_NETHERRACK_SLAB, "byg_araucaria_savanna_overgrown_netherrack_slab", BYGBlocks.BYG_ARAUCARIA_SAVANNA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_BAYOU_OVERGROWN_NETHERRACK_SLAB, "byg_bayou_overgrown_netherrack_slab", BYGBlocks.BYG_BAYOU_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_NETHERRACK_SLAB, "byg_crag_gardens_overgrown_netherrack_slab", BYGBlocks.BYG_CRAG_GARDENS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_NETHERRACK_SLAB, "byg_cypress_swampland_overgrown_netherrack_slab", BYGBlocks.BYG_CYPRESS_SWAMPLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_NETHERRACK_SLAB, "byg_fresh_water_lake_overgrown_netherrack_slab", BYGBlocks.BYG_FRESH_WATER_LAKE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_NETHERRACK_SLAB, "byg_great_lakes_overgrown_netherrack_slab", BYGBlocks.BYG_GREAT_LAKES_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_NETHERRACK_SLAB, "byg_lush_tundra_overgrown_netherrack_slab", BYGBlocks.BYG_LUSH_TUNDRA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ORCHARD_OVERGROWN_NETHERRACK_SLAB, "byg_orchard_overgrown_netherrack_slab", BYGBlocks.BYG_ORCHARD_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_NETHERRACK_SLAB, "byg_polluted_lake_overgrown_netherrack_slab", BYGBlocks.BYG_POLLUTED_LAKE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_PRAIRIE_OVERGROWN_NETHERRACK_SLAB, "byg_prairie_overgrown_netherrack_slab", BYGBlocks.BYG_PRAIRIE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_NETHERRACK_SLAB, "byg_rose_fields_overgrown_netherrack_slab", BYGBlocks.BYG_ROSE_FIELDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_NETHERRACK_SLAB, "byg_shrub_lands_overgrown_netherrack_slab", BYGBlocks.BYG_SHRUB_LANDS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");

        /*




        BOP



         */
        baseBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_ACACIA_LEAVES, "bop_bamboo_blossom_grove_acacia_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_ACACIA_LEAVES, "bop_burnt_forest_acacia_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_ACACIA_LEAVES, "bop_cherry_blossom_grove_acacia_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_ACACIA_LEAVES, "bop_coniferous_forest_acacia_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_ACACIA_LEAVES, "bop_fungal_field_acacia_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_ACACIA_LEAVES, "bop_dead_forest_acacia_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_ACACIA_LEAVES, "bop_woodland_acacia_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GROVE_ACACIA_LEAVES, "bop_grove_acacia_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_ACACIA_LEAVES, "bop_mystic_grove_acacia_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_ACACIA_LEAVES, "bop_ominous_woods_acacia_leaves", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_ACACIA_LEAVES, "bop_rainforest_acacia_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_ACACIA_LEAVES, "bop_redwood_forest_acacia_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_ACACIA_LEAVES, "bop_seasonal_forest_acacia_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TROPICS_ACACIA_LEAVES, "bop_tropics_acacia_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_ACACIA_LEAVES, "bop_jade_cliffs_acacia_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_ACACIA_LEAVES, "bop_rainbow_hills_acacia_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_ACACIA_LEAVES, "bop_volcano_acacia_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BAYOU_ACACIA_LEAVES, "bop_bayou_acacia_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_ACACIA_LEAVES, "bop_dryland_acacia_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_ACACIA_LEAVES, "bop_gravel_beach_acacia_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_ACACIA_LEAVES, "bop_lavender_field_acacia_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_ACACIA_LEAVES, "bop_lush_desert_acacia_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MARSH_ACACIA_LEAVES, "bop_marsh_acacia_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MEADOW_ACACIA_LEAVES, "bop_meadow_acacia_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_ACACIA_LEAVES, "bop_muskeg_acacia_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_ACACIA_LEAVES, "bop_orchard_acacia_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_ACACIA_LEAVES, "bop_prairie_acacia_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_ACACIA_LEAVES, "bop_scrubland_acacia_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_ACACIA_LEAVES, "bop_shrubland_acacia_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_ACACIA_LEAVES, "bop_tundra_acacia_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_ACACIA_LEAVES, "bop_wasteland_acacia_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WETLAND_ACACIA_LEAVES, "bop_wetland_acacia_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_ACACIA_LEAVES, "bop_origin_valley_acacia_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.ACACIA_LEAVES, "acacia_leaves");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_ACACIA_LEAVES_CARPET, "bop_bamboo_blossom_grove_acacia_leaves_carpet", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_ACACIA_LEAVES_CARPET, "bop_burnt_forest_acacia_leaves_carpet", BOPBlocks.BOP_BURNT_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_ACACIA_LEAVES_CARPET, "bop_cherry_blossom_grove_acacia_leaves_carpet", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, "bop_coniferous_forest_acacia_leaves_carpet", BOPBlocks.BOP_CONIFEROUS_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_ACACIA_LEAVES_CARPET, "bop_fungal_field_acacia_leaves_carpet", BOPBlocks.BOP_FUNGAL_FIELD_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_ACACIA_LEAVES_CARPET, "bop_dead_forest_acacia_leaves_carpet", BOPBlocks.BOP_DEAD_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_ACACIA_LEAVES_CARPET, "bop_woodland_acacia_leaves_carpet", BOPBlocks.BOP_WOODLAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_ACACIA_LEAVES_CARPET, "bop_grove_acacia_leaves_carpet", BOPBlocks.BOP_GROVE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_ACACIA_LEAVES_CARPET, "bop_mystic_grove_acacia_leaves_carpet", BOPBlocks.BOP_MYSTIC_GROVE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_ACACIA_LEAVES_CARPET, "bop_ominous_woods_acacia_leaves_carpet", BOPBlocks.BOP_OMINOUS_WOODS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_ACACIA_LEAVES_CARPET, "bop_rainforest_acacia_leaves_carpet", BOPBlocks.BOP_RAINFOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_ACACIA_LEAVES_CARPET, "bop_redwood_forest_acacia_leaves_carpet", BOPBlocks.BOP_REDWOOD_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_ACACIA_LEAVES_CARPET, "bop_seasonal_forest_acacia_leaves_carpet", BOPBlocks.BOP_SEASONAL_FOREST_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_ACACIA_LEAVES_CARPET, "bop_tropics_acacia_leaves_carpet", BOPBlocks.BOP_TROPICS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_ACACIA_LEAVES_CARPET, "bop_jade_cliffs_acacia_leaves_carpet", BOPBlocks.BOP_JADE_CLIFFS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_ACACIA_LEAVES_CARPET, "bop_rainbow_hills_acacia_leaves_carpet", BOPBlocks.BOP_RAINBOW_HILLS_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_ACACIA_LEAVES_CARPET, "bop_volcano_acacia_leaves_carpet", BOPBlocks.BOP_VOLCANO_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_ACACIA_LEAVES_CARPET, "bop_bayou_acacia_leaves_carpet", BOPBlocks.BOP_BAYOU_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_ACACIA_LEAVES_CARPET, "bop_dryland_acacia_leaves_carpet", BOPBlocks.BOP_DRYLAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_ACACIA_LEAVES_CARPET, "bop_gravel_beach_acacia_leaves_carpet", BOPBlocks.BOP_GRAVEL_BEACH_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_ACACIA_LEAVES_CARPET, "bop_lavender_field_acacia_leaves_carpet", BOPBlocks.BOP_LAVENDER_FIELD_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_ACACIA_LEAVES_CARPET, "bop_lush_desert_acacia_leaves_carpet", BOPBlocks.BOP_LUSH_DESERT_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_ACACIA_LEAVES_CARPET, "bop_marsh_acacia_leaves_carpet", BOPBlocks.BOP_MARSH_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_ACACIA_LEAVES_CARPET, "bop_meadow_acacia_leaves_carpet", BOPBlocks.BOP_MEADOW_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_ACACIA_LEAVES_CARPET, "bop_muskeg_acacia_leaves_carpet", BOPBlocks.BOP_MUSKEG_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_ACACIA_LEAVES_CARPET, "bop_orchard_acacia_leaves_carpet", BOPBlocks.BOP_ORCHARD_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_ACACIA_LEAVES_CARPET, "bop_prairie_acacia_leaves_carpet", BOPBlocks.BOP_PRAIRIE_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_ACACIA_LEAVES_CARPET, "bop_scrubland_acacia_leaves_carpet", BOPBlocks.BOP_SCRUBLAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_ACACIA_LEAVES_CARPET, "bop_shrubland_acacia_leaves_carpet", BOPBlocks.BOP_SHRUBLAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_ACACIA_LEAVES_CARPET, "bop_tundra_acacia_leaves_carpet", BOPBlocks.BOP_TUNDRA_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_ACACIA_LEAVES_CARPET, "bop_wasteland_acacia_leaves_carpet", BOPBlocks.BOP_WASTELAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_ACACIA_LEAVES_CARPET, "bop_wetland_acacia_leaves_carpet", BOPBlocks.BOP_WETLAND_ACACIA_LEAVES, "acacia_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_ACACIA_LEAVES_CARPET, "bop_origin_valley_acacia_leaves_carpet", BOPBlocks.BOP_ORIGIN_VALLEY_ACACIA_LEAVES, "acacia_leaves_carpet");

        baseBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_JUNGLE_LEAVES, "bop_bamboo_blossom_grove_jungle_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_JUNGLE_LEAVES, "bop_burnt_forest_jungle_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_JUNGLE_LEAVES, "bop_cherry_blossom_grove_jungle_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_JUNGLE_LEAVES, "bop_coniferous_forest_jungle_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_JUNGLE_LEAVES, "bop_fungal_field_jungle_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_JUNGLE_LEAVES, "bop_dead_forest_jungle_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_JUNGLE_LEAVES, "bop_woodland_jungle_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GROVE_JUNGLE_LEAVES, "bop_grove_jungle_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_JUNGLE_LEAVES, "bop_mystic_grove_jungle_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_JUNGLE_LEAVES, "bop_ominous_woods_jungle_leaves", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_JUNGLE_LEAVES, "bop_rainforest_jungle_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_JUNGLE_LEAVES, "bop_redwood_forest_jungle_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_JUNGLE_LEAVES, "bop_seasonal_forest_jungle_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TROPICS_JUNGLE_LEAVES, "bop_tropics_jungle_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_JUNGLE_LEAVES, "bop_jade_cliffs_jungle_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_JUNGLE_LEAVES, "bop_rainbow_hills_jungle_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_JUNGLE_LEAVES, "bop_volcano_jungle_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BAYOU_JUNGLE_LEAVES, "bop_bayou_jungle_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_JUNGLE_LEAVES, "bop_dryland_jungle_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_JUNGLE_LEAVES, "bop_gravel_beach_jungle_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_JUNGLE_LEAVES, "bop_lavender_field_jungle_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_JUNGLE_LEAVES, "bop_lush_desert_jungle_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MARSH_JUNGLE_LEAVES, "bop_marsh_jungle_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MEADOW_JUNGLE_LEAVES, "bop_meadow_jungle_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_JUNGLE_LEAVES, "bop_muskeg_jungle_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_JUNGLE_LEAVES, "bop_orchard_jungle_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_JUNGLE_LEAVES, "bop_prairie_jungle_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_JUNGLE_LEAVES, "bop_scrubland_jungle_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_JUNGLE_LEAVES, "bop_shrubland_jungle_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_JUNGLE_LEAVES, "bop_tundra_jungle_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_JUNGLE_LEAVES, "bop_wasteland_jungle_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WETLAND_JUNGLE_LEAVES, "bop_wetland_jungle_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_JUNGLE_LEAVES, "bop_origin_valley_jungle_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.JUNGLE_LEAVES, "jungle_leaves");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_JUNGLE_LEAVES_CARPET, "bop_bamboo_blossom_grove_jungle_leaves_carpet", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_JUNGLE_LEAVES_CARPET, "bop_burnt_forest_jungle_leaves_carpet", BOPBlocks.BOP_BURNT_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_JUNGLE_LEAVES_CARPET, "bop_cherry_blossom_grove_jungle_leaves_carpet", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, "bop_coniferous_forest_jungle_leaves_carpet", BOPBlocks.BOP_CONIFEROUS_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_JUNGLE_LEAVES_CARPET, "bop_fungal_field_jungle_leaves_carpet", BOPBlocks.BOP_FUNGAL_FIELD_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_JUNGLE_LEAVES_CARPET, "bop_dead_forest_jungle_leaves_carpet", BOPBlocks.BOP_DEAD_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_JUNGLE_LEAVES_CARPET, "bop_woodland_jungle_leaves_carpet", BOPBlocks.BOP_WOODLAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_JUNGLE_LEAVES_CARPET, "bop_grove_jungle_leaves_carpet", BOPBlocks.BOP_GROVE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_JUNGLE_LEAVES_CARPET, "bop_mystic_grove_jungle_leaves_carpet", BOPBlocks.BOP_MYSTIC_GROVE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_JUNGLE_LEAVES_CARPET, "bop_ominous_woods_jungle_leaves_carpet", BOPBlocks.BOP_OMINOUS_WOODS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_JUNGLE_LEAVES_CARPET, "bop_rainforest_jungle_leaves_carpet", BOPBlocks.BOP_RAINFOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_JUNGLE_LEAVES_CARPET, "bop_redwood_forest_jungle_leaves_carpet", BOPBlocks.BOP_REDWOOD_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_JUNGLE_LEAVES_CARPET, "bop_seasonal_forest_jungle_leaves_carpet", BOPBlocks.BOP_SEASONAL_FOREST_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_JUNGLE_LEAVES_CARPET, "bop_tropics_jungle_leaves_carpet", BOPBlocks.BOP_TROPICS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_JUNGLE_LEAVES_CARPET, "bop_jade_cliffs_jungle_leaves_carpet", BOPBlocks.BOP_JADE_CLIFFS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_JUNGLE_LEAVES_CARPET, "bop_rainbow_hills_jungle_leaves_carpet", BOPBlocks.BOP_RAINBOW_HILLS_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_JUNGLE_LEAVES_CARPET, "bop_volcano_jungle_leaves_carpet", BOPBlocks.BOP_VOLCANO_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_JUNGLE_LEAVES_CARPET, "bop_bayou_jungle_leaves_carpet", BOPBlocks.BOP_BAYOU_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_JUNGLE_LEAVES_CARPET, "bop_dryland_jungle_leaves_carpet", BOPBlocks.BOP_DRYLAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_JUNGLE_LEAVES_CARPET, "bop_gravel_beach_jungle_leaves_carpet", BOPBlocks.BOP_GRAVEL_BEACH_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_JUNGLE_LEAVES_CARPET, "bop_lavender_field_jungle_leaves_carpet", BOPBlocks.BOP_LAVENDER_FIELD_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_JUNGLE_LEAVES_CARPET, "bop_lush_desert_jungle_leaves_carpet", BOPBlocks.BOP_LUSH_DESERT_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_JUNGLE_LEAVES_CARPET, "bop_marsh_jungle_leaves_carpet", BOPBlocks.BOP_MARSH_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_JUNGLE_LEAVES_CARPET, "bop_meadow_jungle_leaves_carpet", BOPBlocks.BOP_MEADOW_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_JUNGLE_LEAVES_CARPET, "bop_muskeg_jungle_leaves_carpet", BOPBlocks.BOP_MUSKEG_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_JUNGLE_LEAVES_CARPET, "bop_orchard_jungle_leaves_carpet", BOPBlocks.BOP_ORCHARD_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_JUNGLE_LEAVES_CARPET, "bop_prairie_jungle_leaves_carpet", BOPBlocks.BOP_PRAIRIE_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_JUNGLE_LEAVES_CARPET, "bop_scrubland_jungle_leaves_carpet", BOPBlocks.BOP_SCRUBLAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_JUNGLE_LEAVES_CARPET, "bop_shrubland_jungle_leaves_carpet", BOPBlocks.BOP_SHRUBLAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_JUNGLE_LEAVES_CARPET, "bop_tundra_jungle_leaves_carpet", BOPBlocks.BOP_TUNDRA_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_JUNGLE_LEAVES_CARPET, "bop_wasteland_jungle_leaves_carpet", BOPBlocks.BOP_WASTELAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_JUNGLE_LEAVES_CARPET, "bop_wetland_jungle_leaves_carpet", BOPBlocks.BOP_WETLAND_JUNGLE_LEAVES, "jungle_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_JUNGLE_LEAVES_CARPET, "bop_origin_valley_jungle_leaves_carpet", BOPBlocks.BOP_ORIGIN_VALLEY_JUNGLE_LEAVES, "jungle_leaves_carpet");

        baseBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OAK_LEAVES, "bop_bamboo_blossom_grove_oak_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_OAK_LEAVES, "bop_burnt_forest_oak_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OAK_LEAVES, "bop_cherry_blossom_grove_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OAK_LEAVES, "bop_coniferous_forest_oak_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OAK_LEAVES, "bop_fungal_field_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_OAK_LEAVES, "bop_dead_forest_oak_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_OAK_LEAVES, "bop_woodland_oak_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GROVE_OAK_LEAVES, "bop_grove_oak_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OAK_LEAVES, "bop_mystic_grove_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OAK_LEAVES, "bop_ominous_woods_oak_leaves", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_OAK_LEAVES, "bop_rainforest_oak_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OAK_LEAVES, "bop_redwood_forest_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OAK_LEAVES, "bop_seasonal_forest_oak_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TROPICS_OAK_LEAVES, "bop_tropics_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_OAK_LEAVES, "bop_jade_cliffs_oak_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OAK_LEAVES, "bop_rainbow_hills_oak_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_OAK_LEAVES, "bop_volcano_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BAYOU_OAK_LEAVES, "bop_bayou_oak_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_OAK_LEAVES, "bop_dryland_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OAK_LEAVES, "bop_gravel_beach_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OAK_LEAVES, "bop_lavender_field_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_OAK_LEAVES, "bop_lush_desert_oak_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MARSH_OAK_LEAVES, "bop_marsh_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MEADOW_OAK_LEAVES, "bop_meadow_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_OAK_LEAVES, "bop_muskeg_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_OAK_LEAVES, "bop_orchard_oak_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_OAK_LEAVES, "bop_prairie_oak_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_OAK_LEAVES, "bop_scrubland_oak_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_OAK_LEAVES, "bop_shrubland_oak_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_OAK_LEAVES, "bop_tundra_oak_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_OAK_LEAVES, "bop_wasteland_oak_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WETLAND_OAK_LEAVES, "bop_wetland_oak_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OAK_LEAVES, "bop_origin_valley_oak_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.OAK_LEAVES, "oak_leaves");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OAK_LEAVES_CARPET, "bop_bamboo_blossom_grove_oak_leaves_carpet", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_OAK_LEAVES_CARPET, "bop_burnt_forest_oak_leaves_carpet", BOPBlocks.BOP_BURNT_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OAK_LEAVES_CARPET, "bop_cherry_blossom_grove_oak_leaves_carpet", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, "bop_coniferous_forest_oak_leaves_carpet", BOPBlocks.BOP_CONIFEROUS_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OAK_LEAVES_CARPET, "bop_fungal_field_oak_leaves_carpet", BOPBlocks.BOP_FUNGAL_FIELD_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_OAK_LEAVES_CARPET, "bop_dead_forest_oak_leaves_carpet", BOPBlocks.BOP_DEAD_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_OAK_LEAVES_CARPET, "bop_woodland_oak_leaves_carpet", BOPBlocks.BOP_WOODLAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_OAK_LEAVES_CARPET, "bop_grove_oak_leaves_carpet", BOPBlocks.BOP_GROVE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OAK_LEAVES_CARPET, "bop_mystic_grove_oak_leaves_carpet", BOPBlocks.BOP_MYSTIC_GROVE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OAK_LEAVES_CARPET, "bop_ominous_woods_oak_leaves_carpet", BOPBlocks.BOP_OMINOUS_WOODS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_OAK_LEAVES_CARPET, "bop_rainforest_oak_leaves_carpet", BOPBlocks.BOP_RAINFOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OAK_LEAVES_CARPET, "bop_redwood_forest_oak_leaves_carpet", BOPBlocks.BOP_REDWOOD_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OAK_LEAVES_CARPET, "bop_seasonal_forest_oak_leaves_carpet", BOPBlocks.BOP_SEASONAL_FOREST_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_OAK_LEAVES_CARPET, "bop_tropics_oak_leaves_carpet", BOPBlocks.BOP_TROPICS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_OAK_LEAVES_CARPET, "bop_jade_cliffs_oak_leaves_carpet", BOPBlocks.BOP_JADE_CLIFFS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OAK_LEAVES_CARPET, "bop_rainbow_hills_oak_leaves_carpet", BOPBlocks.BOP_RAINBOW_HILLS_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_OAK_LEAVES_CARPET, "bop_volcano_oak_leaves_carpet", BOPBlocks.BOP_VOLCANO_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_OAK_LEAVES_CARPET, "bop_bayou_oak_leaves_carpet", BOPBlocks.BOP_BAYOU_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_OAK_LEAVES_CARPET, "bop_dryland_oak_leaves_carpet", BOPBlocks.BOP_DRYLAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OAK_LEAVES_CARPET, "bop_gravel_beach_oak_leaves_carpet", BOPBlocks.BOP_GRAVEL_BEACH_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OAK_LEAVES_CARPET, "bop_lavender_field_oak_leaves_carpet", BOPBlocks.BOP_LAVENDER_FIELD_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_OAK_LEAVES_CARPET, "bop_lush_desert_oak_leaves_carpet", BOPBlocks.BOP_LUSH_DESERT_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_OAK_LEAVES_CARPET, "bop_marsh_oak_leaves_carpet", BOPBlocks.BOP_MARSH_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_OAK_LEAVES_CARPET, "bop_meadow_oak_leaves_carpet", BOPBlocks.BOP_MEADOW_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_OAK_LEAVES_CARPET, "bop_muskeg_oak_leaves_carpet", BOPBlocks.BOP_MUSKEG_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_OAK_LEAVES_CARPET, "bop_orchard_oak_leaves_carpet", BOPBlocks.BOP_ORCHARD_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_OAK_LEAVES_CARPET, "bop_prairie_oak_leaves_carpet", BOPBlocks.BOP_PRAIRIE_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_OAK_LEAVES_CARPET, "bop_scrubland_oak_leaves_carpet", BOPBlocks.BOP_SCRUBLAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_OAK_LEAVES_CARPET, "bop_shrubland_oak_leaves_carpet", BOPBlocks.BOP_SHRUBLAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_OAK_LEAVES_CARPET, "bop_tundra_oak_leaves_carpet", BOPBlocks.BOP_TUNDRA_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_OAK_LEAVES_CARPET, "bop_wasteland_oak_leaves_carpet", BOPBlocks.BOP_WASTELAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_OAK_LEAVES_CARPET, "bop_wetland_oak_leaves_carpet", BOPBlocks.BOP_WETLAND_OAK_LEAVES, "oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OAK_LEAVES_CARPET, "bop_origin_valley_oak_leaves_carpet", BOPBlocks.BOP_ORIGIN_VALLEY_OAK_LEAVES, "oak_leaves_carpet");

        baseBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_DARK_OAK_LEAVES, "bop_bamboo_blossom_grove_dark_oak_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_DARK_OAK_LEAVES, "bop_burnt_forest_dark_oak_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_DARK_OAK_LEAVES, "bop_cherry_blossom_grove_dark_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "bop_coniferous_forest_dark_oak_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_DARK_OAK_LEAVES, "bop_fungal_field_dark_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_DARK_OAK_LEAVES, "bop_dead_forest_dark_oak_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_DARK_OAK_LEAVES, "bop_woodland_dark_oak_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GROVE_DARK_OAK_LEAVES, "bop_grove_dark_oak_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_DARK_OAK_LEAVES, "bop_mystic_grove_dark_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_DARK_OAK_LEAVES, "bop_ominous_woods_dark_oak_leaves", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_DARK_OAK_LEAVES, "bop_rainforest_dark_oak_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_DARK_OAK_LEAVES, "bop_redwood_forest_dark_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_DARK_OAK_LEAVES, "bop_seasonal_forest_dark_oak_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TROPICS_DARK_OAK_LEAVES, "bop_tropics_dark_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_DARK_OAK_LEAVES, "bop_jade_cliffs_dark_oak_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_DARK_OAK_LEAVES, "bop_rainbow_hills_dark_oak_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_DARK_OAK_LEAVES, "bop_volcano_dark_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_BAYOU_DARK_OAK_LEAVES, "bop_bayou_dark_oak_leaves", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_DARK_OAK_LEAVES, "bop_dryland_dark_oak_leaves", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_DARK_OAK_LEAVES, "bop_gravel_beach_dark_oak_leaves", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_DARK_OAK_LEAVES, "bop_lavender_field_dark_oak_leaves", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_DARK_OAK_LEAVES, "bop_lush_desert_dark_oak_leaves", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MARSH_DARK_OAK_LEAVES, "bop_marsh_dark_oak_leaves", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MEADOW_DARK_OAK_LEAVES, "bop_meadow_dark_oak_leaves", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_DARK_OAK_LEAVES, "bop_muskeg_dark_oak_leaves", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_DARK_OAK_LEAVES, "bop_orchard_dark_oak_leaves", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_DARK_OAK_LEAVES, "bop_prairie_dark_oak_leaves", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_DARK_OAK_LEAVES, "bop_scrubland_dark_oak_leaves", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_DARK_OAK_LEAVES, "bop_shrubland_dark_oak_leaves", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_DARK_OAK_LEAVES, "bop_tundra_dark_oak_leaves", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_DARK_OAK_LEAVES, "bop_wasteland_dark_oak_leaves", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_WETLAND_DARK_OAK_LEAVES, "bop_wetland_dark_oak_leaves", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_DARK_OAK_LEAVES, "bop_origin_valley_dark_oak_leaves", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.DARK_OAK_LEAVES, "dark_oak_leaves");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_DARK_OAK_LEAVES_CARPET, "bop_bamboo_blossom_grove_dark_oak_leaves_carpet", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_DARK_OAK_LEAVES_CARPET, "bop_burnt_forest_dark_oak_leaves_carpet", BOPBlocks.BOP_BURNT_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_DARK_OAK_LEAVES_CARPET, "bop_cherry_blossom_grove_dark_oak_leaves_carpet", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, "bop_coniferous_forest_dark_oak_leaves_carpet", BOPBlocks.BOP_CONIFEROUS_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_DARK_OAK_LEAVES_CARPET, "bop_fungal_field_dark_oak_leaves_carpet", BOPBlocks.BOP_FUNGAL_FIELD_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_DARK_OAK_LEAVES_CARPET, "bop_dead_forest_dark_oak_leaves_carpet", BOPBlocks.BOP_DEAD_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_DARK_OAK_LEAVES_CARPET, "bop_woodland_dark_oak_leaves_carpet", BOPBlocks.BOP_WOODLAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_DARK_OAK_LEAVES_CARPET, "bop_grove_dark_oak_leaves_carpet", BOPBlocks.BOP_GROVE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_DARK_OAK_LEAVES_CARPET, "bop_mystic_grove_dark_oak_leaves_carpet", BOPBlocks.BOP_MYSTIC_GROVE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_DARK_OAK_LEAVES_CARPET, "bop_ominous_woods_dark_oak_leaves_carpet", BOPBlocks.BOP_OMINOUS_WOODS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_DARK_OAK_LEAVES_CARPET, "bop_rainforest_dark_oak_leaves_carpet", BOPBlocks.BOP_RAINFOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_DARK_OAK_LEAVES_CARPET, "bop_redwood_forest_dark_oak_leaves_carpet", BOPBlocks.BOP_REDWOOD_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_DARK_OAK_LEAVES_CARPET, "bop_seasonal_forest_dark_oak_leaves_carpet", BOPBlocks.BOP_SEASONAL_FOREST_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_DARK_OAK_LEAVES_CARPET, "bop_tropics_dark_oak_leaves_carpet", BOPBlocks.BOP_TROPICS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_DARK_OAK_LEAVES_CARPET, "bop_jade_cliffs_dark_oak_leaves_carpet", BOPBlocks.BOP_JADE_CLIFFS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_DARK_OAK_LEAVES_CARPET, "bop_rainbow_hills_dark_oak_leaves_carpet", BOPBlocks.BOP_RAINBOW_HILLS_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_DARK_OAK_LEAVES_CARPET, "bop_volcano_dark_oak_leaves_carpet", BOPBlocks.BOP_VOLCANO_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_DARK_OAK_LEAVES_CARPET, "bop_bayou_dark_oak_leaves_carpet", BOPBlocks.BOP_BAYOU_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_DARK_OAK_LEAVES_CARPET, "bop_dryland_dark_oak_leaves_carpet", BOPBlocks.BOP_DRYLAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_DARK_OAK_LEAVES_CARPET, "bop_gravel_beach_dark_oak_leaves_carpet", BOPBlocks.BOP_GRAVEL_BEACH_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_DARK_OAK_LEAVES_CARPET, "bop_lavender_field_dark_oak_leaves_carpet", BOPBlocks.BOP_LAVENDER_FIELD_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_DARK_OAK_LEAVES_CARPET, "bop_lush_desert_dark_oak_leaves_carpet", BOPBlocks.BOP_LUSH_DESERT_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_DARK_OAK_LEAVES_CARPET, "bop_marsh_dark_oak_leaves_carpet", BOPBlocks.BOP_MARSH_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_DARK_OAK_LEAVES_CARPET, "bop_meadow_dark_oak_leaves_carpet", BOPBlocks.BOP_MEADOW_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_DARK_OAK_LEAVES_CARPET, "bop_muskeg_dark_oak_leaves_carpet", BOPBlocks.BOP_MUSKEG_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_DARK_OAK_LEAVES_CARPET, "bop_orchard_dark_oak_leaves_carpet", BOPBlocks.BOP_ORCHARD_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_DARK_OAK_LEAVES_CARPET, "bop_prairie_dark_oak_leaves_carpet", BOPBlocks.BOP_PRAIRIE_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_DARK_OAK_LEAVES_CARPET, "bop_scrubland_dark_oak_leaves_carpet", BOPBlocks.BOP_SCRUBLAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_DARK_OAK_LEAVES_CARPET, "bop_shrubland_dark_oak_leaves_carpet", BOPBlocks.BOP_SHRUBLAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_DARK_OAK_LEAVES_CARPET, "bop_tundra_dark_oak_leaves_carpet", BOPBlocks.BOP_TUNDRA_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_DARK_OAK_LEAVES_CARPET, "bop_wasteland_dark_oak_leaves_carpet", BOPBlocks.BOP_WASTELAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_DARK_OAK_LEAVES_CARPET, "bop_wetland_dark_oak_leaves_carpet", BOPBlocks.BOP_WETLAND_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_DARK_OAK_LEAVES_CARPET, "bop_origin_valley_dark_oak_leaves_carpet", BOPBlocks.BOP_ORIGIN_VALLEY_DARK_OAK_LEAVES, "dark_oak_leaves_carpet");


        baseBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_GRASS_BLOCK, "bop_bamboo_blossom_grove_grass_block", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_GRASS_BLOCK, "bop_burnt_forest_grass_block", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_GRASS_BLOCK, "bop_cherry_blossom_grove_grass_block", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_GRASS_BLOCK, "bop_coniferous_forest_grass_block", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_GRASS_BLOCK, "bop_fungal_field_grass_block", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_GRASS_BLOCK, "bop_dead_forest_grass_block", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_GRASS_BLOCK, "bop_woodland_grass_block", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_GROVE_GRASS_BLOCK, "bop_grove_grass_block", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_GRASS_BLOCK, "bop_mystic_grove_grass_block", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_GRASS_BLOCK, "bop_ominous_woods_grass_block", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_GRASS_BLOCK, "bop_rainforest_grass_block", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_GRASS_BLOCK, "bop_redwood_forest_grass_block", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_GRASS_BLOCK, "bop_seasonal_forest_grass_block", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_TROPICS_GRASS_BLOCK, "bop_tropics_grass_block", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_GRASS_BLOCK, "bop_jade_cliffs_grass_block", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_GRASS_BLOCK, "bop_rainbow_hills_grass_block", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_GRASS_BLOCK, "bop_volcano_grass_block", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_BAYOU_GRASS_BLOCK, "bop_bayou_grass_block", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_GRASS_BLOCK, "bop_dryland_grass_block", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_GRASS_BLOCK, "bop_gravel_beach_grass_block", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_GRASS_BLOCK, "bop_lavender_field_grass_block", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_GRASS_BLOCK, "bop_lush_desert_grass_block", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_MARSH_GRASS_BLOCK, "bop_marsh_grass_block", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_MEADOW_GRASS_BLOCK, "bop_meadow_grass_block", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_GRASS_BLOCK, "bop_muskeg_grass_block", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_GRASS_BLOCK, "bop_orchard_grass_block", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_GRASS_BLOCK, "bop_prairie_grass_block", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_GRASS_BLOCK, "bop_scrubland_grass_block", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_GRASS_BLOCK, "bop_shrubland_grass_block", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_GRASS_BLOCK, "bop_tundra_grass_block", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_GRASS_BLOCK, "bop_wasteland_grass_block", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_WETLAND_GRASS_BLOCK, "bop_wetland_grass_block", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_GRASS_BLOCK, "bop_origin_valley_grass_block", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        baseBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_GRASS_BLOCK, "bop_fungal_field_variant_grass_block", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS_BLOCKS, "grass_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_GRASS_SLAB, "bop_bamboo_blossom_grove_grass_slab", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_GRASS_SLAB, "bop_burnt_forest_grass_slab", BOPBlocks.BOP_BURNT_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_GRASS_SLAB, "bop_cherry_blossom_grove_grass_slab", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_GRASS_SLAB, "bop_coniferous_forest_grass_slab", BOPBlocks.BOP_CONIFEROUS_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_GRASS_SLAB, "bop_fungal_field_grass_slab", BOPBlocks.BOP_FUNGAL_FIELD_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_GRASS_SLAB, "bop_dead_forest_grass_slab", BOPBlocks.BOP_DEAD_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_GRASS_SLAB, "bop_woodland_grass_slab", BOPBlocks.BOP_WOODLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_GRASS_SLAB, "bop_grove_grass_slab", BOPBlocks.BOP_GROVE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_GRASS_SLAB, "bop_mystic_grove_grass_slab", BOPBlocks.BOP_MYSTIC_GROVE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_GRASS_SLAB, "bop_ominous_woods_grass_slab", BOPBlocks.BOP_OMINOUS_WOODS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_GRASS_SLAB, "bop_rainforest_grass_slab", BOPBlocks.BOP_RAINFOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_GRASS_SLAB, "bop_redwood_forest_grass_slab", BOPBlocks.BOP_REDWOOD_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_GRASS_SLAB, "bop_seasonal_forest_grass_slab", BOPBlocks.BOP_SEASONAL_FOREST_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_GRASS_SLAB, "bop_tropics_grass_slab", BOPBlocks.BOP_TROPICS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_GRASS_SLAB, "bop_jade_cliffs_grass_slab", BOPBlocks.BOP_JADE_CLIFFS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_GRASS_SLAB, "bop_rainbow_hills_grass_slab", BOPBlocks.BOP_RAINBOW_HILLS_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_GRASS_SLAB, "bop_volcano_grass_slab", BOPBlocks.BOP_VOLCANO_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_GRASS_SLAB, "bop_bayou_grass_slab", BOPBlocks.BOP_BAYOU_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_GRASS_SLAB, "bop_dryland_grass_slab", BOPBlocks.BOP_DRYLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_GRASS_SLAB, "bop_gravel_beach_grass_slab", BOPBlocks.BOP_GRAVEL_BEACH_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_GRASS_SLAB, "bop_lavender_field_grass_slab", BOPBlocks.BOP_LAVENDER_FIELD_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_GRASS_SLAB, "bop_lush_desert_grass_slab", BOPBlocks.BOP_LUSH_DESERT_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_GRASS_SLAB, "bop_marsh_grass_slab", BOPBlocks.BOP_MARSH_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_GRASS_SLAB, "bop_meadow_grass_slab", BOPBlocks.BOP_MEADOW_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_GRASS_SLAB, "bop_muskeg_grass_slab", BOPBlocks.BOP_MUSKEG_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_GRASS_SLAB, "bop_orchard_grass_slab", BOPBlocks.BOP_ORCHARD_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_GRASS_SLAB, "bop_prairie_grass_slab", BOPBlocks.BOP_PRAIRIE_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_GRASS_SLAB, "bop_scrubland_grass_slab", BOPBlocks.BOP_SCRUBLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_GRASS_SLAB, "bop_shrubland_grass_slab", BOPBlocks.BOP_SHRUBLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_GRASS_SLAB, "bop_tundra_grass_slab", BOPBlocks.BOP_TUNDRA_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_GRASS_SLAB, "bop_wasteland_grass_slab", BOPBlocks.BOP_WASTELAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_GRASS_SLAB, "bop_wetland_grass_slab", BOPBlocks.BOP_WETLAND_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_GRASS_SLAB, "bop_origin_valley_grass_slab", BOPBlocks.BOP_ORIGIN_VALLEY_GRASS_BLOCK, "grass_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_GRASS_SLAB, "bop_fungal_field_variant_grass_slab", BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_GRASS_BLOCK, "grass_slab_blocks");

        glowBlock(consumer, BOPBlocks.GLOWING_BOP_BAMBOO_BLOSSOM_GROVE_GRASS_BLOCK, "glowing_bop_bamboo_blossom_grove_grass_block", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_BURNT_FOREST_GRASS_BLOCK, "glowing_bop_burnt_forest_grass_block", BOPBlocks.BOP_BURNT_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_CHERRY_BLOSSOM_GROVE_GRASS_BLOCK, "glowing_bop_cherry_blossom_grove_grass_block", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_bop_coniferous_forest_grass_block", BOPBlocks.BOP_CONIFEROUS_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_FUNGAL_FIELD_GRASS_BLOCK, "glowing_bop_fungal_field_grass_block", BOPBlocks.BOP_FUNGAL_FIELD_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_DEAD_FOREST_GRASS_BLOCK, "glowing_bop_dead_forest_grass_block", BOPBlocks.BOP_DEAD_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_WOODLAND_GRASS_BLOCK, "glowing_bop_woodland_grass_block", BOPBlocks.BOP_WOODLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_GROVE_GRASS_BLOCK, "glowing_bop_grove_grass_block", BOPBlocks.BOP_GROVE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_MYSTIC_GROVE_GRASS_BLOCK, "glowing_bop_mystic_grove_grass_block", BOPBlocks.BOP_MYSTIC_GROVE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_OMINOUS_WOODS_GRASS_BLOCK, "glowing_bop_ominous_woods_grass_block", BOPBlocks.BOP_OMINOUS_WOODS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_RAINFOREST_GRASS_BLOCK, "glowing_bop_rainforest_grass_block", BOPBlocks.BOP_RAINFOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_REDWOOD_FOREST_GRASS_BLOCK, "glowing_bop_redwood_forest_grass_block", BOPBlocks.BOP_REDWOOD_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_SEASONAL_FOREST_GRASS_BLOCK, "glowing_bop_seasonal_forest_grass_block", BOPBlocks.BOP_SEASONAL_FOREST_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_TROPICS_GRASS_BLOCK, "glowing_bop_tropics_grass_block", BOPBlocks.BOP_TROPICS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_JADE_CLIFFS_GRASS_BLOCK, "glowing_bop_jade_cliffs_grass_block", BOPBlocks.BOP_JADE_CLIFFS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_RAINBOW_HILLS_GRASS_BLOCK, "glowing_bop_rainbow_hills_grass_block", BOPBlocks.BOP_RAINBOW_HILLS_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_VOLCANO_GRASS_BLOCK, "glowing_bop_volcano_grass_block", BOPBlocks.BOP_VOLCANO_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_BAYOU_GRASS_BLOCK, "glowing_bop_bayou_grass_block", BOPBlocks.BOP_BAYOU_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_DRYLAND_GRASS_BLOCK, "glowing_bop_dryland_grass_block", BOPBlocks.BOP_DRYLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_GRAVEL_BEACH_GRASS_BLOCK, "glowing_bop_gravel_beach_grass_block", BOPBlocks.BOP_GRAVEL_BEACH_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_LAVENDER_FIELD_GRASS_BLOCK, "glowing_bop_lavender_field_grass_block", BOPBlocks.BOP_LAVENDER_FIELD_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_LUSH_DESERT_GRASS_BLOCK, "glowing_bop_lush_desert_grass_block", BOPBlocks.BOP_LUSH_DESERT_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_MARSH_GRASS_BLOCK, "glowing_bop_marsh_grass_block", BOPBlocks.BOP_MARSH_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_MEADOW_GRASS_BLOCK, "glowing_bop_meadow_grass_block", BOPBlocks.BOP_MEADOW_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_MUSKEG_GRASS_BLOCK, "glowing_bop_muskeg_grass_block", BOPBlocks.BOP_MUSKEG_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_ORCHARD_GRASS_BLOCK, "glowing_bop_orchard_grass_block", BOPBlocks.BOP_ORCHARD_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_PRAIRIE_GRASS_BLOCK, "glowing_bop_prairie_grass_block", BOPBlocks.BOP_PRAIRIE_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_SCRUBLAND_GRASS_BLOCK, "glowing_bop_scrubland_grass_block", BOPBlocks.BOP_SCRUBLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_SHRUBLAND_GRASS_BLOCK, "glowing_bop_shrubland_grass_block", BOPBlocks.BOP_SHRUBLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_TUNDRA_GRASS_BLOCK, "glowing_bop_tundra_grass_block", BOPBlocks.BOP_TUNDRA_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_WASTELAND_GRASS_BLOCK, "glowing_bop_wasteland_grass_block", BOPBlocks.BOP_WASTELAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_WETLAND_GRASS_BLOCK, "glowing_bop_wetland_grass_block", BOPBlocks.BOP_WETLAND_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_ORIGIN_VALLEY_GRASS_BLOCK, "glowing_bop_origin_valley_grass_block", BOPBlocks.BOP_ORIGIN_VALLEY_GRASS_BLOCK, "glowing_grass_blocks");
        glowBlock(consumer, BOPBlocks.GLOWING_BOP_FUNGAL_FIELD_VARIANT_GRASS_BLOCK, "glowing_bop_fungal_field_variant_grass_block", BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_GRASS_BLOCK, "glowing_grass_blocks");

        plantBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_GRASS, "bop_bamboo_blossom_grove_grass", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_GRASS, "bop_burnt_forest_grass", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_GRASS, "bop_cherry_blossom_grove_grass", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_GRASS, "bop_coniferous_forest_grass", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_GRASS, "bop_fungal_field_grass", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_GRASS, "bop_dead_forest_grass", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_GRASS, "bop_woodland_grass", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_GROVE_GRASS, "bop_grove_grass", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_GRASS, "bop_mystic_grove_grass", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_GRASS, "bop_ominous_woods_grass", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_GRASS, "bop_rainforest_grass", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_GRASS, "bop_redwood_forest_grass", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_GRASS, "bop_seasonal_forest_grass", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_TROPICS_GRASS, "bop_tropics_grass", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_GRASS, "bop_jade_cliffs_grass", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_GRASS, "bop_rainbow_hills_grass", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_GRASS, "bop_volcano_grass", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_BAYOU_GRASS, "bop_bayou_grass", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_GRASS, "bop_dryland_grass", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_GRASS, "bop_gravel_beach_grass", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_GRASS, "bop_lavender_field_grass", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_GRASS, "bop_lush_desert_grass", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_MARSH_GRASS, "bop_marsh_grass", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_MEADOW_GRASS, "bop_meadow_grass", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_GRASS, "bop_muskeg_grass", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_GRASS, "bop_orchard_grass", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_GRASS, "bop_prairie_grass", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_GRASS, "bop_scrubland_grass", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_GRASS, "bop_shrubland_grass", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_GRASS, "bop_tundra_grass", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_GRASS, "bop_wasteland_grass", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_WETLAND_GRASS, "bop_wetland_grass", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_GRASS, "bop_origin_valley_grass", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_GRASS, "bop_fungal_field_variant_grass", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.GRASS, "grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_BAMBOO_BLOSSOM_GROVE_GRASS, "tall_bop_bamboo_blossom_grove_grass", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_BURNT_FOREST_GRASS, "tall_bop_burnt_forest_grass", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_CHERRY_BLOSSOM_GROVE_GRASS, "tall_bop_cherry_blossom_grove_grass", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_CONIFEROUS_FOREST_GRASS, "tall_bop_coniferous_forest_grass", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_FUNGAL_FIELD_GRASS, "tall_bop_fungal_field_grass", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_DEAD_FOREST_GRASS, "tall_bop_dead_forest_grass", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_WOODLAND_GRASS, "tall_bop_woodland_grass", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_GROVE_GRASS, "tall_bop_grove_grass", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_MYSTIC_GROVE_GRASS, "tall_bop_mystic_grove_grass", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_OMINOUS_WOODS_GRASS, "tall_bop_ominous_woods_grass", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_RAINFOREST_GRASS, "tall_bop_rainforest_grass", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_REDWOOD_FOREST_GRASS, "tall_bop_redwood_forest_grass", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_SEASONAL_FOREST_GRASS, "tall_bop_seasonal_forest_grass", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_TROPICS_GRASS, "tall_bop_tropics_grass", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_JADE_CLIFFS_GRASS, "tall_bop_jade_cliffs_grass", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_RAINBOW_HILLS_GRASS, "tall_bop_rainbow_hills_grass", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_VOLCANO_GRASS, "tall_bop_volcano_grass", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_BAYOU_GRASS, "tall_bop_bayou_grass", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_DRYLAND_GRASS, "tall_bop_dryland_grass", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_GRAVEL_BEACH_GRASS, "tall_bop_gravel_beach_grass", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_LAVENDER_FIELD_GRASS, "tall_bop_lavender_field_grass", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_LUSH_DESERT_GRASS, "tall_bop_lush_desert_grass", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_MARSH_GRASS, "tall_bop_marsh_grass", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_MEADOW_GRASS, "tall_bop_meadow_grass", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_MUSKEG_GRASS, "tall_bop_muskeg_grass", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_ORCHARD_GRASS, "tall_bop_orchard_grass", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_PRAIRIE_GRASS, "tall_bop_prairie_grass", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_SCRUBLAND_GRASS, "tall_bop_scrubland_grass", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_SHRUBLAND_GRASS, "tall_bop_shrubland_grass", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_TUNDRA_GRASS, "tall_bop_tundra_grass", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_WASTELAND_GRASS, "tall_bop_wasteland_grass", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_WETLAND_GRASS, "tall_bop_wetland_grass", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_ORIGIN_VALLEY_GRASS, "tall_bop_origin_valley_grass", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");
        plantBlockPlus(consumer, BOPBlocks.TALL_BOP_FUNGAL_FIELD_VARIANT_GRASS, "tall_bop_fungal_field_variant_grass", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.TALL_GRASS, "tall_grass");

        plantBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_FERN, "bop_bamboo_blossom_grove_fern", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_FERN, "bop_burnt_forest_fern", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_FERN, "bop_cherry_blossom_grove_fern", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_FERN, "bop_coniferous_forest_fern", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_FERN, "bop_fungal_field_fern", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_FERN, "bop_dead_forest_fern", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_FERN, "bop_woodland_fern", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_GROVE_FERN, "bop_grove_fern", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_FERN, "bop_mystic_grove_fern", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_FERN, "bop_ominous_woods_fern", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_FERN, "bop_rainforest_fern", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_FERN, "bop_redwood_forest_fern", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_FERN, "bop_seasonal_forest_fern", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_TROPICS_FERN, "bop_tropics_fern", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_FERN, "bop_jade_cliffs_fern", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_FERN, "bop_rainbow_hills_fern", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_FERN, "bop_volcano_fern", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_BAYOU_FERN, "bop_bayou_fern", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_FERN, "bop_dryland_fern", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_FERN, "bop_gravel_beach_fern", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_FERN, "bop_lavender_field_fern", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_FERN, "bop_lush_desert_fern", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_MARSH_FERN, "bop_marsh_fern", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_MEADOW_FERN, "bop_meadow_fern", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_FERN, "bop_muskeg_fern", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_FERN, "bop_orchard_fern", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_FERN, "bop_prairie_fern", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_FERN, "bop_scrubland_fern", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_FERN, "bop_shrubland_fern", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_FERN, "bop_tundra_fern", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_FERN, "bop_wasteland_fern", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_WETLAND_FERN, "bop_wetland_fern", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_FERN, "bop_origin_valley_fern", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_FERN, "bop_fungal_field_variant_fern", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.FERNS, "ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_BAMBOO_BLOSSOM_GROVE_FERN, "large_bop_bamboo_blossom_grove_fern", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_BURNT_FOREST_FERN, "large_bop_burnt_forest_fern", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_CHERRY_BLOSSOM_GROVE_FERN, "large_bop_cherry_blossom_grove_fern", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_CONIFEROUS_FOREST_FERN, "large_bop_coniferous_forest_fern", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_FUNGAL_FIELD_FERN, "large_bop_fungal_field_fern", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_DEAD_FOREST_FERN, "large_bop_dead_forest_fern", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_WOODLAND_FERN, "large_bop_woodland_fern", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_GROVE_FERN, "large_bop_grove_fern", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_MYSTIC_GROVE_FERN, "large_bop_mystic_grove_fern", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_OMINOUS_WOODS_FERN, "large_bop_ominous_woods_fern", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_RAINFOREST_FERN, "large_bop_rainforest_fern", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_REDWOOD_FOREST_FERN, "large_bop_redwood_forest_fern", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_SEASONAL_FOREST_FERN, "large_bop_seasonal_forest_fern", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_TROPICS_FERN, "large_bop_tropics_fern", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_JADE_CLIFFS_FERN, "large_bop_jade_cliffs_fern", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_RAINBOW_HILLS_FERN, "large_bop_rainbow_hills_fern", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_VOLCANO_FERN, "large_bop_volcano_fern", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_BAYOU_FERN, "large_bop_bayou_fern", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_DRYLAND_FERN, "large_bop_dryland_fern", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_GRAVEL_BEACH_FERN, "large_bop_gravel_beach_fern", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_LAVENDER_FIELD_FERN, "large_bop_lavender_field_fern", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_LUSH_DESERT_FERN, "large_bop_lush_desert_fern", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_MARSH_FERN, "large_bop_marsh_fern", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_MEADOW_FERN, "large_bop_meadow_fern", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_MUSKEG_FERN, "large_bop_muskeg_fern", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_ORCHARD_FERN, "large_bop_orchard_fern", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_PRAIRIE_FERN, "large_bop_prairie_fern", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_SCRUBLAND_FERN, "large_bop_scrubland_fern", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_SHRUBLAND_FERN, "large_bop_shrubland_fern", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_TUNDRA_FERN, "large_bop_tundra_fern", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_WASTELAND_FERN, "large_bop_wasteland_fern", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_WETLAND_FERN, "large_bop_wetland_fern", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_ORIGIN_VALLEY_FERN, "large_bop_origin_valley_fern", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");
        plantBlockPlus(consumer, BOPBlocks.LARGE_BOP_FUNGAL_FIELD_VARIANT_FERN, "large_bop_fungal_field_variant_fern", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.LARGE_FERNS, "large_ferns");

        plantBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_VINE, "bop_bamboo_blossom_grove_vine", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_VINE, "bop_burnt_forest_vine", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_VINE, "bop_cherry_blossom_grove_vine", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_VINE, "bop_coniferous_forest_vine", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VINE, "bop_fungal_field_vine", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_VINE, "bop_dead_forest_vine", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_VINE, "bop_woodland_vine", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_GROVE_VINE, "bop_grove_vine", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_VINE, "bop_mystic_grove_vine", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_VINE, "bop_ominous_woods_vine", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_VINE, "bop_rainforest_vine", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_VINE, "bop_redwood_forest_vine", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_VINE, "bop_seasonal_forest_vine", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_TROPICS_VINE, "bop_tropics_vine", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_VINE, "bop_jade_cliffs_vine", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_VINE, "bop_rainbow_hills_vine", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_VINE, "bop_volcano_vine", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_BAYOU_VINE, "bop_bayou_vine", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_VINE, "bop_dryland_vine", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_VINE, "bop_gravel_beach_vine", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_VINE, "bop_lavender_field_vine", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_VINE, "bop_lush_desert_vine", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_MARSH_VINE, "bop_marsh_vine", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_MEADOW_VINE, "bop_meadow_vine", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_VINE, "bop_muskeg_vine", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_VINE, "bop_orchard_vine", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_VINE, "bop_prairie_vine", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_VINE, "bop_scrubland_vine", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_VINE, "bop_shrubland_vine", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_VINE, "bop_tundra_vine", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_VINE, "bop_wasteland_vine", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_WETLAND_VINE, "bop_wetland_vine", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_VINE, "bop_origin_valley_vine", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.VINES, "vines");

        plantBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_SUGAR_CANE, "bop_bamboo_blossom_grove_sugar_cane", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_SUGAR_CANE, "bop_burnt_forest_sugar_cane", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_SUGAR_CANE, "bop_cherry_blossom_grove_sugar_cane", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_SUGAR_CANE, "bop_coniferous_forest_sugar_cane", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_SUGAR_CANE, "bop_fungal_field_sugar_cane", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_SUGAR_CANE, "bop_dead_forest_sugar_cane", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_SUGAR_CANE, "bop_woodland_sugar_cane", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_GROVE_SUGAR_CANE, "bop_grove_sugar_cane", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_SUGAR_CANE, "bop_mystic_grove_sugar_cane", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_SUGAR_CANE, "bop_ominous_woods_sugar_cane", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_SUGAR_CANE, "bop_rainforest_sugar_cane", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_SUGAR_CANE, "bop_redwood_forest_sugar_cane", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_SUGAR_CANE, "bop_seasonal_forest_sugar_cane", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_TROPICS_SUGAR_CANE, "bop_tropics_sugar_cane", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_SUGAR_CANE, "bop_jade_cliffs_sugar_cane", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_SUGAR_CANE, "bop_rainbow_hills_sugar_cane", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_SUGAR_CANE, "bop_volcano_sugar_cane", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_BAYOU_SUGAR_CANE, "bop_bayou_sugar_cane", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_SUGAR_CANE, "bop_dryland_sugar_cane", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_SUGAR_CANE, "bop_gravel_beach_sugar_cane", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_SUGAR_CANE, "bop_lavender_field_sugar_cane", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_SUGAR_CANE, "bop_lush_desert_sugar_cane", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_MARSH_SUGAR_CANE, "bop_marsh_sugar_cane", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_MEADOW_SUGAR_CANE, "bop_meadow_sugar_cane", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_SUGAR_CANE, "bop_muskeg_sugar_cane", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_SUGAR_CANE, "bop_orchard_sugar_cane", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_SUGAR_CANE, "bop_prairie_sugar_cane", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_SUGAR_CANE, "bop_scrubland_sugar_cane", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_SUGAR_CANE, "bop_shrubland_sugar_cane", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_SUGAR_CANE, "bop_tundra_sugar_cane", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_SUGAR_CANE, "bop_wasteland_sugar_cane", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_WETLAND_SUGAR_CANE, "bop_wetland_sugar_cane", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_SUGAR_CANE, "bop_origin_valley_sugar_cane", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");
        plantBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_SUGAR_CANE, "bop_fungal_field_variant_sugar_cane", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, ARFOItemTags.SUGAR_CANES, "sugar_canes");

        overgrownBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_STONE, "bop_bamboo_blossom_grove_overgrown_stone", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_STONE, "bop_burnt_forest_overgrown_stone", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_STONE, "bop_cherry_blossom_grove_overgrown_stone", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_STONE, "bop_coniferous_forest_overgrown_stone", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_STONE, "bop_fungal_field_overgrown_stone", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_STONE, "bop_dead_forest_overgrown_stone", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_OVERGROWN_STONE, "bop_woodland_overgrown_stone", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_GROVE_OVERGROWN_STONE, "bop_grove_overgrown_stone", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_STONE, "bop_mystic_grove_overgrown_stone", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_STONE, "bop_ominous_woods_overgrown_stone", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_OVERGROWN_STONE, "bop_rainforest_overgrown_stone", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_STONE, "bop_redwood_forest_overgrown_stone", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_STONE, "bop_seasonal_forest_overgrown_stone", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_TROPICS_OVERGROWN_STONE, "bop_tropics_overgrown_stone", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_STONE, "bop_jade_cliffs_overgrown_stone", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_STONE, "bop_rainbow_hills_overgrown_stone", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_OVERGROWN_STONE, "bop_volcano_overgrown_stone", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_BAYOU_OVERGROWN_STONE, "bop_bayou_overgrown_stone", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_OVERGROWN_STONE, "bop_dryland_overgrown_stone", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_STONE, "bop_gravel_beach_overgrown_stone", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_STONE, "bop_lavender_field_overgrown_stone", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_STONE, "bop_lush_desert_overgrown_stone", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MARSH_OVERGROWN_STONE, "bop_marsh_overgrown_stone", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MEADOW_OVERGROWN_STONE, "bop_meadow_overgrown_stone", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_OVERGROWN_STONE, "bop_muskeg_overgrown_stone", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_OVERGROWN_STONE, "bop_orchard_overgrown_stone", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_OVERGROWN_STONE, "bop_prairie_overgrown_stone", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_OVERGROWN_STONE, "bop_scrubland_overgrown_stone", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_OVERGROWN_STONE, "bop_shrubland_overgrown_stone", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_OVERGROWN_STONE, "bop_tundra_overgrown_stone", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_OVERGROWN_STONE, "bop_wasteland_overgrown_stone", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WETLAND_OVERGROWN_STONE, "bop_wetland_overgrown_stone", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_STONE, "bop_origin_valley_overgrown_stone", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.STONE, "overgrown_stone");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_STONE, "bop_fungal_field_variant_overgrown_stone", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, Items.STONE, "overgrown_stone");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_STONE_SLAB, "bop_bamboo_blossom_grove_overgrown_stone_slab", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_STONE_SLAB, "bop_burnt_forest_overgrown_stone_slab", BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_STONE_SLAB, "bop_cherry_blossom_grove_overgrown_stone_slab", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_STONE_SLAB, "bop_coniferous_forest_overgrown_stone_slab", BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_STONE_SLAB, "bop_fungal_field_overgrown_stone_slab", BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_STONE_SLAB, "bop_dead_forest_overgrown_stone_slab", BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_OVERGROWN_STONE_SLAB, "bop_woodland_overgrown_stone_slab", BOPBlocks.BOP_WOODLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_OVERGROWN_STONE_SLAB, "bop_grove_overgrown_stone_slab", BOPBlocks.BOP_GROVE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_STONE_SLAB, "bop_mystic_grove_overgrown_stone_slab", BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_STONE_SLAB, "bop_ominous_woods_overgrown_stone_slab", BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_OVERGROWN_STONE_SLAB, "bop_rainforest_overgrown_stone_slab", BOPBlocks.BOP_RAINFOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_STONE_SLAB, "bop_redwood_forest_overgrown_stone_slab", BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_STONE_SLAB, "bop_seasonal_forest_overgrown_stone_slab", BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_OVERGROWN_STONE_SLAB, "bop_tropics_overgrown_stone_slab", BOPBlocks.BOP_TROPICS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_STONE_SLAB, "bop_jade_cliffs_overgrown_stone_slab", BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_STONE_SLAB, "bop_rainbow_hills_overgrown_stone_slab", BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_OVERGROWN_STONE_SLAB, "bop_volcano_overgrown_stone_slab", BOPBlocks.BOP_VOLCANO_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_OVERGROWN_STONE_SLAB, "bop_bayou_overgrown_stone_slab", BOPBlocks.BOP_BAYOU_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_OVERGROWN_STONE_SLAB, "bop_dryland_overgrown_stone_slab", BOPBlocks.BOP_DRYLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_STONE_SLAB, "bop_gravel_beach_overgrown_stone_slab", BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_STONE_SLAB, "bop_lavender_field_overgrown_stone_slab", BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_STONE_SLAB, "bop_lush_desert_overgrown_stone_slab", BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_OVERGROWN_STONE_SLAB, "bop_marsh_overgrown_stone_slab", BOPBlocks.BOP_MARSH_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_OVERGROWN_STONE_SLAB, "bop_meadow_overgrown_stone_slab", BOPBlocks.BOP_MEADOW_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_OVERGROWN_STONE_SLAB, "bop_muskeg_overgrown_stone_slab", BOPBlocks.BOP_MUSKEG_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_OVERGROWN_STONE_SLAB, "bop_orchard_overgrown_stone_slab", BOPBlocks.BOP_ORCHARD_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_OVERGROWN_STONE_SLAB, "bop_prairie_overgrown_stone_slab", BOPBlocks.BOP_PRAIRIE_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_OVERGROWN_STONE_SLAB, "bop_scrubland_overgrown_stone_slab", BOPBlocks.BOP_SCRUBLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_OVERGROWN_STONE_SLAB, "bop_shrubland_overgrown_stone_slab", BOPBlocks.BOP_SHRUBLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_OVERGROWN_STONE_SLAB, "bop_tundra_overgrown_stone_slab", BOPBlocks.BOP_TUNDRA_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_OVERGROWN_STONE_SLAB, "bop_wasteland_overgrown_stone_slab", BOPBlocks.BOP_WASTELAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_OVERGROWN_STONE_SLAB, "bop_wetland_overgrown_stone_slab", BOPBlocks.BOP_WETLAND_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_STONE_SLAB, "bop_origin_valley_overgrown_stone_slab", BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_STONE, "overgrown_stone_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_STONE_SLAB, "bop_fungal_field_variant_overgrown_stone_slab", BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_STONE, "overgrown_stone_slab_blocks");

        overgrownBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_DACITE, "bop_bamboo_blossom_grove_overgrown_dacite", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_DACITE, "bop_burnt_forest_overgrown_dacite", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_DACITE, "bop_cherry_blossom_grove_overgrown_dacite", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_DACITE, "bop_coniferous_forest_overgrown_dacite", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_DACITE, "bop_fungal_field_overgrown_dacite", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_DACITE, "bop_dead_forest_overgrown_dacite", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_OVERGROWN_DACITE, "bop_woodland_overgrown_dacite", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_GROVE_OVERGROWN_DACITE, "bop_grove_overgrown_dacite", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_DACITE, "bop_mystic_grove_overgrown_dacite", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_DACITE, "bop_ominous_woods_overgrown_dacite", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_OVERGROWN_DACITE, "bop_rainforest_overgrown_dacite", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_DACITE, "bop_redwood_forest_overgrown_dacite", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_DACITE, "bop_seasonal_forest_overgrown_dacite", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_TROPICS_OVERGROWN_DACITE, "bop_tropics_overgrown_dacite", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_DACITE, "bop_jade_cliffs_overgrown_dacite", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_DACITE, "bop_rainbow_hills_overgrown_dacite", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_OVERGROWN_DACITE, "bop_volcano_overgrown_dacite", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_BAYOU_OVERGROWN_DACITE, "bop_bayou_overgrown_dacite", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_OVERGROWN_DACITE, "bop_dryland_overgrown_dacite", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_DACITE, "bop_gravel_beach_overgrown_dacite", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_DACITE, "bop_lavender_field_overgrown_dacite", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_DACITE, "bop_lush_desert_overgrown_dacite", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MARSH_OVERGROWN_DACITE, "bop_marsh_overgrown_dacite", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MEADOW_OVERGROWN_DACITE, "bop_meadow_overgrown_dacite", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_OVERGROWN_DACITE, "bop_muskeg_overgrown_dacite", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_OVERGROWN_DACITE, "bop_orchard_overgrown_dacite", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_OVERGROWN_DACITE, "bop_prairie_overgrown_dacite", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_OVERGROWN_DACITE, "bop_scrubland_overgrown_dacite", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_OVERGROWN_DACITE, "bop_shrubland_overgrown_dacite", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_OVERGROWN_DACITE, "bop_tundra_overgrown_dacite", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_OVERGROWN_DACITE, "bop_wasteland_overgrown_dacite", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WETLAND_OVERGROWN_DACITE, "bop_wetland_overgrown_dacite", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_DACITE, "bop_origin_valley_overgrown_dacite", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.DIORITE, "overgrown_dacite");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_DACITE, "bop_fungal_field_variant_overgrown_dacite", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, Items.DIORITE, "overgrown_dacite");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_DACITE_SLAB, "bop_bamboo_blossom_grove_overgrown_dacite_slab", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_DACITE_SLAB, "bop_burnt_forest_overgrown_dacite_slab", BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_DACITE_SLAB, "bop_cherry_blossom_grove_overgrown_dacite_slab", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_DACITE_SLAB, "bop_coniferous_forest_overgrown_dacite_slab", BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_DACITE_SLAB, "bop_fungal_field_overgrown_dacite_slab", BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_DACITE_SLAB, "bop_dead_forest_overgrown_dacite_slab", BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_OVERGROWN_DACITE_SLAB, "bop_woodland_overgrown_dacite_slab", BOPBlocks.BOP_WOODLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_OVERGROWN_DACITE_SLAB, "bop_grove_overgrown_dacite_slab", BOPBlocks.BOP_GROVE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_DACITE_SLAB, "bop_mystic_grove_overgrown_dacite_slab", BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_DACITE_SLAB, "bop_ominous_woods_overgrown_dacite_slab", BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_OVERGROWN_DACITE_SLAB, "bop_rainforest_overgrown_dacite_slab", BOPBlocks.BOP_RAINFOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_DACITE_SLAB, "bop_redwood_forest_overgrown_dacite_slab", BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_DACITE_SLAB, "bop_seasonal_forest_overgrown_dacite_slab", BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_OVERGROWN_DACITE_SLAB, "bop_tropics_overgrown_dacite_slab", BOPBlocks.BOP_TROPICS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_DACITE_SLAB, "bop_jade_cliffs_overgrown_dacite_slab", BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_DACITE_SLAB, "bop_rainbow_hills_overgrown_dacite_slab", BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_OVERGROWN_DACITE_SLAB, "bop_volcano_overgrown_dacite_slab", BOPBlocks.BOP_VOLCANO_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_OVERGROWN_DACITE_SLAB, "bop_bayou_overgrown_dacite_slab", BOPBlocks.BOP_BAYOU_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_OVERGROWN_DACITE_SLAB, "bop_dryland_overgrown_dacite_slab", BOPBlocks.BOP_DRYLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_DACITE_SLAB, "bop_gravel_beach_overgrown_dacite_slab", BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_DACITE_SLAB, "bop_lavender_field_overgrown_dacite_slab", BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_DACITE_SLAB, "bop_lush_desert_overgrown_dacite_slab", BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_OVERGROWN_DACITE_SLAB, "bop_marsh_overgrown_dacite_slab", BOPBlocks.BOP_MARSH_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_OVERGROWN_DACITE_SLAB, "bop_meadow_overgrown_dacite_slab", BOPBlocks.BOP_MEADOW_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_OVERGROWN_DACITE_SLAB, "bop_muskeg_overgrown_dacite_slab", BOPBlocks.BOP_MUSKEG_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_OVERGROWN_DACITE_SLAB, "bop_orchard_overgrown_dacite_slab", BOPBlocks.BOP_ORCHARD_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_OVERGROWN_DACITE_SLAB, "bop_prairie_overgrown_dacite_slab", BOPBlocks.BOP_PRAIRIE_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_OVERGROWN_DACITE_SLAB, "bop_scrubland_overgrown_dacite_slab", BOPBlocks.BOP_SCRUBLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_OVERGROWN_DACITE_SLAB, "bop_shrubland_overgrown_dacite_slab", BOPBlocks.BOP_SHRUBLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_OVERGROWN_DACITE_SLAB, "bop_tundra_overgrown_dacite_slab", BOPBlocks.BOP_TUNDRA_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_OVERGROWN_DACITE_SLAB, "bop_wasteland_overgrown_dacite_slab", BOPBlocks.BOP_WASTELAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_OVERGROWN_DACITE_SLAB, "bop_wetland_overgrown_dacite_slab", BOPBlocks.BOP_WETLAND_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_DACITE_SLAB, "bop_origin_valley_overgrown_dacite_slab", BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_DACITE_SLAB, "bop_fungal_field_variant_overgrown_dacite_slab", BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_DACITE, "overgrown_dacite_slab_blocks");

        overgrownBlockPlus(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_NETHERRACK, "bop_bamboo_blossom_grove_overgrown_netherrack", ARFOItems.JUNGLE_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_NETHERRACK, "bop_burnt_forest_overgrown_netherrack", ARFOItems.BADLANDS_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_NETHERRACK, "bop_cherry_blossom_grove_overgrown_netherrack", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "bop_coniferous_forest_overgrown_netherrack", ARFOItems.TAIGA_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_NETHERRACK, "bop_fungal_field_overgrown_netherrack", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_NETHERRACK, "bop_dead_forest_overgrown_netherrack", ARFOItems.SWAMP_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WOODLAND_OVERGROWN_NETHERRACK, "bop_woodland_overgrown_netherrack", ARFOItems.PLAINS_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_GROVE_OVERGROWN_NETHERRACK, "bop_grove_overgrown_netherrack", ARFOItems.FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_NETHERRACK, "bop_mystic_grove_overgrown_netherrack", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_NETHERRACK, "bop_ominous_woods_overgrown_netherrack", ARFOItems.DARK_FOREST_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_RAINFOREST_OVERGROWN_NETHERRACK, "bop_rainforest_overgrown_netherrack", ARFOItems.WATERS_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_NETHERRACK, "bop_redwood_forest_overgrown_netherrack", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_NETHERRACK, "bop_seasonal_forest_overgrown_netherrack", ARFOItems.SNOWY_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_TROPICS_OVERGROWN_NETHERRACK, "bop_tropics_overgrown_netherrack", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_NETHERRACK, "bop_jade_cliffs_overgrown_netherrack", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_NETHERRACK, "bop_rainbow_hills_overgrown_netherrack", ARFOItems.SAVANNA_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_VOLCANO_OVERGROWN_NETHERRACK, "bop_volcano_overgrown_netherrack", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_BAYOU_OVERGROWN_NETHERRACK, "bop_bayou_overgrown_netherrack", ARFOItems.SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_DRYLAND_OVERGROWN_NETHERRACK, "bop_dryland_overgrown_netherrack", ARFOItems.JUNGLE_EDGE_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_NETHERRACK, "bop_gravel_beach_overgrown_netherrack", ARFOItems.SNOWY_BEACH_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_NETHERRACK, "bop_lavender_field_overgrown_netherrack", ARFOItems.BIRCH_FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_NETHERRACK, "bop_lush_desert_overgrown_netherrack", ARFOItems.JUNGLE_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MARSH_OVERGROWN_NETHERRACK, "bop_marsh_overgrown_netherrack", ARFOItems.LUSH_SWAMP_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MEADOW_OVERGROWN_NETHERRACK, "bop_meadow_overgrown_netherrack", ARFOItems.MUSHROOM_FIELDS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_MUSKEG_OVERGROWN_NETHERRACK, "bop_muskeg_overgrown_netherrack", ARFOItems.MEGA_TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_ORCHARD_OVERGROWN_NETHERRACK, "bop_orchard_overgrown_netherrack", ARFOItems.FOREST_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_PRAIRIE_OVERGROWN_NETHERRACK, "bop_prairie_overgrown_netherrack", ARFOItems.PLAINS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SCRUBLAND_OVERGROWN_NETHERRACK, "bop_scrubland_overgrown_netherrack", ARFOItems.SAVANNA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_SHRUBLAND_OVERGROWN_NETHERRACK, "bop_shrubland_overgrown_netherrack", ARFOItems.SNOWY_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_TUNDRA_OVERGROWN_NETHERRACK, "bop_tundra_overgrown_netherrack", ARFOItems.TAIGA_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WASTELAND_OVERGROWN_NETHERRACK, "bop_wasteland_overgrown_netherrack", ARFOItems.BADLANDS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_WETLAND_OVERGROWN_NETHERRACK, "bop_wetland_overgrown_netherrack", ARFOItems.WATERS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_NETHERRACK, "bop_origin_valley_overgrown_netherrack", ARFOItems.MOUNTAINS_DYE, BOPItems.BOP_FLATLAND_DYE, Items.NETHERRACK, "overgrown_netherrack");
        overgrownBlockPlus(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_NETHERRACK, "bop_fungal_field_variant_overgrown_netherrack", Items.CYAN_DYE, BOPItems.BOP_GROVE_DYE, Items.NETHERRACK, "overgrown_netherrack");
        slabBlock(consumer, BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_NETHERRACK_SLAB, "bop_bamboo_blossom_grove_overgrown_netherrack_slab", BOPBlocks.BOP_BAMBOO_BLOSSOM_GROVE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_NETHERRACK_SLAB, "bop_burnt_forest_overgrown_netherrack_slab", BOPBlocks.BOP_BURNT_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_NETHERRACK_SLAB, "bop_cherry_blossom_grove_overgrown_netherrack_slab", BOPBlocks.BOP_CHERRY_BLOSSOM_GROVE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK_SLAB, "bop_coniferous_forest_overgrown_netherrack_slab", BOPBlocks.BOP_CONIFEROUS_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_NETHERRACK_SLAB, "bop_fungal_field_overgrown_netherrack_slab", BOPBlocks.BOP_FUNGAL_FIELD_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_NETHERRACK_SLAB, "bop_dead_forest_overgrown_netherrack_slab", BOPBlocks.BOP_DEAD_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WOODLAND_OVERGROWN_NETHERRACK_SLAB, "bop_woodland_overgrown_netherrack_slab", BOPBlocks.BOP_WOODLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GROVE_OVERGROWN_NETHERRACK_SLAB, "bop_grove_overgrown_netherrack_slab", BOPBlocks.BOP_GROVE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_NETHERRACK_SLAB, "bop_mystic_grove_overgrown_netherrack_slab", BOPBlocks.BOP_MYSTIC_GROVE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_NETHERRACK_SLAB, "bop_ominous_woods_overgrown_netherrack_slab", BOPBlocks.BOP_OMINOUS_WOODS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINFOREST_OVERGROWN_NETHERRACK_SLAB, "bop_rainforest_overgrown_netherrack_slab", BOPBlocks.BOP_RAINFOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_NETHERRACK_SLAB, "bop_redwood_forest_overgrown_netherrack_slab", BOPBlocks.BOP_REDWOOD_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_NETHERRACK_SLAB, "bop_seasonal_forest_overgrown_netherrack_slab", BOPBlocks.BOP_SEASONAL_FOREST_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TROPICS_OVERGROWN_NETHERRACK_SLAB, "bop_tropics_overgrown_netherrack_slab", BOPBlocks.BOP_TROPICS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_NETHERRACK_SLAB, "bop_jade_cliffs_overgrown_netherrack_slab", BOPBlocks.BOP_JADE_CLIFFS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_NETHERRACK_SLAB, "bop_rainbow_hills_overgrown_netherrack_slab", BOPBlocks.BOP_RAINBOW_HILLS_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_VOLCANO_OVERGROWN_NETHERRACK_SLAB, "bop_volcano_overgrown_netherrack_slab", BOPBlocks.BOP_VOLCANO_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_BAYOU_OVERGROWN_NETHERRACK_SLAB, "bop_bayou_overgrown_netherrack_slab", BOPBlocks.BOP_BAYOU_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_DRYLAND_OVERGROWN_NETHERRACK_SLAB, "bop_dryland_overgrown_netherrack_slab", BOPBlocks.BOP_DRYLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_NETHERRACK_SLAB, "bop_gravel_beach_overgrown_netherrack_slab", BOPBlocks.BOP_GRAVEL_BEACH_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_NETHERRACK_SLAB, "bop_lavender_field_overgrown_netherrack_slab", BOPBlocks.BOP_LAVENDER_FIELD_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_NETHERRACK_SLAB, "bop_lush_desert_overgrown_netherrack_slab", BOPBlocks.BOP_LUSH_DESERT_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MARSH_OVERGROWN_NETHERRACK_SLAB, "bop_marsh_overgrown_netherrack_slab", BOPBlocks.BOP_MARSH_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MEADOW_OVERGROWN_NETHERRACK_SLAB, "bop_meadow_overgrown_netherrack_slab", BOPBlocks.BOP_MEADOW_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_MUSKEG_OVERGROWN_NETHERRACK_SLAB, "bop_muskeg_overgrown_netherrack_slab", BOPBlocks.BOP_MUSKEG_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORCHARD_OVERGROWN_NETHERRACK_SLAB, "bop_orchard_overgrown_netherrack_slab", BOPBlocks.BOP_ORCHARD_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_PRAIRIE_OVERGROWN_NETHERRACK_SLAB, "bop_prairie_overgrown_netherrack_slab", BOPBlocks.BOP_PRAIRIE_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SCRUBLAND_OVERGROWN_NETHERRACK_SLAB, "bop_scrubland_overgrown_netherrack_slab", BOPBlocks.BOP_SCRUBLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_SHRUBLAND_OVERGROWN_NETHERRACK_SLAB, "bop_shrubland_overgrown_netherrack_slab", BOPBlocks.BOP_SHRUBLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_TUNDRA_OVERGROWN_NETHERRACK_SLAB, "bop_tundra_overgrown_netherrack_slab", BOPBlocks.BOP_TUNDRA_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WASTELAND_OVERGROWN_NETHERRACK_SLAB, "bop_wasteland_overgrown_netherrack_slab", BOPBlocks.BOP_WASTELAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_WETLAND_OVERGROWN_NETHERRACK_SLAB, "bop_wetland_overgrown_netherrack_slab", BOPBlocks.BOP_WETLAND_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_NETHERRACK_SLAB, "bop_origin_valley_overgrown_netherrack_slab", BOPBlocks.BOP_ORIGIN_VALLEY_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");
        slabBlock(consumer, BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_NETHERRACK_SLAB, "bop_fungal_field_variant_overgrown_netherrack_slab", BOPBlocks.BOP_FUNGAL_FIELD_VARIANT_OVERGROWN_NETHERRACK, "overgrown_netherrack_slab_blocks");



        // other stuff
        ShapedRecipeBuilder.shaped(ARFOBlocks.ARTIFICIAL_SOIL, 4)
                .define('X', Blocks.DIRT)
                .define('Y', Items.BONE_MEAL)
                .pattern("XXX")
                .pattern("XY ")
                .unlockedBy("has_item", has(Items.BONE_MEAL))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "artificial_soil"));

        ShapedRecipeBuilder.shaped(ARFOBlocks.ARTIFICIAL_STONE_SOIL, 4)
                .define('X', Blocks.STONE)
                .define('Y', Items.BONE_MEAL)
                .pattern("XXX")
                .pattern("XY ")
                .unlockedBy("has_item", has(Items.BONE_MEAL))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "artificial_stone_soil"));

        oddityBlock(consumer, ARFOBlocks.ALPHA_GRASS_BLOCK, "alpha_grass_block", Items.LIME_DYE, ARFOItemTags.GRASS_BLOCKS);
        oddityBlock(consumer, ARFOBlocks.ALPHA_LEAVES, "alpha_leaves", Items.LIME_DYE, ARFOItemTags.LEAVES);

        glowBlock(consumer, ARFOBlocks.GLOWING_CRIMSON_NYLIUM, "glowing_crimson_nylium", Blocks.CRIMSON_NYLIUM, "glowing_nether_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_WARPED_NYLIUM, "glowing_warped_nylium", Blocks.WARPED_NYLIUM, "glowing_nether_blocks");

        slabBlockMinusGroup(consumer, ARFOBlocks.DIRT_SLAB, "dirt_slab", Blocks.DIRT);
        slabBlockMinusGroup(consumer, ARFOBlocks.ARTIFICIAL_SOIL_SLAB, "artificial_soil_slab", ARFOBlocks.ARTIFICIAL_SOIL);
        slabBlockMinusGroup(consumer, ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB, "artificial_stone_soil_slab", ARFOBlocks.ARTIFICIAL_STONE_SOIL);
        slabBlockMinusGroup(consumer, ARFOBlocks.COARSE_DIRT_SLAB, "coarse_dirt_slab", Blocks.COARSE_DIRT);
        slabBlockMinusGroup(consumer, ARFOBlocks.GRASS_SLAB, "grass_slab", Blocks.GRASS_BLOCK);
        slabBlockMinusGroup(consumer, ARFOBlocks.PODZOL_SLAB, "podzol_slab", Blocks.PODZOL);
        slabBlockMinusGroup(consumer, ARFOBlocks.MYCELIUM_SLAB, "mycelium_slab", Blocks.MYCELIUM);
        slabBlockMinusGroup(consumer, ARFOBlocks.NETHERRACK_SLAB, "netherrack_slab", Blocks.NETHERRACK);
        slabBlockMinusGroup(consumer, ARFOBlocks.CRIMSON_NYLIUM_SLAB, "crimson_nylium_slab", Blocks.CRIMSON_NYLIUM);
        slabBlockMinusGroup(consumer, ARFOBlocks.WARPED_NYLIUM_SLAB, "warped_nylium_slab", Blocks.WARPED_NYLIUM);

        specialSlab(consumer, TraverseBlocks.TRAVERSE_RED_AUTUMNAL_LEAVES_CARPET, "traverse_red_autumnal_carpet", Blocks.OAK_LEAVES, Items.RED_DYE);
        specialSlab(consumer, TraverseBlocks.TRAVERSE_ORANGE_AUTUMNAL_LEAVES_CARPET, "traverse_orange_autumnal_carpet", Blocks.OAK_LEAVES, Items.ORANGE_DYE);
        specialSlab(consumer, TraverseBlocks.TRAVERSE_YELLOW_AUTUMNAL_LEAVES_CARPET, "traverse_yellow_autumnal_carpet", Blocks.OAK_LEAVES, Items.YELLOW_DYE);
        specialSlab(consumer, TraverseBlocks.TRAVERSE_BROWN_AUTUMNAL_LEAVES_CARPET, "traverse_brown_autumnal_carpet", Blocks.OAK_LEAVES, Items.BROWN_DYE);

        waterBucket(consumer, ARFOItems.FROZEN_OCEAN_WATER_BUCKET, "frozen_ocean_water_bucket", ARFOItemTags.FROZEN_DYES, "water_buckets");
        waterBucket(consumer, ARFOItems.COLD_OCEAN_WATER_BUCKET, "cold_ocean_water_bucket", ARFOItemTags.COLD_DYES, "water_buckets");
        waterBucket(consumer, ARFOItems.WARM_OCEAN_WATER_BUCKET, "warm_ocean_water_bucket", ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucket(consumer, ARFOItems.LUKEWARM_OCEAN_WATER_BUCKET, "lukewarm_ocean_water_bucket", ARFOItemTags.LUKEWARM_DYES, "water_buckets");
        waterBucket(consumer, ARFOItems.SWAMP_WATER_BUCKET, "swamp_water_bucket", ARFOItemTags.SWAMP_DYES, "water_buckets");
        waterBucket(consumer, ARFOItems.OCEAN_WATER_BUCKET, "ocean_water_bucket", ARFOItemTags.MODERATE_DYES, "water_buckets");

        waterBucketPlus(consumer, TraverseItems.TRAVERSE_CLIFFS_WATER_BUCKET, "traverse_cliffs_water_bucket", TraverseItems.TRAVERSE_DYE, ARFOItemTags.COLD_DYES, "water_buckets");
        waterBucketPlus(consumer, TraverseItems.TRAVERSE_MINI_JUNGLE_WATER_BUCKET, "traverse_mini_jungle_water_bucket", TraverseItems.TRAVERSE_DYE, ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucketPlus(consumer, TraverseItems.TRAVERSE_LUSH_SWAMP_WATER_BUCKET, "traverse_lush_swamp_water_bucket", TraverseItems.TRAVERSE_DYE, ARFOItemTags.SWAMP_DYES, "water_buckets");

        waterBucketPlus(consumer, BYGItems.BYG_BULBIS_GARDENS_WATER_BUCKET, "byg_bulbis_gardens_water_bucket", BYGItems.BYG_NETHER_DYE, ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_CRAG_GARDENS_WATER_BUCKET, "byg_crag_gardens_water_bucket", BYGItems.BYG_FOREST_DYE, ARFOItemTags.MODERATE_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_DEAD_SEA_WATER_BUCKET, "byg_dead_sea_water_bucket", BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.LUKEWARM_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_GLOWSHROOM_BAYOU_WATER_BUCKET, "byg_glowshroom_bayou_water_bucket", BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_ETHEREAL_ISLANDS_WATER_BUCKET, "byg_ethereal_islands_water_bucket", BYGItems.BYG_NETHER_DYE, ARFOItemTags.COLD_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_IMPARIUS_GROVE_WATER_BUCKET, "byg_imparius_grove_water_bucket", BYGItems.BYG_NETHER_DYE, ARFOItemTags.MODERATE_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_POLLUTED_LAKE_WATER_BUCKET, "byg_polluted_lake_water_bucket", BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.FROZEN_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_TROPICAL_ISLAND_WATER_BUCKET, "byg_tropical_island_water_bucket", BYGItems.BYG_FOREST_DYE, ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_SHULKREN_FOREST_WATER_BUCKET, "byg_shulkren_forest_water_bucket", BYGItems.BYG_NETHER_DYE, ARFOItemTags.MODERATE_DYES, "water_buckets");
        waterBucketPlus(consumer, BYGItems.BYG_VIBRANT_SWAMPLAND_WATER_BUCKET, "byg_vibrant_swampland_water_bucket", BYGItems.BYG_LOWLANDS_DYE, ARFOItemTags.SWAMP_DYES, "water_buckets");

        waterBucketPlus(consumer, BOPItems.BOP_BAYOU_WATER_BUCKET, "bop_bayou_water_bucket", BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.SWAMP_DYES, "water_buckets");
        waterBucketPlus(consumer, BOPItems.BOP_MYSTIC_GROVE_WATER_BUCKET, "bop_mystic_grove_water_bucket", BOPItems.BOP_GROVE_DYE, ARFOItemTags.SWAMP_DYES, "water_buckets");
        waterBucketPlus(consumer, BOPItems.BOP_OMINOUS_WOODS_WATER_BUCKET, "bop_ominous_woods_water_bucket", BOPItems.BOP_GROVE_DYE, ARFOItemTags.COLD_DYES, "water_buckets");
        waterBucketPlus(consumer, BOPItems.BOP_RAINFOREST_WATER_BUCKET, "bop_rainforest_water_bucket", BOPItems.BOP_GROVE_DYE, ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucketPlus(consumer, BOPItems.BOP_WASTELAND_WATER_BUCKET, "bop_wasteland_water_bucket", BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.WARM_DYES, "water_buckets");
        waterBucketPlus(consumer, BOPItems.BOP_WASTELAND_WATER_BUCKET, "bop_wetland_water_bucket", BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.COLD_DYES, "water_buckets");
        waterBucketPlus(consumer, BOPItems.BOP_ORIGIN_VALLEY_WATER_BUCKET, "bop_origin_valley_water_bucket", BOPItems.BOP_FLATLAND_DYE, ARFOItemTags.MODERATE_DYES, "water_buckets");



        ShapelessRecipeBuilder.shapeless(TraverseItems.TRAVERSE_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "traverse_dye"));

        slabBlockTwoItems(consumer, BYGBlocks.BYG_MEADOW_DIRT_SLAB, "byg_meadow_dirt_slab", Items.DIRT, Items.COARSE_DIRT);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_MEADOW_GRASS_SLAB, "byg_meadow_grass_slab", Items.DIRT, Items.GRASS_BLOCK);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_EMBUR_NYLIUM_SLAB, "byg_embur_nylium_slab", Items.NETHERRACK, Items.ORANGE_DYE);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_SYTHIAN_NYLIUM_SLAB, "byg_sythian_nylium_slab", Items.NETHERRACK, Items.YELLOW_DYE);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_BLUE_NETHERRACK_SLAB, "byg_blue_netherrack_slab", Items.NETHERRACK, Items.BLUE_DYE);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_MYCELIUM_NETHERRACK_SLAB, "byg_mycelium_netherrack_slab", Items.NETHERRACK, Items.MYCELIUM);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB, "byg_overgrown_crimson_blackstone_slab", Items.CRIMSON_NYLIUM, Items.BLACKSTONE);
        slabBlockTwoItems(consumer, BYGBlocks.BYG_PODZOL_DACITE_SLAB, "byg_podzol_dacite_slab", Items.DIORITE, Items.PODZOL);

        ShapelessRecipeBuilder.shapeless(BYGItems.BYG_FOREST_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "byg_forest_dye"));

        ShapelessRecipeBuilder.shapeless(BYGItems.BYG_LOWLANDS_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "byg_lowlands_dye"));

        ShapelessRecipeBuilder.shapeless(BYGItems.BYG_MOUNTAINS_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "byg_mountains_dye"));

        ShapelessRecipeBuilder.shapeless(BYGItems.BYG_NETHER_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "byg_nether_dye"));


        ShapelessRecipeBuilder.shapeless(BOPItems.BOP_GROVE_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "bop_grove_dye"));


        ShapelessRecipeBuilder.shapeless(BOPItems.BOP_FLATLAND_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "bop_flatland_dye"));




    }


    // artificial soil, alpha stuff
    private void oddityBlock(Consumer<IFinishedRecipe> consumer, Block baseBlock, String blockName, Item item, ITag.INamedTag<Item> blockTag) {
        ShapedRecipeBuilder.shaped(baseBlock, 4)
                .define('X', blockTag)
                .define('Y', item)
                .pattern("XXX")
                .pattern("XY ")
                .unlockedBy("has_item", has(item))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }



    // grass blocks, leaves block
    private void baseBlock(Consumer<IFinishedRecipe> consumer, Block baseBlock, String blockName, Item dye, ITag.INamedTag<Item> blockTag, String groupName) {
        ShapedRecipeBuilder.shaped(baseBlock, 4)
                .define('X', blockTag)
                .define('Y', dye)
                .pattern("XXX")
                .pattern("XY ")
                .group(groupName)
                .unlockedBy("has_item", has(dye))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    private void overgrownBaseBlock(Consumer<IFinishedRecipe> consumer, Block baseBlock, String blockName, Item dye, Item base, String groupName) {
        ShapedRecipeBuilder.shaped(baseBlock, 4)
                .define('X', base)
                .define('Y', dye)
                .pattern("XXX")
                .pattern("XY ")
                .group(groupName)
                .unlockedBy("has_item", has(dye))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // glowing grass blocks
    private void glowBlock(Consumer<IFinishedRecipe> consumer, Block baseBlock, String blockName, Block originBlock, String groupName) {
        ShapedRecipeBuilder.shaped(baseBlock, 4)
                .define('X', Items.GLOWSTONE_DUST)
                .define('Y', originBlock)
                .pattern("XXX")
                .pattern("XYX")
                .pattern("XXX")
                .group(groupName)
                .unlockedBy("has_item", has(originBlock))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // grass blocks, leaves block from other mods
    private void baseBlockPlus(Consumer<IFinishedRecipe> consumer, Block baseBlock, String blockName, Item dye, Item dyePlus, ITag.INamedTag<Item> blockTag, String groupName) {
        ShapedRecipeBuilder.shaped(baseBlock, 4)
                .define('X', blockTag)
                .define('Y', dye)
                .define('Z', dyePlus)
                .pattern("XXX")
                .pattern("XYZ")
                .group(groupName)
                .unlockedBy("has_item", has(dyePlus))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));

    }

    // overgrown blocks
    private void overgrownBlockPlus(Consumer<IFinishedRecipe> consumer, Block baseBlock, String blockName, Item dye, Item dyePlus, Item overgrownBlock, String groupName) {
        ShapedRecipeBuilder.shaped(baseBlock, 4)
                .define('X', overgrownBlock)
                .define('Y', dye)
                .define('Z', dyePlus)
                .pattern("XXX")
                .pattern("XYZ")
                .group(groupName)
                .unlockedBy("has_item", has(dyePlus))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // leaves carpet, grass slabs, and additional slabs
    private void slabBlock(Consumer<IFinishedRecipe> consumer, Block slab, String blockName, Block originBlock, String groupName) {
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('X', originBlock)
                .pattern("XXX")
                .group(groupName)
                .unlockedBy("has_item", has(originBlock))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // leaves carpet, grass slabs, and additional slabs
    private void slabBlockMinusGroup(Consumer<IFinishedRecipe> consumer, Block slab, String blockName, Block originBlock) {
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('X', originBlock)
                .pattern("XXX")
                .unlockedBy("has_item", has(originBlock))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // mostly byg slab
    private void slabBlockTwoItems(Consumer<IFinishedRecipe> consumer, Block slab, String blockName, Item one, Item two) {
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('X', one)
                .define('Y', two)
                .pattern("XYX")
                .unlockedBy("has_item", has(two))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // special carpets
    private void specialSlab(Consumer<IFinishedRecipe> consumer, Block slab, String blockName, Block originBlock, Item dye) {
        ShapedRecipeBuilder.shaped(slab, 6)
                .define('X', originBlock)
                .define('Y', dye)
                .pattern("XXX")
                .pattern("Y  ")
                .unlockedBy("has_item", has(originBlock))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // tall grass, grass, large ferns, fern
    private void plantBlock(Consumer<IFinishedRecipe> consumer, Block plant, String blockName, Item dye, ITag.INamedTag<Item> plantTag, String groupName) {
        ShapedRecipeBuilder.shaped(plant, 1)
                .define('X', plantTag)
                .define('Y', dye)
                .pattern("XY ")
                .group(groupName)
                .unlockedBy("has_item", has(plantTag))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // tall grass, grass, large ferns, fern that are from other mods
    private void plantBlockPlus(Consumer<IFinishedRecipe> consumer, Block plant, String blockName, Item dye, Item dyePlus, ITag.INamedTag<Item> plantTag, String groupName) {
        ShapedRecipeBuilder.shaped(plant, 1)
                .define('X', plantTag)
                .define('Y', dye)
                .define('Z', dyePlus)
                .pattern("XYZ")
                .group(groupName)
                .unlockedBy("has_item", has(plantTag))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    // water buckets
    private void waterBucket(Consumer<IFinishedRecipe> consumer, Item baseBlock, String blockName, ITag.INamedTag<Item> dyeTag, String group) {
        ShapedRecipeBuilder.shaped(baseBlock, 1)
                .define('X', Items.BUCKET)
                .define('Y', dyeTag)
                .pattern("XY ")
                .unlockedBy("has_item", has(Items.BUCKET))
                .group(group)
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    private void waterBucketPlus(Consumer<IFinishedRecipe> consumer, Item baseBlock, String blockName, Item dyePlus, ITag.INamedTag<Item> dyeTag, String group) {
        ShapedRecipeBuilder.shaped(baseBlock, 1)
                .define('X', Items.BUCKET)
                .define('Y', dyeTag)
                .define('Z', dyePlus)
                .pattern("XYZ")
                .unlockedBy("has_item", has(Items.BUCKET))
                .group(group)
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, blockName));
    }

    @Override
    public String getName() {
        return "Artificial Foliage recipes";
    }
}
