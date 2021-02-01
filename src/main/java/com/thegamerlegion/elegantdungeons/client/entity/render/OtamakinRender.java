package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.DuckinModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.OtamakinModel;
import com.thegamerlegion.elegantdungeons.entities.Duckin;
import com.thegamerlegion.elegantdungeons.entities.Otamakin;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class OtamakinRender extends MobRenderer<Otamakin, OtamakinModel<Otamakin>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/otamakin.png");
    public OtamakinRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new OtamakinModel<>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(Otamakin entity) {
        return TEXTURE;
    }
}
