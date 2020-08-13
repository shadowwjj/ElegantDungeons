package com.thegamerlegion.elegantdungeons.items.tools;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.Imple;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

import static net.minecraft.potion.Effects.POISON;

public class SnakeFang extends SwordItem {

    public SnakeFang(IItemTier tier, float attackSpeedIn, Properties builder) {
        super(tier, (int) tier.getAttackDamage(), attackSpeedIn, builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(!playerIn.isElytraFlying()) {
            ItemStack itemStack = playerIn.getHeldItem(handIn);
            playerIn.setActiveHand(handIn);
            return new ActionResult<ItemStack>(ActionResultType.SUCCESS, playerIn.getHeldItem(handIn));
        }
        return new ActionResult<ItemStack>(ActionResultType.FAIL, playerIn.getHeldItem(handIn));
    }
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
        int i = this.getUseDuration(stack) - timeLeft;
        if(i >= 10){
            Vec3d lookVec = entityLiving.getLookVec();
            double x = lookVec.getX();
            double z = lookVec.getZ();
            if (entityLiving.onGround){
                entityLiving.startSpinAttack(20);
                entityLiving.addVelocity(x * 3, 0.4, z * 3);
                entityLiving.getActiveItemStack().damageItem(152, entityLiving, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                });
                worldIn.playSound(entityLiving.getPosX(),entityLiving.getPosY(),entityLiving.getPosZ(), SoundEvents.ITEM_TRIDENT_RIPTIDE_2, SoundCategory.PLAYERS,1, 1, false);
            }
            else if (!entityLiving.isElytraFlying()){
                entityLiving.startSpinAttack(25);
                entityLiving.addVelocity(x * 1.2, 0.5, z * 1.2);
                entityLiving.getActiveItemStack().damageItem(152, entityLiving, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                });
                worldIn.playSound(entityLiving.getPosX(),entityLiving.getPosY(),entityLiving.getPosZ(), SoundEvents.ITEM_TRIDENT_RIPTIDE_3, SoundCategory.PLAYERS,1, 1, false);
            }
            if (entityLiving instanceof PlayerEntity) {
                ((PlayerEntity)entityLiving).getCooldownTracker().setCooldown(this, 60);
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
        return UseAction.SPEAR;
    }
}
