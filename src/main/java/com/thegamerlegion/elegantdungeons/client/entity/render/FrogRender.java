package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.DuckinModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.FrogModel;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import com.thegamerlegion.elegantdungeons.entities.Frog;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.WolfCollarLayer;
import net.minecraft.client.renderer.entity.model.WolfModel;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FrogRender extends MobRenderer<Frog, FrogModel<Frog>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID,"textures/entity/frog/frog.png");

    public FrogRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new FrogModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(Frog entity) {
        return TEXTURE;
    }
}