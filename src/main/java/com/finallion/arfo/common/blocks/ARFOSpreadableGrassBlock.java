package com.finallion.arfo.common.blocks;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.Random;

public class ARFOSpreadableGrassBlock extends ARFOSpreadableBlock {

    public ARFOSpreadableGrassBlock() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.SHOVEL)
                .sound(SoundType.GRASS));
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {
        if (toolType == ToolType.HOE) return Blocks.FARMLAND.defaultBlockState();
        else return toolType == ToolType.SHOVEL ? Blocks.GRASS_PATH.defaultBlockState() : null;
    }

}
