package com.thegamerlegion.elegantdungeons.items.baubles;

import com.lazy.baubles.api.BaubleType;
import com.lazy.baubles.api.IBauble;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;

import static net.minecraft.potion.Effects.NIGHT_VISION;

public class CatEyeAmulet extends Item implements IBauble {

    public CatEyeAmulet() {
        super(new Properties().group(ElegantDungeons.TAB).maxStackSize(1));}


                @Override
                public BaubleType getBaubleType() { return BaubleType.AMULET; }


    @Override
    public void onWornTick(LivingEntity player) {
        player.addPotionEffect(new EffectInstance(NIGHT_VISION, 250, 0, false, false));
    }
}