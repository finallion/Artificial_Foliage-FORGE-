package com.finallion.arfo.mixin;



import com.finallion.arfo.common.blocks.ARFOSpreadableBlock;
import com.finallion.arfo.common.blocks.ARFOSpreadableSlab;
import net.minecraft.block.BlockState;
import net.minecraft.block.SpreadableSnowyDirtBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin (SpreadableSnowyDirtBlock.class)
public class MixinSpreadableSnowyDirtBlock {

    @Inject(method = "randomTick", at = @At("HEAD"), cancellable = true)
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo info) {
        // allows vanilla grass blocks to spread to ARFO slabs
        ARFOSpreadableBlock.doTick(state, world, pos, random);
    }
}
