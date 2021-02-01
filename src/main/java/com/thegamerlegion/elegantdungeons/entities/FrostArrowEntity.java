package com.thegamerlegion.elegantdungeons.entities;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class FrostArrowEntity extends AbstractArrowEntity {

    public FrostArrowEntity(EntityType<? extends FrostArrowEntity> shooter, World worldIn) {
        super(shooter, worldIn);
    }

    public FrostArrowEntity(World worldIn, double x, double y, double z) {
        super(RegistryHandler.FROST_ARROW.get(), x, y, z, worldIn);
    }

    public FrostArrowEntity(World worldIn, LivingEntity shooter) {
        super(RegistryHandler.FROST_ARROW.get(), shooter, worldIn);
    }

    /**
     * Called to update the entity's position/logic.
     */

    private int duration = 200;
    @Override
    public void tick() {
        super.tick();
        if(!this.inGround) {
            this.world.addParticle(ParticleTypes.ENCHANTED_HIT, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
        }
        this.world.addParticle(ParticleTypes.CLOUD, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
        if(this.world.getBlockState(this.getPosition()).getBlock() == Blocks.WATER){
            BlockState blockstate = Blocks.FROSTED_ICE.getDefaultState();
            float f = (float)Math.min(16, 2);
            BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

            for(BlockPos blockpos : BlockPos.getAllInBoxMutable(this.getPosition().add((double)(-f), 1D, (double)(-f)), this.getPosition().add((double)f, -1D, (double)f))) {
                if (blockpos.withinDistance(this.getPositionVec(), (double)f)) {
                    blockpos$mutable.setPos(blockpos.getX(), blockpos.getY() + 1, blockpos.getZ());
                    BlockState blockstate2 = this.world.getBlockState(blockpos);
                    boolean isFull = blockstate2.getBlock() == Blocks.WATER && blockstate2.get(FlowingFluidBlock.LEVEL) == 0; //TODO: Forge, modded waters?
                    if (blockstate2.getMaterial() == Material.WATER && isFull && blockstate.isValidPosition(this.world, blockpos) && this.world.func_226663_a_(blockstate, blockpos, ISelectionContext.dummy()) && !net.minecraftforge.event.ForgeEventFactory.onBlockPlace(this, new net.minecraftforge.common.util.BlockSnapshot(this.world, blockpos, blockstate2), net.minecraft.util.Direction.UP)) {
                        this.world.setBlockState(blockpos, blockstate);
                        this.world.getPendingBlockTicks().scheduleTick(blockpos, Blocks.FROSTED_ICE, MathHelper.nextInt(this.rand, 60, 120));
                    }
                }
            }


            //this.world.setBlockState(this.getPosition(), Blocks.ICE.getDefaultState());
            this.world.playSound((PlayerEntity) null, this.getPosX(), this.getPosY(), this.getPosZ(), SoundEvents.BLOCK_SHULKER_BOX_CLOSE, SoundCategory.PLAYERS, 2.0F, 2.5F);
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
        EffectInstance effectinstance = new EffectInstance(Effects.SLOWNESS, this.duration, 0);
        EffectInstance effectinstance2 = new EffectInstance(Effects.MINING_FATIGUE, this.duration, 0);
        living.addPotionEffect(effectinstance);
        living.addPotionEffect(effectinstance2);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
}