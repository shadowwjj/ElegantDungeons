package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.Otamakin;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class OtamakinModel<T extends Otamakin> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer cube_r1;
    private final ModelRenderer jaw;
    private final ModelRenderer body;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    public OtamakinModel() {
        textureWidth = 64;
        textureHeight = 64;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 3.0F, 6.0F);
        head.setTextureOffset(0, 0).addBox(-7.0F, -6.0F, -14.0F, 14.0F, 6.0F, 14.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.0F, 3.0F, 6.0F);
        jaw.setTextureOffset(0, 20).addBox(-7.0F, 0.0F, -14.0F, 14.0F, 6.0F, 14.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 4.0F, 5.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 8.0F, -3.5F);
        body.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        cube_r1.setTextureOffset(0, 40).addBox(-3.0F, -7.0F, -2.5F, 6.0F, 15.0F, 5.0F, 0.0F, false);

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(3.0F, 17.0F, 0.0F);
        leg1.setTextureOffset(0, 20).addBox(0.0F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
        leg1.setTextureOffset(0, 28).addBox(0.0F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        leg1.setTextureOffset(40, 40).addBox(0.0F, 6.0F, -4.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(-3.0F, 17.0F, 0.0F);
        leg2.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
        leg2.setTextureOffset(0, 8).addBox(-2.0F, 2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        leg2.setTextureOffset(22, 40).addBox(-4.0F, 6.0F, -4.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        jaw.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        leg1.render(matrixStack, buffer, packedLight, packedOverlay);
        leg2.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.5F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.5F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.head.rotateAngleX = (float) Math.pow(MathHelper.sin(limbSwing * 0.2F + (float)Math.PI) * 0.9F * limbSwingAmount,2) * -2;
        this.jaw.rotateAngleX = (float) Math.pow(MathHelper.sin(limbSwing * 0.2F + (float)Math.PI) * 0.5F * limbSwingAmount,2);
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
        return leg1;
    }
    public ModelRenderer getLeftLeg() {
        return leg2;
    }
}
