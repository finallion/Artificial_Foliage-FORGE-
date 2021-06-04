package com.finallion.arfo.tags;

import com.finallion.arfo.ArtificialFoliage;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class ARFOItemTags {

    private static final List<String> LOCATIONS = new ArrayList<>();

    public static final ITag.INamedTag<Item> GRASS_BLOCKS = createTag("grass_blocks");
    public static final ITag.INamedTag<Item> ACACIA_LEAVES = createTag("acacia_leaves");
    public static final ITag.INamedTag<Item> OAK_LEAVES = createTag("oak_leaves");
    public static final ITag.INamedTag<Item> DARK_OAK_LEAVES = createTag("dark_oak_leaves");
    public static final ITag.INamedTag<Item> JUNGLE_LEAVES = createTag("jungle_leaves");

    public static final ITag.INamedTag<Item> LEAVES = createTag("leaves");

    public static final ITag.INamedTag<Item> VINES = createTag("vines");
    public static final ITag.INamedTag<Item> SUGAR_CANES = createTag("sugar_canes");
    public static final ITag.INamedTag<Item> GRASS = createTag("grass");
    public static final ITag.INamedTag<Item> TALL_GRASS = createTag("tall_grass");
    public static final ITag.INamedTag<Item> FERNS = createTag("ferns");
    public static final ITag.INamedTag<Item> LARGE_FERNS = createTag("large_ferns");
    public static final ITag.INamedTag<Item> GRASS_SLABS = createTag("grass_slabs");

    public static final ITag.INamedTag<Item> DYES = createTag("dyes");

    public static final ITag.INamedTag<Item> COLD_DYES = createTag("cold_dyes");
    public static final ITag.INamedTag<Item> FROZEN_DYES = createTag("frozen_dyes");
    public static final ITag.INamedTag<Item> SWAMP_DYES = createTag("swamp_dyes");
    public static final ITag.INamedTag<Item> WARM_DYES = createTag("warm_dyes");
    public static final ITag.INamedTag<Item> LUKEWARM_DYES = createTag("lukewarm_dyes");
    public static final ITag.INamedTag<Item> MODERATE_DYES = createTag("moderate_dyes");

    public static final ITag.INamedTag<Item> WATER = createTag("water");

    private static ITag.INamedTag<Item> createTag(String location) {
        if (!LOCATIONS.contains(location)) {
            LOCATIONS.add(location);
            return createTag(new ResourceLocation(ArtificialFoliage.MODID, location));
        } else {
            throw new RuntimeException("Duplicate key: " + location);
        }
    }

    private static ITag.INamedTag<Item> createTag(ResourceLocation location) {
        return ItemTags.createOptional(location);
    }
}
