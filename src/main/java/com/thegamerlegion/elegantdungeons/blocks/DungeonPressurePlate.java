package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.thegamerlegion.elegantdungeons.util.RegistryHandler.BRICK_BREAKER;

public class DungeonPressurePlate extends PressurePlateBlock {
    public DungeonPressurePlate(Sensitivity sensitivityIn, Properties propertiesIn) {
        super(Sensitivity.MOBS, propertiesIn
                .doesNotBlockMovement()
                .hardnessAndResistance(-1.0F,1200.0f)
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
