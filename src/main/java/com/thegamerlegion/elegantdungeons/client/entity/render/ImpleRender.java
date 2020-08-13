package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.ImpleModel;
import com.thegamerlegion.elegantdungeons.entities.Imple;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ImpleRender extends MobRenderer<Imple, ImpleModel<Imple>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/imple.png");
    public ImpleRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ImpleModel<Imple>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(Imple entity) {
        return TEXTURE;
    }
}
