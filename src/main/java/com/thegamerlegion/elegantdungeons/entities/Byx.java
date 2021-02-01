package com.thegamerlegion.elegantdungeons.entities;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.brain.memory.WalkTarget;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.UUID;

import static net.minecraft.potion.Effects.*;

public class Byx extends CreatureEntity {
    private int attackTicks = 120;
    private boolean hasBeenHit = false;
    private DamageSource taggedDamageSource;
    public Byx(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
        this.experienceValue = 0;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1.5, false));
        this.goalSelector.addGoal(1, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, false, true));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    public void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.00);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.0D);
        this.getAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(9999.0D);
    }

    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (super.attackEntityFrom(source, amount)) {
            for(int i = 0; i < 8; ++i) {
                taggedDamageSource = source;
                this.hasBeenHit = true;
                this.world.addParticle(ParticleTypes.SMOKE, this.getPosX(), this.getPosY() + 1, this.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
            }
            return true;
        } else {
            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(ParticleTypes.SMOKE, this.getPosX(), this.getPosY() + 1, this.getPosZ(), (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4, (Math.random() - (Math.random())) * 0.4);
            }
            taggedDamageSource = source;
            this.hasBeenHit = true;
            return false;
        }

    }
    AttributeModifier MOVEMENT = new AttributeModifier(UUID.fromString("30692147-fc83-46b5-9bc5-7c231c7d7669"), "movement", 0.15, AttributeModifier.Operation.ADDITION);
    @Override
    public void tick() {
        super.tick();
        if(!isSeen() && !this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(MOVEMENT)){
            this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(MOVEMENT);
            this.setNoAI(false);
        }
        else{
            this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(MOVEMENT);
            if(this.onGround) {
                this.setNoAI(true);
            }
        }
        if(hasBeenHit){
            attackTicks -= 1;
            if(attackTicks <= 0){
                if (taggedDamageSource.getImmediateSource() instanceof LivingEntity) {
                    ((LivingEntity) taggedDamageSource.getImmediateSource()).addPotionEffect(new EffectInstance(WITHER, 200, 1));
                    ((LivingEntity) taggedDamageSource.getImmediateSource()).addPotionEffect(new EffectInstance(BLINDNESS, 400, 0));
                    ((LivingEntity) taggedDamageSource.getImmediateSource()).addPotionEffect(new EffectInstance(NAUSEA, 200, 0));
                    this.world.playSound((PlayerEntity) null, this.getPosX(), this.getPosY(), this.getPosZ(), RegistryHandler.BYX_HURT.get(), SoundCategory.NEUTRAL, 1.0F, 1.0F);
                }
                this.remove();
            }
            this.setInvulnerable(true);
            this.setInvisible(true);
            this.setNoAI(true);
        }
    }

    public boolean isSeen()
    {
        LivingEntity player = world.getClosestPlayer(this,40);

        if (player == null || this.getBoundingBox() == null) return true;

        Vec3d visionVec = player.getLook(1.0F).normalize();
        Vec3d targetVec = new Vec3d(this.getPosX() - player.getPosX(),
                this.getBoundingBox().minY + (double)(this.getHeight() / 2.0F) - (player.getPosY() + (double)player.getEyeHeight()),
                this.getPosZ() - player.getPosZ());
        targetVec = targetVec.normalize();
        double dotProduct = visionVec.dotProduct(targetVec);

        boolean inFOV = dotProduct > 0.1 && player.canEntityBeSeen(this);

        return inFOV;
    }
    @Override
    public void playAmbientSound() {
        SoundEvent soundevent = this.getAmbientSound();
        if (soundevent != null && !isSeen() && this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(MOVEMENT)) {
            this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
        }
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return RegistryHandler.BYX_AMBIENT.get();
    }

    @Override
    public boolean attackEntityAsMob(Entity entity) {
        if(!isSeen()){
        this.attackEntityFrom(DamageSource.MAGIC,999F);
        return true;
        }
        return false;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return RegistryHandler.BYX_DEATH.get();
    }
}


