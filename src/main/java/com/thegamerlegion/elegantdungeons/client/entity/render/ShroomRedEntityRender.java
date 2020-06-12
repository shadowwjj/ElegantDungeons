package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.ShroomRedEntityModel;
import com.thegamerlegion.elegantdungeons.entities.ShroomRedEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ShroomRedEntityRender extends MobRenderer<ShroomRedEntity, ShroomRedEntityModel<ShroomRedEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/shroom_red_entity.png");
    public ShroomRedEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ShroomRedEntityModel<ShroomRedEntity>(), 0.4f);

    }

    @Override
    public ResourceLocation getEntityTexture(ShroomRedEntity entity) {
        return TEXTURE;
    }
}
