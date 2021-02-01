package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.LivingExperienceEntity;
import com.thegamerlegion.elegantdungeons.entities.Rageroot;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class LivingExperienceModel<T extends LivingExperienceEntity> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer arm2;
    private final ModelRenderer arm1;

    public LivingExperienceModel() {
        textureWidth = 64;
        textureHeight = 64;

        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
        head.setTextureOffset(30, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(0, 20).addBox(-5.0F, -16.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
        head.setTextureOffset(0, 32).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(-2.0F, 22.0F, -1.0F);
        leg1.setTextureOffset(0, 25).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(4.0F, 24.0F, 0.0F);
        leg2.setTextureOffset(0, 20).addBox(-3.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        arm2 = new ModelRenderer(this);
        arm2.setRotationPoint(4.0F, 24.0F, 0.0F);
        arm2.setTextureOffset(0, 5).addBox(1.0F, -10.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        arm1 = new ModelRenderer(this);
        arm1.setRotationPoint(4.0F, 24.0F, 0.0F);
        arm1.setTextureOffset(0, 0).addBox(-11.0F, -10.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        arm2.render(matrixStack, buffer, packedLight, packedOverlay);
        arm1.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 0.9F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
