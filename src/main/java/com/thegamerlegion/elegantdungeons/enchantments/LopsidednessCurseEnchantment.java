package com.thegamerlegion.elegantdungeons.enchantments;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class LopsidednessCurseEnchantment extends Enchantment {
    public LopsidednessCurseEnchantment(Enchantment.Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
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
    public static class LopsidednessMovement {
        @SubscribeEvent
        public static void applyMovement(TickEvent.PlayerTickEvent event) {
            PlayerEntity player = event.player;
            if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(0)).containsKey(RegistryHandler.LOPSIDEDNESS_CURSE.get())) {
                if(player.isCrouching() && Math.random() > 0.999 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.25, 0 , (Math.random() - (Math.random() + 0.5)) * 0.25);
                }
                if(player.isSprinting() && Math.random() > 0.9993 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.3, 0 , (Math.random() - (Math.random() + 0.5)) * 0.3);
                }
            }
            if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(1)).containsKey(RegistryHandler.LOPSIDEDNESS_CURSE.get())) {
                if(player.isCrouching() && Math.random() > 0.999 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.25, 0 , (Math.random() - (Math.random() + 0.5)) * 0.25);
                }
                if(player.isSprinting() && Math.random() > 0.9993 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.3, 0 , (Math.random() - (Math.random() + 0.5)) * 0.3);
                }
            }
            if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(2)).containsKey(RegistryHandler.LOPSIDEDNESS_CURSE.get())) {
                if(player.isCrouching() && Math.random() > 0.999 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.25, 0 , (Math.random() - (Math.random() + 0.5)) * 0.25);
                }
                if(player.isSprinting() && Math.random() > 0.9993 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.3, 0 , (Math.random() - (Math.random() + 0.5)) * 0.3);
                }
            }
            if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(3)).containsKey(RegistryHandler.LOPSIDEDNESS_CURSE.get())) {
                if(player.isCrouching() && Math.random() > 0.999 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.25, 0 , (Math.random() - (Math.random() + 0.5)) * 0.25);
                }
                if(player.isSprinting() && Math.random() > 0.9993 && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.LOPSIDEDNESS_CURSE.get(), player) > 0) {
                    player.setMotion((Math.random() - (Math.random())) * 0.3, 0 , (Math.random() - (Math.random() + 0.5)) * 0.3);
                }
            }
        }
    }
}