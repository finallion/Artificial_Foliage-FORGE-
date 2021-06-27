package com.finallion.arfo.data.providers;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.common.items.ARFODyeItem;
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

            if (item instanceof ARFODyeItem  || name.contains("coral")) {
                registerBasicARFOItem(name);
            } else if (name.contains("leaves") || name.contains("grass_block") || name.contains("slab") || name.contains("soil") || name.contains("glowing") || name.contains("overgrown")) {
                registerBlockItemModel(name);
            } else if (name.contains("sugar_cane")) {
                registerBasicItem(name, "sugar_cane");
            } else if (name.contains("vine")) {
                registerBasicItem(name, "vine");
            } else if (name.contains("tall") && name.contains("grass")) {
                registerBasicItem(name, "tall_grass_top");
            } else if (name.contains("large") && name.contains("fern")) {
                registerBasicItem(name, "large_fern_top");
            } else if (name.contains("grass")) {
                registerBasicItem(name, "grass");
            } else if (name.contains("fern")) {
                registerBasicItem(name, "fern");
            } else if (name.contains("water_bucket")) {
                registerBasicARFOItem(name);
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

    @Nonnull
    @Override
    public String getName() {
        return "Artificial Foliage item models";
    }
}
