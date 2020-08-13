package com.thegamerlegion.elegantdungeons.items.tools;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.UseAction;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EnderousSword extends SwordItem {

    public EnderousSword(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
            ItemStack itemStack = playerIn.getHeldItem(handIn);
            playerIn.setActiveHand(handIn);
            worldIn.playSound((PlayerEntity) null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.PLAYERS, 1.0F, 2.5F);
            return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
    }
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
        int i = this.getUseDuration(stack) - timeLeft;
        if (i >= 20) {
            if (!worldIn.isRemote) {
                double d0 = entityLiving.getPosX();
                double d1 = entityLiving.getPosY();
                double d2 = entityLiving.getPosZ();

                for (int num = 0; num < 16; ++num) {
                    double d3 = entityLiving.getPosX() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
                    double d4 = MathHelper.clamp(entityLiving.getPosY() + (double) (entityLiving.getRNG().nextInt(16) - 8), 0.0D, (double) (worldIn.getActualHeight() - 1));
                    double d5 = entityLiving.getPosZ() + (entityLiving.getRNG().nextDouble() - 0.5D) * 16.0D;
                    if (entityLiving.isPassenger()) {
                        entityLiving.stopRiding();
                    }

                    if (entityLiving.attemptTeleport(d3, d4, d5, true)) {
                        worldIn.playSound((PlayerEntity) null, d0, d1, d2, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
                        entityLiving.playSound(SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, 1.0F, 1.0F);
                        break;
                    }
                }
                entityLiving.getActiveItemStack().damageItem(152, entityLiving, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                });
                if (entityLiving instanceof PlayerEntity) {
                    ((PlayerEntity)entityLiving).getCooldownTracker().setCooldown(this, 60);
                }
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
