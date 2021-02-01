package com.thegamerlegion.elegantdungeons.items.tools;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.BlowgunProjectileEntity;
import net.minecraft.client.renderer.Quaternion;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.FireworkRocketEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.*;
import net.minecraft.stats.Stats;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.*;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class Celebrinator extends BowItem {

    public Celebrinator(IItemTier tier, float pull, Properties builder) {
        super(builder);
    }
    /**
     * Called when the player stops using an Item (stops holding the right mouse button).
     */
    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {

    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity playerentity = (PlayerEntity) entityLiving;
            boolean flag = playerentity.abilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
            ItemStack itemstack = playerentity.findAmmo(stack);

            int i = net.minecraftforge.event.ForgeEventFactory.onArrowLoose(stack, worldIn, playerentity, 0, !itemstack.isEmpty() || flag);

            if (!itemstack.isEmpty() || flag) {
                if (itemstack.isEmpty()) {
                    itemstack = new ItemStack(Items.FIREWORK_ROCKET);
                }

                    boolean flag1 = playerentity.abilities.isCreativeMode;
                    if (!worldIn.isRemote) {

                        ItemStack projectile = itemstack;
                        IProjectile iprojectile;

                        iprojectile = new FireworkRocketEntity(worldIn, projectile, playerentity.getPosX(), playerentity.getPosYEye() - (double) 0.15F, playerentity.getPosZ(), true);
                        Vec3d vec3d1 = playerentity.getUpVector(1.0F);
                        Vec3d vec3d = playerentity.getLook(1.0F);
                        Vector3f vector3f = new Vector3f(vec3d);
                        iprojectile.shoot((double) vector3f.getX(), (double) vector3f.getY(), (double) vector3f.getZ(), 1, 1);

                        worldIn.addEntity((Entity) iprojectile);
                        worldIn.playSound((PlayerEntity) null, playerentity.getPosX(), playerentity.getPosY(), playerentity.getPosZ(), SoundEvents.ITEM_CROSSBOW_SHOOT, SoundCategory.PLAYERS, 1.0F, 1);

                        stack.damageItem(1, playerentity, (p_220009_1_) -> {
                            p_220009_1_.sendBreakAnimation(playerentity.getActiveHand());
                        });

                        worldIn.playSound((PlayerEntity) null, playerentity.getPosX(), playerentity.getPosY(), playerentity.getPosZ(), SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0F, 0.5F);
                        if (!flag1 && !playerentity.abilities.isCreativeMode) {
                            itemstack.shrink(1);
                            if (itemstack.isEmpty()) {
                                playerentity.inventory.deleteStack(itemstack);
                            }
                        }

                        playerentity.addStat(Stats.ITEM_USED.get(this));
                    }
                }
            }
        return stack;
    }
    /**
     * Gets the velocity of the arrow entity from the bow's charge
     */

    public static float getArrowVelocity(int charge) {
        float f = (float)charge / 20.0F;
        f = (f * f + f * 2.0F) / 3.0F;
        if (f > 1.0F) {
            f = 1.0F;
        }

        return f;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getUseDuration(ItemStack stack) {
        return 7;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    /**
     * Called to trigger the item's "innate" right click behavior. To handle when this item is used on a Block, see
     * {@link #onItemUse}.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        boolean flag = !playerIn.findAmmo(itemstack).isEmpty();

        ActionResult<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onArrowNock(itemstack, worldIn, playerIn, handIn, flag);
        if (ret != null) return ret;

        if (!playerIn.abilities.isCreativeMode && !flag) {
            return ActionResult.resultFail(itemstack);
        } else {
            playerIn.setActiveHand(handIn);
            return ActionResult.resultConsume(itemstack);

        }
    }

    /**
     * Get the predicate to match ammunition when searching the player's inventory, not their main/offhand
     */

    public static final Predicate<ItemStack> FIREWORKS = (p_220002_0_) -> p_220002_0_.getItem() == Items.FIREWORK_ROCKET;

    public Predicate<ItemStack> getInventoryAmmoPredicate() {
        return FIREWORKS;
    }

    public AbstractArrowEntity customeArrow(AbstractArrowEntity arrow) {
        return arrow;
    }
}