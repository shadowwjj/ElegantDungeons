package com.thegamerlegion.elegantdungeons.client.entity.model;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thegamerlegion.elegantdungeons.entities.Byx;
import com.thegamerlegion.elegantdungeons.entities.LivingExperienceEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class ByxModel<T extends Byx> extends EntityModel<T> {
    private final ModelRenderer legs;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer everything_else;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;

    public ByxModel() {
        textureWidth = 32;
        textureHeight = 32;

        legs = new ModelRenderer(this);
        legs.setRotationPoint(-2.0F, 24.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(3.0F, 0.0F, 0.0F);
        legs.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.3491F, 0.0F);
        cube_r1.setTextureOffset(12, 12).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(2.0F, 0.0F, 0.0F);
        legs.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
        cube_r2.setTextureOffset(15, 5).addBox(-2.0F, -2.0F, -4.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);

        everything_else = new ModelRenderer(this);
        everything_else.setRotationPoint(0.0F, 24.0F, 0.0F);
        everything_else.setTextureOffset(20, 20).addBox(2.0F, -9.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        everything_else.setTextureOffset(19, 12).addBox(-4.0F, -9.0F, 0.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        everything_else.setTextureOffset(12, 12).addBox(3.0F, -8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        everything_else.setTextureOffset(9, 10).addBox(-5.0F, -8.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        everything_else.setTextureOffset(8, 19).addBox(2.0F, -11.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        everything_else.setTextureOffset(14, 19).addBox(-4.0F, -11.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        everything_else.setTextureOffset(0, 2).addBox(-5.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        everything_else.setTextureOffset(0, 0).addBox(3.0F, -10.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        everything_else.setTextureOffset(0, 10).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
        everything_else.setTextureOffset(0, 0).addBox(-3.0F, -11.0F, -2.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(0.0F, -5.0F, 0.0F);
        everything_else.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -2.4435F);
        cube_r3.setTextureOffset(0, 18).addBox(-4.0F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(0.0F, -5.0F, 0.0F);
        everything_else.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6981F);
        cube_r4.setTextureOffset(15, 0).addBox(-5.0F, -2.0F, 0.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        legs.render(matrixStack, buffer, packedLight, packedOverlay);
        everything_else.render(matrixStack, buffer, packedLight, packedOverlay);
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
}
