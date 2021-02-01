package com.thegamerlegion.elegantdungeons.items.armor;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum DungArmorMaterial implements IArmorMaterial {

    LACUMITE(ElegantDungeons.MOD_ID + ":lacumite", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T1_CRYSTAL_ITEM.get());}),

    FOSSENIUM(ElegantDungeons.MOD_ID + ":fossenium", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T2_CRYSTAL_ITEM.get());}),

    JAMANITE(ElegantDungeons.MOD_ID + ":jamanite", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T3_CRYSTAL_ITEM.get());}),

    DIERAN(ElegantDungeons.MOD_ID + ":dieran", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T4_CRYSTAL_ITEM.get());}),

    MYRKURITE(ElegantDungeons.MOD_ID + ":myrkurite", 17, new int[] {2,5,6,2}, 16,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T5_CRYSTAL_ITEM.get());}),

    FEYRUNE(ElegantDungeons.MOD_ID + ":feyrune", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    GUARDIAN(ElegantDungeons.MOD_ID + ":guardian", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    ELDER_GUARDIAN(ElegantDungeons.MOD_ID + ":elder_guardian", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    DOLPHIN(ElegantDungeons.MOD_ID + ":dolphin", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    MAGMATIC(ElegantDungeons.MOD_ID + ":magmatic", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    TESLA(ElegantDungeons.MOD_ID + ":tesla", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    MINER(ElegantDungeons.MOD_ID + ":miner", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    STEAMPUNK(ElegantDungeons.MOD_ID + ":steampunk", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    DUCK(ElegantDungeons.MOD_ID + ":duck", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    MOONWALKER(ElegantDungeons.MOD_ID + ":moonwalker", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    DEMONIC(ElegantDungeons.MOD_ID + ":demonic", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    KNIGHT(ElegantDungeons.MOD_ID + ":knight", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    SAMURAI(ElegantDungeons.MOD_ID + ":samurai", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    ROGUE(ElegantDungeons.MOD_ID + ":rogue", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    FIREFLY(ElegantDungeons.MOD_ID + ":firefly", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    RAT(ElegantDungeons.MOD_ID + ":rat", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    SKELETAL(ElegantDungeons.MOD_ID + ":skeletal", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    POLAR(ElegantDungeons.MOD_ID + ":polar", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    MUSHROOM(ElegantDungeons.MOD_ID + ":mushroom", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    INVISIBLE(ElegantDungeons.MOD_ID + ":invisible", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    PEARL(ElegantDungeons.MOD_ID + ":pearl", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    CREEPER(ElegantDungeons.MOD_ID + ":creeper", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    RAINBOW(ElegantDungeons.MOD_ID + ":rainbow", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    SAILOR(ElegantDungeons.MOD_ID + ":sailor", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    CRYSTALLINE(ElegantDungeons.MOD_ID + ":crystalline", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    METEORITE(ElegantDungeons.MOD_ID + ":meteorite", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    AMBER(ElegantDungeons.MOD_ID + ":amber", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    ROBOT(ElegantDungeons.MOD_ID + ":robot", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    SCALE(ElegantDungeons.MOD_ID + ":scale", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    HORSE(ElegantDungeons.MOD_ID + ":horse", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    LIVING_STEEL(ElegantDungeons.MOD_ID + ":living_steel", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    SWIFT(ElegantDungeons.MOD_ID + ":swift", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    PUFFERFISH(ElegantDungeons.MOD_ID + ":pufferfish", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    OVERGROWTH(ElegantDungeons.MOD_ID + ":overgrowth", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    WITHER(ElegantDungeons.MOD_ID + ":wither", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    CLOUD(ElegantDungeons.MOD_ID + ":cloud", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    OCELOT(ElegantDungeons.MOD_ID + ":ocelot", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    CLOWN(ElegantDungeons.MOD_ID + ":clown", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    BORG(ElegantDungeons.MOD_ID + ":borg", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),


    ;

    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11,16,15,13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    DungArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
