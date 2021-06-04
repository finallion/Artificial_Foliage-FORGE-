package com.finallion.arfo.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.SlabType;
import net.minecraftforge.common.ToolType;

public class ARFOSpreadableNetherrackSlab extends ARFOSpreadableSlab {


    public ARFOSpreadableNetherrackSlab() {
        super(Properties.copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.NETHERRACK));
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false).setValue(SNOWY, false));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

}
