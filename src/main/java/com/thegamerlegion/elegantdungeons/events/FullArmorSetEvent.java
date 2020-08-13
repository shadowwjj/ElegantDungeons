package com.thegamerlegion.elegantdungeons.events;


import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

import static java.lang.StrictMath.round;
import static net.minecraft.potion.Effects.*;

@Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FullArmorSetEvent {
    @SubscribeEvent
    public static void fullArmorSetEvent(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        AttributeModifier LACUMITE_SPEEDBOOST = new AttributeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"), "lacumite_speedboost", 0.005, AttributeModifier.Operation.ADDITION);
        AttributeModifier JAMANITE_REINFORCEMENT = new AttributeModifier(UUID.fromString("a1ac874d-a6fa-4556-a43e-f71b71818f03"), "jamanite_reinforcement", 1D, AttributeModifier.Operation.ADDITION);
        AttributeModifier DIERAN_HEARTS = new AttributeModifier(UUID.fromString("2816b42c-048a-4017-8748-f5acf910ab94"), "dieran_hearts", 4D, AttributeModifier.Operation.ADDITION);
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.LACUMITE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.LACUMITE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.LACUMITE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.LACUMITE_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LACUMITE_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LACUMITE_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }

        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.FOSSENIUM_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.FOSSENIUM_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.FOSSENIUM_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.FOSSENIUM_BOOTS.get()) {
            if (player.getHeldItemMainhand().getItem() instanceof AxeItem) {
                player.addPotionEffect(new EffectInstance(HASTE, 2, 1, false, false));
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.JAMANITE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.JAMANITE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.JAMANITE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.JAMANITE_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.ARMOR).hasModifier(JAMANITE_REINFORCEMENT)) {
                player.getAttribute(SharedMonsterAttributes.ARMOR).applyModifier(JAMANITE_REINFORCEMENT);
            }
        }
        else {
            player.getAttribute(SharedMonsterAttributes.ARMOR).removeModifier(UUID.fromString("a1ac874d-a6fa-4556-a43e-f71b71818f03"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.DIERAN_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.DIERAN_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.DIERAN_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.DIERAN_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).hasModifier(DIERAN_HEARTS)){
                player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(DIERAN_HEARTS);
            }
            player.world.addParticle(ParticleTypes.SMOKE, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.02, (Math.random() - (Math.random())) * 0.02, (Math.random() - (Math.random())) * 0.02);
        }
        else {
            player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(UUID.fromString("2816b42c-048a-4017-8748-f5acf910ab94"));
        }
    }
    @SubscribeEvent
    public static void fallingEvent(LivingFallEvent event) {
        LivingEntity entity = event.getEntityLiving();
            if (entity.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.FEYRUNE_HELMET.get()
                    && entity.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.FEYRUNE_CHESTPLATE.get()
                    && entity.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.FEYRUNE_LEGGINGS.get()
                    && entity.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.FEYRUNE_BOOTS.get()) {
                if (entity.fallDistance > 3) {
                    int fallVal = round(entity.fallDistance / 4);
                    entity.getItemStackFromSlot(EquipmentSlotType.HEAD).damageItem(fallVal, entity, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                    entity.getItemStackFromSlot(EquipmentSlotType.CHEST).damageItem(fallVal, entity, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                    entity.getItemStackFromSlot(EquipmentSlotType.LEGS).damageItem(fallVal, entity, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                    entity.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(fallVal, entity, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                    event.setDamageMultiplier(0);
                    entity.fallDistance =  0.0F;
                    entity.playSound(SoundEvents.ITEM_SHOVEL_FLATTEN, 1.0F, 2.0F);
                    for (int num = 0; num < 10; num++) {
                        entity.world.addParticle(ParticleTypes.POOF, entity.getPosX(), entity.getPosY(), entity.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
                    }
                }
            }
        }
    }
