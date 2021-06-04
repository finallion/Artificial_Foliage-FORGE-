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

public class ARFOBlockTags {

    private static final List<String> LOCATIONS = new ArrayList<>();

    public static final ITag.INamedTag<Block> GRASS_BLOCKS = createTag("grass_blocks");
    public static final ITag.INamedTag<Block> ACACIA_LEAVES = createTag("acacia_leaves");
    public static final ITag.INamedTag<Block> OAK_LEAVES = createTag("oak_leaves");
    public static final ITag.INamedTag<Block> DARK_OAK_LEAVES = createTag("dark_oak_leaves");
    public static final ITag.INamedTag<Block> JUNGLE_LEAVES = createTag("jungle_leaves");

    public static final ITag.INamedTag<Block> VINES = createTag("vines");
    public static final ITag.INamedTag<Block> SUGAR_CANES = createTag("sugar_canes");
    public static final ITag.INamedTag<Block> GRASS = createTag("grass");
    public static final ITag.INamedTag<Block> FERNS = createTag("ferns");

    public static final ITag.INamedTag<Block> WATER = createTag("water");

    private static ITag.INamedTag<Block> createTag(String location) {
        if (!LOCATIONS.contains(location)) {
            LOCATIONS.add(location);
            return createTag(new ResourceLocation(ArtificialFoliage.MODID, location));
        } else {
            throw new RuntimeException("Duplicate key: " + location);
        }
    }

    private static ITag.INamedTag<Block> createTag(ResourceLocation location) {
        return BlockTags.createOptional(location);
    }
}
