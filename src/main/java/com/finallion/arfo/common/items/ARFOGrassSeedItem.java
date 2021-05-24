package com.finallion.arfo.common.items;


import com.finallion.arfo.common.blocks.*;
import com.finallion.arfo.init.ARFOBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class ARFOGrassSeedItem extends Item {

    public static final EnumProperty<SlabType> TYPE = BlockStateProperties.SLAB_TYPE;

    public ARFOGrassSeedItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        if (useOnArtificialGrass(context.getItemInHand(), world, blockPos)) {
            if (!world.isClientSide()) {
                world.blockEvent(blockPos, world.getBlockState(blockPos).getBlock(), 2005, 0);
                return ActionResultType.SUCCESS;
            } else {
                BoneMealItem.addGrowthParticles(world, blockPos, 10);
                if (context.getPlayer() != null) context.getPlayer().playSound(SoundEvents.COMPOSTER_FILL, 0.5F, 1);
            }

        }

        return ActionResultType.PASS;
    }

    public static boolean useOnArtificialGrass(ItemStack stack, World world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        if (!world.isClientSide()) {
            if (blockState.getBlock() instanceof ARFOGrassBlock) {
                ARFOGrassBlock grassBlock = (ARFOGrassBlock) blockState.getBlock();
                if (!grassBlock.is(ARFOBlocks.ALPHA_GRASS_BLOCK)) {
                    grassBlock.growArtificialGrass(world, world.random, pos, blockState);
                    stack.setCount(-1);
                    return true;
                }
            } else if (blockState.getBlock() instanceof ARFOGlowingGrassBlock) {
                ARFOGlowingGrassBlock grassBlock = (ARFOGlowingGrassBlock) blockState.getBlock();
                grassBlock.growArtificialGrass(world, world.random, pos, blockState);
                stack.setCount(-1);
                return true;
            }
            else if (blockState.getBlock() instanceof ARFOGrassBlockSlab && blockState.getValue(TYPE) != SlabType.BOTTOM) {
                ARFOGrassBlockSlab grassSlab = (ARFOGrassBlockSlab) blockState.getBlock();
                grassSlab.growArtificialGrass(world, world.random, pos, blockState);
                stack.setCount(-1);
                return true;
            } else if (blockState.getBlock() instanceof ARFOSoilBlock) {
                ARFOSoilBlock soilBlock = (ARFOSoilBlock) blockState.getBlock();
                soilBlock.grow(world, world.random, pos, blockState);
                stack.setCount(-1);
                return true;
            } else if (blockState.getBlock().is(ARFOBlocks.ARTIFICIAL_SOIL_SLAB)) {
                ARFOSlabBlock grassSlab = (ARFOSlabBlock) blockState.getBlock();
                grassSlab.grow(world, world.random, pos, blockState);
                stack.setCount(-1);
                return true;
            }
        }

        return false;
    }

}







