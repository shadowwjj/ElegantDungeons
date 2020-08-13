package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import com.thegamerlegion.elegantdungeons.entities.Frog;
import net.minecraft.client.renderer.entity.model.AgeableModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;


public class FrogModel<T extends Frog> extends AgeableModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer arm1;
    private final ModelRenderer arm2;

    public FrogModel() {
        textureWidth = 32;
        textureHeight = 32;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 19.0F, -2.0F);
        head.setTextureOffset(0, 9).addBox(-2.0F, -1.0F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(0, 15).addBox(1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(11, 9).addBox(-2.0F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 19.0F, -2.0F);
        setRotationAngle(body, -0.6981F, 0.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-3.0F, -1.0F, 0.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(-4.0F, 22.0F, 1.0F);
        leg1.setTextureOffset(0, 15).addBox(-1.0F, 1.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
        leg1.setTextureOffset(16, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(4.0F, 22.0F, 1.0F);
        leg2.setTextureOffset(10, 11).addBox(-1.0F, 1.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
        leg2.setTextureOffset(8, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        arm1 = new ModelRenderer(this);
        arm1.setRotationPoint(-1.0F, 21.0F, -3.0F);
        arm1.setTextureOffset(18, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        arm2 = new ModelRenderer(this);
        arm2.setRotationPoint(1.0F, 21.0F, -3.0F);
        arm2.setTextureOffset(0, 0).addBox(0.0F, -1.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        arm1.render(matrixStack, buffer, packedLight, packedOverlay);
        arm2.render(matrixStack, buffer, packedLight, packedOverlay);

    }

    public Iterable<ModelRenderer> getHeadParts() {
        return ImmutableList.of(this.head);
    }

    public Iterable<ModelRenderer> getBodyParts() {
        return ImmutableList.of(this.body, this.leg1, this.leg2, this.arm1, this.arm2);
    }
    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 0.9F * limbSwingAmount;
        this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setLivingAnimations(T entityIn, float limbSwing, float limbSwingAmount, float partialTick) {
        super.setLivingAnimations(entityIn, limbSwing, limbSwingAmount, partialTick);
        if(entityIn.isSitting()) {
            this.body.rotateAngleX = -((float)Math.PI / 4F);
        }
        else {
            this.body.rotateAngleX = -((float)Math.PI / 6F);
        }
    }
}