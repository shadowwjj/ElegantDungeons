package com.thegamerlegion.elegantdungeons.blocks;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
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
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class DungeonTarFluid extends FlowingFluid{

    @Override
    public Fluid getFlowingFluid() {
        return RegistryHandler.DUNGEON_TAR_FLOWING.get();
    }

    @Override
    public Fluid getStillFluid() {
        return RegistryHandler.DUNGEON_TAR_SOURCE.get();
    }

    @Override
    protected boolean canSourcesMultiply() {
        return false;
    }

    @Override
    protected void beforeReplacingBlock(IWorld worldIn, BlockPos pos, BlockState state) {

    }

    @Override
    protected int getSlopeFindDistance(IWorldReader worldIn) {
        return 0;
    }

    @Override
    protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
        return 3;
    }

    @Override
    public Item getFilledBucket() {
        return RegistryHandler.TAR_BUCKET.get();
    }

    @Override
    protected boolean canDisplace(IFluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_, Fluid p_215665_4_, Direction p_215665_5_) {
        return false;
    }

    @Override
    public int getTickRate(IWorldReader p_205569_1_) {
        return 0;
    }

    @Override
    protected float getExplosionResistance() {
        return 0;
    }

    @Override
    protected BlockState getBlockState(IFluidState state) {
        return null;
    }

}