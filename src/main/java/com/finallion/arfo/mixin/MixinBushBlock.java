package com.finallion.arfo.mixin;


import com.finallion.arfo.common.blocks.ARFONetherSlabBlock;
import com.finallion.arfo.common.blocks.ARFOSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BushBlock.class)
public class MixinBushBlock {
    private static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;


    @Inject(method = "canSurvive", at = @At("HEAD"), cancellable = true)
    private void canSurvive(BlockState state, IWorldReader world, BlockPos pos, CallbackInfoReturnable<Boolean> info) {

        BlockState blockState = world.getBlockState(pos);
        if (blockState.getBlock() instanceof ARFOSlabBlock || blockState.getBlock() instanceof ARFONetherSlabBlock) {
            if (blockState.getValue(TYPE) != SlabType.BOTTOM) {
                info.setReturnValue(true);
            }
        }

    }
}
