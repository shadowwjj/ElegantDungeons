package com.thegamerlegion.elegantdungeons.util;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.render.*;
import com.thegamerlegion.elegantdungeons.entities.VoidWalker;
import com.thegamerlegion.elegantdungeons.items.ModdedSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


/**
 * USED IN RENDERING ENTITIES SUCH AS CHESTS AND MOBS, SEPARATE FROM REGISTERING THEM!!!
 * **/

@Mod.EventBusSubscriber(modid = ElegantDungeons.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT )

public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.SHROOM_RED_ENTITY.get(), ShroomRedEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.SHROOM_BROWN_ENTITY.get(), ShroomBrownEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.LACUMITE_GOLEM.get(), LacumiteGolemRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.LACUMITE_SEEKER.get(), LacumiteSeekerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.RAGEROOT.get(), RagerootRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.DUCKIN.get(), DuckinRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.FROG.get(), FrogRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.IMPLE.get(), ImpleRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.LIVING_EXPERIENCE.get(), LivingExperienceRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.RAT.get(), RatRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.OTAMAKIN.get(), OtamakinRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BYX.get(), ByxRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.VOIDWALKER.get(), VoidWalkerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.RADIANT_ARROW.get(), RadiantArrowRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BLOOD_ARROW.get(), BloodArrowRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BLOWGUN_PROJECTILE.get(), BlowgunProjectileRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.BLACK_ARROW.get(), BlackArrowRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.FROST_ARROW.get(), FrostArrowRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RegistryHandler.MAGIC_BALL.get(), LacumiteBallProjectileRender::new);
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModdedSpawnEggItem.initUnaddedEggs();
    }
}
