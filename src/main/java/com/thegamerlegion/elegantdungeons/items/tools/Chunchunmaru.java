package com.thegamerlegion.elegantdungeons.items.tools;

import com.thegamerlegion.elegantdungeons.entities.MagicBall;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Chunchunmaru extends SwordItem {

    public Chunchunmaru(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }
}
