package com.thegamerlegion.elegantdungeons.events;


import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.Imple;
import com.thegamerlegion.elegantdungeons.items.baubles.IronBand;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.Explosion;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

import static java.lang.StrictMath.round;
import static net.minecraft.block.Blocks.SAND;
import static net.minecraft.potion.Effects.*;
import static net.minecraft.tags.BlockTags.LEAVES;

@Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FullArmorSetEvent {
    @SubscribeEvent
    public static void fullArmorSetEvent(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        AttributeModifier LIGHT_SPEEDBOOST = new AttributeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"), "light_speedboost", 0.005, AttributeModifier.Operation.ADDITION);
        AttributeModifier SUPER_SPEEDBOOST = new AttributeModifier(UUID.fromString("7142caa5-2745-406b-971f-564597f97596"), "super_speedboost", 0.05, AttributeModifier.Operation.ADDITION);
        AttributeModifier RATCRAWL_SPEEDBOOST = new AttributeModifier(UUID.fromString("d86ae8e0-8b2f-4f41-84af-c0c9ce093ad6"), "ratcrawl_speedboost", 0.2, AttributeModifier.Operation.ADDITION);
        AttributeModifier JAMANITE_REINFORCEMENT = new AttributeModifier(UUID.fromString("a1ac874d-a6fa-4556-a43e-f71b71818f03"), "jamanite_reinforcement", 1D, AttributeModifier.Operation.ADDITION);
        AttributeModifier DIERAN_HEARTS = new AttributeModifier(UUID.fromString("2816b42c-048a-4017-8748-f5acf910ab94"), "dieran_hearts", 4D, AttributeModifier.Operation.ADDITION);
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.LACUMITE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.LACUMITE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.LACUMITE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.LACUMITE_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
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
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.GUARDIAN_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.GUARDIAN_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.GUARDIAN_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.GUARDIAN_BOOTS.get()) {
            if(player.isInWater()) {
                player.addPotionEffect(new EffectInstance(WATER_BREATHING, 50, 0, false, false));
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.ELDER_GUARDIAN_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.ELDER_GUARDIAN_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.ELDER_GUARDIAN_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.ELDER_GUARDIAN_BOOTS.get()) {
            if(player.isSwimming()) {
                player.world.addParticle(ParticleTypes.BUBBLE, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.04, (Math.random() - (Math.random())) * 0.04, (Math.random() - (Math.random())) * 0.04);
                player.addPotionEffect(new EffectInstance(RESISTANCE, 20, 0, false, false));
            }
            if(player.isInWater()) {
                player.addPotionEffect(new EffectInstance(WATER_BREATHING, 50, 0, false, false));
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.DOLPHIN_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.DOLPHIN_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.DOLPHIN_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.DOLPHIN_BOOTS.get()) {
            if(player.isSwimming()) {
                player.world.addParticle(ParticleTypes.BUBBLE, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);
                player.addPotionEffect(new EffectInstance(DOLPHINS_GRACE, 20, 0, false, false));
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.MINER_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.MINER_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.MINER_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.MINER_BOOTS.get()) {
            if (player.getHeldItemMainhand().getItem() instanceof PickaxeItem) {
                player.addPotionEffect(new EffectInstance(HASTE, 2, 1, false, false));
                player.addPotionEffect(new EffectInstance(STRENGTH, 2, 0, false, false));
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.STEAMPUNK_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.STEAMPUNK_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.STEAMPUNK_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.STEAMPUNK_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
            if(player.isSprinting()){
                player.world.addParticle(ParticleTypes.POOF, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.DUCK_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.DUCK_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.DUCK_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.DUCK_BOOTS.get()) {
            if (player.hurtTime > 0){
                player.world.addParticle(ParticleTypes.POOF, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.MOONWALKER_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.MOONWALKER_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.MOONWALKER_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.MOONWALKER_BOOTS.get()) {
            if (player.world.isNightTime()){
                player.addPotionEffect(new EffectInstance(JUMP_BOOST, 2, 2, false, false));
                player.addPotionEffect(new EffectInstance(SLOW_FALLING, 2, 0, false, false));
            }
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.DEMONIC_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.DEMONIC_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.DEMONIC_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.DEMONIC_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
            if(player.getHeldItemMainhand().getItem() == RegistryHandler.DEMONIC_SWORD.get()) {
                player.addPotionEffect(new EffectInstance(JUMP_BOOST, 2, 1, false, false));
                player.addPotionEffect(new EffectInstance(STRENGTH, 2, 0, false, false));
                player.world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.02, (Math.random() - (Math.random())) * 0.02, (Math.random() - (Math.random())) * 0.02);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.KNIGHT_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.KNIGHT_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.KNIGHT_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.KNIGHT_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.SAMURAI_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.SAMURAI_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.SAMURAI_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.SAMURAI_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.ROGUE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.ROGUE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.ROGUE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.ROGUE_BOOTS.get()) {
            player.addPotionEffect(new EffectInstance(INVISIBILITY, 2, 0, false, false));
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.FIREFLY_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.FIREFLY_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.FIREFLY_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.FIREFLY_BOOTS.get()) {
            player.addPotionEffect(new EffectInstance(GLOWING, 2, 0, false, false));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.RAT_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.RAT_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.RAT_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.RAT_BOOTS.get()
                && (player.getPose() == Pose.SWIMMING) && !player.isInWater()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(RATCRAWL_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(RATCRAWL_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("d86ae8e0-8b2f-4f41-84af-c0c9ce093ad6"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.SKELETAL_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.SKELETAL_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.SKELETAL_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.SKELETAL_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.POLAR_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.POLAR_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.POLAR_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.POLAR_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.MUSHROOM_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.MUSHROOM_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.MUSHROOM_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.MUSHROOM_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.PEARL_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.PEARL_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.PEARL_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.PEARL_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.RAINBOW_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.RAINBOW_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.RAINBOW_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.RAINBOW_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
            if(player.world.isRaining()){
                player.addPotionEffect(new EffectInstance(LUCK,100,0, true, false));
                player.addPotionEffect(new EffectInstance(GLOWING,100,0, true, false));
                player.world.addParticle(ParticleTypes.END_ROD, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.SAILOR_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.SAILOR_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.SAILOR_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.SAILOR_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
            if(player.isCrouching()){
                player.addPotionEffect(new EffectInstance(RESISTANCE,20,0, false, false));
                player.world.addParticle(ParticleTypes.BUBBLE, player.getPosX() + Math.random() - Math.random(), player.getPosY() + 1 + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.CRYSTALLINE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.CRYSTALLINE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.CRYSTALLINE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.CRYSTALLINE_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
            if(player.isCrouching()){
                player.addPotionEffect(new EffectInstance(STRENGTH,20,0, true, false));
                player.world.addParticle(ParticleTypes.ENCHANTED_HIT, player.getPosX() + Math.random() - Math.random(), player.getPosY() + 1 + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.METEORITE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.METEORITE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.METEORITE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.METEORITE_BOOTS.get()
                && player.isSprinting()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }

                player.addPotionEffect(new EffectInstance(FIRE_RESISTANCE,20,0, false, false));
                player.world.addParticle(ParticleTypes.FLAME, player.getPosX() + Math.random() - Math.random(), player.getPosY() + 1 + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);

        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.AMBER_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.AMBER_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.AMBER_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.AMBER_BOOTS.get()
                && player.isSprinting()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }

            player.addPotionEffect(new EffectInstance(RESISTANCE,20,0, false, false));
            player.world.addParticle(ParticleTypes.CRIT, player.getPosX() + Math.random() - Math.random(), player.getPosY() + 1 + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);

        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.SCALE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.SCALE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.SCALE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.SCALE_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.SWIFT_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.SWIFT_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.SWIFT_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.SWIFT_BOOTS.get()
                && player.isSprinting()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(SUPER_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(SUPER_SPEEDBOOST);
            }

            player.addPotionEffect(new EffectInstance(WEAKNESS,20,0, false, false));
            player.world.addParticle(ParticleTypes.POOF, player.getPosX() + Math.random() - Math.random(), player.getPosY() + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);

        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("7142caa5-2745-406b-971f-564597f97596"));
        }
        if (player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.OVERGROWTH_HELMET.get()
                && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.OVERGROWTH_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.OVERGROWTH_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.OVERGROWTH_BOOTS.get()
                && player.world.getLightFor(LightType.SKY, player.getPosition()) >= 14) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LIGHT_SPEEDBOOST)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LIGHT_SPEEDBOOST);
            }
            if(Math.random() > 0.9993){
                player.getItemStackFromSlot(EquipmentSlotType.HEAD).damageItem(-1, player, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                player.getItemStackFromSlot(EquipmentSlotType.CHEST).damageItem(-1, player, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                player.getItemStackFromSlot(EquipmentSlotType.LEGS).damageItem(-1, player, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(-1, player, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);});
                player.addPotionEffect(new EffectInstance(STRENGTH,200,0, false, false));
                player.addPotionEffect(new EffectInstance(ABSORPTION,200,1, false, false));
                player.world.playSound((PlayerEntity) null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.PLAYERS, 0.1F, 2.0F);
                for(int j = 0; j < 5; j++){
                    player.world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, player.getPosX() + Math.random() - Math.random(), player.getPosY() + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);
                }
            }
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.CLOUD_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.CLOUD_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.CLOUD_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.CLOUD_BOOTS.get()) {
            player.addPotionEffect(new EffectInstance(SLOW_FALLING,20,0, false, false));
        }
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.OCELOT_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.OCELOT_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.OCELOT_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.OCELOT_BOOTS.get()
                && !player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(SUPER_SPEEDBOOST) && (player.world.getBlockState(player.getPosition().down()).getMaterial() == Material.LEAVES
                || (player.world.getBlockState(player.getPosition().down()).getMaterial() == Material.AIR) && player.world.getBlockState(player.getPosition().down(2)).getMaterial() == Material.LEAVES)) {
                player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(SUPER_SPEEDBOOST);
                player.world.addParticle(ParticleTypes.POOF, player.getPosX() + Math.random() - Math.random(), player.getPosY() + Math.random() - Math.random(), player.getPosZ() + Math.random() - Math.random(), (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1, (Math.random() - (Math.random())) * 0.1);
        }
        else{
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("7142caa5-2745-406b-971f-564597f97596"));
        }
    }
    @SubscribeEvent
    public static void fallingEvent(LivingFallEvent event) {
        LivingEntity entity = event.getEntityLiving();
            if (entity.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.FEYRUNE_HELMET.get()
                    && entity.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.FEYRUNE_CHESTPLATE.get()
                    && entity.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.FEYRUNE_LEGGINGS.get()
                    && entity.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.FEYRUNE_BOOTS.get() && entity != null) {
                if (entity.fallDistance > 3) {
                    int fallVal = round(entity.fallDistance / 2);
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
    @SubscribeEvent
    public static void LivingAttack(LivingAttackEvent event) {

        LivingEntity entity = (LivingEntity) event.getEntityLiving();
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.MAGMATIC_HELMET.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.MAGMATIC_CHESTPLATE.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.MAGMATIC_LEGGINGS.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.MAGMATIC_BOOTS.get() && player != null) {
                if (player instanceof PlayerEntity) {
                    Entity attacker = event.getSource().getImmediateSource();
                    if (attacker != null) {
                        attacker.setFire(2);
                    }
                }
            }
            if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.TESLA_HELMET.get()
                    && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.TESLA_CHESTPLATE.get()
                    && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.TESLA_LEGGINGS.get()
                    && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.TESLA_BOOTS.get()) {
                if (player instanceof PlayerEntity) {
                    Entity attacker = event.getSource().getImmediateSource();
                    if (attacker != null) {
                        if (Math.random() > 0.9) {
                            World worldin = player.world;
                            LightningBoltEntity lightning = new LightningBoltEntity(worldin, player.getPosX() + Math.random() * 2 - Math.random() * 2, player.getPosY(), player.getPosZ() + Math.random() * 2 - Math.random() * 2, false);
                            worldin.addEntity(lightning);
                        }
                    }
                }
            }
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.PUFFERFISH_HELMET.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.PUFFERFISH_CHESTPLATE.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.PUFFERFISH_LEGGINGS.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.PUFFERFISH_BOOTS.get() && player != null) {
                if (player instanceof PlayerEntity) {
                    Entity attacker = event.getSource().getImmediateSource();
                    if (attacker != null && attacker instanceof LivingEntity) {
                        ((LivingEntity) attacker).addPotionEffect(new EffectInstance(POISON,100,0, false, false));
                    }
                }
            }
            if (player.inventory.armorItemInSlot(3) != null && (player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.CREEPER_HELMET.get() || player.inventory.armorItemInSlot(3).getItem() == Items.CREEPER_HEAD)
                    && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.CREEPER_CHESTPLATE.get()
                    && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.CREEPER_LEGGINGS.get()
                    && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.CREEPER_BOOTS.get()) {
                Entity attacker = event.getSource().getImmediateSource();
                if (attacker != null) {

                    if(player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.CREEPER_HELMET.get()) {
                        player.getItemStackFromSlot(EquipmentSlotType.HEAD).damageItem(80, player, (p_220045_0_) -> {
                            p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                        });
                    }

                    player.getItemStackFromSlot(EquipmentSlotType.CHEST).damageItem(80, player, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                    });
                    player.getItemStackFromSlot(EquipmentSlotType.LEGS).damageItem(80, player, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                    });
                    player.getItemStackFromSlot(EquipmentSlotType.FEET).damageItem(80, player, (p_220045_0_) -> {
                        p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                    });
                    for (int num = 0; num < 20; num++) {
                        player.world.addParticle(ParticleTypes.POOF, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
                    }
                    Explosion.Mode explosion$mode = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(player.world, player) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
                    player.world.createExplosion(player, player.getPosX(), player.getPosY(), player.getPosZ(), 3, false, explosion$mode);
                }
            }
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.WITHER_HELMET.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.WITHER_CHESTPLATE.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.WITHER_LEGGINGS.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.WITHER_BOOTS.get() && player != null) {
                if (player instanceof PlayerEntity) {
                    Entity attacker = event.getSource().getImmediateSource();
                    if (attacker != null && attacker instanceof LivingEntity) {
                        ((LivingEntity) attacker).addPotionEffect(new EffectInstance(WITHER,75,0, false, false));
                    }
                }
            }
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.CLOUD_HELMET.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.CLOUD_CHESTPLATE.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.CLOUD_LEGGINGS.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.CLOUD_BOOTS.get() && player != null) {
                if (player instanceof PlayerEntity) {
                    Entity attacker = event.getSource().getImmediateSource();
                    if (attacker != null && attacker instanceof LivingEntity && Math.random() > 0.8) {
                        ((LivingEntity) attacker).addPotionEffect(new EffectInstance(LEVITATION,75,0, false, false));
                    }
                }
            }
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.CLOWN_HELMET.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.CLOWN_CHESTPLATE.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.CLOWN_LEGGINGS.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.CLOWN_BOOTS.get() && player != null) {
                    player.world.playSound((PlayerEntity) null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_VILLAGER_CELEBRATE, SoundCategory.PLAYERS, 1.0F, 2.0F);
            }
            if (player.getItemStackFromSlot(EquipmentSlotType.HEAD).getItem() == RegistryHandler.DUCK_HELMET.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.CHEST).getItem() == RegistryHandler.DUCK_CHESTPLATE.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.LEGS).getItem() == RegistryHandler.DUCK_LEGGINGS.get()
                    && player.getItemStackFromSlot(EquipmentSlotType.FEET).getItem() == RegistryHandler.DUCK_BOOTS.get() && player != null) {
                player.world.playSound((PlayerEntity) null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_VILLAGER_CELEBRATE, SoundCategory.PLAYERS, 1.0F, 2.0F);
            }
        }
    }
    @SubscribeEvent
    public static void LightningStrike(EntityStruckByLightningEvent event) {
        Entity entity = event.getEntity();
        LightningBoltEntity lightning = event.getLightning();
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) event.getEntity();
            if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.TESLA_HELMET.get()
                    && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.TESLA_CHESTPLATE.get()
                    && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.TESLA_LEGGINGS.get()
                    && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.TESLA_BOOTS.get()) {
                player.addPotionEffect(new EffectInstance(SPEED, 200, 1, false, false));
                player.addPotionEffect(new EffectInstance(HASTE, 200, 1, false, false));
                player.addPotionEffect(new EffectInstance(REGENERATION, 200, 0, false, false));
            }
        }
    }
}
