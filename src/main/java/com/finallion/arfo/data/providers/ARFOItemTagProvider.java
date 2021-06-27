package com.finallion.arfo.data.providers;

import com.finallion.arfo.init.ARFOItems;
import com.finallion.arfo.tags.ARFOItemTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ARFOItemTagProvider extends ItemTagsProvider {
    public ARFOItemTagProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, blockTagsProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Item item : ARFOItems.itemsList) {
            if (item.toString().contains("grass_block") && !item.toString().contains("glowing")) {
                this.tag(ARFOItemTags.GRASS_BLOCKS).add(item);
            } else if (item.toString().contains("acacia_leaves") && !item.toString().contains("carpet")) {
                this.tag(ARFOItemTags.ACACIA_LEAVES).add(item);
            } else if (item.toString().contains("dark_oak_leaves") && !item.toString().contains("carpet")) {
                this.tag(ARFOItemTags.DARK_OAK_LEAVES).add(item);
            } else if (item.toString().contains("oak_leaves") && !item.toString().contains("carpet")) {
                this.tag(ARFOItemTags.OAK_LEAVES).add(item);
            } else if (item.toString().contains("jungle_leaves") && !item.toString().contains("carpet")) {
                this.tag(ARFOItemTags.JUNGLE_LEAVES).add(item);
            } else if (item.toString().contains("vine")) {
                this.tag(ARFOItemTags.VINES).add(item);
            } else if (item.toString().contains("sugar_cane")) {
                this.tag(ARFOItemTags.SUGAR_CANES).add(item);
            } else if (item.toString().contains("fern") && !item.toString().contains("large")) {
                this.tag(ARFOItemTags.FERNS).add(item);
            } else if (item.toString().contains("fern")) {
                this.tag(ARFOItemTags.LARGE_FERNS).add(item);
            } else if (item.toString().contains("grass") && !item.toString().contains("slab") && !item.toString().contains("block") && !item.toString().contains("tall")) {
                this.tag(ARFOItemTags.GRASS).add(item);
            } else if (item.toString().contains("grass") && !item.toString().contains("slab") && !item.toString().contains("block")) {
                this.tag(ARFOItemTags.TALL_GRASS).add(item);
            } else if (item.toString().contains("_grass_slab")) {
                this.tag(ARFOItemTags.GRASS_SLABS).add(item);
            } else if (item.toString().contains("_dye")) {
                this.tag(ARFOItemTags.DYES).add(item);
            }

            if (item.toString().contains("leaves") && !item.toString().contains("carpet")) {
                this.tag(ARFOItemTags.LEAVES).add(item);
            }
        }

        this.tag(ARFOItemTags.LEAVES).add(Items.ACACIA_LEAVES).add(Items.OAK_LEAVES).add(Items.DARK_OAK_LEAVES).add(Items.JUNGLE_LEAVES);
        this.tag(ARFOItemTags.GRASS).add(Items.GRASS);
        this.tag(ARFOItemTags.FERNS).add(Items.FERN);
        this.tag(ARFOItemTags.TALL_GRASS).add(Items.TALL_GRASS);
        this.tag(ARFOItemTags.LARGE_FERNS).add(Items.LARGE_FERN);
        this.tag(ARFOItemTags.GRASS_BLOCKS).add(Items.GRASS_BLOCK);
        this.tag(ARFOItemTags.SUGAR_CANES).add(Items.SUGAR_CANE);
        this.tag(ARFOItemTags.VINES).add(Items.VINE);
        this.tag(ARFOItemTags.ACACIA_LEAVES).add(Items.ACACIA_LEAVES);
        this.tag(ARFOItemTags.OAK_LEAVES).add(Items.OAK_LEAVES);
        this.tag(ARFOItemTags.DARK_OAK_LEAVES).add(Items.DARK_OAK_LEAVES);
        this.tag(ARFOItemTags.JUNGLE_LEAVES).add(Items.JUNGLE_LEAVES);

        this.tag(ARFOItemTags.CORALS).add(Items.BRAIN_CORAL).add(Items.BUBBLE_CORAL).add(Items.HORN_CORAL).add(Items.TUBE_CORAL).add(Items.FIRE_CORAL).add(Items.BRAIN_CORAL_FAN).add(Items.BUBBLE_CORAL_FAN).add(Items.HORN_CORAL_FAN).add(Items.TUBE_CORAL_FAN).add(Items.FIRE_CORAL_FAN);

        this.tag(ARFOItemTags.FROZEN_DYES).add(ARFOItems.SNOWY_BEACH_DYE).add(ARFOItems.SNOWY_DYE);
        this.tag(ARFOItemTags.COLD_DYES).add(ARFOItems.TAIGA_DYE).add(ARFOItems.MEGA_TAIGA_DYE).add(ARFOItems.MOUNTAINS_DYE);
        this.tag(ARFOItemTags.WARM_DYES).add(ARFOItems.MUSHROOM_FIELDS_DYE).add(ARFOItems.JUNGLE_DYE).add(ARFOItems.SAVANNA_DYE);
        this.tag(ARFOItemTags.LUKEWARM_DYES).add(ARFOItems.JUNGLE_EDGE_DYE).add(ARFOItems.BADLANDS_DYE).add(ARFOItems.DARK_FOREST_DYE);
        this.tag(ARFOItemTags.SWAMP_DYES).add(ARFOItems.SWAMP_DYE).add(ARFOItems.LUSH_SWAMP_DYE);
        this.tag(ARFOItemTags.MODERATE_DYES).add(ARFOItems.PLAINS_DYE).add(ARFOItems.WATERS_DYE).add(ARFOItems.BIRCH_FOREST_DYE).add(ARFOItems.FOREST_DYE);
    }

    @Override
    public String getName() {
        return "Artificial Foliage item tags";
    }
}
