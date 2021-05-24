package com.finallion.arfo.data.providers;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.compat.Traverse.TraverseItems;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOItems;
import com.finallion.arfo.utils.ARFOBlockTags;
import com.finallion.arfo.utils.ARFOItemTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.crafting.ConditionalRecipe;
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

        // TRAVERSE BLOCKS
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

        // other stuff
        ShapedRecipeBuilder.shaped(ARFOBlocks.ARTIFICIAL_SOIL, 4)
                .define('X', Blocks.DIRT)
                .define('Y', ARFOItems.GRASS_SEED)
                .pattern("XXX")
                .pattern("XY ")
                .unlockedBy("has_item", has(ARFOItems.GRASS_SEED))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "artificial_soil"));

        oddityBlock(consumer, ARFOBlocks.ALPHA_GRASS_BLOCK, "alpha_grass_block", Items.LIME_DYE, ARFOItemTags.GRASS_BLOCKS);
        oddityBlock(consumer, ARFOBlocks.ALPHA_LEAVES, "alpha_leaves", Items.LIME_DYE, ARFOItemTags.LEAVES);

        glowBlock(consumer, ARFOBlocks.GLOWING_CRIMSON_NYLIUM, "glowing_crimson_nylium", Blocks.CRIMSON_NYLIUM, "glowing_nether_blocks");
        glowBlock(consumer, ARFOBlocks.GLOWING_WARPED_NYLIUM, "glowing_warped_nylium", Blocks.WARPED_NYLIUM, "glowing_nether_blocks");

        slabBlockMinusGroup(consumer, ARFOBlocks.DIRT_SLAB, "dirt_slab", Blocks.DIRT);
        slabBlockMinusGroup(consumer, ARFOBlocks.ARTIFICIAL_SOIL_SLAB, "artificial_soil_slab", ARFOBlocks.ARTIFICIAL_SOIL);
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

        ShapedRecipeBuilder.shaped(ARFOItems.GRASS_SEED, 1)
                .define('X', Items.WHEAT_SEEDS)
                .pattern("XX ")
                .pattern("XX ")
                .unlockedBy("has_item", has(Items.WHEAT_SEEDS))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "grass_seed"));

        ShapelessRecipeBuilder.shapeless(TraverseItems.TRAVERSE_DYE, 1)
                .requires(ARFOItemTags.DYES)
                .unlockedBy("has_item", has(ARFOItemTags.DYES))
                .save(consumer, new ResourceLocation(ArtificialFoliage.MODID, "traverse_dye"));


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
