package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.ShroomBrownEntityModel;
import com.thegamerlegion.elegantdungeons.entities.ShroomBrownEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ShroomBrownEntityRender extends MobRenderer<ShroomBrownEntity, ShroomBrownEntityModel<ShroomBrownEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/shroom_brown_entity.png");
    public ShroomBrownEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new ShroomBrownEntityModel<ShroomBrownEntity>(), 0.4f);

    }

    @Override
    public ResourceLocation getEntityTexture(ShroomBrownEntity entity) {
        return TEXTURE;
    }
}
