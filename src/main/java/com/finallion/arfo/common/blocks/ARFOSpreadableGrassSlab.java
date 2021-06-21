package com.finallion.arfo.common.blocks;

import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

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

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {

        if (state.getBlock() != ARFOBlocks.GRASS_PATH_SLAB) {
            if (toolType == ToolType.HOE && state.getValue(TYPE) == SlabType.DOUBLE) return Blocks.FARMLAND.defaultBlockState();
            else if (toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.DOUBLE) return ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState().setValue(TYPE, SlabType.DOUBLE);
            else if (toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.BOTTOM) return ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState();
            else return toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.TOP ? ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState().setValue(TYPE, SlabType.TOP) : null;
        }
        return null;
    }
}
