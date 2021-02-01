package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.RadiantArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class RadiantArrowRender extends ArrowRenderer<RadiantArrowEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID,"textures/entity/projectiles/radiant_arrow.png");

    public RadiantArrowRender(EntityRendererManager manager) {
        super(manager);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(RadiantArrowEntity entity) {
        return TEXTURE;
    }
}
