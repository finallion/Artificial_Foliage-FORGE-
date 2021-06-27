package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.server.ServerWorld;


import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ARFOCoralSapling extends BushBlock implements IGrowable, IWaterLoggable {
    public static final BooleanProperty WATERLOGGED;

    public ARFOCoralSapling() {
        super(AbstractBlock.Properties.of(Material.CORAL).sound(SoundType.GRASS).strength(0.0f).noCollission().randomTicks());

        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.valueOf(true)));
    }

    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(7) == 0) {
            this.performBonemeal(world, random, pos, state);
        }
    }


    public FluidState getFluidState(BlockState p_204507_1_) {
        return p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }


    protected boolean mayPlaceOn(BlockState p_200014_1_, IBlockReader p_200014_2_, BlockPos p_200014_3_) {
        return !p_200014_1_.getCollisionShape(p_200014_2_, p_200014_3_).getFaceShape(Direction.UP).isEmpty() || p_200014_1_.isFaceSturdy(p_200014_2_, p_200014_3_, Direction.UP);
    }


    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(WATERLOGGED);
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader p_176473_1_, BlockPos p_176473_2_, BlockState p_176473_3_, boolean p_176473_4_) {
        return true;
    }

    @Override
    public boolean isBonemealSuccess(World p_180670_1_, Random random, BlockPos p_180670_3_, BlockState p_180670_4_) {
        return (double)random.nextFloat() < 0.4D;
    }

    @Override
    public void performBonemeal(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        this.trySpawningCoralFeature(world, pos, state, random);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        FluidState fluidstate = p_196258_1_.getLevel().getFluidState(p_196258_1_.getClickedPos());
        boolean flag = fluidstate.getType() == Fluids.WATER;
        return super.getStateForPlacement(p_196258_1_).setValue(WATERLOGGED, Boolean.valueOf(flag));
    }

    public boolean trySpawningCoralFeature(ServerWorld serverWorld, BlockPos pos, BlockState state, Random random) {
        serverWorld.removeBlock(pos, false);
        ArrayList<Feature<NoFeatureConfig>> coralFeatures = new ArrayList<>(Arrays.asList(Feature.CORAL_CLAW, Feature.CORAL_TREE, Feature.CORAL_MUSHROOM));
        NoFeatureConfig config = NoFeatureConfig.INSTANCE;
        if (this == ARFOBlocks.ARTIFICIAL_CORAL_SAPLING) {
            Feature<NoFeatureConfig> feature = coralFeatures.get(random.nextInt(3));
            return feature.place(serverWorld, serverWorld.getChunkSource().getGenerator(), random, pos, config);
        }
        return false;
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
