package com.thegamerlegion.elegantdungeons.util;

import com.lazy.baubles.api.BaubleType;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.blocks.*;
import com.thegamerlegion.elegantdungeons.enchantments.*;
import com.thegamerlegion.elegantdungeons.entities.*;
import com.thegamerlegion.elegantdungeons.items.BaubleItem;
import com.thegamerlegion.elegantdungeons.items.ItemBase;
import com.thegamerlegion.elegantdungeons.items.KeyItem;
import com.thegamerlegion.elegantdungeons.items.ModdedSpawnEggItem;
import com.thegamerlegion.elegantdungeons.items.armor.DungArmorMaterial;
import com.thegamerlegion.elegantdungeons.items.baubles.*;
import com.thegamerlegion.elegantdungeons.items.tools.*;
import net.minecraft.block.Block;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Effect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<SoundEvent>(ForgeRegistries.SOUND_EVENTS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(ForgeRegistries.ENCHANTMENTS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<Effect> EFFECTS= new DeferredRegister<Effect>(ForgeRegistries.POTIONS, ElegantDungeons.MOD_ID);

    public static void init() {
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> KEY_DIAMOND = ITEMS.register("key_diamond", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_IRON = ITEMS.register("key_iron", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_GOLD = ITEMS.register("key_gold", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_T1_BOSS = ITEMS.register("key_t1_boss", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_T2_BOSS = ITEMS.register("key_t2_boss", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_T3_BOSS = ITEMS.register("key_t3_boss", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_T4_BOSS = ITEMS.register("key_t4_boss", () -> { return new KeyItem();});
    public static final RegistryObject<Item> KEY_T5_BOSS = ITEMS.register("key_t5_boss", () -> { return new KeyItem();});
    public static final RegistryObject<Item> T1_CRYSTAL_SHARD = ITEMS.register("t1_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T2_CRYSTAL_SHARD = ITEMS.register("t2_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T3_CRYSTAL_SHARD = ITEMS.register("t3_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T4_CRYSTAL_SHARD = ITEMS.register("t4_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> T5_CRYSTAL_SHARD = ITEMS.register("t5_crystal_shard", ItemBase::new);
    public static final RegistryObject<Item> MORPHIUM_INGOT = ITEMS.register("morphium_ingot", ItemBase::new);
    public static final RegistryObject<Item> MYSTIC_BRANCH = ITEMS.register("mystic_branch", ItemBase::new);
    public static final RegistryObject<Item> FROG_BISCUIT = ITEMS.register("frog_biscuit", ItemBase::new);
    public static final RegistryObject<Item> ROSE_PEARL = ITEMS.register("rose_pearl", ItemBase::new);
    public static final RegistryObject<Item> RELIC_SHARD = ITEMS.register("relic_shard", ItemBase::new);
    public static final RegistryObject<Item> CRYSTAL_BUBBLE = ITEMS.register("crystal_bubble", ItemBase::new);

    // Ring Baubles
    public static final RegistryObject<Item> RING_BASE = ITEMS.register("ring_base", () -> { return new BaubleItem(BaubleType.RING);});
    public static final RegistryObject<Item> RING_DIERAN = ITEMS.register("ring_dieran", () -> { return new DieranRing();});
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
    public static final RegistryObject<Item> AMULET_CATEYE = ITEMS.register("amulet_cateye", () -> { return new CatEyeAmulet();});

    // Headwear Baubles
    public static final RegistryObject<Item> HEAD_BASE = ITEMS.register("head_base", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_BAND_OF_GROWTH = ITEMS.register("head_band_of_growth", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_BASIC_CROWN = ITEMS.register("head_basic_crown", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_BLACK_BANDANA = ITEMS.register("head_black_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_CROWN_OF_SPIDERS = ITEMS.register("head_crown_of_spiders", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_FIGHTER_BANDANA = ITEMS.register("head_fighter_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_FUZZY_BANDANA = ITEMS.register("head_fuzzy_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_INFERNO_CROWN = ITEMS.register("head_inferno_crown", () -> { return new BaubleItem(BaubleType.HEAD);});
    public static final RegistryObject<Item> HEAD_IRON_BAND = ITEMS.register("head_iron_band", () -> { return new IronBand();});
    public static final RegistryObject<Item> HEAD_SOLAR_BANDANA = ITEMS.register("head_solar_bandana", () -> { return new BaubleItem(BaubleType.HEAD);});

    // Belt Baubles
    public static final RegistryObject<Item> BELT_BASE = ITEMS.register("belt_base", () -> { return new BaubleItem(BaubleType.BELT);});
    public static final RegistryObject<Item> BELT_BLACK = ITEMS.register("belt_black", () -> { return new BaubleItem(BaubleType.BELT);});
    public static final RegistryObject<Item> BELT_OBSIDIAN = ITEMS.register("belt_obsidian", () -> { return new BaubleItem(BaubleType.BELT);});

    // Charm Baubles
    public static final RegistryObject<Item> CHARM_POISON_CRYSTAL = ITEMS.register("charm_poison_crystal", () -> { return new PoisonCrystal();});

    // Body Baubles
    public static final RegistryObject<Item> BODY_FEATHERBOOSTER = ITEMS.register("body_featherbooster", () -> { return new FeatherBooster();});




    // Tools
    public static final RegistryObject<Item> BRICK_BREAKER = ITEMS.register("brick_breaker", () -> {
        return new BrickBreaker(DungItemTiers.BRICK_BREAKER, 6.0F, new Item.Properties().group(ElegantDungeons.TAB));
    });


    // Swords
    public static final RegistryObject<Item> LACUMITE_SWORD = ITEMS.register("lacumite_sword", () -> {
        return new BaseSword(DungItemTiers.LACUMITESWORD,-2.4F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> FOSSENIUM_SWORD = ITEMS.register("fossenium_sword", () -> {
        return new BaseSword(DungItemTiers.FOSSENIUMSWORD,-2.4F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> JAMANITE_SWORD = ITEMS.register("jamanite_sword", () -> {
        return new BaseSword(DungItemTiers.JAMANITESWORD,-2.4F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> DIERAN_SWORD = ITEMS.register("dieran_sword", () -> {
        return new BaseSword(DungItemTiers.DIERANSWORD,-2.4F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> MYRKURITE_SWORD = ITEMS.register("myrkurite_sword", () -> {
        return new BaseSword(DungItemTiers.MYRKURITESWORD,-2.4F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> CHUNCHUNMARU = ITEMS.register("chunchunmaru", () -> {
        return new BaseSword(DungItemTiers.CHUNCHUNMARU,-1.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> CORNSWORD = ITEMS.register("corn_sword", () -> {
        return new BaseSword(DungItemTiers.CORNSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> JADEBLADE = ITEMS.register("jade_blade", () -> {
        return new BaseSword(DungItemTiers.JADEBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> EBONYBLADE = ITEMS.register("ebony_blade", () -> {
        return new BaseSword(DungItemTiers.EBONYBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> CRESCENTCUTLASS = ITEMS.register("crescent_cutlass", () -> {
        return new BaseSword(DungItemTiers.CRESCENTCUTLASS,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> FLAMENCOSWORD = ITEMS.register("flamenco_sword", () -> {
        return new BaseSword(DungItemTiers.FLAMENCOSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> MORPHIUMROSEBLADE = ITEMS.register("morphium_roseblade", () -> {
        return new BaseSword(DungItemTiers.MORPHIUMROSEBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> SLAPSTICK = ITEMS.register("slapstick", () -> {
        return new SlapStick(DungItemTiers.SLAPSTICK,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> SKELETAL_SWORD = ITEMS.register("skeletal_sword", () -> {
        return new BaseSword(DungItemTiers.SKELETALSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> SACRED_SWORD = ITEMS.register("sacred_sword", () -> {
        return new BaseSword(DungItemTiers.SACREDSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> GRASS_BLASE = ITEMS.register("grass_blade", () -> {
        return new BaseSword(DungItemTiers.GRASSBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> CRYSTALLINE_SWORD = ITEMS.register("crystalline_sword", () -> {
        return new BaseSword(DungItemTiers.CRYSTALLINESWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> FORTUNE_SWORD = ITEMS.register("fortune_sword", () -> {
        return new BaseSword(DungItemTiers.FORTUNESWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> ENDEROUS_SWORD = ITEMS.register("enderous_sword", () -> {
        return new EnderousSword(DungItemTiers.ENDEROUSSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> FATE_SLAYER = ITEMS.register("fate_slayer", () -> {
        return new BaseSword(DungItemTiers.FATESLAYER,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> DEMONIC_SWORD = ITEMS.register("demonic_sword", () -> {
        return new DemonicSword(DungItemTiers.DEMONICSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> BEAST_BLADE = ITEMS.register("beast_blade", () -> {
        return new BaseSword(DungItemTiers.BEASTBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> SCISSOR_SWORD = ITEMS.register("scissor_sword", () -> {
        return new BaseSword(DungItemTiers.SCISSORSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> ROOT_RIPPER = ITEMS.register("root_ripper", () -> {
        return new BaseSword(DungItemTiers.ROOTRIPPER,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> BUTTER_SWORD = ITEMS.register("butter_sword", () -> {
        return new BaseSword(DungItemTiers.BUTTERSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> SEA_SLASHER = ITEMS.register("sea_slasher", () -> {
        return new BaseSword(DungItemTiers.SEASLASHER,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> FEYBLADE = ITEMS.register("feyblade", () -> {
        return new Feyblade(DungItemTiers.FEYBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> JESTER_BESTER = ITEMS.register("jester_bester", () -> {
        return new BaseSword(DungItemTiers.JESTERBESTER,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> VIBRANT_RAPIER = ITEMS.register("vibrant_rapier", () -> {
        return new BaseSword(DungItemTiers.VIBRANTRAPIER,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> SNAKE_FANG = ITEMS.register("snake_fang", () -> {
        return new SnakeFang(DungItemTiers.SNAKEFANG,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> HEAT_HOOK = ITEMS.register("heat_hook", () -> {
        return new BaseSword(DungItemTiers.HEATHOOK,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});

    public static final RegistryObject<Item> NEEDLE_BLADE = ITEMS.register("needle_blade", () -> {
        return new BaseSword(DungItemTiers.NEEDLEBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.TAB));});
    // Bows


    // Armor
    public static final RegistryObject<ArmorItem> LACUMITE_HELMET =ITEMS.register("lacumite_helmet", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> LACUMITE_CHESTPLATE =ITEMS.register("lacumite_chestplate", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> LACUMITE_LEGGINGS =ITEMS.register("lacumite_leggings", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> LACUMITE_BOOTS =ITEMS.register("lacumite_boots", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<ArmorItem> FOSSENIUM_HELMET =ITEMS.register("fossenium_helmet", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> FOSSENIUM_CHESTPLATE =ITEMS.register("fossenium_chestplate", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> FOSSENIUM_LEGGINGS =ITEMS.register("fossenium_leggings", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> FOSSENIUM_BOOTS =ITEMS.register("fossenium_boots", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<ArmorItem> JAMANITE_HELMET =ITEMS.register("jamanite_helmet", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> JAMANITE_CHESTPLATE =ITEMS.register("jamanite_chestplate", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> JAMANITE_LEGGINGS =ITEMS.register("jamanite_leggings", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> JAMANITE_BOOTS =ITEMS.register("jamanite_boots", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<ArmorItem> DIERAN_HELMET =ITEMS.register("dieran_helmet", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> DIERAN_CHESTPLATE =ITEMS.register("dieran_chestplate", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> DIERAN_LEGGINGS =ITEMS.register("dieran_leggings", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> DIERAN_BOOTS =ITEMS.register("dieran_boots", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<ArmorItem> MYRKURITE_HELMET =ITEMS.register("myrkurite_helmet", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> MYRKURITE_CHESTPLATE =ITEMS.register("myrkurite_chestplate", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> MYRKURITE_LEGGINGS =ITEMS.register("myrkurite_leggings", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> MYRKURITE_BOOTS =ITEMS.register("myrkurite_boots", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<ArmorItem> FEYRUNE_HELMET =ITEMS.register("feyrune_helmet", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> FEYRUNE_CHESTPLATE =ITEMS.register("feyrune_chestplate", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> FEYRUNE_LEGGINGS =ITEMS.register("feyrune_leggings", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.TAB)));
    public static final RegistryObject<ArmorItem> FEYRUNE_BOOTS =ITEMS.register("feyrune_boots", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.TAB)));



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

    public static final RegistryObject<Block> POISON_TRAIL = BLOCKS.register("poison_trail", PoisonTrail::new);
    public static final RegistryObject<Block> SPIKES = BLOCKS.register("spikes", Spikes::new);
    public static final RegistryObject<Block> IRON_GATE_LOCK = BLOCKS.register("iron_gate_lock", DungeonDoorIronLock::new);
    public static final RegistryObject<Block> IRON_GATE = BLOCKS.register("iron_gate", DungeonDoor::new);
    public static final RegistryObject<Block> GOLD_GATE_LOCK = BLOCKS.register("gold_gate_lock", DungeonDoorGoldLock::new);
    public static final RegistryObject<Block> GOLD_GATE = BLOCKS.register("gold_gate", DungeonDoor::new);
    public static final RegistryObject<Block> DIAMOND_GATE_LOCK = BLOCKS.register("diamond_gate_lock", DungeonDoorDiamondLock::new);
    public static final RegistryObject<Block> DIAMOND_GATE = BLOCKS.register("diamond_gate", DungeonDoor::new);
    public static final RegistryObject<Block> T1_GATE_LOCK = BLOCKS.register("lacumite_gate_lock", DungeonDoorLacumiteLock::new);
    public static final RegistryObject<Block> T1_GATE = BLOCKS.register("lacumite_gate", DungeonDoor::new);
    public static final RegistryObject<Block> T2_GATE_LOCK = BLOCKS.register("fossenium_gate_lock", DungeonDoorFosseniumLock::new);
    public static final RegistryObject<Block> T2_GATE = BLOCKS.register("fossenium_gate", DungeonDoor::new);
    public static final RegistryObject<Block> T3_GATE_LOCK = BLOCKS.register("jamanite_gate_lock", DungeonDoorJamaniteLock::new);
    public static final RegistryObject<Block> T3_GATE = BLOCKS.register("jamanite_gate", DungeonDoor::new);
    public static final RegistryObject<Block> T4_GATE_LOCK = BLOCKS.register("dieran_gate_lock", DungeonDoorDieranLock::new);
    public static final RegistryObject<Block> T4_GATE = BLOCKS.register("dieran_gate", DungeonDoor::new);
    public static final RegistryObject<Block> T5_GATE_LOCK = BLOCKS.register("myrkurite_gate_lock", DungeonDoorMyrkuriteLock::new);
    public static final RegistryObject<Block> T5_GATE = BLOCKS.register("myrkurite_gate", DungeonDoor::new);
    public static final RegistryObject<Block> DOOR_STATIC = BLOCKS.register("door_static", DungeonDoorStatic::new);
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

    public static final RegistryObject<Item> SPIKES_ITEM = ITEMS.register("spikes", () -> new BlockItemBase(SPIKES.get()));
    public static final RegistryObject<Item> IRON_GATE_LOCK_ITEM = ITEMS.register("iron_gate_lock", () -> new BlockItemBase(IRON_GATE_LOCK.get()));
    public static final RegistryObject<Item> IRON_GATE_ITEM = ITEMS.register("iron_gate", () -> new BlockItemBase(IRON_GATE.get()));
    public static final RegistryObject<Item> GOLD_GATE_LOCK_ITEM = ITEMS.register("gold_gate_lock", () -> new BlockItemBase(GOLD_GATE_LOCK.get()));
    public static final RegistryObject<Item> GOLD_GATE_ITEM = ITEMS.register("gold_gate", () -> new BlockItemBase(GOLD_GATE.get()));
    public static final RegistryObject<Item> DIAMOND_GATE_LOCK_ITEM = ITEMS.register("diamond_gate_lock", () -> new BlockItemBase(DIAMOND_GATE_LOCK.get()));
    public static final RegistryObject<Item> DIAMOND_GATE_ITEM = ITEMS.register("diamond_gate", () -> new BlockItemBase(DIAMOND_GATE.get()));
    public static final RegistryObject<Item> T1_GATE_LOCK_ITEM = ITEMS.register("lacumite_gate_lock", () -> new BlockItemBase(T1_GATE_LOCK.get()));
    public static final RegistryObject<Item> T1_GATE_ITEM = ITEMS.register("lacumite_gate", () -> new BlockItemBase(T1_GATE.get()));
    public static final RegistryObject<Item> T2_GATE_LOCK_ITEM = ITEMS.register("fossenium_gate_lock", () -> new BlockItemBase(T2_GATE_LOCK.get()));
    public static final RegistryObject<Item> T2_GATE_ITEM = ITEMS.register("fossenium_gate", () -> new BlockItemBase(T2_GATE.get()));
    public static final RegistryObject<Item> T3_GATE_LOCK_ITEM = ITEMS.register("jamanite_gate_lock", () -> new BlockItemBase(T3_GATE_LOCK.get()));
    public static final RegistryObject<Item> T3_GATE_ITEM = ITEMS.register("jamanite_gate", () -> new BlockItemBase(T3_GATE.get()));
    public static final RegistryObject<Item> T4_GATE_LOCK_ITEM = ITEMS.register("dieran_gate_lock", () -> new BlockItemBase(T4_GATE_LOCK.get()));
    public static final RegistryObject<Item> T4_GATE_ITEM = ITEMS.register("dieran_gate", () -> new BlockItemBase(T4_GATE.get()));
    public static final RegistryObject<Item> T5_GATE_LOCK_ITEM = ITEMS.register("myrkurite_gate_lock", () -> new BlockItemBase(T5_GATE_LOCK.get()));
    public static final RegistryObject<Item> T5_GATE_ITEM = ITEMS.register("myrkurite_gate", () -> new BlockItemBase(T5_GATE.get()));
    //Entities (MOBS + SPAWN EGG + Their Sounds Under Them)

    public static final RegistryObject<EntityType<ShroomRedEntity>> SHROOM_RED_ENTITY = ENTITY_TYPES.register("shroom_red_entity", () -> EntityType.Builder.<ShroomRedEntity>create(ShroomRedEntity::new, EntityClassification.MONSTER)
            .size(0.6f,0.6f)
            .setTrackingRange(16)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "shroom_red_entity").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> SHROOM_RED_EGG = ITEMS.register("shroom_red_egg", () -> new ModdedSpawnEggItem(SHROOM_RED_ENTITY, 0xeb4034, 0xfff8e6, new Item.Properties().group(ElegantDungeons.TAB)));



    public static final RegistryObject<EntityType<ShroomBrownEntity>> SHROOM_BROWN_ENTITY = ENTITY_TYPES.register("shroom_brown_entity", () -> EntityType.Builder.<ShroomBrownEntity>create(ShroomBrownEntity::new, EntityClassification.MONSTER)
            .size(0.6f,0.6f)
            .setTrackingRange(16)
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
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "lacumite_golem").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> LACUMITE_GOLEM_EGG = ITEMS.register("lacumite_golem_egg", () -> new ModdedSpawnEggItem(LACUMITE_GOLEM, 0x9f7a66, 0xff9c75, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> GOLEM_AMBIENT = SOUNDS.register("entity.golem.ambient",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.golem.ambient")));
    public static final RegistryObject<SoundEvent> GOLEM_DEATH = SOUNDS.register("entity.golem.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.golem.death")));
    public static final RegistryObject<SoundEvent> GOLEM_HURT = SOUNDS.register("entity.golem.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.golem.hurt")));



    public static final RegistryObject<EntityType<Rageroot>> RAGEROOT = ENTITY_TYPES.register("rageroot", () -> EntityType.Builder.<Rageroot>create(Rageroot::new, EntityClassification.MONSTER)
            .size(1.0f,2.6f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "rageroot").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> RAGEROOT_EGG = ITEMS.register("rageroot_egg", () -> new ModdedSpawnEggItem(RAGEROOT, 0x563c25, 0x3d9a3a, new Item.Properties().group(ElegantDungeons.TAB)));



    public static final RegistryObject<EntityType<Duckin>> DUCKIN = ENTITY_TYPES.register("duckin", () -> EntityType.Builder.<Duckin>create(Duckin::new, EntityClassification.MONSTER)
            .size(1.0f,2.0f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "duckin").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> DUCKIN_EGG = ITEMS.register("duckin_egg", () -> new ModdedSpawnEggItem(DUCKIN, 0xffffff, 0xff6f00, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> DUCKIN_AMBIENT = SOUNDS.register("entity.duckin.ambient",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.duckin.ambient")));
    public static final RegistryObject<SoundEvent> DUCKIN_DEATH = SOUNDS.register("entity.duckin.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.duckin.death")));
    public static final RegistryObject<SoundEvent> DUCKIN_HURT = SOUNDS.register("entity.duckin.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.duckin.hurt")));



    public static final RegistryObject<EntityType<Frog>> FROG = ENTITY_TYPES.register("frog", () -> EntityType.Builder.<Frog>create(Frog::new, EntityClassification.AMBIENT)
            .size(0.3f,0.3f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "frog").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> FROG_EGG = ITEMS.register("frog_egg", () -> new ModdedSpawnEggItem(FROG, 0x4aac82, 0x2f9167, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<EntityType<Imple>> IMPLE = ENTITY_TYPES.register("imple", () -> EntityType.Builder.<Imple>create(Imple::new, EntityClassification.CREATURE)
            .size(0.5f,0.5f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "imple").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> IMPLE_EGG = ITEMS.register("imple_egg", () -> new ModdedSpawnEggItem(IMPLE, 0x4aac82, 0x870002, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> IMPLE_DEATH = SOUNDS.register("entity.imple.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.imple.death")));
    public static final RegistryObject<SoundEvent> IMPLE_HURT = SOUNDS.register("entity.imple.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.imple.hurt")));
    // ENCHANTMENTS

    public static final RegistryObject<Enchantment> LOPSIDEDNESS_CURSE = ENCHANTMENTS.register("curse_of_lopsidedness", () -> new LopsidednessCurseEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] {EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> UNCOMFORTABILITY_CURSE = ENCHANTMENTS.register("curse_of_uncomfortability", () -> new UncomfortabilityCurseEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] {EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> DENSENESS_CURSE = ENCHANTMENTS.register("curse_of_denseness", () -> new DensenessCurseEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] {EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> DUNE_STRIDER = ENCHANTMENTS.register("dune_strider", () -> new DuneStriderEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> REVERB = ENCHANTMENTS.register("reverb", () -> new ReverbEnchantment(Enchantment.Rarity.RARE, EnchantmentType.create("shields", item -> item.equals(Items.SHIELD)), new EquipmentSlotType[] {EquipmentSlotType.OFFHAND,EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> HEAT_SIGIL = ENCHANTMENTS.register("heat_sigil", () -> new HeatSigilEnchantment(Enchantment.Rarity.RARE, EnchantmentType.create("shields", item -> item.equals(Items.SHIELD)), new EquipmentSlotType[] {EquipmentSlotType.OFFHAND,EquipmentSlotType.MAINHAND}));
    
}
