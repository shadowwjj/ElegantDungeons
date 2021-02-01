package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.DuckinModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.RatModel;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import com.thegamerlegion.elegantdungeons.entities.Rat;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RatRender extends MobRenderer<Rat, RatModel<Rat>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/rat.png");
    public RatRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RatModel<>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(Rat entity) {
        return TEXTURE;
    }
}
