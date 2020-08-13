package com.thegamerlegion.elegantdungeons.items.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.UseAction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.*;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import static net.minecraft.potion.Effects.POISON;

public class Feyblade extends SwordItem {

    public Feyblade(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
            ItemStack itemStack = playerIn.getHeldItem(handIn);
            playerIn.setActiveHand(handIn);
            return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
    }
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
        int i = this.getUseDuration(stack) - timeLeft;
        if(i >= 20) {
            entityLiving.clearActivePotions();
            worldIn.playSound(entityLiving.getPosX(), entityLiving.getPosY(), entityLiving.getPosZ(), SoundEvents.BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE, SoundCategory.PLAYERS, 0.5F, 2F, false);
            for (int num = 0; num < 15; num++) {
                entityLiving.world.addParticle(ParticleTypes.POOF, entityLiving.getPosX(), entityLiving.getPosY() + 1, entityLiving.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
            }
            entityLiving.getActiveItemStack().damageItem(15, entityLiving, (p_220045_0_) -> {
                p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
            if (entityLiving instanceof PlayerEntity) {
                ((PlayerEntity)entityLiving).getCooldownTracker().setCooldown(this, 20);
            }
        }

    }
    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }
}
