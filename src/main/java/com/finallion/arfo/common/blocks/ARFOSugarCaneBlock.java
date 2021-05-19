package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;


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
