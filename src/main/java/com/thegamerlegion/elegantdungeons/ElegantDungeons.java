package com.thegamerlegion.elegantdungeons;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("elegantdungeons")
public class ElegantDungeons {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "elegantdungeons";

    public ElegantDungeons() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("elegantDungeonsTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.KEY_T5_BOSS.get());
        }
    };

    public static final ItemGroup WEAPONS_TAB = new ItemGroup("elegantDungeonsWeapons") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.MYRKURITE_SWORD.get());
        }
    };

    public static final ItemGroup ARMOR_TAB = new ItemGroup("elegantDungeonsArmor") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.MYRKURITE_HELMET.get());
        }
    };
}
