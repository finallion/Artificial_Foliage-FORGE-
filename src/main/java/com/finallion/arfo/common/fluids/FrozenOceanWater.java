package com.finallion.arfo.common.fluids;

import com.finallion.arfo.init.ModBlocks;
import com.finallion.arfo.init.ModFluids;
import com.finallion.arfo.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidAttributes;


public abstract class FrozenOceanWater extends ARFOWater {

    public Fluid getFlowing() {
        return ModFluids.FLOWING_FROZEN_OCEAN_WATER;
    }

    public Fluid getSource() {
        return ModFluids.STILL_FROZEN_OCEAN_WATER;
    }

    public Item getBucket() {
        return ModItems.FROZEN_OCEAN_WATER_BUCKET;
    }

    public BlockState createLegacyBlock(FluidState p_204527_1_) {
        return ModBlocks.FROZEN_OCEAN_WATER.defaultBlockState().setValue(FlowingFluidBlock.LEVEL, Integer.valueOf(getLegacyLevel(p_204527_1_)));
    }

    @Override
    protected FluidAttributes createAttributes() {
        return FluidAttributes.builder(new ResourceLocation("block/water_still"), new ResourceLocation("block/water_flow"))
                .translationKey("block.arfo.frozen_ocean_water")
                .color(3750089)
                .overlay(new ResourceLocation("block/water_overlay"))
                .build(this);
    }


    public static class Flowing extends FrozenOceanWater {
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

    public static class Source extends FrozenOceanWater {
        public int getAmount(FluidState p_207192_1_) {
            return 8;
        }

        public boolean isSource(FluidState p_207193_1_) {
            return true;
        }
    }
}
