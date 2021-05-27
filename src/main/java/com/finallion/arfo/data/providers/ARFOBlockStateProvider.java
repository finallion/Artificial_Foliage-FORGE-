package com.finallion.arfo.data.providers;

import com.finallion.arfo.ArtificialFoliage;
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

        // vine
        // carpets


        blocks.remove(ARFOBlocks.ALPHA_GRASS_BLOCK);
        blocks.remove(ARFOBlocks.ALPHA_LEAVES);
        blocks.remove(ARFOBlocks.ARTIFICIAL_SOIL);
        blocks.remove(ARFOBlocks.ARTIFICIAL_SOIL_SLAB);
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
        blocks.remove(TraverseBlocks.TRAVERSE_RED_AUTUMNAL_LEAVES_CARPET);
        blocks.remove(TraverseBlocks.TRAVERSE_ORANGE_AUTUMNAL_LEAVES_CARPET);
        blocks.remove(TraverseBlocks.TRAVERSE_YELLOW_AUTUMNAL_LEAVES_CARPET);
        blocks.remove(TraverseBlocks.TRAVERSE_BROWN_AUTUMNAL_LEAVES_CARPET);
        //blocks.removeIf((block -> block.toString().contains("vine")));
        blocks.removeIf((block -> block.toString().contains("_water\"")));

        for (Block block : blocks) {
            String name = Registry.BLOCK.getKey(block).getPath();

            if (block.toString().contains("acacia_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID, "block/leaf_carpet"))
                        .texture("all", "minecraft:block/acacia_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("dark_oak_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID,"block/leaf_carpet"))
                        .texture("all", "minecraft:block/dark_oak_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("oak_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID,"block/leaf_carpet"))
                        .texture("all", "minecraft:block/oak_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("jungle_leaves_carpet")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation(ArtificialFoliage.MODID,"block/leaf_carpet"))
                        .texture("all", "minecraft:block/jungle_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("acacia_leaves")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/acacia_leaves"))
                        .texture("all", "minecraft:block/acacia_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("dark_oak_leaves")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/dark_oak_leaves"))
                        .texture("all", "minecraft:block/dark_oak_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("oak_leaves")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/oak_leaves"))
                        .texture("all", "minecraft:block/oak_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("jungle_leaves")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/jungle_leaves"))
                        .texture("all", "minecraft:block/jungle_leaves");
                simpleBlock(block, model);
            } else if (block.toString().contains("glowing")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/grass_block"))
                        .texture("all", "minecraft:block/grass_block_top");
                simpleBlock(block, model);
            } else if (block.toString().contains("grass_block")) {
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

            } else if (block.toString().contains("slab")) {
                String grassBlockName = "";

                for (Block b : BlockMapping.slabAndBlocks.keySet()) {
                    if (BlockMapping.slabAndBlocks.get(b).is(block)) {
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
            } else if (block.toString().contains("fern") && !block.toString().contains("large")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/fern");
                simpleBlock(block, model);
            } else if (block.toString().contains("grass") && !block.toString().contains("tall") && !block.toString().contains("slab")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/grass");
                simpleBlock(block, model);
            } else if (block.toString().contains("sugar_cane")) {
                ModelFile model = models().withExistingParent(name, new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/sugar_cane");
                simpleBlock(block, model);
            } else if (block.toString().contains("fern") && block.toString().contains("large")) {
                ModelFile bottom = models().withExistingParent(name + "_bottom", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/large_fern_bottom");
                ModelFile top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/large_fern_top");

                getVariantBuilder(block)
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).setModels(new ConfiguredModel(bottom))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).setModels(new ConfiguredModel(top));
            } else if (block.toString().contains("grass") && block.toString().contains("tall")) {
                ModelFile bottom = models().withExistingParent(name + "_bottom", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/tall_grass_bottom");
                ModelFile top = models().withExistingParent(name + "_top", new ResourceLocation("minecraft:block/tinted_cross"))
                        .texture("cross", "minecraft:block/tall_grass_top");

                getVariantBuilder(block)
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).setModels(new ConfiguredModel(bottom))
                        .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).setModels(new ConfiguredModel(top));
            } else if (block.toString().contains("vine")) {

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


            }



        }



    }







    @Nonnull
    @Override
    public String getName() {
        return "Artificial Foliage blockstates";
    }
}
