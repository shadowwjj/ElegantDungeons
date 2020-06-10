package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;

public class DungeonButton extends WoodButtonBlock {
    public DungeonButton(Properties properties
    ) {
        super(properties
                .doesNotBlockMovement()
                .hardnessAndResistance(1.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
        );
    }
}
