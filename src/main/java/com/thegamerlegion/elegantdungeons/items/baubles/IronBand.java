package com.thegamerlegion.elegantdungeons.items.baubles;

import com.lazy.baubles.api.BaubleType;
import com.lazy.baubles.api.IBauble;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.Vec3d;

import java.util.UUID;

public class IronBand extends Item implements IBauble {

    public IronBand() {
        super(new Properties().group(ElegantDungeons.TAB).maxStackSize(1));}

                @Override
                public BaubleType getBaubleType() { return BaubleType.HEAD; }

    AttributeModifier KBRESIST = new AttributeModifier(UUID.fromString("9c666c99-6938-48ef-a0b3-2537a2ad168b"), "knockback_resist", 0.5, AttributeModifier.Operation.ADDITION);
    public void onEquipped(LivingEntity player) {
        if(!player.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).hasModifier(KBRESIST)) {
            player.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).applyModifier(KBRESIST);
        }
    }

    public void onUnequipped(LivingEntity player) {
        if(player.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).hasModifier(KBRESIST)){
        player.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).removeModifier(UUID.fromString("9c666c99-6938-48ef-a0b3-2537a2ad168b"));
        }
    }
}