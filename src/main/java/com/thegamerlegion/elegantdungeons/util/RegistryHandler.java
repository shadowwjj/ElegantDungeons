package com.thegamerlegion.elegantdungeons.util;

import com.lazy.baubles.api.BaubleType;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.blocks.*;
import com.thegamerlegion.elegantdungeons.client.entity.render.ShroomRedEntityRender;
import com.thegamerlegion.elegantdungeons.entities.LacumiteGolem;
import com.thegamerlegion.elegantdungeons.entities.ShroomBrownEntity;
import com.thegamerlegion.elegantdungeons.entities.ShroomRedEntity;
import com.thegamerlegion.elegantdungeons.items.BaubleItem;
import com.thegamerlegion.elegantdungeons.items.ItemBase;
import com.thegamerlegion.elegantdungeons.items.ModdedSpawnEggItem;
import com.thegamerlegion.elegantdungeons.items.tools.BrickBreaker;
import com.thegamerlegion.elegantdungeons.items.tools.DungItemTiers;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.swing.*;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<SoundEvent>(ForgeRegistries.SOUND_EVENTS, ElegantDungeons.MOD_ID);

    public static void init() {
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
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
    public static final RegistryObject<Block> T1_STAIRS = BLOCKS.register("lacumite_stairs", () -> new StairsBlock(() -> RegistryHandler.T1_BRICK.get().getDefaultState(),Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0f,1200.0f)));
    public static final RegistryObject<Block> T1_SLAB = BLOCKS.register("lacumite_slab", DungeonBrickSlab::new);
    public static final RegistryObject<Block> T1_BUTTON = BLOCKS.register("lacumite_button", () -> new DungeonButton(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T1_PRESSURE_PLATE = BLOCKS.register("lacumite_pressure_plate", () -> new DungeonPressurePlate(PressurePlateBlock.Sensitivity.MOBS,Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T1_FALSE_BRICK = BLOCKS.register("lacumite_false_brick", FalseDungeonBrick::new);


    public static final RegistryObject<Block> T2_BRICK = BLOCKS.register("fossenium_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T2_BRICK_CHISELED = BLOCKS.register("fossenium_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T2_STAIRS = BLOCKS.register("fossenium_stairs", () -> new StairsBlock(() -> RegistryHandler.T2_BRICK.get().getDefaultState(),Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0f,1200.0f)));
    public static final RegistryObject<Block> T2_SLAB = BLOCKS.register("fossenium_slab", DungeonBrickSlab::new);
    public static final RegistryObject<Block> T2_BUTTON = BLOCKS.register("fossenium_button", () -> new DungeonButton(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T2_PRESSURE_PLATE = BLOCKS.register("fossenium_pressure_plate", () -> new DungeonPressurePlate(PressurePlateBlock.Sensitivity.MOBS,Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T2_FALSE_BRICK = BLOCKS.register("fossenium_false_brick", FalseDungeonBrick::new);


    public static final RegistryObject<Block> T3_BRICK = BLOCKS.register("jamanite_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T3_BRICK_CHISELED = BLOCKS.register("jamanite_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T3_STAIRS = BLOCKS.register("jamanite_stairs", () -> new StairsBlock(() -> RegistryHandler.T3_BRICK.get().getDefaultState(),Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0f,1200.0f)));
    public static final RegistryObject<Block> T3_SLAB = BLOCKS.register("jamanite_slab", DungeonBrickSlab::new);
    public static final RegistryObject<Block> T3_BUTTON = BLOCKS.register("jamanite_button", () -> new DungeonButton(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T3_PRESSURE_PLATE = BLOCKS.register("jamanite_pressure_plate", () -> new DungeonPressurePlate(PressurePlateBlock.Sensitivity.MOBS,Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T3_FALSE_BRICK = BLOCKS.register("jamanite_false_brick", FalseDungeonBrick::new);


    public static final RegistryObject<Block> T4_BRICK = BLOCKS.register("dieran_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T4_BRICK_CHISELED = BLOCKS.register("dieran_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T4_STAIRS = BLOCKS.register("dieran_stairs", () -> new StairsBlock(() -> RegistryHandler.T4_BRICK.get().getDefaultState(),Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0f,1200.0f)));
    public static final RegistryObject<Block> T4_SLAB = BLOCKS.register("dieran_slab", DungeonBrickSlab::new);
    public static final RegistryObject<Block> T4_BUTTON = BLOCKS.register("dieran_button", () -> new DungeonButton(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T4_PRESSURE_PLATE = BLOCKS.register("dieran_pressure_plate", () -> new DungeonPressurePlate(PressurePlateBlock.Sensitivity.MOBS,Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T4_FALSE_BRICK = BLOCKS.register("dieran_false_brick", FalseDungeonBrick::new);


    public static final RegistryObject<Block> T5_BRICK = BLOCKS.register("myrkurite_brick", DungeonBrick::new);
    public static final RegistryObject<Block> T5_BRICK_CHISELED = BLOCKS.register("myrkurite_brick_chiseled", DungeonBrick::new);
    public static final RegistryObject<Block> T5_STAIRS = BLOCKS.register("myrkurite_stairs", () -> new StairsBlock(() -> RegistryHandler.T5_BRICK.get().getDefaultState(),Block.Properties.create(Material.ROCK).hardnessAndResistance(-1.0f,1200.0f)));
    public static final RegistryObject<Block> T5_SLAB = BLOCKS.register("myrkurite_slab", DungeonBrickSlab::new);
    public static final RegistryObject<Block> T5_BUTTON = BLOCKS.register("myrkurite_button", () -> new DungeonButton(Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T5_PRESSURE_PLATE = BLOCKS.register("myrkurite_pressure_plate", () -> new DungeonPressurePlate(PressurePlateBlock.Sensitivity.MOBS,Block.Properties.create(Material.ROCK)));
    public static final RegistryObject<Block> T5_FALSE_BRICK = BLOCKS.register("myrkurite_false_brick", FalseDungeonBrick::new);


    public static final RegistryObject<Block> T1_CRYSTAL = BLOCKS.register("lacumite_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T2_CRYSTAL = BLOCKS.register("fossenium_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T3_CRYSTAL = BLOCKS.register("jamanite_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T4_CRYSTAL = BLOCKS.register("dieran_crystal_block", DungeonCrystal::new);
    public static final RegistryObject<Block> T5_CRYSTAL = BLOCKS.register("myrkurite_crystal_block", DungeonCrystal::new);
    // Block Items
    public static final RegistryObject<Item> T1_BRICK_ITEM = ITEMS.register("lacumite_brick", () -> new BlockItemBase(T1_BRICK.get()));
    public static final RegistryObject<Item> T1_BRICK_CHISELED_ITEM = ITEMS.register("lacumite_brick_chiseled", () -> new BlockItemBase(T1_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T1_BUTTON_ITEM = ITEMS.register("lacumite_button", () -> new BlockItemBase(T1_BUTTON.get()));
    public static final RegistryObject<Item> T1_PRESSURE_PLATE_ITEM = ITEMS.register("lacumite_pressure_plate", () -> new BlockItemBase(T1_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> T1_STAIRS_ITEM = ITEMS.register("lacumite_stairs", () -> new BlockItemBase(T1_STAIRS.get()));
    public static final RegistryObject<Item> T1_SLAB_ITEM = ITEMS.register("lacumite_slab", () -> new BlockItemBase(T1_SLAB.get()));
    public static final RegistryObject<Item> T1_FALSE_BRICK_ITEM = ITEMS.register("lacumite_false_brick", () -> new BlockItemBase(T1_FALSE_BRICK.get()));


    public static final RegistryObject<Item> T2_BRICK_ITEM = ITEMS.register("fossenium_brick", () -> new BlockItemBase(T2_BRICK.get()));
    public static final RegistryObject<Item> T2_BRICK_CHISELED_ITEM = ITEMS.register("fossenium_brick_chiseled", () -> new BlockItemBase(T2_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T2_BUTTON_ITEM = ITEMS.register("fossenium_button", () -> new BlockItemBase(T2_BUTTON.get()));
    public static final RegistryObject<Item> T2_PRESSURE_PLATE_ITEM = ITEMS.register("fossenium_pressure_plate", () -> new BlockItemBase(T2_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> T2_STAIRS_ITEM = ITEMS.register("fossenium_stairs", () -> new BlockItemBase(T2_STAIRS.get()));
    public static final RegistryObject<Item> T2_SLAB_ITEM = ITEMS.register("fossenium_slab", () -> new BlockItemBase(T2_SLAB.get()));
    public static final RegistryObject<Item> T2_FALSE_BRICK_ITEM = ITEMS.register("fossenium_false_brick", () -> new BlockItemBase(T2_FALSE_BRICK.get()));


    public static final RegistryObject<Item> T3_BRICK_ITEM = ITEMS.register("jamanite_brick", () -> new BlockItemBase(T3_BRICK.get()));
    public static final RegistryObject<Item> T3_BRICK_CHISELED_ITEM = ITEMS.register("jamanite_brick_chiseled", () -> new BlockItemBase(T3_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T3_BUTTON_ITEM = ITEMS.register("jamanite_button", () -> new BlockItemBase(T3_BUTTON.get()));
    public static final RegistryObject<Item> T3_PRESSURE_PLATE_ITEM = ITEMS.register("jamanite_pressure_plate", () -> new BlockItemBase(T3_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> T3_STAIRS_ITEM = ITEMS.register("jamanite_stairs", () -> new BlockItemBase(T3_STAIRS.get()));
    public static final RegistryObject<Item> T3_SLAB_ITEM = ITEMS.register("jamanite_slab", () -> new BlockItemBase(T3_SLAB.get()));
    public static final RegistryObject<Item> T3_FALSE_BRICK_ITEM = ITEMS.register("jamanite_false_brick", () -> new BlockItemBase(T3_FALSE_BRICK.get()));


    public static final RegistryObject<Item> T4_BRICK_ITEM = ITEMS.register("dieran_brick", () -> new BlockItemBase(T4_BRICK.get()));
    public static final RegistryObject<Item> T4_BRICK_CHISELED_ITEM = ITEMS.register("dieran_brick_chiseled", () -> new BlockItemBase(T4_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T4_BUTTON_ITEM = ITEMS.register("dieran_button", () -> new BlockItemBase(T4_BUTTON.get()));
    public static final RegistryObject<Item> T4_PRESSURE_PLATE_ITEM = ITEMS.register("dieran_pressure_plate", () -> new BlockItemBase(T4_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> T4_STAIRS_ITEM = ITEMS.register("dieran_stairs", () -> new BlockItemBase(T4_STAIRS.get()));
    public static final RegistryObject<Item> T4_SLAB_ITEM = ITEMS.register("dieran_slab", () -> new BlockItemBase(T4_SLAB.get()));
    public static final RegistryObject<Item> T4_FALSE_BRICK_ITEM = ITEMS.register("dieran_false_brick", () -> new BlockItemBase(T4_FALSE_BRICK.get()));


    public static final RegistryObject<Item> T5_BRICK_ITEM = ITEMS.register("myrkurite_brick", () -> new BlockItemBase(T5_BRICK.get()));
    public static final RegistryObject<Item> T5_BRICK_CHISELED_ITEM = ITEMS.register("myrkurite_brick_chiseled", () -> new BlockItemBase(T5_BRICK_CHISELED.get()));
    public static final RegistryObject<Item> T5_BUTTON_ITEM = ITEMS.register("myrkurite_button", () -> new BlockItemBase(T5_BUTTON.get()));
    public static final RegistryObject<Item> T5_PRESSURE_PLATE_ITEM = ITEMS.register("myrkurite_pressure_plate", () -> new BlockItemBase(T5_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> T5_STAIRS_ITEM = ITEMS.register("myrkurite_stairs", () -> new BlockItemBase(T5_STAIRS.get()));
    public static final RegistryObject<Item> T5_SLAB_ITEM = ITEMS.register("myrkurite_slab", () -> new BlockItemBase(T5_SLAB.get()));
    public static final RegistryObject<Item> T5_FALSE_BRICK_ITEM = ITEMS.register("myrkurite_false_brick", () -> new BlockItemBase(T5_FALSE_BRICK.get()));


    public static final RegistryObject<Item> T1_CRYSTAL_ITEM = ITEMS.register("lacumite_crystal_block", () -> new BlockItemBase(T1_CRYSTAL.get()));
    public static final RegistryObject<Item> T2_CRYSTAL_ITEM = ITEMS.register("fossenium_crystal_block", () -> new BlockItemBase(T2_CRYSTAL.get()));
    public static final RegistryObject<Item> T3_CRYSTAL_ITEM = ITEMS.register("jamanite_crystal_block", () -> new BlockItemBase(T3_CRYSTAL.get()));
    public static final RegistryObject<Item> T4_CRYSTAL_ITEM = ITEMS.register("dieran_crystal_block", () -> new BlockItemBase(T4_CRYSTAL.get()));
    public static final RegistryObject<Item> T5_CRYSTAL_ITEM = ITEMS.register("myrkurite_crystal_block", () -> new BlockItemBase(T5_CRYSTAL.get()));



    //Entities (MOBS + SPAWN EGG + Their Sounds Under Them)

    public static final RegistryObject<EntityType<ShroomRedEntity>> SHROOM_RED_ENTITY = ENTITY_TYPES.register("shroom_red_entity", () -> EntityType.Builder.<ShroomRedEntity>create(ShroomRedEntity::new, EntityClassification.MONSTER)
            .size(0.6f,0.6f)
            .setTrackingRange(3)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "shroom_red_entity").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> SHROOM_RED_EGG = ITEMS.register("shroom_red_egg", () -> new ModdedSpawnEggItem(SHROOM_RED_ENTITY, 0xeb4034, 0xfff8e6, new Item.Properties().group(ElegantDungeons.TAB)));



    public static final RegistryObject<EntityType<ShroomBrownEntity>> SHROOM_BROWN_ENTITY = ENTITY_TYPES.register("shroom_brown_entity", () -> EntityType.Builder.<ShroomBrownEntity>create(ShroomBrownEntity::new, EntityClassification.MONSTER)
            .size(0.6f,0.6f)
            .setTrackingRange(3)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "shroom_brown_entity").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> SHROOM_BROWN_EGG = ITEMS.register("shroom_brown_egg", () -> new ModdedSpawnEggItem(SHROOM_BROWN_ENTITY, 0x806e41, 0xfff8e6, new Item.Properties().group(ElegantDungeons.TAB)));



    public static final RegistryObject<SoundEvent> SHROOM_AMBIENT = SOUNDS.register("entity.mushroom_entity.ambient",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.mushroom_entity.ambient")));
    public static final RegistryObject<SoundEvent> SHROOM_DEATH = SOUNDS.register("entity.mushroom_entity.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.mushroom_entity.death")));
    public static final RegistryObject<SoundEvent> SHROOM_HURT = SOUNDS.register("entity.mushroom_entity.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.mushroom_entity.hurt")));



    public static final RegistryObject<EntityType<LacumiteGolem>> LACUMITE_GOLEM = ENTITY_TYPES.register("lacumite_golem", () -> EntityType.Builder.<LacumiteGolem>create(LacumiteGolem::new, EntityClassification.MONSTER)
            .size(1.0f,2.0f)
            .setTrackingRange(3)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "lacumite_golem").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> LACUMITE_GOLEM_EGG = ITEMS.register("lacumite_golem_egg", () -> new ModdedSpawnEggItem(LACUMITE_GOLEM, 0x9f7a66, 0xff9c75, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> GOLEM_AMBIENT = SOUNDS.register("entity.golem.ambient",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.golem.ambient")));
    public static final RegistryObject<SoundEvent> GOLEM_DEATH = SOUNDS.register("entity.golem.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.golem.death")));
    public static final RegistryObject<SoundEvent> GOLEM_HURT = SOUNDS.register("entity.golem.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.golem.hurt")));
}
