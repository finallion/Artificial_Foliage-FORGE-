package com.finallion.arfo.common.fluids;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidAttributes;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class ARFOWater extends FlowingFluid {

    @OnlyIn(Dist.CLIENT)
    public void animateTick(World world, BlockPos pos, FluidState state, Random r) {
        if (!state.isSource() && !state.getValue(FALLING)) {
            if (r.nextInt(64) == 0) {
                world.playLocalSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.WATER_AMBIENT, SoundCategory.BLOCKS, r.nextFloat() * 0.25F + 0.75F, r.nextFloat() + 0.5F, false);
            }
        } else if (r.nextInt(10) == 0) {
            world.addParticle(ParticleTypes.UNDERWATER, (double)pos.getX() + r.nextDouble(), (double)pos.getY() + r.nextDouble(), (double)pos.getZ() + r.nextDouble(), 0.0D, 0.0D, 0.0D);
        }

    }

    @Nullable
    @OnlyIn(Dist.CLIENT)
    public IParticleData getDripParticle() {
        return ParticleTypes.DRIPPING_WATER;
    }

    protected boolean canConvertToSource() {
        return true;
    }

    protected void beforeDestroyingBlock(IWorld p_205580_1_, BlockPos p_205580_2_, BlockState p_205580_3_) {
        TileEntity tileentity = p_205580_3_.hasTileEntity() ? p_205580_1_.getBlockEntity(p_205580_2_) : null;
        Block.dropResources(p_205580_3_, p_205580_1_, p_205580_2_, tileentity);
    }

    public int getSlopeFindDistance(IWorldReader p_185698_1_) {
        return 4;
    }

    public boolean isSame(Fluid fluid) {
        return fluid == getSource() || fluid == getFlowing();
    }

    public int getDropOff(IWorldReader p_204528_1_) {
        return 1;
    }

    public int getTickDelay(IWorldReader p_205569_1_) {
        return 5;
    }

    public boolean canBeReplacedWith(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_, Fluid p_215665_4_, Direction p_215665_5_) {
        return p_215665_5_ == Direction.DOWN && !p_215665_4_.is(FluidTags.WATER);
    }

    protected float getExplosionResistance() {
        return 100.0F;
    }



}
