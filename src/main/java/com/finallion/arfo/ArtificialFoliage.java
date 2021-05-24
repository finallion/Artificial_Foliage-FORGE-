package com.finallion.arfo;


import com.finallion.arfo.client.textures.Renders;
import com.finallion.arfo.common.items.ARFOGrassSeedItem;

import com.finallion.arfo.common.loot.GrassLootModifiers;
import com.finallion.arfo.compat.Traverse.*;
import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.init.ARFOFluids;
import com.finallion.arfo.init.ARFOItems;
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
import net.minecraftforge.fml.ModList;
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
            return new ItemStack(ARFOItems.MUSHROOM_FIELDS_DYE);
        }
    };

    public static ItemGroup itemGroupAddon = new ItemGroup("arfo") {
        public ItemStack makeIcon() {
            return new ItemStack(ARFOItems.BADLANDS_DYE);
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
        TraverseRender.init();

        LOGGER.info("ArFo: \"Client Setup\" Event Complete!");
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ARFORegistries {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering blocks...");
            ARFOBlocks.init();
            TraverseBlocks.init();
            ARFOBlocks.blocksList.forEach(block -> event.getRegistry().register(block));



            ArtificialFoliage.LOGGER.info("ArFo: Blocks registered!");
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering items...");
            ARFOItems.init();
            TraverseItems.init();
            ARFOItems.itemsList.forEach(item -> event.getRegistry().register(item));

            ArtificialFoliage.LOGGER.info("ArFo: Items registered!");
        }

        @SubscribeEvent
        public static void registerFluids(RegistryEvent.Register<Fluid> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering fluids...");
            ARFOFluids.init();
            TraverseFluids.init();
            ARFOFluids.fluidList.forEach(fluid -> event.getRegistry().register(fluid));

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
