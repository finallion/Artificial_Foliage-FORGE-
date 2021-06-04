package com.finallion.arfo.common.blocks;

import net.minecraft.block.*;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class ARFOSpreadableGrassBlock extends ARFOSpreadableBlock {

    public ARFOSpreadableGrassBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.SHOVEL)
                .sound(SoundType.GRASS));
    }

}
