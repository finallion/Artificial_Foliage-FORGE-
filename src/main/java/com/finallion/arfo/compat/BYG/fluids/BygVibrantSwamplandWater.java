package com.finallion.arfo.compat.BYG.fluids;

import com.finallion.arfo.common.fluids.ARFOWater;
import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.compat.BYG.BYGFluids;
import com.finallion.arfo.compat.BYG.BYGItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;


public abstract class BygVibrantSwamplandWater extends ARFOWater {

    public Fluid getFlowing() {
        return BYGFluids.FLOWING_BYG_VIBRANT_SWAMPLAND_WATER;
    }

    public Fluid getSource() {
        return BYGFluids.STILL_BYG_VIBRANT_SWAMPLAND_WATER;
    }

    public Item getBucket() {
        return BYGItems.BYG_VIBRANT_SWAMPLAND_WATER_BUCKET;
    }

    public BlockState createLegacyBlock(FluidState p_204527_1_) {
        return BYGBlocks.BYG_VIBRANT_SWAMPLAND_WATER.defaultBlockState().setValue(FlowingFluidBlock.LEVEL, Integer.valueOf(getLegacyLevel(p_204527_1_)));
    }

    @Override
    protected FluidAttributes createAttributes() {
        return FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"))
                .translationKey("block.arfo.byg_vibrant_swampland_water")
                .color(0xff617B64) //6388580
                .overlay(new ResourceLocation("block/water_overlay"))
                .build(this);
    }


    public static class Flowing extends BygVibrantSwamplandWater {


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

    public static class Source extends BygVibrantSwamplandWater {


        public int getAmount(FluidState p_207192_1_) {
            return 8;
        }

        public boolean isSource(FluidState p_207193_1_) {
            return true;
        }
    }
}
