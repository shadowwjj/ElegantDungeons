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
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.item.Items.BUCKET;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ElegantDungeons.MOD_ID);
    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, ElegantDungeons.MOD_ID);
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
    public static final RegistryObject<Item> T1_CRYSTAL_REFINED = ITEMS.register("t1_crystal_refined", ItemBase::new);
    public static final RegistryObject<Item> T2_CRYSTAL_REFINED = ITEMS.register("t2_crystal_refined", ItemBase::new);
    public static final RegistryObject<Item> T3_CRYSTAL_REFINED = ITEMS.register("t3_crystal_refined", ItemBase::new);
    public static final RegistryObject<Item> T4_CRYSTAL_REFINED = ITEMS.register("t4_crystal_refined", ItemBase::new);
    public static final RegistryObject<Item> T5_CRYSTAL_REFINED = ITEMS.register("t5_crystal_refined", ItemBase::new);
    public static final RegistryObject<Item> TAR_BUCKET= ITEMS.register("tar_bucket", () -> { return new BucketItem(RegistryHandler.DUNGEON_TAR_SOURCE, (new Item.Properties()).containerItem(BUCKET).maxStackSize(1).group(ItemGroup.MISC));});
    public static final RegistryObject<Item> MORPHIUM_INGOT = ITEMS.register("morphium_ingot", ItemBase::new);
    public static final RegistryObject<Item> MORPHIUM_ROD = ITEMS.register("morphium_rod", ItemBase::new);
    public static final RegistryObject<Item> MYSTIC_BRANCH = ITEMS.register("mystic_branch", ItemBase::new);
    public static final RegistryObject<Item> FROG_BISCUIT = ITEMS.register("frog_biscuit", ItemBase::new);
    public static final RegistryObject<Item> ROSE_PEARL = ITEMS.register("rose_pearl", ItemBase::new);
    public static final RegistryObject<Item> RELIC_SHARD = ITEMS.register("relic_shard", ItemBase::new);
    public static final RegistryObject<Item> CRYSTAL_BUBBLE = ITEMS.register("crystal_bubble", ItemBase::new);
    public static final RegistryObject<Item> NEWT_EYE = ITEMS.register("newt_eye", ItemBase::new);
    public static final RegistryObject<Item> TINFOIL = ITEMS.register("tinfoil", ItemBase::new);
    public static final RegistryObject<Item> SEA_STRING = ITEMS.register("sea_string", ItemBase::new);


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
        return new BaseSword(DungItemTiers.LACUMITESWORD,-2.4F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> FOSSENIUM_SWORD = ITEMS.register("fossenium_sword", () -> {
        return new BaseSword(DungItemTiers.FOSSENIUMSWORD,-2.4F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> JAMANITE_SWORD = ITEMS.register("jamanite_sword", () -> {
        return new BaseSword(DungItemTiers.JAMANITESWORD,-2.4F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> DIERAN_SWORD = ITEMS.register("dieran_sword", () -> {
        return new BaseSword(DungItemTiers.DIERANSWORD,-2.4F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> MYRKURITE_SWORD = ITEMS.register("myrkurite_sword", () -> {
        return new BaseSword(DungItemTiers.MYRKURITESWORD,-2.4F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> CHUNCHUNMARU = ITEMS.register("chunchunmaru", () -> {
        return new BaseSword(DungItemTiers.CHUNCHUNMARU,-1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> CORNSWORD = ITEMS.register("corn_sword", () -> {
        return new BaseSword(DungItemTiers.CORNSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> JADEBLADE = ITEMS.register("jade_blade", () -> {
        return new BaseSword(DungItemTiers.JADEBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> EBONYBLADE = ITEMS.register("ebony_blade", () -> {
        return new BaseSword(DungItemTiers.EBONYBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> CRESCENTCUTLASS = ITEMS.register("crescent_cutlass", () -> {
        return new BaseSword(DungItemTiers.CRESCENTCUTLASS,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> FLAMENCOSWORD = ITEMS.register("flamenco_sword", () -> {
        return new BaseSword(DungItemTiers.FLAMENCOSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> MORPHIUMROSEBLADE = ITEMS.register("morphium_roseblade", () -> {
        return new BaseSword(DungItemTiers.MORPHIUMROSEBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> SLAPSTICK = ITEMS.register("slapstick", () -> {
        return new SlapStick(DungItemTiers.SLAPSTICK,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> SKELETAL_SWORD = ITEMS.register("skeletal_sword", () -> {
        return new BaseSword(DungItemTiers.SKELETALSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> SACRED_SWORD = ITEMS.register("sacred_sword", () -> {
        return new BaseSword(DungItemTiers.SACREDSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> GRASS_BLASE = ITEMS.register("grass_blade", () -> {
        return new BaseSword(DungItemTiers.GRASSBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> CRYSTALLINE_SWORD = ITEMS.register("crystalline_sword", () -> {
        return new BaseSword(DungItemTiers.CRYSTALLINESWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> FORTUNE_SWORD = ITEMS.register("fortune_sword", () -> {
        return new BaseSword(DungItemTiers.FORTUNESWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> ENDEROUS_SWORD = ITEMS.register("enderous_sword", () -> {
        return new EnderousSword(DungItemTiers.ENDEROUSSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> FATE_SLAYER = ITEMS.register("fate_slayer", () -> {
        return new BaseSword(DungItemTiers.FATESLAYER,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> DEMONIC_SWORD = ITEMS.register("demonic_sword", () -> {
        return new DemonicSword(DungItemTiers.DEMONICSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> BEAST_BLADE = ITEMS.register("beast_blade", () -> {
        return new BaseSword(DungItemTiers.BEASTBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> SCISSOR_SWORD = ITEMS.register("scissor_sword", () -> {
        return new BaseSword(DungItemTiers.SCISSORSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> ROOT_RIPPER = ITEMS.register("root_ripper", () -> {
        return new BaseSword(DungItemTiers.ROOTRIPPER,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> BUTTER_SWORD = ITEMS.register("butter_sword", () -> {
        return new ButterSword(DungItemTiers.BUTTERSWORD,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> SEA_SLASHER = ITEMS.register("sea_slasher", () -> {
        return new BaseSword(DungItemTiers.SEASLASHER,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> FEYBLADE = ITEMS.register("feyblade", () -> {
        return new Feyblade(DungItemTiers.FEYBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> JESTER_BESTER = ITEMS.register("jester_bester", () -> {
        return new BaseSword(DungItemTiers.JESTERBESTER,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> VIBRANT_RAPIER = ITEMS.register("vibrant_rapier", () -> {
        return new BaseSword(DungItemTiers.VIBRANTRAPIER,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> SNAKE_FANG = ITEMS.register("snake_fang", () -> {
        return new SnakeFang(DungItemTiers.SNAKEFANG,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> HEAT_HOOK = ITEMS.register("heat_hook", () -> {
        return new BaseSword(DungItemTiers.HEATHOOK,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});

    public static final RegistryObject<Item> NEEDLE_BLADE = ITEMS.register("needle_blade", () -> {
        return new BaseSword(DungItemTiers.NEEDLEBLADE,-3.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB));});
    // Bows & Custom Arrow Entities

    public static final RegistryObject<Item> LACUMITE_BOW = ITEMS.register("lacumite_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> FOSSENIUM_BOW = ITEMS.register("fossenium_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> JAMANITE_BOW = ITEMS.register("jamanite_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> DIERAN_BOW = ITEMS.register("dieran_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> MYRKURITE_BOW = ITEMS.register("myrkurite_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> CRYSTALLINE_BOW = ITEMS.register("crystalline_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> RADIANT_BOW = ITEMS.register("radiant_bow", () -> {
        return new RadiantBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<EntityType<RadiantArrowEntity>> RADIANT_ARROW = ENTITY_TYPES.register("radiant_arrow", () -> EntityType.Builder.<RadiantArrowEntity>create(RadiantArrowEntity::new,EntityClassification.MISC).size(0.5F,0.5F)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "radiant_arrow").toString()));

    public static final RegistryObject<Item> VAMPIRE_BOW = ITEMS.register("vampire_bow", () -> {
        return new VampireBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<EntityType<BloodArrowEntity>> BLOOD_ARROW = ENTITY_TYPES.register("blood_arrow", () -> EntityType.Builder.<BloodArrowEntity>create(BloodArrowEntity::new,EntityClassification.MISC).size(0.5F,0.5F)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "blood_arrow").toString()));

    public static final RegistryObject<Item> BLOWGUN = ITEMS.register("blowgun", () -> {
        return new Blowgun(DungItemTiers.BASE_BOW,2.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<EntityType<BlowgunProjectileEntity>> BLOWGUN_PROJECTILE = ENTITY_TYPES.register("blowgun_projectile", () -> EntityType.Builder.<BlowgunProjectileEntity>create(BlowgunProjectileEntity::new,EntityClassification.MISC).size(0.5F,0.5F)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "blowgun_projectile").toString()));

    public static final RegistryObject<Item> CELEBRINATOR = ITEMS.register("celebrinator", () -> {
        return new Celebrinator(DungItemTiers.BASE_BOW,2.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> SKELETAL_BOW = ITEMS.register("skeletal_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> BEJEWELED_BOW = ITEMS.register("bejeweled_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> BLACK_BOW = ITEMS.register("black_bow", () -> {
        return new BlackBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<EntityType<BlackArrowEntity>> BLACK_ARROW = ENTITY_TYPES.register("black_arrow", () -> EntityType.Builder.<BlackArrowEntity>create(BlackArrowEntity::new,EntityClassification.MISC).size(0.5F,0.5F)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "black_arrow").toString()));

    public static final RegistryObject<Item> ROOT_BOW = ITEMS.register("root_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> SPECTRAL_BOW = ITEMS.register("spectral_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> ELVEN_BOW = ITEMS.register("elven_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> BULLHORN_BOW = ITEMS.register("bullhorn_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> FROSTBITE_BOW = ITEMS.register("frostbite_bow", () -> {
        return new FrostbiteBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<EntityType<FrostArrowEntity>> FROST_ARROW = ENTITY_TYPES.register("frost_arrow", () -> EntityType.Builder.<FrostArrowEntity>create(FrostArrowEntity::new,EntityClassification.MISC).size(0.5F,0.5F)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "frost_arrow").toString()));

    public static final RegistryObject<Item> BANANA_BOW = ITEMS.register("banana_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});

    public static final RegistryObject<Item> SUNSET_BOW = ITEMS.register("sunset_bow", () -> {
        return new BaseBow(DungItemTiers.BASE_BOW,1.0F, new Item.Properties().group(ElegantDungeons.WEAPONS_TAB).maxStackSize(1).maxDamage(800));});




    // Armor
    public static final RegistryObject<ArmorItem> LACUMITE_HELMET =ITEMS.register("lacumite_helmet", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> LACUMITE_CHESTPLATE =ITEMS.register("lacumite_chestplate", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> LACUMITE_LEGGINGS =ITEMS.register("lacumite_leggings", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> LACUMITE_BOOTS =ITEMS.register("lacumite_boots", () -> new ArmorItem(DungArmorMaterial.LACUMITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> FOSSENIUM_HELMET =ITEMS.register("fossenium_helmet", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FOSSENIUM_CHESTPLATE =ITEMS.register("fossenium_chestplate", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FOSSENIUM_LEGGINGS =ITEMS.register("fossenium_leggings", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FOSSENIUM_BOOTS =ITEMS.register("fossenium_boots", () -> new ArmorItem(DungArmorMaterial.FOSSENIUM, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> JAMANITE_HELMET =ITEMS.register("jamanite_helmet", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> JAMANITE_CHESTPLATE =ITEMS.register("jamanite_chestplate", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> JAMANITE_LEGGINGS =ITEMS.register("jamanite_leggings", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> JAMANITE_BOOTS =ITEMS.register("jamanite_boots", () -> new ArmorItem(DungArmorMaterial.JAMANITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> DIERAN_HELMET =ITEMS.register("dieran_helmet", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DIERAN_CHESTPLATE =ITEMS.register("dieran_chestplate", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DIERAN_LEGGINGS =ITEMS.register("dieran_leggings", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DIERAN_BOOTS =ITEMS.register("dieran_boots", () -> new ArmorItem(DungArmorMaterial.DIERAN, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> MYRKURITE_HELMET =ITEMS.register("myrkurite_helmet", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MYRKURITE_CHESTPLATE =ITEMS.register("myrkurite_chestplate", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MYRKURITE_LEGGINGS =ITEMS.register("myrkurite_leggings", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MYRKURITE_BOOTS =ITEMS.register("myrkurite_boots", () -> new ArmorItem(DungArmorMaterial.MYRKURITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> FEYRUNE_HELMET =ITEMS.register("feyrune_helmet", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FEYRUNE_CHESTPLATE =ITEMS.register("feyrune_chestplate", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FEYRUNE_LEGGINGS =ITEMS.register("feyrune_leggings", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FEYRUNE_BOOTS =ITEMS.register("feyrune_boots", () -> new ArmorItem(DungArmorMaterial.FEYRUNE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> GUARDIAN_HELMET =ITEMS.register("guardian_helmet", () -> new ArmorItem(DungArmorMaterial.GUARDIAN, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> GUARDIAN_CHESTPLATE =ITEMS.register("guardian_chestplate", () -> new ArmorItem(DungArmorMaterial.GUARDIAN, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> GUARDIAN_LEGGINGS =ITEMS.register("guardian_leggings", () -> new ArmorItem(DungArmorMaterial.GUARDIAN, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> GUARDIAN_BOOTS =ITEMS.register("guardian_boots", () -> new ArmorItem(DungArmorMaterial.GUARDIAN, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> ELDER_GUARDIAN_HELMET =ITEMS.register("elder_guardian_helmet", () -> new ArmorItem(DungArmorMaterial.ELDER_GUARDIAN, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> ELDER_GUARDIAN_CHESTPLATE =ITEMS.register("elder_guardian_chestplate", () -> new ArmorItem(DungArmorMaterial.ELDER_GUARDIAN, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> ELDER_GUARDIAN_LEGGINGS =ITEMS.register("elder_guardian_leggings", () -> new ArmorItem(DungArmorMaterial.ELDER_GUARDIAN, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> ELDER_GUARDIAN_BOOTS =ITEMS.register("elder_guardian_boots", () -> new ArmorItem(DungArmorMaterial.ELDER_GUARDIAN, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> DOLPHIN_HELMET =ITEMS.register("dolphin_helmet", () -> new ArmorItem(DungArmorMaterial.DOLPHIN, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DOLPHIN_CHESTPLATE =ITEMS.register("dolphin_chestplate", () -> new ArmorItem(DungArmorMaterial.DOLPHIN, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DOLPHIN_LEGGINGS =ITEMS.register("dolphin_leggings", () -> new ArmorItem(DungArmorMaterial.DOLPHIN, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DOLPHIN_BOOTS =ITEMS.register("dolphin_boots", () -> new ArmorItem(DungArmorMaterial.DOLPHIN, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> MAGMATIC_HELMET =ITEMS.register("magmatic_helmet", () -> new ArmorItem(DungArmorMaterial.MAGMATIC, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MAGMATIC_CHESTPLATE =ITEMS.register("magmatic_chestplate", () -> new ArmorItem(DungArmorMaterial.MAGMATIC, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MAGMATIC_LEGGINGS =ITEMS.register("magmatic_leggings", () -> new ArmorItem(DungArmorMaterial.MAGMATIC, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MAGMATIC_BOOTS =ITEMS.register("magmatic_boots", () -> new ArmorItem(DungArmorMaterial.MAGMATIC, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> TESLA_HELMET =ITEMS.register("tesla_helmet", () -> new ArmorItem(DungArmorMaterial.TESLA, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> TESLA_CHESTPLATE =ITEMS.register("tesla_chestplate", () -> new ArmorItem(DungArmorMaterial.TESLA, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> TESLA_LEGGINGS =ITEMS.register("tesla_leggings", () -> new ArmorItem(DungArmorMaterial.TESLA, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> TESLA_BOOTS =ITEMS.register("tesla_boots", () -> new ArmorItem(DungArmorMaterial.TESLA, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> MINER_HELMET =ITEMS.register("miner_helmet", () -> new ArmorItem(DungArmorMaterial.MINER, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MINER_CHESTPLATE =ITEMS.register("miner_chestplate", () -> new ArmorItem(DungArmorMaterial.MINER, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MINER_LEGGINGS =ITEMS.register("miner_leggings", () -> new ArmorItem(DungArmorMaterial.MINER, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MINER_BOOTS =ITEMS.register("miner_boots", () -> new ArmorItem(DungArmorMaterial.MINER, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> STEAMPUNK_HELMET =ITEMS.register("steampunk_helmet", () -> new ArmorItem(DungArmorMaterial.STEAMPUNK, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> STEAMPUNK_CHESTPLATE =ITEMS.register("steampunk_chestplate", () -> new ArmorItem(DungArmorMaterial.STEAMPUNK, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> STEAMPUNK_LEGGINGS =ITEMS.register("steampunk_leggings", () -> new ArmorItem(DungArmorMaterial.STEAMPUNK, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> STEAMPUNK_BOOTS =ITEMS.register("steampunk_boots", () -> new ArmorItem(DungArmorMaterial.STEAMPUNK, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> DUCK_HELMET =ITEMS.register("duck_helmet", () -> new ArmorItem(DungArmorMaterial.DUCK, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DUCK_CHESTPLATE =ITEMS.register("duck_chestplate", () -> new ArmorItem(DungArmorMaterial.DUCK, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DUCK_LEGGINGS =ITEMS.register("duck_leggings", () -> new ArmorItem(DungArmorMaterial.DUCK, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DUCK_BOOTS =ITEMS.register("duck_boots", () -> new ArmorItem(DungArmorMaterial.DUCK, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> MOONWALKER_HELMET =ITEMS.register("moonwalker_helmet", () -> new ArmorItem(DungArmorMaterial.MOONWALKER, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MOONWALKER_CHESTPLATE =ITEMS.register("moonwalker_chestplate", () -> new ArmorItem(DungArmorMaterial.MOONWALKER, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MOONWALKER_LEGGINGS =ITEMS.register("moonwalker_leggings", () -> new ArmorItem(DungArmorMaterial.MOONWALKER, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MOONWALKER_BOOTS =ITEMS.register("moonwalker_boots", () -> new ArmorItem(DungArmorMaterial.MOONWALKER, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> DEMONIC_HELMET =ITEMS.register("demonic_helmet", () -> new ArmorItem(DungArmorMaterial.DEMONIC, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DEMONIC_CHESTPLATE =ITEMS.register("demonic_chestplate", () -> new ArmorItem(DungArmorMaterial.DEMONIC, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DEMONIC_LEGGINGS =ITEMS.register("demonic_leggings", () -> new ArmorItem(DungArmorMaterial.DEMONIC, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> DEMONIC_BOOTS =ITEMS.register("demonic_boots", () -> new ArmorItem(DungArmorMaterial.DEMONIC, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> KNIGHT_HELMET =ITEMS.register("knight_helmet", () -> new ArmorItem(DungArmorMaterial.KNIGHT, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> KNIGHT_CHESTPLATE =ITEMS.register("knight_chestplate", () -> new ArmorItem(DungArmorMaterial.KNIGHT, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> KNIGHT_LEGGINGS =ITEMS.register("knight_leggings", () -> new ArmorItem(DungArmorMaterial.KNIGHT, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> KNIGHT_BOOTS =ITEMS.register("knight_boots", () -> new ArmorItem(DungArmorMaterial.KNIGHT, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> SAMURAI_HELMET =ITEMS.register("samurai_helmet", () -> new ArmorItem(DungArmorMaterial.SAMURAI, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SAMURAI_CHESTPLATE =ITEMS.register("samurai_chestplate", () -> new ArmorItem(DungArmorMaterial.SAMURAI, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SAMURAI_LEGGINGS =ITEMS.register("samurai_leggings", () -> new ArmorItem(DungArmorMaterial.SAMURAI, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SAMURAI_BOOTS =ITEMS.register("samurai_boots", () -> new ArmorItem(DungArmorMaterial.SAMURAI, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> ROGUE_HELMET =ITEMS.register("rogue_helmet", () -> new ArmorItem(DungArmorMaterial.ROGUE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> ROGUE_CHESTPLATE =ITEMS.register("rogue_chestplate", () -> new ArmorItem(DungArmorMaterial.ROGUE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> ROGUE_LEGGINGS =ITEMS.register("rogue_leggings", () -> new ArmorItem(DungArmorMaterial.ROGUE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> ROGUE_BOOTS =ITEMS.register("rogue_boots", () -> new ArmorItem(DungArmorMaterial.ROGUE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> FIREFLY_HELMET =ITEMS.register("firefly_helmet", () -> new ArmorItem(DungArmorMaterial.FIREFLY, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FIREFLY_CHESTPLATE =ITEMS.register("firefly_chestplate", () -> new ArmorItem(DungArmorMaterial.FIREFLY, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FIREFLY_LEGGINGS =ITEMS.register("firefly_leggings", () -> new ArmorItem(DungArmorMaterial.FIREFLY, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> FIREFLY_BOOTS =ITEMS.register("firefly_boots", () -> new ArmorItem(DungArmorMaterial.FIREFLY, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> RAT_HELMET =ITEMS.register("rat_helmet", () -> new ArmorItem(DungArmorMaterial.RAT, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> RAT_CHESTPLATE =ITEMS.register("rat_chestplate", () -> new ArmorItem(DungArmorMaterial.RAT, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> RAT_LEGGINGS =ITEMS.register("rat_leggings", () -> new ArmorItem(DungArmorMaterial.RAT, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> RAT_BOOTS =ITEMS.register("rat_boots", () -> new ArmorItem(DungArmorMaterial.RAT, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> SKELETAL_HELMET =ITEMS.register("skeletal_helmet", () -> new ArmorItem(DungArmorMaterial.SKELETAL, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SKELETAL_CHESTPLATE =ITEMS.register("skeletal_chestplate", () -> new ArmorItem(DungArmorMaterial.SKELETAL, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SKELETAL_LEGGINGS =ITEMS.register("skeletal_leggings", () -> new ArmorItem(DungArmorMaterial.SKELETAL, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SKELETAL_BOOTS =ITEMS.register("skeletal_boots", () -> new ArmorItem(DungArmorMaterial.SKELETAL, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> POLAR_HELMET =ITEMS.register("polar_helmet", () -> new ArmorItem(DungArmorMaterial.POLAR, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> POLAR_CHESTPLATE =ITEMS.register("polar_chestplate", () -> new ArmorItem(DungArmorMaterial.POLAR, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> POLAR_LEGGINGS =ITEMS.register("polar_leggings", () -> new ArmorItem(DungArmorMaterial.POLAR, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> POLAR_BOOTS =ITEMS.register("polar_boots", () -> new ArmorItem(DungArmorMaterial.POLAR, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> MUSHROOM_HELMET =ITEMS.register("mushroom_helmet", () -> new ArmorItem(DungArmorMaterial.MUSHROOM, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MUSHROOM_CHESTPLATE =ITEMS.register("mushroom_chestplate", () -> new ArmorItem(DungArmorMaterial.MUSHROOM, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MUSHROOM_LEGGINGS =ITEMS.register("mushroom_leggings", () -> new ArmorItem(DungArmorMaterial.MUSHROOM, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> MUSHROOM_BOOTS =ITEMS.register("mushroom_boots", () -> new ArmorItem(DungArmorMaterial.MUSHROOM, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> INVISIBLE_HELMET =ITEMS.register("invisible_helmet", () -> new ArmorItem(DungArmorMaterial.INVISIBLE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> INVISIBLE_CHESTPLATE =ITEMS.register("invisible_chestplate", () -> new ArmorItem(DungArmorMaterial.INVISIBLE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> INVISIBLE_LEGGINGS =ITEMS.register("invisible_leggings", () -> new ArmorItem(DungArmorMaterial.INVISIBLE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> INVISIBLE_BOOTS =ITEMS.register("invisible_boots", () -> new ArmorItem(DungArmorMaterial.INVISIBLE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> PEARL_HELMET =ITEMS.register("pearl_helmet", () -> new ArmorItem(DungArmorMaterial.PEARL, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> PEARL_CHESTPLATE =ITEMS.register("pearl_chestplate", () -> new ArmorItem(DungArmorMaterial.PEARL, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> PEARL_LEGGINGS =ITEMS.register("pearl_leggings", () -> new ArmorItem(DungArmorMaterial.PEARL, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> PEARL_BOOTS =ITEMS.register("pearl_boots", () -> new ArmorItem(DungArmorMaterial.PEARL, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> CREEPER_HELMET =ITEMS.register("creeper_helmet", () -> new ArmorItem(DungArmorMaterial.CREEPER, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CREEPER_CHESTPLATE =ITEMS.register("creeper_chestplate", () -> new ArmorItem(DungArmorMaterial.CREEPER, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CREEPER_LEGGINGS =ITEMS.register("creeper_leggings", () -> new ArmorItem(DungArmorMaterial.CREEPER, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CREEPER_BOOTS =ITEMS.register("creeper_boots", () -> new ArmorItem(DungArmorMaterial.CREEPER, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> RAINBOW_HELMET =ITEMS.register("rainbow_helmet", () -> new ArmorItem(DungArmorMaterial.RAINBOW, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> RAINBOW_CHESTPLATE =ITEMS.register("rainbow_chestplate", () -> new ArmorItem(DungArmorMaterial.RAINBOW, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> RAINBOW_LEGGINGS =ITEMS.register("rainbow_leggings", () -> new ArmorItem(DungArmorMaterial.RAINBOW, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> RAINBOW_BOOTS =ITEMS.register("rainbow_boots", () -> new ArmorItem(DungArmorMaterial.RAINBOW, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> SAILOR_HELMET =ITEMS.register("sailor_helmet", () -> new ArmorItem(DungArmorMaterial.SAILOR, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SAILOR_CHESTPLATE =ITEMS.register("sailor_chestplate", () -> new ArmorItem(DungArmorMaterial.SAILOR, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SAILOR_LEGGINGS =ITEMS.register("sailor_leggings", () -> new ArmorItem(DungArmorMaterial.SAILOR, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SAILOR_BOOTS =ITEMS.register("sailor_boots", () -> new ArmorItem(DungArmorMaterial.SAILOR, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> CRYSTALLINE_HELMET =ITEMS.register("crystalline_helmet", () -> new ArmorItem(DungArmorMaterial.CRYSTALLINE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CRYSTALLINE_CHESTPLATE =ITEMS.register("crystalline_chestplate", () -> new ArmorItem(DungArmorMaterial.CRYSTALLINE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CRYSTALLINE_LEGGINGS =ITEMS.register("crystalline_leggings", () -> new ArmorItem(DungArmorMaterial.CRYSTALLINE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CRYSTALLINE_BOOTS =ITEMS.register("crystalline_boots", () -> new ArmorItem(DungArmorMaterial.CRYSTALLINE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> METEORITE_HELMET =ITEMS.register("meteorite_helmet", () -> new ArmorItem(DungArmorMaterial.METEORITE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> METEORITE_CHESTPLATE =ITEMS.register("meteorite_chestplate", () -> new ArmorItem(DungArmorMaterial.METEORITE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> METEORITE_LEGGINGS =ITEMS.register("meteorite_leggings", () -> new ArmorItem(DungArmorMaterial.METEORITE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> METEORITE_BOOTS =ITEMS.register("meteorite_boots", () -> new ArmorItem(DungArmorMaterial.METEORITE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> AMBER_HELMET =ITEMS.register("amber_helmet", () -> new ArmorItem(DungArmorMaterial.AMBER, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> AMBER_CHESTPLATE =ITEMS.register("amber_chestplate", () -> new ArmorItem(DungArmorMaterial.AMBER, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> AMBER_LEGGINGS =ITEMS.register("amber_leggings", () -> new ArmorItem(DungArmorMaterial.AMBER, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> AMBER_BOOTS =ITEMS.register("amber_boots", () -> new ArmorItem(DungArmorMaterial.AMBER, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> SCALE_HELMET =ITEMS.register("scale_helmet", () -> new ArmorItem(DungArmorMaterial.SCALE, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SCALE_CHESTPLATE =ITEMS.register("scale_chestplate", () -> new ArmorItem(DungArmorMaterial.SCALE, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SCALE_LEGGINGS =ITEMS.register("scale_leggings", () -> new ArmorItem(DungArmorMaterial.SCALE, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SCALE_BOOTS =ITEMS.register("scale_boots", () -> new ArmorItem(DungArmorMaterial.SCALE, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> SWIFT_HELMET =ITEMS.register("swift_helmet", () -> new ArmorItem(DungArmorMaterial.SWIFT, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SWIFT_CHESTPLATE =ITEMS.register("swift_chestplate", () -> new ArmorItem(DungArmorMaterial.SWIFT, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SWIFT_LEGGINGS =ITEMS.register("swift_leggings", () -> new ArmorItem(DungArmorMaterial.SWIFT, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> SWIFT_BOOTS =ITEMS.register("swift_boots", () -> new ArmorItem(DungArmorMaterial.SWIFT, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> PUFFERFISH_HELMET =ITEMS.register("pufferfish_helmet", () -> new ArmorItem(DungArmorMaterial.PUFFERFISH, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> PUFFERFISH_CHESTPLATE =ITEMS.register("pufferfish_chestplate", () -> new ArmorItem(DungArmorMaterial.PUFFERFISH, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> PUFFERFISH_LEGGINGS =ITEMS.register("pufferfish_leggings", () -> new ArmorItem(DungArmorMaterial.PUFFERFISH, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> PUFFERFISH_BOOTS =ITEMS.register("pufferfish_boots", () -> new ArmorItem(DungArmorMaterial.PUFFERFISH, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> OVERGROWTH_HELMET =ITEMS.register("overgrowth_helmet", () -> new ArmorItem(DungArmorMaterial.OVERGROWTH, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> OVERGROWTH_CHESTPLATE =ITEMS.register("overgrowth_chestplate", () -> new ArmorItem(DungArmorMaterial.OVERGROWTH, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> OVERGROWTH_LEGGINGS =ITEMS.register("overgrowth_leggings", () -> new ArmorItem(DungArmorMaterial.OVERGROWTH, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> OVERGROWTH_BOOTS =ITEMS.register("overgrowth_boots", () -> new ArmorItem(DungArmorMaterial.OVERGROWTH, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> WITHER_HELMET =ITEMS.register("wither_helmet", () -> new ArmorItem(DungArmorMaterial.WITHER, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> WITHER_CHESTPLATE =ITEMS.register("wither_chestplate", () -> new ArmorItem(DungArmorMaterial.WITHER, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> WITHER_LEGGINGS =ITEMS.register("wither_leggings", () -> new ArmorItem(DungArmorMaterial.WITHER, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> WITHER_BOOTS =ITEMS.register("wither_boots", () -> new ArmorItem(DungArmorMaterial.WITHER, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> CLOUD_HELMET =ITEMS.register("cloud_helmet", () -> new ArmorItem(DungArmorMaterial.CLOUD, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CLOUD_CHESTPLATE =ITEMS.register("cloud_chestplate", () -> new ArmorItem(DungArmorMaterial.CLOUD, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CLOUD_LEGGINGS =ITEMS.register("cloud_leggings", () -> new ArmorItem(DungArmorMaterial.CLOUD, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CLOUD_BOOTS =ITEMS.register("cloud_boots", () -> new ArmorItem(DungArmorMaterial.CLOUD, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> OCELOT_HELMET =ITEMS.register("ocelot_helmet", () -> new ArmorItem(DungArmorMaterial.OCELOT, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> OCELOT_CHESTPLATE =ITEMS.register("ocelot_chestplate", () -> new ArmorItem(DungArmorMaterial.OCELOT, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> OCELOT_LEGGINGS =ITEMS.register("ocelot_leggings", () -> new ArmorItem(DungArmorMaterial.OCELOT, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> OCELOT_BOOTS =ITEMS.register("ocelot_boots", () -> new ArmorItem(DungArmorMaterial.OCELOT, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

    public static final RegistryObject<ArmorItem> CLOWN_HELMET =ITEMS.register("clown_helmet", () -> new ArmorItem(DungArmorMaterial.CLOWN, EquipmentSlotType.HEAD, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CLOWN_CHESTPLATE =ITEMS.register("clown_chestplate", () -> new ArmorItem(DungArmorMaterial.CLOWN, EquipmentSlotType.CHEST, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CLOWN_LEGGINGS =ITEMS.register("clown_leggings", () -> new ArmorItem(DungArmorMaterial.CLOWN, EquipmentSlotType.LEGS, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));
    public static final RegistryObject<ArmorItem> CLOWN_BOOTS =ITEMS.register("clown_boots", () -> new ArmorItem(DungArmorMaterial.CLOWN, EquipmentSlotType.FEET, new Item.Properties().group(ElegantDungeons.ARMOR_TAB)));

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

    public static final ResourceLocation DUNGEON_TAR_SOURCE_IMG = new ResourceLocation(ElegantDungeons.MOD_ID, "blocks/tar_still");
    public static final ResourceLocation DUNGEON_TAR_FLOWING_IMG = new ResourceLocation(ElegantDungeons.MOD_ID, "blocks/tar_flow");
    public static final ResourceLocation DUNGEON_TAR_OVERLAY_IMG = new ResourceLocation(ElegantDungeons.MOD_ID, "blocks/tar_overlay");
    public static final RegistryObject<FlowingFluid> DUNGEON_TAR_SOURCE = FLUIDS.register("dungeon_tar_source", () -> new ForgeFlowingFluid.Source(RegistryHandler.DUNGEON_TAR));
    public static final RegistryObject<FlowingFluid> DUNGEON_TAR_FLOWING = FLUIDS.register("dungeon_tar_flowing", () -> new ForgeFlowingFluid.Flowing(RegistryHandler.DUNGEON_TAR));
    public static final ForgeFlowingFluid.Properties DUNGEON_TAR = new ForgeFlowingFluid.Properties(() -> DUNGEON_TAR_SOURCE.get(), () -> DUNGEON_TAR_FLOWING.get(), FluidAttributes.builder(DUNGEON_TAR_SOURCE_IMG, DUNGEON_TAR_FLOWING_IMG).density(5).luminosity(0).temperature(1).sound(SoundEvents.ITEM_BUCKET_FILL_LAVA).overlay(DUNGEON_TAR_OVERLAY_IMG)).block(()-> RegistryHandler.DUNGEON_TAR_BLOCK.get());
    public static final RegistryObject<FlowingFluidBlock> DUNGEON_TAR_BLOCK = BLOCKS.register("dungeon_tar", () -> new FlowingFluidBlock(() -> RegistryHandler.DUNGEON_TAR_SOURCE.get(), Block.Properties.create(Material.LAVA).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops()));



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

    public static final RegistryObject<EntityType<Rat>> RAT = ENTITY_TYPES.register("rat", () -> EntityType.Builder.<Rat>create(Rat::new, EntityClassification.MONSTER)
            .size(1.0f,0.5f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "rat").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> RAT_EGG = ITEMS.register("rat_egg", () -> new ModdedSpawnEggItem(RAT, 0x633e2e, 0xff9c75, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<EntityType<VoidWalker>> VOIDWALKER = ENTITY_TYPES.register("voidwalker", () -> EntityType.Builder.<VoidWalker>create(VoidWalker::new, EntityClassification.MONSTER)
            .size(0.7f,1.5f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "voidwalker").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> VOIDWALKER_EGG = ITEMS.register("voidwalker_egg", () -> new ModdedSpawnEggItem(VOIDWALKER, 0x000000, 0xffffff, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> VOIDWALKER_DEATH = SOUNDS.register("entity.voidwalker.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.voidwalker.death")));

    public static final RegistryObject<EntityType<Otamakin>> OTAMAKIN = ENTITY_TYPES.register("otamakin", () -> EntityType.Builder.<Otamakin>create(Otamakin::new, EntityClassification.MONSTER)
            .size(0.8f,1.7f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "otamakin").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> OTAMAKIN_EGG = ITEMS.register("otamakin_egg", () -> new ModdedSpawnEggItem(OTAMAKIN, 0x34e5ff, 0x4f4f4f, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> OTAMAKIN_AMBIENT = SOUNDS.register("entity.otamakin.ambient",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.otamakin.ambient")));
    public static final RegistryObject<SoundEvent> OTAMAKIN_DEATH = SOUNDS.register("entity.otamakin.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.otamakin.death")));
    public static final RegistryObject<SoundEvent> OTAMAKIN_HURT = SOUNDS.register("entity.otamakin.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.otamakin.hurt")));

    public static final RegistryObject<EntityType<Byx>> BYX = ENTITY_TYPES.register("byx", () -> EntityType.Builder.<Byx>create(Byx::new, EntityClassification.MONSTER)
            .size(0.4f,0.7f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "byx").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> BYX_EGG = ITEMS.register("byx_egg", () -> new ModdedSpawnEggItem(BYX, 0xb4a394, 0xe199cc, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> BYX_AMBIENT = SOUNDS.register("entity.byx.ambient",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.byx.ambient")));
    public static final RegistryObject<SoundEvent> BYX_DEATH = SOUNDS.register("entity.byx.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.byx.death")));
    public static final RegistryObject<SoundEvent> BYX_HURT = SOUNDS.register("entity.byx.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.byx.hurt")));

    public static final RegistryObject<EntityType<LacumiteGolem>> LACUMITE_GOLEM = ENTITY_TYPES.register("lacumite_golem", () -> EntityType.Builder.<LacumiteGolem>create(LacumiteGolem::new, EntityClassification.MONSTER)
            .size(1.0f,2.0f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "lacumite_golem").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> LACUMITE_GOLEM_EGG = ITEMS.register("lacumite_golem_egg", () -> new ModdedSpawnEggItem(LACUMITE_GOLEM, 0x9f7a66, 0xff9c75, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<EntityType<LacumiteSeeker>> LACUMITE_SEEKER = ENTITY_TYPES.register("lacumite_seeker", () -> EntityType.Builder.<LacumiteSeeker>create(LacumiteSeeker::new, EntityClassification.MONSTER)
            .size(1.0f,2.0f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "lacumite_seeker").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> LACUMITE_SEEKER_EGG = ITEMS.register("lacumite_seeker_egg", () -> new ModdedSpawnEggItem(LACUMITE_SEEKER, 0x9f7a66, 0xff9c75, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<EntityType<LacumiteBallProjectile>> MAGIC_BALL = ENTITY_TYPES.register("lacumite_ball", () -> EntityType.Builder.<LacumiteBallProjectile>create(LacumiteBallProjectile::new,EntityClassification.MISC).size(0.25F,0.25F)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "lacumite_ball").toString()));

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
    public static final RegistryObject<ModdedSpawnEggItem> IMPLE_EGG = ITEMS.register("imple_egg", () -> new ModdedSpawnEggItem(IMPLE, 0x6b0000, 0x870002, new Item.Properties().group(ElegantDungeons.TAB)));

    public static final RegistryObject<SoundEvent> IMPLE_DEATH = SOUNDS.register("entity.imple.death",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.imple.death")));
    public static final RegistryObject<SoundEvent> IMPLE_HURT = SOUNDS.register("entity.imple.hurt",
            () -> new SoundEvent(new ResourceLocation(ElegantDungeons.MOD_ID, "entity.imple.hurt")));


    public static final RegistryObject<EntityType<LivingExperienceEntity>> LIVING_EXPERIENCE = ENTITY_TYPES.register("living_experience", () -> EntityType.Builder.<LivingExperienceEntity>create(LivingExperienceEntity::new, EntityClassification.CREATURE)
            .size(1.0f,1.0f)
            .setTrackingRange(32)
            .build(new ResourceLocation(ElegantDungeons.MOD_ID, "living_experience").toString()));
    public static final RegistryObject<ModdedSpawnEggItem> LIVING_EXPERIENCE_EGG = ITEMS.register("living_experience_egg", () -> new ModdedSpawnEggItem(LIVING_EXPERIENCE, 0xc4f607, 0xffffff, new Item.Properties().group(ElegantDungeons.TAB)));


    // ENCHANTMENTS

    public static final RegistryObject<Enchantment> LOPSIDEDNESS_CURSE = ENCHANTMENTS.register("curse_of_lopsidedness", () -> new LopsidednessCurseEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] {EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> UNCOMFORTABILITY_CURSE = ENCHANTMENTS.register("curse_of_uncomfortability", () -> new UncomfortabilityCurseEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] {EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> DENSENESS_CURSE = ENCHANTMENTS.register("curse_of_denseness", () -> new DensenessCurseEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR, new EquipmentSlotType[] {EquipmentSlotType.HEAD, EquipmentSlotType.CHEST, EquipmentSlotType.LEGS, EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> DUNE_STRIDER = ENCHANTMENTS.register("dune_strider", () -> new DuneStriderEnchantment(Enchantment.Rarity.RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}));
    public static final RegistryObject<Enchantment> REVERB = ENCHANTMENTS.register("reverb", () -> new ReverbEnchantment(Enchantment.Rarity.RARE, EnchantmentType.create("shields", item -> item.equals(Items.SHIELD)), new EquipmentSlotType[] {EquipmentSlotType.OFFHAND,EquipmentSlotType.MAINHAND}));
    public static final RegistryObject<Enchantment> HEAT_SIGIL = ENCHANTMENTS.register("heat_sigil", () -> new HeatSigilEnchantment(Enchantment.Rarity.RARE, EnchantmentType.create("shields", item -> item.equals(Items.SHIELD)), new EquipmentSlotType[] {EquipmentSlotType.OFFHAND,EquipmentSlotType.MAINHAND}));
    
}
