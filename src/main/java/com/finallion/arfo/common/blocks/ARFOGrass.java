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

public class ARFOGrass extends BushBlock implements IGrowable, IPlantable {
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    private static final Map<Block, Block> grassFeatures = new HashMap<>();

    public ARFOGrass() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS)
                .instabreak()
                .noCollission().noOcclusion()
                .sound(SoundType.GRASS));
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
        DoublePlantBlock tallFlowerBlock = (DoublePlantBlock)Blocks.TALL_GRASS;
        for (Block block : grassFeatures.keySet()) {
            if (state.is(block)) {
                tallFlowerBlock = (DoublePlantBlock) grassFeatures.get(block);
            }
        }

        if (tallFlowerBlock.defaultBlockState().canSurvive(world, pos) && world.isEmptyBlock(pos.above())) {
            tallFlowerBlock.placeAt(world, pos, 2);
        }
    }


    private void initMap() {
        grassFeatures.put(ModBlocks.JUNGLE_GRASS, ModBlocks.TALL_JUNGLE_GRASS);
        grassFeatures.put(ModBlocks.JUNGLE_EDGE_GRASS, ModBlocks.TALL_JUNGLE_EDGE_GRASS);
        grassFeatures.put(ModBlocks.BADLANDS_GRASS, ModBlocks.TALL_BADLANDS_GRASS);
        grassFeatures.put(ModBlocks.SAVANNA_GRASS, ModBlocks.TALL_SAVANNA_GRASS);
        grassFeatures.put(ModBlocks.FOREST_GRASS, ModBlocks.TALL_FOREST_GRASS);
        grassFeatures.put(ModBlocks.BIRCH_FOREST_GRASS, ModBlocks.TALL_BIRCH_FOREST_GRASS);
        grassFeatures.put(ModBlocks.DARK_FOREST_GRASS, ModBlocks.TALL_DARK_FOREST_GRASS);
        grassFeatures.put(ModBlocks.PLAINS_GRASS, ModBlocks.TALL_PLAINS_GRASS);
        grassFeatures.put(ModBlocks.SWAMP_GRASS, ModBlocks.TALL_SWAMP_GRASS);
        grassFeatures.put(ModBlocks.LUSH_SWAMP_GRASS, ModBlocks.TALL_LUSH_SWAMP_GRASS);
        grassFeatures.put(ModBlocks.MOUNTAINS_GRASS, ModBlocks.TALL_MOUNTAINS_GRASS);
        grassFeatures.put(ModBlocks.MUSHROOM_FIELDS_GRASS, ModBlocks.TALL_MUSHROOM_FIELDS_GRASS);
        grassFeatures.put(ModBlocks.TAIGA_GRASS, ModBlocks.TALL_TAIGA_GRASS);
        grassFeatures.put(ModBlocks.MEGA_TAIGA_GRASS, ModBlocks.TALL_MEGA_TAIGA_GRASS);
        grassFeatures.put(ModBlocks.SNOWY_GRASS, ModBlocks.TALL_SNOWY_GRASS);
        grassFeatures.put(ModBlocks.SNOWY_BEACH_GRASS, ModBlocks.TALL_SNOWY_BEACH_GRASS);
        grassFeatures.put(ModBlocks.WATERS_GRASS, ModBlocks.TALL_WATERS_GRASS);
    }


}
