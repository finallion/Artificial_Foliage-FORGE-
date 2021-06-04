package com.finallion.arfo.common.blocks;

import net.minecraft.block.*;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class ARFOSmallSlab extends SlabBlock {
    protected static final VoxelShape TOP_SHAPE;
    protected static final VoxelShape BOTTOM_SHAPE;
    protected static final VoxelShape DOUBLE_SHAPE;
    public static final BooleanProperty SNOWY;

    public ARFOSmallSlab() {
        super(AbstractBlock.Properties.copy(Blocks.GRASS_PATH).harvestTool(ToolType.SHOVEL));
        this.registerDefaultState(this.getStateDefinition().any().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false).setValue(SNOWY, false));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        SlabType type = (SlabType)state.getValue(TYPE);

        switch(type){
            case DOUBLE:
                return DOUBLE_SHAPE;
            case TOP:
                return TOP_SHAPE;
            default:
                return BOTTOM_SHAPE;
        }
    }



    static {
        TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 15.0D, 16.0D);
        BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
        DOUBLE_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
        SNOWY = BlockStateProperties.SNOWY;
    }


}
