package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.BloodArrowEntity;
import com.thegamerlegion.elegantdungeons.entities.RadiantArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class BloodArrowRender extends ArrowRenderer<BloodArrowEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID,"textures/entity/projectiles/blood_arrow.png");

    public BloodArrowRender(EntityRendererManager manager) {
        super(manager);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(BloodArrowEntity entity) {
        return TEXTURE;
    }
}
