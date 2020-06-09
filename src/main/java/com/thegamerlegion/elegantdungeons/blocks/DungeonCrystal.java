package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DungeonCrystal extends Block {

    public DungeonCrystal() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(5.0f,0.7f)
                .sound(SoundType.GLASS)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .lightValue(8)
        );

    }
}
