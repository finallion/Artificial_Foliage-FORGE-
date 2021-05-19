package com.finallion.arfo.common.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ARFOAcaciaLeavesBlock extends LeavesBlock implements IARFOLeaves {

    public ARFOAcaciaLeavesBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.ACACIA_LEAVES)
                .harvestTool(ToolType.HOE)
                .sound(SoundType.GRASS));
    }
}
