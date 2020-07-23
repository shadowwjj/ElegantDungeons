package com.thegamerlegion.elegantdungeons.enchantments;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.storage.SaveHandler;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Modifier;
import java.util.UUID;

import static jdk.nashorn.internal.objects.Global.print;
import static net.minecraft.potion.Effects.POISON;
import static net.minecraft.potion.Effects.SPEED;

public class DuneStriderEnchantment extends Enchantment {
    public DuneStriderEnchantment(Rarity rarityIn, EnchantmentType typeIn, EquipmentSlotType... slots) {
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
        return 3;
    }

    @Override
    public boolean isTreasureEnchantment() {
        return false;
    }

    @Override
    public boolean isCurse() {
        return false;
    }

    @Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class Speediness {
        @SubscribeEvent
        public static void applySpeed(TickEvent.PlayerTickEvent event) {
            PlayerEntity player = event.player;
            AttributeModifier SPEEDBOOST_LEVEL1 = new AttributeModifier(UUID.fromString("a972941d-0b7b-42cc-acad-2c6cfac797ff"), "speedboost_level", 0.02, AttributeModifier.Operation.ADDITION);
            AttributeModifier SPEEDBOOST_LEVEL2 = new AttributeModifier(UUID.fromString("f83951d5-d79f-4cfc-8aab-cdfbecb29d1b"), "speedboost_level", 0.04, AttributeModifier.Operation.ADDITION);
            AttributeModifier SPEEDBOOST_LEVEL3 = new AttributeModifier(UUID.fromString("62f985bb-e770-46c4-91a9-059a1700dd0c"), "speedboost_level", 0.06, AttributeModifier.Operation.ADDITION);
            if (EnchantmentHelper.getMaxEnchantmentLevel(RegistryHandler.DUNE_STRIDER.get(), player) > 0) {
                if (!player.isInWater() && player.isSprinting() && ((player.world.getBlockState(player.getPosition().down(1)) == Blocks.SAND.getDefaultState() || player.world.getBlockState(player.getPosition().down(2)) == Blocks.SAND.getDefaultState())) || (player.world.getBlockState(player.getPosition().down(1)) == Blocks.RED_SAND.getDefaultState() || player.world.getBlockState(player.getPosition().down(2)) == Blocks.RED_SAND.getDefaultState())) {
                    if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(SPEEDBOOST_LEVEL1) && EnchantmentHelper.getEnchantmentLevel(RegistryHandler.DUNE_STRIDER.get(), player.inventory.armorItemInSlot(0)) == 1) {
                        player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(SPEEDBOOST_LEVEL1);
                        player.playSound(SoundEvents.BLOCK_CAMPFIRE_CRACKLE,0.5F,2.0F);
                    }
                    if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(SPEEDBOOST_LEVEL2) && EnchantmentHelper.getEnchantmentLevel(RegistryHandler.DUNE_STRIDER.get(), player.inventory.armorItemInSlot(0)) == 2) {
                        player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(SPEEDBOOST_LEVEL2);
                        player.playSound(SoundEvents.BLOCK_CAMPFIRE_CRACKLE,0.5F,2.0F);
                    }
                    if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(SPEEDBOOST_LEVEL3) && EnchantmentHelper.getEnchantmentLevel(RegistryHandler.DUNE_STRIDER.get(), player.inventory.armorItemInSlot(0)) == 3) {
                        player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(SPEEDBOOST_LEVEL3);
                        player.playSound(SoundEvents.BLOCK_CAMPFIRE_CRACKLE,0.5F,2.0F);
                    }

                    if(Math.random() > 0.995 - (EnchantmentHelper.getEnchantmentLevel(RegistryHandler.DUNE_STRIDER.get(), player.inventory.armorItemInSlot(0)) / 90D)) {
                        player.inventory.armorItemInSlot(0).damageItem(1, player, playerEntity -> {
                        });
                        player.world.addParticle(ParticleTypes.POOF, player.getPosX(), player.getPosY(), player.getPosZ(), 0.2D, 0.2D, 0.2D);
                        player.playSound(SoundEvents.BLOCK_CAMPFIRE_CRACKLE,0.15F,2.0F);
                    }
                }
                else {
                    player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("a972941d-0b7b-42cc-acad-2c6cfac797ff"));
                    player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("f83951d5-d79f-4cfc-8aab-cdfbecb29d1b"));
                    player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("62f985bb-e770-46c4-91a9-059a1700dd0c"));
                }
            }
        }
    }
}