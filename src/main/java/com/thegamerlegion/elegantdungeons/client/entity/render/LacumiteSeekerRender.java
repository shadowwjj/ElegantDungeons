package com.thegamerlegion.elegantdungeons.client.entity.render;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.model.LacumiteGolemModel;
import com.thegamerlegion.elegantdungeons.client.entity.model.LacumiteSeekerModel;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.LacumiteSeeker;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LacumiteSeekerRender extends MobRenderer<LacumiteSeeker, LacumiteSeekerModel<LacumiteSeeker>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ElegantDungeons.MOD_ID, "textures/entity/lacumite_seeker.png");
    public LacumiteSeekerRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LacumiteSeekerModel<>(), 0.5f);

    }

    @Override
    public ResourceLocation getEntityTexture(LacumiteSeeker entity) {
        return TEXTURE;
    }
}
