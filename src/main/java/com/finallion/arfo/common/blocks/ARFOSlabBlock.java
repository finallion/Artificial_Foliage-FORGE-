package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.utils.BlockMapping;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.Random;

public class ARFOSlabBlock extends SlabBlock {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;
    public static final BooleanProperty SNOWY;


    public ARFOSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false).setValue(SNOWY, false));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {

        if (state.getBlock() != ARFOBlocks.GRASS_PATH_SLAB) {
            if (toolType == ToolType.HOE && state.getValue(TYPE) == SlabType.DOUBLE) return Blocks.FARMLAND.defaultBlockState();
            else if (toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.DOUBLE) return Blocks.GRASS_PATH.defaultBlockState();
            else return toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.TOP ? ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState().setValue(TYPE, SlabType.TOP) : null;
        }
        return null;
    }



    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!canBeGrass(state, world, pos)) {
            setToDirt(world, pos);
        } else doTick(state, world, pos, random);
    }

    public static boolean canBeGrass(BlockState state, IWorldReader world, BlockPos pos) {
        BlockPos posUp = pos.above();
        BlockState stateUp = world.getBlockState(posUp);


        if (stateUp.getBlock() == Blocks.SNOW && (Integer) stateUp.getValue(SnowBlock.LAYERS) == 1) {
            return true;
        } else if (state.getBlock() instanceof ARFOSlabBlock && (state.getValue(WATERLOGGED) && state.getValue(TYPE) != SlabType.TOP && world.getFluidState(posUp).is(FluidTags.WATER)) || stateUp.getFluidState().getAmount() == 8) {
            return false;
        } else if (state.getBlock() instanceof ARFOSlabBlock && !stateUp.getMaterial().isSolid() && state.getValue(TYPE) == SlabType.TOP) {
            return true;
        } else {
            int i = LightEngine.getLightBlockInto(world, state, pos, stateUp, posUp, Direction.UP, stateUp.getLightBlock(world, posUp));

            return i < world.getMaxLightLevel();
        }
    }

    public static boolean canSpread(BlockState state, IWorldReader world, BlockPos pos) {
        return canBeGrass(state, world, pos) && !world.getFluidState(pos.above()).is(FluidTags.WATER) && !(state.getBlock() instanceof ARFOSlabBlock && state.getValue(WATERLOGGED) && state.getValue(TYPE) == SlabType.BOTTOM);
    }

    public static void setToDirt(World world, BlockPos pos){
        BlockState state = world.getBlockState(pos);

        if (state.getBlock().getClass() == ARFOSlabBlock.class) world.setBlock(pos, ARFOBlocks.DIRT_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        else if (state.getBlock() instanceof ARFOGrassBlockSlab) world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        else if (state.getBlock() instanceof ARFOGrassBlock || state.getBlock() instanceof ARFOGlowingGrassBlock) world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL.defaultBlockState(), 3);
        else {
            world.setBlock(pos, Blocks.DIRT.defaultBlockState(), 3);
        }
    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canBeGrass(state, world, pos)) {
            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);

                if (ARFOSlabBlock.canSpread(state, world, newPos)) {

                    if (state.getBlock().getClass() == ARFOGrassBlockSlab.class && newState.is(ARFOBlocks.ARTIFICIAL_SOIL)) {
                        for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                            if (BlockMapping.slabAndBlocks.get(b).defaultBlockState().getBlock() == state.getBlock()) {
                                newState = b.defaultBlockState();
                            }
                        }
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) world.setBlock(newPos, newState, 3);
                    } else if (state.getBlock() == ARFOBlocks.GRASS_SLAB && newState.is(Blocks.DIRT)) {
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) world.setBlock(newPos, Blocks.GRASS_BLOCK.defaultBlockState(), 3);
                    } else if (state.getBlock() == ARFOBlocks.MYCELIUM_SLAB && newState.is(Blocks.DIRT)) {
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) world.setBlock(newPos, Blocks.MYCELIUM.defaultBlockState(), 3);
                    } else if ((state.getBlock() instanceof ARFOGrassBlock || state.getBlock().getClass() == ARFOGrassBlockSlab.class) && newState.is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) {
                        BlockState matchingSlabState = newState;
                        for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                            if (BlockMapping.slabAndBlocks.get(b).defaultBlockState().getBlock() == state.getBlock())
                                matchingSlabState = BlockMapping.slabAndBlocks.get(b).defaultBlockState();
                        }

                        // spreadable to top and double slabs which are waterlogged
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED)) world.setBlock(newPos, matchingSlabState.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, matchingSlabState.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }

                        }

                    } else if ((state.getBlock() == Blocks.GRASS_BLOCK || state.getBlock() == ARFOBlocks.GRASS_SLAB) && newState.is(ARFOBlocks.DIRT_SLAB)) {
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED)) world.setBlock(newPos, ARFOBlocks.GRASS_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, ARFOBlocks.GRASS_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }

                        }


                    } else if ((state.getBlock() == Blocks.MYCELIUM || state.getBlock() == ARFOBlocks.MYCELIUM_SLAB) && newState.is(ARFOBlocks.DIRT_SLAB)) {
                        if (!world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED)) world.setBlock(newPos, ARFOBlocks.MYCELIUM_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, ARFOBlocks.MYCELIUM_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }

                        }
                    }
                }
            }
        }
    }




    // SnowyBlock method
    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, IWorld world, BlockPos pos, BlockPos posFrom) {
        return direction != Direction.UP ? super.updateShape(state, direction, newState, world, pos, posFrom) : (BlockState)state.setValue(SNOWY, newState.is(Blocks.SNOW_BLOCK) || newState.is(Blocks.SNOW));
    }


    // netherrack method
    public void grow(World world, Random random, BlockPos pos, BlockState state) {
        Iterator var7 = BlockPos.betweenClosed(pos.offset(-1, -1, -1), pos.offset(1, 1, 1)).iterator();
        boolean found = false;
        BlockState blockState = world.getBlockState(pos);
        BlockState changeState = world.getBlockState(pos);

        while(var7.hasNext()) {
            BlockPos blockPos = (BlockPos)var7.next();
            changeState = world.getBlockState(blockPos);
            if (changeState.getBlock() instanceof ARFOGrassBlockSlab) {
                found = true;
                break;
            }
        }
        if (!world.isClientSide() && found) {
            world.setBlock(pos, changeState.setValue(TYPE, blockState.getValue(SlabBlock.TYPE)), 3);
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




    static {
        TYPE = BlockStateProperties.SLAB_TYPE;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        SNOWY = BlockStateProperties.SNOWY;
    }
}
