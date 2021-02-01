package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.DuckinModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.VoidWalkerModel;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import com.thegamerlegion.elegantdungeons.entities.LivingExperienceEntity;
import com.thegamerlegion.elegantdungeons.entities.VoidWalker;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class VoidWalkerRender extends MobRenderer<VoidWalker, VoidWalkerModel<VoidWalker>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/void_walker.png");
    public VoidWalkerRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new VoidWalkerModel<>(), 0.5f);
    }

    protected int getBlockLight(VoidWalker entityIn, float partialTicks) {
        return 15;
    }

    @Override
    public ResourceLocation getEntityTexture(VoidWalker entity) {
        return TEXTURE;
    }
}
