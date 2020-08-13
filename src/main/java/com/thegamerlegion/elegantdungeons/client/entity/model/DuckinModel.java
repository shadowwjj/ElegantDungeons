package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;


public class DuckinModel<T extends Duckin> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3;
    private final ModelRenderer leg4;

    public DuckinModel() {
        textureWidth = 128;
        textureHeight = 128;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        Body.setTextureOffset(0, 0).addBox(-6.0F, -18.0F, -11.0F, 12.0F, 10.0F, 15.0F, 0.0F, false);
        Body.setTextureOffset(0, 25).addBox(-6.0F, -16.0F, 4.0F, 12.0F, 8.0F, 9.0F, 0.0F, false);
        Body.setTextureOffset(39, 0).addBox(-5.0F, -18.0F, -15.0F, 10.0F, 6.0F, 4.0F, 0.0F, false);
        Body.setTextureOffset(36, 36).addBox(-4.0F, -16.0F, -21.0F, 8.0F, 4.0F, 6.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(4.0F, 15.5F, -6.125F);
        leg1.setTextureOffset(30, 44).addBox(-1.0F, 0.5F, -0.875F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        leg1.setTextureOffset(0, 42).addBox(-1.0F, 7.5F, -3.875F, 2.0F, 1.0F, 5.0F, 0.0F, false);
        leg1.setTextureOffset(6, 49).addBox(-2.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        leg1.setTextureOffset(48, 26).addBox(1.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-4.0F, 15.5F, -6.125F);
        leg2.setTextureOffset(22, 42).addBox(-1.0F, 0.5F, -0.875F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        leg2.setTextureOffset(33, 25).addBox(-1.0F, 7.5F, -3.875F, 2.0F, 1.0F, 5.0F, 0.0F, false);
        leg2.setTextureOffset(0, 48).addBox(-2.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        leg2.setTextureOffset(44, 47).addBox(1.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        leg3 = new ModelRenderer(this);
        leg3.setRotationPoint(-5.0F, 15.5F, 9.875F);
        leg3.setTextureOffset(14, 42).addBox(-1.0F, 0.5F, -0.875F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        leg3.setTextureOffset(0, 6).addBox(-1.0F, 7.5F, -3.875F, 2.0F, 1.0F, 5.0F, 0.0F, false);
        leg3.setTextureOffset(38, 46).addBox(-2.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        leg3.setTextureOffset(42, 31).addBox(1.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        leg4 = new ModelRenderer(this);
        leg4.setRotationPoint(5.0F, 15.5F, 9.875F);
        leg4.setTextureOffset(0, 25).addBox(-1.0F, 0.5F, -0.875F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        leg4.setTextureOffset(0, 0).addBox(-1.0F, 7.5F, -3.875F, 2.0F, 1.0F, 5.0F, 0.0F, false);
        leg4.setTextureOffset(42, 25).addBox(-2.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        leg4.setTextureOffset(39, 10).addBox(1.0F, 7.5F, -2.875F, 1.0F, 1.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        leg3.render(matrixStack, buffer, packedLight, packedOverlay);
        leg4.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 0.9F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
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