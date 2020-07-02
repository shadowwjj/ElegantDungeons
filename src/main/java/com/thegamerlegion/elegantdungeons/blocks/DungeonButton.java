package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.thegamerlegion.elegantdungeons.util.RegistryHandler.BRICK_BREAKER;

public class DungeonButton extends WoodButtonBlock {
    public DungeonButton(Properties properties
    ) {
        super(properties
                .doesNotBlockMovement()
                .hardnessAndResistance(-1.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
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
