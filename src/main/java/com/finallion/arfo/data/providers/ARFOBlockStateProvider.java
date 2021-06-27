package com.finallion.arfo.data.providers;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.blocks.*;
import com.finallion.arfo.compat.BOP.BOPBlocks;
import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.utils.BlockMapping;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.stream.Collectors;

public class ARFOBlockStateProvider extends BlockStateProvider {
    public ARFOBlockStateProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
    }


    @Override
    protected void registerStatesAndModels() {
        Set<Block> blocks = Registry.BLOCK.stream()
                .filter(b -> ArtificialFoliage.MODID.equals(Registry.BLOCK.getKey(b).getNamespace()))
                .collect(Collectors.toSet());

        // manuel block states and models
        blocks.remove(ARFOBlocks.ALPHA_GRASS_BLOCK);
        blocks.remove(ARFOBlocks.ALPHA_LEAVES);
        blocks.remove(ARFOBlocks.ARTIFICIAL_SOIL);
        blocks.remove(ARFOBlocks.ARTIFICIAL_SOIL_SLAB);
        blocks.remove(ARFOBlocks.ARTIFICIAL_STONE_SOIL);
        blocks.remove(ARFOBlocks.ARTIFICIAL_STONE_SOIL_SLAB);
        blocks.remove(ARFOBlocks.GLOWING_CRIMSON_NYLIUM);
        blocks.remove(ARFOBlocks.GLOWING_WARPED_NYLIUM);
        blocks.remove(ARFOBlocks.GRASS_SLAB);
        blocks.remove(ARFOBlocks.GRASS_PATH_SLAB);
        blocks.remove(ARFOBlocks.CRIMSON_NYLIUM_SLAB);
        blocks.remove(ARFOBlocks.WARPED_NYLIUM_SLAB);
        blocks.remove(ARFOBlocks.COARSE_DIRT_SLAB);
        blocks.remove(ARFOBlocks.DIRT_SLAB);
        blocks.remove(ARFOBlocks.NETHERRACK_SLAB);
        blocks.remove(ARFOBlocks.MYCELIUM_SLAB);
        blocks.remove(ARFOBlocks.PODZOL_SLAB);
        blocks.remove(ARFOBlocks.SPRUCE_LEAVES_CARPET);
        blocks.remove(ARFOBlocks.BIRCH_LEAVES_CARPET);
        blocks.remove(ARFOBlocks.SWAMP_WATER);
        blocks.remove(ARFOBlocks.OCEAN_WATER);
        blocks.remove(ARFOBlocks.COLD_OCEAN_WATER);
        blocks.remove(ARFOBlocks.FROZEN_OCEAN_WATER);
        blocks.remove(ARFOBlocks.WARM_OCEAN_WATER);
        blocks.remove(ARFOBlocks.LUKEWARM_OCEAN_WATER);
        blocks.remove(ARFOBlocks.ARTIFICIAL_CORAL_SAPLING);

        blocks.remove(BYGBlocks.BYG_EMBUR_NYLIUM_SLAB);
        blocks.remove(BYGBlocks.BYG_SYTHIAN_NYLIUM_SLAB);
        blocks.remove(BYGBlocks.BYG_PODZOL_DACITE_SLAB);
        blocks.remove(BYGBlocks.BYG_BLUE_NETHERRACK_SLAB);
        blocks.remove(BYGBlocks.BYG_OVERGROWN_CRIMSON_BLACKSTONE_SLAB);
        blocks.remove(BYGBlocks.BYG_MYCELIUM_NETHERRACK_SLAB);
        blocks.remove(BYGBlocks.BYG_MEADOW_DIRT_SLAB);
        blocks.remove(BYGBlocks.BYG_MEADOW_GRASS_SLAB);
        blocks.remove(BYGBlocks.BYG_ETHEREAL_ISLANDS_WATER);
        blocks.remove(BYGBlocks.BYG_BULBIS_GARDENS_WATER);
        blocks.remove(BYGBlocks.BYG_CRAG_GARDENS_WATER);
        blocks.remove(BYGBlocks.BYG_DEAD_SEA_WATER);
        blocks.remove(BYGBlocks.BYG_GLOWSHROOM_BAYOU_WATER);
        blocks.remove(BYGBlocks.BYG_IMPARIUS_GROVE_WATER);
        blocks.remove(BYGBlocks.BYG_POLLUTED_LAKE_WATER);
        blocks.remove(BYGBlocks.BYG_SHULKREN_FOREST_WATER);
        blocks.remove(BYGBlocks.BYG_TROPICAL_ISLAND_WATER);
        blocks.remove(BYGBlocks.BYG_VIBRANT_SWAMPLAND_WATER);

        blocks.remove(BOPBlocks.BOP_BAYOU_WATER);
        blocks.remove(BOPBlocks.BOP_MYSTIC_GROVE_WATER);
        blocks.remove(BOPBlocks.BOP_OMINOUS_WOODS_WATER);
        blocks.remove(BOPBlocks.BOP_ORIGIN_VALLEY_WATER);
        blocks.remove(BOPBlocks.BOP_RAINFOREST_WATER);
        blocks.remove(BOPBlocks.BOP_WASTELAND_WATER);
        blocks.remove(BOPBlocks.BOP_WETLAND_WATER);

        blocks.remove(TraverseBlocks.TRAVERSE_MINI_JUNGLE_WATER);
        blocks.remove(TraverseBlocks.TRAVERSE_CLIFFS_WATER);
        blocks.remove(TraverseBlocks.TRAVERSE_LUSH_SWAMP_WATER);
        blocks.remove(TraverseBlocks.TRAVERSE_RED_AUTUMNAL_LEAVES_CARPET);
        blocks.remove(TraverseBlocks.TRAVERSE_ORANGE_AUTUMNAL_LEAVES_CARPET);
        blocks.remove(TraverseBlocks.TRAVERSE_YELLOW_AUTUMNAL_LEAVES_CARPET);
        blocks.remove(TraverseBlocks.TRAVERSE_BROWN_AUTUMNAL_LEAVES_CARPET);


        for (Block block : blocks) {
            String name = Registry.BLOCK.getKey(block).getPath();

            if (block.toString().contains("acacia_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID, "block/leaf_carpet"))
                        .texture("all", "minecraft:block/acacia_leaves");

                ModelFile slab_model = models().withExistingParent(name + "_down", new ResourceLocation(ArtificialFoliage.MODID, "block/leaf_carpet_down"))
                        .texture("all", "minecraft:block/acacia_leaves");


                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(model))
                        .partialState().with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_model));

                //simpleBlock(block, model);
            } else if (block.toString().contains("dark_oak_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID,"block/leaf_carpet"))
                        .texture("all", "minecraft:block/dark_oak_leaves");

                ModelFile slab_model = models().withExistingParent(name + "_down", new ResourceLocation(ArtificialFoliage.MODID, "block/leaf_carpet_down"))
                        .texture("all", "minecraft:block/dark_oak_leaves");


                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(model))
                        .partialState().with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_model));
                //simpleBlock(block, model);
            } else if (block.toString().contains("oak_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID,"block/leaf_carpet"))
                        .texture("all", "minecraft:block/oak_leaves");

                ModelFile slab_model = models().withExistingParent(name + "_down", new ResourceLocation(ArtificialFoliage.MODID, "block/leaf_carpet_down"))
                        .texture("all", "minecraft:block/oak_leaves");


                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(model))
                        .partialState().with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_model));

                //simpleBlock(block, model);
            } else if (block.toString().contains("jungle_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID,"block/leaf_carpet"))
                        .texture("all", "minecraft:block/jungle_leaves");

                ModelFile slab_model = models().withExistingParent(name + "_down", new ResourceLocation(ArtificialFoliage.MODID, "block/leaf_carpet_down"))
                        .texture("all", "minecraft:block/jungle_leaves");


                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(model))
                        .partialState().with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_model));

                //simpleBlock(block, model);


            } else if (block instanceof ARFOAcaciaLeavesBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/acacia_leaves"))
                        .texture("all", "minecraft:block/acacia_leaves");
                simpleBlock(block, model);
            } else if (block instanceof ARFODarkOakLeavesBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/dark_oak_leaves"))
                        .texture("all", "minecraft:block/dark_oak_leaves");
                simpleBlock(block, model);
            } else if (block instanceof ARFOOakLeavesBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/oak_leaves"))
                        .texture("all", "minecraft:block/oak_leaves");
                simpleBlock(block, model);
            } else if (block instanceof ARFOJungleLeavesBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/jungle_leaves"))
                        .texture("all", "minecraft:block/jungle_leaves");
                simpleBlock(block, model);
            } else if (block instanceof ARFOGlowingGrassBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/grass_block"))
                        .texture("all", "minecraft:block/grass_block_top");
                simpleBlock(block, model);
            } else if (block instanceof ARFOSpreadableGrassBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/grass_block"))
                        .texture("all", "minecraft:block/grass_block_top");

                ModelFile snow = models().cubeBottomTop("grass_block_snow",
                        new ResourceLocation("minecraft:block/grass_block_snow"),
                        new ResourceLocation("minecraft:block/dirt"),
                        new ResourceLocation("minecraft:block/snow"))
                        .texture("particle", "minecraft:block/dirt");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SNOWY, false)
                        .setModels(new ConfiguredModel(model),
                                new ConfiguredModel(model, 0, 90, false),
                                new ConfiguredModel(model, 0, 180, false),
                                new ConfiguredModel(model, 0, 270, false))
                        .partialState().with(BlockStateProperties.SNOWY, true)
                        .setModels(new ConfiguredModel(snow));

            } else if (block.toString().contains("overgrown_stone") && !block.toString().contains("slab")) {
                ModelFile normal = models().withExistingParent(name, new ResourceLocation("minecraft:block/block"))
                        .texture("side", "arfo:blocks/byg_overgrown_stone_side")
                        .texture("bottom", "minecraft:block/stone")
                        .texture("top","arfo:blocks/byg_overgrown_stone_top")
                        .texture("overlay", "arfo:blocks/byg_overgrown_stone_side_overlay")
                        .texture("particle", "minecraft:block/stone")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();



                ModelFile snow = models().cubeBottomTop("overgrown_stone_snowy",
                        new ResourceLocation("arfo:blocks/byg_overgrown_stone_snow_side"),
                        new ResourceLocation("minecraft:block/stone"),
                        new ResourceLocation("minecraft:block/snow"))
                        .texture("particle", "minecraft:block/stone");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SNOWY, false)
                        .setModels(new ConfiguredModel(normal),
                                new ConfiguredModel(normal, 0, 90, false),
                                new ConfiguredModel(normal, 0, 180, false),
                                new ConfiguredModel(normal, 0, 270, false))
                        .partialState().with(BlockStateProperties.SNOWY, true)
                        .setModels(new ConfiguredModel(snow));

            } else if (block.toString().contains("overgrown_stone_slab")) {
                String grassBlockName = "";

                for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                    if (BlockMapping.slabAndBlocks.get(b).is(block)) {
                        grassBlockName = Registry.BLOCK.getKey(b).getPath();
                    }
                }


                ModelFile slab = models().withExistingParent(name, new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/stone")
                        .texture("bottom", "minecraft:block/stone")
                        .texture("top", "arfo:blocks/byg_overgrown_stone_top")
                        .texture("side", "arfo:blocks/byg_overgrown_stone_side")
                        .texture("overlay", "arfo:blocks/byg_overgrown_stone_side_overlay")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile slab_snow = models().withExistingParent(name + "_snow", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/stone")
                        .texture("bottom", "minecraft:block/stone")
                        .texture("top", "minecraft:block/snow")
                        .texture("side", "arfo:blocks/byg_overgrown_stone_snow_side")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").end()
                        .face(Direction.NORTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.EAST).end()
                        .end();

                ModelFile slab_top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/stone")
                        .texture("bottom", "minecraft:block/stone")
                        .texture("top", "arfo:blocks/byg_overgrown_stone_top")
                        .texture("side", "arfo:blocks/byg_overgrown_stone_side")
                        .texture("overlay", "arfo:blocks/byg_overgrown_stone_side_overlay")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile slab_top_snow = models().withExistingParent(name + "_top_snow", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/stone")
                        .texture("bottom", "minecraft:block/stone")
                        .texture("top", "minecraft:block/snow")
                        .texture("side", "arfo:blocks/byg_overgrown_stone_snow_side")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).end()
                        .face(Direction.NORTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.EAST).end()
                        .end();

                ModelFile grass_block = models().withExistingParent(grassBlockName, new ResourceLocation("minecraft:block/block"))
                        .texture("side", "arfo:blocks/byg_overgrown_stone_side")
                        .texture("bottom", "minecraft:block/stone")
                        .texture("top","arfo:blocks/byg_overgrown_stone_top")
                        .texture("overlay", "arfo:blocks/byg_overgrown_stone_side_overlay")
                        .texture("particle", "minecraft:block/stone")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile snow_block = models().cubeBottomTop("overgrown_stone_snowy",
                        new ResourceLocation("arfo:blocks/byg_overgrown_stone_snow_side"),
                        new ResourceLocation("minecraft:block/stone"),
                        new ResourceLocation("minecraft:block/snow"))
                        .texture("particle", "minecraft:block/stone");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab))
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top))
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(grass_block))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab_snow))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top_snow))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(snow_block));



            } else if (block.toString().contains("overgrown_netherrack_slab")) {
                String grassBlockName = "";

                for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                    if (BlockMapping.slabAndBlocks.get(b).is(block)) {
                        grassBlockName = Registry.BLOCK.getKey(b).getPath();
                    }
                }


                ModelFile slab = models().withExistingParent(name, new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/netherrack")
                        .texture("bottom", "minecraft:block/netherrack")
                        .texture("top", "arfo:blocks/byg_overgrown_netherrack_top")
                        .texture("side", "arfo:blocks/byg_overgrown_netherrack_side")
                        .texture("overlay", "arfo:blocks/byg_overgrown_netherrack_side_overlay")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();


                ModelFile slab_top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/netherrack")
                        .texture("bottom", "minecraft:block/netherrack")
                        .texture("top", "arfo:blocks/byg_overgrown_netherrack_top")
                        .texture("side", "arfo:blocks/byg_overgrown_netherrack_side")
                        .texture("overlay", "arfo:blocks/byg_overgrown_netherrack_side_overlay")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile grass_block = models().withExistingParent(grassBlockName, new ResourceLocation("minecraft:block/block"))
                        .texture("side", "arfo:blocks/byg_overgrown_netherrack_side")
                        .texture("bottom", "minecraft:block/netherrack")
                        .texture("top","arfo:blocks/byg_overgrown_netherrack_top")
                        .texture("overlay", "arfo:blocks/byg_overgrown_netherrack_side_overlay")
                        .texture("particle", "minecraft:block/netherrack")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab))
                        .partialState().with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top))
                        .partialState().with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(grass_block));


            } else if (block.toString().contains("overgrown_dacite_slab")) {
                String grassBlockName = "";

                for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                    if (BlockMapping.slabAndBlocks.get(b).is(block)) {
                        grassBlockName = Registry.BLOCK.getKey(b).getPath();
                    }
                }


                ModelFile slab = models().withExistingParent(name, new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("bottom", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("top", "arfo:blocks/byg_overgrown_dacite_top")
                        .texture("side", "arfo:blocks/byg_overgrown_dacite_side")
                        .texture("overlay", "arfo:blocks/byg_overgrown_dacite_side_overlay")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile slab_snow = models().withExistingParent(name + "_snow", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("bottom", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("top", "minecraft:block/snow")
                        .texture("side", "arfo:blocks/byg_overgrown_dacite_snow_side")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").end()
                        .face(Direction.NORTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.EAST).end()
                        .end();

                ModelFile slab_top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("bottom", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("top", "arfo:blocks/byg_overgrown_dacite_top")
                        .texture("side", "arfo:blocks/byg_overgrown_dacite_side")
                        .texture("overlay", "arfo:blocks/byg_overgrown_dacite_side_overlay")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile slab_top_snow = models().withExistingParent(name + "_top_snow", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("bottom", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("top", "minecraft:block/snow")
                        .texture("side", "arfo:blocks/byg_overgrown_dacite_snow_side")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).end()
                        .face(Direction.NORTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.EAST).end()
                        .end();

                ModelFile grass_block = models().withExistingParent(grassBlockName, new ResourceLocation("minecraft:block/block"))
                        .texture("side", "arfo:blocks/byg_overgrown_dacite_side")
                        .texture("bottom", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("top","arfo:blocks/byg_overgrown_dacite_top")
                        .texture("overlay", "arfo:blocks/byg_overgrown_dacite_side_overlay")
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile snow_block = models().cubeBottomTop("overgrown_dacite_snowy",
                        new ResourceLocation("arfo:blocks/byg_overgrown_dacite_snow_side"),
                        new ResourceLocation("arfo:blocks/byg_overgrown_dacite_bottom"),
                        new ResourceLocation("minecraft:block/snow"))
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab))
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top))
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(grass_block))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab_snow))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top_snow))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(snow_block));

            } else if (block.toString().contains("overgrown_netherrack") && !block.toString().contains("slab")) {
                ModelFile normal = models().withExistingParent(name, new ResourceLocation("minecraft:block/block"))
                        .texture("side", "arfo:blocks/byg_overgrown_netherrack_side")
                        .texture("bottom", "minecraft:block/netherrack")
                        .texture("top","arfo:blocks/byg_overgrown_netherrack_top")
                        .texture("overlay", "arfo:blocks/byg_overgrown_netherrack_side_overlay")
                        .texture("particle", "minecraft:block/netherrack")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                getVariantBuilder(block)
                        .partialState()
                        .setModels(new ConfiguredModel(normal),
                                new ConfiguredModel(normal, 0, 90, false),
                                new ConfiguredModel(normal, 0, 180, false),
                                new ConfiguredModel(normal, 0, 270, false));

            } else if (block.toString().contains("overgrown_dacite") && !block.toString().contains("slab")) {
                ModelFile normal = models().withExistingParent(name, new ResourceLocation("minecraft:block/block"))
                        .texture("side", "arfo:blocks/byg_overgrown_dacite_side")
                        .texture("bottom", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .texture("top","arfo:blocks/byg_overgrown_dacite_top")
                        .texture("overlay", "arfo:blocks/byg_overgrown_dacite_side_overlay")
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 16).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile snow = models().cubeBottomTop("overgrown_dacite_snowy",
                        new ResourceLocation("arfo:blocks/byg_overgrown_dacite_snow_side"),
                        new ResourceLocation("arfo:blocks/byg_overgrown_dacite_bottom"),
                        new ResourceLocation("minecraft:block/snow"))
                        .texture("particle", "arfo:blocks/byg_overgrown_dacite_bottom");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SNOWY, false)
                        .setModels(new ConfiguredModel(normal),
                                new ConfiguredModel(normal, 0, 90, false),
                                new ConfiguredModel(normal, 0, 180, false),
                                new ConfiguredModel(normal, 0, 270, false))
                        .partialState().with(BlockStateProperties.SNOWY, true)
                        .setModels(new ConfiguredModel(snow));

            } else if (block.toString().contains("slab") && !block.toString().contains("overgrown")) {
                String grassBlockName = "";

                for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                    if (BlockMapping.slabAndBlocks.get(b).is(block) && !b.toString().contains("glowing")) {
                        grassBlockName = Registry.BLOCK.getKey(b).getPath();
                    }
                }

                ModelFile slab = models().withExistingParent(name, new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/dirt")
                        .texture("bottom", "minecraft:block/dirt")
                        .texture("top", "minecraft:block/grass_block_top")
                        .texture("side", "minecraft:block/grass_block_side")
                        .texture("overlay", "minecraft:block/grass_block_side_overlay")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 8, 16, 16).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile slab_snow = models().withExistingParent(name + "_snow", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/dirt")
                        .texture("bottom", "minecraft:block/dirt")
                        .texture("top", "minecraft:block/snow")
                        .texture("side", "minecraft:block/grass_block_snow")
                        .element()
                        .from(0, 0, 0)
                        .to(16, 8, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").cullface(Direction.DOWN).end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").end()
                        .face(Direction.NORTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.EAST).end()
                        .end();

                ModelFile slab_top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/dirt")
                        .texture("bottom", "minecraft:block/dirt")
                        .texture("top", "minecraft:block/grass_block_top")
                        .texture("side", "minecraft:block/grass_block_side")
                        .texture("overlay", "minecraft:block/grass_block_side_overlay")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).tintindex(1).end()
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#side").cullface(Direction.EAST).end()
                        .end()
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.NORTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.NORTH).tintindex(1).end()
                        .face(Direction.SOUTH).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.SOUTH).tintindex(1).end()
                        .face(Direction.WEST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.WEST).tintindex(1).end()
                        .face(Direction.EAST).uvs(0, 0, 16, 8).texture("#overlay").cullface(Direction.EAST).tintindex(1).end()
                        .end();

                ModelFile slab_top_snow = models().withExistingParent(name + "_top_snow", new ResourceLocation("minecraft:block/slab"))
                        .texture("particle", "minecraft:block/dirt")
                        .texture("bottom", "minecraft:block/dirt")
                        .texture("top", "minecraft:block/snow")
                        .texture("side", "minecraft:block/grass_block_snow")
                        .element()
                        .from(0, 8, 0)
                        .to(16, 16, 16)
                        .face(Direction.DOWN).uvs(0, 0, 16, 16).texture("#bottom").end()
                        .face(Direction.UP).uvs(0, 0, 16, 16).texture("#top").cullface(Direction.UP).end()
                        .face(Direction.NORTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.NORTH).end()
                        .face(Direction.SOUTH).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.SOUTH).end()
                        .face(Direction.WEST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.WEST).end()
                        .face(Direction.EAST).uvs(0, 2, 16, 10).texture("#side").cullface(Direction.EAST).end()
                        .end();

                ModelFile grass_block = models().withExistingParent(grassBlockName, new ResourceLocation("minecraft:block/grass_block"))
                        .texture("all", "minecraft:block/grass_block_top");

                ModelFile snow_block = models().cubeBottomTop("grass_block_snow",
                        new ResourceLocation("minecraft:block/grass_block_snow"),
                        new ResourceLocation("minecraft:block/dirt"),
                        new ResourceLocation("minecraft:block/snow"))
                        .texture("particle", "minecraft:block/dirt");


                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab))
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top))
                        .partialState().with(BlockStateProperties.SNOWY, false).with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(grass_block))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.BOTTOM)
                        .setModels(new ConfiguredModel(slab_snow))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.TOP)
                        .setModels(new ConfiguredModel(slab_top_snow))
                        .partialState().with(BlockStateProperties.SNOWY, true).with(BlockStateProperties.SLAB_TYPE, SlabType.DOUBLE)
                        .setModels(new ConfiguredModel(snow_block));



            } else if (block.toString().contains("potted")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_flower_pot_cross"))
                        .texture("plant", "minecraft:block/fern");
                simpleBlock(block, model);
            } else if (block instanceof ARFOFernBlock) {

                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/fern");

                ModelFile slab_model = models().withExistingParent(name + "_down", new ResourceLocation("arfo:block/tinted_cross_down"))
                        .texture("cross", "minecraft:block/fern");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(model))
                        .partialState().with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_model));

                //simpleBlock(block, model);
            } else if (block instanceof ARFOGrass) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/grass");

                ModelFile slab_model = models().withExistingParent(name + "_down", new ResourceLocation("arfo:block/tinted_cross_down"))
                        .texture("cross", "minecraft:block/grass");

                getVariantBuilder(block)
                        .partialState().with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(model))
                        .partialState().with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_model));


                //simpleBlock(block, model);
            } else if (block instanceof ARFOSugarCaneBlock) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/sugar_cane");
                simpleBlock(block, model);
            } else if (block instanceof ARFOLargeFernBlock) {
                ModelFile bottom = models().withExistingParent(name + "_bottom", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/large_fern_bottom");
                ModelFile top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/large_fern_top");

                ModelFile slab_bottom = models().withExistingParent(name + "_bottom_down", new ResourceLocation("arfo:block/tinted_cross_down"))
                        .texture("cross", "minecraft:block/large_fern_bottom");
                ModelFile slab_top = models().withExistingParent(name + "_top_down", new ResourceLocation("arfo:block/tinted_cross_down"))
                        .texture("cross", "minecraft:block/large_fern_top");

                getVariantBuilder(block)
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(bottom))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(top))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_bottom))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_top));


            } else if (block instanceof ARFOTallGrass) {
                ModelFile bottom = models().withExistingParent(name + "_bottom", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/tall_grass_bottom");
                ModelFile top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/tall_grass_top");

                ModelFile slab_bottom = models().withExistingParent(name + "_bottom_down", new ResourceLocation("arfo:block/tinted_cross_down"))
                        .texture("cross", "minecraft:block/tall_grass_bottom");
                ModelFile slab_top = models().withExistingParent(name + "_top_down", new ResourceLocation("arfo:block/tinted_cross_down"))
                        .texture("cross", "minecraft:block/tall_grass_top");

                getVariantBuilder(block)
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(bottom))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).with(BlockStateProperties.OPEN, false)
                        .setModels(new ConfiguredModel(top))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_bottom))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).with(BlockStateProperties.OPEN, true)
                        .setModels(new ConfiguredModel(slab_top));


            } else if (block instanceof ARFOVinesBlock) {

                ModelFile vine_1 = models().getExistingFile(new ResourceLocation("minecraft:vine_1"));
                ModelFile vine_u = models().getExistingFile(new ResourceLocation("minecraft:vine_u"));
                ModelFile vine_1u = models().getExistingFile(new ResourceLocation("minecraft:vine_1u"));
                ModelFile vine_2 = models().getExistingFile(new ResourceLocation("minecraft:vine_2"));
                ModelFile vine_2u = models().getExistingFile(new ResourceLocation("minecraft:vine_2u"));
                ModelFile vine_2_opposite = models().getExistingFile(new ResourceLocation("minecraft:vine_2_opposite"));
                ModelFile vine_3 = models().getExistingFile(new ResourceLocation("minecraft:vine_3"));
                ModelFile vine_2u_opposite = models().getExistingFile(new ResourceLocation("minecraft:vine_2u_opposite"));
                ModelFile vine_3u = models().getExistingFile(new ResourceLocation("minecraft:vine_3u"));
                ModelFile vine_4 = models().getExistingFile(new ResourceLocation("minecraft:vine_4"));
                ModelFile vine_4u = models().getExistingFile(new ResourceLocation("minecraft:vine_4u"));

                // i hate vines
                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_1, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_u));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_1u, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_2, 0, 180, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1u));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_2u, 0, 180, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1, 0, 180, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_2, 0, 270, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1u, 0, 180, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_2u, 0, 270, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_2_opposite, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_3, 0, 180, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_2u_opposite, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, false)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_3u, 0, 180, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1, 0, 270, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_2_opposite));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_1u, 0, 270, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_2u_opposite));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_2, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_3, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_2u, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, false)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_3u, 0, 90, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_2));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_3, 0, 270, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_2u));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, false)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_3u, 0, 270, false));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_3));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, false)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_4));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, false)
                        .setModels(new ConfiguredModel(vine_3u));

                getVariantBuilder(block).partialState()
                        .with(BlockStateProperties.EAST, true)
                        .with(BlockStateProperties.NORTH, true)
                        .with(BlockStateProperties.SOUTH, true)
                        .with(BlockStateProperties.UP, true)
                        .with(BlockStateProperties.WEST, true)
                        .setModels(new ConfiguredModel(vine_4u));


            } //else {
            //    System.out.println(name);
            //}



        }



    }







    @Nonnull
    @Override
    public String getName() {
        return "Artificial Foliage block states";
    }
}
