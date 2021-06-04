package com.finallion.arfo.common.blocks;


import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;


public class ARFOSpreadableNetherrackBlock extends ARFOSpreadableBlock {

    public ARFOSpreadableNetherrackBlock() {
        super(Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.NETHERRACK));
    }
}
