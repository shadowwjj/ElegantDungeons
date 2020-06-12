package com.thegamerlegion.elegantdungeons.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.ShroomRedEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ShroomRedEntityModel<T extends ShroomRedEntity> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer Head;
    private final ModelRenderer RightArm;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightLeg;
    private final ModelRenderer LeftLeg;

    public ShroomRedEntityModel() {
        textureWidth = 64;
        textureHeight = 64;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(1.0F, 23.0F, 1.0F);


        Head = new ModelRenderer(this);
        Head.setRotationPoint(-1.0F, 1.0F, -1.0F);
        Body.addChild(Head);
        Head.setTextureOffset(0, 11).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 5.0F, 5.0F, 0.0F, false);
        Head.setTextureOffset(0, 21).addBox(-2.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 13).addBox(1.0F, -5.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 4.0F, 7.0F, 0.0F, false);
        Head.setTextureOffset(17, 17).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(0.0F, 24.0F, 0.0F);
        RightArm.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(0.0F, 24.0F, 0.0F);
        LeftArm.setTextureOffset(17, 11).addBox(3.0F, -5.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        RightLeg = new ModelRenderer(this);
        RightLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
        RightLeg.setTextureOffset(0, 11).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setRotationPoint(0.0F, 24.0F, 0.0F);
        LeftLeg.setTextureOffset(0, 5).addBox(1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
        RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){

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
        return Body;
    }
    public ModelRenderer getHead() {
        return Head;
    }
    public ModelRenderer getRightArm() {
        return RightArm;
    }
    public ModelRenderer getLeftArm() {
        return LeftArm;
    }
    public ModelRenderer getRightLeg() {
        return RightLeg;
    }
    public ModelRenderer getLeftLeg() {
        return LeftLeg;
    }
}
