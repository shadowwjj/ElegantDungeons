package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SoundType;

public class DungeonPressurePlate extends PressurePlateBlock {
    public DungeonPressurePlate(Sensitivity sensitivityIn, Properties propertiesIn) {
        super(Sensitivity.MOBS, propertiesIn
                .doesNotBlockMovement()
                .hardnessAndResistance(1.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
        );
    }
}
