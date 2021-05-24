package com.finallion.arfo.data.providers;

import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOItems;
import com.finallion.arfo.utils.ARFOBlockTags;
import com.finallion.arfo.utils.ARFOItemTags;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ARFOBlockTagProvider extends BlockTagsProvider {

    public ARFOBlockTagProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        for (Block block : ARFOBlocks.blocksList) {
            if (block.toString().contains("grass_block")  && !block.toString().contains("glowing")) {
                this.tag(ARFOBlockTags.GRASS_BLOCKS).add(block);
            }

            if (block.toString().contains("acacia_leaves") && !block.toString().contains("carpet")) {
                this.tag(ARFOBlockTags.ACACIA_LEAVES).add(block);
            } else if (block.toString().contains("dark_oak_leaves") && !block.toString().contains("carpet")) {
                this.tag(ARFOBlockTags.DARK_OAK_LEAVES).add(block);
            } else if (block.toString().contains("oak_leaves") && !block.toString().contains("carpet")) {
                this.tag(ARFOBlockTags.OAK_LEAVES).add(block);
            } else if (block.toString().contains("jungle_leaves") && !block.toString().contains("carpet")) {
                this.tag(ARFOBlockTags.JUNGLE_LEAVES).add(block);
            }

        }



    }

    @Override
    public String getName() {
        return "Artificial Foliage block tags";
    }
}
