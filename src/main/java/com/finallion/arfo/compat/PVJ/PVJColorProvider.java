package com.finallion.arfo.compat.PVJ;


import com.finallion.arfo.client.textures.ColorProvider;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PVJColorProvider {

    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
    }

    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final ItemColors itemColors = event.getItemColors();
    }



    // -0.4F, 0.3F
    private static final IBlockColor ALPINE_HEIGHTS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x00994d;
        }
    };

    // 0.7F, 0.8F
    private static final IBlockColor ASPEN_GROVE_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xF4D342;
        }
    };
    private static final IBlockColor ASPEN_GROVE_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB8E83E;
        }
    };

    // 0.4F, 0.8F
    private static final IBlockColor AUTUMNAL_CONIFEROUS_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x76b53f;
        }
    };


    // 1.2F, 0.0F
    private static final IBlockColor BAOBAB_FIELDS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x8aab32;
        }
    };
    private static final IBlockColor BAOBAB_FIELDS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xa6c918;
        }
    };


    // 0.5F, 0.55F
    private static final IBlockColor BLOSSOMING_FIELDS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xaeed5c;
        }
    };

    // temp = -0.4F : 0.23F
    // -0.4F, 0.8F; Boreal Plateau: -0.4F, 0.45F
    private static final IBlockColor BOREAL_FOREST = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x00994d;
        }
    };

    // 0.3F, 0.8F
    private static final IBlockColor CRIMSON_THICKET = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x25855a;
        }
    };


    private static final IBlockColor GRAVEL_SHORE = ColorProvider.setDynamicFoliageColorProvider(0.6F, 0.4F);


    // 0.8F, 0.9F
    // water: 0x009463; fog: 2302743
    private static final IBlockColor MANGROVE_MARSH_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x008a02;
        }
    };
    private static final IBlockColor MANGROVE_MARSH_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB8E83E;
        }
    };

    // 0.7F, 0.8F
    private static final IBlockColor OAK_WOODLANDS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xc3f569;
        }
    };


    // water: 4445678, fog: 270131
    private static final IBlockColor OVERGROWN_SPIRES = ColorProvider.setDynamicFoliageColorProvider(0.95F, 0.9F);

    // 0.7F, 0.8F
    private static final IBlockColor PINE_MEADOWS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xa7cc5c;
        }
    };

    // 0.6F, 0.8F
    // leaves same as Pine Meadows
    private static final IBlockColor PRAIRIE_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xe2fc6d;
        }
    };

    // temp: -0.4F : default
    // downfall: default
    private static final IBlockColor REDWOODS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x379332;
        }
    };
    private static final IBlockColor REDWOODS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x379C32;
        }
    };

    private static final IBlockColor VERDANT_SANDS = ColorProvider.setDynamicFoliageColorProvider(1.5F, 0.5F);


    // 0.8F, 0.9F
    // water: 6388580, fog: 2302743
    private static final IBlockColor WILLOW_WETLANDS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x5B9F27 ;
        }
    };
    private static final IBlockColor WILLOW_WETLANDS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x70D325;
        }
    };

}
