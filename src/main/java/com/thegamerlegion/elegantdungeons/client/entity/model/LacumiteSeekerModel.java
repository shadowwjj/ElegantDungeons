package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.LacumiteSeeker;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class LacumiteSeekerModel<T extends LacumiteSeeker> extends EntityModel<T> {
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer body;
    private final ModelRenderer head;
    private final ModelRenderer leg3;
    private final ModelRenderer leg4;
    public LacumiteSeekerModel() {
        textureWidth = 64;
        textureHeight = 64;

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(-3.0F, 4.0F, -6.0F);
        leg1.setTextureOffset(8, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(3.0F, 4.0F, -6.0F);
        leg2.setTextureOffset(16, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-5.0F, -28.0F, -7.0F, 10.0F, 8.0F, 15.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -4.0F, 1.0F);
        head.setTextureOffset(0, 23).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 11.0F, 0.0F, false);

        leg3 = new ModelRenderer(this);
        leg3.setRotationPoint(-3.0F, 4.0F, 7.0F);
        leg3.setTextureOffset(0, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);

        leg4 = new ModelRenderer(this);
        leg4.setRotationPoint(3.0F, 4.0F, 7.0F);
        leg4.setTextureOffset(24, 40).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        leg3.render(matrixStack, buffer, packedLight, packedOverlay);
        leg4.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 0.9F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
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

    public ModelRenderer getBody() {
        return body;
    }
    public ModelRenderer getHead() {
        return head;
    }
    public ModelRenderer getRightLeg() {
        return leg2;
    }
    public ModelRenderer getLeftLeg() {
        return leg1;
    }
}
