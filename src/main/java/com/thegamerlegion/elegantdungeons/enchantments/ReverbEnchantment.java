package com.thegamerlegion.elegantdungeons.enchantments;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

public class ReverbEnchantment extends Enchantment {
    public ReverbEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
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
    public static class Blast {
        @SubscribeEvent
        public static void applyBlast(LivingAttackEvent event) {
            LivingEntity entity = event.getEntityLiving();
            World entityWorld = event.getEntityLiving().getEntityWorld();
            boolean didExplode = false;
            if (EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.REVERB.get(), entity) > 0) {
                if(entity instanceof PlayerEntity);{
                    PlayerEntity player = (PlayerEntity) event.getEntityLiving();
                    if(player.isActiveItemStackBlocking() && EnchantmentHelper.getEnchantmentLevel(RegistryHandler.REVERB.get(), player.getHeldItemOffhand()) > 0){
                        entityWorld.playSound(player, player.getPosition(), SoundEvents.BLOCK_BELL_USE, SoundCategory.MASTER, 0.5F, 0.5F);
                        if(Math.random() > 0.9) {
                            if (event.getSource().getImmediateSource() instanceof LivingEntity && didExplode == false) {
                                LivingEntity attacker = (LivingEntity) event.getSource().getImmediateSource();
                                Explosion.Mode explosion$mode = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(player.world, player) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
                                entityWorld.createExplosion(player, attacker.getPosX(), attacker.getPosY() + 1, attacker.getPosZ(), 1, false, explosion$mode);
                                didExplode = true;
                            }
                        }
                    }
                }
            }
        }
    }
}