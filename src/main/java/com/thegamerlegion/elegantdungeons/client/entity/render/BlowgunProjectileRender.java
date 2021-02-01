package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.entities.BloodArrowEntity;
import com.thegamerlegion.elegantdungeons.entities.BlowgunProjectileEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class BlowgunProjectileRender extends ArrowRenderer<BlowgunProjectileEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID,"textures/entity/projectiles/blowgun_projectile.png");

    public BlowgunProjectileRender(EntityRendererManager manager) {
        super(manager);
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(BlowgunProjectileEntity entity) {
        return TEXTURE;
    }
}
