package com.finallion.arfo.common.blocks;



import com.finallion.arfo.init.ModBlocks;
import com.finallion.arfo.utils.BlockMapping;
import com.finallion.arfo.utils.GrassFeatures;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
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


public class ARFOGrassBlock extends GrassBlock {

    public static final EnumProperty<DoubleBlockHalf> HALF;
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty SNOWY;
    public static final BooleanProperty WATERLOGGED;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    public ARFOGrassBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.SHOVEL)
                .sound(SoundType.GRASS));
    }



    private static boolean canBeGrass(BlockState state, IWorldReader worldView, BlockPos pos) {
        BlockPos blockPos = pos.above();
        BlockState blockState = worldView.getBlockState(blockPos);
        if (blockState.is(Blocks.SNOW) && (Integer) blockState.getValue(SnowBlock.LAYERS) == 1) {
            return true;
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

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canBeGrass(state, world, pos)) {
            ARFOSlabBlock.setToDirt(world, pos);
        } else {
            doTick(state, world, pos, random);
        }
    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canBeGrass(state, world, pos)) {
            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);


                if (canPropagate(state, world, newPos) && state.getBlock() instanceof ARFOGrassBlock) {
                    if (newState.is(ModBlocks.ARTIFICIAL_SOIL)) {
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) world.setBlock(newPos, state, 3);
                    } else if (newState.is(ModBlocks.ARTIFICIAL_SOIL_SLAB)) {
                        BlockState matchingSlabState = newState;
                        for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                            if (b == state.getBlock()) matchingSlabState = BlockMapping.slabAndBlocks.get(b).defaultBlockState();
                        }

                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
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
        BlockState blockState = world.getBlockState(pos);
        BlockState failState = Blocks.AIR.defaultBlockState();
        initMap();
        boolean large = false;
        List<Block> features = new ArrayList<>();

        for (Block b2 : grassFeatures.keySet()) {
            if (blockState.getBlock().is(b2)) features = grassFeatures.get(b2);
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
                ((ARFOGrassBlock) blockState.getBlock()).growArtificialGrass(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOGrassBlockSlab && random.nextInt(10) == 0) {
                if (blockState2.getValue(TYPE) != SlabType.BOTTOM) {
                    ((ARFOGrassBlockSlab) blockState.getBlock()).growArtificialGrass(world, random, blockPos2, blockState2);
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

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {
        if (toolType == ToolType.HOE) return Blocks.FARMLAND.defaultBlockState();
        else return toolType == ToolType.SHOVEL ? Blocks.GRASS_PATH.defaultBlockState() : null;
    }



    private void initMap() {
        grassFeatures.put(ModBlocks.JUNGLE_GRASS_BLOCK, GrassFeatures.jungle);
        grassFeatures.put(ModBlocks.JUNGLE_EDGE_GRASS_BLOCK, GrassFeatures.jungle_edge);
        grassFeatures.put(ModBlocks.BADLANDS_GRASS_BLOCK, GrassFeatures.badlands);
        grassFeatures.put(ModBlocks.SAVANNA_GRASS_BLOCK, GrassFeatures.savanna);
        grassFeatures.put(ModBlocks.FOREST_GRASS_BLOCK, GrassFeatures.forest);
        grassFeatures.put(ModBlocks.BIRCH_FOREST_GRASS_BLOCK, GrassFeatures.birch_forest);
        grassFeatures.put(ModBlocks.DARK_FOREST_GRASS_BLOCK, GrassFeatures.dark_forest);
        grassFeatures.put(ModBlocks.PLAINS_GRASS_BLOCK, GrassFeatures.plains);
        grassFeatures.put(ModBlocks.SWAMP_GRASS_BLOCK, GrassFeatures.swamp);
        grassFeatures.put(ModBlocks.LUSH_SWAMP_GRASS_BLOCK, GrassFeatures.lush_swamp);
        grassFeatures.put(ModBlocks.MOUNTAINS_GRASS_BLOCK, GrassFeatures.mountains);
        grassFeatures.put(ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK, GrassFeatures.mushrooms_fields);
        grassFeatures.put(ModBlocks.TAIGA_GRASS_BLOCK, GrassFeatures.taiga);
        grassFeatures.put(ModBlocks.MEGA_TAIGA_GRASS_BLOCK, GrassFeatures.mega_taiga);
        grassFeatures.put(ModBlocks.SNOWY_GRASS_BLOCK, GrassFeatures.snowy_biomes);
        grassFeatures.put(ModBlocks.SNOWY_BEACH_GRASS_BLOCK, GrassFeatures.snowy_beach);
        grassFeatures.put(ModBlocks.WATERS_GRASS_BLOCK, GrassFeatures.waters);
    }


    static {
        TYPE = BlockStateProperties.SLAB_TYPE;
        HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
        SNOWY = BlockStateProperties.SNOWY;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
