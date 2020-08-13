package com.thegamerlegion.elegantdungeons.enchantments;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class HeatSigilEnchantment extends Enchantment {
    public HeatSigilEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
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
        return 2;
    }

    @Override
    public boolean isTreasureEnchantment() {
        return false;
    }

    @Override
    public boolean isCurse() {
        return false;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return stack.canApplyAtEnchantingTable(this);
    }

    @Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class Fire {
        @SubscribeEvent
        public static void applyFire(LivingAttackEvent event) {
            LivingEntity entity = event.getEntityLiving();
            World entityWorld = event.getEntityLiving().getEntityWorld();
            if (EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.HEAT_SIGIL.get(), entity) > 0) {
                if(entity instanceof PlayerEntity);{
                    PlayerEntity player = (PlayerEntity) event.getEntityLiving();
                    if(player.isActiveItemStackBlocking() && EnchantmentHelper.getEnchantmentLevel(RegistryHandler.HEAT_SIGIL.get(), player.getHeldItemOffhand()) == 1){
                        LivingEntity attacker = (LivingEntity) event.getSource().getImmediateSource();
                        attacker.setFire(2);
                    }
                    if(player.isActiveItemStackBlocking() && EnchantmentHelper.getEnchantmentLevel(RegistryHandler.HEAT_SIGIL.get(), player.getHeldItemOffhand()) == 2){
                        LivingEntity attacker = (LivingEntity) event.getSource().getImmediateSource();
                        attacker.setFire(4);
                    }
                }
            }
        }
    }
}