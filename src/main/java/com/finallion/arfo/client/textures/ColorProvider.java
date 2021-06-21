package com.finallion.arfo.client.textures;

import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOItems;
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
    public static IBlockColor setDynamicBlockColorProvider(double temp, double humidity) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? GrassColors.get(temp, humidity) : BiomeColors.getAverageGrassColor(lightReader, pos);
    }

    public static IBlockColor setStaticBlockColorProvider(double x, double y, int color, BiomeAmbience.GrassColorModifier modifier) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? modifier.modifyColor(x, y, color) : BiomeColors.getAverageGrassColor(lightReader, pos);
    }

    // leaf blocks
    public static IBlockColor setDynamicFoliageColorProvider(double temp, double humidity) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? FoliageColors.get(temp, humidity) : BiomeColors.getAverageFoliageColor(lightReader, pos);
    }

    public static IBlockColor setStaticFoliageColorProvider(double x, double y, int color, BiomeAmbience.GrassColorModifier modifier) {
        return (unknown, lightReader, pos, unknown2) -> lightReader != null && pos != null ? modifier.modifyColor(x, y, color) : BiomeColors.getAverageFoliageColor(lightReader, pos);
    }


    /*
    public static IItemColor setStaticItemColorProvider(double x, double y, int color, BiomeAmbience.GrassColorModifier modifier) {
        return (stack, index) -> index == 0 ? modifier.modifyColor(x, y, color) : BiomeAmbience.GrassColorModifier.SWAMP.modifyColor(x, y, 6975545);
    }

     */

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
    public static final IItemColor JUNGLE_ITEM_COLOR = (item, layer) -> GrassColors.get(0.95, 0.9);
    public static final IItemColor SAVANNA_ITEM_COLOR = (item, layer) -> GrassColors.get(1.0, 0.0);
    public static final IItemColor JUNGLE_EDGE_ITEM_COLOR = (item, layer) -> GrassColors.get(0.95, 0.8);
    public static final IItemColor FOREST_ITEM_COLOR = (item, layer) -> GrassColors.get(0.7, 0.8);
    public static final IItemColor BIRCH_FOREST_ITEM_COLOR = (item, layer) -> GrassColors.get(0.6, 0.6);
    public static final IItemColor PLAINS_ITEM_COLOR = (item, layer) -> GrassColors.get(0.8, 0.4);
    public static final IItemColor WATERS_ITEM_COLOR = (item, layer) -> GrassColors.get(0.5, 0.5);
    public static final IItemColor MOUNTAINS_ITEM_COLOR = (item, layer) -> GrassColors.get(0.2, 0.3);
    public static final IItemColor MUSHROOM_FIELDS_ITEM_COLOR = (item, layer) -> GrassColors.get(0.9, 1.0);
    public static final IItemColor SNOWY_ITEM_COLOR = (item, layer) -> GrassColors.get(0.0, 0.5);
    public static final IItemColor MEGA_TAIGA_ITEM_COLOR = (item, layer) -> GrassColors.get(0.3, 0.8);
    public static final IItemColor TAIGA_ITEM_COLOR = (item, layer) -> GrassColors.get(0.25, 0.8);
    public static final IItemColor SNOWY_BEACH_ITEM_COLOR = (item, layer) -> GrassColors.get(0.05, 0.3);

    // hardcoded grass block colors
    public static final IItemColor SWAMP_ITEM_COLOR = (item, layer) -> BiomeAmbience.GrassColorModifier.SWAMP.modifyColor(0.5, 0.5, 6975545);
    public static final IItemColor LUSH_SWAMP_ITEM_COLOR = (item, layer) -> BiomeAmbience.GrassColorModifier.NONE.modifyColor(0.5, 0.5, 5011004);
    public static final IItemColor DARK_FOREST_ITEM_COLOR = (item, layer) -> BiomeAmbience.GrassColorModifier.DARK_FOREST.modifyColor(0.5, 0.5, 6975545);
    public static final IItemColor BADLANDS_ITEM_COLOR = (item, layer) -> BiomeAmbience.GrassColorModifier.NONE.modifyColor(0.5, 0.5, 9470285);
    /*
    public static final IItemColor SWAMP_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5,6975545, BiomeAmbience.GrassColorModifier.SWAMP);
    public static final IItemColor LUSH_SWAMP_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5,5011004, BiomeAmbience.GrassColorModifier.NONE);
    public static final IItemColor DARK_FOREST_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5, 6975545, BiomeAmbience.GrassColorModifier.DARK_FOREST);
    public static final IItemColor BADLANDS_ITEM_COLOR = setStaticItemColorProvider(0.5, 0.5,9470285, BiomeAmbience.GrassColorModifier.NONE);

     */

    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        // blocks
        blockColors.register(MUSHROOM_FIELDS_COLOR,
                ARFOBlocks.MUSHROOM_FIELDS_GRASS_BLOCK,
                ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB,
                ARFOBlocks.MUSHROOM_FIELDS_GRASS,
                ARFOBlocks.TALL_MUSHROOM_FIELDS_GRASS,
                ARFOBlocks.MUSHROOM_FIELDS_FERN,
                ARFOBlocks.LARGE_MUSHROOM_FIELDS_FERN,
                ARFOBlocks.MUSHROOM_FIELDS_SUGAR_CANE,
                ARFOBlocks.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK,
                ARFOBlocks.POTTED_MUSHROOM_FIELDS_FERN
        );

        blockColors.register(MUSHROOM_FIELDS_LEAVE_COLOR,
                ARFOBlocks.MUSHROOM_FIELDS_VINE,
                ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES,
                ARFOBlocks.MUSHROOM_FIELDS_OAK_LEAVES_CARPET
        );

        blockColors.register(JUNGLE_COLOR,
                ARFOBlocks.JUNGLE_GRASS_BLOCK,
                ARFOBlocks.JUNGLE_GRASS_SLAB,
                ARFOBlocks.JUNGLE_GRASS,
                ARFOBlocks.TALL_JUNGLE_GRASS,
                ARFOBlocks.JUNGLE_FERN,
                ARFOBlocks.LARGE_JUNGLE_FERN,
                ARFOBlocks.JUNGLE_SUGAR_CANE,
                ARFOBlocks.GLOWING_JUNGLE_GRASS_BLOCK,
                ARFOBlocks.POTTED_JUNGLE_FERN
        );

        blockColors.register(JUNGLE_LEAVE_COLOR,
                ARFOBlocks.JUNGLE_VINE,
                ARFOBlocks.TROPICAL_ACACIA_LEAVES,
                ARFOBlocks.TROPICAL_ACACIA_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_DARK_OAK_LEAVES,
                ARFOBlocks.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_JUNGLE_LEAVES,
                ARFOBlocks.TROPICAL_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_OAK_LEAVES,
                ARFOBlocks.TROPICAL_OAK_LEAVES_CARPET
        );

        blockColors.register(JUNGLE_EDGE_COLOR,
                ARFOBlocks.JUNGLE_EDGE_GRASS_BLOCK,
                ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB,
                ARFOBlocks.JUNGLE_EDGE_GRASS,
                ARFOBlocks.TALL_JUNGLE_EDGE_GRASS,
                ARFOBlocks.JUNGLE_EDGE_FERN,
                ARFOBlocks.LARGE_JUNGLE_EDGE_FERN,
                ARFOBlocks.JUNGLE_EDGE_SUGAR_CANE,
                ARFOBlocks.GLOWING_JUNGLE_EDGE_GRASS_BLOCK,
                ARFOBlocks.POTTED_JUNGLE_EDGE_FERN
        );

        blockColors.register(JUNGLE_EDGE_LEAVE_COLOR,
                ARFOBlocks.JUNGLE_EDGE_VINE,
                ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES,
                ARFOBlocks.TROPICAL_EDGE_OAK_LEAVES_CARPET
        );

        blockColors.register(PLAINS_COLOR,
                ARFOBlocks.PLAINS_GRASS_BLOCK,
                ARFOBlocks.PLAINS_GRASS_SLAB,
                ARFOBlocks.PLAINS_GRASS,
                ARFOBlocks.TALL_PLAINS_GRASS,
                ARFOBlocks.PLAINS_FERN,
                ARFOBlocks.LARGE_PLAINS_FERN,
                ARFOBlocks.PLAINS_SUGAR_CANE,
                ARFOBlocks.GLOWING_PLAINS_GRASS_BLOCK,
                ARFOBlocks.POTTED_PLAINS_FERN
        );


        blockColors.register(PLAINS_LEAVE_COLOR,
                ARFOBlocks.PLAINS_VINE,
                ARFOBlocks.PLAINS_ACACIA_LEAVES,
                ARFOBlocks.PLAINS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.PLAINS_DARK_OAK_LEAVES,
                ARFOBlocks.PLAINS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.PLAINS_JUNGLE_LEAVES,
                ARFOBlocks.PLAINS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.PLAINS_OAK_LEAVES,
                ARFOBlocks.PLAINS_OAK_LEAVES_CARPET
        );

        blockColors.register(FOREST_COLOR,
                ARFOBlocks.FOREST_GRASS_BLOCK,
                ARFOBlocks.FOREST_GRASS_SLAB,
                ARFOBlocks.FOREST_GRASS,
                ARFOBlocks.TALL_FOREST_GRASS,
                ARFOBlocks.FOREST_FERN,
                ARFOBlocks.LARGE_FOREST_FERN,
                ARFOBlocks.FOREST_SUGAR_CANE,
                ARFOBlocks.GLOWING_FOREST_GRASS_BLOCK,
                ARFOBlocks.POTTED_FOREST_FERN
        );

        blockColors.register(FOREST_LEAVE_COLOR,
                ARFOBlocks.FOREST_VINE,
                ARFOBlocks.FOREST_ACACIA_LEAVES,
                ARFOBlocks.FOREST_ACACIA_LEAVES_CARPET,
                ARFOBlocks.FOREST_DARK_OAK_LEAVES,
                ARFOBlocks.FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.FOREST_JUNGLE_LEAVES,
                ARFOBlocks.FOREST_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.FOREST_OAK_LEAVES,
                ARFOBlocks.FOREST_OAK_LEAVES_CARPET
        );

        blockColors.register(BIRCH_FOREST_COLOR,
                ARFOBlocks.BIRCH_FOREST_GRASS_BLOCK,
                ARFOBlocks.BIRCH_FOREST_GRASS_SLAB,
                ARFOBlocks.BIRCH_FOREST_GRASS,
                ARFOBlocks.TALL_BIRCH_FOREST_GRASS,
                ARFOBlocks.BIRCH_FOREST_FERN,
                ARFOBlocks.LARGE_BIRCH_FOREST_FERN,
                ARFOBlocks.BIRCH_FOREST_SUGAR_CANE,
                ARFOBlocks.GLOWING_BIRCH_FOREST_GRASS_BLOCK,
                ARFOBlocks.POTTED_BIRCH_FOREST_FERN
        );

        blockColors.register(BIRCH_FOREST_LEAVE_COLOR,
                ARFOBlocks.BIRCH_FOREST_VINE,
                ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES,
                ARFOBlocks.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES,
                ARFOBlocks.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES,
                ARFOBlocks.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.BIRCH_FOREST_OAK_LEAVES,
                ARFOBlocks.BIRCH_FOREST_OAK_LEAVES_CARPET
        );

        blockColors.register(WATERS_COLOR,
                ARFOBlocks.WATERS_GRASS_BLOCK,
                ARFOBlocks.WATERS_GRASS_SLAB,
                ARFOBlocks.WATERS_GRASS,
                ARFOBlocks.TALL_WATERS_GRASS,
                ARFOBlocks.WATERS_FERN,
                ARFOBlocks.LARGE_WATERS_FERN,
                ARFOBlocks.WATERS_SUGAR_CANE,
                ARFOBlocks.GLOWING_WATERS_GRASS_BLOCK,
                ARFOBlocks.POTTED_WATERS_FERN
        );

        blockColors.register(WATERS_LEAVE_COLOR,
                ARFOBlocks.WATERS_VINE,
                ARFOBlocks.WATERS_ACACIA_LEAVES,
                ARFOBlocks.WATERS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.WATERS_DARK_OAK_LEAVES,
                ARFOBlocks.WATERS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.WATERS_JUNGLE_LEAVES,
                ARFOBlocks.WATERS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.WATERS_OAK_LEAVES,
                ARFOBlocks.WATERS_OAK_LEAVES_CARPET
        );

        blockColors.register(MEGA_TAIGA_COLOR,
                ARFOBlocks.MEGA_TAIGA_GRASS_BLOCK,
                ARFOBlocks.MEGA_TAIGA_GRASS_SLAB,
                ARFOBlocks.MEGA_TAIGA_GRASS,
                ARFOBlocks.TALL_MEGA_TAIGA_GRASS,
                ARFOBlocks.MEGA_TAIGA_FERN,
                ARFOBlocks.LARGE_MEGA_TAIGA_FERN,
                ARFOBlocks.MEGA_TAIGA_SUGAR_CANE,
                ARFOBlocks.GLOWING_MEGA_TAIGA_GRASS_BLOCK,
                ARFOBlocks.POTTED_MEGA_TAIGA_FERN
        );

        blockColors.register(MEGA_TAIGA_LEAVE_COLOR,
                ARFOBlocks.MEGA_TAIGA_VINE,
                ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES,
                ARFOBlocks.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES,
                ARFOBlocks.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES,
                ARFOBlocks.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.MEGA_TAIGA_OAK_LEAVES,
                ARFOBlocks.MEGA_TAIGA_OAK_LEAVES_CARPET
        );


        blockColors.register(TAIGA_COLOR,
                ARFOBlocks.TAIGA_GRASS_BLOCK,
                ARFOBlocks.TAIGA_GRASS_SLAB,
                ARFOBlocks.TAIGA_GRASS,
                ARFOBlocks.TALL_TAIGA_GRASS,
                ARFOBlocks.TAIGA_FERN,
                ARFOBlocks.LARGE_TAIGA_FERN,
                ARFOBlocks.TAIGA_SUGAR_CANE,
                ARFOBlocks.GLOWING_TAIGA_GRASS_BLOCK,
                ARFOBlocks.POTTED_TAIGA_FERN
        );

        blockColors.register(TAIGA_LEAVE_COLOR,
                ARFOBlocks.TAIGA_VINE,
                ARFOBlocks.TAIGA_ACACIA_LEAVES,
                ARFOBlocks.TAIGA_ACACIA_LEAVES_CARPET,
                ARFOBlocks.TAIGA_DARK_OAK_LEAVES,
                ARFOBlocks.TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.TAIGA_JUNGLE_LEAVES,
                ARFOBlocks.TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.TAIGA_OAK_LEAVES,
                ARFOBlocks.TAIGA_OAK_LEAVES_CARPET
        );

        blockColors.register(MOUNTAINS_COLOR,
                ARFOBlocks.MOUNTAINS_GRASS_BLOCK,
                ARFOBlocks.MOUNTAINS_GRASS_SLAB,
                ARFOBlocks.MOUNTAINS_GRASS,
                ARFOBlocks.TALL_MOUNTAINS_GRASS,
                ARFOBlocks.MOUNTAINS_FERN,
                ARFOBlocks.LARGE_MOUNTAINS_FERN,
                ARFOBlocks.MOUNTAINS_SUGAR_CANE,
                ARFOBlocks.GLOWING_MOUNTAINS_GRASS_BLOCK,
                ARFOBlocks.POTTED_MOUNTAINS_FERN
        );

        blockColors.register(MOUNTAINS_LEAVE_COLOR,
                ARFOBlocks.MOUNTAINS_VINE,
                ARFOBlocks.MOUNTAINS_ACACIA_LEAVES,
                ARFOBlocks.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES,
                ARFOBlocks.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES,
                ARFOBlocks.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.MOUNTAINS_OAK_LEAVES,
                ARFOBlocks.MOUNTAINS_OAK_LEAVES_CARPET
        );

        blockColors.register(SNOWY_COLOR,
                ARFOBlocks.SNOWY_GRASS_BLOCK,
                ARFOBlocks.SNOWY_GRASS_SLAB,
                ARFOBlocks.SNOWY_GRASS,
                ARFOBlocks.TALL_SNOWY_GRASS,
                ARFOBlocks.SNOWY_FERN,
                ARFOBlocks.LARGE_SNOWY_FERN,
                ARFOBlocks.SNOWY_SUGAR_CANE,
                ARFOBlocks.GLOWING_SNOWY_GRASS_BLOCK,
                ARFOBlocks.POTTED_SNOWY_FERN
        );

        blockColors.register(SNOWY_LEAVE_COLOR,
                ARFOBlocks.SNOWY_VINE,
                ARFOBlocks.SNOWY_ACACIA_LEAVES,
                ARFOBlocks.SNOWY_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SNOWY_DARK_OAK_LEAVES,
                ARFOBlocks.SNOWY_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SNOWY_JUNGLE_LEAVES,
                ARFOBlocks.SNOWY_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SNOWY_OAK_LEAVES,
                ARFOBlocks.SNOWY_OAK_LEAVES_CARPET
        );

        blockColors.register(SNOWY_BEACH_COLOR,
                ARFOBlocks.SNOWY_BEACH_GRASS_BLOCK,
                ARFOBlocks.SNOWY_BEACH_GRASS_SLAB,
                ARFOBlocks.SNOWY_BEACH_GRASS,
                ARFOBlocks.TALL_SNOWY_BEACH_GRASS,
                ARFOBlocks.SNOWY_BEACH_FERN,
                ARFOBlocks.LARGE_SNOWY_BEACH_FERN,
                ARFOBlocks.SNOWY_BEACH_SUGAR_CANE,
                ARFOBlocks.GLOWING_SNOWY_BEACH_GRASS_BLOCK,
                ARFOBlocks.POTTED_SNOWY_BEACH_FERN
        );

        blockColors.register(SNOWY_BEACH_LEAVE_COLOR,
                ARFOBlocks.SNOWY_BEACH_VINE,
                ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES,
                ARFOBlocks.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES,
                ARFOBlocks.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES,
                ARFOBlocks.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SNOWY_BEACH_OAK_LEAVES,
                ARFOBlocks.SNOWY_BEACH_OAK_LEAVES_CARPET
        );

        blockColors.register(DARK_FOREST_COLOR,
                ARFOBlocks.DARK_FOREST_GRASS_BLOCK,
                ARFOBlocks.DARK_FOREST_GRASS_SLAB,
                ARFOBlocks.DARK_FOREST_GRASS,
                ARFOBlocks.TALL_DARK_FOREST_GRASS,
                ARFOBlocks.DARK_FOREST_FERN,
                ARFOBlocks.LARGE_DARK_FOREST_FERN,
                ARFOBlocks.DARK_FOREST_SUGAR_CANE,
                ARFOBlocks.GLOWING_DARK_FOREST_GRASS_BLOCK,
                ARFOBlocks.POTTED_DARK_FOREST_FERN
        );

        blockColors.register(DARK_FOREST_LEAVE_COLOR,
                ARFOBlocks.DARK_FOREST_VINE,
                ARFOBlocks.DARK_FOREST_ACACIA_LEAVES,
                ARFOBlocks.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES,
                ARFOBlocks.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES,
                ARFOBlocks.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.DARK_FOREST_OAK_LEAVES,
                ARFOBlocks.DARK_FOREST_OAK_LEAVES_CARPET
        );

        blockColors.register(LUSH_SWAMP_COLOR,
                ARFOBlocks.LUSH_SWAMP_GRASS_BLOCK,
                ARFOBlocks.LUSH_SWAMP_GRASS_SLAB,
                ARFOBlocks.LUSH_SWAMP_GRASS,
                ARFOBlocks.TALL_LUSH_SWAMP_GRASS,
                ARFOBlocks.LUSH_SWAMP_FERN,
                ARFOBlocks.LARGE_LUSH_SWAMP_FERN,
                ARFOBlocks.LUSH_SWAMP_SUGAR_CANE,
                ARFOBlocks.GLOWING_LUSH_SWAMP_GRASS_BLOCK,
                ARFOBlocks.POTTED_LUSH_SWAMP_FERN
        );

        blockColors.register(LUSH_SWAMP_LEAVE_COLOR,
                ARFOBlocks.LUSH_SWAMP_VINE,
                ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES,
                ARFOBlocks.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES,
                ARFOBlocks.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES,
                ARFOBlocks.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.LUSH_SWAMP_OAK_LEAVES,
                ARFOBlocks.LUSH_SWAMP_OAK_LEAVES_CARPET
        );

        blockColors.register(SWAMP_COLOR,
                ARFOBlocks.SWAMP_GRASS_BLOCK,
                ARFOBlocks.SWAMP_GRASS_SLAB,
                ARFOBlocks.SWAMP_GRASS,
                ARFOBlocks.TALL_SWAMP_GRASS,
                ARFOBlocks.SWAMP_FERN,
                ARFOBlocks.LARGE_SWAMP_FERN,
                ARFOBlocks.SWAMP_SUGAR_CANE,
                ARFOBlocks.GLOWING_SWAMP_GRASS_BLOCK,
                ARFOBlocks.POTTED_SWAMP_FERN
        );

        blockColors.register(SWAMP_LEAVE_COLOR,
                ARFOBlocks.SWAMP_VINE,
                ARFOBlocks.SWAMP_ACACIA_LEAVES,
                ARFOBlocks.SWAMP_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SWAMP_DARK_OAK_LEAVES,
                ARFOBlocks.SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SWAMP_JUNGLE_LEAVES,
                ARFOBlocks.SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SWAMP_OAK_LEAVES,
                ARFOBlocks.SWAMP_OAK_LEAVES_CARPET
        );

        blockColors.register(SAVANNA_COLOR,
                ARFOBlocks.SAVANNA_GRASS_BLOCK,
                ARFOBlocks.SAVANNA_GRASS_SLAB,
                ARFOBlocks.SAVANNA_GRASS,
                ARFOBlocks.TALL_SAVANNA_GRASS,
                ARFOBlocks.SAVANNA_FERN,
                ARFOBlocks.LARGE_SAVANNA_FERN,
                ARFOBlocks.SAVANNA_SUGAR_CANE,
                ARFOBlocks.GLOWING_SAVANNA_GRASS_BLOCK,
                ARFOBlocks.POTTED_SAVANNA_FERN
        );
        blockColors.register(SAVANNA_LEAVE_COLOR,
                ARFOBlocks.SAVANNA_VINE,
                ARFOBlocks.SAVANNA_ACACIA_LEAVES,
                ARFOBlocks.SAVANNA_ACACIA_LEAVES_CARPET,
                ARFOBlocks.SAVANNA_DARK_OAK_LEAVES,
                ARFOBlocks.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.SAVANNA_JUNGLE_LEAVES,
                ARFOBlocks.SAVANNA_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.SAVANNA_OAK_LEAVES,
                ARFOBlocks.SAVANNA_OAK_LEAVES_CARPET
        );

        blockColors.register(BADLANDS_COLOR,
                ARFOBlocks.BADLANDS_GRASS_BLOCK,
                ARFOBlocks.BADLANDS_GRASS_SLAB,
                ARFOBlocks.BADLANDS_GRASS,
                ARFOBlocks.TALL_BADLANDS_GRASS,
                ARFOBlocks.BADLANDS_FERN,
                ARFOBlocks.LARGE_BADLANDS_FERN,
                ARFOBlocks.BADLANDS_SUGAR_CANE,
                ARFOBlocks.GLOWING_BADLANDS_GRASS_BLOCK,
                ARFOBlocks.POTTED_BADLANDS_FERN
        );

        blockColors.register(BADLANDS_LEAVE_COLOR,
                ARFOBlocks.BADLANDS_VINE,
                ARFOBlocks.BADLANDS_ACACIA_LEAVES,
                ARFOBlocks.BADLANDS_ACACIA_LEAVES_CARPET,
                ARFOBlocks.BADLANDS_DARK_OAK_LEAVES,
                ARFOBlocks.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ARFOBlocks.BADLANDS_JUNGLE_LEAVES,
                ARFOBlocks.BADLANDS_JUNGLE_LEAVES_CARPET,
                ARFOBlocks.BADLANDS_OAK_LEAVES,
                ARFOBlocks.BADLANDS_OAK_LEAVES_CARPET
        );


        // spruce and birch color
        blockColors.register(new IBlockColor() {
            @Override
            public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader reader, @Nullable BlockPos pos, int p_getColor_4_) {
                return reader != null && pos != null ? FoliageColors.getEvergreenColor() : FoliageColors.getDefaultColor();
            }
        }, ARFOBlocks.SPRUCE_LEAVES_CARPET);

        blockColors.register(new IBlockColor() {
            @Override
            public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader reader, @Nullable BlockPos pos, int p_getColor_4_) {
                return reader != null && pos != null ? FoliageColors.getBirchColor() : FoliageColors.get(0.5D, 1.0D);
            }
        }, ARFOBlocks.BIRCH_LEAVES_CARPET);


        // vanilla grass slab
        blockColors.register(new IBlockColor() {
            @Override
            public int getColor(BlockState p_getColor_1_, @Nullable IBlockDisplayReader reader, @Nullable BlockPos pos, int p_getColor_4_) {
                return reader != null && pos != null ?  BiomeColors.getAverageGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);

            }
        }, ARFOBlocks.GRASS_SLAB, BYGBlocks.BYG_MEADOW_GRASS_SLAB);


        blockColors.register(ColorProvider.JUNGLE_COLOR, ARFOBlocks.JUNGLE_OVERGROWN_STONE, ARFOBlocks.JUNGLE_OVERGROWN_STONE_SLAB, ARFOBlocks.JUNGLE_OVERGROWN_DACITE, ARFOBlocks.JUNGLE_OVERGROWN_DACITE_SLAB, ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK, ARFOBlocks.JUNGLE_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.JUNGLE_EDGE_COLOR, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_STONE_SLAB, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_DACITE_SLAB, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK, ARFOBlocks.JUNGLE_EDGE_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.BADLANDS_COLOR, ARFOBlocks.BADLANDS_OVERGROWN_STONE, ARFOBlocks.BADLANDS_OVERGROWN_STONE_SLAB, ARFOBlocks.BADLANDS_OVERGROWN_DACITE, ARFOBlocks.BADLANDS_OVERGROWN_DACITE_SLAB, ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK, ARFOBlocks.BADLANDS_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.SAVANNA_COLOR, ARFOBlocks.SAVANNA_OVERGROWN_STONE, ARFOBlocks.SAVANNA_OVERGROWN_STONE_SLAB, ARFOBlocks.SAVANNA_OVERGROWN_DACITE, ARFOBlocks.SAVANNA_OVERGROWN_DACITE_SLAB, ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK, ARFOBlocks.SAVANNA_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.FOREST_COLOR, ARFOBlocks.FOREST_OVERGROWN_STONE, ARFOBlocks.FOREST_OVERGROWN_STONE_SLAB, ARFOBlocks.FOREST_OVERGROWN_DACITE, ARFOBlocks.FOREST_OVERGROWN_DACITE_SLAB, ARFOBlocks.FOREST_OVERGROWN_NETHERRACK, ARFOBlocks.FOREST_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.BIRCH_FOREST_COLOR, ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE, ARFOBlocks.BIRCH_FOREST_OVERGROWN_STONE_SLAB, ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE, ARFOBlocks.BIRCH_FOREST_OVERGROWN_DACITE_SLAB, ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK, ARFOBlocks.BIRCH_FOREST_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.DARK_FOREST_COLOR, ARFOBlocks.DARK_FOREST_OVERGROWN_STONE, ARFOBlocks.DARK_FOREST_OVERGROWN_STONE_SLAB, ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE, ARFOBlocks.DARK_FOREST_OVERGROWN_DACITE_SLAB, ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK, ARFOBlocks.DARK_FOREST_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.PLAINS_COLOR, ARFOBlocks.PLAINS_OVERGROWN_STONE, ARFOBlocks.PLAINS_OVERGROWN_STONE_SLAB, ARFOBlocks.PLAINS_OVERGROWN_DACITE, ARFOBlocks.PLAINS_OVERGROWN_DACITE_SLAB, ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK, ARFOBlocks.PLAINS_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.SWAMP_COLOR, ARFOBlocks.SWAMP_OVERGROWN_STONE, ARFOBlocks.SWAMP_OVERGROWN_STONE_SLAB, ARFOBlocks.SWAMP_OVERGROWN_DACITE, ARFOBlocks.SWAMP_OVERGROWN_DACITE_SLAB, ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK, ARFOBlocks.SWAMP_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.LUSH_SWAMP_COLOR, ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE, ARFOBlocks.LUSH_SWAMP_OVERGROWN_STONE_SLAB, ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE, ARFOBlocks.LUSH_SWAMP_OVERGROWN_DACITE_SLAB, ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK, ARFOBlocks.LUSH_SWAMP_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.MOUNTAINS_COLOR, ARFOBlocks.MOUNTAINS_OVERGROWN_STONE, ARFOBlocks.MOUNTAINS_OVERGROWN_STONE_SLAB, ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE, ARFOBlocks.MOUNTAINS_OVERGROWN_DACITE_SLAB, ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK, ARFOBlocks.MOUNTAINS_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.MUSHROOM_FIELDS_COLOR, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_STONE_SLAB, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_DACITE_SLAB, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK, ARFOBlocks.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.TAIGA_COLOR, ARFOBlocks.TAIGA_OVERGROWN_STONE, ARFOBlocks.TAIGA_OVERGROWN_STONE_SLAB, ARFOBlocks.TAIGA_OVERGROWN_DACITE, ARFOBlocks.TAIGA_OVERGROWN_DACITE_SLAB, ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK, ARFOBlocks.TAIGA_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.MEGA_TAIGA_COLOR, ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE, ARFOBlocks.MEGA_TAIGA_OVERGROWN_STONE_SLAB, ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE, ARFOBlocks.MEGA_TAIGA_OVERGROWN_DACITE_SLAB, ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK, ARFOBlocks.MEGA_TAIGA_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.SNOWY_COLOR, ARFOBlocks.SNOWY_OVERGROWN_STONE, ARFOBlocks.SNOWY_OVERGROWN_STONE_SLAB, ARFOBlocks.SNOWY_OVERGROWN_DACITE, ARFOBlocks.SNOWY_OVERGROWN_DACITE_SLAB, ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK, ARFOBlocks.SNOWY_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.SNOWY_BEACH_COLOR, ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE, ARFOBlocks.SNOWY_BEACH_OVERGROWN_STONE_SLAB, ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE, ARFOBlocks.SNOWY_BEACH_OVERGROWN_DACITE_SLAB, ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK, ARFOBlocks.SNOWY_BEACH_OVERGROWN_NETHERRACK_SLAB);
        blockColors.register(ColorProvider.WATERS_COLOR, ARFOBlocks.WATERS_OVERGROWN_STONE, ARFOBlocks.WATERS_OVERGROWN_STONE_SLAB, ARFOBlocks.WATERS_OVERGROWN_DACITE, ARFOBlocks.WATERS_OVERGROWN_DACITE_SLAB, ARFOBlocks.WATERS_OVERGROWN_NETHERRACK, ARFOBlocks.WATERS_OVERGROWN_NETHERRACK_SLAB);


    }


    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final ItemColors itemColors = event.getItemColors();


        // block items
        itemColors.register(ColorProvider.MUSHROOM_FIELDS_ITEM_COLOR,
                ARFOItems.MUSHROOM_FIELDS_GRASS_BLOCK,
                ARFOItems.MUSHROOM_FIELDS_GRASS,
                ARFOItems.TALL_MUSHROOM_FIELDS_GRASS,
                ARFOItems.MUSHROOM_FIELDS_FERN,
                ARFOItems.LARGE_MUSHROOM_FIELDS_FERN,
                ARFOItems.MUSHROOM_FIELDS_VINE,
                ARFOItems.MUSHROOM_FIELDS_SUGAR_CANE,
                ARFOItems.MUSHROOM_FIELDS_ACACIA_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_ACACIA_LEAVES_CARPET,
                ARFOItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.MUSHROOM_FIELDS_JUNGLE_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_JUNGLE_LEAVES_CARPET,
                ARFOItems.MUSHROOM_FIELDS_OAK_LEAVES,
                ARFOItems.MUSHROOM_FIELDS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_MUSHROOM_FIELDS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.JUNGLE_ITEM_COLOR,
                ARFOItems.JUNGLE_GRASS_BLOCK,
                ARFOItems.JUNGLE_GRASS,
                ARFOItems.TALL_JUNGLE_GRASS,
                ARFOItems.JUNGLE_FERN,
                ARFOItems.LARGE_JUNGLE_FERN,
                ARFOItems.JUNGLE_VINE,
                ARFOItems.JUNGLE_SUGAR_CANE,
                ARFOItems.TROPICAL_ACACIA_LEAVES,
                ARFOItems.TROPICAL_ACACIA_LEAVES_CARPET,
                ARFOItems.TROPICAL_DARK_OAK_LEAVES,
                ARFOItems.TROPICAL_DARK_OAK_LEAVES_CARPET,
                ARFOItems.TROPICAL_JUNGLE_LEAVES,
                ARFOItems.TROPICAL_JUNGLE_LEAVES_CARPET,
                ARFOItems.TROPICAL_OAK_LEAVES,
                ARFOItems.TROPICAL_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_JUNGLE_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.JUNGLE_EDGE_ITEM_COLOR,
                ARFOItems.JUNGLE_EDGE_GRASS_BLOCK,
                ARFOItems.JUNGLE_EDGE_GRASS,
                ARFOItems.TALL_JUNGLE_EDGE_GRASS,
                ARFOItems.JUNGLE_EDGE_FERN,
                ARFOItems.LARGE_JUNGLE_EDGE_FERN,
                ARFOItems.JUNGLE_EDGE_VINE,
                ARFOItems.JUNGLE_EDGE_SUGAR_CANE,
                ARFOItems.TROPICAL_EDGE_ACACIA_LEAVES,
                ARFOItems.TROPICAL_EDGE_ACACIA_LEAVES_CARPET,
                ARFOItems.TROPICAL_EDGE_DARK_OAK_LEAVES,
                ARFOItems.TROPICAL_EDGE_DARK_OAK_LEAVES_CARPET,
                ARFOItems.TROPICAL_EDGE_JUNGLE_LEAVES,
                ARFOItems.TROPICAL_EDGE_JUNGLE_LEAVES_CARPET,
                ARFOItems.TROPICAL_EDGE_OAK_LEAVES,
                ARFOItems.TROPICAL_EDGE_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_JUNGLE_EDGE_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.PLAINS_ITEM_COLOR,
                ARFOItems.PLAINS_GRASS_BLOCK,
                ARFOItems.PLAINS_GRASS,
                ARFOItems.TALL_PLAINS_GRASS,
                ARFOItems.PLAINS_FERN,
                ARFOItems.LARGE_PLAINS_FERN,
                ARFOItems.PLAINS_VINE,
                ARFOItems.PLAINS_SUGAR_CANE,
                ARFOItems.PLAINS_ACACIA_LEAVES,
                ARFOItems.PLAINS_ACACIA_LEAVES_CARPET,
                ARFOItems.PLAINS_DARK_OAK_LEAVES,
                ARFOItems.PLAINS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.PLAINS_JUNGLE_LEAVES,
                ARFOItems.PLAINS_JUNGLE_LEAVES_CARPET,
                ARFOItems.PLAINS_OAK_LEAVES,
                ARFOItems.PLAINS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_PLAINS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.FOREST_ITEM_COLOR,
                ARFOItems.FOREST_GRASS_BLOCK,
                ARFOItems.FOREST_GRASS,
                ARFOItems.TALL_FOREST_GRASS,
                ARFOItems.FOREST_FERN,
                ARFOItems.LARGE_FOREST_FERN,
                ARFOItems.FOREST_VINE,
                ARFOItems.FOREST_SUGAR_CANE,
                ARFOItems.FOREST_ACACIA_LEAVES,
                ARFOItems.FOREST_ACACIA_LEAVES_CARPET,
                ARFOItems.FOREST_DARK_OAK_LEAVES,
                ARFOItems.FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOItems.FOREST_JUNGLE_LEAVES,
                ARFOItems.FOREST_JUNGLE_LEAVES_CARPET,
                ARFOItems.FOREST_OAK_LEAVES,
                ARFOItems.FOREST_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_FOREST_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.BIRCH_FOREST_ITEM_COLOR,
                ARFOItems.BIRCH_FOREST_GRASS_BLOCK,
                ARFOItems.BIRCH_FOREST_GRASS,
                ARFOItems.TALL_BIRCH_FOREST_GRASS,
                ARFOItems.BIRCH_FOREST_FERN,
                ARFOItems.LARGE_BIRCH_FOREST_FERN,
                ARFOItems.BIRCH_FOREST_VINE,
                ARFOItems.BIRCH_FOREST_SUGAR_CANE,
                ARFOItems.BIRCH_FOREST_ACACIA_LEAVES,
                ARFOItems.BIRCH_FOREST_ACACIA_LEAVES_CARPET,
                ARFOItems.BIRCH_FOREST_DARK_OAK_LEAVES,
                ARFOItems.BIRCH_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOItems.BIRCH_FOREST_JUNGLE_LEAVES,
                ARFOItems.BIRCH_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOItems.BIRCH_FOREST_OAK_LEAVES,
                ARFOItems.BIRCH_FOREST_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_BIRCH_FOREST_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.WATERS_ITEM_COLOR,
                ARFOItems.WATERS_GRASS_BLOCK,
                ARFOItems.WATERS_GRASS,
                ARFOItems.TALL_WATERS_GRASS,
                ARFOItems.WATERS_FERN,
                ARFOItems.LARGE_WATERS_FERN,
                ARFOItems.WATERS_VINE,
                ARFOItems.WATERS_SUGAR_CANE,
                ARFOItems.WATERS_ACACIA_LEAVES,
                ARFOItems.WATERS_ACACIA_LEAVES_CARPET,
                ARFOItems.WATERS_DARK_OAK_LEAVES,
                ARFOItems.WATERS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.WATERS_JUNGLE_LEAVES,
                ARFOItems.WATERS_JUNGLE_LEAVES_CARPET,
                ARFOItems.WATERS_OAK_LEAVES,
                ARFOItems.WATERS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_WATERS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.MEGA_TAIGA_ITEM_COLOR,
                ARFOItems.MEGA_TAIGA_GRASS_BLOCK,
                ARFOItems.MEGA_TAIGA_GRASS,
                ARFOItems.TALL_MEGA_TAIGA_GRASS,
                ARFOItems.MEGA_TAIGA_FERN,
                ARFOItems.LARGE_MEGA_TAIGA_FERN,
                ARFOItems.MEGA_TAIGA_VINE,
                ARFOItems.MEGA_TAIGA_SUGAR_CANE,
                ARFOItems.MEGA_TAIGA_ACACIA_LEAVES,
                ARFOItems.MEGA_TAIGA_ACACIA_LEAVES_CARPET,
                ARFOItems.MEGA_TAIGA_DARK_OAK_LEAVES,
                ARFOItems.MEGA_TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOItems.MEGA_TAIGA_JUNGLE_LEAVES,
                ARFOItems.MEGA_TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOItems.MEGA_TAIGA_OAK_LEAVES,
                ARFOItems.MEGA_TAIGA_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_MEGA_TAIGA_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.TAIGA_ITEM_COLOR,
                ARFOItems.TAIGA_GRASS_BLOCK,
                ARFOItems.TAIGA_GRASS,
                ARFOItems.TALL_TAIGA_GRASS,
                ARFOItems.TAIGA_FERN,
                ARFOItems.LARGE_TAIGA_FERN,
                ARFOItems.TAIGA_VINE,
                ARFOItems.TAIGA_SUGAR_CANE,
                ARFOItems.TAIGA_ACACIA_LEAVES,
                ARFOItems.TAIGA_ACACIA_LEAVES_CARPET,
                ARFOItems.TAIGA_DARK_OAK_LEAVES,
                ARFOItems.TAIGA_DARK_OAK_LEAVES_CARPET,
                ARFOItems.TAIGA_JUNGLE_LEAVES,
                ARFOItems.TAIGA_JUNGLE_LEAVES_CARPET,
                ARFOItems.TAIGA_OAK_LEAVES,
                ARFOItems.TAIGA_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_TAIGA_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.MOUNTAINS_ITEM_COLOR,
                ARFOItems.MOUNTAINS_GRASS_BLOCK,
                ARFOItems.MOUNTAINS_GRASS,
                ARFOItems.TALL_MOUNTAINS_GRASS,
                ARFOItems.MOUNTAINS_FERN,
                ARFOItems.LARGE_MOUNTAINS_FERN,
                ARFOItems.MOUNTAINS_VINE,
                ARFOItems.MOUNTAINS_SUGAR_CANE,
                ARFOItems.MOUNTAINS_ACACIA_LEAVES,
                ARFOItems.MOUNTAINS_ACACIA_LEAVES_CARPET,
                ARFOItems.MOUNTAINS_DARK_OAK_LEAVES,
                ARFOItems.MOUNTAINS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.MOUNTAINS_JUNGLE_LEAVES,
                ARFOItems.MOUNTAINS_JUNGLE_LEAVES_CARPET,
                ARFOItems.MOUNTAINS_OAK_LEAVES,
                ARFOItems.MOUNTAINS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_MOUNTAINS_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SNOWY_ITEM_COLOR,
                ARFOItems.SNOWY_GRASS_BLOCK,
                ARFOItems.SNOWY_GRASS,
                ARFOItems.TALL_SNOWY_GRASS,
                ARFOItems.SNOWY_FERN,
                ARFOItems.LARGE_SNOWY_FERN,
                ARFOItems.SNOWY_VINE,
                ARFOItems.SNOWY_SUGAR_CANE,
                ARFOItems.SNOWY_ACACIA_LEAVES,
                ARFOItems.SNOWY_ACACIA_LEAVES_CARPET,
                ARFOItems.SNOWY_DARK_OAK_LEAVES,
                ARFOItems.SNOWY_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SNOWY_JUNGLE_LEAVES,
                ARFOItems.SNOWY_JUNGLE_LEAVES_CARPET,
                ARFOItems.SNOWY_OAK_LEAVES,
                ARFOItems.SNOWY_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SNOWY_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SNOWY_BEACH_ITEM_COLOR,
                ARFOItems.SNOWY_BEACH_GRASS_BLOCK,
                ARFOItems.SNOWY_BEACH_GRASS,
                ARFOItems.TALL_SNOWY_BEACH_GRASS,
                ARFOItems.SNOWY_BEACH_FERN,
                ARFOItems.LARGE_SNOWY_BEACH_FERN,
                ARFOItems.SNOWY_BEACH_VINE,
                ARFOItems.SNOWY_BEACH_SUGAR_CANE,
                ARFOItems.SNOWY_BEACH_ACACIA_LEAVES,
                ARFOItems.SNOWY_BEACH_ACACIA_LEAVES_CARPET,
                ARFOItems.SNOWY_BEACH_DARK_OAK_LEAVES,
                ARFOItems.SNOWY_BEACH_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SNOWY_BEACH_JUNGLE_LEAVES,
                ARFOItems.SNOWY_BEACH_JUNGLE_LEAVES_CARPET,
                ARFOItems.SNOWY_BEACH_OAK_LEAVES,
                ARFOItems.SNOWY_BEACH_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SNOWY_BEACH_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.DARK_FOREST_ITEM_COLOR,
                ARFOItems.DARK_FOREST_GRASS_BLOCK,
                ARFOItems.DARK_FOREST_GRASS,
                ARFOItems.TALL_DARK_FOREST_GRASS,
                ARFOItems.DARK_FOREST_FERN,
                ARFOItems.LARGE_DARK_FOREST_FERN,
                ARFOItems.DARK_FOREST_VINE,
                ARFOItems.DARK_FOREST_SUGAR_CANE,
                ARFOItems.DARK_FOREST_ACACIA_LEAVES,
                ARFOItems.DARK_FOREST_ACACIA_LEAVES_CARPET,
                ARFOItems.DARK_FOREST_DARK_OAK_LEAVES,
                ARFOItems.DARK_FOREST_DARK_OAK_LEAVES_CARPET,
                ARFOItems.DARK_FOREST_JUNGLE_LEAVES,
                ARFOItems.DARK_FOREST_JUNGLE_LEAVES_CARPET,
                ARFOItems.DARK_FOREST_OAK_LEAVES,
                ARFOItems.DARK_FOREST_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_DARK_FOREST_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.LUSH_SWAMP_ITEM_COLOR,
                ARFOItems.LUSH_SWAMP_GRASS_BLOCK,
                ARFOItems.LUSH_SWAMP_GRASS,
                ARFOItems.TALL_LUSH_SWAMP_GRASS,
                ARFOItems.LUSH_SWAMP_FERN,
                ARFOItems.LARGE_LUSH_SWAMP_FERN,
                ARFOItems.LUSH_SWAMP_VINE,
                ARFOItems.LUSH_SWAMP_SUGAR_CANE,
                ARFOItems.LUSH_SWAMP_ACACIA_LEAVES,
                ARFOItems.LUSH_SWAMP_ACACIA_LEAVES_CARPET,
                ARFOItems.LUSH_SWAMP_DARK_OAK_LEAVES,
                ARFOItems.LUSH_SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOItems.LUSH_SWAMP_JUNGLE_LEAVES,
                ARFOItems.LUSH_SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOItems.LUSH_SWAMP_OAK_LEAVES,
                ARFOItems.LUSH_SWAMP_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_LUSH_SWAMP_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SWAMP_ITEM_COLOR,
                ARFOItems.SWAMP_GRASS_BLOCK,
                ARFOItems.SWAMP_GRASS,
                ARFOItems.TALL_SWAMP_GRASS,
                ARFOItems.SWAMP_FERN,
                ARFOItems.LARGE_SWAMP_FERN,
                ARFOItems.SWAMP_VINE,
                ARFOItems.SWAMP_SUGAR_CANE,
                ARFOItems.SWAMP_ACACIA_LEAVES,
                ARFOItems.SWAMP_ACACIA_LEAVES_CARPET,
                ARFOItems.SWAMP_DARK_OAK_LEAVES,
                ARFOItems.SWAMP_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SWAMP_JUNGLE_LEAVES,
                ARFOItems.SWAMP_JUNGLE_LEAVES_CARPET,
                ARFOItems.SWAMP_OAK_LEAVES,
                ARFOItems.SWAMP_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SWAMP_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.SAVANNA_ITEM_COLOR,
                ARFOItems.SAVANNA_GRASS_BLOCK,
                ARFOItems.SAVANNA_GRASS,
                ARFOItems.TALL_SAVANNA_GRASS,
                ARFOItems.SAVANNA_FERN,
                ARFOItems.LARGE_SAVANNA_FERN,
                ARFOItems.SAVANNA_VINE,
                ARFOItems.SAVANNA_SUGAR_CANE,
                ARFOItems.SAVANNA_ACACIA_LEAVES,
                ARFOItems.SAVANNA_ACACIA_LEAVES_CARPET,
                ARFOItems.SAVANNA_DARK_OAK_LEAVES,
                ARFOItems.SAVANNA_DARK_OAK_LEAVES_CARPET,
                ARFOItems.SAVANNA_JUNGLE_LEAVES,
                ARFOItems.SAVANNA_JUNGLE_LEAVES_CARPET,
                ARFOItems.SAVANNA_OAK_LEAVES,
                ARFOItems.SAVANNA_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_SAVANNA_GRASS_BLOCK
        );

        itemColors.register(ColorProvider.BADLANDS_ITEM_COLOR,
                ARFOItems.BADLANDS_GRASS_BLOCK,
                ARFOItems.BADLANDS_GRASS,
                ARFOItems.TALL_BADLANDS_GRASS,
                ARFOItems.BADLANDS_FERN,
                ARFOItems.LARGE_BADLANDS_FERN,
                ARFOItems.BADLANDS_VINE,
                ARFOItems.BADLANDS_SUGAR_CANE,
                ARFOItems.BADLANDS_ACACIA_LEAVES,
                ARFOItems.BADLANDS_ACACIA_LEAVES_CARPET,
                ARFOItems.BADLANDS_DARK_OAK_LEAVES,
                ARFOItems.BADLANDS_DARK_OAK_LEAVES_CARPET,
                ARFOItems.BADLANDS_JUNGLE_LEAVES,
                ARFOItems.BADLANDS_JUNGLE_LEAVES_CARPET,
                ARFOItems.BADLANDS_OAK_LEAVES,
                ARFOItems.BADLANDS_OAK_LEAVES_CARPET,
                ARFOItems.GLOWING_BADLANDS_GRASS_BLOCK
        );


            // spruce and birch color
            itemColors.register(new IItemColor() {
                @Override
                public int getColor(ItemStack p_getColor_1_, int p_getColor_2_) {
                    return FoliageColors.getEvergreenColor();
                }
            }, ARFOBlocks.SPRUCE_LEAVES_CARPET);

            itemColors.register(new IItemColor() {
                @Override
                public int getColor(ItemStack stack, int tintIndex) {
                    return FoliageColors.getBirchColor();
                }
            }, ARFOBlocks.BIRCH_LEAVES_CARPET);

            // vanilla grass slab
            itemColors.register(new IItemColor() {
                @Override
                public int getColor(ItemStack stack, int tintIndex) {
                    return GrassColors.get(0.5D, 1.0D);
                }
            }, ARFOBlocks.GRASS_SLAB, BYGBlocks.BYG_MEADOW_GRASS_SLAB);


        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 6975545;
            }
        }, ARFOBlocks.SWAMP_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 5011004;
            }
        }, ARFOBlocks.LUSH_SWAMP_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 6975545;
            }
        }, ARFOBlocks.DARK_FOREST_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return 9470285;
            }
        }, ARFOBlocks.BADLANDS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.05D, 0.3D);
            }
        }, ARFOBlocks.SNOWY_BEACH_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.25D, 0.8D);
            }
        }, ARFOBlocks.TAIGA_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.3D, 0.8D);
            }
        }, ARFOBlocks.MEGA_TAIGA_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.0D, 0.5D);
            }
        }, ARFOBlocks.SNOWY_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.9D, 1.0D);
            }
        }, ARFOBlocks.MUSHROOM_FIELDS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.2D, 0.3D);
            }
        }, ARFOBlocks.MOUNTAINS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.5D, 0.5D);
            }
        }, ARFOBlocks.WATERS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.8D, 0.4D);
            }
        }, ARFOBlocks.PLAINS_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.6D, 0.6D);
            }
        }, ARFOBlocks.BIRCH_FOREST_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.7D, 0.8D);
            }
        }, ARFOBlocks.FOREST_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.95D, 0.8D);
            }
        }, ARFOBlocks.JUNGLE_EDGE_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(1.0D, 0.0D);
            }
        }, ARFOBlocks.SAVANNA_GRASS_SLAB);

        itemColors.register(new IItemColor() {
            @Override
            public int getColor(ItemStack stack, int tintIndex) {
                return GrassColors.get(0.95D, 0.9D);
            }
        }, ARFOBlocks.JUNGLE_GRASS_SLAB);


        itemColors.register(ColorProvider.JUNGLE_ITEM_COLOR, ARFOItems.JUNGLE_OVERGROWN_STONE, ARFOItems.JUNGLE_OVERGROWN_STONE_SLAB, ARFOItems.JUNGLE_OVERGROWN_DACITE, ARFOItems.JUNGLE_OVERGROWN_DACITE_SLAB, ARFOItems.JUNGLE_OVERGROWN_NETHERRACK, ARFOItems.JUNGLE_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.JUNGLE_EDGE_ITEM_COLOR, ARFOItems.JUNGLE_EDGE_OVERGROWN_STONE, ARFOItems.JUNGLE_EDGE_OVERGROWN_STONE_SLAB, ARFOItems.JUNGLE_EDGE_OVERGROWN_DACITE, ARFOItems.JUNGLE_EDGE_OVERGROWN_DACITE_SLAB, ARFOItems.JUNGLE_EDGE_OVERGROWN_NETHERRACK, ARFOItems.JUNGLE_EDGE_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.BADLANDS_ITEM_COLOR, ARFOItems.BADLANDS_OVERGROWN_STONE, ARFOItems.BADLANDS_OVERGROWN_STONE_SLAB, ARFOItems.BADLANDS_OVERGROWN_DACITE, ARFOItems.BADLANDS_OVERGROWN_DACITE_SLAB, ARFOItems.BADLANDS_OVERGROWN_NETHERRACK, ARFOItems.BADLANDS_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.SAVANNA_ITEM_COLOR, ARFOItems.SAVANNA_OVERGROWN_STONE, ARFOItems.SAVANNA_OVERGROWN_STONE_SLAB, ARFOItems.SAVANNA_OVERGROWN_DACITE, ARFOItems.SAVANNA_OVERGROWN_DACITE_SLAB, ARFOItems.SAVANNA_OVERGROWN_NETHERRACK, ARFOItems.SAVANNA_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.FOREST_ITEM_COLOR, ARFOItems.FOREST_OVERGROWN_STONE, ARFOItems.FOREST_OVERGROWN_STONE_SLAB, ARFOItems.FOREST_OVERGROWN_DACITE, ARFOItems.FOREST_OVERGROWN_DACITE_SLAB, ARFOItems.FOREST_OVERGROWN_NETHERRACK, ARFOItems.FOREST_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.BIRCH_FOREST_ITEM_COLOR, ARFOItems.BIRCH_FOREST_OVERGROWN_STONE, ARFOItems.BIRCH_FOREST_OVERGROWN_STONE_SLAB, ARFOItems.BIRCH_FOREST_OVERGROWN_DACITE, ARFOItems.BIRCH_FOREST_OVERGROWN_DACITE_SLAB, ARFOItems.BIRCH_FOREST_OVERGROWN_NETHERRACK, ARFOItems.BIRCH_FOREST_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.DARK_FOREST_ITEM_COLOR, ARFOItems.DARK_FOREST_OVERGROWN_STONE, ARFOItems.DARK_FOREST_OVERGROWN_STONE_SLAB, ARFOItems.DARK_FOREST_OVERGROWN_DACITE, ARFOItems.DARK_FOREST_OVERGROWN_DACITE_SLAB, ARFOItems.DARK_FOREST_OVERGROWN_NETHERRACK, ARFOItems.DARK_FOREST_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.PLAINS_ITEM_COLOR, ARFOItems.PLAINS_OVERGROWN_STONE, ARFOItems.PLAINS_OVERGROWN_STONE_SLAB, ARFOItems.PLAINS_OVERGROWN_DACITE, ARFOItems.PLAINS_OVERGROWN_DACITE_SLAB, ARFOItems.PLAINS_OVERGROWN_NETHERRACK, ARFOItems.PLAINS_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.SWAMP_ITEM_COLOR, ARFOItems.SWAMP_OVERGROWN_STONE, ARFOItems.SWAMP_OVERGROWN_STONE_SLAB, ARFOItems.SWAMP_OVERGROWN_DACITE, ARFOItems.SWAMP_OVERGROWN_DACITE_SLAB, ARFOItems.SWAMP_OVERGROWN_NETHERRACK, ARFOItems.SWAMP_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.LUSH_SWAMP_ITEM_COLOR, ARFOItems.LUSH_SWAMP_OVERGROWN_STONE, ARFOItems.LUSH_SWAMP_OVERGROWN_STONE_SLAB, ARFOItems.LUSH_SWAMP_OVERGROWN_DACITE, ARFOItems.LUSH_SWAMP_OVERGROWN_DACITE_SLAB, ARFOItems.LUSH_SWAMP_OVERGROWN_NETHERRACK, ARFOItems.LUSH_SWAMP_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.MOUNTAINS_ITEM_COLOR, ARFOItems.MOUNTAINS_OVERGROWN_STONE, ARFOItems.MOUNTAINS_OVERGROWN_STONE_SLAB, ARFOItems.MOUNTAINS_OVERGROWN_DACITE, ARFOItems.MOUNTAINS_OVERGROWN_DACITE_SLAB, ARFOItems.MOUNTAINS_OVERGROWN_NETHERRACK, ARFOItems.MOUNTAINS_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.MUSHROOM_FIELDS_ITEM_COLOR, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_STONE, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_STONE_SLAB, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_DACITE, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_DACITE_SLAB, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK, ARFOItems.MUSHROOM_FIELDS_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.TAIGA_ITEM_COLOR, ARFOItems.TAIGA_OVERGROWN_STONE, ARFOItems.TAIGA_OVERGROWN_STONE_SLAB, ARFOItems.TAIGA_OVERGROWN_DACITE, ARFOItems.TAIGA_OVERGROWN_DACITE_SLAB, ARFOItems.TAIGA_OVERGROWN_NETHERRACK, ARFOItems.TAIGA_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.MEGA_TAIGA_ITEM_COLOR, ARFOItems.MEGA_TAIGA_OVERGROWN_STONE, ARFOItems.MEGA_TAIGA_OVERGROWN_STONE_SLAB, ARFOItems.MEGA_TAIGA_OVERGROWN_DACITE, ARFOItems.MEGA_TAIGA_OVERGROWN_DACITE_SLAB, ARFOItems.MEGA_TAIGA_OVERGROWN_NETHERRACK, ARFOItems.MEGA_TAIGA_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.SNOWY_ITEM_COLOR, ARFOItems.SNOWY_OVERGROWN_STONE, ARFOItems.SNOWY_OVERGROWN_STONE_SLAB, ARFOItems.SNOWY_OVERGROWN_DACITE, ARFOItems.SNOWY_OVERGROWN_DACITE_SLAB, ARFOItems.SNOWY_OVERGROWN_NETHERRACK, ARFOItems.SNOWY_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.SNOWY_BEACH_ITEM_COLOR, ARFOItems.SNOWY_BEACH_OVERGROWN_STONE, ARFOItems.SNOWY_BEACH_OVERGROWN_STONE_SLAB, ARFOItems.SNOWY_BEACH_OVERGROWN_DACITE, ARFOItems.SNOWY_BEACH_OVERGROWN_DACITE_SLAB, ARFOItems.SNOWY_BEACH_OVERGROWN_NETHERRACK, ARFOItems.SNOWY_BEACH_OVERGROWN_NETHERRACK_SLAB);
        itemColors.register(ColorProvider.WATERS_ITEM_COLOR, ARFOItems.WATERS_OVERGROWN_STONE, ARFOItems.WATERS_OVERGROWN_STONE_SLAB, ARFOItems.WATERS_OVERGROWN_DACITE, ARFOItems.WATERS_OVERGROWN_DACITE_SLAB, ARFOItems.WATERS_OVERGROWN_NETHERRACK, ARFOItems.WATERS_OVERGROWN_NETHERRACK_SLAB);


    }


}
