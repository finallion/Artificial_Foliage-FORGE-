package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import javax.annotation.Nullable;


public class ARFOTallGrass extends TallFlowerBlock implements IPlantable {
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty SLAB_PLACEMENT = BlockStateProperties.OPEN;

    protected static final VoxelShape DOWN_SHAPE = Block.box(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);


    public ARFOTallGrass() {
        super(AbstractBlock.Properties
                .copy(Blocks.TALL_GRASS)
                .instabreak()
                .noOcclusion()
                .noCollission()
                .sound(SoundType.GRASS));

        this.registerDefaultState(this.stateDefinition.any().setValue(SLAB_PLACEMENT, false).setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        BlockPos blockpos = pos.below();
        if (state.getValue(HALF) != DoubleBlockHalf.UPPER) {
            return this.mayPlaceOn(worldIn.getBlockState(blockpos), worldIn, blockpos);
        } else {
            BlockState blockstate = worldIn.getBlockState(pos.below());
            if (state.getBlock() != this) return super.canSurvive(state, worldIn, pos);
            return blockstate.is(this) && blockstate.getValue(HALF) == DoubleBlockHalf.LOWER;
        }
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        Block block = state.getBlock();
        return block instanceof ARFOSpreadableBlock || block instanceof ARFOSoilBlock || block instanceof ARFOSpreadableSlab || block instanceof ARFOSlab || block instanceof ARFONyliumSlab || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND);
    }





    public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity p_180633_4_, ItemStack p_180633_5_) {
        if (state.getValue(SLAB_PLACEMENT)) {
            world.setBlock(pos.above(), this.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(SLAB_PLACEMENT, true), 3);
        } else {
            world.setBlock(pos.above(), this.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(SLAB_PLACEMENT, false), 3);
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos pos = context.getClickedPos();
        BlockState target = context.getLevel().getBlockState(pos.below());

        // if plant gets placed on bottom slab, the boolean property "open" changes to true
        // this allows getShape to update the bounding box
        // the blockstate.json now needs to variants, one for open=true, one for open=false

        if (target.getBlock() instanceof ARFOSpreadableSlab || target.getBlock() instanceof ARFOSlab || target.getBlock() instanceof ARFONyliumSlab) {
            if (target.getValue(TYPE) == SlabType.BOTTOM) {
                this.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(SLAB_PLACEMENT, true);
                return this.defaultBlockState().setValue(SLAB_PLACEMENT, true);
            }
        }

        return super.getStateForPlacement(context);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(SLAB_PLACEMENT);
        super.createBlockStateDefinition(p_206840_1_);
    }


    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if (state.getValue(SLAB_PLACEMENT)) {
            return DOWN_SHAPE;
        } else {
            return SHAPE;
        }
    }
}
