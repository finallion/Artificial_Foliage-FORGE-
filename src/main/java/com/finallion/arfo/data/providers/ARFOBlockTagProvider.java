package com.finallion.arfo.data.providers;

import com.finallion.arfo.common.blocks.*;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.tags.ARFOBlockTags;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ARFOBlockTagProvider extends BlockTagsProvider {

    public ARFOBlockTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Block block : ARFOBlocks.blocksList) {
            if (block instanceof ARFOSpreadableGrassBlock) {
                this.tag(ARFOBlockTags.GRASS_BLOCKS).add(block);
            }

            if (block instanceof ARFOAcaciaLeavesBlock) {
                this.tag(ARFOBlockTags.ACACIA_LEAVES).add(block);
            } else if (block instanceof ARFODarkOakLeavesBlock) {
                this.tag(ARFOBlockTags.DARK_OAK_LEAVES).add(block);
            } else if (block instanceof ARFOOakLeavesBlock) {
                this.tag(ARFOBlockTags.OAK_LEAVES).add(block);
            } else if (block instanceof ARFOJungleLeavesBlock) {
                this.tag(ARFOBlockTags.JUNGLE_LEAVES).add(block);
            }

        }



    }

    @Override
    public String getName() {
        return "Artificial Foliage block tags";
    }
}
