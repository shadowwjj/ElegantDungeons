package com.thegamerlegion.elegantdungeons.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

import static net.minecraft.potion.Effects.POISON;

public class Spikes extends Block {

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(0, 0, 0, 16, 2, 16),
            Block.makeCuboidShape(1, 2, 1, 2, 10, 2),
            Block.makeCuboidShape(1, 2, 14, 2, 10, 15),
            Block.makeCuboidShape(1, 2, 5, 2, 10, 6),
            Block.makeCuboidShape(1, 2, 10, 2, 10, 11),
            Block.makeCuboidShape(14, 2, 1, 15, 10, 2),
            Block.makeCuboidShape(14, 2, 14, 15, 10, 15),
            Block.makeCuboidShape(14, 2, 5, 15, 10, 6),
            Block.makeCuboidShape(14, 2, 10, 15, 10, 11),
            Block.makeCuboidShape(10, 2, 1, 11, 10, 2),
            Block.makeCuboidShape(10, 2, 14, 11, 10, 15),
            Block.makeCuboidShape(10, 2, 5, 11, 10, 6),
            Block.makeCuboidShape(10, 2, 10, 11, 10, 11),
            Block.makeCuboidShape(5, 2, 1, 6, 10, 2),
            Block.makeCuboidShape(5, 2, 14, 6, 10, 15),
            Block.makeCuboidShape(5, 2, 5, 6, 10, 6),
            Block.makeCuboidShape(5, 2, 10, 6, 10, 11)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
    }).get();

    public Spikes() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(5.5F, 5.0f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE)
                .notSolid()
                .doesNotBlockMovement()
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
        if(entityIn instanceof LivingEntity) {
            entityIn.attackEntityFrom(DamageSource.CACTUS, 5.0F);
        }

    }
}