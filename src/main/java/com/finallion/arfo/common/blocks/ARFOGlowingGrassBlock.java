package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.utils.BlockMapping;
import com.finallion.arfo.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
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
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.NetherVegetationFeature;
import net.minecraft.world.gen.feature.TwistingVineFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.Tags;

import java.util.*;


public class ARFOGlowingGrassBlock extends Block {
    public static final EnumProperty<DoubleBlockHalf> HALF;
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty SNOWY;
    public static final BooleanProperty WATERLOGGED;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    public ARFOGlowingGrassBlock() {
        super(AbstractBlock.Properties.copy(Blocks.GRASS_BLOCK).lightLevel(l -> 15));
    }

    private static boolean canBeGrass(BlockState state, IWorldReader worldView, BlockPos pos) {
        // dies only in water
        BlockPos blockPos = pos.above();
        BlockState blockState = worldView.getBlockState(blockPos);
        return blockState.getFluidState().getAmount() != 8;
    }

    private static boolean canPropagate(BlockState state, IWorldReader worldView, BlockPos pos) {
        BlockPos blockPos = pos.above();
        return canBeGrass(state, worldView, pos) && !worldView.getFluidState(blockPos).is(FluidTags.WATER);
    }


    @Override
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        if (!canBeGrass(state, world, pos)) {
            ARFOSlabBlock.setToDirt(world, pos);
        } else {
            doTick(state, world, pos, random);
        }
    }

    public static void doTick(BlockState state, World world, BlockPos pos, Random random) {
        if (canBeGrass(state, world, pos) && world.getLightEmission(pos.above()) >= 9) {
            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);
                // maps glowing block to grass block
                for (Block block : BlockMapping.glowingBlocks.keySet()) {
                    if (BlockMapping.glowingBlocks.get(block).is(state.getBlock())) {
                        state = block.defaultBlockState();
                    }
                }

                if (canPropagate(state, world, newPos) && state.getBlock() instanceof ARFOGrassBlock) {
                    if (newState.is(ARFOBlocks.ARTIFICIAL_SOIL)) {
                        world.setBlock(newPos, state, 3);
                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) {
                        BlockState matchingSlabState = newState;
                        for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                            if (b == state.getBlock()) matchingSlabState = BlockMapping.slabAndBlocks.get(b).defaultBlockState();
                        }

                        if (!world.getBlockState(newPos.below()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED))
                                    world.setBlock(newPos, matchingSlabState.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, matchingSlabState.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }
                        }
                    }
                }
            }
        }
    }

    public void growArtificialGrass(World world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.above();
        BlockState failState = Blocks.AIR.defaultBlockState();
        MapUtils.initMap(grassFeatures);
        boolean large = false;
        List<Block> features = new ArrayList<>();

        // maps glowing block to grass block
        for (Block block : BlockMapping.glowingBlocks.keySet()) {
            if (BlockMapping.glowingBlocks.get(block).is(state.getBlock())) {
                state = block.defaultBlockState();
            }
        }

        for (Block b2 : grassFeatures.keySet()) {
            if (state.getBlock().is(b2)) {
                features = grassFeatures.get(b2);
            }
        }

        label48:
        for (int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!(world.getBlockState(blockPos2.below()).getBlock() instanceof ARFOGrassBlock) || world.getBlockState(blockPos2).isCollisionShapeFullBlock(world, blockPos2)) {
                    continue label48;
                }
            }
            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.getBlock() instanceof ARFOGrassBlock && random.nextInt(10) == 0) {
                ((ARFOGrassBlock) state.getBlock()).growArtificialGrass(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOGrassBlockSlab && random.nextInt(10) == 0) {
                if (blockState2.getValue(TYPE) != SlabType.BOTTOM) {
                    ((ARFOGrassBlockSlab) state.getBlock()).growArtificialGrass(world, random, blockPos2, blockState2);
                }
            }


            if (blockState2.isAir()) {
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

                if (blockState4.canSurvive(world, blockPos2) && world.getBlockState(blockPos2).isAir()) {
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


    public void growNetherGrass(ServerWorld p_225535_1_, Random p_225535_2_, BlockPos p_225535_3_, BlockState p_225535_4_) {
        BlockState blockstate = p_225535_1_.getBlockState(p_225535_3_);
        BlockPos blockpos = p_225535_3_.above();
        if (blockstate.is(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
            System.out.println("CRIMSON");
            NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.CRIMSON_FOREST_CONFIG, 3, 1);
        } else if (blockstate.is(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
            NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.WARPED_FOREST_CONFIG, 3, 1);
            NetherVegetationFeature.place(p_225535_1_, p_225535_2_, blockpos, Features.Configs.NETHER_SPROUTS_CONFIG, 3, 1);
            if (p_225535_2_.nextInt(8) == 0) {
                TwistingVineFeature.place(p_225535_1_, p_225535_2_, blockpos, 3, 1, 2);
            }
        }

    }

    static {
        TYPE = BlockStateProperties.SLAB_TYPE;
        HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
        SNOWY = BlockStateProperties.SNOWY;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }

}
