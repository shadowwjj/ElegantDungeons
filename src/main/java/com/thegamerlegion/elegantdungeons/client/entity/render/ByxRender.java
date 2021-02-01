package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.ByxModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.RatModel;
import com.thegamerlegion.elegantdungeons.entities.Byx;
import com.thegamerlegion.elegantdungeons.entities.Rat;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ByxRender extends MobRenderer<Byx, ByxModel<Byx>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/byx.png");
    public ByxRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ByxModel<>(), 0.15f);

    }

    @Override
    public ResourceLocation getEntityTexture(Byx entity) {
        return TEXTURE;
    }
}
