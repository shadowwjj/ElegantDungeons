package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.FrostArrowEntity;
import com.thegamerlegion.elegantdungeons.entities.RadiantArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class FrostArrowRender extends ArrowRenderer<FrostArrowEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID,"textures/entity/projectiles/white_arrow.png");

    public FrostArrowRender(EntityRendererManager manager) {
        super(manager);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(FrostArrowEntity entity) {
        return TEXTURE;
    }
}
