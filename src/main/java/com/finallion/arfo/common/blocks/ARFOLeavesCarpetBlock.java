package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.*;
;
import net.minecraft.block.material.Material;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;


public class ARFOLeavesCarpetBlock extends BushBlock {
    protected static final EnumProperty<SlabType> TYPE = SlabBlock.TYPE;
    protected static final VoxelShape LEAF_CARPET = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public ARFOLeavesCarpetBlock() {
        super(AbstractBlock.Properties
                .of(Material.LEAVES)
                .noOcclusion()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS));
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return LEAF_CARPET;
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader worldIn, BlockPos pos) {
        if (worldIn.getBlockState(pos).getBlock() instanceof SlabBlock && worldIn.getBlockState(pos).is(ARFOBlocks.GRASS_PATH_SLAB)) {
            if (state.getValue(TYPE) != SlabType.BOTTOM) {
                return true;
            }
        }
        return state.isCollisionShapeFullBlock(worldIn, pos);
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        return this.mayPlaceOn(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }
}
