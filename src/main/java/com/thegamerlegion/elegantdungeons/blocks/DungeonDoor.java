package com.thegamerlegion.elegantdungeons.blocks;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class DungeonDoor extends Block {
    public DungeonDoor() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(-1.0f, 12000.0f)
                .sound(SoundType.STONE)
        );
    }

    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        DebugPacketSender.func_218806_a(worldIn, pos);
        if (worldIn.getBlockState(pos) != worldIn.getBlockState(fromPos) && blockIn.getDefaultState() == RegistryHandler.DOOR_STATIC.get().getDefaultState()) {
            worldIn.setBlockState(pos, RegistryHandler.DOOR_STATIC.get().getDefaultState());
        }
    }
}
