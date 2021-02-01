package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.VoidWalker;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;


public class VoidWalkerModel<T extends VoidWalker> extends EntityModel<T> {
    private final ModelRenderer neck;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer arm1;
    private final ModelRenderer arm2;

    public VoidWalkerModel() {
        textureWidth = 32;
        textureHeight = 32;

        neck = new ModelRenderer(this);
        neck.setRotationPoint(0.0F, 7.0F, 0.0F);
        neck.setTextureOffset(18, 18).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 10.0F, 0.0F);
        body.setTextureOffset(0, 8).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 7.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 1.0F, 0.0F);
        head.setTextureOffset(0, 0).addBox(-5.0F, -4.0F, -2.0F, 10.0F, 4.0F, 4.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(-1.0F, 13.0F, 0.0F);
        leg1.setTextureOffset(12, 19).addBox(-1.0F, 1.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(1.0F, 14.0F, 0.0F);
        leg2.setTextureOffset(8, 19).addBox(0.0F, 0.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        arm1 = new ModelRenderer(this);
        arm1.setRotationPoint(-3.0F, 10.0F, 0.0F);
        arm1.setTextureOffset(4, 19).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        arm2 = new ModelRenderer(this);
        arm2.setRotationPoint(3.0F, 8.0F, 0.0F);
        arm2.setTextureOffset(0, 19).addBox(0.0F, 0.0F, -1.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        neck.render(matrixStack, buffer, packedLight, packedOverlay);
        arm1.render(matrixStack, buffer, packedLight, packedOverlay);
        arm2.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 0.9F * limbSwingAmount;
        this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
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