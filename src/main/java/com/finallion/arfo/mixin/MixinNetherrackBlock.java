package com.finallion.arfo.mixin;

import com.finallion.arfo.common.blocks.ARFONyliumSlab;
import com.finallion.arfo.compat.BYG.BYGBlocks;
import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.*;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;
import java.util.Random;

@Mixin(NetherrackBlock.class)
public class MixinNetherrackBlock {

    @Inject(method = "performBonemeal", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;is(Lnet/minecraft/block/Block;)Z", shift = At.Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILHARD)
    private void customBlockSpread(ServerWorld world, Random random, BlockPos pos, BlockState state, CallbackInfo ci, boolean flag, boolean flag1, Iterator<BlockPos> var7, BlockPos blockpos, BlockState state2) {
        if (state2.getBlock().is(ARFOBlocks.GLOWING_WARPED_NYLIUM) || state2.getBlock().is(ARFOBlocks.GLOWING_CRIMSON_NYLIUM) || state2.getBlock().is(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || state2.getBlock().is(ARFOBlocks.WARPED_NYLIUM_SLAB) ) {
            if (world.getBlockState(pos).getBlock() != state2.getBlock()) {
                if (state2.getBlock().is(ARFOBlocks.WARPED_NYLIUM_SLAB) || state2.getBlock().is(ARFOBlocks.GLOWING_WARPED_NYLIUM)) {
                    world.setBlock(pos, Blocks.WARPED_NYLIUM.defaultBlockState(), 2);
                } else if (state2.getBlock().is(ARFOBlocks.CRIMSON_NYLIUM_SLAB) || state2.getBlock().is(ARFOBlocks.GLOWING_CRIMSON_NYLIUM)) {
                    world.setBlock(pos, Blocks.CRIMSON_NYLIUM.defaultBlockState(), 2);
                } else {
                    world.setBlock(pos, state2.getBlock().defaultBlockState(), 2);
                }
            }
        }

    }
}
