package com.thegamerlegion.elegantdungeons.blocks;

import com.lazy.baubles.container.slots.ArmorSlot;
import com.lazy.baubles.container.slots.SlotBauble;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.DyeColor;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import java.util.Random;

import static com.lazy.baubles.api.BaubleType.CHARM;
import static com.thegamerlegion.elegantdungeons.util.RegistryHandler.BRICK_BREAKER;
import static net.minecraft.potion.Effects.NAUSEA;
import static net.minecraft.potion.Effects.POISON;

public class PoisonTrail extends Block {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(0, 0, 0, 16, 2, 16);

    public PoisonTrail() {
        super(Properties.create(Material.CLAY)
                .hardnessAndResistance(0.5F, 1.0f)
                .sound(SoundType.SLIME)
                .harvestLevel(0)
                .harvestTool(ToolType.SHOVEL)
        );

    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    @Override
    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        return hasEnoughSolidSide(worldIn, pos.down(), Direction.UP);
    }
    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if(entityIn instanceof LivingEntity && !((LivingEntity) entityIn).isPotionActive(POISON)) {
            ((LivingEntity) entityIn).addPotionEffect(new EffectInstance(POISON, 25, 4));
        }

    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        {
            double d0 = (double) pos.getX() + 0.5D + (rand.nextDouble() - 0.5D);
            double d1 = (double) pos.getY() + (rand.nextDouble() - 0.3D) * 0.2D;
            double d2 = (double) pos.getZ() +  0.5D + (rand.nextDouble() - 0.5D);
            worldIn.addParticle(ParticleTypes.SNEEZE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }
}
