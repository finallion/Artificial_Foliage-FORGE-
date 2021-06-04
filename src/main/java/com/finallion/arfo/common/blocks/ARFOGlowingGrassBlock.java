package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;


public class ARFOGlowingGrassBlock extends ARFOSpreadableBlock {

    public ARFOGlowingGrassBlock() {
        super(AbstractBlock.Properties.copy(Blocks.GRASS_BLOCK).lightLevel(l -> 15));
    }

}
