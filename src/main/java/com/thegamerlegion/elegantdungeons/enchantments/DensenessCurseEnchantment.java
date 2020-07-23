package com.thegamerlegion.elegantdungeons.enchantments;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class DensenessCurseEnchantment extends Enchantment {
    public DensenessCurseEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
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
    public static class Denseness {
        @SubscribeEvent
        public static void applySinkage(TickEvent.PlayerTickEvent event) {
            PlayerEntity player = event.player;
            if(player.isInWater() && EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.DENSENESS_CURSE.get(), player) > 0) {
                if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(0)).containsKey(RegistryHandler.DENSENESS_CURSE.get())) {
                    player.addVelocity(0,-0.007,0);
                }
                if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(1)).containsKey(RegistryHandler.DENSENESS_CURSE.get())) {
                    player.addVelocity(0,-0.007,0);
                }
                if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(2)).containsKey(RegistryHandler.DENSENESS_CURSE.get())) {
                    player.addVelocity(0,-0.007,0);
                }
                if(EnchantmentHelper.getEnchantments(player.inventory.armorItemInSlot(3)).containsKey(RegistryHandler.DENSENESS_CURSE.get())) {
                    player.addVelocity(0,-0.007,0);
                }
            }
        }
    }
}