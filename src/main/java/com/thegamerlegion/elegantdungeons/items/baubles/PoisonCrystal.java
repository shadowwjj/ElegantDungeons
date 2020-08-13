package com.thegamerlegion.elegantdungeons.items.baubles;

import com.lazy.baubles.api.BaubleType;
import com.lazy.baubles.api.IBauble;
import com.lazy.baubles.api.cap.BaublesContainer;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.blocks.PoisonTrail;
import com.thegamerlegion.elegantdungeons.items.BaubleItem;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.function.Consumer;

import static javafx.scene.input.KeyCode.T;
import static net.minecraft.potion.Effects.HUNGER;
import static net.minecraft.potion.Effects.POISON;

public class PoisonCrystal extends Item implements IBauble {

    public PoisonCrystal() {
        super(new Item.Properties().group(ElegantDungeons.TAB).maxStackSize(1));}

    @Override
    public BaubleType getBaubleType() {
        return BaubleType.CHARM;
    }

    public void onWornTick(LivingEntity player) {
            player.removeActivePotionEffect(POISON);
            if(player.world.getBlockState(player.getPosition()) == RegistryHandler.POISON_TRAIL.get().getDefaultState()) {
            player.world.destroyBlock(player.getPosition(), true);
        }
    }
}