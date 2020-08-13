package com.thegamerlegion.elegantdungeons.items.tools;

import com.thegamerlegion.elegantdungeons.entities.Imple;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.spawner.WorldEntitySpawner;

import java.rmi.registry.Registry;

public class DemonicSword extends SwordItem {

    public DemonicSword(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damageItem(1, attacker, (p_220045_0_) -> {
            p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        if(Math.random() > 0.8 && !(target instanceof Imple)){
            World worldin = attacker.getEntityWorld();
            Imple implespawn = new Imple(RegistryHandler.IMPLE.get(), worldin);
            EntityType<?> entitytype = ((SpawnEggItem) RegistryHandler.IMPLE_EGG.get().getItem()).getType(stack.getTag());
            entitytype.spawn(worldin, stack, null, attacker.getPosition(), SpawnReason.DISPENSER, true, false);
            target.world.addEntity(implespawn);
        }
        return true;
    }
}
