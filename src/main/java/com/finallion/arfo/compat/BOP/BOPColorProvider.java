package com.finallion.arfo.compat.BOP;

import com.finallion.arfo.client.textures.ColorProvider;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BOPColorProvider {

    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
    }

    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final ItemColors itemColors = event.getItemColors();
    }



    private static final IBlockColor BOP_ALPS = ColorProvider.setDynamicBlockColorProvider(-0.25F, 0.3F);

    private static final IBlockColor BOP_BAMBOO_BLOSSOM_GROVE = ColorProvider.setDynamicBlockColorProvider(0.6F, 0.9F);

    // 0.95F, 0.9F
    // same as bayou mangrove, deep bayou
    private static final IBlockColor BOP_BAYOU_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x6FAA50;
        }
    };
    private static final IBlockColor BOP_BAYOU_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x8BDB67;
        }
    };

    // 0.3F, 0.3F
    private static final IBlockColor BOP_BURNT_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x514F46;
        }
    }; // leaves same as dead forest
    private static final IBlockColor BOP_BURNT_FOREST_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB7B763;
        }
    };

    // 0.6F, 0.9F
    private static final IBlockColor BOP_CHERRY_BLOSSOM_GROVE_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x85CE71;
        }
    };
    private static final IBlockColor BOP_CHERRY_BLOSSOM_GROVE_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x63BF66;
        }
    };


    private static final IBlockColor BOP_CONIFEROUS_FOREST = ColorProvider.setDynamicBlockColorProvider(0.45F, 0.5F);

    // 0.3F, 0.3F
    private static final IBlockColor BOP_DEAD_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xBAAD64;
        }
    };
    private static final IBlockColor BOP_DEAD_FOREST_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB7B763;
        }
    };


    // 0.8F, 0.5F
    private static final IBlockColor BOP_WOODLAND_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x85C047;
        }
    };
    private static final IBlockColor BOP_WOODLAND_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x68AF1A;
        }
    };

    // 0.85F, 0.05F
    // same as dryland
    private static final IBlockColor BOP_DRY_BONEYARD_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xE5DFA9;
        }
    };
    private static final IBlockColor BOP_DRY_BONEYARD_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xDAE0B3;
        }
    };

    // 0.9F, 0.9F
    private static final IBlockColor BOP_FUNGAL_FIELD_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x4AA2F9;
        }
    };
    private static final IBlockColor BOP_FUNGAL_FIELD_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x4ADCF9;
        }
    };


    private static final IBlockColor BOP_GRAVEL_BEACH = ColorProvider.setDynamicBlockColorProvider(0.6F, 0.5F);

    private static final IBlockColor BOP_GROVE = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.275F);

    private static final IBlockColor BOP_HIGHLAND = ColorProvider.setDynamicBlockColorProvider(0.6F, 0.6F);

    // 0.8F, 0.85F
    private static final IBlockColor BOP_JADE_CLIFFS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x7CA568;
        }
    };
    private static final IBlockColor BOP_JADE_CLIFFS_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x8BB76E;
        }
    };

    // 0.8F, 0.7F
    private static final IBlockColor BOP_LAVENDER_FIELD = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xA1C36D;
        }
    };

    // 0.9F, 0.5F
    // same as lush savanna
    private static final IBlockColor BOP_LUSH_DESERT_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xEFE182;
        }
    };
    private static final IBlockColor BOP_LUSH_DESERT_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xD3D156;
        }
    };

    private static final IBlockColor BOP_MARSH = ColorProvider.setDynamicBlockColorProvider(0.65F, 0.7F);

    // 0.4F, 0.7F
    private static final IBlockColor BOP_MEADOW = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x63B26D;
        }
    };

    // -0.25F, 0.6F
    private static final IBlockColor BOP_MUSKEG_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x94966E;
        }
    };
    private static final IBlockColor BOP_MUSKEG_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x8D9B6B;
        }
    };

    // 0.7F, 0.8F
    private static final IBlockColor BOP_MYSTIC_GROVE_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x69CFDB;
        }
    };
    private static final IBlockColor BOP_MYSTIC_GROVE_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x70E0B5;
        }
    };

    // 0.6F, 0.6F
    private static final IBlockColor BOP_OMINOUS_WOODS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x4C4A70;
        }
    };
    private static final IBlockColor BOP_OMINOUS_WOODS_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x6B487C;
        }
    };

    // 0.8F, 0.4F
    private static final IBlockColor BOP_ORCHARD_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xA9DB69;
        }
    };
    private static final IBlockColor BOP_ORCHARD_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xC9F75D;
        }
    };

    // 0.6F, 0.6F
    private static final IBlockColor BOP_ORIGIN_VALLEY_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x9AFF5F;
        }
    };
    private static final IBlockColor BOP_ORIGIN_VALLEY_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x3AFF00;
        }
    };



    // 0.8F, 0.3F
    private static final IBlockColor BOP_PRAIRIE_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xE4EA77;
        }
    };
    private static final IBlockColor BOP_PRAIRIE_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xC7E672;
        }
    };

    // 0.55F, 1.0F
    private static final IBlockColor BOP_RAINBOW_HILLS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x75CE8D;
        }
    }; // leaves call getFoliageColor

    // 1.2F, 2.0F
    private static final IBlockColor BOP_RAINFOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xA7E140;
        }
    };
    private static final IBlockColor BOP_RAINFOREST_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x88E140;
        }
    };

    // 0.8F, 0.6F
    private static final IBlockColor BOP_REDWOOD_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB5D55C;
        }
    };
    private static final IBlockColor BOP_REDWOOD_FOREST_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x8EBF42;
        }
    };

    private static final IBlockColor BOP_SCRUBLAND = ColorProvider.setDynamicBlockColorProvider(1.1F, 0.15F);

    // 0.4F, 0.8F
    private static final IBlockColor BOP_SEASONAL_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB5B952;
        }
    };
    private static final IBlockColor BOP_SEASONAL_FOREST_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xA3A627;
        }
    };

    private static final IBlockColor BOP_SHRUBLAND = ColorProvider.setDynamicBlockColorProvider(0.6F, 0.05F);

    // 0.75F, 0.2F
    private static final IBlockColor BOP_SILKGLADE_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x939F76;
        }
    };
    private static final IBlockColor BOP_SILKGLADE_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xDEE1C6;
        }
    };

    // same as snowy maple forest
    private static final IBlockColor BOP_SNOWY_CONIFEROUS_FOREST = ColorProvider.setDynamicBlockColorProvider(-0.25F, 0.5F);

    private static final IBlockColor BOP_TROPICS = ColorProvider.setDynamicBlockColorProvider(0.95F, 1.0F);

    // 0.2F, 0.5F
    private static final IBlockColor BOP_TUNDRA_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xC08359;
        }
    };
    private static final IBlockColor BOP_TUNDRA_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xC5975C;
        }
    };

    // 0.95F, 0.3F
    private static final IBlockColor BOP_VOLCANO_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x4A703B;
        }
    };
    private static final IBlockColor BOP_VOLCANO_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x547D42;
        }
    };

    // 2.0F, 0.0F
    private static final IBlockColor BOP_WASTELAND_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xAD9364;
        }
    };
    private static final IBlockColor BOP_WASTELAND_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xB5A76C;
        }
    };

    // 0.6F, 0.7F
    private static final IBlockColor BOP_WETLAND_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x5A935F;
        }
    };
    private static final IBlockColor BOP_WETLAND_FOLIAGE = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x4F9657;
        }
    };



}
