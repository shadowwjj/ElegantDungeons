package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.DuckinModel;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DuckinRender extends MobRenderer<Duckin, DuckinModel<Duckin>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/duckin.png");
    public DuckinRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DuckinModel<>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(Duckin entity) {
        return TEXTURE;
    }
}
