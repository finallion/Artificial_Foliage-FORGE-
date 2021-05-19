package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;


public class ARFOSugarCaneBlock extends SugarCaneBlock {

    public ARFOSugarCaneBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.SUGAR_CANE)
                .instabreak()
                .noCollission()
                .noOcclusion()
                .sound(SoundType.GRASS));
    }

}
