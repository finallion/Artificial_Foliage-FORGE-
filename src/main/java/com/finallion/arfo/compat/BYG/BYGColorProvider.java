package com.finallion.arfo.compat.BYG;

import com.finallion.arfo.client.textures.ColorProvider;
import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.compat.Traverse.TraverseItems;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGColorProvider {
    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();

        blockColors.register(ASPEN_FOREST_GRASS, BYGBlocks.BYG_ASPEN_FOREST_GRASS_BLOCK);
        blockColors.register(AUTUMNAL_VALLEY_GRASS, BYGBlocks.BYG_AUTUMNAL_VALLEY_GRASS_BLOCK);
        blockColors.register(ANCIENT_FOREST_GRASS, BYGBlocks.BYG_ANCIENT_FOREST_GRASS_BLOCK);
        blockColors.register(ARAUCARIA_SAVANNA, BYGBlocks.BYG_ARAUCARIA_SAVANNA_GRASS_BLOCK);
        blockColors.register(BASALT_BARRERA, BYGBlocks.BYG_BASALT_BARRERA_GRASS_BLOCK);
        blockColors.register(BAYOU_GRASS, BYGBlocks.BYG_BAYOU_GRASS_BLOCK);
        blockColors.register(BLUFF_STEEPS, BYGBlocks.BYG_BLUFF_STEEPS_GRASS_BLOCK);
        blockColors.register(CHERRY_BLOSSOM_FOREST, BYGBlocks.BYG_CHERRY_BLOSSOMS_FOREST_GRASS_BLOCK);
        blockColors.register(CONIFEROUS_FOREST_GRASS, BYGBlocks.BYG_CONIFEROUS_FOREST_GRASS_BLOCK);
        blockColors.register(CIKA_WOODS, BYGBlocks.BYG_CIKA_WOODS_GRASS_BLOCK);
        blockColors.register(COLD_SWAMPLANDS, BYGBlocks.BYG_COLD_SWAMPLANDS_GRASS_BLOCK);
        blockColors.register(CRAG_GARDENS, BYGBlocks.BYG_CRAG_GARDENS_GRASS_BLOCK);
        blockColors.register(CYPRESS_SWAMPLAND, BYGBlocks.BYG_CYPRESS_SWAMPLAND_GRASS_BLOCK);
        blockColors.register(CRIMSON_GARDENS, BYGBlocks.BYG_CRIMSON_GARDENS_GRASS_BLOCK);
        blockColors.register(DECIDUOUS_FOREST, BYGBlocks.BYG_DECIDUOUS_FOREST_GRASS_BLOCK);
        blockColors.register(ENCHANTED_FOREST_GRASS, BYGBlocks.BYG_ENCHANTED_FOREST_GRASS_BLOCK);
        blockColors.register(FRESH_WATER_LAKE, BYGBlocks.BYG_FRESH_WATER_LAKE_GRASS_BLOCK);
        blockColors.register(GLOWSTONE_GARDENS, BYGBlocks.BYG_GLOWSTONE_GARDENS_GRASS_BLOCK);
        blockColors.register(GROVE, BYGBlocks.BYG_GROVE_GRASS_BLOCK);
        blockColors.register(GRASS_LAND_PLATEAU, BYGBlocks.BYG_GRASS_LAND_PLATEAU_GRASS_BLOCK);
        blockColors.register(GREAT_LAKES_GRASS, BYGBlocks.BYG_GREAT_LAKES_GRASS_BLOCK);
        blockColors.register(GUIANA_SHIELD_GRASS, BYGBlocks.BYG_GUIANA_SHIELD_GRASS_BLOCK);
        blockColors.register(JACARANDA_FOREST_GRASS, BYGBlocks.BYG_JACARANDA_FOREST_GRASS_BLOCK);
        blockColors.register(LUSH_TUNDRA, BYGBlocks.BYG_LUSH_TUNDRA_GRASS_BLOCK);
        blockColors.register(ORCHARD, BYGBlocks.BYG_ORCHARD_GRASS_BLOCK);
        blockColors.register(PRAIRIE, BYGBlocks.BYG_PRAIRIE_GRASS_BLOCK);
        blockColors.register(POLLUTED_LAKE, BYGBlocks.BYG_POLLUTED_LAKE_GRASS_BLOCK);
        blockColors.register(RED_OAK_FOREST, BYGBlocks.BYG_RED_OAK_FOREST_GRASS_BLOCK);
        blockColors.register(REDWOOD_TROPICS, BYGBlocks.BYG_REDWOOD_TROPICS_GRASS_BLOCK);
        blockColors.register(RED_ROCK_MOUNTAINS, BYGBlocks.BYG_RED_ROCK_MOUNTAINS_GRASS_BLOCK);
        blockColors.register(ROSE_FIELDS, BYGBlocks.BYG_ROSE_FIELDS_GRASS_BLOCK);
        blockColors.register(SHRUB_LANDS_GRASS, BYGBlocks.BYG_SHRUB_LANDS_GRASS_BLOCK);
        blockColors.register(SEASONAL_DECIDUOUS_FOREST, BYGBlocks.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_BLOCK);
        blockColors.register(SYTHIAN_TORRIDS, BYGBlocks.BYG_SYTHIAN_TORRIDS_GRASS_BLOCK);
        blockColors.register(SKYRIS_HIGHLANDS_GRASS, BYGBlocks.BYG_SKYRIS_HIGHLANDS_GRASS_BLOCK);
        blockColors.register(SNOWY_DECIDUOUS_FOREST_GRASS, BYGBlocks.BYG_SNOWY_DECIDUOUS_FOREST_GRASS_BLOCK);
        blockColors.register(TROPICAL_RAIN_FOREST, BYGBlocks.BYG_TROPICAL_RAIN_FOREST_GRASS_BLOCK);
        blockColors.register(VOLCANO, BYGBlocks.BYG_VOLCANO_GRASS_BLOCK);
        blockColors.register(WAILING_GARTH, BYGBlocks.BYG_WAILING_GARTH_GRASS_BLOCK);
        blockColors.register(WOODLANDS, BYGBlocks.BYG_WOODLANDS_GRASS_BLOCK);
        blockColors.register(WEEPING_MIRE, BYGBlocks.BYG_WEEPING_MIRE_GRASS_BLOCK);
        blockColors.register(WITHERING_WOODS, BYGBlocks.BYG_WITHERING_WOODS_GRASS_BLOCK);
        blockColors.register(ZELKOVA_FOREST, BYGBlocks.BYG_ZELKOVA_FOREST_GRASS_BLOCK);


    }

    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final ItemColors itemColors = event.getItemColors();

        itemColors.register(ASPEN_FOREST_GRASS_ITEM, BYGItems.BYG_ASPEN_FOREST_GRASS_BLOCK);
        itemColors.register(AUTUMNAL_VALLEY_GRASS_ITEM, BYGItems.BYG_AUTUMNAL_VALLEY_GRASS_BLOCK);
        itemColors.register(ANCIENT_FOREST_GRASS_ITEM, BYGItems.BYG_ANCIENT_FOREST_GRASS_BLOCK);
        itemColors.register(ARAUCARIA_SAVANNA_ITEM, BYGItems.BYG_ARAUCARIA_SAVANNA_GRASS_BLOCK);
        itemColors.register(BASALT_BARRERA_ITEM, BYGItems.BYG_BASALT_BARRERA_GRASS_BLOCK);
        itemColors.register(BAYOU_GRASS_ITEM, BYGItems.BYG_BAYOU_GRASS_BLOCK);
        itemColors.register(BLUFF_STEEPS_ITEM, BYGItems.BYG_BLUFF_STEEPS_GRASS_BLOCK);
        itemColors.register(CHERRY_BLOSSOM_FOREST_ITEM, BYGItems.BYG_CHERRY_BLOSSOMS_FOREST_GRASS_BLOCK);
        itemColors.register(CONIFEROUS_FOREST_GRASS_ITEM, BYGItems.BYG_CONIFEROUS_FOREST_GRASS_BLOCK);
        itemColors.register(CIKA_WOODS_ITEM, BYGItems.BYG_CIKA_WOODS_GRASS_BLOCK);
        itemColors.register(COLD_SWAMPLANDS_ITEM, BYGItems.BYG_COLD_SWAMPLANDS_GRASS_BLOCK);
        itemColors.register(CRAG_GARDENS_ITEM, BYGItems.BYG_CRAG_GARDENS_GRASS_BLOCK);
        itemColors.register(CYPRESS_SWAMPLAND_ITEM, BYGItems.BYG_CYPRESS_SWAMPLAND_GRASS_BLOCK);
        itemColors.register(CRIMSON_GARDENS_ITEM, BYGItems.BYG_CRIMSON_GARDENS_GRASS_BLOCK);
        itemColors.register(DECIDUOUS_FOREST_ITEM, BYGItems.BYG_DECIDUOUS_FOREST_GRASS_BLOCK);
        itemColors.register(ENCHANTED_FOREST_GRASS_ITEM, BYGItems.BYG_ENCHANTED_FOREST_GRASS_BLOCK);
        itemColors.register(FRESH_WATER_LAKE_ITEM, BYGItems.BYG_FRESH_WATER_LAKE_GRASS_BLOCK);
        itemColors.register(GLOWSTONE_GARDENS_ITEM, BYGItems.BYG_GLOWSTONE_GARDENS_GRASS_BLOCK);
        itemColors.register(GROVE_ITEM, BYGItems.BYG_GROVE_GRASS_BLOCK);
        itemColors.register(GRASS_LAND_PLATEAU_ITEM, BYGItems.BYG_GRASS_LAND_PLATEAU_GRASS_BLOCK);
        itemColors.register(GREAT_LAKES_GRASS_ITEM, BYGItems.BYG_GREAT_LAKES_GRASS_BLOCK);
        itemColors.register(GUIANA_SHIELD_GRASS_ITEM, BYGItems.BYG_GUIANA_SHIELD_GRASS_BLOCK);
        itemColors.register(JACARANDA_FOREST_GRASS_ITEM, BYGItems.BYG_JACARANDA_FOREST_GRASS_BLOCK);
        itemColors.register(LUSH_TUNDRA_ITEM, BYGItems.BYG_LUSH_TUNDRA_GRASS_BLOCK);
        itemColors.register(ORCHARD_ITEM, BYGItems.BYG_ORCHARD_GRASS_BLOCK);
        itemColors.register(PRAIRIE_ITEM, BYGItems.BYG_PRAIRIE_GRASS_BLOCK);
        itemColors.register(POLLUTED_LAKE_ITEM, BYGItems.BYG_POLLUTED_LAKE_GRASS_BLOCK);
        itemColors.register(RED_OAK_FOREST_ITEM, BYGItems.BYG_RED_OAK_FOREST_GRASS_BLOCK);
        itemColors.register(REDWOOD_TROPICS_ITEM, BYGItems.BYG_REDWOOD_TROPICS_GRASS_BLOCK);
        itemColors.register(RED_ROCK_MOUNTAINS_ITEM, BYGItems.BYG_RED_ROCK_MOUNTAINS_GRASS_BLOCK);
        itemColors.register(ROSE_FIELDS_ITEM, BYGItems.BYG_ROSE_FIELDS_GRASS_BLOCK);
        itemColors.register(SHRUB_LANDS_GRASS_ITEM, BYGItems.BYG_SHRUB_LANDS_GRASS_BLOCK);
        itemColors.register(SEASONAL_DECIDUOUS_FOREST_ITEM, BYGItems.BYG_SEASONAL_DECIDUOUS_FOREST_GRASS_BLOCK);
        itemColors.register(SYTHIAN_TORRIDS_ITEM, BYGItems.BYG_SYTHIAN_TORRIDS_GRASS_BLOCK);
        itemColors.register(SKYRIS_HIGHLANDS_GRASS_ITEM, BYGItems.BYG_SKYRIS_HIGHLANDS_GRASS_BLOCK);
        itemColors.register(SNOWY_DECIDUOUS_FOREST_GRASS_ITEM, BYGItems.BYG_SNOWY_DECIDUOUS_FOREST_GRASS_BLOCK);
        itemColors.register(TROPICAL_RAIN_FOREST_ITEM, BYGItems.BYG_TROPICAL_RAIN_FOREST_GRASS_BLOCK);
        itemColors.register(VOLCANO_ITEM, BYGItems.BYG_VOLCANO_GRASS_BLOCK);
        itemColors.register(WAILING_GARTH_ITEM, BYGItems.BYG_WAILING_GARTH_GRASS_BLOCK);
        itemColors.register(WOODLANDS_ITEM, BYGItems.BYG_WOODLANDS_GRASS_BLOCK);
        itemColors.register(WEEPING_MIRE_ITEM, BYGItems.BYG_WEEPING_MIRE_GRASS_BLOCK);
        itemColors.register(WITHERING_WOODS_ITEM, BYGItems.BYG_WITHERING_WOODS_GRASS_BLOCK);
        itemColors.register(ZELKOVA_FOREST_ITEM, BYGItems.BYG_ZELKOVA_FOREST_GRASS_BLOCK);


    }


    // 0.8F, 0.8F
    // same es ebony_woods, maple taiga(0.25/0.8), meadow, weeping witch(0.25/0.8)
    private static final IBlockColor ANCIENT_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 5406551;
        }
    }; // leave color same as boreal forest and deciduous forest
    private static final IBlockColor ANCIENT_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 6589494;
        }
    };

    // 1.2F, 0.0F
    private static final IBlockColor ARAUCARIA_SAVANNA = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10860373;
        }
    };

    // 0.7F, 0.6F
    private static final IBlockColor ASPEN_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11909994;
        }
    };
    private static final IBlockColor ASPEN_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 5406551;
        }
    };

    // 0.35F, 0.8F
    // same as seasonal taiga
    private static final IBlockColor AUTUMNAL_VALLEY_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11513689;
        }
    }; // leaves same as seasonal forest and seasonal deciduous forest
    private static final IBlockColor AUTUMNAL_VALLEY_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 12435265;
        }
    };

    // 0.8F, 0.8F
    private static final IBlockColor BAYOU_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 7375928;
        }
    }; // bayou leaves same as cypress swampland
    private static final IBlockColor BAYOU_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 6337104;
        }
    };

    private static final IBlockColor BLUFF_STEEPS = ColorProvider.setDynamicBlockColorProvider(0.25F, 0.5F);


    // 0.7F, 0.8F
    private static final IBlockColor CHERRY_BLOSSOM_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10999916;
        }
    };

    // 0.35F, 0.5F
    private static final IBlockColor CIKA_WOODS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 13414235;
        }
    };

    // 0.25F, 0.8F
    private static final IBlockColor COLD_SWAMPLANDS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 7365696;
        }
    };

    // 0.25F, 0.8F
    // grass same as boreal forest
    // same as dover mountains, evergreen taiga, Snowy_Evergreen_Taiga, Black Forest, snowy coniferous forest
    private static final IBlockColor CONIFEROUS_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 5011004;
        }
    };
    private static final IBlockColor CONIFEROUS_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 2263842;
        }
    };


    private static final IBlockColor CRAG_GARDENS = ColorProvider.setDynamicBlockColorProvider(1.0F, 0.8F);

    // 0.25F, 0.8F
    // same color as Mangrove_Marshes and vibrant swamplands
    private static final IBlockColor CYPRESS_SWAMPLAND = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 6337104;
        }
    };

    // 0.7F, 0.5F
    private static final IBlockColor DECIDUOUS_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 8627537;
        }
    };

    // 0.8F, 0.8F
    // enchanted grove same, but hum is 0.75
    private static final IBlockColor ENCHANTED_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 8560845;
        }
    };
    private static final IBlockColor ENCHANTED_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11898572;
        }
    };

    private static final IBlockColor GRASS_LAND_PLATEAU = ColorProvider.setDynamicBlockColorProvider(0.7F, 0.4F);

    // 0.25F, 0.8F
    private static final IBlockColor GREAT_LAKES_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10662752;
        }
    };
    private static final IBlockColor GREAT_LAKES_LEAVES = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.25F);
    private static final IBlockColor GREAT_LAKES_ISLES_LEAVES = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.2F);


    // 0.75F, 0.8F
    private static final IBlockColor GROVE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11190111;
        }
    };

    // 0.95F, 0.9F
    private static final IBlockColor GUIANA_SHIELD_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 6208527;
        }
    };

    // 0.95F, 0.5F
    private static final IBlockColor JACARANDA_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10145074;
        }
    };
    private static final IBlockColor JACARANDA_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 14180771;
        }
    };

    // 0.35F, 0.4F
    private static final IBlockColor LUSH_TUNDRA = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10044989;
        }
    };


    // 0.8F, 0.8F
    private static final IBlockColor ORCHARD = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10210365;
        }
    };

    // 0.8F, 0.2F
    private static final IBlockColor PRAIRIE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10003745;
        }
    };

    private static final IBlockColor RED_OAK_FOREST = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.9F);


    // 1.2F, 0.1F
    // same as sierra valley, valle de luna
    private static final IBlockColor RED_ROCK_MOUNTAINS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10855786;
        }
    };

    // 0.9F, 0.9F
    private static final IBlockColor REDWOOD_TROPICS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 8896351;
        }
    };

    // 0.8F, 0.4F
    private static final IBlockColor ROSE_FIELDS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 8231780;
        }
    };


    // 0.8F, 0.5F
    // grass same as Seasonal_Birch_Forest
    private static final IBlockColor SEASONAL_DECIDUOUS_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11697214;
        }
    };


    // 2.0F, 0.4F
    private static final IBlockColor SHRUB_LANDS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 9874031;
        }
    };
    private static final IBlockColor SHRUB_LANDS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 7048739;
        }
    };


    // 0.25F, 0.8F
    private static final IBlockColor SKYRIS_HIGHLANDS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 6409356;
        }
    };
    private static final IBlockColor SKYRIS_HIGHLANDS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 7135854;
        }
    };


    // -0.5F, 0.8F
    private static final IBlockColor SNOWY_DECIDUOUS_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 12032353;
        }
    };
    private static final IBlockColor SNOWY_DECIDUOUS_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 12215394;
        }
    };

    // 0.95F/0.9F
    // same color as Tropical_Fungal_Rain_Forest but 0.95F/0.8F
    // same color as Stone Forest but 0.25F/0.8F
    private static final IBlockColor TROPICAL_RAIN_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10145074;
        }
    };

    // 1.7F, 0.8F
    private static final IBlockColor VOLCANO = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 6749952;
        }
    };


    // 0.8F, 0.8F
    private static final IBlockColor WOODLANDS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 8034667;
        }
    };

    // 0.25F, 0.8F
    private static final IBlockColor ZELKOVA_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 5416309;
        }
    };

    private static final IBlockColor BASALT_BARRERA = ColorProvider.setDynamicBlockColorProvider(0.85F, 0.75F);

    private static final IBlockColor FRESH_WATER_LAKE = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.8F);

    // 0.8F, 0.8F
    private static final IBlockColor POLLUTED_LAKE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 9202509;
        }
    };


    // NETHER
    private static final IBlockColor CRIMSON_GARDENS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11280416;
        }
    };

    private static final IBlockColor GLOWSTONE_GARDENS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 1356933;
        }
    };

    private static final IBlockColor SYTHIAN_TORRIDS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 11704602;
        }
    };

    private static final IBlockColor WAILING_GARTH = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 5849791;
        }
    };

    private static final IBlockColor WEEPING_MIRE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 10831985;
        }
    };

    private static final IBlockColor WITHERING_WOODS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 4210752;
        }
    };


    // WATER


    // STANDARD:            water: 4159204, fog: 329011
    // POLLUTED_LAKE:       water: 9202509, fog: 9202509 // same as cold swamplands
    // RAINBOW_BEACH:       water: 4566514, fog: 267827
    // VIBRANT_SWAMPLAND:   water: 6388580, fog: 2302743
    // CRAG GARNDS:         water: 8170451, fog: 6200521
    // TROPICAL_ISLAND:     water: 4566514, fog: 267827
    // GLOWSHROOM_BAYOU:    water: 4815438, fog: 6717479
    // DEAD_SEA:            water: 12632256, fog: 12632256
    // BULBIS_GARDENS:      water: 10040012
    // ETHEREAL_ISLANDS:    water: 3905655
    // IMPARIUS_GROVE:      water: 3722412
    // SHULKREN_FOREST:     water: 1415511 fog: 2005339



    private static final IItemColor ANCIENT_FOREST_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 5406551;
        }
    };
    private static final IItemColor ANCIENT_FOREST_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 6589494;
        }
    };

    private static final IItemColor ARAUCARIA_SAVANNA_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10860373;
        }
    };

    private static final IItemColor ASPEN_FOREST_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11909994;
        }
    };
    private static final IItemColor ASPEN_FOREST_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 5406551;
        }
    };

    private static final IItemColor AUTUMNAL_VALLEY_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11513689;
        }
    };
    private static final IItemColor AUTUMNAL_VALLEY_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 12435265;
        }
    };

    private static final IItemColor BAYOU_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 7375928;
        }
    };
    private static final IItemColor BAYOU_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 6337104;
        }
    };

    private static final IItemColor BLUFF_STEEPS_ITEM = (item, stack) -> GrassColors.get(0.25F, 0.5F);


    private static final IItemColor CHERRY_BLOSSOM_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10999916;
        }
    };

    private static final IItemColor CIKA_WOODS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 13414235;
        }
    };

    private static final IItemColor COLD_SWAMPLANDS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 7365696;
        }
    };

    private static final IItemColor CONIFEROUS_FOREST_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 5011004;
        }
    };
    private static final IItemColor CONIFEROUS_FOREST_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 2263842;
        }
    };

    private static final IItemColor CRAG_GARDENS_ITEM = (item, stack) -> GrassColors.get(1.0F, 0.8F);

    private static final IItemColor CYPRESS_SWAMPLAND_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 6337104;
        }
    };

    private static final IItemColor DECIDUOUS_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 8627537;
        }
    };

    private static final IItemColor ENCHANTED_FOREST_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 8560845;
        }
    };
    private static final IItemColor ENCHANTED_FOREST_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11898572;
        }
    };


    private static final IItemColor GRASS_LAND_PLATEAU_ITEM = (item, stack) -> GrassColors.get(0.7F, 0.4F);


    private static final IItemColor GREAT_LAKES_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10662752;
        }
    };
    private static final IItemColor GREAT_LAKES_LEAVES_ITEM = (item, stack) -> GrassColors.get(0.8F, 0.25F);
    private static final IItemColor GREAT_LAKES_ISLES_LEAVES_ITEM = (item, stack) -> GrassColors.get(0.8F, 0.2F);

    private static final IItemColor GROVE_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11190111;
        }
    };

    private static final IItemColor GUIANA_SHIELD_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 6208527;
        }
    };

    private static final IItemColor JACARANDA_FOREST_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10145074;
        }
    };
    private static final IItemColor JACARANDA_FOREST_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 14180771;
        }
    };

    private static final IItemColor LUSH_TUNDRA_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10044989;
        }
    };


    private static final IItemColor ORCHARD_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10210365;
        }
    };

    private static final IItemColor PRAIRIE_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10003745;
        }
    };

    private static final IItemColor RED_OAK_FOREST_ITEM = (item, stack) -> GrassColors.get(0.8F, 0.9F);

    private static final IItemColor RED_ROCK_MOUNTAINS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10855786;
        }
    };

    private static final IItemColor REDWOOD_TROPICS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 8896351;
        }
    };

    private static final IItemColor ROSE_FIELDS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 8231780;
        }
    };

    private static final IItemColor SEASONAL_DECIDUOUS_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11697214;
        }
    };

    private static final IItemColor SHRUB_LANDS_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 9874031;
        }
    };
    private static final IItemColor SHRUB_LANDS_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 7048739;
        }
    };

    private static final IItemColor SKYRIS_HIGHLANDS_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 6409356;
        }
    };
    private static final IItemColor SKYRIS_HIGHLANDS_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 7135854;
        }
    };

    private static final IItemColor SNOWY_DECIDUOUS_FOREST_GRASS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 12032353;
        }
    };
    private static final IItemColor SNOWY_DECIDUOUS_FOREST_LEAVES_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 12215394;
        }
    };

    private static final IItemColor TROPICAL_RAIN_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10145074;
        }
    };

    private static final IItemColor VOLCANO_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 6749952;
        }
    };

    private static final IItemColor WOODLANDS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 8034667;
        }
    };

    private static final IItemColor ZELKOVA_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 5416309;
        }
    };

    private static final IItemColor BASALT_BARRERA_ITEM = (item, stack) -> GrassColors.get(0.85F, 0.75F);
    private static final IItemColor FRESH_WATER_LAKE_ITEM = (item, stack) -> GrassColors.get(0.8F, 0.8F);

    private static final IItemColor POLLUTED_LAKE_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 9202509;
        }
    };

    private static final IItemColor CRIMSON_GARDENS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11280416;
        }
    };

    private static final IItemColor GLOWSTONE_GARDENS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 1356933;
        }
    };

    private static final IItemColor SYTHIAN_TORRIDS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 11704602;
        }
    };

    private static final IItemColor WAILING_GARTH_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 5849791;
        }
    };

    private static final IItemColor WEEPING_MIRE_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 10831985;
        }
    };

    private static final IItemColor WITHERING_WOODS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 4210752;
        }
    };
}
