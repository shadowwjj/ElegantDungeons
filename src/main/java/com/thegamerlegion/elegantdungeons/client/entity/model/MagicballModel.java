package com.thegamerlegion.elegantdungeons.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.MagicBall;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MagicballModel<T extends MagicBall> extends EntityModel<T> {
    private final ModelRenderer bone;
    public MagicballModel() {
        textureWidth = 32;
        textureHeight = 32;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(12, 12).addBox(-1.0F, -4.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone.setTextureOffset(0, 0).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        bone.setTextureOffset(8, 8).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(0, 8).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(12, 0).addBox(-1.0F, -4.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone.setTextureOffset(6, 11).addBox(-3.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        bone.setTextureOffset(0, 11).addBox(2.0F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
    }
}