package com.finallion.arfo.data;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.data.providers.*;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(new ARFOBlockStateProvider(generator, ArtificialFoliage.MODID, event.getExistingFileHelper()));
        generator.addProvider(new ARFOItemModelProvider(generator, ArtificialFoliage.MODID, event.getExistingFileHelper()));



        if (event.includeServer()) {
            generator.addProvider(new ARFOLootTableProvider(generator));
            BlockTagsProvider blockTagsProvider = new ARFOBlockTagProvider(generator, ArtificialFoliage.MODID, event.getExistingFileHelper());
            generator.addProvider(blockTagsProvider);
            generator.addProvider(new ARFOItemTagProvider(generator, blockTagsProvider, ArtificialFoliage.MODID, event.getExistingFileHelper()));
            generator.addProvider(new ARFORecipeProvider(generator));
        }

        if (event.includeClient()) {
            generator.addProvider(new ARFOLangProvider(generator, ArtificialFoliage.MODID, "en_us"));
        }




    }

}
