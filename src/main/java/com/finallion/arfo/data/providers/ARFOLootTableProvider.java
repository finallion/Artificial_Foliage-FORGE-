package com.finallion.arfo.data.providers;

import com.finallion.arfo.common.blocks.ARFOLargeFernBlock;
import com.finallion.arfo.common.blocks.ARFOSugarCaneBlock;
import com.finallion.arfo.common.blocks.ARFOTallGrass;
import com.finallion.arfo.common.blocks.ARFOVinesBlock;
import com.finallion.arfo.compat.Traverse.TraverseBlocks;
import com.finallion.arfo.data.BaseLootTableProvider;
import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Items;

import java.rmi.registry.Registry;

public class ARFOLootTableProvider extends BaseLootTableProvider {

    public ARFOLootTableProvider(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }


    @Override
    protected void addTables() {

        for (Block b : ARFOBlocks.blocksList) {
            if (b.toString().contains("potted")) {
                lootTables.put(b, createPottedTable(b.toString(), b));
            } else if (b.toString().contains("slab")) {
                lootTables.put(b, createSlabTable(b.toString(), b));
            } else if (b.toString().contains("grass_block") || b.toString().contains("overgrown") || b.toString().contains("soil")) {
                lootTables.put(b, createStandardTable(b.toString(), b));
            } else if (b instanceof ARFOSugarCaneBlock) {
                lootTables.put(b, createStandardTable(b.toString(), Blocks.SUGAR_CANE));
            } else if (b instanceof ARFOTallGrass || b instanceof ARFOLargeFernBlock) {
                lootTables.put(b, createDoubleGrassTable(b.toString(), b));
            } else if (b instanceof ARFOVinesBlock) {
                lootTables.put(b, createShearTable(b.toString(), Blocks.VINE));
            } else if (b.toString().contains("water}")) {
            } else {
                lootTables.put(b, createShearTable(b.toString(), b));
            }
        }


    }

    @Override
    public String getName() {
        return "Artificial Foliage loot tables";
    }
}