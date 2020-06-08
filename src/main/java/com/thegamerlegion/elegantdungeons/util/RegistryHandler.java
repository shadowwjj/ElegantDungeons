package com.thegamerlegion.elegantdungeons.util;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ElegantDungeons.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> KEY_DIAMOND = ITEMS.register("key_diamond", ItemBase::new);
    public static final RegistryObject<Item> KEY_IRON = ITEMS.register("key_iron", ItemBase::new);
    public static final RegistryObject<Item> KEY_GOLD = ITEMS.register("key_gold", ItemBase::new);
    public static final RegistryObject<Item> KEY_T1_BOSS = ITEMS.register("key_t1_boss", ItemBase::new);
    public static final RegistryObject<Item> KEY_T2_BOSS = ITEMS.register("key_t2_boss", ItemBase::new);
    public static final RegistryObject<Item> KEY_T3_BOSS = ITEMS.register("key_t3_boss", ItemBase::new);
    public static final RegistryObject<Item> KEY_T4_BOSS = ITEMS.register("key_t4_boss", ItemBase::new);
    public static final RegistryObject<Item> KEY_T5_BOSS = ITEMS.register("key_t5_boss", ItemBase::new);
    public static final RegistryObject<Item> T1_CRYSTAL_SHARD = ITEMS.register("t1_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T2_CRYSTAL_SHARD = ITEMS.register("t2_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T3_CRYSTAL_SHARD = ITEMS.register("t3_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T4_CRYSTAL_SHARD = ITEMS.register("t4_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T5_CRYSTAL_SHARD = ITEMS.register("t5_crystal_shard", ItemBase::new);

    // Blocks

    // Block Items
}
