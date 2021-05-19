package com.finallion.arfo.common.blocks;


import net.minecraft.block.*;
;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;




public class ARFOLeavesCarpetBlock extends SlabBlock {
    protected static final VoxelShape LEAF_CARPET = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);

    public ARFOLeavesCarpetBlock() {
        super(AbstractBlock.Properties
                .of(Material.LEAVES)
                .noOcclusion()
                .noCollission()
                .instabreak()
                .sound(SoundType.GRASS));
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return LEAF_CARPET;
    }


}
