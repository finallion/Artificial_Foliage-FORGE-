package com.finallion.arfo.common.blocks;

import com.finallion.arfo.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.item.BlockItemUseContext;
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
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ARFOGrass extends BushBlock implements IGrowable, IPlantable {
    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;
    public static final BooleanProperty SLAB_PLACEMENT = BlockStateProperties.OPEN;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    protected static final VoxelShape DOWN_SHAPE = Block.box(0.0D, -8.0D, 0.0D, 16.0D, 8.0D, 16.0D);
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    private static final Map<Block, Block> grassFeatures = new HashMap<>();

    public ARFOGrass() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS)
                .instabreak()
                .noCollission().noOcclusion()
                .sound(SoundType.GRASS));

        this.registerDefaultState(this.stateDefinition.any().setValue(SLAB_PLACEMENT, false));
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
        return block instanceof ARFOSpreadableBlock || block instanceof ARFOSoilBlock || block instanceof ARFOSpreadableSlab || block instanceof ARFOSlab || block instanceof ARFONyliumSlab || block.is(Blocks.GRASS_BLOCK) || block.is(Blocks.DIRT) || block.is(Blocks.COARSE_DIRT) || block.is(Blocks.PODZOL) || block.is(Blocks.FARMLAND);
    }

    @Override
    public void performBonemeal(ServerWorld world, Random p_225535_2_, BlockPos pos, BlockState state) {
        MapUtils.initGrassMap(grassFeatures);
        DoublePlantBlock tallFlowerBlock = (DoublePlantBlock)Blocks.TALL_GRASS;

        //TODO check if block is instance and get direct without for-loop
        for (Block block : grassFeatures.keySet()) {
            if (state.is(block)) {
                tallFlowerBlock = (DoublePlantBlock) grassFeatures.get(block);
            }
        }

        if (tallFlowerBlock.defaultBlockState().canSurvive(world, pos) && world.isEmptyBlock(pos.above())) {
            //tallFlowerBlock.placeAt(world, pos, 2);

            if (state.getValue(SLAB_PLACEMENT)) {
                world.setBlock(pos, tallFlowerBlock.defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER).setValue(SLAB_PLACEMENT, true), 3);
                world.setBlock(pos.above(), tallFlowerBlock.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(SLAB_PLACEMENT, true), 3);
            } else {
                world.setBlock(pos, tallFlowerBlock.defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER).setValue(SLAB_PLACEMENT, false), 3);
                world.setBlock(pos.above(), tallFlowerBlock.defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER).setValue(SLAB_PLACEMENT, false), 3);
            }
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
                return this.defaultBlockState().setValue(SLAB_PLACEMENT, true);
            }
        }

        return this.defaultBlockState();
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(SLAB_PLACEMENT);
    }

    public VoxelShape getShape(BlockState state, IBlockReader reader, BlockPos pos, ISelectionContext context) {
        if (state.getValue(SLAB_PLACEMENT)) {
            return DOWN_SHAPE;
        } else {
            return SHAPE;
        }
    }



}
