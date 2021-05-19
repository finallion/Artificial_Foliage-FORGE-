package com.finallion.arfo.init;


import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;


public class ModItems {
    public static List<Item> itemsList = new ArrayList<>();

    // block items


    public static final Item MUSHROOM_FIELDS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "mushroom_fields_dye");
    public static final Item MUSHROOM_FIELDS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK));
    public static final Item GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK));
    public static final Item MUSHROOM_FIELDS_GRASS_SLAB = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB));
    public static final Item MUSHROOM_FIELDS_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES));
    public static final Item MUSHROOM_FIELDS_OAK_LEAVES = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES));
    public static final Item MUSHROOM_FIELDS_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES));
    public static final Item MUSHROOM_FIELDS_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES));
    public static final Item MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_FERN = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_FERN));
    public static final Item LARGE_MUSHROOM_FIELDS_FERN = createItem(new BlockItem(ModBlocks.LARGE_MUSHROOM_FIELDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_MUSHROOM_FIELDS_FERN));
    public static final Item MUSHROOM_FIELDS_GRASS = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_GRASS));
    public static final Item TALL_MUSHROOM_FIELDS_GRASS = createItem(new BlockItem(ModBlocks.TALL_MUSHROOM_FIELDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_MUSHROOM_FIELDS_GRASS));
    public static final Item MUSHROOM_FIELDS_SUGAR_CANE = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_SUGAR_CANE));
    public static final Item MUSHROOM_FIELDS_VINE = createItem(new BlockItem(ModBlocks.MUSHROOM_FIELDS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MUSHROOM_FIELDS_VINE));

    public static final Item JUNGLE_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "jungle_dye");
    public static final Item JUNGLE_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.JUNGLE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_GRASS_BLOCK));
    public static final Item GLOWING_JUNGLE_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK));
    public static final Item JUNGLE_GRASS_SLAB = createItem(new BlockItem(ModBlocks.JUNGLE_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_GRASS_SLAB));
    public static final Item TROPICAL_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_JUNGLE_LEAVES));
    public static final Item TROPICAL_OAK_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_OAK_LEAVES));
    public static final Item TROPICAL_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_DARK_OAK_LEAVES));
    public static final Item TROPICAL_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_ACACIA_LEAVES));
    public static final Item TROPICAL_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET));
    public static final Item TROPICAL_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET));
    public static final Item JUNGLE_FERN = createItem(new BlockItem(ModBlocks.JUNGLE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_FERN));
    public static final Item LARGE_JUNGLE_FERN = createItem(new BlockItem(ModBlocks.LARGE_JUNGLE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_JUNGLE_FERN));
    public static final Item JUNGLE_GRASS = createItem(new BlockItem(ModBlocks.JUNGLE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_GRASS));
    public static final Item TALL_JUNGLE_GRASS = createItem(new BlockItem(ModBlocks.TALL_JUNGLE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_JUNGLE_GRASS));
    public static final Item JUNGLE_SUGAR_CANE = createItem(new BlockItem(ModBlocks.JUNGLE_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_SUGAR_CANE));
    public static final Item JUNGLE_VINE = createItem(new BlockItem(ModBlocks.JUNGLE_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_VINE));

    public static final Item JUNGLE_EDGE_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "jungle_edge_dye");
    public static final Item JUNGLE_EDGE_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK));
    public static final Item GLOWING_JUNGLE_EDGE_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK));
    public static final Item JUNGLE_EDGE_GRASS_SLAB = createItem(new BlockItem(ModBlocks.JUNGLE_EDGE_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_EDGE_GRASS_SLAB));
    public static final Item TROPICAL_EDGE_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES));
    public static final Item TROPICAL_EDGE_OAK_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_OAK_LEAVES));
    public static final Item TROPICAL_EDGE_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES));
    public static final Item TROPICAL_EDGE_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES));
    public static final Item TROPICAL_EDGE_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET));
    public static final Item TROPICAL_EDGE_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_EDGE_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET));
    public static final Item JUNGLE_EDGE_FERN = createItem(new BlockItem(ModBlocks.JUNGLE_EDGE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_EDGE_FERN));
    public static final Item LARGE_JUNGLE_EDGE_FERN = createItem(new BlockItem(ModBlocks.LARGE_JUNGLE_EDGE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_JUNGLE_EDGE_FERN));
    public static final Item JUNGLE_EDGE_GRASS = createItem(new BlockItem(ModBlocks.JUNGLE_EDGE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_EDGE_GRASS));
    public static final Item TALL_JUNGLE_EDGE_GRASS = createItem(new BlockItem(ModBlocks.TALL_JUNGLE_EDGE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_JUNGLE_EDGE_GRASS));
    public static final Item JUNGLE_EDGE_SUGAR_CANE = createItem(new BlockItem(ModBlocks.JUNGLE_EDGE_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_EDGE_SUGAR_CANE));
    public static final Item JUNGLE_EDGE_VINE = createItem(new BlockItem(ModBlocks.JUNGLE_EDGE_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.JUNGLE_EDGE_VINE));

    public static final Item FOREST_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "forest_dye");
    public static final Item FOREST_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_GRASS_BLOCK));
    public static final Item GLOWING_FOREST_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_FOREST_GRASS_BLOCK));
    public static final Item FOREST_GRASS_SLAB = createItem(new BlockItem(ModBlocks.FOREST_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_GRASS_SLAB));
    public static final Item FOREST_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.FOREST_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_JUNGLE_LEAVES));
    public static final Item FOREST_OAK_LEAVES = createItem(new BlockItem(ModBlocks.FOREST_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_OAK_LEAVES));
    public static final Item FOREST_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.FOREST_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_DARK_OAK_LEAVES));
    public static final Item FOREST_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.FOREST_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_ACACIA_LEAVES));
    public static final Item FOREST_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.FOREST_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_JUNGLE_LEAVES_CARPET));
    public static final Item FOREST_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.FOREST_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_OAK_LEAVES_CARPET));
    public static final Item FOREST_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET));
    public static final Item FOREST_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.FOREST_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_ACACIA_LEAVES_CARPET));
    public static final Item FOREST_FERN = createItem(new BlockItem(ModBlocks.FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_FERN));
    public static final Item LARGE_FOREST_FERN = createItem(new BlockItem(ModBlocks.LARGE_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_FOREST_FERN));
    public static final Item FOREST_GRASS = createItem(new BlockItem(ModBlocks.FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_GRASS));
    public static final Item TALL_FOREST_GRASS = createItem(new BlockItem(ModBlocks.TALL_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_FOREST_GRASS));
    public static final Item FOREST_SUGAR_CANE = createItem(new BlockItem(ModBlocks.FOREST_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_SUGAR_CANE));
    public static final Item FOREST_VINE = createItem(new BlockItem(ModBlocks.FOREST_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.FOREST_VINE));


    public static final Item BIRCH_FOREST_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "birch_forest_dye");
    public static final Item BIRCH_FOREST_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_GRASS_BLOCK));
    public static final Item GLOWING_BIRCH_FOREST_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK));
    public static final Item BIRCH_FOREST_GRASS_SLAB = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_GRASS_SLAB));
    public static final Item BIRCH_FOREST_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES));
    public static final Item BIRCH_FOREST_OAK_LEAVES = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_OAK_LEAVES));
    public static final Item BIRCH_FOREST_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES));
    public static final Item BIRCH_FOREST_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES));
    public static final Item BIRCH_FOREST_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_FERN = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_FERN));
    public static final Item LARGE_BIRCH_FOREST_FERN = createItem(new BlockItem(ModBlocks.LARGE_BIRCH_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_BIRCH_FOREST_FERN));
    public static final Item BIRCH_FOREST_GRASS = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_GRASS));
    public static final Item TALL_BIRCH_FOREST_GRASS = createItem(new BlockItem(ModBlocks.TALL_BIRCH_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_BIRCH_FOREST_GRASS));
    public static final Item BIRCH_FOREST_SUGAR_CANE = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_SUGAR_CANE));
    public static final Item BIRCH_FOREST_VINE = createItem(new BlockItem(ModBlocks.BIRCH_FOREST_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_FOREST_VINE));

    public static final Item PLAINS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "plains_dye");
    public static final Item PLAINS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.PLAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_GRASS_BLOCK));
    public static final Item GLOWING_PLAINS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_PLAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_PLAINS_GRASS_BLOCK));
    public static final Item PLAINS_GRASS_SLAB = createItem(new BlockItem(ModBlocks.PLAINS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_GRASS_SLAB));
    public static final Item PLAINS_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.PLAINS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_JUNGLE_LEAVES));
    public static final Item PLAINS_OAK_LEAVES = createItem(new BlockItem(ModBlocks.PLAINS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_OAK_LEAVES));
    public static final Item PLAINS_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.PLAINS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_DARK_OAK_LEAVES));
    public static final Item PLAINS_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.PLAINS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_ACACIA_LEAVES));
    public static final Item PLAINS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET));
    public static final Item PLAINS_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.PLAINS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_OAK_LEAVES_CARPET));
    public static final Item PLAINS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET));
    public static final Item PLAINS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.PLAINS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_ACACIA_LEAVES_CARPET));
    public static final Item PLAINS_FERN = createItem(new BlockItem(ModBlocks.PLAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_FERN));
    public static final Item LARGE_PLAINS_FERN = createItem(new BlockItem(ModBlocks.LARGE_PLAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_PLAINS_FERN));
    public static final Item PLAINS_GRASS = createItem(new BlockItem(ModBlocks.PLAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_GRASS));
    public static final Item TALL_PLAINS_GRASS = createItem(new BlockItem(ModBlocks.TALL_PLAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_PLAINS_GRASS));
    public static final Item PLAINS_SUGAR_CANE = createItem(new BlockItem(ModBlocks.PLAINS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_SUGAR_CANE));
    public static final Item PLAINS_VINE = createItem(new BlockItem(ModBlocks.PLAINS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PLAINS_VINE));


    public static final Item WATERS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "waters_dye");
    public static final Item WATERS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.WATERS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_GRASS_BLOCK));
    public static final Item GLOWING_WATERS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_WATERS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_WATERS_GRASS_BLOCK));
    public static final Item WATERS_GRASS_SLAB = createItem(new BlockItem(ModBlocks.WATERS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_GRASS_SLAB));
    public static final Item WATERS_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.WATERS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_JUNGLE_LEAVES));
    public static final Item WATERS_OAK_LEAVES = createItem(new BlockItem(ModBlocks.WATERS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_OAK_LEAVES));
    public static final Item WATERS_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.WATERS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_DARK_OAK_LEAVES));
    public static final Item WATERS_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.WATERS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_ACACIA_LEAVES));
    public static final Item WATERS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.WATERS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_JUNGLE_LEAVES_CARPET));
    public static final Item WATERS_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.WATERS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_OAK_LEAVES_CARPET));
    public static final Item WATERS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET));
    public static final Item WATERS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.WATERS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_ACACIA_LEAVES_CARPET));
    public static final Item WATERS_FERN = createItem(new BlockItem(ModBlocks.WATERS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_FERN));
    public static final Item LARGE_WATERS_FERN = createItem(new BlockItem(ModBlocks.LARGE_WATERS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_WATERS_FERN));
    public static final Item WATERS_GRASS = createItem(new BlockItem(ModBlocks.WATERS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_GRASS));
    public static final Item TALL_WATERS_GRASS = createItem(new BlockItem(ModBlocks.TALL_WATERS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_WATERS_GRASS));
    public static final Item WATERS_SUGAR_CANE = createItem(new BlockItem(ModBlocks.WATERS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_SUGAR_CANE));
    public static final Item WATERS_VINE = createItem(new BlockItem(ModBlocks.WATERS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WATERS_VINE));


    public static final Item MEGA_TAIGA_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "mega_taiga_dye");
    public static final Item MEGA_TAIGA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_GRASS_BLOCK));
    public static final Item GLOWING_MEGA_TAIGA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK));
    public static final Item MEGA_TAIGA_GRASS_SLAB = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_GRASS_SLAB));
    public static final Item MEGA_TAIGA_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES));
    public static final Item MEGA_TAIGA_OAK_LEAVES = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_OAK_LEAVES));
    public static final Item MEGA_TAIGA_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES));
    public static final Item MEGA_TAIGA_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES));
    public static final Item MEGA_TAIGA_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_FERN = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_FERN));
    public static final Item LARGE_MEGA_TAIGA_FERN = createItem(new BlockItem(ModBlocks.LARGE_MEGA_TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_MEGA_TAIGA_FERN));
    public static final Item MEGA_TAIGA_GRASS = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_GRASS));
    public static final Item TALL_MEGA_TAIGA_GRASS = createItem(new BlockItem(ModBlocks.TALL_MEGA_TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_MEGA_TAIGA_GRASS));
    public static final Item MEGA_TAIGA_SUGAR_CANE = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_SUGAR_CANE));
    public static final Item MEGA_TAIGA_VINE = createItem(new BlockItem(ModBlocks.MEGA_TAIGA_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MEGA_TAIGA_VINE));

    public static final Item TAIGA_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "taiga_dye");
    public static final Item TAIGA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_GRASS_BLOCK));
    public static final Item GLOWING_TAIGA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_TAIGA_GRASS_BLOCK));
    public static final Item TAIGA_GRASS_SLAB = createItem(new BlockItem(ModBlocks.TAIGA_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_GRASS_SLAB));
    public static final Item TAIGA_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.TAIGA_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_JUNGLE_LEAVES));
    public static final Item TAIGA_OAK_LEAVES = createItem(new BlockItem(ModBlocks.TAIGA_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_OAK_LEAVES));
    public static final Item TAIGA_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.TAIGA_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_DARK_OAK_LEAVES));
    public static final Item TAIGA_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.TAIGA_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_ACACIA_LEAVES));
    public static final Item TAIGA_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET));
    public static final Item TAIGA_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TAIGA_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_OAK_LEAVES_CARPET));
    public static final Item TAIGA_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET));
    public static final Item TAIGA_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.TAIGA_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_ACACIA_LEAVES_CARPET));
    public static final Item TAIGA_FERN = createItem(new BlockItem(ModBlocks.TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_FERN));
    public static final Item LARGE_TAIGA_FERN = createItem(new BlockItem(ModBlocks.LARGE_TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_TAIGA_FERN));
    public static final Item TAIGA_GRASS = createItem(new BlockItem(ModBlocks.TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_GRASS));
    public static final Item TALL_TAIGA_GRASS = createItem(new BlockItem(ModBlocks.TALL_TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_TAIGA_GRASS));
    public static final Item TAIGA_SUGAR_CANE = createItem(new BlockItem(ModBlocks.TAIGA_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_SUGAR_CANE));
    public static final Item TAIGA_VINE = createItem(new BlockItem(ModBlocks.TAIGA_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TAIGA_VINE));

    public static final Item MOUNTAINS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "mountains_dye");
    public static final Item MOUNTAINS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.MOUNTAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_GRASS_BLOCK));
    public static final Item GLOWING_MOUNTAINS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK));
    public static final Item MOUNTAINS_GRASS_SLAB = createItem(new BlockItem(ModBlocks.MOUNTAINS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_GRASS_SLAB));
    public static final Item MOUNTAINS_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.MOUNTAINS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_JUNGLE_LEAVES));
    public static final Item MOUNTAINS_OAK_LEAVES = createItem(new BlockItem(ModBlocks.MOUNTAINS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_OAK_LEAVES));
    public static final Item MOUNTAINS_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES));
    public static final Item MOUNTAINS_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.MOUNTAINS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_ACACIA_LEAVES));
    public static final Item MOUNTAINS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET));
    public static final Item MOUNTAINS_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET));
    public static final Item MOUNTAINS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET));
    public static final Item MOUNTAINS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET));
    public static final Item MOUNTAINS_FERN = createItem(new BlockItem(ModBlocks.MOUNTAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_FERN));
    public static final Item LARGE_MOUNTAINS_FERN = createItem(new BlockItem(ModBlocks.LARGE_MOUNTAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_MOUNTAINS_FERN));
    public static final Item MOUNTAINS_GRASS = createItem(new BlockItem(ModBlocks.MOUNTAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_GRASS));
    public static final Item TALL_MOUNTAINS_GRASS = createItem(new BlockItem(ModBlocks.TALL_MOUNTAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_MOUNTAINS_GRASS));
    public static final Item MOUNTAINS_SUGAR_CANE = createItem(new BlockItem(ModBlocks.MOUNTAINS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_SUGAR_CANE));
    public static final Item MOUNTAINS_VINE = createItem(new BlockItem(ModBlocks.MOUNTAINS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MOUNTAINS_VINE));

    public static final Item SNOWY_BEACH_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "snowy_beach_dye");
    public static final Item SNOWY_BEACH_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_GRASS_BLOCK));
    public static final Item GLOWING_SNOWY_BEACH_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK));
    public static final Item SNOWY_BEACH_GRASS_SLAB = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_GRASS_SLAB));
    public static final Item SNOWY_BEACH_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES));
    public static final Item SNOWY_BEACH_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_OAK_LEAVES));
    public static final Item SNOWY_BEACH_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES));
    public static final Item SNOWY_BEACH_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES));
    public static final Item SNOWY_BEACH_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_FERN = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_FERN));
    public static final Item LARGE_SNOWY_BEACH_FERN = createItem(new BlockItem(ModBlocks.LARGE_SNOWY_BEACH_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_SNOWY_BEACH_FERN));
    public static final Item SNOWY_BEACH_GRASS = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_GRASS));
    public static final Item TALL_SNOWY_BEACH_GRASS = createItem(new BlockItem(ModBlocks.TALL_SNOWY_BEACH_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_SNOWY_BEACH_GRASS));
    public static final Item SNOWY_BEACH_SUGAR_CANE = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_SUGAR_CANE));
    public static final Item SNOWY_BEACH_VINE = createItem(new BlockItem(ModBlocks.SNOWY_BEACH_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_BEACH_VINE));


    public static final Item SNOWY_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "snowy_dye");
    public static final Item SNOWY_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.SNOWY_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_GRASS_BLOCK));
    public static final Item GLOWING_SNOWY_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_SNOWY_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_SNOWY_GRASS_BLOCK));
    public static final Item SNOWY_GRASS_SLAB = createItem(new BlockItem(ModBlocks.SNOWY_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_GRASS_SLAB));
    public static final Item SNOWY_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_JUNGLE_LEAVES));
    public static final Item SNOWY_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_OAK_LEAVES));
    public static final Item SNOWY_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_DARK_OAK_LEAVES));
    public static final Item SNOWY_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.SNOWY_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_ACACIA_LEAVES));
    public static final Item SNOWY_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET));
    public static final Item SNOWY_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_OAK_LEAVES_CARPET));
    public static final Item SNOWY_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET));
    public static final Item SNOWY_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SNOWY_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_ACACIA_LEAVES_CARPET));
    public static final Item SNOWY_FERN = createItem(new BlockItem(ModBlocks.SNOWY_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_FERN));
    public static final Item LARGE_SNOWY_FERN = createItem(new BlockItem(ModBlocks.LARGE_SNOWY_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_SNOWY_FERN));
    public static final Item SNOWY_GRASS = createItem(new BlockItem(ModBlocks.SNOWY_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_GRASS));
    public static final Item TALL_SNOWY_GRASS = createItem(new BlockItem(ModBlocks.TALL_SNOWY_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_SNOWY_GRASS));
    public static final Item SNOWY_SUGAR_CANE = createItem(new BlockItem(ModBlocks.SNOWY_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_SUGAR_CANE));
    public static final Item SNOWY_VINE = createItem(new BlockItem(ModBlocks.SNOWY_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SNOWY_VINE));


    public static final Item DARK_FOREST_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "dark_forest_dye");
    public static final Item DARK_FOREST_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.DARK_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_GRASS_BLOCK));
    public static final Item GLOWING_DARK_FOREST_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK));
    public static final Item DARK_FOREST_GRASS_SLAB = createItem(new BlockItem(ModBlocks.DARK_FOREST_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_GRASS_SLAB));
    public static final Item DARK_FOREST_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.DARK_FOREST_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_JUNGLE_LEAVES));
    public static final Item DARK_FOREST_OAK_LEAVES = createItem(new BlockItem(ModBlocks.DARK_FOREST_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_OAK_LEAVES));
    public static final Item DARK_FOREST_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES));
    public static final Item DARK_FOREST_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.DARK_FOREST_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_ACACIA_LEAVES));
    public static final Item DARK_FOREST_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET));
    public static final Item DARK_FOREST_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET));
    public static final Item DARK_FOREST_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET));
    public static final Item DARK_FOREST_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET));
    public static final Item DARK_FOREST_FERN = createItem(new BlockItem(ModBlocks.DARK_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_FERN));
    public static final Item LARGE_DARK_FOREST_FERN = createItem(new BlockItem(ModBlocks.LARGE_DARK_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_DARK_FOREST_FERN));
    public static final Item DARK_FOREST_GRASS = createItem(new BlockItem(ModBlocks.DARK_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_GRASS));
    public static final Item TALL_DARK_FOREST_GRASS = createItem(new BlockItem(ModBlocks.TALL_DARK_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_DARK_FOREST_GRASS));
    public static final Item DARK_FOREST_SUGAR_CANE = createItem(new BlockItem(ModBlocks.DARK_FOREST_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_SUGAR_CANE));
    public static final Item DARK_FOREST_VINE = createItem(new BlockItem(ModBlocks.DARK_FOREST_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DARK_FOREST_VINE));

    public static final Item LUSH_SWAMP_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "lush_swamp_dye");
    public static final Item LUSH_SWAMP_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_GRASS_BLOCK));
    public static final Item GLOWING_LUSH_SWAMP_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK));
    public static final Item LUSH_SWAMP_GRASS_SLAB = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_GRASS_SLAB));
    public static final Item LUSH_SWAMP_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES));
    public static final Item LUSH_SWAMP_OAK_LEAVES = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_OAK_LEAVES));
    public static final Item LUSH_SWAMP_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES));
    public static final Item LUSH_SWAMP_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES));
    public static final Item LUSH_SWAMP_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_FERN = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_FERN));
    public static final Item LARGE_LUSH_SWAMP_FERN = createItem(new BlockItem(ModBlocks.LARGE_LUSH_SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_LUSH_SWAMP_FERN));
    public static final Item LUSH_SWAMP_GRASS = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_GRASS));
    public static final Item TALL_LUSH_SWAMP_GRASS = createItem(new BlockItem(ModBlocks.TALL_LUSH_SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_LUSH_SWAMP_GRASS));
    public static final Item LUSH_SWAMP_SUGAR_CANE = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_SUGAR_CANE));
    public static final Item LUSH_SWAMP_VINE = createItem(new BlockItem(ModBlocks.LUSH_SWAMP_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LUSH_SWAMP_VINE));

    public static final Item SWAMP_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "swamp_dye");
    public static final Item SWAMP_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_GRASS_BLOCK));
    public static final Item GLOWING_SWAMP_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_SWAMP_GRASS_BLOCK));
    public static final Item SWAMP_GRASS_SLAB = createItem(new BlockItem(ModBlocks.SWAMP_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_GRASS_SLAB));
    public static final Item SWAMP_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.SWAMP_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_JUNGLE_LEAVES));
    public static final Item SWAMP_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SWAMP_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_OAK_LEAVES));
    public static final Item SWAMP_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SWAMP_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_DARK_OAK_LEAVES));
    public static final Item SWAMP_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.SWAMP_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_ACACIA_LEAVES));
    public static final Item SWAMP_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET));
    public static final Item SWAMP_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SWAMP_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_OAK_LEAVES_CARPET));
    public static final Item SWAMP_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET));
    public static final Item SWAMP_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SWAMP_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_ACACIA_LEAVES_CARPET));
    public static final Item SWAMP_FERN = createItem(new BlockItem(ModBlocks.SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_FERN));
    public static final Item LARGE_SWAMP_FERN = createItem(new BlockItem(ModBlocks.LARGE_SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_SWAMP_FERN));
    public static final Item SWAMP_GRASS = createItem(new BlockItem(ModBlocks.SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_GRASS));
    public static final Item TALL_SWAMP_GRASS = createItem(new BlockItem(ModBlocks.TALL_SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_SWAMP_GRASS));
    public static final Item SWAMP_SUGAR_CANE = createItem(new BlockItem(ModBlocks.SWAMP_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_SUGAR_CANE));
    public static final Item SWAMP_VINE = createItem(new BlockItem(ModBlocks.SWAMP_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SWAMP_VINE));

    public static final Item SAVANNA_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "savanna_dye");
    public static final Item SAVANNA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.SAVANNA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_GRASS_BLOCK));
    public static final Item GLOWING_SAVANNA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK));
    public static final Item SAVANNA_GRASS_SLAB = createItem(new BlockItem(ModBlocks.SAVANNA_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_GRASS_SLAB));
    public static final Item SAVANNA_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.SAVANNA_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_JUNGLE_LEAVES));
    public static final Item SAVANNA_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SAVANNA_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_OAK_LEAVES));
    public static final Item SAVANNA_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.SAVANNA_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_DARK_OAK_LEAVES));
    public static final Item SAVANNA_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.SAVANNA_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_ACACIA_LEAVES));
    public static final Item SAVANNA_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET));
    public static final Item SAVANNA_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SAVANNA_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_OAK_LEAVES_CARPET));
    public static final Item SAVANNA_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET));
    public static final Item SAVANNA_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET));
    public static final Item SAVANNA_FERN = createItem(new BlockItem(ModBlocks.SAVANNA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_FERN));
    public static final Item LARGE_SAVANNA_FERN = createItem(new BlockItem(ModBlocks.LARGE_SAVANNA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_SAVANNA_FERN));
    public static final Item SAVANNA_GRASS = createItem(new BlockItem(ModBlocks.SAVANNA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_GRASS));
    public static final Item TALL_SAVANNA_GRASS = createItem(new BlockItem(ModBlocks.TALL_SAVANNA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_SAVANNA_GRASS));
    public static final Item SAVANNA_SUGAR_CANE = createItem(new BlockItem(ModBlocks.SAVANNA_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_SUGAR_CANE));
    public static final Item SAVANNA_VINE = createItem(new BlockItem(ModBlocks.SAVANNA_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SAVANNA_VINE));

    public static final Item BADLANDS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "badlands_dye");
    public static final Item BADLANDS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.BADLANDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_GRASS_BLOCK));
    public static final Item GLOWING_BADLANDS_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK));
    public static final Item BADLANDS_GRASS_SLAB = createItem(new BlockItem(ModBlocks.BADLANDS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_GRASS_SLAB));
    public static final Item BADLANDS_JUNGLE_LEAVES = createItem(new BlockItem(ModBlocks.BADLANDS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_JUNGLE_LEAVES));
    public static final Item BADLANDS_OAK_LEAVES = createItem(new BlockItem(ModBlocks.BADLANDS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_OAK_LEAVES));
    public static final Item BADLANDS_DARK_OAK_LEAVES = createItem(new BlockItem(ModBlocks.BADLANDS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_DARK_OAK_LEAVES));
    public static final Item BADLANDS_ACACIA_LEAVES = createItem(new BlockItem(ModBlocks.BADLANDS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_ACACIA_LEAVES));
    public static final Item BADLANDS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET));
    public static final Item BADLANDS_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BADLANDS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_OAK_LEAVES_CARPET));
    public static final Item BADLANDS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET));
    public static final Item BADLANDS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET));
    public static final Item BADLANDS_FERN = createItem(new BlockItem(ModBlocks.BADLANDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_FERN));
    public static final Item LARGE_BADLANDS_FERN = createItem(new BlockItem(ModBlocks.LARGE_BADLANDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.LARGE_BADLANDS_FERN));
    public static final Item BADLANDS_GRASS = createItem(new BlockItem(ModBlocks.BADLANDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_GRASS));
    public static final Item TALL_BADLANDS_GRASS = createItem(new BlockItem(ModBlocks.TALL_BADLANDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.TALL_BADLANDS_GRASS));
    public static final Item BADLANDS_SUGAR_CANE = createItem(new BlockItem(ModBlocks.BADLANDS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_SUGAR_CANE));
    public static final Item BADLANDS_VINE = createItem(new BlockItem(ModBlocks.BADLANDS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BADLANDS_VINE));



    public static final Item ARTIFICIAL_SOIL = createItem(new BlockItem(ModBlocks.ARTIFICIAL_SOIL, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.ARTIFICIAL_SOIL));
    public static final Item GRASS_SEED = createItem(new ARFOGrassSeedItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "grass_seed");
    public static final Item ALPHA_GRASS_BLOCK = createItem(new BlockItem(ModBlocks.ALPHA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.ALPHA_GRASS_BLOCK));
    public static final Item ALPHA_LEAVES = createItem(new BlockItem(ModBlocks.ALPHA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.ALPHA_LEAVES));
    public static final Item SPRUCE_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.SPRUCE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.SPRUCE_LEAVES_CARPET));
    public static final Item BIRCH_LEAVES_CARPET = createItem(new BlockItem(ModBlocks.BIRCH_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.BIRCH_LEAVES_CARPET));
    public static final Item GRASS_SLAB = createItem(new BlockItem(ModBlocks.GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GRASS_SLAB));
    public static final Item DIRT_SLAB = createItem(new BlockItem(ModBlocks.DIRT_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.DIRT_SLAB));
    public static final Item COARSE_DIRT_SLAB = createItem(new BlockItem(ModBlocks.COARSE_DIRT_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.COARSE_DIRT_SLAB));
    public static final Item PODZOL_SLAB = createItem(new BlockItem(ModBlocks.PODZOL_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.PODZOL_SLAB));
    public static final Item MYCELIUM_SLAB = createItem(new BlockItem(ModBlocks.MYCELIUM_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.MYCELIUM_SLAB));
    public static final Item ARTIFICIAL_SOIL_SLAB = createItem(new BlockItem(ModBlocks.ARTIFICIAL_SOIL_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.ARTIFICIAL_SOIL_SLAB));
    public static final Item GRASS_PATH_SLAB = createItem(new BlockItem(ModBlocks.GRASS_PATH_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GRASS_PATH_SLAB));
    public static final Item NETHERRACK_SLAB = createItem(new BlockItem(ModBlocks.NETHERRACK_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.NETHERRACK_SLAB));
    public static final Item CRIMSON_NYLIUM_SLAB = createItem(new BlockItem(ModBlocks.CRIMSON_NYLIUM_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.CRIMSON_NYLIUM_SLAB));
    public static final Item GLOWING_CRIMSON_NYLIUM = createItem(new BlockItem(ModBlocks.GLOWING_CRIMSON_NYLIUM, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_CRIMSON_NYLIUM));
    public static final Item WARPED_NYLIUM_SLAB = createItem(new BlockItem(ModBlocks.WARPED_NYLIUM_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.WARPED_NYLIUM_SLAB));
    public static final Item GLOWING_WARPED_NYLIUM = createItem(new BlockItem(ModBlocks.GLOWING_WARPED_NYLIUM, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ModBlocks.GLOWING_WARPED_NYLIUM));


    public static final Item COLD_OCEAN_WATER_BUCKET = createItem(new BucketItem(ModFluids.STILL_COLD_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "cold_ocean_water_bucket");
    public static final Item FROZEN_OCEAN_WATER_BUCKET = createItem(new BucketItem(ModFluids.STILL_FROZEN_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "frozen_ocean_water_bucket");
    public static final Item LUKEWARM_OCEAN_WATER_BUCKET = createItem(new BucketItem(ModFluids.STILL_LUKEWARM_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "lukewarm_ocean_water_bucket");
    public static final Item WARM_OCEAN_WATER_BUCKET = createItem(new BucketItem(ModFluids.STILL_WARM_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "warm_ocean_water_bucket");
    public static final Item SWAMP_WATER_BUCKET = createItem(new BucketItem(ModFluids.STILL_SWAMP_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "swamp_water_bucket");
    public static final Item OCEAN_WATER_BUCKET = createItem(new BucketItem(ModFluids.STILL_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "ocean_water_bucket");


    public static Item createItem(Item item, ResourceLocation id) {
        if (id != null && !id.equals(new ResourceLocation("minecraft:air"))) {
            item.setRegistryName(id);
            itemsList.add(item);
            return item;
        } else {
            return null;
        }
    }

    public static Item createItem(Item item, String id) {
        item.setRegistryName(new ResourceLocation(ArtificialFoliage.MODID, id));
        itemsList.add(item);
        return item;
    }



    public static void init() {
    }








}
