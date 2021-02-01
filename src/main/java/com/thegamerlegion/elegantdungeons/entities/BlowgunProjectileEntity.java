package com.thegamerlegion.elegantdungeons.entities;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlowgunProjectileEntity extends AbstractArrowEntity {

    public BlowgunProjectileEntity(EntityType<? extends BlowgunProjectileEntity> shooter, World worldIn) {
        super(shooter, worldIn);
    }

    public BlowgunProjectileEntity(World worldIn, double x, double y, double z) {
        super(RegistryHandler.BLOWGUN_PROJECTILE.get(), x, y, z, worldIn);
    }

    public BlowgunProjectileEntity(World worldIn, LivingEntity shooter) {
        super(RegistryHandler.BLOWGUN_PROJECTILE.get(), shooter, worldIn);
    }

    /**
     * Called to update the entity's position/logic.
     */

    private int duration = 200;
    @Override
    public void tick() {
        super.tick();
        if(this.inGround) {
            this.remove();
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
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
}