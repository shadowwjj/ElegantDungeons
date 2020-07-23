package com.thegamerlegion.elegantdungeons.entities;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.swing.text.Position;
import java.rmi.registry.Registry;

public class MagicBall extends ArrowEntity {

    public MagicBall(World worldIn, LivingEntity throwerIn) {
        super(worldIn, throwerIn);
    }

    public MagicBall(World worldIn, double x, double y, double z) {
        super(worldIn, x, y, z);
    }

    protected Item getDefaultItem() {
        return RegistryHandler.T1BALL_ITEM.get();
    }

    /**
     * Handler for {@link World#setEntityState}
     */
    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 3) { ;
            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    @Override
    public void tick() {
        super.tick();
        if (this.world.isRemote && this.inGround) {
            Explosion.Mode explosion$mode = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this) ? Explosion.Mode.DESTROY : Explosion.Mode.NONE;
            this.world.createExplosion(this, this.getPosX(), this.getPosY(), this.getPosZ(), 2, true, explosion$mode);
            this.remove();
        }

    }

}