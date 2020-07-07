package net.minecraft.item;

import com.thegamerlegion.elegantdungeons.entities.LacumiteMagicBall;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import static net.minecraft.item.Item.random;

public class MagicBall {
    public MagicBall(Item.Properties builder) {
        super();
    }
    
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        worldIn.playSound((PlayerEntity)null, playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (random.nextFloat() * 0.4F + 0.8F));
        if (!worldIn.isRemote) {
            LacumiteMagicBall magicballentity = new LacumiteMagicBall(worldIn, playerIn);
            magicballentity.setItem(itemstack);
            magicballentity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 1.0F);
            worldIn.addEntity(magicballentity);
        }

        return ActionResult.resultSuccess(itemstack);
    }
}

