package com.finallion.arfo.compat.Traverse;


import com.finallion.arfo.compat.Traverse.fluids.MiniJungleWater;
import com.finallion.arfo.compat.Traverse.fluids.TraverseLushSwampWater;
import com.finallion.arfo.init.ARFOFluids;
import net.minecraft.fluid.FlowingFluid;




public class TraverseFluids {

    public static void init() {

    }

    public static final FlowingFluid STILL_TRAVERSE_LUSH_SWAMP_WATER = ARFOFluids.createFluid(new TraverseLushSwampWater.Source(), "still_traverse_lush_swamp_water");
    public static final FlowingFluid FLOWING_TRAVERSE_LUSH_SWAMP_WATER = ARFOFluids.createFluid(new TraverseLushSwampWater.Flowing(), "flowing_traverse_lush_swamp_water");

    public static final FlowingFluid STILL_TRAVERSE_MINI_JUNGLE_WATER = ARFOFluids.createFluid(new MiniJungleWater.Source(), "still_traverse_mini_jungle_water");
    public static final FlowingFluid FLOWING_TRAVERSE_MINI_JUNGLE_WATER = ARFOFluids.createFluid(new MiniJungleWater.Flowing(), "flowing_traverse_mini_jungle_water");



}
