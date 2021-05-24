package com.finallion.arfo.init;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.fluids.*;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ARFOFluids {

    public static List<FlowingFluid> fluidList = new ArrayList<>();

    public static final FlowingFluid STILL_COLD_OCEAN_WATER = createFluid(new ColdOceanWater.Source(), "still_cold_ocean_water");
    public static final FlowingFluid FLOWING_COLD_OCEAN_WATER = createFluid(new ColdOceanWater.Flowing(), "flowing_cold_ocean_water");

    public static final FlowingFluid STILL_FROZEN_OCEAN_WATER = createFluid(new FrozenOceanWater.Source(), "still_frozen_ocean_water");
    public static final FlowingFluid FLOWING_FROZEN_OCEAN_WATER = createFluid(new FrozenOceanWater.Flowing(), "flowing_frozen_ocean_water");

    public static final FlowingFluid STILL_LUKEWARM_OCEAN_WATER = createFluid(new LukewarmOceanWater.Source(), "still_lukewarm_ocean_water");
    public static final FlowingFluid FLOWING_LUKEWARM_OCEAN_WATER = createFluid(new LukewarmOceanWater.Flowing(), "flowing_lukewarm_ocean_water");

    public static final FlowingFluid STILL_WARM_OCEAN_WATER = createFluid(new WarmOceanWater.Source(), "still_warm_ocean_water");
    public static final FlowingFluid FLOWING_WARM_OCEAN_WATER = createFluid(new WarmOceanWater.Flowing(), "flowing_warm_ocean_water");

    public static final FlowingFluid STILL_SWAMP_WATER = createFluid(new SwampWater.Source(), "still_swamp_water");
    public static final FlowingFluid FLOWING_SWAMP_WATER = createFluid(new SwampWater.Flowing(), "flowing_swamp_water");

    public static final FlowingFluid STILL_OCEAN_WATER = createFluid(new OceanWater.Source(), "still_ocean_water");
    public static final FlowingFluid FLOWING_OCEAN_WATER = createFluid(new OceanWater.Flowing(), "flowing_ocean_water");


    public static FlowingFluid createFluid(FlowingFluid fluid, String id) {
        fluid.setRegistryName(new ResourceLocation(ArtificialFoliage.MODID, id));
        fluidList.add(fluid);
        return fluid;
    }

    public static void init() {

    }
}
