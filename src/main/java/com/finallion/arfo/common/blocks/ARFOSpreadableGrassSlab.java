package com.finallion.arfo.common.blocks;

import net.minecraft.block.*;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.SlabType;
import net.minecraftforge.common.ToolType;

public class ARFOSpreadableGrassSlab extends ARFOSpreadableSlab {

    public ARFOSpreadableGrassSlab() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.SHOVEL)
                .sound(SoundType.GRASS));
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false).setValue(SNOWY, false));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }
}
