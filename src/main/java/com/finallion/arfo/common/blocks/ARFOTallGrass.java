package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.IPlantable;


public class ARFOTallGrass extends TallFlowerBlock implements IPlantable {
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;

    public ARFOTallGrass() {
        super(AbstractBlock.Properties
                .copy(Blocks.TALL_GRASS)
                .instabreak()
                .noOcclusion()
                .noCollission()
                .sound(SoundType.GRASS));
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        if (state.getValue(HALF) != DoubleBlockHalf.UPPER) {
            return this.mayPlaceOn(worldIn.getBlockState(blockpos), worldIn, blockpos);
        } else {
            BlockState blockstate = worldIn.getBlockState(pos.below());
            if (state.getBlock() != this) return super.canSurvive(state, worldIn, pos);
            return blockstate.is(this) && blockstate.getValue(HALF) == DoubleBlockHalf.LOWER;
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader world, BlockPos p_200014_3_) {
        Block block = state.getBlock();
        return block instanceof ARFOSpreadableBlock|| block instanceof ARFOSoilBlock || (block instanceof ARFOSpreadableSlab && state.getValue(TYPE) != SlabType.BOTTOM) || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND);
    }
}
