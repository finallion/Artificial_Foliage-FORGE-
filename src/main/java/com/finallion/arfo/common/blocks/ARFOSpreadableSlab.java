package com.finallion.arfo.common.blocks;

import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.utils.BlockMapping;
import com.finallion.arfo.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
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
import java.util.*;

public class ARFOSpreadableSlab extends SlabBlock implements IGrowable {
    public static final EnumProperty<SlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;
    public static final BooleanProperty SLAB_PLACEMENT;
    public static final BooleanProperty SNOWY;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    public ARFOSpreadableSlab(Properties p_i48331_1_) {
        super(p_i48331_1_);
        this.registerDefaultState(this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false).setValue(SNOWY, false));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState state2, IWorld world, BlockPos pos, BlockPos pos2) {
        return direction != Direction.UP ? super.updateShape(state, direction, state2, world, pos, pos2) : state.setValue(SNOWY, Boolean.valueOf(state2.is(Blocks.SNOW_BLOCK) || state2.is(Blocks.SNOW)));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED, SNOWY);
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState state, boolean p_176473_4_) {
        if (state.getBlock().is(ARFOBlocks.MYCELIUM_SLAB) || state.getBlock().is(ARFOBlocks.GRASS_SLAB) || state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
            return false;
        }
        return p_176473_1_.getBlockState(p_176473_2_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(World world, Random random, BlockPos pos, BlockState state) {
        if (state.getBlock().is(ARFOBlocks.MYCELIUM_SLAB) || state.getBlock().is(ARFOBlocks.GRASS_SLAB) || state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
            return false;
        }

        /*
        if (state.getValue(TYPE) != SlabType.BOTTOM) {
            return true;
        }
         */
        return true;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.above();
        BlockState blockState = world.getBlockState(pos);
        BlockState failState = Blocks.AIR.defaultBlockState();
        MapUtils.initMap(grassFeatures);
        boolean large = false;
        List<Block> features = new ArrayList<>();


        // needs massive rework
        //TODO check if block is instance and get direct without for-loop
        for (Block b1 : BlockMapping.slabAndBlocks.keySet()) {
            if (BlockMapping.slabAndBlocks.get(b1).is(blockState.getBlock())) {
                features = grassFeatures.get(b1);
            }
        }


        label48:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!(world.getBlockState(blockPos2.below()).getBlock() instanceof ARFOSpreadableBlock) || world.getBlockState(blockPos2).isCollisionShapeFullBlock(world, blockPos2)) {
                    continue label48;
                }
            }
            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                ((ARFOSpreadableBlock)blockState.getBlock()).performBonemeal(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOSpreadableBlock && random.nextInt(10) == 0) {
                if (blockState2.getValue(TYPE) != SlabType.BOTTOM) ((ARFOSpreadableBlock)blockState.getBlock()).performBonemeal(world, random, blockPos2, blockState2);
            }


            if (blockState2.isAir()) {
                BlockState blockState4 = failState;


                int rand = random.nextInt(80);
                if (rand < 10) {
                    blockState4 = features.get(0).defaultBlockState();
                } else if (rand < 30) {
                    blockState4 = features.get(1).defaultBlockState();
                } else if (rand < 35) {
                    if (world.getBlockState(blockPos2.above()).isAir()) {
                        blockState4 = features.get(2).defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 40) {
                    if (world.getBlockState(blockPos2.above()).isAir()) {
                        blockState4 = features.get(3).defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 45) {
                    blockState4 = features.get(random.nextInt(features.size() / 2) + 4).defaultBlockState();
                }

                if (blockState4.canSurvive(world, blockPos2)) {

                    // if slab is bottom slab, check if placed block can have value "open"
                    // else do regular bone mealing
                    if (world.getBlockState(blockPos2.below()).getBlock() instanceof ARFOSpreadableSlab && world.getBlockState(blockPos2.below()).getValue(TYPE) == SlabType.BOTTOM) {
                        if (blockState4.getBlock() instanceof ARFOGrass || blockState4.getBlock() instanceof ARFOFernBlock || blockState4.getBlock() instanceof ARFOTallGrass || blockState4.getBlock() instanceof ARFOLargeFernBlock || blockState4.getBlock() instanceof ARFOLeavesCarpetBlock) {
                            world.setBlock(blockPos2, blockState4.setValue(SLAB_PLACEMENT, true), 3);
                        }
                    } else {
                        world.setBlock(blockPos2, blockState4, 3);
                    }


                    if (large) {
                        BlockState downState = world.getBlockState(blockPos2.below());
                        if (downState.getBlock() instanceof ARFOSpreadableSlab && world.getBlockState(blockPos2.below()).getValue(TYPE) == SlabType.BOTTOM) {
                            world.setBlock(blockPos2.above(), blockState4.getBlock().defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(SLAB_PLACEMENT, true), 3);
                        } else {
                            world.setBlock(blockPos2.above(), blockState4.getBlock().defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER), 3);
                        }
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

    private static boolean canBeGrass(BlockState state, IWorldReader world, BlockPos pos) {
        BlockPos posUp = pos.above();
        BlockState stateUp = world.getBlockState(posUp);

        // stateUp.getMaterial().isSolid() needs reworks. Issues with not full blocks like fences.

        if (stateUp.getBlock() == Blocks.SNOW && (Integer) stateUp.getValue(SnowBlock.LAYERS) >= 1) {
            return false;
        } else if (state.getBlock() instanceof ARFOSpreadableSlab && (state.getValue(WATERLOGGED) && state.getValue(TYPE) != SlabType.TOP && world.getFluidState(posUp).is(FluidTags.WATER)) || stateUp.getFluidState().getAmount() == 8) {
            return false;
        } else if (state.getBlock() instanceof ARFOSpreadableSlab && !stateUp.getMaterial().isSolid() && state.getValue(TYPE) == SlabType.TOP) {
            return true;
        } else {
            if (stateUp.getBlock() instanceof ARFOLeavesCarpetBlock || stateUp.getBlock() instanceof LeavesBlock || stateUp.getBlock() instanceof FenceGateBlock || stateUp.getBlock() instanceof FenceBlock ) {
                return true;
            }
            // dont know why non opaque leaves kill the grass
            int i = LightEngine.getLightBlockInto(world, state, pos, stateUp, posUp, Direction.UP, stateUp.getLightBlock(world, posUp));
            return i < world.getMaxLightLevel();
        }
    }

    private static boolean canPropagate(BlockState state, IWorldReader world, BlockPos pos) {
        return canBeGrass(state, world, pos) && !world.getFluidState(pos.above()).is(FluidTags.WATER) && !(state.getBlock() instanceof ARFOSpreadableSlab && state.getValue(WATERLOGGED) && state.getValue(TYPE) == SlabType.BOTTOM);
    }

    public static void setToDirt(World world, BlockPos pos){
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();

        if (block instanceof ARFOSpreadableStoneSlab) {
            world.setBlock(pos, ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        } else if (block instanceof ARFOSpreadableNetherrackSlab) {
            world.setBlock(pos, ARFOBlocks.NETHERRACK_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        } else if (block.is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) {
            world.setBlock(pos, BYGBlocks.BYG_MEADOW_DIRT_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        } else if (block instanceof ARFOSpreadableGrassSlab) {
            world.setBlock(pos, ARFOBlocks.ARTIFICIAL_SOIL_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        } else {
            world.setBlock(pos, ARFOBlocks.DIRT_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, state.getValue(SlabBlock.TYPE)).setValue(SlabBlock.WATERLOGGED, state.getValue(SlabBlock.WATERLOGGED)), 3);
        }

    }

    public static void doTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canBeGrass(state, world, pos)) {
            for (int i = 0; i < 4; ++i) {
                BlockPos newPos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                BlockState newState = world.getBlockState(newPos);

                if (canPropagate(state, world, newPos)) {


                    if (newState.is(Blocks.DIRT)) { // vanilla grass slab/mycelium to dirt
                        if ((state.getBlock().is(ARFOBlocks.GRASS_SLAB) || state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB)) && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            world.setBlock(newPos, Blocks.GRASS_BLOCK.defaultBlockState(), 3);
                        } else if (state.getBlock().is(ARFOBlocks.MYCELIUM_SLAB)) {
                            world.setBlock(newPos, Blocks.MYCELIUM.defaultBlockState(), 3);
                        }

                    } else if (newState.is(ARFOBlocks.DIRT_SLAB)) { // grass slab/mycelium slab to dirt slab
                        if (state.getBlock().is(ARFOBlocks.GRASS_SLAB) && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED)) world.setBlock(newPos, ARFOBlocks.GRASS_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, ARFOBlocks.GRASS_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }
                        }

                        if (state.getBlock() == ARFOBlocks.MYCELIUM_SLAB && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED)) world.setBlock(newPos, ARFOBlocks.MYCELIUM_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, ARFOBlocks.MYCELIUM_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }
                        }

                    } else if (newState.is(BYGBlocks.BYG_MEADOW_DIRT_SLAB)) { // meadow grass slab to meadow dirt slab
                        if (state.getBlock().is(BYGBlocks.BYG_MEADOW_GRASS_SLAB) && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            if (newState.getValue(TYPE) == SlabType.BOTTOM) {
                                if (!newState.getValue(WATERLOGGED)) world.setBlock(newPos, BYGBlocks.BYG_MEADOW_GRASS_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            } else {
                                world.setBlock(newPos, BYGBlocks.BYG_MEADOW_GRASS_SLAB.defaultBlockState().setValue(SlabBlock.TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                            }
                        }
                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_SOIL)) { // arfo grass slab to arfo dirt
                        if (state.getBlock() instanceof ARFOSpreadableGrassSlab && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (BlockMapping.slabAndBlocks.get(b).defaultBlockState().getBlock() == state.getBlock()) {
                                    newState = b.defaultBlockState();
                                    break;
                                }
                            }
                            world.setBlock(newPos, newState, 3);
                        }
                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) { // arfo grass slab to arfo dirt slab
                        if (state.getBlock() instanceof ARFOSpreadableGrassSlab) {
                            world.setBlock(newPos, state.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                        }
                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_STONE_SOIL)) { // arfo stone slab to arfo stone soil
                        if (state.getBlock() instanceof ARFOSpreadableStoneSlab && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (BlockMapping.slabAndBlocks.get(b).defaultBlockState().getBlock() == state.getBlock()) {
                                    newState = b.defaultBlockState();
                                    break;
                                }
                            }
                            world.setBlock(newPos, newState, 3);
                        }

                    } else if (newState.is(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB)) { // arfo stone slab to arfo stone soil slab
                        if (state.getBlock() instanceof ARFOSpreadableStoneSlab) {
                            world.setBlock(newPos, state.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                        }
                    } else if (newState.is(Blocks.NETHERRACK)) { // arfo overgrown netherrack slab to netherrack
                        if (state.getBlock() instanceof ARFOSpreadableNetherrackSlab && !world.getBlockState(newPos.above()).getMaterial().isSolid()) {
                            for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                                if (BlockMapping.slabAndBlocks.get(b).defaultBlockState().getBlock() == state.getBlock()) {
                                    newState = b.defaultBlockState();
                                    break;
                                }
                            }
                            world.setBlock(newPos, newState, 3);
                        }


                    } else if (newState.is(ARFOBlocks.NETHERRACK_SLAB)) { // arfo overgrown netherrack slab to netherrack slab
                        if (state.getBlock() instanceof ARFOSpreadableNetherrackSlab) {
                            world.setBlock(newPos, state.setValue(TYPE, newState.getValue(SlabBlock.TYPE)).setValue(SNOWY, world.getBlockState(newPos.above()).is(Blocks.SNOW)).setValue(SlabBlock.WATERLOGGED, newState.getValue(SlabBlock.WATERLOGGED)), 3);
                        }
                    }
                }
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

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {

        if (state.getBlock() == ARFOBlocks.GRASS_SLAB || state.getBlock() == ARFOBlocks.MYCELIUM_SLAB) {
            if (toolType == ToolType.HOE && state.getValue(TYPE) == SlabType.DOUBLE) return Blocks.FARMLAND.defaultBlockState();
            else if (toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.DOUBLE) return ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState().setValue(TYPE, SlabType.DOUBLE);
            else if (toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.BOTTOM) return ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState();
            else return toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.TOP ? ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState().setValue(TYPE, SlabType.TOP) : null;
        }
        return null;
    }



    static {
        TYPE = BlockStateProperties.SLAB_TYPE;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        SNOWY = BlockStateProperties.SNOWY;
        SLAB_PLACEMENT = BlockStateProperties.OPEN;
    }
}
