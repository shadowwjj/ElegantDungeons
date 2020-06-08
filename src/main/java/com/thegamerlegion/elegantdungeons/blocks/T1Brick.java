package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class T1Brick extends Block {

    public T1Brick() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,1200.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );

    }
}
