package com.finallion.arfo.common.blocks;


import com.finallion.arfo.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ARFOFernBlock extends BushBlock implements IGrowable, IPlantable {
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    private static final Map<Block, Block> grassFeatures = new HashMap<>();

    public ARFOFernBlock() {
        super(AbstractBlock.Properties.copy(Blocks.FERN)
                .instabreak()
                .sound(SoundType.GRASS)
                .noCollission()
                .noOcclusion());
    }
    @Override
    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState p_180670_4_) {
        return true;
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        return this.mayPlaceOn(worldIn.getBlockState(blockpos), worldIn, blockpos);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        Block block = state.getBlock();
        return block instanceof ARFOSpreadableBlock || block instanceof ARFOSoilBlock || (block instanceof ARFOSpreadableSlab && state.getValue(TYPE) != SlabType.BOTTOM)  || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND);
    }

    @Override
    public void performBonemeal(ServerWorld world, Random p_225535_2_, BlockPos pos, BlockState state) {
        MapUtils.initFernMap(grassFeatures);
        DoublePlantBlock tallPlantBlock = (DoublePlantBlock) Blocks.LARGE_FERN;
        for (Block block : grassFeatures.keySet()) {
            if (state.is(block)) {
                tallPlantBlock = (DoublePlantBlock) grassFeatures.get(block);
            }
        }

        if (tallPlantBlock.defaultBlockState().canSurvive(world, pos) && world.isEmptyBlock(pos.above())) {
            tallPlantBlock.placeAt(world, pos, 2);
        }
    }



}
