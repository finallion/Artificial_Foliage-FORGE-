package com.finallion.arfo.common.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.VineBlock;


public class ARFOVinesBlock extends VineBlock {

    public ARFOVinesBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.VINE)
                .noOcclusion()
                .noCollission()
                .sound(SoundType.GRASS));
    }
}
