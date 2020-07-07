package com.thegamerlegion.elegantdungeons.items.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;

import java.util.Properties;

public class Chunchunmaru extends SwordItem {

    public Chunchunmaru(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }
}