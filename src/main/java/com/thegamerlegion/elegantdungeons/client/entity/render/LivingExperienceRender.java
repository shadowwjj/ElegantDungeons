package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.LacumiteGolemModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.LivingExperienceModel;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.LivingExperienceEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.util.ResourceLocation;

public class LivingExperienceRender extends MobRenderer<LivingExperienceEntity, LivingExperienceModel<LivingExperienceEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/living_experience.png");
    public LivingExperienceRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LivingExperienceModel<>(), 0.5f);
    }

    protected int getBlockLight(LivingExperienceEntity entityIn, float partialTicks) {
        return 10;
    }

    @Override
    public ResourceLocation getEntityTexture(LivingExperienceEntity entity) {
        return TEXTURE;
    }
}
