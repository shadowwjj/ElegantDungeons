package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.WoodButtonBlock;

public class DungeonButton extends WoodButtonBlock {
    public DungeonButton(Properties properties
    ) {
        super(properties
                .doesNotBlockMovement()
        );
    }
}
