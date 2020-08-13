package com.thegamerlegion.elegantdungeons.items.baubles;

import com.lazy.baubles.api.BaubleType;
import com.lazy.baubles.api.IBauble;
import com.lazy.baubles.api.cap.BaublesCapabilities;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static net.minecraft.potion.Effects.POISON;

public class FeatherBooster extends Item implements IBauble {

    public FeatherBooster() {
        super(new Properties().group(ElegantDungeons.TAB).maxStackSize(1));}


                @Override
                public BaubleType getBaubleType() { return BaubleType.BODY; }
                int tickCount = 0;

    @Override
    public void onWornTick(LivingEntity player) {
        if(player.isElytraFlying()){
            Vec3d lookVec = player.getLookVec();
            double x = lookVec.getX();
            double y = lookVec.getX();
            double z = lookVec.getZ();
            

            tickCount ++;
            if (tickCount > 60) {
                player.addVelocity(x * 0.25,y * 0.25, z * 0.25);
                player.world.addParticle(ParticleTypes.POOF, player.getPosX(), player.getPosY(), player.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
                tickCount = 0;
            }
        }
    }
}