package com.finallion.arfo.compat.Traverse;


import com.finallion.arfo.client.textures.ColorProvider;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
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
public class TraverseColorProvider {

    private static final IBlockColor ARID_HIGHLANDS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xBACD78;
        }
    };


    private static final IBlockColor ARID_HIGHLANDS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x80A02E;
        }
    };

    private static final IBlockColor AUTUMNAL_WOODS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_x) {
            return 0xD6C23D;
        }
    };

    private static final IBlockColor AUTUMNAL_WOODS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0xD2D31F;
        }
    };

    private static final IBlockColor CLIFFS = ColorProvider.setDynamicBlockColorProvider(0.3F, 0.4F);
    private static final IBlockColor SNOWY_CLIFFS = ColorProvider.setDynamicBlockColorProvider(0.22F, 0.4F);

    private static final IBlockColor CONIFEROUS_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x338235;
        }
    };

    private static final IBlockColor CONIFEROUS_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x338235;
        }
    };

    private static final IBlockColor SNOWY_CONIFEROUS_FOREST_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x338251;
        }
    };

    private static final IBlockColor SNOWY_CONIFEROUS_FOREST_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x338251;
        }
    };

    private static final IBlockColor TRAVERSE_LUSH_SWAMP_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x7FE03E;
        }
    };

    private static final IBlockColor TRAVERSE_LUSH_SWAMP_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x58EA33;
        }
    };

    private static final IBlockColor MEADOW_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x65CC53;
        }
    };

    private static final IBlockColor MEADOW_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x5DD64A;
        }
    };

    private static final IBlockColor PLAINS_PLATEAU = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.2F);

    private static final IBlockColor ROLLING_HILLS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x7FE03E;
        }
    };

    private static final IBlockColor ROLLING_HILLS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x58EA33;
        }
    };

    private static final IBlockColor WOODED_ISLAND = ColorProvider.setDynamicBlockColorProvider(0.8F, 0.8F);

    private static final IBlockColor WOODLANDS_GRASS = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x99A955;
        }
    };


    private static final IBlockColor WOODLANDS_LEAVES = new IBlockColor() {
        @Override
        public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader p_getColor_2_, @Nullable BlockPos p_getColor_3_, int p_getColor_4_) {
            return 0x849E4A;
        }
    };


    // item color provider
    public static final IItemColor ARID_HIGHLANDS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack p_getColor_1_, int p_getColor_2_) {
            return 0xBACD78;
        }
    };
    public static final IItemColor AUTUMNAL_WOODS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0xD6C23D;
        }
    };
    public static final IItemColor CLIFFS_ITEM = (item, layer) -> GrassColors.get(0.3, 0.4);
    public static final IItemColor SNOWY_CLIFFS_ITEM = (item, layer) -> GrassColors.get(0.22, 0.4);
    public static final IItemColor CONIFEROUS_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x338235;
        }
    };
    public static final IItemColor SNOWY_CONIFEROUS_FOREST_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x338251;
        }
    };
    public static final IItemColor TRAVERSE_LUSH_SWAMP_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x7FE03E;
        }
    };
    public static final IItemColor MEADOW_ITEM = (item, layer) -> GrassColors.get(0.8, 0.7);
    public static final IItemColor ROLLING_HILLS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x7FE03E;
        }
    };
    public static final IItemColor PLAINS_PLATEAU_ITEM = (item, layer) -> GrassColors.get(0.8, 0.2);
    public static final IItemColor WOODED_ISLAND_ITEM = (item, layer) -> GrassColors.get(0.8, 0.8);
    public static final IItemColor WOODLANDS_ITEM = new IItemColor() {
        @Override
        public int getColor(ItemStack stack, int tintIndex) {
            return 0x99A955;
        }
    };

    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();

        blockColors.register(ARID_HIGHLANDS_GRASS, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseBlocks.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_FERN, TraverseBlocks.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_SUGAR_CANE, TraverseBlocks.POTTED_ARID_HIGHLANDS_FERN);
        blockColors.register(ARID_HIGHLANDS_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ARID_HIGHLANDS_VINE);

        blockColors.register(AUTUMNAL_WOODS_GRASS, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseBlocks.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseBlocks.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_SUGAR_CANE, TraverseBlocks.POTTED_AUTUMNAL_WOODS_FERN);
        blockColors.register(AUTUMNAL_WOODS_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_AUTUMNAL_WOODS_VINE);

        blockColors.register(CLIFFS, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_CLIFFS_GRASS_SLAB, TraverseBlocks.TRAVERSE_CLIFFS_GRASS, TraverseBlocks.TALL_TRAVERSE_CLIFFS_GRASS, TraverseBlocks.TRAVERSE_CLIFFS_FERN, TraverseBlocks.LARGE_TRAVERSE_CLIFFS_FERN, TraverseBlocks.TRAVERSE_CLIFFS_SUGAR_CANE, TraverseBlocks.POTTED_CLIFFS_FERN);
        blockColors.register(CLIFFS, TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CLIFFS_VINE);

        blockColors.register(SNOWY_CLIFFS, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseBlocks.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_FERN, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_SUGAR_CANE, TraverseBlocks.POTTED_SNOWY_CLIFFS_FERN);
        blockColors.register(SNOWY_CLIFFS, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CLIFFS_VINE);

        blockColors.register(CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseBlocks.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_SUGAR_CANE, TraverseBlocks.POTTED_CONIFEROUS_FOREST_FERN);
        blockColors.register(CONIFEROUS_FOREST_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_CONIFEROUS_FOREST_VINE);

        blockColors.register(SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseBlocks.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_SUGAR_CANE, TraverseBlocks.POTTED_SNOWY_CONIFEROUS_FOREST_FERN);
        blockColors.register(SNOWY_CONIFEROUS_FOREST_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_SNOWY_CONIFEROUS_FOREST_VINE);

        blockColors.register(TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS_SLAB, TraverseBlocks.TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TALL_TRAVERSE_LUSH_SWAMP_GRASS, TraverseBlocks.TRAVERSE_LUSH_SWAMP_FERN, TraverseBlocks.LARGE_TRAVERSE_LUSH_SWAMP_FERN, TraverseBlocks.TRAVERSE_LUSH_SWAMP_SUGAR_CANE, TraverseBlocks.POTTED_TRAVERSE_LUSH_SWAMP_FERN);
        blockColors.register(TRAVERSE_LUSH_SWAMP_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_LUSH_SWAMP_VINE);

        blockColors.register(PLAINS_PLATEAU, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseBlocks.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_FERN, TraverseBlocks.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_SUGAR_CANE, TraverseBlocks.POTTED_PLAINS_PLATEAU_FERN);
        blockColors.register(PLAINS_PLATEAU, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_PLAINS_PLATEAU_VINE);

        blockColors.register(MEADOW_GRASS, TraverseBlocks.TRAVERSE_MEADOW_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK, TraverseBlocks.TRAVERSE_MEADOW_GRASS_SLAB, TraverseBlocks.TRAVERSE_MEADOW_GRASS, TraverseBlocks.TALL_TRAVERSE_MEADOW_GRASS, TraverseBlocks.TRAVERSE_MEADOW_FERN, TraverseBlocks.LARGE_TRAVERSE_MEADOW_FERN, TraverseBlocks.TRAVERSE_MEADOW_SUGAR_CANE, TraverseBlocks.POTTED_MEADOW_FERN);
        blockColors.register(MEADOW_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_MEADOW_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_MEADOW_VINE);

        blockColors.register(ROLLING_HILLS_GRASS, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS_SLAB, TraverseBlocks.TRAVERSE_ROLLING_HILLS_GRASS, TraverseBlocks.TALL_TRAVERSE_ROLLING_HILLS_GRASS, TraverseBlocks.TRAVERSE_ROLLING_HILLS_FERN, TraverseBlocks.LARGE_TRAVERSE_ROLLING_HILLS_FERN, TraverseBlocks.TRAVERSE_ROLLING_HILLS_SUGAR_CANE, TraverseBlocks.POTTED_ROLLING_HILLS_FERN);
        blockColors.register(ROLLING_HILLS_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_ROLLING_HILLS_VINE);

        blockColors.register(WOODED_ISLAND, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS_SLAB, TraverseBlocks.TRAVERSE_WOODED_ISLAND_GRASS, TraverseBlocks.TALL_TRAVERSE_WOODED_ISLAND_GRASS, TraverseBlocks.TRAVERSE_WOODED_ISLAND_FERN, TraverseBlocks.LARGE_TRAVERSE_WOODED_ISLAND_FERN, TraverseBlocks.TRAVERSE_WOODED_ISLAND_SUGAR_CANE, TraverseBlocks.POTTED_WOODED_ISLAND_FERN);
        blockColors.register(WOODED_ISLAND, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODED_ISLAND_VINE);

        blockColors.register(WOODLANDS_GRASS, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseBlocks.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS_SLAB, TraverseBlocks.TRAVERSE_WOODLANDS_GRASS, TraverseBlocks.TALL_TRAVERSE_WOODLANDS_GRASS, TraverseBlocks.TRAVERSE_WOODLANDS_FERN, TraverseBlocks.LARGE_TRAVERSE_WOODLANDS_FERN, TraverseBlocks.TRAVERSE_WOODLANDS_SUGAR_CANE, TraverseBlocks.POTTED_WOODLANDS_FERN);
        blockColors.register(WOODLANDS_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES, TraverseBlocks.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET, TraverseBlocks.TRAVERSE_WOODLANDS_VINE);


    }

    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final ItemColors itemColors = event.getItemColors();

        itemColors.register(ARID_HIGHLANDS_ITEM, TraverseItems.TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_ARID_HIGHLANDS_GRASS_BLOCK, TraverseItems.TRAVERSE_ARID_HIGHLANDS_GRASS_SLAB, TraverseItems.TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseItems.TALL_TRAVERSE_ARID_HIGHLANDS_GRASS, TraverseItems.TRAVERSE_ARID_HIGHLANDS_FERN, TraverseItems.LARGE_TRAVERSE_ARID_HIGHLANDS_FERN, TraverseItems.TRAVERSE_ARID_HIGHLANDS_SUGAR_CANE, TraverseItems.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_ARID_HIGHLANDS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_ARID_HIGHLANDS_VINE);
        itemColors.register(AUTUMNAL_WOODS_ITEM, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_AUTUMNAL_WOODS_GRASS_BLOCK, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_GRASS_SLAB, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseItems.TALL_TRAVERSE_AUTUMNAL_WOODS_GRASS, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseItems.LARGE_TRAVERSE_AUTUMNAL_WOODS_FERN, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_SUGAR_CANE, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_AUTUMNAL_WOODS_VINE);
        itemColors.register(CLIFFS_ITEM, TraverseItems.TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_CLIFFS_GRASS_BLOCK, TraverseItems.TRAVERSE_CLIFFS_GRASS_SLAB, TraverseItems.TRAVERSE_CLIFFS_GRASS, TraverseItems.TALL_TRAVERSE_CLIFFS_GRASS, TraverseItems.TRAVERSE_CLIFFS_FERN, TraverseItems.LARGE_TRAVERSE_CLIFFS_FERN, TraverseItems.TRAVERSE_CLIFFS_SUGAR_CANE, TraverseItems.TRAVERSE_CLIFFS_OAK_LEAVES, TraverseItems.TRAVERSE_CLIFFS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_CLIFFS_ACACIA_LEAVES, TraverseItems.TRAVERSE_CLIFFS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_CLIFFS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_CLIFFS_VINE);
        itemColors.register(SNOWY_CLIFFS_ITEM, TraverseItems.TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_SNOWY_CLIFFS_GRASS_BLOCK, TraverseItems.TRAVERSE_SNOWY_CLIFFS_GRASS_SLAB, TraverseItems.TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseItems.TALL_TRAVERSE_SNOWY_CLIFFS_GRASS, TraverseItems.TRAVERSE_SNOWY_CLIFFS_FERN, TraverseItems.LARGE_TRAVERSE_SNOWY_CLIFFS_FERN, TraverseItems.TRAVERSE_SNOWY_CLIFFS_SUGAR_CANE, TraverseItems.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_SNOWY_CLIFFS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CLIFFS_VINE);
        itemColors.register(CONIFEROUS_FOREST_ITEM, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_GRASS_SLAB, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseItems.TALL_TRAVERSE_CONIFEROUS_FOREST_GRASS, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseItems.LARGE_TRAVERSE_CONIFEROUS_FOREST_FERN, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_SUGAR_CANE, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_CONIFEROUS_FOREST_VINE);
        itemColors.register(SNOWY_CONIFEROUS_FOREST_ITEM, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_BLOCK, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS_SLAB, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseItems.TALL_TRAVERSE_SNOWY_CONIFEROUS_FOREST_GRASS, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseItems.LARGE_TRAVERSE_SNOWY_CONIFEROUS_FOREST_FERN, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_SUGAR_CANE, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_SNOWY_CONIFEROUS_FOREST_VINE);
        itemColors.register(TRAVERSE_LUSH_SWAMP_ITEM, TraverseItems.TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_LUSH_SWAMP_GRASS_BLOCK, TraverseItems.TRAVERSE_LUSH_SWAMP_GRASS_SLAB, TraverseItems.TRAVERSE_LUSH_SWAMP_GRASS, TraverseItems.TALL_TRAVERSE_LUSH_SWAMP_GRASS, TraverseItems.TRAVERSE_LUSH_SWAMP_FERN, TraverseItems.LARGE_TRAVERSE_LUSH_SWAMP_FERN, TraverseItems.TRAVERSE_LUSH_SWAMP_SUGAR_CANE, TraverseItems.TRAVERSE_LUSH_SWAMP_OAK_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES, TraverseItems.TRAVERSE_LUSH_SWAMP_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_LUSH_SWAMP_VINE);
        itemColors.register(PLAINS_PLATEAU_ITEM, TraverseItems.TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_PLAINS_PLATEAU_GRASS_BLOCK, TraverseItems.TRAVERSE_PLAINS_PLATEAU_GRASS_SLAB, TraverseItems.TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseItems.TALL_TRAVERSE_PLAINS_PLATEAU_GRASS, TraverseItems.TRAVERSE_PLAINS_PLATEAU_FERN, TraverseItems.LARGE_TRAVERSE_PLAINS_PLATEAU_FERN, TraverseItems.TRAVERSE_PLAINS_PLATEAU_SUGAR_CANE, TraverseItems.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES, TraverseItems.TRAVERSE_PLAINS_PLATEAU_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_PLAINS_PLATEAU_VINE);
        itemColors.register(MEADOW_ITEM, TraverseItems.TRAVERSE_MEADOW_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_MEADOW_GRASS_BLOCK, TraverseItems.TRAVERSE_MEADOW_GRASS_SLAB, TraverseItems.TRAVERSE_MEADOW_GRASS, TraverseItems.TALL_TRAVERSE_MEADOW_GRASS, TraverseItems.TRAVERSE_MEADOW_FERN, TraverseItems.LARGE_TRAVERSE_MEADOW_FERN, TraverseItems.TRAVERSE_MEADOW_SUGAR_CANE, TraverseItems.TRAVERSE_MEADOW_OAK_LEAVES, TraverseItems.TRAVERSE_MEADOW_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_MEADOW_ACACIA_LEAVES, TraverseItems.TRAVERSE_MEADOW_JUNGLE_LEAVES, TraverseItems.TRAVERSE_MEADOW_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_MEADOW_VINE);
        itemColors.register(ROLLING_HILLS_ITEM, TraverseItems.TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_ROLLING_HILLS_GRASS_BLOCK, TraverseItems.TRAVERSE_ROLLING_HILLS_GRASS_SLAB, TraverseItems.TRAVERSE_ROLLING_HILLS_GRASS, TraverseItems.TALL_TRAVERSE_ROLLING_HILLS_GRASS, TraverseItems.TRAVERSE_ROLLING_HILLS_FERN, TraverseItems.LARGE_TRAVERSE_ROLLING_HILLS_FERN, TraverseItems.TRAVERSE_ROLLING_HILLS_SUGAR_CANE, TraverseItems.TRAVERSE_ROLLING_HILLS_OAK_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_ROLLING_HILLS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_ROLLING_HILLS_VINE);
        itemColors.register(WOODED_ISLAND_ITEM, TraverseItems.TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_WOODED_ISLAND_GRASS_BLOCK, TraverseItems.TRAVERSE_WOODED_ISLAND_GRASS_SLAB, TraverseItems.TRAVERSE_WOODED_ISLAND_GRASS, TraverseItems.TALL_TRAVERSE_WOODED_ISLAND_GRASS, TraverseItems.TRAVERSE_WOODED_ISLAND_FERN, TraverseItems.LARGE_TRAVERSE_WOODED_ISLAND_FERN, TraverseItems.TRAVERSE_WOODED_ISLAND_SUGAR_CANE, TraverseItems.TRAVERSE_WOODED_ISLAND_OAK_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES, TraverseItems.TRAVERSE_WOODED_ISLAND_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODED_ISLAND_VINE);
        itemColors.register(WOODLANDS_ITEM, TraverseItems.TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseItems.GLOWING_TRAVERSE_WOODLANDS_GRASS_BLOCK, TraverseItems.TRAVERSE_WOODLANDS_GRASS_SLAB, TraverseItems.TRAVERSE_WOODLANDS_GRASS, TraverseItems.TALL_TRAVERSE_WOODLANDS_GRASS, TraverseItems.TRAVERSE_WOODLANDS_FERN, TraverseItems.LARGE_TRAVERSE_WOODLANDS_FERN, TraverseItems.TRAVERSE_WOODLANDS_SUGAR_CANE, TraverseItems.TRAVERSE_WOODLANDS_OAK_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_ACACIA_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_JUNGLE_LEAVES, TraverseItems.TRAVERSE_WOODLANDS_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_DARK_OAK_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_ACACIA_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_JUNGLE_LEAVES_CARPET, TraverseItems.TRAVERSE_WOODLANDS_VINE);


    }


}