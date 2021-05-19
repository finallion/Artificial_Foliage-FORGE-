package com.finallion.arfo.common.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ARFOJungleLeavesBlock extends LeavesBlock implements IARFOLeaves {

    public ARFOJungleLeavesBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.JUNGLE_LEAVES)
                .harvestTool(ToolType.HOE)
                .sound(SoundType.GRASS));
    }

}
