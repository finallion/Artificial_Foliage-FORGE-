package com.finallion.arfo;


import com.finallion.arfo.client.textures.Renders;


import com.finallion.arfo.common.loot.GrassLootModifiers;
import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.compat.BYG.BYGFluids;
import com.finallion.arfo.compat.BYG.BYGItems;
import com.finallion.arfo.compat.BYG.BYGRender;
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

    public static ItemGroup itemGroupAddonTwo = new ItemGroup("arfo") {
        public ItemStack makeIcon() {
            return new ItemStack(BYGItems.BYG_NETHER_DYE);
        }
    };



    public ArtificialFoliage() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void clientSetup(FMLClientSetupEvent event) {
        isClient = true;
        LOGGER.debug("ArFo: \"Client Setup\" Event Starting...");
        Renders.init();
        LOGGER.debug("ArFo: ArFo Renders initialized...");
        TraverseRender.init();
        LOGGER.debug("ArFo: Traverse Renders initialized...");
        BYGRender.init();
        LOGGER.debug("ArFo: BYG Renders initialized...");

        LOGGER.info("ArFo: \"Client Setup\" Event Complete!");
    }


    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ARFORegistries {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering blocks...");
            ARFOBlocks.init();
            LOGGER.debug("ArFo: ArFo Blocks initialized...");
            TraverseBlocks.init();
            LOGGER.debug("ArFo: Traverse Blocks initialized...");
            BYGBlocks.init();
            LOGGER.debug("ArFo: BYG Blocks initialized...");
            ARFOBlocks.blocksList.forEach(block -> event.getRegistry().register(block));



            ArtificialFoliage.LOGGER.info("ArFo: Blocks registered!");
        }

        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering items...");
            ARFOItems.init();
            LOGGER.debug("ArFo: ArFo Items initialized...");
            TraverseItems.init();
            LOGGER.debug("ArFo: Traverse Items initialized...");
            BYGItems.init();
            LOGGER.debug("ArFo: BYG Items initialized...");
            ARFOItems.itemsList.forEach(item -> event.getRegistry().register(item));

            ArtificialFoliage.LOGGER.info("ArFo: Items registered!");
        }

        @SubscribeEvent
        public static void registerFluids(RegistryEvent.Register<Fluid> event) {
            ArtificialFoliage.LOGGER.debug("ArFo: Registering fluids...");
            ARFOFluids.init();
            LOGGER.debug("ArFo: ArFo Fluids initialized...");
            TraverseFluids.init();
            LOGGER.debug("ArFo: Traverse Fluids initialized...");
            BYGFluids.init();
            LOGGER.debug("ArFo: BYG Fluids initialized...");
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
