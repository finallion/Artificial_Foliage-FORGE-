package com.finallion.arfo.common.blocks;


import com.finallion.arfo.init.ARFOBlocks;
import com.finallion.arfo.utils.BlockMapping;
import com.finallion.arfo.utils.MapUtils;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.*;


public class ARFOGrassBlockSlab extends ARFOSlabBlock {

    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    private static final Map<Block, List<Block>> grassFeatures = new HashMap<>();

    public ARFOGrassBlockSlab() {
        super(AbstractBlock.Properties
                .copy(Blocks.GRASS_BLOCK)
                .harvestTool(ToolType.SHOVEL)
                .sound(SoundType.GRASS));
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolType toolType) {
        if (toolType == ToolType.HOE && state.getValue(TYPE) == SlabType.DOUBLE) return Blocks.FARMLAND.defaultBlockState();
        else if (toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.DOUBLE) return Blocks.GRASS_PATH.defaultBlockState();
        else return toolType == ToolType.SHOVEL && state.getValue(TYPE) == SlabType.TOP ? ARFOBlocks.GRASS_PATH_SLAB.defaultBlockState().setValue(TYPE, SlabType.TOP) : null;
    }



    public void growArtificialGrass(World world, Random random, BlockPos pos, BlockState state) {
        BlockPos blockPos = pos.above();
        BlockState blockState = world.getBlockState(pos);
        BlockState failState = Blocks.AIR.defaultBlockState();
        MapUtils.initMap(grassFeatures);
        boolean large = false;
        List<Block> features = new ArrayList<>();

        for (Block b1 : BlockMapping.slabAndBlocks.keySet()) {
            if (BlockMapping.slabAndBlocks.get(b1).is(blockState.getBlock())) {
                features = grassFeatures.get(b1);
            }
        }


        label48:
        for(int i = 0; i < 128; ++i) {
            BlockPos blockPos2 = blockPos;

            for (int j = 0; j < i / 16; ++j) {
                blockPos2 = blockPos2.offset(random.nextInt(3) - 1, (random.nextInt(3) - 1) * random.nextInt(3) / 2, random.nextInt(3) - 1);
                if (!(world.getBlockState(blockPos2.below()).getBlock() instanceof ARFOGrassBlock) || world.getBlockState(blockPos2).isCollisionShapeFullBlock(world, blockPos2)) {
                    continue label48;
                }
            }
            BlockState blockState2 = world.getBlockState(blockPos2);
            if (blockState2.getBlock() instanceof ARFOGrassBlock && random.nextInt(10) == 0) {
                ((ARFOGrassBlock)blockState.getBlock()).growArtificialGrass(world, random, blockPos2, blockState2);
            }
            if (blockState2.getBlock() instanceof ARFOGrassBlockSlab && random.nextInt(10) == 0) {
                if (blockState2.getValue(TYPE) != SlabType.BOTTOM) ((ARFOGrassBlockSlab)blockState.getBlock()).growArtificialGrass(world, random, blockPos2, blockState2);
            }


            if (blockState2.isAir()) {
                BlockState blockState4 = failState;


                int rand = random.nextInt(80);
                if (rand < 10) {
                    blockState4 = features.get(0).defaultBlockState();
                } else if (rand < 30) {
                    blockState4 = features.get(1).defaultBlockState();
                } else if (rand < 35) {
                    if (world.getBlockState(blockPos2.above()).isAir()) {
                        blockState4 = features.get(2).defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 40) {
                    if (world.getBlockState(blockPos2.above()).isAir()) {
                        blockState4 = features.get(3).defaultBlockState().setValue(HALF, DoubleBlockHalf.LOWER);
                        large = true;
                    }
                } else if (rand < 45) {
                    blockState4 = features.get(random.nextInt(features.size() / 2) + 4).defaultBlockState();
                }

                if (blockState4.canSurvive(world, blockPos2)) {
                    world.setBlock(blockPos2, blockState4, 3);
                    if (large) {
                        world.setBlock(blockPos2.above(), blockState4.getBlock().defaultBlockState().setValue(HALF, DoubleBlockHalf.UPPER), 3);
                    }
                    large = false;
                }
            }
        }
    }

}
