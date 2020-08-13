package com.thegamerlegion.elegantdungeons.blocks;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class DungeonDoorJamaniteLock extends Block {
    public DungeonDoorJamaniteLock() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(-1.0f,12000.0f)
                .sound(SoundType.STONE)
        );

    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(player.getHeldItemMainhand().getItem() == RegistryHandler.KEY_T3_BOSS.get() || player.getHeldItemOffhand().getItem() == RegistryHandler.KEY_T3_BOSS.get()) {
            worldIn.setBlockState(pos, RegistryHandler.DOOR_STATIC.get().getDefaultState());
            for (int num = 0; num < 40; num++) {
                double d0 = (double) pos.getX() + 0.5D + (Math.random() - 0.5D);
                double d1 = (double) pos.getY() + (Math.random() - 0.5D) * 0.2D;
                double d2 = (double) pos.getZ() +  0.5D + (Math.random() - 0.5D);
                worldIn.addParticle(ParticleTypes.CLOUD, d0, d1, d2, Math.random() - Math.random(), Math.random() - Math.random(), Math.random() - Math.random());
            }
            worldIn.playSound((PlayerEntity) null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.BLOCK_SCAFFOLDING_BREAK, SoundCategory.PLAYERS, 1.0F, 0.5F);
            if(player.getHeldItemMainhand().getItem() == RegistryHandler.KEY_T3_BOSS.get() && !player.abilities.isCreativeMode){
                player.getHeldItemMainhand().shrink(1);
            }
            else{
                if(!player.abilities.isCreativeMode){
                    player.getHeldItemOffhand().shrink(1);
                }
            }
            return ActionResultType.PASS;
        }
        return ActionResultType.FAIL;
    }
}
