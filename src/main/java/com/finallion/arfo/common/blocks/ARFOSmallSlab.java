package com.finallion.arfo.common.blocks;

import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.*;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

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



    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return !this.defaultBlockState().canSurvive(context.getLevel(), context.getClickedPos()) ? Block.pushEntitiesUp(this.defaultBlockState(), Blocks.DIRT.defaultBlockState(), context.getLevel(), context.getClickedPos()) : super.getStateForPlacement(context);
    }

    public BlockState updateShape(BlockState state, Direction dir, BlockState state2, IWorld world, BlockPos pos, BlockPos pos2) {
        if (dir == Direction.UP && !state.canSurvive(world, pos)) {
            world.getBlockTicks().scheduleTick(pos, this, 1);
        }

        return super.updateShape(state, dir, state2, world, pos, pos2);
    }

    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random p_225534_4_) {
        if (!canSurvive(state, world, pos)) {
            if (state.getValue(TYPE) == SlabType.BOTTOM) {
                world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.defaultBlockState(), 3);
            } else if (state.getValue(TYPE) == SlabType.TOP) {
                world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.defaultBlockState().setValue(TYPE, SlabType.TOP), 3);
            } else {
                world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL.defaultBlockState(), 3);
            }
        }
    }

    public boolean canSurvive(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
        BlockState blockstate = p_196260_2_.getBlockState(p_196260_3_.above());
        return !blockstate.getMaterial().isSolid() || blockstate.getBlock() instanceof FenceGateBlock;
    }


    static {
        TOP_SHAPE = Block.box(0.0D, 8.0D, 0.0D, 16.0D, 15.0D, 16.0D);
        BOTTOM_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
        DOUBLE_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
        SNOWY = BlockStateProperties.SNOWY;
    }


}
