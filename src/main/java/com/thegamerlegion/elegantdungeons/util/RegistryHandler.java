package com.thegamerlegion.elegantdungeons.util;

import com.lazy.baubles.api.BaubleType;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.blocks.*;
import com.thegamerlegion.elegantdungeons.items.BaubleItem;
import com.thegamerlegion.elegantdungeons.items.ItemBase;
import com.thegamerlegion.elegantdungeons.items.tools.BrickBreaker;
import com.thegamerlegion.elegantdungeons.items.tools.DungItemTiers;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.material.Material;
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
    public static final RegistryObject<Item> MORPHIUM_INGOT = ITEMS.register("morphium_ingot", ItemBase::new);

    // Ring Baubles
    public static final RegistryObject<Item> RING_BASE = ITEMS.register("ring_base", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_DIERAN = ITEMS.register("ring_dieran", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_FIRE_GEM = ITEMS.register("ring_fire_gem", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_FOSSENIUM = ITEMS.register("ring_fossenium", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_FROZO = ITEMS.register("ring_frozo", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_ICE_GEM = ITEMS.register("ring_ice_gem", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_JAMANITE = ITEMS.register("ring_jamanite", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_LACUMITE = ITEMS.register("ring_lacumite", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_MURKY_GEM = ITEMS.register("ring_murky_gem", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_MYRKURITE = ITEMS.register("ring_myrkurite", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_SWAMP = ITEMS.register("ring_swamp", () -> { return new BaubleItem(BaubleType.RING);});

    // Amulet Baubles
    public static final RegistryObject<Item> AMULET_BASE = ITEMS.register("amulet_base", () -> { return new BaubleItem(BaubleType.AMULET);});
    public static final RegistryObject<Item> AMULET_CORRUPT_FLAME = ITEMS.register("amulet_corrupt_flame", () -> { return new BaubleItem(BaubleType.AMULET);});
    public static final RegistryObject<Item> AMULET_GOLDCHAIN = ITEMS.register("amulet_goldchain", () -> { return new BaubleItem(BaubleType.AMULET);});
    public static final RegistryObject<Item> AMULET_AMULET_NEBBE_FLAME = ITEMS.register("amulet_nebbe_flame", () -> { return new BaubleItem(BaubleType.AMULET);});
    public static final RegistryObject<Item> AMULET_SEA_SCALE = ITEMS.register("amulet_sea_scale", () -> { return new BaubleItem(BaubleType.AMULET);});
    public static final RegistryObject<Item> AMULET_SPIKE_BALL = ITEMS.register("amulet_spike_ball", () -> { return new BaubleItem(BaubleType.AMULET);});

    // Headwear Baubles
    public static final RegistryObject<Item> HEAD_BASE = ITEMS.register("head_base", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_BAND_OF_GROWTH = ITEMS.register("head_band_of_growth", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_BASIC_CROWN = ITEMS.register("head_basic_crown", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_BLACK_BANDANA = ITEMS.register("head_black_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_CROWN_OF_SPIDERS = ITEMS.register("head_crown_of_spiders", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_FIGHTER_BANDANA = ITEMS.register("head_fighter_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_FUZZY_BANDANA = ITEMS.register("head_fuzzy_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_INFERNO_CROWN = ITEMS.register("head_inferno_crown", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_IRON_BAND = ITEMS.register("head_iron_band", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_SOLAR_BANDANA = ITEMS.register("head_solar_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});

    // Belt Baubles
    public static final RegistryObject<Item> BELT_BASE = ITEMS.register("belt_base", () -> { return new BaubleItem(BaubleType.BELT);});
    public static final RegistryObject<Item> BELT_BLACK = ITEMS.register("belt_black", () -> { return new BaubleItem(BaubleType.BELT);});
    public static final RegistryObject<Item> BELT_OBSIDIAN = ITEMS.register("belt_obsidian", () -> { return new BaubleItem(BaubleType.BELT);});

    // Tools
    public static final RegistryObject<Item> BRICK_BREAKER = ITEMS.register("brick_breaker", () -> {
        return new BrickBreaker(DungItemTiers.BRICK_BREAKER, 6.0F, new Item.Properties().group(ElegantDungeons.TAB));
    });

    // Blocks
    public static final RegistryObject<Block> T1_BRICK = BLOCKS.register("lacumite_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T1_BRICK_CHISELED = BLOCKS.register("lacumite_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T2_BRICK = BLOCKS.register("fossenium_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T2_BRICK_CHISELED = BLOCKS.register("fossenium_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T3_BRICK = BLOCKS.register("jamanite_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T3_BRICK_CHISELED = BLOCKS.register("jamanite_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T4_BRICK = BLOCKS.register("dieran_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T4_BRICK_CHISELED = BLOCKS.register("dieran_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T5_BRICK = BLOCKS.register("myrkurite_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T5_BRICK_CHISELED = BLOCKS.register("myrkurite_brick_chiseled", DungeonBrick::new);

    //public static final RegistryObject<Block> T1_STAIRS = BLOCKS.register("lacumite_stairs",() -> new StairsBlock(() -> RegistryHandler.T1_BRICK.getDefaultState(), Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T1_BUTTON = BLOCKS.register("lacumite_button", () -> new DungeonButton(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T1_PRESSURE_PLATE = BLOCKS.register("lacumite_pressure_plate", () -> new DungeonPressurePlate(PressurePlateBlock.Sensitivity.MOBS,Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> T1_CRYSTAL = BLOCKS.register("lacumite_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T2_CRYSTAL = BLOCKS.register("fossenium_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T3_CRYSTAL = BLOCKS.register("jamanite_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T4_CRYSTAL = BLOCKS.register("dieran_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T5_CRYSTAL = BLOCKS.register("myrkurite_crystal_block", DungeonCrystal::new);
    // Block Items
    public static final RegistryObject<Item> T1_BRICK_ITEM = ITEMS.register("lacumite_brick", () -> new BlockItemBase(T1_BRICK.get()));
    public static final RegistryObject<Item> T1_BRICK_CHISELED_ITEM = ITEMS.register("lacumite_brick_chiseled", () -> new BlockItemBase(T1_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T2_BRICK_ITEM = ITEMS.register("fossenium_brick", () -> new BlockItemBase(T2_BRICK.get()));
    public static final RegistryObject<Item> T2_BRICK_CHISELED_ITEM = ITEMS.register("fossenium_brick_chiseled", () -> new BlockItemBase(T2_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T3_BRICK_ITEM = ITEMS.register("jamanite_brick", () -> new BlockItemBase(T3_BRICK.get()));
    public static final RegistryObject<Item> T3_BRICK_CHISELED_ITEM = ITEMS.register("jamanite_brick_chiseled", () -> new BlockItemBase(T3_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T4_BRICK_ITEM = ITEMS.register("dieran_brick", () -> new BlockItemBase(T4_BRICK.get()));
    public static final RegistryObject<Item> T4_BRICK_CHISELED_ITEM = ITEMS.register("dieran_brick_chiseled", () -> new BlockItemBase(T4_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T5_BRICK_ITEM = ITEMS.register("myrkurite_brick", () -> new BlockItemBase(T5_BRICK.get()));
    public static final RegistryObject<Item> T5_BRICK_CHISELED_ITEM = ITEMS.register("myrkurite_brick_chiseled", () -> new BlockItemBase(T5_BRICK_CHISELED.get()));

    public static final RegistryObject<Item> T1_CRYSTAL_ITEM = ITEMS.register("lacumite_crystal_block", () -> new BlockItemBase(T1_CRYSTAL.get()));
    public static final RegistryObject<Item> T2_CRYSTAL_ITEM = ITEMS.register("fossenium_crystal_block", () -> new BlockItemBase(T2_CRYSTAL.get()));
    public static final RegistryObject<Item> T3_CRYSTAL_ITEM = ITEMS.register("jamanite_crystal_block", () -> new BlockItemBase(T3_CRYSTAL.get()));
    public static final RegistryObject<Item> T4_CRYSTAL_ITEM = ITEMS.register("dieran_crystal_block", () -> new BlockItemBase(T4_CRYSTAL.get()));
    public static final RegistryObject<Item> T5_CRYSTAL_ITEM = ITEMS.register("myrkurite_crystal_block", () -> new BlockItemBase(T5_CRYSTAL.get()));

    public static final RegistryObject<Item> T1_BUTTON_ITEM = ITEMS.register("lacumite_button", () -> new BlockItemBase(T1_BUTTON.get()));
    public static final RegistryObject<Item> T1_PRESSURE_PLATE_ITEM = ITEMS.register("lacumite_pressure_plate", () -> new BlockItemBase(T1_PRESSURE_PLATE.get()));
}
