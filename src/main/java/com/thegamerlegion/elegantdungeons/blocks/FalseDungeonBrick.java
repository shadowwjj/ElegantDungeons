package com.thegamerlegion.elegantdungeons.blocks;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.Random;

import static net.minecraft.world.gen.surfacebuilders.SurfaceBuilder.AIR;

public class FalseDungeonBrick extends Block {
    public FalseDungeonBrick() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(1.0f,1.0f)
                .sound(SoundType.STONE)
        );

    }
    public void onBlockClicked(BlockState blockstate, World worldIn, BlockPos pos, PlayerEntity player){
        worldIn.destroyBlock(pos, true);
        worldIn.removeBlock(pos, true);
        }

    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
            worldIn.destroyBlock(pos, true);
            worldIn.removeBlock(pos, true);
        }
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        DebugPacketSender.func_218806_a(worldIn, pos);
        if(worldIn.getBlockState(pos) != worldIn.getBlockState(fromPos)) {
            Random rand = new Random();
            int randomnum = rand.nextInt(2);
            if(randomnum != 1){
                worldIn.destroyBlock(pos, true);
                worldIn.removeBlock(pos, true);
            }
        }
    }
}
