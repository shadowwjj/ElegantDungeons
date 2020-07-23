package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.LacumiteGolemModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.MagicballModel;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.MagicBall;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class MagicballRender extends ArrowRenderer<MagicBall> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/magicball.png");
    public MagicballRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);

    }

    @Override
    public ResourceLocation getEntityTexture(MagicBall entity) {
        return TEXTURE;
    }
}
