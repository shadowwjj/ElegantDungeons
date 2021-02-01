package com.thegamerlegion.elegantdungeons.entities;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.*;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

public class RadiantArrowEntity extends AbstractArrowEntity {

    public RadiantArrowEntity(EntityType<? extends RadiantArrowEntity> shooter, World worldIn) {
        super(shooter, worldIn);
    }

    public RadiantArrowEntity(World worldIn, double x, double y, double z) {
        super(RegistryHandler.RADIANT_ARROW.get(), x, y, z, worldIn);
    }

    public RadiantArrowEntity(World worldIn, LivingEntity shooter) {
        super(RegistryHandler.RADIANT_ARROW.get(), shooter, worldIn);
    }

    /**
     * Called to update the entity's position/logic.
     */

    private int duration = 200;
    @Override
    public void tick() {
        super.tick();
        if(!this.inGround) {
            this.world.addParticle(ParticleTypes.CLOUD, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
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
        EffectInstance effectinstance = new EffectInstance(Effects.LEVITATION, this.duration, 0);
        living.addPotionEffect(effectinstance);
        getEntityWorld().addParticle(ParticleTypes.END_ROD, living.getPosX(), living.getPosY(), living.getPosZ(), 0.0D, 0.0D, 0.0D);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
}