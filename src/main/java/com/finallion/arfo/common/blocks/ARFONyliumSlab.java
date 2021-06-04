package com.finallion.arfo.common.blocks;


import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.init.ARFOBlocks;
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
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.NetherVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVineFeature;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import java.util.Iterator;
import java.util.Random;

public class ARFONyliumSlab extends SlabBlock implements IGrowable {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;

    public ARFONyliumSlab() {
        super(AbstractBlock.Properties.copy(Blocks.CRIMSON_NYLIUM).harvestTool(ToolType.PICKAXE));
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false));
    }


    private static boolean canBeNylium(BlockState state, IWorldReader world, BlockPos pos) {
        BlockPos blockpos = pos.above();
        BlockState aboveState = world.getBlockState(blockpos);
        if (aboveState.getBlock() == Blocks.SNOW && (Integer) aboveState.getValue(SnowBlock.LAYERS) > 1) {
            return false;
        } else if (state.getBlock() instanceof ARFONyliumSlab && state.getValue(TYPE) == SlabType.TOP && !aboveState.getMaterial().isSolid()) {
            return true;
        }
        int i = LightEngine.getLightBlockInto(world, state, pos, aboveState, blockpos, Direction.UP, aboveState.getLightBlock(world, blockpos));
        return i < world.getMaxLightLevel();
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random r) {
        if (!canBeNylium(state, world, pos)) {
            if (state.is(BYGBlocks.BYG_EMBUR_NYLIUM_SLAB)) {
                world.setBlockAndUpdate(pos, BYGBlocks.BYG_BLUE_NETHERRACK_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)));
            } else {
                world.setBlockAndUpdate(pos, ARFOBlocks.NETHERRACK_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)));
            }
        }
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
    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
        return p_176473_1_.getBlockState(p_176473_2_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState state) {
        return true;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;

        Iterator var7 = BlockPos.betweenClosed(pos.offset(-1, -1, -1), pos.offset(1, 1, 1)).iterator();

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.is(ARFOBlocks.WARPED_NYLIUM_SLAB) || blockState.is(Blocks.WARPED_NYLIUM) || blockState.is(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
                bl = true;
            }

            if (blockState.is(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockState.is(Blocks.CRIMSON_NYLIUM) || blockState.is(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                bl2 = true;
            }


            if (blockState.is(BYGBlocks.BYG_EMBUR_NYLIUM_SLAB)) {
                bl3 = true;
                //break;
            }
            if (blockState.is(BYGBlocks.BYG_SYTHIAN_NYLIUM_SLAB)) {
                bl4 = true;
                //break;
            }
            if (blockState.is(BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB)) {
                bl5 = true;
                //break;
            }
            if (blockState.is(BYGBlocks.BYG_MYCELIUM_NETHERRACK_SLAB)) {
                bl6 = true;
                //break;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (state.getBlock().is(ARFOBlocks.NETHERRACK_SLAB)) {
            if (bl2 && bl) {
                world.setBlock(pos, random.nextBoolean() ? ARFOBlocks.WARPED_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)) : ARFOBlocks.CRIMSON_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl) {
                world.setBlock(pos, ARFOBlocks.WARPED_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl2) {
                world.setBlock(pos, ARFOBlocks.CRIMSON_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl3) {
                world.setBlock(pos, BYGBlocks.BYG_EMBUR_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl4) {
                world.setBlock(pos, BYGBlocks.BYG_SYTHIAN_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl5) {
                world.setBlock(pos, BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            } else if (bl6) {
                world.setBlock(pos, BYGBlocks.BYG_MYCELIUM_NETHERRACK_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
            }
        } else if (state.is(BYGBlocks.BYG_BLUE_NETHERRACK_SLAB) && bl3) {
            world.setBlock(pos, BYGBlocks.BYG_EMBUR_NYLIUM_SLAB.defaultBlockState().setValue(TYPE, state.getValue(TYPE)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)), 3);
        } else if (state.is(this)) {
            if (state.getValue(TYPE) != SlabType.BOTTOM) {
                growNetherGrass(world, random, pos, state);
            }
        }
    }


    public void growNetherGrass(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
        BlockState blockstate = p_225535_1_.getBlockState(p_225535_3_);
        BlockPos blockpos = p_225535_3_.above();
        if (blockstate.is(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || blockstate.is(BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB)) {
            if (blockstate.getValue(TYPE) != SlabType.BOTTOM) {
                NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.CRIMSON_FOREST_CONFIG, 1, 1);
            }
        } else if (blockstate.is(ARFOBlocks.WARPED_NYLIUM_SLAB)) {
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
