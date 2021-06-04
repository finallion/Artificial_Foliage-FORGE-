package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;

import net.minecraftforge.common.ToolType;


public class ARFOSpreadableStoneBlock extends ARFOSpreadableBlock {

    public ARFOSpreadableStoneBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
    }
}
