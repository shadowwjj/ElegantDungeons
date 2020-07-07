package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.Rageroot;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class RagerootModel<T extends Rageroot> extends EntityModel<T> {
    private final ModelRenderer trunk;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer arm1;
    private final ModelRenderer arm2;
    private final ModelRenderer leaves;

    public RagerootModel() {
        textureWidth = 128;
        textureHeight = 128;

        trunk = new ModelRenderer(this);
        trunk.setRotationPoint(0.0F, 24.0F, 0.0F);
        trunk.setTextureOffset(0, 20).addBox(-4.0F, -37.0F, -4.0F, 8.0F, 29.0F, 8.0F, 0.0F, false);
        trunk.setTextureOffset(44, 70).addBox(-3.0F, -36.0F, 4.0F, 6.0F, 14.0F, 1.0F, 0.0F, false);
        trunk.setTextureOffset(72, 0).addBox(-2.0F, -22.0F, -5.0F, 4.0F, 12.0F, 1.0F, 0.0F, false);
        trunk.setTextureOffset(32, 29).addBox(-2.0F, -22.0F, 4.0F, 4.0F, 12.0F, 1.0F, 0.0F, false);
        trunk.setTextureOffset(66, 66).addBox(-3.0F, -36.0F, -5.0F, 6.0F, 14.0F, 1.0F, 0.0F, false);
        trunk.setTextureOffset(24, 20).addBox(-3.0F, -41.0F, -3.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        trunk.setTextureOffset(0, 20).addBox(2.0F, -41.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        trunk.setTextureOffset(36, 20).addBox(3.0F, -45.0F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        trunk.setTextureOffset(56, 51).addBox(-3.0F, -38.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        trunk.setTextureOffset(54, 7).addBox(-4.0F, -45.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(4.0F, 8.0F, 0.0F);
        leg1.setTextureOffset(62, 7).addBox(0.0F, 4.0F, -3.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);
        leg1.setTextureOffset(74, 40).addBox(0.0F, -3.0F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);
        leg1.setTextureOffset(66, 58).addBox(0.0F, 15.0F, -4.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
        leg1.setTextureOffset(42, 29).addBox(0.0F, 15.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg1.setTextureOffset(42, 9).addBox(-1.0F, 15.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg1.setTextureOffset(42, 7).addBox(-1.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg1.setTextureOffset(35, 25).addBox(3.0F, 15.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg1.setTextureOffset(32, 26).addBox(1.0F, 15.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg1.setTextureOffset(28, 26).addBox(1.0F, 14.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg1.setTextureOffset(24, 26).addBox(2.0F, 14.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-4.0F, 8.0F, 0.0F);
        leg2.setTextureOffset(28, 62).addBox(-2.0F, 4.0F, -3.0F, 2.0F, 11.0F, 6.0F, 0.0F, false);
        leg2.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -2.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);
        leg2.setTextureOffset(63, 24).addBox(-3.0F, 15.0F, -4.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
        leg2.setTextureOffset(4, 26).addBox(0.0F, 15.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg2.setTextureOffset(0, 26).addBox(-4.0F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg2.setTextureOffset(6, 2).addBox(-3.0F, 15.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg2.setTextureOffset(6, 0).addBox(-2.0F, 15.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        leg2.setTextureOffset(0, 2).addBox(0.0F, 15.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        leg2.setTextureOffset(0, 0).addBox(-1.0F, 15.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        arm1 = new ModelRenderer(this);
        arm1.setRotationPoint(4.0F, -4.0F, 1.0F);
        setRotationAngle(arm1, 0.0F, 0.0F, -0.2618F);
        arm1.setTextureOffset(14, 57).addBox(-1.0F, -6.0F, -3.0F, 3.0F, 18.0F, 4.0F, 0.0F, false);
        arm1.setTextureOffset(68, 32).addBox(0.0F, 12.0F, -4.0F, 2.0F, 7.0F, 3.0F, 0.0F, false);

        arm2 = new ModelRenderer(this);
        arm2.setRotationPoint(-4.0F, -4.0F, 1.0F);
        setRotationAngle(arm2, 0.0F, 0.0F, 0.2618F);
        arm2.setTextureOffset(0, 57).addBox(-2.0F, -6.0F, -3.0F, 3.0F, 18.0F, 4.0F, 0.0F, false);
        arm2.setTextureOffset(32, 44).addBox(-2.0F, 12.0F, -4.0F, 2.0F, 7.0F, 3.0F, 0.0F, false);

        leaves = new ModelRenderer(this);
        leaves.setRotationPoint(0.0F, -30.0F, 0.0F);
        leaves.setTextureOffset(44, 44).addBox(-6.0F, 4.0F, -7.0F, 13.0F, 6.0F, 1.0F, 0.0F, false);
        leaves.setTextureOffset(42, 0).addBox(-6.0F, 4.0F, 6.0F, 13.0F, 6.0F, 1.0F, 0.0F, false);
        leaves.setTextureOffset(0, 0).addBox(-7.0F, 3.0F, -6.0F, 15.0F, 8.0F, 12.0F, 0.0F, false);
        leaves.setTextureOffset(44, 52).addBox(8.0F, 4.0F, -5.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
        leaves.setTextureOffset(32, 44).addBox(-8.0F, 4.0F, -5.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
        leaves.setTextureOffset(32, 32).addBox(-6.0F, 1.0F, -5.0F, 13.0F, 2.0F, 10.0F, 0.0F, false);
        leaves.setTextureOffset(32, 20).addBox(-5.0F, 0.0F, -4.0F, 11.0F, 1.0F, 8.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        trunk.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
        arm1.render(matrixStack, buffer, packedLight, packedOverlay);
        arm2.render(matrixStack, buffer, packedLight, packedOverlay);
        leaves.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 0.9F * limbSwingAmount;
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 0.9F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leaves.rotateAngleY = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
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
