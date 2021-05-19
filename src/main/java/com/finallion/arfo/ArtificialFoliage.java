package com.finallion.arfo;


import com.finallion.arfo.client.textures.Renders;
import com.finallion.arfo.common.items.ARFOGrassSeedItem;

import com.finallion.arfo.common.loot.GrassLootModifiers;
import com.finallion.arfo.init.ModBlocks;
import com.finallion.arfo.init.ModFluids;
import com.finallion.arfo.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("arfo")
public class ArtificialFoliage {
    public static final String MODID = "arfo";
    public static final Logger LOGGER = LogManager.getLogger();
    public static boolean isClient = false;

    public static ItemGroup itemGroup = new ItemGroup("arfo") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GRASS_SEED);
        }
    };


    public ArtificialFoliage() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(ARFOGrassSeedItem.class);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        isClient = true;
        LOGGER.debug("ArFo: \"Client Setup\" Event Starting...");
        Renders.init();
        LOGGER.info("ArFo: \"Client Setup\" Event Complete!");
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ARFORegistries {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering blocks...");
            ModBlocks.init();
            ModBlocks.blocksList.forEach(block -> event.getRegistry().register(block));
            ArtificialFoliage.LOGGER.info("ArFo: Blocks registered!");
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering items...");
            ModItems.init();
            ModItems.itemsList.forEach(block -> event.getRegistry().register(block));
            ArtificialFoliage.LOGGER.info("ArFo: Items registered!");
        }

        @SubscribeEvent
        public static void registerFluids(RegistryEvent.Register<Fluid> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering fluids...");
            ModFluids.init();
            ModFluids.fluidList.forEach(fluid -> event.getRegistry().register(fluid));
            ArtificialFoliage.LOGGER.info("ArFo: Fluids registered!");
        }

        @SubscribeEvent
        public static void registerLootModifier(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering loot modifier...");
            event.getRegistry().register(new GrassLootModifiers.GrassLootModifier.Serializer().setRegistryName(
                    new ResourceLocation(ArtificialFoliage.MODID, "dyes_from_grass")));
            ArtificialFoliage.LOGGER.debug("ArFo: Loot modifier registered!");
        }

    }
}
