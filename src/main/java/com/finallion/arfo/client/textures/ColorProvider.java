package com.finallion.arfo.client.textures;

import com.finallion.arfo.init.ModBlocks;
import com.finallion.arfo.init.ModFluids;
import com.finallion.arfo.init.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ColorProvider {

    // grass blocks
    private static IBlockColor setDynamicBlockColorProvider(double temp, double humidity) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? GrassColors.get(temp, humidity) : BiomeColors.getAverageGrassColor(lightReader, pos);
    }

    private static IBlockColor setStaticBlockColorProvider(double x, double y, int color, BiomeAmbience.GrassColorModifier modifier) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? modifier.modifyColor(x, y, color) : BiomeColors.getAverageGrassColor(lightReader, pos);
    }

    // leave blocks
    private static IBlockColor setDynamicFoliageColorProvider(double temp, double humidity) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? FoliageColors.get(temp, humidity) : BiomeColors.getAverageFoliageColor(lightReader, pos);
    }

    private static IBlockColor setStaticFoliageColorProvider(double x, double y, int color, BiomeAmbience.GrassColorModifier modifier) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? modifier.modifyColor(x, y, color) : BiomeColors.getAverageFoliageColor(lightReader, pos);
    }

    // items, swamp color to debug
    private static IItemColor setDynamicItemColorProvider(double temp, double humidity) {
        return (stack, index) -> index == 0 ? GrassColors.get(temp, humidity) : BiomeAmbience.GrassColorModifier.SWAMP.modifyColor(temp, humidity, 6975545);
    }

    private static IItemColor setStaticItemColorProvider(double x, double y, int color, BiomeAmbience.GrassColorModifier modifier) {
        return (stack, index) -> index == 0 ? modifier.modifyColor(x, y, color) : BiomeAmbience.GrassColorModifier.SWAMP.modifyColor(x, y, 6975545);
    }

    // dynamic grass block colors
    public static final IBlockColor JUNGLE_COLOR = setDynamicBlockColorProvider(0.95, 0.9);
    public static final IBlockColor SAVANNA_COLOR = setDynamicBlockColorProvider(1.0, 0.0);
    public static final IBlockColor JUNGLE_EDGE_COLOR = setDynamicBlockColorProvider(0.95, 0.8);
    public static final IBlockColor FOREST_COLOR = setDynamicBlockColorProvider(0.7, 0.8);
    public static final IBlockColor BIRCH_FOREST_COLOR = setDynamicBlockColorProvider(0.6, 0.6);
    public static final IBlockColor PLAINS_COLOR = setDynamicBlockColorProvider(0.8, 0.4);
    public static final IBlockColor WATERS_COLOR = setDynamicBlockColorProvider(0.5, 0.5);
    public static final IBlockColor MOUNTAINS_COLOR = setDynamicBlockColorProvider(0.2, 0.3);
    public static final IBlockColor MUSHROOM_FIELDS_COLOR = setDynamicBlockColorProvider(0.9, 1.0);
    public static final IBlockColor SNOWY_COLOR = setDynamicBlockColorProvider(0.0, 0.5);
    public static final IBlockColor MEGA_TAIGA_COLOR = setDynamicBlockColorProvider(0.3, 0.8);
    public static final IBlockColor TAIGA_COLOR = setDynamicBlockColorProvider(0.25, 0.8);
    public static final IBlockColor SNOWY_BEACH_COLOR = setDynamicBlockColorProvider(0.05, 0.3);

    // hardcoded grass block colors
    public static final IBlockColor SWAMP_COLOR = setStaticBlockColorProvider(0.5, 0.5,6975545, BiomeAmbience.GrassColorModifier.SWAMP);
    public static final IBlockColor LUSH_SWAMP_COLOR = setStaticBlockColorProvider(0.5, 0.5,5011004, BiomeAmbience.GrassColorModifier.NONE);
    public static final IBlockColor DARK_FOREST_COLOR = (block, world, pos, layer) -> world != null && pos != null ? BiomeAmbience.GrassColorModifier.DARK_FOREST.modifyColor(0.1, 0.1, GrassColors.get(0.7, 0.8)) : BiomeColors.getAverageGrassColor(world, pos);
    public static final IBlockColor BADLANDS_COLOR = setStaticBlockColorProvider(0.5, 0.5,9470285, BiomeAmbience.GrassColorModifier.NONE);

    // dynamic grass block colors
    public static final IBlockColor JUNGLE_LEAVE_COLOR = setDynamicFoliageColorProvider(0.95, 0.9);
    public static final IBlockColor SAVANNA_LEAVE_COLOR = setDynamicFoliageColorProvider(1.0, 0.0);
    public static final IBlockColor JUNGLE_EDGE_LEAVE_COLOR = setDynamicFoliageColorProvider(0.95, 0.8);
    public static final IBlockColor FOREST_LEAVE_COLOR = setDynamicFoliageColorProvider(0.7, 0.8);
    public static final IBlockColor BIRCH_FOREST_LEAVE_COLOR = setDynamicFoliageColorProvider(0.6, 0.6);
    public static final IBlockColor PLAINS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.8, 0.4);
    public static final IBlockColor WATERS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.5, 0.5);
    public static final IBlockColor MOUNTAINS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.2, 0.3);
    public static final IBlockColor MUSHROOM_FIELDS_LEAVE_COLOR = setDynamicFoliageColorProvider(0.9, 1.0);
    public static final IBlockColor SNOWY_LEAVE_COLOR = setDynamicFoliageColorProvider(0.0, 0.5);
    public static final IBlockColor MEGA_TAIGA_LEAVE_COLOR = setDynamicFoliageColorProvider(0.3, 0.8);
    public static final IBlockColor TAIGA_LEAVE_COLOR = setDynamicFoliageColorProvider(0.25, 0.8);
    public static final IBlockColor SNOWY_BEACH_LEAVE_COLOR = setDynamicFoliageColorProvider(0.05, 0.3);

    // hardcoded grass block colors
    public static final IBlockColor SWAMP_LEAVE_COLOR = setStaticFoliageColorProvider(0.5, 0.5,6975545, BiomeAmbience.GrassColorModifier.SWAMP);
    public static final IBlockColor LUSH_SWAMP_LEAVE_COLOR = setStaticFoliageColorProvider(0.5, 0.5,5011004, BiomeAmbience.GrassColorModifier.NONE);
    public static final IBlockColor DARK_FOREST_LEAVE_COLOR = (block, world, pos, layer) -> world != null && pos != null ? BiomeAmbience.GrassColorModifier.DARK_FOREST.modifyColor(0.1, 0.1, GrassColors.get(0.7, 0.8)) : BiomeColors.getAverageFoliageColor(world, pos);
    public static final IBlockColor BADLANDS_LEAVE_COLOR = setStaticFoliageColorProvider(0.5, 0.5,9470285, BiomeAmbience.GrassColorModifier.NONE);


    // dynamic item colors
    public static final IItemColor JUNGLE_ITEM_COLOR = setDynamicItemColorProvider(0.95, 0.9);
    public static final IItemColor SAVANNA_ITEM_COLOR = setDynamicItemColorProvider(1.0, 0.0);
    public static final IItemColor JUNGLE_EDGE_ITEM_COLOR = setDynamicItemColorProvider(0.95, 0.8);
    public static final IItemColor FOREST_ITEM_COLOR = setDynamicItemColorProvider(0.7, 0.8);
    public static final IItemColor BIRCH_FOREST_ITEM_COLOR = setDynamicItemColorProvider(0.6, 0.6);
    public static final IItemColor PLAINS_ITEM_COLOR = setDynamicItemColorProvider(0.8, 0.4);
    public static final IItemColor WATERS_ITEM_COLOR = setDynamicItemColorProvider(0.5, 0.5);
    public static final IItemColor MOUNTAINS_ITEM_COLOR = setDynamicItemColorProvider(0.2, 0.3);
    public static final IItemColor MUSHROOM_FIELDS_ITEM_COLOR = setDynamicItemColorProvider(0.9, 1.0);
    public static final IItemColor SNOWY_ITEM_COLOR = setDynamicItemColorProvider(0.0, 0.5);
    public static final IItemColor MEGA_TAIGA_ITEM_COLOR = setDynamicItemColorProvider(0.3, 0.8);
    public static final IItemColor TAIGA_ITEM_COLOR = setDynamicItemColorProvider(0.25, 0.8);
    public static final IItemColor SNOWY_BEACH_ITEM_COLOR = setDynamicItemColorProvider(0.05, 0.3);

    // hardcoded grass block colors
    public static final IItemColor SWAMP_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5,6975545, BiomeAmbience.GrassColorModifier.SWAMP);
    public static final IItemColor LUSH_SWAMP_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5,5011004, BiomeAmbience.GrassColorModifier.NONE);
    public static final IItemColor DARK_FOREST_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5, 6975545, BiomeAmbience.GrassColorModifier.DARK_FOREST);
    public static final IItemColor BADLANDS_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5,9470285, BiomeAmbience.GrassColorModifier.NONE);

    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        // blocks
        blockColors.register(MUSHROOM_FIELDS_COLOR,
                ModBlocks.MUSHROOM_FIELDS_GRASS_BLOCK,
                ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB,
                ModBlocks.MUSHROOM_FIELDS_GRASS,
                ModBlocks.TALL_MUSHROOM_FIELDS_GRASS,
                ModBlocks.MUSHROOM_FIELDS_FERN,
                ModBlocks.LARGE_MUSHROOM_FIELDS_FERN,
                ModBlocks.MUSHROOM_FIELDS_SUGAR_CANE,
                ModBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK,
                ModBlocks.POTTED_MUSHROOM_FIELDS_FERN
        );

        blockColors.register(MUSHROOM_FIELDS_LEAVE_COLOR,
                ModBlocks.MUSHROOM_FIELDS_VINE,
                ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES,
                ModBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET
        );

        blockColors.register(JUNGLE_COLOR,
                ModBlocks.JUNGLE_GRASS_BLOCK,
                ModBlocks.JUNGLE_GRASS_SLAB,
                ModBlocks.JUNGLE_GRASS,
                ModBlocks.TALL_JUNGLE_GRASS,
                ModBlocks.JUNGLE_FERN,
                ModBlocks.LARGE_JUNGLE_FERN,
                ModBlocks.JUNGLE_SUGAR_CANE,
                ModBlocks.GLOWING_JUNGLE_GRASS_BLOCK,
                ModBlocks.POTTED_JUNGLE_FERN
        );

        blockColors.register(JUNGLE_LEAVE_COLOR,
                ModBlocks.JUNGLE_VINE,
                ModBlocks.TROPICAL_ACACIA_LEAVES,
                ModBlocks.TROPICAL_ACACIA_LEAVES_CARPET,
                ModBlocks.TROPICAL_DARK_OAK_LEAVES,
                ModBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ModBlocks.TROPICAL_JUNGLE_LEAVES,
                ModBlocks.TROPICAL_JUNGLE_LEAVES_CARPET,
                ModBlocks.TROPICAL_OAK_LEAVES,
                ModBlocks.TROPICAL_OAK_LEAVES_CARPET
        );

        blockColors.register(JUNGLE_EDGE_COLOR,
                ModBlocks.JUNGLE_EDGE_GRASS_BLOCK,
                ModBlocks.JUNGLE_EDGE_GRASS_SLAB,
                ModBlocks.JUNGLE_EDGE_GRASS,
                ModBlocks.TALL_JUNGLE_EDGE_GRASS,
                ModBlocks.JUNGLE_EDGE_FERN,
                ModBlocks.LARGE_JUNGLE_EDGE_FERN,
                ModBlocks.JUNGLE_EDGE_SUGAR_CANE,
                ModBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK,
                ModBlocks.POTTED_JUNGLE_EDGE_FERN
        );

        blockColors.register(JUNGLE_EDGE_LEAVE_COLOR,
                ModBlocks.JUNGLE_EDGE_VINE,
                ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES,
                ModBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ModBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES,
                ModBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ModBlocks.TROPICAL_EDGE_OAK_LEAVES,
                ModBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET
        );

        blockColors.register(PLAINS_COLOR,
                ModBlocks.PLAINS_GRASS_BLOCK,
                ModBlocks.PLAINS_GRASS_SLAB,
                ModBlocks.PLAINS_GRASS,
                ModBlocks.TALL_PLAINS_GRASS,
                ModBlocks.PLAINS_FERN,
                ModBlocks.LARGE_PLAINS_FERN,
                ModBlocks.PLAINS_SUGAR_CANE,
                ModBlocks.GLOWING_PLAINS_GRASS_BLOCK,
                ModBlocks.POTTED_PLAINS_FERN
        );


        blockColors.register(PLAINS_LEAVE_COLOR,
                ModBlocks.PLAINS_VINE,
                ModBlocks.PLAINS_ACACIA_LEAVES,
                ModBlocks.PLAINS_ACACIA_LEAVES_CARPET,
                ModBlocks.PLAINS_DARK_OAK_LEAVES,
                ModBlocks.PLAINS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.PLAINS_JUNGLE_LEAVES,
                ModBlocks.PLAINS_JUNGLE_LEAVES_CARPET,
                ModBlocks.PLAINS_OAK_LEAVES,
                ModBlocks.PLAINS_OAK_LEAVES_CARPET
        );

        blockColors.register(FOREST_COLOR,
                ModBlocks.FOREST_GRASS_BLOCK,
                ModBlocks.FOREST_GRASS_SLAB,
                ModBlocks.FOREST_GRASS,
                ModBlocks.TALL_FOREST_GRASS,
                ModBlocks.FOREST_FERN,
                ModBlocks.LARGE_FOREST_FERN,
                ModBlocks.FOREST_SUGAR_CANE,
                ModBlocks.GLOWING_FOREST_GRASS_BLOCK,
                ModBlocks.POTTED_FOREST_FERN
        );

        blockColors.register(FOREST_LEAVE_COLOR,
                ModBlocks.FOREST_VINE,
                ModBlocks.FOREST_ACACIA_LEAVES,
                ModBlocks.FOREST_ACACIA_LEAVES_CARPET,
                ModBlocks.FOREST_DARK_OAK_LEAVES,
                ModBlocks.FOREST_DARK_OAK_LEAVES_CARPET,
                ModBlocks.FOREST_JUNGLE_LEAVES,
                ModBlocks.FOREST_JUNGLE_LEAVES_CARPET,
                ModBlocks.FOREST_OAK_LEAVES,
                ModBlocks.FOREST_OAK_LEAVES_CARPET
        );

        blockColors.register(BIRCH_FOREST_COLOR,
                ModBlocks.BIRCH_FOREST_GRASS_BLOCK,
                ModBlocks.BIRCH_FOREST_GRASS_SLAB,
                ModBlocks.BIRCH_FOREST_GRASS,
                ModBlocks.TALL_BIRCH_FOREST_GRASS,
                ModBlocks.BIRCH_FOREST_FERN,
                ModBlocks.LARGE_BIRCH_FOREST_FERN,
                ModBlocks.BIRCH_FOREST_SUGAR_CANE,
                ModBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK,
                ModBlocks.POTTED_BIRCH_FOREST_FERN
        );

        blockColors.register(BIRCH_FOREST_LEAVE_COLOR,
                ModBlocks.BIRCH_FOREST_VINE,
                ModBlocks.BIRCH_FOREST_ACACIA_LEAVES,
                ModBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES,
                ModBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES,
                ModBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ModBlocks.BIRCH_FOREST_OAK_LEAVES,
                ModBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET
        );

        blockColors.register(WATERS_COLOR,
                ModBlocks.WATERS_GRASS_BLOCK,
                ModBlocks.WATERS_GRASS_SLAB,
                ModBlocks.WATERS_GRASS,
                ModBlocks.TALL_WATERS_GRASS,
                ModBlocks.WATERS_FERN,
                ModBlocks.LARGE_WATERS_FERN,
                ModBlocks.WATERS_SUGAR_CANE,
                ModBlocks.GLOWING_WATERS_GRASS_BLOCK,
                ModBlocks.POTTED_WATERS_FERN
        );

        blockColors.register(WATERS_LEAVE_COLOR,
                ModBlocks.WATERS_VINE,
                ModBlocks.WATERS_ACACIA_LEAVES,
                ModBlocks.WATERS_ACACIA_LEAVES_CARPET,
                ModBlocks.WATERS_DARK_OAK_LEAVES,
                ModBlocks.WATERS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.WATERS_JUNGLE_LEAVES,
                ModBlocks.WATERS_JUNGLE_LEAVES_CARPET,
                ModBlocks.WATERS_OAK_LEAVES,
                ModBlocks.WATERS_OAK_LEAVES_CARPET
        );

        blockColors.register(MEGA_TAIGA_COLOR,
                ModBlocks.MEGA_TAIGA_GRASS_BLOCK,
                ModBlocks.MEGA_TAIGA_GRASS_SLAB,
                ModBlocks.MEGA_TAIGA_GRASS,
                ModBlocks.TALL_MEGA_TAIGA_GRASS,
                ModBlocks.MEGA_TAIGA_FERN,
                ModBlocks.LARGE_MEGA_TAIGA_FERN,
                ModBlocks.MEGA_TAIGA_SUGAR_CANE,
                ModBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK,
                ModBlocks.POTTED_MEGA_TAIGA_FERN
        );

        blockColors.register(MEGA_TAIGA_LEAVE_COLOR,
                ModBlocks.MEGA_TAIGA_VINE,
                ModBlocks.MEGA_TAIGA_ACACIA_LEAVES,
                ModBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES,
                ModBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES,
                ModBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ModBlocks.MEGA_TAIGA_OAK_LEAVES,
                ModBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET
        );


        blockColors.register(TAIGA_COLOR,
                ModBlocks.TAIGA_GRASS_BLOCK,
                ModBlocks.TAIGA_GRASS_SLAB,
                ModBlocks.TAIGA_GRASS,
                ModBlocks.TALL_TAIGA_GRASS,
                ModBlocks.TAIGA_FERN,
                ModBlocks.LARGE_TAIGA_FERN,
                ModBlocks.TAIGA_SUGAR_CANE,
                ModBlocks.GLOWING_TAIGA_GRASS_BLOCK,
                ModBlocks.POTTED_TAIGA_FERN
        );

        blockColors.register(TAIGA_LEAVE_COLOR,
                ModBlocks.TAIGA_VINE,
                ModBlocks.TAIGA_ACACIA_LEAVES,
                ModBlocks.TAIGA_ACACIA_LEAVES_CARPET,
                ModBlocks.TAIGA_DARK_OAK_LEAVES,
                ModBlocks.TAIGA_DARK_OAK_LEAVES_CARPET,
                ModBlocks.TAIGA_JUNGLE_LEAVES,
                ModBlocks.TAIGA_JUNGLE_LEAVES_CARPET,
                ModBlocks.TAIGA_OAK_LEAVES,
                ModBlocks.TAIGA_OAK_LEAVES_CARPET
        );

        blockColors.register(MOUNTAINS_COLOR,
                ModBlocks.MOUNTAINS_GRASS_BLOCK,
                ModBlocks.MOUNTAINS_GRASS_SLAB,
                ModBlocks.MOUNTAINS_GRASS,
                ModBlocks.TALL_MOUNTAINS_GRASS,
                ModBlocks.MOUNTAINS_FERN,
                ModBlocks.LARGE_MOUNTAINS_FERN,
                ModBlocks.MOUNTAINS_SUGAR_CANE,
                ModBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK,
                ModBlocks.POTTED_MOUNTAINS_FERN
        );

        blockColors.register(MOUNTAINS_LEAVE_COLOR,
                ModBlocks.MOUNTAINS_VINE,
                ModBlocks.MOUNTAINS_ACACIA_LEAVES,
                ModBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ModBlocks.MOUNTAINS_DARK_OAK_LEAVES,
                ModBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.MOUNTAINS_JUNGLE_LEAVES,
                ModBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ModBlocks.MOUNTAINS_OAK_LEAVES,
                ModBlocks.MOUNTAINS_OAK_LEAVES_CARPET
        );

        blockColors.register(SNOWY_COLOR,
                ModBlocks.SNOWY_GRASS_BLOCK,
                ModBlocks.SNOWY_GRASS_SLAB,
                ModBlocks.SNOWY_GRASS,
                ModBlocks.TALL_SNOWY_GRASS,
                ModBlocks.SNOWY_FERN,
                ModBlocks.LARGE_SNOWY_FERN,
                ModBlocks.SNOWY_SUGAR_CANE,
                ModBlocks.GLOWING_SNOWY_GRASS_BLOCK,
                ModBlocks.POTTED_SNOWY_FERN
        );

        blockColors.register(SNOWY_LEAVE_COLOR,
                ModBlocks.SNOWY_VINE,
                ModBlocks.SNOWY_ACACIA_LEAVES,
                ModBlocks.SNOWY_ACACIA_LEAVES_CARPET,
                ModBlocks.SNOWY_DARK_OAK_LEAVES,
                ModBlocks.SNOWY_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SNOWY_JUNGLE_LEAVES,
                ModBlocks.SNOWY_JUNGLE_LEAVES_CARPET,
                ModBlocks.SNOWY_OAK_LEAVES,
                ModBlocks.SNOWY_OAK_LEAVES_CARPET
        );

        blockColors.register(SNOWY_BEACH_COLOR,
                ModBlocks.SNOWY_BEACH_GRASS_BLOCK,
                ModBlocks.SNOWY_BEACH_GRASS_SLAB,
                ModBlocks.SNOWY_BEACH_GRASS,
                ModBlocks.TALL_SNOWY_BEACH_GRASS,
                ModBlocks.SNOWY_BEACH_FERN,
                ModBlocks.LARGE_SNOWY_BEACH_FERN,
                ModBlocks.SNOWY_BEACH_SUGAR_CANE,
                ModBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK,
                ModBlocks.POTTED_SNOWY_BEACH_FERN
        );

        blockColors.register(SNOWY_BEACH_LEAVE_COLOR,
                ModBlocks.SNOWY_BEACH_VINE,
                ModBlocks.SNOWY_BEACH_ACACIA_LEAVES,
                ModBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES,
                ModBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES,
                ModBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ModBlocks.SNOWY_BEACH_OAK_LEAVES,
                ModBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET
        );

        blockColors.register(DARK_FOREST_COLOR,
                ModBlocks.DARK_FOREST_GRASS_BLOCK,
                ModBlocks.DARK_FOREST_GRASS_SLAB,
                ModBlocks.DARK_FOREST_GRASS,
                ModBlocks.TALL_DARK_FOREST_GRASS,
                ModBlocks.DARK_FOREST_FERN,
                ModBlocks.LARGE_DARK_FOREST_FERN,
                ModBlocks.DARK_FOREST_SUGAR_CANE,
                ModBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK,
                ModBlocks.POTTED_DARK_FOREST_FERN
        );

        blockColors.register(DARK_FOREST_LEAVE_COLOR,
                ModBlocks.DARK_FOREST_VINE,
                ModBlocks.DARK_FOREST_ACACIA_LEAVES,
                ModBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ModBlocks.DARK_FOREST_DARK_OAK_LEAVES,
                ModBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ModBlocks.DARK_FOREST_JUNGLE_LEAVES,
                ModBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ModBlocks.DARK_FOREST_OAK_LEAVES,
                ModBlocks.DARK_FOREST_OAK_LEAVES_CARPET
        );

        blockColors.register(LUSH_SWAMP_COLOR,
                ModBlocks.LUSH_SWAMP_GRASS_BLOCK,
                ModBlocks.LUSH_SWAMP_GRASS_SLAB,
                ModBlocks.LUSH_SWAMP_GRASS,
                ModBlocks.TALL_LUSH_SWAMP_GRASS,
                ModBlocks.LUSH_SWAMP_FERN,
                ModBlocks.LARGE_LUSH_SWAMP_FERN,
                ModBlocks.LUSH_SWAMP_SUGAR_CANE,
                ModBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK,
                ModBlocks.POTTED_LUSH_SWAMP_FERN
        );

        blockColors.register(LUSH_SWAMP_LEAVE_COLOR,
                ModBlocks.LUSH_SWAMP_VINE,
                ModBlocks.LUSH_SWAMP_ACACIA_LEAVES,
                ModBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES,
                ModBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES,
                ModBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ModBlocks.LUSH_SWAMP_OAK_LEAVES,
                ModBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET
        );

        blockColors.register(SWAMP_COLOR,
                ModBlocks.SWAMP_GRASS_BLOCK,
                ModBlocks.SWAMP_GRASS_SLAB,
                ModBlocks.SWAMP_GRASS,
                ModBlocks.TALL_SWAMP_GRASS,
                ModBlocks.SWAMP_FERN,
                ModBlocks.LARGE_SWAMP_FERN,
                ModBlocks.SWAMP_SUGAR_CANE,
                ModBlocks.GLOWING_SWAMP_GRASS_BLOCK,
                ModBlocks.POTTED_SWAMP_FERN
        );

        blockColors.register(SWAMP_LEAVE_COLOR,
                ModBlocks.SWAMP_VINE,
                ModBlocks.SWAMP_ACACIA_LEAVES,
                ModBlocks.SWAMP_ACACIA_LEAVES_CARPET,
                ModBlocks.SWAMP_DARK_OAK_LEAVES,
                ModBlocks.SWAMP_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SWAMP_JUNGLE_LEAVES,
                ModBlocks.SWAMP_JUNGLE_LEAVES_CARPET,
                ModBlocks.SWAMP_OAK_LEAVES,
                ModBlocks.SWAMP_OAK_LEAVES_CARPET
        );

        blockColors.register(SAVANNA_COLOR,
                ModBlocks.SAVANNA_GRASS_BLOCK,
                ModBlocks.SAVANNA_GRASS_SLAB,
                ModBlocks.SAVANNA_GRASS,
                ModBlocks.TALL_SAVANNA_GRASS,
                ModBlocks.SAVANNA_FERN,
                ModBlocks.LARGE_SAVANNA_FERN,
                ModBlocks.SAVANNA_SUGAR_CANE,
                ModBlocks.GLOWING_SAVANNA_GRASS_BLOCK,
                ModBlocks.POTTED_SAVANNA_FERN
        );
        blockColors.register(SAVANNA_LEAVE_COLOR,
                ModBlocks.SAVANNA_VINE,
                ModBlocks.SAVANNA_ACACIA_LEAVES,
                ModBlocks.SAVANNA_ACACIA_LEAVES_CARPET,
                ModBlocks.SAVANNA_DARK_OAK_LEAVES,
                ModBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ModBlocks.SAVANNA_JUNGLE_LEAVES,
                ModBlocks.SAVANNA_JUNGLE_LEAVES_CARPET,
                ModBlocks.SAVANNA_OAK_LEAVES,
                ModBlocks.SAVANNA_OAK_LEAVES_CARPET
        );

        blockColors.register(BADLANDS_COLOR,
                ModBlocks.BADLANDS_GRASS_BLOCK,
                ModBlocks.BADLANDS_GRASS_SLAB,
                ModBlocks.BADLANDS_GRASS,
                ModBlocks.TALL_BADLANDS_GRASS,
                ModBlocks.BADLANDS_FERN,
                ModBlocks.LARGE_BADLANDS_FERN,
                ModBlocks.BADLANDS_SUGAR_CANE,
                ModBlocks.GLOWING_BADLANDS_GRASS_BLOCK,
                ModBlocks.POTTED_BADLANDS_FERN
        );

        blockColors.register(BADLANDS_LEAVE_COLOR,
                ModBlocks.BADLANDS_VINE,
                ModBlocks.BADLANDS_ACACIA_LEAVES,
                ModBlocks.BADLANDS_ACACIA_LEAVES_CARPET,
                ModBlocks.BADLANDS_DARK_OAK_LEAVES,
                ModBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ModBlocks.BADLANDS_JUNGLE_LEAVES,
                ModBlocks.BADLANDS_JUNGLE_LEAVES_CARPET,
                ModBlocks.BADLANDS_OAK_LEAVES,
                ModBlocks.BADLANDS_OAK_LEAVES_CARPET
        );


        // spruce and birch color
        blockColors.register(new IBlockColor() {
            @Override
            public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader reader, @Nullable BlockPos pos, int p_getColor_4_) {
                return reader != null && pos != null ? FoliageColors.getEvergreenColor() : FoliageColors.getDefaultColor();
            }
        }, ModBlocks.SPRUCE_LEAVES_CARPET);

        blockColors.register(new IBlockColor() {
            @Override
            public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader reader, @Nullable BlockPos pos, int p_getColor_4_) {
                return reader != null && pos != null ? FoliageColors.getBirchColor() : FoliageColors.get(0.5D, 1.0D);
            }
        }, ModBlocks.BIRCH_LEAVES_CARPET);


        // vanilla grass slab
        blockColors.register(new IBlockColor() {
            @Override
            public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader reader, @Nullable BlockPos pos, int p_getColor_4_) {
                return reader != null && pos != null ?  BiomeColors.getAverageGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);

            }
        }, ModBlocks.GRASS_SLAB);

    }


    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final ItemColors itemColors = event.getItemColors();


        // block items
        itemColors.register(ColorProvider.MUSHROOM_FIELDS_ITEM_COLOR,
                ModItems.MUSHROOM_FIELDS_GRASS_BLOCK,
                ModItems.MUSHROOM_FIELDS_GRASS,
                ModItems.TALL_MUSHROOM_FIELDS_GRASS,
                ModItems.MUSHROOM_FIELDS_FERN,
                ModItems.LARGE_MUSHROOM_FIELDS_FERN,
                ModItems.MUSHROOM_FIELDS_VINE,
                ModItems.MUSHROOM_FIELDS_SUGAR_CANE,
                ModItems.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ModItems.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ModItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ModItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ModItems.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ModItems.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ModItems.MUSHROOM_FIELDS_OAK_LEAVES,
                ModItems.MUSHROOM_FIELDS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.JUNGLE_ITEM_COLOR,
                ModItems.JUNGLE_GRASS_BLOCK,
                ModItems.JUNGLE_GRASS,
                ModItems.TALL_JUNGLE_GRASS,
                ModItems.JUNGLE_FERN,
                ModItems.LARGE_JUNGLE_FERN,
                ModItems.JUNGLE_VINE,
                ModItems.JUNGLE_SUGAR_CANE,
                ModItems.TROPICAL_ACACIA_LEAVES,
                ModItems.TROPICAL_ACACIA_LEAVES_CARPET,
                ModItems.TROPICAL_DARK_OAK_LEAVES,
                ModItems.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ModItems.TROPICAL_JUNGLE_LEAVES,
                ModItems.TROPICAL_JUNGLE_LEAVES_CARPET,
                ModItems.TROPICAL_OAK_LEAVES,
                ModItems.TROPICAL_OAK_LEAVES_CARPET,
                ModItems.GLOWING_JUNGLE_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.JUNGLE_EDGE_ITEM_COLOR,
                ModItems.JUNGLE_EDGE_GRASS_BLOCK,
                ModItems.JUNGLE_EDGE_GRASS,
                ModItems.TALL_JUNGLE_EDGE_GRASS,
                ModItems.JUNGLE_EDGE_FERN,
                ModItems.LARGE_JUNGLE_EDGE_FERN,
                ModItems.JUNGLE_EDGE_VINE,
                ModItems.JUNGLE_EDGE_SUGAR_CANE,
                ModItems.TROPICAL_EDGE_ACACIA_LEAVES,
                ModItems.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ModItems.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ModItems.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ModItems.TROPICAL_EDGE_JUNGLE_LEAVES,
                ModItems.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ModItems.TROPICAL_EDGE_OAK_LEAVES,
                ModItems.TROPICAL_EDGE_OAK_LEAVES_CARPET,
                ModItems.GLOWING_JUNGLE_EDGE_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.PLAINS_ITEM_COLOR,
                ModItems.PLAINS_GRASS_BLOCK,
                ModItems.PLAINS_GRASS,
                ModItems.TALL_PLAINS_GRASS,
                ModItems.PLAINS_FERN,
                ModItems.LARGE_PLAINS_FERN,
                ModItems.PLAINS_VINE,
                ModItems.PLAINS_SUGAR_CANE,
                ModItems.PLAINS_ACACIA_LEAVES,
                ModItems.PLAINS_ACACIA_LEAVES_CARPET,
                ModItems.PLAINS_DARK_OAK_LEAVES,
                ModItems.PLAINS_DARK_OAK_LEAVES_CARPET,
                ModItems.PLAINS_JUNGLE_LEAVES,
                ModItems.PLAINS_JUNGLE_LEAVES_CARPET,
                ModItems.PLAINS_OAK_LEAVES,
                ModItems.PLAINS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_PLAINS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.FOREST_ITEM_COLOR,
                ModItems.FOREST_GRASS_BLOCK,
                ModItems.FOREST_GRASS,
                ModItems.TALL_FOREST_GRASS,
                ModItems.FOREST_FERN,
                ModItems.LARGE_FOREST_FERN,
                ModItems.FOREST_VINE,
                ModItems.FOREST_SUGAR_CANE,
                ModItems.FOREST_ACACIA_LEAVES,
                ModItems.FOREST_ACACIA_LEAVES_CARPET,
                ModItems.FOREST_DARK_OAK_LEAVES,
                ModItems.FOREST_DARK_OAK_LEAVES_CARPET,
                ModItems.FOREST_JUNGLE_LEAVES,
                ModItems.FOREST_JUNGLE_LEAVES_CARPET,
                ModItems.FOREST_OAK_LEAVES,
                ModItems.FOREST_OAK_LEAVES_CARPET,
                ModItems.GLOWING_FOREST_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.BIRCH_FOREST_ITEM_COLOR,
                ModItems.BIRCH_FOREST_GRASS_BLOCK,
                ModItems.BIRCH_FOREST_GRASS,
                ModItems.TALL_BIRCH_FOREST_GRASS,
                ModItems.BIRCH_FOREST_FERN,
                ModItems.LARGE_BIRCH_FOREST_FERN,
                ModItems.BIRCH_FOREST_VINE,
                ModItems.BIRCH_FOREST_SUGAR_CANE,
                ModItems.BIRCH_FOREST_ACACIA_LEAVES,
                ModItems.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ModItems.BIRCH_FOREST_DARK_OAK_LEAVES,
                ModItems.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ModItems.BIRCH_FOREST_JUNGLE_LEAVES,
                ModItems.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ModItems.BIRCH_FOREST_OAK_LEAVES,
                ModItems.BIRCH_FOREST_OAK_LEAVES_CARPET,
                ModItems.GLOWING_BIRCH_FOREST_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.WATERS_ITEM_COLOR,
                ModItems.WATERS_GRASS_BLOCK,
                ModItems.WATERS_GRASS,
                ModItems.TALL_WATERS_GRASS,
                ModItems.WATERS_FERN,
                ModItems.LARGE_WATERS_FERN,
                ModItems.WATERS_VINE,
                ModItems.WATERS_SUGAR_CANE,
                ModItems.WATERS_ACACIA_LEAVES,
                ModItems.WATERS_ACACIA_LEAVES_CARPET,
                ModItems.WATERS_DARK_OAK_LEAVES,
                ModItems.WATERS_DARK_OAK_LEAVES_CARPET,
                ModItems.WATERS_JUNGLE_LEAVES,
                ModItems.WATERS_JUNGLE_LEAVES_CARPET,
                ModItems.WATERS_OAK_LEAVES,
                ModItems.WATERS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_WATERS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.MEGA_TAIGA_ITEM_COLOR,
                ModItems.MEGA_TAIGA_GRASS_BLOCK,
                ModItems.MEGA_TAIGA_GRASS,
                ModItems.TALL_MEGA_TAIGA_GRASS,
                ModItems.MEGA_TAIGA_FERN,
                ModItems.LARGE_MEGA_TAIGA_FERN,
                ModItems.MEGA_TAIGA_VINE,
                ModItems.MEGA_TAIGA_SUGAR_CANE,
                ModItems.MEGA_TAIGA_ACACIA_LEAVES,
                ModItems.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ModItems.MEGA_TAIGA_DARK_OAK_LEAVES,
                ModItems.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ModItems.MEGA_TAIGA_JUNGLE_LEAVES,
                ModItems.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ModItems.MEGA_TAIGA_OAK_LEAVES,
                ModItems.MEGA_TAIGA_OAK_LEAVES_CARPET,
                ModItems.GLOWING_MEGA_TAIGA_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.TAIGA_ITEM_COLOR,
                ModItems.TAIGA_GRASS_BLOCK,
                ModItems.TAIGA_GRASS,
                ModItems.TALL_TAIGA_GRASS,
                ModItems.TAIGA_FERN,
                ModItems.LARGE_TAIGA_FERN,
                ModItems.TAIGA_VINE,
                ModItems.TAIGA_SUGAR_CANE,
                ModItems.TAIGA_ACACIA_LEAVES,
                ModItems.TAIGA_ACACIA_LEAVES_CARPET,
                ModItems.TAIGA_DARK_OAK_LEAVES,
                ModItems.TAIGA_DARK_OAK_LEAVES_CARPET,
                ModItems.TAIGA_JUNGLE_LEAVES,
                ModItems.TAIGA_JUNGLE_LEAVES_CARPET,
                ModItems.TAIGA_OAK_LEAVES,
                ModItems.TAIGA_OAK_LEAVES_CARPET,
                ModItems.GLOWING_TAIGA_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.MOUNTAINS_ITEM_COLOR,
                ModItems.MOUNTAINS_GRASS_BLOCK,
                ModItems.MOUNTAINS_GRASS,
                ModItems.TALL_MOUNTAINS_GRASS,
                ModItems.MOUNTAINS_FERN,
                ModItems.LARGE_MOUNTAINS_FERN,
                ModItems.MOUNTAINS_VINE,
                ModItems.MOUNTAINS_SUGAR_CANE,
                ModItems.MOUNTAINS_ACACIA_LEAVES,
                ModItems.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ModItems.MOUNTAINS_DARK_OAK_LEAVES,
                ModItems.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ModItems.MOUNTAINS_JUNGLE_LEAVES,
                ModItems.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ModItems.MOUNTAINS_OAK_LEAVES,
                ModItems.MOUNTAINS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_MOUNTAINS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SNOWY_ITEM_COLOR,
                ModItems.SNOWY_GRASS_BLOCK,
                ModItems.SNOWY_GRASS,
                ModItems.TALL_SNOWY_GRASS,
                ModItems.SNOWY_FERN,
                ModItems.LARGE_SNOWY_FERN,
                ModItems.SNOWY_VINE,
                ModItems.SNOWY_SUGAR_CANE,
                ModItems.SNOWY_ACACIA_LEAVES,
                ModItems.SNOWY_ACACIA_LEAVES_CARPET,
                ModItems.SNOWY_DARK_OAK_LEAVES,
                ModItems.SNOWY_DARK_OAK_LEAVES_CARPET,
                ModItems.SNOWY_JUNGLE_LEAVES,
                ModItems.SNOWY_JUNGLE_LEAVES_CARPET,
                ModItems.SNOWY_OAK_LEAVES,
                ModItems.SNOWY_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SNOWY_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SNOWY_BEACH_ITEM_COLOR,
                ModItems.SNOWY_BEACH_GRASS_BLOCK,
                ModItems.SNOWY_BEACH_GRASS,
                ModItems.TALL_SNOWY_BEACH_GRASS,
                ModItems.SNOWY_BEACH_FERN,
                ModItems.LARGE_SNOWY_BEACH_FERN,
                ModItems.SNOWY_BEACH_VINE,
                ModItems.SNOWY_BEACH_SUGAR_CANE,
                ModItems.SNOWY_BEACH_ACACIA_LEAVES,
                ModItems.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ModItems.SNOWY_BEACH_DARK_OAK_LEAVES,
                ModItems.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ModItems.SNOWY_BEACH_JUNGLE_LEAVES,
                ModItems.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ModItems.SNOWY_BEACH_OAK_LEAVES,
                ModItems.SNOWY_BEACH_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SNOWY_BEACH_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.DARK_FOREST_ITEM_COLOR,
                ModItems.DARK_FOREST_GRASS_BLOCK,
                ModItems.DARK_FOREST_GRASS,
                ModItems.TALL_DARK_FOREST_GRASS,
                ModItems.DARK_FOREST_FERN,
                ModItems.LARGE_DARK_FOREST_FERN,
                ModItems.DARK_FOREST_VINE,
                ModItems.DARK_FOREST_SUGAR_CANE,
                ModItems.DARK_FOREST_ACACIA_LEAVES,
                ModItems.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ModItems.DARK_FOREST_DARK_OAK_LEAVES,
                ModItems.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ModItems.DARK_FOREST_JUNGLE_LEAVES,
                ModItems.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ModItems.DARK_FOREST_OAK_LEAVES,
                ModItems.DARK_FOREST_OAK_LEAVES_CARPET,
                ModItems.GLOWING_DARK_FOREST_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.LUSH_SWAMP_ITEM_COLOR,
                ModItems.LUSH_SWAMP_GRASS_BLOCK,
                ModItems.LUSH_SWAMP_GRASS,
                ModItems.TALL_LUSH_SWAMP_GRASS,
                ModItems.LUSH_SWAMP_FERN,
                ModItems.LARGE_LUSH_SWAMP_FERN,
                ModItems.LUSH_SWAMP_VINE,
                ModItems.LUSH_SWAMP_SUGAR_CANE,
                ModItems.LUSH_SWAMP_ACACIA_LEAVES,
                ModItems.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ModItems.LUSH_SWAMP_DARK_OAK_LEAVES,
                ModItems.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ModItems.LUSH_SWAMP_JUNGLE_LEAVES,
                ModItems.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ModItems.LUSH_SWAMP_OAK_LEAVES,
                ModItems.LUSH_SWAMP_OAK_LEAVES_CARPET,
                ModItems.GLOWING_LUSH_SWAMP_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SWAMP_ITEM_COLOR,
                ModItems.SWAMP_GRASS_BLOCK,
                ModItems.SWAMP_GRASS,
                ModItems.TALL_SWAMP_GRASS,
                ModItems.SWAMP_FERN,
                ModItems.LARGE_SWAMP_FERN,
                ModItems.SWAMP_VINE,
                ModItems.SWAMP_SUGAR_CANE,
                ModItems.SWAMP_ACACIA_LEAVES,
                ModItems.SWAMP_ACACIA_LEAVES_CARPET,
                ModItems.SWAMP_DARK_OAK_LEAVES,
                ModItems.SWAMP_DARK_OAK_LEAVES_CARPET,
                ModItems.SWAMP_JUNGLE_LEAVES,
                ModItems.SWAMP_JUNGLE_LEAVES_CARPET,
                ModItems.SWAMP_OAK_LEAVES,
                ModItems.SWAMP_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SWAMP_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SAVANNA_ITEM_COLOR,
                ModItems.SAVANNA_GRASS_BLOCK,
                ModItems.SAVANNA_GRASS,
                ModItems.TALL_SAVANNA_GRASS,
                ModItems.SAVANNA_FERN,
                ModItems.LARGE_SAVANNA_FERN,
                ModItems.SAVANNA_VINE,
                ModItems.SAVANNA_SUGAR_CANE,
                ModItems.SAVANNA_ACACIA_LEAVES,
                ModItems.SAVANNA_ACACIA_LEAVES_CARPET,
                ModItems.SAVANNA_DARK_OAK_LEAVES,
                ModItems.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ModItems.SAVANNA_JUNGLE_LEAVES,
                ModItems.SAVANNA_JUNGLE_LEAVES_CARPET,
                ModItems.SAVANNA_OAK_LEAVES,
                ModItems.SAVANNA_OAK_LEAVES_CARPET,
                ModItems.GLOWING_SAVANNA_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.BADLANDS_ITEM_COLOR,
                ModItems.BADLANDS_GRASS_BLOCK,
                ModItems.BADLANDS_GRASS,
                ModItems.TALL_BADLANDS_GRASS,
                ModItems.BADLANDS_FERN,
                ModItems.LARGE_BADLANDS_FERN,
                ModItems.BADLANDS_VINE,
                ModItems.BADLANDS_SUGAR_CANE,
                ModItems.BADLANDS_ACACIA_LEAVES,
                ModItems.BADLANDS_ACACIA_LEAVES_CARPET,
                ModItems.BADLANDS_DARK_OAK_LEAVES,
                ModItems.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ModItems.BADLANDS_JUNGLE_LEAVES,
                ModItems.BADLANDS_JUNGLE_LEAVES_CARPET,
                ModItems.BADLANDS_OAK_LEAVES,
                ModItems.BADLANDS_OAK_LEAVES_CARPET,
                ModItems.GLOWING_BADLANDS_GRASS_BLOCK
        );


            // spruce and birch color
            itemColors.register(new IItemColor() {
                @Override
                public int getColor(ItemStack p_getColor_1_, int p_getColor_2_) {
                    return FoliageColors.getEvergreenColor();
                }
            }, ModBlocks.SPRUCE_LEAVES_CARPET);

            itemColors.register(new IItemColor() {
                @Override
                public int getColor(ItemStack stack, int tintIndex) {
                    return FoliageColors.getBirchColor();
                }
            }, ModBlocks.BIRCH_LEAVES_CARPET);

            // vanilla grass slab
            itemColors.register(new IItemColor() {
                @Override
                public int getColor(ItemStack stack, int tintIndex) {
                    return GrassColors.get(0.5D, 1.0D);
                }
            }, ModBlocks.GRASS_SLAB);


        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 6975545;
            }
        }, ModBlocks.SWAMP_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 5011004;
            }
        }, ModBlocks.LUSH_SWAMP_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 6975545;
            }
        }, ModBlocks.DARK_FOREST_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 9470285;
            }
        }, ModBlocks.BADLANDS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.05D, 0.3D);
            }
        }, ModBlocks.SNOWY_BEACH_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.25D, 0.8D);
            }
        }, ModBlocks.TAIGA_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.3D, 0.8D);
            }
        }, ModBlocks.MEGA_TAIGA_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.0D, 0.5D);
            }
        }, ModBlocks.SNOWY_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.9D, 1.0D);
            }
        }, ModBlocks.MUSHROOM_FIELDS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.2D, 0.3D);
            }
        }, ModBlocks.MOUNTAINS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.5D, 0.5D);
            }
        }, ModBlocks.WATERS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.8D, 0.4D);
            }
        }, ModBlocks.PLAINS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.6D, 0.6D);
            }
        }, ModBlocks.BIRCH_FOREST_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.7D, 0.8D);
            }
        }, ModBlocks.FOREST_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.95D, 0.8D);
            }
        }, ModBlocks.JUNGLE_EDGE_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(1.0D, 0.0D);
            }
        }, ModBlocks.SAVANNA_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.95D, 0.9D);
            }
        }, ModBlocks.JUNGLE_GRASS_SLAB);

    }


}
