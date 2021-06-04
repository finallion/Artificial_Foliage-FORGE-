package com.finallion.arfo.common.blocks;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class ARFOSlab extends SlabBlock {

    public ARFOSlab(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, false));
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



}
