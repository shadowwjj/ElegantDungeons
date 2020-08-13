package com.thegamerlegion.elegantdungeons.entities;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Imple extends MonsterEntity {
    @Nullable
    private int limitedLifeTicks;
    public Imple(EntityType<? extends MonsterEntity> type, World worldIn) { super(type, worldIn);this.experienceValue = 0;this.stepHeight = 1.0F; }
    @Override
    public void tick() {
        super.tick();
        if (this.limitedLifeTicks <= 0) {
            this.limitedLifeTicks = 50;
            this.attackEntityFrom(DamageSource.DRYOUT, 1.0F);
        }
        this.limitedLifeTicks -= 1;
        this.world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, this.getPosX(), this.getPosY(), this.getPosZ(), (Math.random() - (Math.random())) * 0.02, (Math.random() - (Math.random())) * 0.02, (Math.random() - (Math.random())) * 0.02);

    }
    protected boolean isDespawnPeaceful() {
        return false;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.15, false));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 1.0D, 1.0000001E-5F));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, MobEntity.class, 5, false, false, (p_213619_0_) -> {
            return p_213619_0_ instanceof IMob && !(p_213619_0_ instanceof CreeperEntity) && !(p_213619_0_ instanceof Imple);
        }));
    }

    @Override
    public void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(8.00);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(4.00);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(15.0);
    }


    @Override
    protected SoundEvent getDeathSound() {
        return RegistryHandler.IMPLE_DEATH.get();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return RegistryHandler.IMPLE_HURT.get();
    }
}



