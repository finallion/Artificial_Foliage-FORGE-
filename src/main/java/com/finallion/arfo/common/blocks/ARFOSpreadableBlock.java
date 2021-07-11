package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.utils.BlockMapping;
import com.finallion.arfo.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.*;

public class ARFOSpreadableBlock extends SpreadableSnowyDirtBlock implements IGrowable {
    public static final EnumProperty<DoubleBlockHalf> HALF;
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty SNOWY;
    public static final BooleanProperty WATERLOGGED;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    protected ARFOSpreadableBlock(Properties p_i48324_1_) {
        super(p_i48324_1_);
    }


    @Override
    public boolean isValidBonemealTarget(IBlockReader world, BlockPos p_176473_2_, BlockState state, boolean p_176473_4_) {
        if (state.getBlock().is(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
            return false;
        }

        return world.getBlockState(p_176473_2_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(World p_180670_1_, Random p_180670_2_, BlockPos p_180670_3_, BlockState state) {
        if (state.getBlock().is(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
            return false;
        }
        return true;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.above();
        BlockState blockState = world.getBlockState(pos);
        BlockState failState = Blocks.AIR.defaultBlockState();
        MapUtils.initMap(grassFeatures);
        boolean large = false;

        /*
        List<Block> features = new ArrayList<>();

        //TODO check if block is instance and get direct without for-loop
        for (Block b2 : grassFeatures.keySet()) {
            if (blockState.getBlock().is(b2)) features = grassFeatures.get(b2);
        }

         */


        List<Block> features = grassFeatures.get(this.getBlock());

        label48:
        for (int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!(world.getBlockState(blockPos2.below()).getBlock() instanceof ARFOSpreadableBlock) || world.getBlockState(blockPos2).isCollisionShapeFullBlock(world, blockPos2)) {
                    continue label48;
                }
            }
            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                ((ARFOSpreadableBlock) blockState.getBlock()).performBonemeal(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                if (blockState2.getValue(TYPE) != SlabType.BOTTOM) {
                    ((ARFOSpreadableBlock) blockState.getBlock()).performBonemeal(world, random, blockPos2, blockState2);
                }
            }


            if (blockState2.is(Blocks.AIR)) {
                BlockState blockState4 = failState;
                int rand = random.nextInt(80);
                if (rand < 10) {
                    blockState4 = features.get(0).defaultBlockState();
                } else if (rand < 30) {
                    blockState4 = features.get(1).defaultBlockState();
                } else if (rand < 35) {
                    if (world.getBlockState(blockPos2.above()).is(Blocks.AIR)) {
                        blockState4 = features.get(2).defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 40) {
                    if (world.getBlockState(blockPos2.above()).is(Blocks.AIR)) {
                        blockState4 = features.get(3).defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 45) {
                    blockState4 = features.get(random.nextInt(features.size() / 2) + 4).defaultBlockState();
                }


                if (blockState4.canSurvive(world, blockPos2)) {
                    world.setBlock(blockPos2, blockState4, 3);
                    if (large) {
                        world.setBlock(blockPos2.above(), blockState4.getBlock().defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER), 3);
                    }
                    large = false;
                }
            }
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canBeGrass(state, world, pos)) {
            setToDirt(world, pos);
        } else doTick(state, world, pos, random);
    }

    public static void setToDirt(World world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block instanceof ARFOSpreadableGrassBlock|| block instanceof ARFOGlowingGrassBlock) {
            world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL.defaultBlockState(), 3);
        } else if (block instanceof ARFOSpreadableStoneBlock) {
            world.setBlock(pos, ARFOBlocks.ARTIFICIAL_STONE_SOIL.defaultBlockState(), 3);
        } else if (block instanceof ARFOSpreadableNetherrackBlock) {
            world.setBlock(pos, Blocks.NETHERRACK.defaultBlockState(), 3);
        } else {
            world.setBlock(pos, Blocks.DIRT.defaultBlockState(), 3);
        }
    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canBeGrass(state, world, pos)) {

            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);

                if (canPropagate(state, world, newPos)) {
                    if (newState.is(ARFOBlocks.ARTIFICIAL_SOIL)) { // arfo grass block to arfo dirt
                        if ((state.getBlock() instanceof ARFOSpreadableGrassBlock || state.getBlock() instanceof ARFOGlowingGrassBlock) && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            world.setBlock(newPos, state.getBlockState(), 3);
                        }
                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) { // arfo grass block to arfo dirt slab
                        BlockState matchingSlab = newState;

                        if ((state.getBlock() instanceof ARFOSpreadableGrassBlock || state.getBlock() instanceof ARFOGlowingGrassBlock) && !state.getBlock().is(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (b == state.getBlock()) {
                                    matchingSlab = BlockMapping.slabAndBlocks.get(b).defaultBlockState();
                                }
                            }

                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                                if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.getValue(WATERLOGGED))
                                        world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        }
                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_STONE_SOIL)) { // arfo stone to arfo stone soil
                        if (state.getBlock() instanceof ARFOSpreadableStoneBlock && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            world.setBlock(newPos, state.getBlockState(), 3);
                        }

                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB)) { // arfo stone to arfo stone soil slab
                        BlockState matchingSlab = newState;


                        if (state.getBlock() instanceof ARFOSpreadableStoneBlock) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (b == state.getBlock()) {
                                    matchingSlab = BlockMapping.slabAndBlocks.get(b).defaultBlockState();
                                }
                            }

                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                                if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.getValue(WATERLOGGED))
                                        world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        }
                    } else if (newState.is(Blocks.NETHERRACK)) { // arfo overgrown netherrack to netherrack
                        if (state.getBlock() instanceof ARFOSpreadableNetherrackBlock && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            world.setBlock(newPos, state.getBlockState(), 3);
                        }

                    } else if (newState.is(ARFOBlocks.NETHERRACK_SLAB)) { // arfo overgrown netherrack to netherrack slab
                        BlockState matchingSlab = newState;

                        if (state.getBlock() instanceof ARFOSpreadableNetherrackBlock) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (b == state.getBlock()) {
                                    matchingSlab = BlockMapping.slabAndBlocks.get(b).defaultBlockState();
                                }
                            }

                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                                if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.getValue(WATERLOGGED))
                                        world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        }
                    } else if (newState.is(ARFOBlocks.DIRT_SLAB)) { // vanilla grass block mixin to arfo dirt slab
                        if (state.getBlock().is(Blocks.GRASS_BLOCK)) {
                            BlockState matchingSlab = ARFOBlocks.GRASS_SLAB.defaultBlockState();
                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                                if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.getValue(WATERLOGGED))
                                        world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                }
                            }

                        } else if (state.getBlock().is(Blocks.MYCELIUM)) {
                            BlockState matchingSlab = ARFOBlocks.MYCELIUM_SLAB.defaultBlockState();
                            // spreadable to top and double slabs which are waterlogged
                            if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                                if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                    if (!newState.getValue(WATERLOGGED))
                                        world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                } else {
                                    world.setBlock(newPos, matchingSlab.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    private static boolean canBeGrass(BlockState state, IWorldReader worldView, BlockPos pos) {
        BlockPos blockPos = pos.above();
        BlockState blockState = worldView.getBlockState(blockPos);
        if (blockState.is(Blocks.SNOW) && (Integer) blockState.getValue(SnowBlock.LAYERS) >= 1) {
            return false;
        } else if (blockState.getFluidState().getAmount() == 8) {
            return false;
        } else {
            int i = LightEngine.getLightBlockInto(worldView, state, pos, blockState, blockPos, Direction.UP, blockState.getLightBlock(worldView, blockPos));
            return i < worldView.getMaxLightLevel();
        }
    }

    private static boolean canPropagate(BlockState state, IWorldReader worldView, BlockPos pos) {
        BlockPos blockPos = pos.above();
        return canBeGrass(state, worldView, pos) && !worldView.getFluidState(blockPos).is(FluidTags.WATER);
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        PlantType type = plantable.getPlantType(world, pos.relative(facing));

        if (plantable instanceof BushBlock)
            return true;

        if (PlantType.CAVE.equals(type)) {
            return state.isFaceSturdy(world, pos, Direction.UP);
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
        return false;
    }


    static {
        TYPE = BlockStateProperties.SLAB_TYPE;
        HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
        SNOWY = BlockStateProperties.SNOWY;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }

}
