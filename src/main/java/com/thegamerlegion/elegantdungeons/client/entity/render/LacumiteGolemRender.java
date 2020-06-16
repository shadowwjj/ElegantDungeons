package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.LacumiteGolemModel;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LacumiteGolemRender extends MobRenderer<LacumiteGolem, LacumiteGolemModel<LacumiteGolem>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/lacumite_golem.png");
    public LacumiteGolemRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LacumiteGolemModel<LacumiteGolem>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(LacumiteGolem entity) {
        return TEXTURE;
    }
}
