package com.thegamerlegion.elegantdungeons.events;


import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.UUID;

import static net.minecraft.potion.Effects.HASTE;
import static net.minecraft.potion.Effects.POISON;

@Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SwordAbilitiesEvents {
    @SubscribeEvent
    public static void SwordEvent(TickEvent.PlayerTickEvent event) {
        PlayerEntity player = event.player;
        if (player.getHeldItemMainhand() != null && player.getHeldItemMainhand().getItem() == RegistryHandler.SNAKE_FANG.get()){
            if(player.isSpinAttacking()) {
                AxisAlignedBB axisalignedbb = player.getBoundingBox().grow(3.0D, 3.0D, 3.0D);
                List<LivingEntity> list = player.world.getEntitiesWithinAABB(LivingEntity.class, axisalignedbb);
                player.world.addParticle(ParticleTypes.SNEEZE, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
                if (!list.isEmpty()) {
                    for(LivingEntity livingentity : list) {
                        if (livingentity != player) {
                            livingentity.addPotionEffect(new EffectInstance(POISON, 120, 0, true, true));
                        }
                    }
                }
            }
        }
    }
}
