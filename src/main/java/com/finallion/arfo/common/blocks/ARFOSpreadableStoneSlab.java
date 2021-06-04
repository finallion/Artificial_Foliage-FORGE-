package com.finallion.arfo.common.blocks;

import com.finallion.arfo.compat.BYG.BYGBlocks;
import net.minecraft.block.*;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class ARFOSpreadableStoneSlab extends ARFOSpreadableSlab {


    public ARFOSpreadableStoneSlab() {
        super(AbstractBlock.Properties.copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false).setValue(SNOWY, false));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

}
