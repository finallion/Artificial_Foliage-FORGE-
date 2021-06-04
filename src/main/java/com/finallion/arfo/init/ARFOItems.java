package com.finallion.arfo.init;


import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;


public class ARFOItems {
    public static List<Item> itemsList = new ArrayList<>();

    // block items
    public static final Item MUSHROOM_FIELDS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "mushroom_fields_dye");
    public static final Item MUSHROOM_FIELDS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK));
    public static final Item MUSHROOM_FIELDS_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB));
    public static final Item GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK));
    public static final Item MUSHROOM_FIELDS_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES));
    public static final Item MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES));
    public static final Item MUSHROOM_FIELDS_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES));
    public static final Item MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES));
    public static final Item MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET));
    public static final Item MUSHROOM_FIELDS_FERN = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_FERN));
    public static final Item LARGE_MUSHROOM_FIELDS_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN));
    public static final Item MUSHROOM_FIELDS_GRASS = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_GRASS));
    public static final Item TALL_MUSHROOM_FIELDS_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS));
    public static final Item MUSHROOM_FIELDS_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_SUGAR_CANE));
    public static final Item MUSHROOM_FIELDS_VINE = createItem(new BlockItem(ARFOBlocks.MUSHROOM_FIELDS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MUSHROOM_FIELDS_VINE));



    public static final Item JUNGLE_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "jungle_dye");
    public static final Item JUNGLE_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.JUNGLE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_GRASS_BLOCK));
    public static final Item JUNGLE_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.JUNGLE_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_GRASS_SLAB));
    public static final Item GLOWING_JUNGLE_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_JUNGLE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_JUNGLE_GRASS_BLOCK));
    public static final Item TROPICAL_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_JUNGLE_LEAVES));
    public static final Item TROPICAL_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_JUNGLE_LEAVES_CARPET));
    public static final Item TROPICAL_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_OAK_LEAVES));
    public static final Item TROPICAL_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_DARK_OAK_LEAVES));
    public static final Item TROPICAL_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_ACACIA_LEAVES));
    public static final Item TROPICAL_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_ACACIA_LEAVES_CARPET));
    public static final Item JUNGLE_FERN = createItem(new BlockItem(ARFOBlocks.JUNGLE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_FERN));
    public static final Item LARGE_JUNGLE_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_JUNGLE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_JUNGLE_FERN));
    public static final Item JUNGLE_GRASS = createItem(new BlockItem(ARFOBlocks.JUNGLE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_GRASS));
    public static final Item TALL_JUNGLE_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_JUNGLE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_JUNGLE_GRASS));
    public static final Item JUNGLE_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.JUNGLE_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_SUGAR_CANE));
    public static final Item JUNGLE_VINE = createItem(new BlockItem(ARFOBlocks.JUNGLE_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_VINE));

    public static final Item JUNGLE_EDGE_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "jungle_edge_dye");
    public static final Item JUNGLE_EDGE_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK));
    public static final Item JUNGLE_EDGE_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB));
    public static final Item GLOWING_JUNGLE_EDGE_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK));
    public static final Item TROPICAL_EDGE_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES));
    public static final Item TROPICAL_EDGE_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET));
    public static final Item TROPICAL_EDGE_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES));
    public static final Item TROPICAL_EDGE_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_EDGE_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES));
    public static final Item TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET));
    public static final Item TROPICAL_EDGE_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES));
    public static final Item TROPICAL_EDGE_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET));
    public static final Item JUNGLE_EDGE_FERN = createItem(new BlockItem(ARFOBlocks.JUNGLE_EDGE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_EDGE_FERN));
    public static final Item LARGE_JUNGLE_EDGE_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_JUNGLE_EDGE_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_JUNGLE_EDGE_FERN));
    public static final Item JUNGLE_EDGE_GRASS = createItem(new BlockItem(ARFOBlocks.JUNGLE_EDGE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_EDGE_GRASS));
    public static final Item TALL_JUNGLE_EDGE_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_JUNGLE_EDGE_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_JUNGLE_EDGE_GRASS));
    public static final Item JUNGLE_EDGE_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.JUNGLE_EDGE_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_EDGE_SUGAR_CANE));
    public static final Item JUNGLE_EDGE_VINE = createItem(new BlockItem(ARFOBlocks.JUNGLE_EDGE_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.JUNGLE_EDGE_VINE));

    public static final Item FOREST_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "forest_dye");
    public static final Item FOREST_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_GRASS_BLOCK));
    public static final Item FOREST_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.FOREST_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_GRASS_SLAB));
    public static final Item GLOWING_FOREST_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_FOREST_GRASS_BLOCK));
    public static final Item FOREST_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.FOREST_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_JUNGLE_LEAVES));
    public static final Item FOREST_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.FOREST_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_JUNGLE_LEAVES_CARPET));
    public static final Item FOREST_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.FOREST_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_OAK_LEAVES));
    public static final Item FOREST_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.FOREST_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_OAK_LEAVES_CARPET));
    public static final Item FOREST_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.FOREST_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_DARK_OAK_LEAVES));
    public static final Item FOREST_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.FOREST_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_DARK_OAK_LEAVES_CARPET));
    public static final Item FOREST_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.FOREST_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_ACACIA_LEAVES));
    public static final Item FOREST_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.FOREST_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_ACACIA_LEAVES_CARPET));
    public static final Item FOREST_FERN = createItem(new BlockItem(ARFOBlocks.FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_FERN));
    public static final Item LARGE_FOREST_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_FOREST_FERN));
    public static final Item FOREST_GRASS = createItem(new BlockItem(ARFOBlocks.FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_GRASS));
    public static final Item TALL_FOREST_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_FOREST_GRASS));
    public static final Item FOREST_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.FOREST_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_SUGAR_CANE));
    public static final Item FOREST_VINE = createItem(new BlockItem(ARFOBlocks.FOREST_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.FOREST_VINE));


    public static final Item BIRCH_FOREST_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "birch_forest_dye");
    public static final Item BIRCH_FOREST_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK));
    public static final Item BIRCH_FOREST_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_GRASS_SLAB));
    public static final Item GLOWING_BIRCH_FOREST_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK));
    public static final Item BIRCH_FOREST_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES));
    public static final Item BIRCH_FOREST_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_OAK_LEAVES));
    public static final Item BIRCH_FOREST_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES));
    public static final Item BIRCH_FOREST_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES));
    public static final Item BIRCH_FOREST_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET));
    public static final Item BIRCH_FOREST_FERN = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_FERN));
    public static final Item LARGE_BIRCH_FOREST_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_BIRCH_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_BIRCH_FOREST_FERN));
    public static final Item BIRCH_FOREST_GRASS = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_GRASS));
    public static final Item TALL_BIRCH_FOREST_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_BIRCH_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_BIRCH_FOREST_GRASS));
    public static final Item BIRCH_FOREST_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_SUGAR_CANE));
    public static final Item BIRCH_FOREST_VINE = createItem(new BlockItem(ARFOBlocks.BIRCH_FOREST_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_FOREST_VINE));

    public static final Item PLAINS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "plains_dye");
    public static final Item PLAINS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.PLAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_GRASS_BLOCK));
    public static final Item PLAINS_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.PLAINS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_GRASS_SLAB));
    public static final Item GLOWING_PLAINS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_PLAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_PLAINS_GRASS_BLOCK));
    public static final Item PLAINS_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.PLAINS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_JUNGLE_LEAVES));
    public static final Item PLAINS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.PLAINS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_JUNGLE_LEAVES_CARPET));
    public static final Item PLAINS_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.PLAINS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_OAK_LEAVES));
    public static final Item PLAINS_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.PLAINS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_OAK_LEAVES_CARPET));
    public static final Item PLAINS_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.PLAINS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_DARK_OAK_LEAVES));
    public static final Item PLAINS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.PLAINS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_DARK_OAK_LEAVES_CARPET));
    public static final Item PLAINS_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.PLAINS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_ACACIA_LEAVES));
    public static final Item PLAINS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.PLAINS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_ACACIA_LEAVES_CARPET));
    public static final Item PLAINS_FERN = createItem(new BlockItem(ARFOBlocks.PLAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_FERN));
    public static final Item LARGE_PLAINS_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_PLAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_PLAINS_FERN));
    public static final Item PLAINS_GRASS = createItem(new BlockItem(ARFOBlocks.PLAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_GRASS));
    public static final Item TALL_PLAINS_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_PLAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_PLAINS_GRASS));
    public static final Item PLAINS_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.PLAINS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_SUGAR_CANE));
    public static final Item PLAINS_VINE = createItem(new BlockItem(ARFOBlocks.PLAINS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PLAINS_VINE));


    public static final Item WATERS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "waters_dye");
    public static final Item WATERS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.WATERS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_GRASS_BLOCK));
    public static final Item WATERS_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.WATERS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_GRASS_SLAB));
    public static final Item GLOWING_WATERS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_WATERS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_WATERS_GRASS_BLOCK));
    public static final Item WATERS_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.WATERS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_JUNGLE_LEAVES));
    public static final Item WATERS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.WATERS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_JUNGLE_LEAVES_CARPET));
    public static final Item WATERS_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.WATERS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_OAK_LEAVES));
    public static final Item WATERS_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.WATERS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_OAK_LEAVES_CARPET));
    public static final Item WATERS_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.WATERS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_DARK_OAK_LEAVES));
    public static final Item WATERS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.WATERS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_DARK_OAK_LEAVES_CARPET));
    public static final Item WATERS_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.WATERS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_ACACIA_LEAVES));
    public static final Item WATERS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.WATERS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_ACACIA_LEAVES_CARPET));
    public static final Item WATERS_FERN = createItem(new BlockItem(ARFOBlocks.WATERS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_FERN));
    public static final Item LARGE_WATERS_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_WATERS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_WATERS_FERN));
    public static final Item WATERS_GRASS = createItem(new BlockItem(ARFOBlocks.WATERS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_GRASS));
    public static final Item TALL_WATERS_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_WATERS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_WATERS_GRASS));
    public static final Item WATERS_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.WATERS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_SUGAR_CANE));
    public static final Item WATERS_VINE = createItem(new BlockItem(ARFOBlocks.WATERS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WATERS_VINE));


    public static final Item MEGA_TAIGA_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "mega_taiga_dye");
    public static final Item MEGA_TAIGA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK));
    public static final Item MEGA_TAIGA_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_GRASS_SLAB));
    public static final Item GLOWING_MEGA_TAIGA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK));
    public static final Item MEGA_TAIGA_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES));
    public static final Item MEGA_TAIGA_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_OAK_LEAVES));
    public static final Item MEGA_TAIGA_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES));
    public static final Item MEGA_TAIGA_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES));
    public static final Item MEGA_TAIGA_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET));
    public static final Item MEGA_TAIGA_FERN = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_FERN));
    public static final Item LARGE_MEGA_TAIGA_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_MEGA_TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_MEGA_TAIGA_FERN));
    public static final Item MEGA_TAIGA_GRASS = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_GRASS));
    public static final Item TALL_MEGA_TAIGA_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_MEGA_TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_MEGA_TAIGA_GRASS));
    public static final Item MEGA_TAIGA_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_SUGAR_CANE));
    public static final Item MEGA_TAIGA_VINE = createItem(new BlockItem(ARFOBlocks.MEGA_TAIGA_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MEGA_TAIGA_VINE));

    public static final Item TAIGA_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "taiga_dye");
    public static final Item TAIGA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_GRASS_BLOCK));
    public static final Item TAIGA_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.TAIGA_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_GRASS_SLAB));
    public static final Item GLOWING_TAIGA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_TAIGA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_TAIGA_GRASS_BLOCK));
    public static final Item TAIGA_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.TAIGA_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_JUNGLE_LEAVES));
    public static final Item TAIGA_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TAIGA_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_JUNGLE_LEAVES_CARPET));
    public static final Item TAIGA_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.TAIGA_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_OAK_LEAVES));
    public static final Item TAIGA_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TAIGA_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_OAK_LEAVES_CARPET));
    public static final Item TAIGA_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.TAIGA_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_DARK_OAK_LEAVES));
    public static final Item TAIGA_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TAIGA_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_DARK_OAK_LEAVES_CARPET));
    public static final Item TAIGA_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.TAIGA_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_ACACIA_LEAVES));
    public static final Item TAIGA_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.TAIGA_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_ACACIA_LEAVES_CARPET));
    public static final Item TAIGA_FERN = createItem(new BlockItem(ARFOBlocks.TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_FERN));
    public static final Item LARGE_TAIGA_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_TAIGA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_TAIGA_FERN));
    public static final Item TAIGA_GRASS = createItem(new BlockItem(ARFOBlocks.TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_GRASS));
    public static final Item TALL_TAIGA_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_TAIGA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_TAIGA_GRASS));
    public static final Item TAIGA_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.TAIGA_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_SUGAR_CANE));
    public static final Item TAIGA_VINE = createItem(new BlockItem(ARFOBlocks.TAIGA_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TAIGA_VINE));

    public static final Item MOUNTAINS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "mountains_dye");
    public static final Item MOUNTAINS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_GRASS_BLOCK));
    public static final Item MOUNTAINS_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_GRASS_SLAB));
    public static final Item GLOWING_MOUNTAINS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK));
    public static final Item MOUNTAINS_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES));
    public static final Item MOUNTAINS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET));
    public static final Item MOUNTAINS_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_OAK_LEAVES));
    public static final Item MOUNTAINS_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_OAK_LEAVES_CARPET));
    public static final Item MOUNTAINS_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES));
    public static final Item MOUNTAINS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET));
    public static final Item MOUNTAINS_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_ACACIA_LEAVES));
    public static final Item MOUNTAINS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET));
    public static final Item MOUNTAINS_FERN = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_FERN));
    public static final Item LARGE_MOUNTAINS_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_MOUNTAINS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_MOUNTAINS_FERN));
    public static final Item MOUNTAINS_GRASS = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_GRASS));
    public static final Item TALL_MOUNTAINS_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_MOUNTAINS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_MOUNTAINS_GRASS));
    public static final Item MOUNTAINS_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_SUGAR_CANE));
    public static final Item MOUNTAINS_VINE = createItem(new BlockItem(ARFOBlocks.MOUNTAINS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MOUNTAINS_VINE));

    public static final Item SNOWY_BEACH_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "snowy_beach_dye");
    public static final Item SNOWY_BEACH_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK));
    public static final Item SNOWY_BEACH_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_GRASS_SLAB));
    public static final Item GLOWING_SNOWY_BEACH_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK));
    public static final Item SNOWY_BEACH_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES));
    public static final Item SNOWY_BEACH_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_OAK_LEAVES));
    public static final Item SNOWY_BEACH_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES));
    public static final Item SNOWY_BEACH_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES));
    public static final Item SNOWY_BEACH_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET));
    public static final Item SNOWY_BEACH_FERN = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_FERN));
    public static final Item LARGE_SNOWY_BEACH_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_SNOWY_BEACH_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_SNOWY_BEACH_FERN));
    public static final Item SNOWY_BEACH_GRASS = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_GRASS));
    public static final Item TALL_SNOWY_BEACH_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_SNOWY_BEACH_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_SNOWY_BEACH_GRASS));
    public static final Item SNOWY_BEACH_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_SUGAR_CANE));
    public static final Item SNOWY_BEACH_VINE = createItem(new BlockItem(ARFOBlocks.SNOWY_BEACH_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_BEACH_VINE));


    public static final Item SNOWY_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "snowy_dye");
    public static final Item SNOWY_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.SNOWY_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_GRASS_BLOCK));
    public static final Item SNOWY_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.SNOWY_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_GRASS_SLAB));
    public static final Item GLOWING_SNOWY_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_SNOWY_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_SNOWY_GRASS_BLOCK));
    public static final Item SNOWY_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_JUNGLE_LEAVES));
    public static final Item SNOWY_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_JUNGLE_LEAVES_CARPET));
    public static final Item SNOWY_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_OAK_LEAVES));
    public static final Item SNOWY_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_OAK_LEAVES_CARPET));
    public static final Item SNOWY_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_DARK_OAK_LEAVES));
    public static final Item SNOWY_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_DARK_OAK_LEAVES_CARPET));
    public static final Item SNOWY_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.SNOWY_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_ACACIA_LEAVES));
    public static final Item SNOWY_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SNOWY_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_ACACIA_LEAVES_CARPET));
    public static final Item SNOWY_FERN = createItem(new BlockItem(ARFOBlocks.SNOWY_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_FERN));
    public static final Item LARGE_SNOWY_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_SNOWY_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_SNOWY_FERN));
    public static final Item SNOWY_GRASS = createItem(new BlockItem(ARFOBlocks.SNOWY_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_GRASS));
    public static final Item TALL_SNOWY_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_SNOWY_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_SNOWY_GRASS));
    public static final Item SNOWY_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.SNOWY_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_SUGAR_CANE));
    public static final Item SNOWY_VINE = createItem(new BlockItem(ARFOBlocks.SNOWY_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SNOWY_VINE));


    public static final Item DARK_FOREST_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "dark_forest_dye");
    public static final Item DARK_FOREST_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_GRASS_BLOCK));
    public static final Item DARK_FOREST_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_GRASS_SLAB));
    public static final Item GLOWING_DARK_FOREST_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK));
    public static final Item DARK_FOREST_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES));
    public static final Item DARK_FOREST_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET));
    public static final Item DARK_FOREST_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_OAK_LEAVES));
    public static final Item DARK_FOREST_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_OAK_LEAVES_CARPET));
    public static final Item DARK_FOREST_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES));
    public static final Item DARK_FOREST_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET));
    public static final Item DARK_FOREST_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_ACACIA_LEAVES));
    public static final Item DARK_FOREST_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET));
    public static final Item DARK_FOREST_FERN = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_FERN));
    public static final Item LARGE_DARK_FOREST_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_DARK_FOREST_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_DARK_FOREST_FERN));
    public static final Item DARK_FOREST_GRASS = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_GRASS));
    public static final Item TALL_DARK_FOREST_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_DARK_FOREST_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_DARK_FOREST_GRASS));
    public static final Item DARK_FOREST_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_SUGAR_CANE));
    public static final Item DARK_FOREST_VINE = createItem(new BlockItem(ARFOBlocks.DARK_FOREST_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DARK_FOREST_VINE));

    public static final Item LUSH_SWAMP_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "lush_swamp_dye");
    public static final Item LUSH_SWAMP_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK));
    public static final Item LUSH_SWAMP_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_GRASS_SLAB));
    public static final Item GLOWING_LUSH_SWAMP_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK));
    public static final Item LUSH_SWAMP_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES));
    public static final Item LUSH_SWAMP_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_OAK_LEAVES));
    public static final Item LUSH_SWAMP_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES));
    public static final Item LUSH_SWAMP_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES));
    public static final Item LUSH_SWAMP_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET));
    public static final Item LUSH_SWAMP_FERN = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_FERN));
    public static final Item LARGE_LUSH_SWAMP_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_LUSH_SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_LUSH_SWAMP_FERN));
    public static final Item LUSH_SWAMP_GRASS = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_GRASS));
    public static final Item TALL_LUSH_SWAMP_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_LUSH_SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_LUSH_SWAMP_GRASS));
    public static final Item LUSH_SWAMP_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_SUGAR_CANE));
    public static final Item LUSH_SWAMP_VINE = createItem(new BlockItem(ARFOBlocks.LUSH_SWAMP_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LUSH_SWAMP_VINE));

    public static final Item SWAMP_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "swamp_dye");
    public static final Item SWAMP_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_GRASS_BLOCK));
    public static final Item SWAMP_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.SWAMP_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_GRASS_SLAB));
    public static final Item GLOWING_SWAMP_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_SWAMP_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_SWAMP_GRASS_BLOCK));
    public static final Item SWAMP_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.SWAMP_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_JUNGLE_LEAVES));
    public static final Item SWAMP_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SWAMP_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_JUNGLE_LEAVES_CARPET));
    public static final Item SWAMP_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SWAMP_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_OAK_LEAVES));
    public static final Item SWAMP_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SWAMP_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_OAK_LEAVES_CARPET));
    public static final Item SWAMP_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SWAMP_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_DARK_OAK_LEAVES));
    public static final Item SWAMP_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SWAMP_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_DARK_OAK_LEAVES_CARPET));
    public static final Item SWAMP_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.SWAMP_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_ACACIA_LEAVES));
    public static final Item SWAMP_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SWAMP_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_ACACIA_LEAVES_CARPET));
    public static final Item SWAMP_FERN = createItem(new BlockItem(ARFOBlocks.SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_FERN));
    public static final Item LARGE_SWAMP_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_SWAMP_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_SWAMP_FERN));
    public static final Item SWAMP_GRASS = createItem(new BlockItem(ARFOBlocks.SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_GRASS));
    public static final Item TALL_SWAMP_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_SWAMP_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_SWAMP_GRASS));
    public static final Item SWAMP_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.SWAMP_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_SUGAR_CANE));
    public static final Item SWAMP_VINE = createItem(new BlockItem(ARFOBlocks.SWAMP_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SWAMP_VINE));

    public static final Item SAVANNA_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "savanna_dye");
    public static final Item SAVANNA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.SAVANNA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_GRASS_BLOCK));
    public static final Item SAVANNA_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.SAVANNA_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_GRASS_SLAB));
    public static final Item GLOWING_SAVANNA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_SAVANNA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_SAVANNA_GRASS_BLOCK));
    public static final Item SAVANNA_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.SAVANNA_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_JUNGLE_LEAVES));
    public static final Item SAVANNA_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SAVANNA_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_JUNGLE_LEAVES_CARPET));
    public static final Item SAVANNA_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SAVANNA_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_OAK_LEAVES));
    public static final Item SAVANNA_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SAVANNA_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_OAK_LEAVES_CARPET));
    public static final Item SAVANNA_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.SAVANNA_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_DARK_OAK_LEAVES));
    public static final Item SAVANNA_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET));
    public static final Item SAVANNA_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.SAVANNA_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_ACACIA_LEAVES));
    public static final Item SAVANNA_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SAVANNA_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_ACACIA_LEAVES_CARPET));
    public static final Item SAVANNA_FERN = createItem(new BlockItem(ARFOBlocks.SAVANNA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_FERN));
    public static final Item LARGE_SAVANNA_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_SAVANNA_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_SAVANNA_FERN));
    public static final Item SAVANNA_GRASS = createItem(new BlockItem(ARFOBlocks.SAVANNA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_GRASS));
    public static final Item TALL_SAVANNA_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_SAVANNA_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_SAVANNA_GRASS));
    public static final Item SAVANNA_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.SAVANNA_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_SUGAR_CANE));
    public static final Item SAVANNA_VINE = createItem(new BlockItem(ARFOBlocks.SAVANNA_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SAVANNA_VINE));

    public static final Item BADLANDS_DYE = createItem(new ARFODyeItem(new Item.Properties().tab(ArtificialFoliage.itemGroup)), "badlands_dye");
    public static final Item BADLANDS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.BADLANDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_GRASS_BLOCK));
    public static final Item BADLANDS_GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.BADLANDS_GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_GRASS_SLAB));
    public static final Item GLOWING_BADLANDS_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.GLOWING_BADLANDS_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_BADLANDS_GRASS_BLOCK));
    public static final Item BADLANDS_JUNGLE_LEAVES = createItem(new BlockItem(ARFOBlocks.BADLANDS_JUNGLE_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_JUNGLE_LEAVES));
    public static final Item BADLANDS_JUNGLE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BADLANDS_JUNGLE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_JUNGLE_LEAVES_CARPET));
    public static final Item BADLANDS_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.BADLANDS_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_OAK_LEAVES));
    public static final Item BADLANDS_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BADLANDS_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_OAK_LEAVES_CARPET));
    public static final Item BADLANDS_DARK_OAK_LEAVES = createItem(new BlockItem(ARFOBlocks.BADLANDS_DARK_OAK_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_DARK_OAK_LEAVES));
    public static final Item BADLANDS_DARK_OAK_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET));
    public static final Item BADLANDS_ACACIA_LEAVES = createItem(new BlockItem(ARFOBlocks.BADLANDS_ACACIA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_ACACIA_LEAVES));
    public static final Item BADLANDS_ACACIA_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BADLANDS_ACACIA_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_ACACIA_LEAVES_CARPET));
    public static final Item BADLANDS_FERN = createItem(new BlockItem(ARFOBlocks.BADLANDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_FERN));
    public static final Item LARGE_BADLANDS_FERN = createItem(new BlockItem(ARFOBlocks.LARGE_BADLANDS_FERN, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.LARGE_BADLANDS_FERN));
    public static final Item BADLANDS_GRASS = createItem(new BlockItem(ARFOBlocks.BADLANDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_GRASS));
    public static final Item TALL_BADLANDS_GRASS = createItem(new BlockItem(ARFOBlocks.TALL_BADLANDS_GRASS, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.TALL_BADLANDS_GRASS));
    public static final Item BADLANDS_SUGAR_CANE = createItem(new BlockItem(ARFOBlocks.BADLANDS_SUGAR_CANE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_SUGAR_CANE));
    public static final Item BADLANDS_VINE = createItem(new BlockItem(ARFOBlocks.BADLANDS_VINE, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BADLANDS_VINE));


    public static final Item ARTIFICIAL_SOIL = createItem(new BlockItem(ARFOBlocks.ARTIFICIAL_SOIL, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.ARTIFICIAL_SOIL));
    public static final Item ARTIFICIAL_STONE_SOIL = createItem(new BlockItem(ARFOBlocks.ARTIFICIAL_STONE_SOIL, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.ARTIFICIAL_STONE_SOIL));
    public static final Item ALPHA_GRASS_BLOCK = createItem(new BlockItem(ARFOBlocks.ALPHA_GRASS_BLOCK, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.ALPHA_GRASS_BLOCK));
    public static final Item ALPHA_LEAVES = createItem(new BlockItem(ARFOBlocks.ALPHA_LEAVES, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.ALPHA_LEAVES));
    public static final Item SPRUCE_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.SPRUCE_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.SPRUCE_LEAVES_CARPET));
    public static final Item BIRCH_LEAVES_CARPET = createItem(new BlockItem(ARFOBlocks.BIRCH_LEAVES_CARPET, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.BIRCH_LEAVES_CARPET));
    public static final Item GRASS_SLAB = createItem(new BlockItem(ARFOBlocks.GRASS_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GRASS_SLAB));
    public static final Item DIRT_SLAB = createItem(new BlockItem(ARFOBlocks.DIRT_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.DIRT_SLAB));
    public static final Item COARSE_DIRT_SLAB = createItem(new BlockItem(ARFOBlocks.COARSE_DIRT_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.COARSE_DIRT_SLAB));
    public static final Item PODZOL_SLAB = createItem(new BlockItem(ARFOBlocks.PODZOL_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.PODZOL_SLAB));
    public static final Item MYCELIUM_SLAB = createItem(new BlockItem(ARFOBlocks.MYCELIUM_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.MYCELIUM_SLAB));
    public static final Item ARTIFICIAL_SOIL_SLAB = createItem(new BlockItem(ARFOBlocks.ARTIFICIAL_SOIL_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.ARTIFICIAL_SOIL_SLAB));
    public static final Item ARTIFICIAL_STONE_SOIL_SLAB = createItem(new BlockItem(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB));
    public static final Item GRASS_PATH_SLAB = createItem(new BlockItem(ARFOBlocks.GRASS_PATH_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GRASS_PATH_SLAB));
    public static final Item NETHERRACK_SLAB = createItem(new BlockItem(ARFOBlocks.NETHERRACK_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.NETHERRACK_SLAB));
    public static final Item CRIMSON_NYLIUM_SLAB = createItem(new BlockItem(ARFOBlocks.CRIMSON_NYLIUM_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.CRIMSON_NYLIUM_SLAB));
    public static final Item GLOWING_CRIMSON_NYLIUM = createItem(new BlockItem(ARFOBlocks.GLOWING_CRIMSON_NYLIUM, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_CRIMSON_NYLIUM));
    public static final Item WARPED_NYLIUM_SLAB = createItem(new BlockItem(ARFOBlocks.WARPED_NYLIUM_SLAB, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.WARPED_NYLIUM_SLAB));
    public static final Item GLOWING_WARPED_NYLIUM = createItem(new BlockItem(ARFOBlocks.GLOWING_WARPED_NYLIUM, new Item.Properties().tab(ArtificialFoliage.itemGroup)), Registry.BLOCK.getKey(ARFOBlocks.GLOWING_WARPED_NYLIUM));


    public static final Item COLD_OCEAN_WATER_BUCKET = createItem(new BucketItem(ARFOFluids.STILL_COLD_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "cold_ocean_water_bucket");
    public static final Item FROZEN_OCEAN_WATER_BUCKET = createItem(new BucketItem(ARFOFluids.STILL_FROZEN_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "frozen_ocean_water_bucket");
    public static final Item LUKEWARM_OCEAN_WATER_BUCKET = createItem(new BucketItem(ARFOFluids.STILL_LUKEWARM_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "lukewarm_ocean_water_bucket");
    public static final Item WARM_OCEAN_WATER_BUCKET = createItem(new BucketItem(ARFOFluids.STILL_WARM_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "warm_ocean_water_bucket");
    public static final Item SWAMP_WATER_BUCKET = createItem(new BucketItem(ARFOFluids.STILL_SWAMP_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "swamp_water_bucket");
    public static final Item OCEAN_WATER_BUCKET = createItem(new BucketItem(ARFOFluids.STILL_OCEAN_WATER, new Item.Properties().tab(ArtificialFoliage.itemGroup)), "ocean_water_bucket");


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
