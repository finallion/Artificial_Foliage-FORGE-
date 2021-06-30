package com.finallion.arfo.data.providers;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.blocks.*;
import com.finallion.arfo.common.items.ARFODyeItem;
import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import java.util.Set;
import java.util.stream.Collectors;

public class ARFOItemModelProvider extends ItemModelProvider {
    private static final ResourceLocation GENERATED = new ResourceLocation("item/generated");


    public ARFOItemModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Set<Item> items = Registry.ITEM.stream()
                .filter(i -> ArtificialFoliage.MODID.equals(Registry.ITEM.getKey(i).getNamespace()))
                .collect(Collectors.toSet());

        for (Item item : items) {
            String name = Registry.ITEM.getKey(item).getPath();
            if (item instanceof ARFODyeItem || name.contains("coral")) {
                registerBasicARFOItem(name);
            } else if (name.contains("water_bucket")) {
                registerBasicARFOItem(name);
            }
        }

        for (Block block : ARFOBlocks.blocksList) {
            String name = Registry.BLOCK.getKey(block).getPath();

            if (block instanceof ARFOSpreadableBlock || block instanceof ARFOSpreadableSlab || block instanceof ARFOStoneSoilBlock || block instanceof ARFOSoilBlock || block instanceof ARFOAcaciaLeavesBlock || block instanceof ARFOJungleLeavesBlock || block instanceof ARFOOakLeavesBlock || block instanceof ARFODarkOakLeavesBlock || block instanceof ARFOGlowingNyliumBlock || block instanceof ARFONyliumSlab || block instanceof ARFOSmallSlab || block instanceof ARFOSlab || block instanceof ARFOLeavesCarpetBlock) {
                registerBlockItemModel(name);
            } else if (block instanceof ARFOSugarCaneBlock) {
                registerBasicItem(name, "sugar_cane");
            } else if (block instanceof ARFOVinesBlock) {
                registerBasicItem(name, "vine");
            } else if (block instanceof ARFOTallGrass) {
                registerBasicItem(name, "tall_grass_top");
            } else if (block instanceof ARFOLargeFernBlock) {
                registerBasicItem(name, "large_fern_top");
            } else if (block instanceof ARFOGrass) {
                registerBasicItem(name, "grass");
            } else if (block instanceof ARFOFernBlock) {
                registerBasicItem(name, "fern");
            } else if (block.is(ARFOBlocks.ALPHA_LEAVES)) {
                registerBlockItemModel(name);
            } else if (block.is(ARFOBlocks.ARTIFICIAL_CORAL_SAPLING)) {
                registerSpecialARFOItem(name);
            } else {
                System.out.println("Unregistered Block: " + name);
            }
        }
    }


    private void registerBlockItemModel(String name) {
        getBuilder(name).parent(new ModelFile.UncheckedModelFile(modLoc("block/" + name)));
    }

    private void registerBasicARFOItem(String name) {
        singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("items/" + name));
    }

    private void registerBasicItem(String name, String type) {
        singleTexture(name, mcLoc("item/generated"), "layer0", mcLoc("block/" + type));
    }

    private void registerSpecialARFOItem(String name) {
        singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("blocks/" + name));
    }

    @Nonnull
    @Override
    public String getName() {
        return "Artificial Foliage item models";
    }
}
