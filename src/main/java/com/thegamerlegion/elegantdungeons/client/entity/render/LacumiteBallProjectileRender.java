package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.LacumiteBallProjectile;
import com.thegamerlegion.elegantdungeons.entities.RadiantArrowEntity;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.util.ResourceLocation;

public class LacumiteBallProjectileRender extends EntityRenderer<LacumiteBallProjectile> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID,"textures/items/magic_ball.png");

    public LacumiteBallProjectileRender(EntityRendererManager manager) {
        super(manager);
    }
    private static final RenderType field_229044_e_ = RenderType.getEntityCutoutNoCull(TEXTURE);
    protected int getBlockLight(LacumiteBallProjectile entityIn, float partialTicks) {
        return 15;
    }
    /**
     * Returns the location of an entity's texture.
     */
    public void render(LacumiteBallProjectile entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
        matrixStackIn.push();
        matrixStackIn.scale(0.75F, 0.75F, 0.75F);
        matrixStackIn.rotate(this.renderManager.getCameraOrientation());
        matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F));
        MatrixStack.Entry matrixstack$entry = matrixStackIn.getLast();
        Matrix4f matrix4f = matrixstack$entry.getMatrix();
        Matrix3f matrix3f = matrixstack$entry.getNormal();
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(field_229044_e_);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 0.0F, 0, 0, 1);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 1.0F, 0, 1, 1);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 1.0F, 1, 1, 0);
        func_229045_a_(ivertexbuilder, matrix4f, matrix3f, packedLightIn, 0.0F, 1, 0, 0);
        matrixStackIn.pop();
        super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }

    private static void func_229045_a_(IVertexBuilder p_229045_0_, Matrix4f p_229045_1_, Matrix3f p_229045_2_, int p_229045_3_, float p_229045_4_, int p_229045_5_, int p_229045_6_, int p_229045_7_) {
        p_229045_0_.pos(p_229045_1_, p_229045_4_ - 0.5F, (float)p_229045_5_ - 0.25F, 0.0F).color(255, 255, 255, 255).tex((float)p_229045_6_, (float)p_229045_7_).overlay(OverlayTexture.NO_OVERLAY).lightmap(p_229045_3_).normal(p_229045_2_, 0.0F, 1.0F, 0.0F).endVertex();
    }

    public ResourceLocation getEntityTexture(LacumiteBallProjectile entity) {
        return TEXTURE;
    }
}
