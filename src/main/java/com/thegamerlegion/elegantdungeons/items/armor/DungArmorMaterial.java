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
            () -> {return Ingredient.fromItems(RegistryHandler.T1_CRYSTAL_ITEM.get());}),

    JAMANITE(ElegantDungeons.MOD_ID + ":jamanite", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T1_CRYSTAL_ITEM.get());}),

    DIERAN(ElegantDungeons.MOD_ID + ":dieran", 17, new int[] {2,5,6,2}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T1_CRYSTAL_ITEM.get());}),

    MYRKURITE(ElegantDungeons.MOD_ID + ":myrkurite", 17, new int[] {2,5,6,2}, 16,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F,
            () -> {return Ingredient.fromItems(RegistryHandler.T1_CRYSTAL_ITEM.get());});

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
