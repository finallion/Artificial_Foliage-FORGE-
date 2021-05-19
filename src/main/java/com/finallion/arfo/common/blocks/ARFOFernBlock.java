package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ModBlocks;
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
        return block instanceof ARFOGrassBlock || block instanceof ARFOGlowingGrassBlock || block instanceof ARFOSoilBlock || (block instanceof ARFOSlabBlock && state.getValue(TYPE) != SlabType.BOTTOM)  || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND);
    }

    @Override
    public void performBonemeal(ServerWorld world, Random p_225535_2_, BlockPos pos, BlockState state) {
        initMap();
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

    private void initMap() {
        grassFeatures.put(ModBlocks.JUNGLE_FERN, ModBlocks.LARGE_JUNGLE_FERN);
        grassFeatures.put(ModBlocks.JUNGLE_EDGE_FERN, ModBlocks.LARGE_JUNGLE_EDGE_FERN);
        grassFeatures.put(ModBlocks.BADLANDS_FERN, ModBlocks.LARGE_BADLANDS_FERN);
        grassFeatures.put(ModBlocks.SAVANNA_FERN, ModBlocks.LARGE_SAVANNA_FERN);
        grassFeatures.put(ModBlocks.FOREST_FERN, ModBlocks.LARGE_FOREST_FERN);
        grassFeatures.put(ModBlocks.BIRCH_FOREST_FERN, ModBlocks.LARGE_BIRCH_FOREST_FERN);
        grassFeatures.put(ModBlocks.DARK_FOREST_FERN, ModBlocks.LARGE_DARK_FOREST_FERN);
        grassFeatures.put(ModBlocks.PLAINS_FERN, ModBlocks.LARGE_PLAINS_FERN);
        grassFeatures.put(ModBlocks.SWAMP_FERN, ModBlocks.LARGE_SWAMP_FERN);
        grassFeatures.put(ModBlocks.LUSH_SWAMP_FERN, ModBlocks.LARGE_LUSH_SWAMP_FERN);
        grassFeatures.put(ModBlocks.MOUNTAINS_FERN, ModBlocks.LARGE_MOUNTAINS_FERN);
        grassFeatures.put(ModBlocks.MUSHROOM_FIELDS_FERN, ModBlocks.LARGE_MUSHROOM_FIELDS_FERN);
        grassFeatures.put(ModBlocks.TAIGA_FERN, ModBlocks.LARGE_TAIGA_FERN);
        grassFeatures.put(ModBlocks.MEGA_TAIGA_FERN, ModBlocks.LARGE_MEGA_TAIGA_FERN);
        grassFeatures.put(ModBlocks.SNOWY_FERN, ModBlocks.LARGE_SNOWY_FERN);
        grassFeatures.put(ModBlocks.SNOWY_BEACH_FERN, ModBlocks.LARGE_SNOWY_BEACH_FERN);
        grassFeatures.put(ModBlocks.WATERS_FERN, ModBlocks.LARGE_WATERS_FERN);
    }

}
