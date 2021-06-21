package com.finallion.arfo.compat.BOP.fluids;

import com.finallion.arfo.common.fluids.ARFOWater;
import com.finallion.arfo.compat.BOP.BOPBlocks;
import com.finallion.arfo.compat.BOP.BOPFluids;
import com.finallion.arfo.compat.BOP.BOPItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;


public abstract class BopRainforestWater extends ARFOWater {

    public Fluid getFlowing() {
        return BOPFluids.FLOWING_BOP_RAINFOREST_WATER;
    }

    public Fluid getSource() {
        return BOPFluids.STILL_BOP_RAINFOREST_WATER;
    }

    public Item getBucket() {
        return BOPItems.BOP_RAINFOREST_WATER_BUCKET;
    }

    public BlockState createLegacyBlock(FluidState p_204527_1_) {
        return BOPBlocks.BOP_RAINFOREST_WATER.defaultBlockState().setValue(FlowingFluidBlock.LEVEL, Integer.valueOf(getLegacyLevel(p_204527_1_)));
    }

    @Override
    protected FluidAttributes createAttributes() {
        return FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"))
                .translationKey("block.arfo.bop_rainforest_water")
                .color(0xff3FDF99)
                .overlay(new ResourceLocation("block/water_overlay"))
                .build(this);
    }


    public static class Flowing extends BopRainforestWater {


        protected void createFluidStateDefinition(StateContainer.Builder<Fluid, FluidState> p_207184_1_) {
            super.createFluidStateDefinition(p_207184_1_);
            p_207184_1_.add(LEVEL);
        }

        public int getAmount(FluidState p_207192_1_) {
            return p_207192_1_.getValue(LEVEL);
        }

        public boolean isSource(FluidState p_207193_1_) {
            return false;
        }
    }

    public static class Source extends BopRainforestWater {


        public int getAmount(FluidState p_207192_1_) {
            return 8;
        }

        public boolean isSource(FluidState p_207193_1_) {
            return true;
        }
    }
}
