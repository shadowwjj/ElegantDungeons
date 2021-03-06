package com.thegamerlegion.elegantdungeons.blocks;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.items.tools.BrickBreaker;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;

import static com.ibm.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.thegamerlegion.elegantdungeons.util.RegistryHandler.BRICK_BREAKER;

public class DungeonBrick extends Block {

    public DungeonBrick() {
        super(Block.Properties.create(Material.ROCK)
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
