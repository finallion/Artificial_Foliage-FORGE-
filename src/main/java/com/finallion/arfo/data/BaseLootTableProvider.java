package com.finallion.arfo.data;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.blocks.ARFOFernBlock;
import com.finallion.arfo.init.ARFOBlocks;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Items;
import net.minecraft.loot.*;
import net.minecraft.loot.conditions.*;
import net.minecraft.loot.functions.*;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.Tags;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.stream.Collectors;

public abstract class BaseLootTableProvider extends LootTableProvider {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
    private final DataGenerator generator;

    public BaseLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
        this.generator = dataGeneratorIn;
    }


    protected abstract void addTables();


    protected LootTable.Builder createStandardTable(String name, Block block) {
        LootEntry.Builder<?> entry = ItemLootEntry.lootTableItem(block);


        LootPool.Builder builder = LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                .add(entry)
                //.name(name)
                .when(SurvivesExplosion.survivesExplosion());

        return LootTable.lootTable().withPool(builder);
    }

    protected LootTable.Builder createDoubleGrassTable(String name, Block block) {
        LootEntry.Builder<?> entryOne = ItemLootEntry.lootTableItem(block)
                .when(BlockStateProperty.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)))
                .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS)));

        LootEntry.Builder<?> entryTwo = ItemLootEntry.lootTableItem(block)
                .when(BlockStateProperty.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER)))
                .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS)));


        LootPool.Builder builder = LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                .add(entryOne)
                .add(entryTwo)
                //.name(name)
                .when(SurvivesExplosion.survivesExplosion());

        return LootTable.lootTable().withPool(builder);
    }

    protected LootTable.Builder createShearTable(String name, Block block) {
        ILootCondition.IBuilder SHEAR = MatchTool.toolMatches(ItemPredicate.Builder.item().of(Items.SHEARS));

        LootEntry.Builder<?> entry = ItemLootEntry.lootTableItem(block).when(SHEAR);


        LootPool.Builder builder = LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                .add(entry);
                //.name(name);
        return LootTable.lootTable().withPool(builder);
    }

    protected LootTable.Builder createSlabTable(String name, Block block) {
        LootEntry.Builder<?> entry = ItemLootEntry.lootTableItem(block)
                .apply(SetCount.setCount(ConstantRange.exactly(2))
                        .when(BlockStateProperty.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SlabBlock.TYPE, SlabType.DOUBLE))))
                .apply(ExplosionDecay.explosionDecay());


        LootPool.Builder builder = LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                .add(entry);
                //.name(name);
        return LootTable.lootTable().withPool(builder);
    }

    protected LootTable.Builder createPottedTable(String name, Block block) {
        String fernName = block.toString().replace("potted_", "");

        Set<Block> ferns = Registry.BLOCK.stream()
                .filter(b -> b instanceof ARFOFernBlock)
                .collect(Collectors.toSet());

        Block fern = ARFOBlocks.JUNGLE_FERN;

        for (Block b : ferns) {
            if (b.toString().equals(fernName)) {
                fern = b;
            }
        }

        LootEntry.Builder<?> fernLoot = ItemLootEntry.lootTableItem(fern);
        LootEntry.Builder<?> potLoot = ItemLootEntry.lootTableItem(Blocks.FLOWER_POT);

        LootPool.Builder builder = LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                .add(fernLoot)
                .when(SurvivesExplosion.survivesExplosion());

        LootPool.Builder builderTwo = LootPool.lootPool()
                .setRolls(ConstantRange.exactly(1))
                .add(potLoot)
                .when(SurvivesExplosion.survivesExplosion());

        return LootTable.lootTable().withPool(builder).withPool(builderTwo);
    }




    @Override
    public void run(DirectoryCache cache) {
        addTables();

        Map<ResourceLocation, LootTable> tables = new HashMap<>();


        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) {
            tables.put(entry.getKey().getLootTable(), entry.getValue().setParamSet(LootParameterSets.BLOCK).build());
        }
        writeTables(cache, tables);
    }

    // Actually write out the tables in the output folder
    private void writeTables(DirectoryCache cache, Map<ResourceLocation, LootTable> tables) {
        Path outputFolder = this.generator.getOutputFolder();
        tables.forEach((key, lootTable) -> {
            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
            try {
                IDataProvider.save(GSON, cache, LootTableManager.serialize(lootTable), path);
            } catch (IOException e) {
                ArtificialFoliage.LOGGER.error("Couldn't write loot table {}", path, e);
            }
        });
    }

    @Override
    public String getName() {
        return "Artificial Foliage loot tables";
    }
}