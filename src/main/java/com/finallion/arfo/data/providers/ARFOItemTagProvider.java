package com.finallion.arfo.data.providers;

import com.finallion.arfo.common.blocks.*;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOItems;
import com.finallion.arfo.tags.ARFOItemTags;
import net.minecraft.block.Block;
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
        for (Block block : ARFOBlocks.blocksList) {
            if (block instanceof ARFOSpreadableGrassBlock) {
                this.tag(ARFOItemTags.GRASS_BLOCKS).add(block.asItem());
            } else if (block instanceof ARFOAcaciaLeavesBlock) {
                this.tag(ARFOItemTags.ACACIA_LEAVES).add(block.asItem());
            } else if (block instanceof ARFODarkOakLeavesBlock) {
                this.tag(ARFOItemTags.DARK_OAK_LEAVES).add(block.asItem());
            } else if (block instanceof ARFOOakLeavesBlock) {
                this.tag(ARFOItemTags.OAK_LEAVES).add(block.asItem());
            } else if (block instanceof ARFOJungleLeavesBlock) {
                this.tag(ARFOItemTags.JUNGLE_LEAVES).add(block.asItem());
            } else if (block instanceof ARFOVinesBlock) {
                this.tag(ARFOItemTags.VINES).add(block.asItem());
            } else if (block instanceof ARFOSugarCaneBlock) {
                this.tag(ARFOItemTags.SUGAR_CANES).add(block.asItem());
            }

            if (block instanceof ARFOAcaciaLeavesBlock || block instanceof ARFOJungleLeavesBlock || block instanceof ARFOOakLeavesBlock || block instanceof ARFODarkOakLeavesBlock) {
                this.tag(ARFOItemTags.LEAVES).add(block.asItem());
            }
        }

        this.tag(ARFOItemTags.LEAVES).add(Items.ACACIA_LEAVES).add(Items.OAK_LEAVES).add(Items.DARK_OAK_LEAVES).add(Items.JUNGLE_LEAVES);
        /*
        this.tag(ARFOItemTags.GRASS).add(Items.GRASS);
        this.tag(ARFOItemTags.FERNS).add(Items.FERN);
        this.tag(ARFOItemTags.TALL_GRASS).add(Items.TALL_GRASS);
        this.tag(ARFOItemTags.LARGE_FERNS).add(Items.LARGE_FERN);

         */
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

        this.tag(ARFOItemTags.DYES).addTag(ARFOItemTags.MODERATE_DYES).addTag(ARFOItemTags.LUKEWARM_DYES).addTag(ARFOItemTags.COLD_DYES).addTag(ARFOItemTags.WARM_DYES).addTag(ARFOItemTags.SWAMP_DYES).addTag(ARFOItemTags.FROZEN_DYES);
    }

    @Override
    public String getName() {
        return "Artificial Foliage item tags";
    }
}
