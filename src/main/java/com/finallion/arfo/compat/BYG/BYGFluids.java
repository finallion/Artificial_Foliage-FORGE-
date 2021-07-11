package com.finallion.arfo.compat.BYG;

import com.finallion.arfo.compat.BYG.fluids.*;
import com.finallion.arfo.init.ARFOFluids;
import net.minecraft.fluid.FlowingFluid;

public class BYGFluids {

    // POLLUTED_LAKE:       water: 9202509, fog: 9202509 // same as cold swamplands
    // VIBRANT_SWAMPLAND:   water: 6388580, fog: 2302743
    // CRAG GARNDS:         water: 8170451, fog: 6200521
    // TROPICAL_ISLAND:     water: 4566514, fog: 267827
    // GLOWSHROOM_BAYOU:    water: 4815438, fog: 6717479
    // DEAD_SEA:            water: 12632256, fog: 12632256
    // BULBIS_GARDENS:      water: 10040012
    // ETHEREAL_ISLANDS:    water: 3905655
    // IMPARIUS_GROVE:      water: 3722412
    // SHULKREN_FOREST:     water: 1415511 fog: 2005339


    public static void init() {

    }

    public static final FlowingFluid STILL_BIOMESYOULLGO_POLLUTED_LAKE_WATER = ARFOFluids.createFluid(new BygPollutedLakeWater.Source(), "still_biomesyoullgo_polluted_lake_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_POLLUTED_LAKE_WATER = ARFOFluids.createFluid(new BygPollutedLakeWater.Flowing(), "flowing_biomesyoullgo_polluted_lake_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_VIBRANT_SWAMPLAND_WATER = ARFOFluids.createFluid(new BygVibrantSwamplandWater.Source(), "still_biomesyoullgo_vibrant_swampland_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_VIBRANT_SWAMPLAND_WATER = ARFOFluids.createFluid(new BygVibrantSwamplandWater.Flowing(), "flowing_biomesyoullgo_vibrant_swampland_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_CRAG_GARDENS_WATER = ARFOFluids.createFluid(new BygCragGardensWater.Source(), "still_biomesyoullgo_crag_gardens_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_CRAG_GARDENS_WATER = ARFOFluids.createFluid(new BygCragGardensWater.Flowing(), "flowing_biomesyoullgo_crag_gardens_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_TROPICAL_ISLAND_WATER = ARFOFluids.createFluid(new BygTropicalIslandWater.Source(), "still_biomesyoullgo_tropical_island_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_TROPICAL_ISLAND_WATER = ARFOFluids.createFluid(new BygTropicalIslandWater.Flowing(), "flowing_biomesyoullgo_tropical_island_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_GLOWSHROOM_BAYOU_WATER = ARFOFluids.createFluid(new BygGlowshroomBayouWater.Source(), "still_biomesyoullgo_glowshroom_bayou_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_GLOWSHROOM_BAYOU_WATER = ARFOFluids.createFluid(new BygGlowshroomBayouWater.Flowing(), "flowing_biomesyoullgo_glowshroom_bayou_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_DEAD_SEA_WATER = ARFOFluids.createFluid(new BygDeadSeaWater.Source(), "still_biomesyoullgo_dead_sea_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_DEAD_SEA_WATER = ARFOFluids.createFluid(new BygDeadSeaWater.Flowing(), "flowing_biomesyoullgo_dead_sea_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_BULBIS_GARDENS_WATER = ARFOFluids.createFluid(new BygBulbisGardensWater.Source(), "still_biomesyoullgo_bulbis_gardens_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_BULBIS_GARDENS_WATER = ARFOFluids.createFluid(new BygBulbisGardensWater.Flowing(), "flowing_biomesyoullgo_bulbis_gardens_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_ETHEREAL_ISLANDS_WATER = ARFOFluids.createFluid(new BygEtherealIslandsWater.Source(), "still_biomesyoullgo_ethereal_islands_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_ETHEREAL_ISLANDS_WATER = ARFOFluids.createFluid(new BygEtherealIslandsWater.Flowing(), "flowing_biomesyoullgo_ethereal_islands_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_IMPARIUS_GROVE_WATER = ARFOFluids.createFluid(new BygImpariusGroveWater.Source(), "still_biomesyoullgo_imparius_grove_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_IMPARIUS_GROVE_WATER = ARFOFluids.createFluid(new BygImpariusGroveWater.Flowing(), "flowing_biomesyoullgo_imparius_grove_water");

    public static final FlowingFluid STILL_BIOMESYOULLGO_SHULKREN_FOREST_WATER = ARFOFluids.createFluid(new BygShulkrenForestWater.Source(), "still_biomesyoullgo_shulkren_forest_water");
    public static final FlowingFluid FLOWING_BIOMESYOULLGO_SHULKREN_FOREST_WATER = ARFOFluids.createFluid(new BygShulkrenForestWater.Flowing(), "flowing_biomesyoullgo_shulkren_forest_water");



}
