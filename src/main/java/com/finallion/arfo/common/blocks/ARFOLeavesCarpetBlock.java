package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;


public class ARFOLeavesCarpetBlock extends BushBlock {
    protected static final EnumProperty<SlabType> TYPE = SlabBlock.TYPE;
    public static final BooleanProperty SLAB_PLACEMENT = BlockStateProperties.OPEN;

    protected static final VoxelShape DOWN_SHAPE = Block.box(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape LEAF_CARPET = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public ARFOLeavesCarpetBlock() {
        super(AbstractBlock.Properties
                .of(Material.LEAVES)
                .noOcclusion()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS));

        this.registerDefaultState(this.stateDefinition.any().setValue(SLAB_PLACEMENT, false));
    }


    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader world, BlockPos pos) {
        Block block = state.getBlock();
        // (block instanceof ARFOSpreadableSlab && state.getValue(TYPE) != SlabType.BOTTOM)
        return block instanceof ARFOSpreadableBlock || block instanceof ARFOSoilBlock || block instanceof ARFOSpreadableSlab || block instanceof ARFOSlab || block instanceof ARFONyliumSlab || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND) || state.isCollisionShapeFullBlock(world, pos);

    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        return this.mayPlaceOn(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }




    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos pos = context.getClickedPos();
        BlockState target = context.getLevel().getBlockState(pos.below());

        // if plant gets placed on bottom slab, the boolean property "open" changes to true
        // this allows getShape to update the bounding box
        // the blockstate.json now needs to variants, one for open=true, one for open=false

        if (target.getBlock() instanceof ARFOSpreadableSlab || target.getBlock() instanceof ARFOSlab || target.getBlock() instanceof ARFONyliumSlab) {
            if (target.getValue(TYPE) == SlabType.BOTTOM) {
                return this.defaultBlockState().setValue(SLAB_PLACEMENT, true);
            }
        }
        return super.getStateForPlacement(context);
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(SLAB_PLACEMENT);
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if (state.getValue(SLAB_PLACEMENT)) {
            return DOWN_SHAPE;
        } else {
            return LEAF_CARPET;
        }
    }
}
