package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.RagerootModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.RagerootModel;
import com.thegamerlegion.elegantdungeons.entities.Rageroot;
import com.thegamerlegion.elegantdungeons.entities.Rageroot;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RagerootRender extends MobRenderer<Rageroot, RagerootModel<Rageroot>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/rageroot.png");
    public RagerootRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new RagerootModel<Rageroot>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(Rageroot entity) {
        return TEXTURE;
    }
}
