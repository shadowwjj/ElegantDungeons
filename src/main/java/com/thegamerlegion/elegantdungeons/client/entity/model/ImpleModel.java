package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.Imple;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;


public class ImpleModel<T extends Imple> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer horns;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;


    public ImpleModel() {
        textureWidth = 32;
        textureHeight = 32;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 18.0F, 0.0F);
        head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);

        horns = new ModelRenderer(this);
        horns.setRotationPoint(0.0F, 15.0F, 0.0F);
        setRotationAngle(horns, -0.829F, 0.0F, 0.0F);
        horns.setTextureOffset(14, 16).addBox(1.0F, -5.6756F, -1.7373F, 2.0F, 7.0F, 2.0F, 0.0F, false);
        horns.setTextureOffset(0, 20).addBox(-3.0F, -5.6756F, -1.7373F, 2.0F, 7.0F, 2.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(-2.0F, 22.0F, 0.0F);
        leg1.setTextureOffset(0, 4).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(2.0F, 22.0F, 0.0F);
        leg2.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        horns.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.horns.rotateAngleY = MathHelper.cos(limbSwing * 0.1F) * 1.4F * limbSwingAmount;
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