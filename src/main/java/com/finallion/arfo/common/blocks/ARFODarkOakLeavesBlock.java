package com.finallion.arfo.common.blocks;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class ARFODarkOakLeavesBlock extends LeavesBlock implements IARFOLeaves {

    public ARFODarkOakLeavesBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.DARK_OAK_LEAVES)
                .harvestTool(ToolType.HOE)
                .sound(SoundType.GRASS));
    }
}
