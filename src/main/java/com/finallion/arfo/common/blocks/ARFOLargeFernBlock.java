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


public class ARFOLargeFernBlock extends TallFlowerBlock implements IPlantable {

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;

    public ARFOLargeFernBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.LARGE_FERN)
                .instabreak()
                .sound(SoundType.GRASS)
                .noCollission()
                .noOcclusion());
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
    protected boolean mayPlaceOn(BlockState state, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        Block block = state.getBlock();
        return block instanceof ARFOGrassBlock || block instanceof ARFOGlowingGrassBlock || block instanceof ARFOSoilBlock || (block instanceof ARFOSlabBlock && state.getValue(TYPE) != SlabType.BOTTOM)  || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND);
    }

}
