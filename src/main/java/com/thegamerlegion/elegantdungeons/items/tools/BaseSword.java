package com.thegamerlegion.elegantdungeons.items.tools;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BaseSword extends SwordItem {

    public BaseSword(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }
}
