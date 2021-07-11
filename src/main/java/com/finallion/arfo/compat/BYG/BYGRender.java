package com.finallion.arfo.compat.BYG;

import com.finallion.arfo.client.textures.Renders;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.registry.Registry;

import java.util.Set;
import java.util.stream.Collectors;

public class BYGRender {



    public static void init() {
        Set<Block> blocks = Registry.BLOCK.stream()
                .filter(b -> Registry.BLOCK.getKey(b).getPath().contains("biomesyoullgo_"))
                .collect(Collectors.toSet());

        for (Block block : blocks) {
            if (block.toString().contains("leaves")) {
                RenderTypeLookup.setRenderLayer(block, Renders.LEAVE_BLOCK_LAYER);
            } else {
                RenderTypeLookup.setRenderLayer(block, Renders.GRASS_BLOCK_LAYER);
            }
        }

        Set<Fluid> fluids = Registry.FLUID.stream()
                .filter(b -> Registry.FLUID.getKey(b).getPath().contains("biomesyoullgo_"))
                .collect(Collectors.toSet());

        for (Fluid fluid : fluids) {
            RenderTypeLookup.setRenderLayer(fluid, RenderType.translucent());
        }

    }


}
