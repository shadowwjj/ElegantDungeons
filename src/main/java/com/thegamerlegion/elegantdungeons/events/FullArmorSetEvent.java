package com.thegamerlegion.elegantdungeons.events;


import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.UUID;

import static net.minecraft.potion.Effects.*;

@Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FullArmorSetEvent {
    @SubscribeEvent
    public static void fullArmorSetEvent(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        AttributeModifier LACUMITE_SPEEDBOOST = new AttributeModifier(UUID.fromString("30692147-fc83-46b2-9bc5-7c231c7d7699"), "lacumite_speedboost", 0.015, AttributeModifier.Operation.ADDITION);
        AttributeModifier JAMANITE_HEARTS = new AttributeModifier(UUID.fromString("a1ac874d-a6fa-4556-a43e-f71b71818f03"), "jamanite_hearts", 4D, AttributeModifier.Operation.ADDITION);
        if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == RegistryHandler.LACUMITE_HELMET.get()
                && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == RegistryHandler.LACUMITE_CHESTPLATE.get()
                && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == RegistryHandler.LACUMITE_LEGGINGS.get()
                && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == RegistryHandler.LACUMITE_BOOTS.get()) {
            if(!player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(LACUMITE_SPEEDBOOST))
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(LACUMITE_SPEEDBOOST);
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
            if(!player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).hasModifier(JAMANITE_HEARTS))
                player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(JAMANITE_HEARTS);
        }
        else {
            player.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("a1ac874d-a6fa-4556-a43e-f71b71818f03"));
        }
    }
}
