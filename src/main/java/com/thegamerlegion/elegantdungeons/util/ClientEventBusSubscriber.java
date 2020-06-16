package com.thegamerlegion.elegantdungeons.util;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.client.entity.render.ShroomBrownEntityRender;
import com.thegamerlegion.elegantdungeons.client.entity.render.ShroomRedEntityRender;
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
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        ModdedSpawnEggItem.initUnaddedEggs();
    }


}
