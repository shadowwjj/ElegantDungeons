package com.thegamerlegion.elegantdungeons.items.baubles;

import com.lazy.baubles.api.BaubleType;
import com.lazy.baubles.api.IBauble;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;

import java.util.UUID;

public class DieranRing extends Item implements IBauble {

    public DieranRing() {
        super(new Properties().group(ElegantDungeons.TAB).maxStackSize(1));}

                @Override
                public BaubleType getBaubleType() { return BaubleType.RING; }

    AttributeModifier HEALTHBOOST = new AttributeModifier(UUID.fromString("0cbda532-518c-4271-be18-c694fe86523a"), "healthboost", 2D, AttributeModifier.Operation.ADDITION);
    public void onEquipped(LivingEntity player) {
        if(!player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).hasModifier(HEALTHBOOST)) {
            player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).applyModifier(HEALTHBOOST);
        }
    }

    public void onUnequipped(LivingEntity player) {
        if(player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).hasModifier(HEALTHBOOST)){
        player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(UUID.fromString("0cbda532-518c-4271-be18-c694fe86523a"));
        }
    }
}