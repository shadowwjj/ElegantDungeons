package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import static com.thegamerlegion.elegantdungeons.util.RegistryHandler.BRICK_BREAKER;

public class DungeonBrickSlab extends SlabBlock {

    public DungeonBrickSlab() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(-1.0F, 1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );

    }

    public void onBlockClicked(BlockState blockstate, World worldIn, BlockPos pos, PlayerEntity player) {
        if (player.getHeldItemMainhand().getItem() == BRICK_BREAKER.get()) {
            worldIn.destroyBlock(pos, true);
            player.getHeldItemMainhand().damageItem(1, player, playerEntity -> {
            });
        }
    }
}
