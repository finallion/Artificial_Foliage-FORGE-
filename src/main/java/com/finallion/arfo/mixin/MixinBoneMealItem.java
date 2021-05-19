package com.finallion.arfo.mixin;


import com.finallion.arfo.common.blocks.ARFOGlowingGrassBlock;
import com.finallion.arfo.common.blocks.ARFONetherSlabBlock;
import com.finallion.arfo.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NetherrackBlock;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;
import java.util.Random;

@Mixin(BoneMealItem.class)
public abstract class MixinBoneMealItem {
    @Inject(method = "useOn", at = @At("HEAD"), cancellable = true)
    private void useOn(ItemUseContext context, CallbackInfoReturnable<ActionResultType> info) {
        World world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        ItemStack stack = context.getItemInHand();
        Random random = new Random();



        if (!world.isClientSide()) {
            if (state.is(Blocks.NETHERRACK)) {
                boolean bl = false;
                boolean bl2 = false;
                Iterator var7 = BlockPos.betweenClosed(pos.offset(-1, -1, -1), pos.offset(1, 1, 1)).iterator();

                while (var7.hasNext()) {
                    BlockPos blockPos = (BlockPos) var7.next();
                    BlockState blockState = world.getBlockState(blockPos);
                    if (blockState.is(ModBlocks.WARPED_NYLIUM_SLAB) || blockState.is(Blocks.WARPED_NYLIUM) || blockState.is(ModBlocks.GLOWING_WARPED_NYLIUM)) {
                        bl2 = true;
                    }

                    if (blockState.is(ModBlocks.CRIMSON_NYLIUM_SLAB) || blockState.is(Blocks.CRIMSON_NYLIUM) || blockState.is(ModBlocks.GLOWING_CRIMSON_NYLIUM)) {
                        bl = true;
                    }

                    if (bl2 && bl) {
                        break;
                    }
                }


                if (bl2 && bl) {
                    world.setBlock(pos, random.nextBoolean() ? Blocks.WARPED_NYLIUM.defaultBlockState() : Blocks.CRIMSON_NYLIUM.defaultBlockState(), 3);
                } else if (bl2) {
                    world.setBlock(pos, Blocks.WARPED_NYLIUM.defaultBlockState(), 3);
                } else if (bl) {
                    world.setBlock(pos, Blocks.CRIMSON_NYLIUM.defaultBlockState(), 3);
                }

                stack.setCount(-1);
                info.setReturnValue(ActionResultType.SUCCESS);
            } else if (state.is(ModBlocks.GLOWING_CRIMSON_NYLIUM) || state.is(ModBlocks.GLOWING_WARPED_NYLIUM)) {
                ARFOGlowingGrassBlock block = (ARFOGlowingGrassBlock) state.getBlock();
                block.growNetherGrass((ServerWorld) world, random, pos, state);

                info.setReturnValue(ActionResultType.SUCCESS);
            } else if (state.is(ModBlocks.CRIMSON_NYLIUM_SLAB) || state.is(ModBlocks.WARPED_NYLIUM_SLAB)) {
                ARFONetherSlabBlock block = (ARFONetherSlabBlock) state.getBlock();
                block.growNetherGrass((ServerWorld) world, random, pos, state);

                info.setReturnValue(ActionResultType.SUCCESS);
            }
        }
    }
}

