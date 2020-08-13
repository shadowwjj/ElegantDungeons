package com.thegamerlegion.elegantdungeons.enchantments;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class UncomfortabilityCurseEnchantment extends Enchantment {
    public UncomfortabilityCurseEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
        super(rarityIn, typeIn, slots);
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 25;
    }
    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return 50;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }
    @Override
    public boolean isTreasureEnchantment() {
        return true;
    }
    @Override
    public boolean isCurse() {
        return true;
    }

    @Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class NoSleepage {
        @SubscribeEvent
        public static void applyNoSleepage(PlayerSleepInBedEvent event) {
            LivingEntity sleeper = event.getPlayer();
            if(EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.UNCOMFORTABILITY_CURSE.get(), sleeper) > 0) {
                event.setResult(PlayerEntity.SleepResult.OTHER_PROBLEM);
                sleeper.sendMessage(new StringTextComponent("Your armor is too uncomfortable to sleep in."));
            }
        }

    }
}