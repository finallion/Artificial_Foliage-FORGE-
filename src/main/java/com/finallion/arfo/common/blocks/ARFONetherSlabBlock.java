package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.NetherVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVineFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.Tags;

import java.util.Iterator;
import java.util.Random;

public class ARFONetherSlabBlock extends SlabBlock implements IGrowable {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;

    public ARFONetherSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false));
    }


    @Override
    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
        return p_176473_1_.getBlockState(p_176473_2_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState p_180670_4_) {
        return true;
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        PlantType type = plantable.getPlantType(world, pos.relative(facing));

        if (state.getValue(TYPE) != SlabType.BOTTOM) {
            if (plantable instanceof MushroomBlock) {
                return true;
            }

            if (plantable instanceof BushBlock)
                return true;

            if (PlantType.CAVE.equals(type)) {
                return true;
                //return state.isFaceSturdy(world, pos, Direction.UP);
            } else if (PlantType.PLAINS.equals(type)) {
                return this.getBlock() == this;
            } else if (PlantType.BEACH.equals(type)) {
                boolean isBeach = state.is(this) || Tags.Blocks.DIRT.contains(this) || state.is(Blocks.SAND) || state.is(Blocks.RED_SAND);
                boolean hasWater = false;
                for (Direction face : Direction.Plane.HORIZONTAL) {
                    BlockState blockState = world.getBlockState(pos.relative(face));
                    FluidState fluidState = world.getFluidState(pos.relative(face));
                    hasWater |= blockState.is(Blocks.FROSTED_ICE);
                    hasWater |= fluidState.is(FluidTags.WATER);
                    if (hasWater)
                        break;
                }
                return isBeach && hasWater;
            }
        }
        return false;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;
        Iterator var7 = BlockPos.betweenClosed(pos.offset(-1, -1, -1), pos.offset(1, 1, 1)).iterator();

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.is(ModBlocks.WARPED_NYLIUM_SLAB) || blockState.is(Blocks.WARPED_NYLIUM)) {
                bl2 = true;
            }

            if (blockState.is(ModBlocks.CRIMSON_NYLIUM_SLAB) || blockState.is(Blocks.CRIMSON_NYLIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (state.is(this)) {
            if (bl2 && bl) {
                world.setBlock(pos, random.nextBoolean() ? ModBlocks.WARPED_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)) : ModBlocks.CRIMSON_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl2) {
                world.setBlock(pos, ModBlocks.WARPED_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl) {
                world.setBlock(pos, ModBlocks.CRIMSON_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            }
        } else {
            if (bl2 && bl) {
                world.setBlock(pos, random.nextBoolean() ? Blocks.WARPED_NYLIUM.defaultBlockState() : Blocks.CRIMSON_NYLIUM.defaultBlockState(), 3);
            } else if (bl2) {
                world.setBlock(pos, Blocks.WARPED_NYLIUM.defaultBlockState(), 3);
            } else if (bl) {
                world.setBlock(pos, Blocks.CRIMSON_NYLIUM.defaultBlockState(), 3);
            }
        }
    }


    public void growNetherGrass(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
        BlockState blockstate = p_225535_1_.getBlockState(p_225535_3_);
        BlockPos blockpos = p_225535_3_.above();
        if (blockstate.is(ModBlocks.CRIMSON_NYLIUM_SLAB)) {
            if (blockstate.getValue(TYPE) != SlabType.BOTTOM) {
                NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.CRIMSON_FOREST_CONFIG, 1, 1);
            }
        } else if (blockstate.is(ModBlocks.WARPED_NYLIUM_SLAB)) {
            if (blockstate.getValue(TYPE) != SlabType.BOTTOM) {
                NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.WARPED_FOREST_CONFIG, 1, 1);
                NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.NETHER_SPROUTS_CONFIG, 1, 1);
                if (p_225535_2_.nextInt(8) == 0) {
                    TwistingVineFeature.place(p_225535_1_, p_225535_2_, blockpos, 1, 1, 2);
                }
            }
        }

    }


    static {
        TYPE = BlockStateProperties.SLAB_TYPE;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
