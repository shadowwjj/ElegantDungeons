package com.thegamerlegion.elegantdungeons.entities;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlackArrowEntity extends AbstractArrowEntity {

    public BlackArrowEntity(EntityType<? extends BlackArrowEntity> shooter, World worldIn) {
        super(shooter, worldIn);
    }

    public BlackArrowEntity(World worldIn, double x, double y, double z) {
        super(RegistryHandler.BLACK_ARROW.get(), x, y, z, worldIn);
    }

    public BlackArrowEntity(World worldIn, LivingEntity shooter) {
        super(RegistryHandler.BLACK_ARROW.get(), shooter, worldIn);
    }

    /**
     * Called to update the entity's position/logic.
     */

    private int duration = 25;
    @Override
    public void tick() {
        super.tick();
        if(!this.inGround) {
            this.world.addParticle(ParticleTypes.SQUID_INK, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
        }
    }
    @Override
    public IPacket<?> createSpawnPacket(){

        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected ItemStack getArrowStack() {
        return new ItemStack(Items.ARROW);
    }
    @Override
    protected void arrowHit(LivingEntity living) {
        super.arrowHit(living);
        EffectInstance effectinstance = new EffectInstance(Effects.BLINDNESS, this.duration, 0);
        living.addPotionEffect(effectinstance);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
}