package com.thegamerlegion.elegantdungeons.items.tools;

import com.thegamerlegion.elegantdungeons.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum DungItemTiers implements IItemTier {
    BRICK_BREAKER(20, 60.0F, 2.0F, 4, 14, () -> { return Ingredient.fromItems(RegistryHandler.T5_CRYSTAL_SHARD.get());}),


    LACUMITESWORD(500, 0.0F, 2.7F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.T1_CRYSTAL_SHARD.get());}),
    FOSSENIUMSWORD(650, 0.0F, 3.0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.T2_CRYSTAL_SHARD.get());}),
    JAMANITESWORD(700, 0.0F, 3.5F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.T3_CRYSTAL_SHARD.get());}),
    DIERANSWORD(850, 0.0F, 4.0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.T4_CRYSTAL_SHARD.get());}),
    MYRKURITESWORD(1650, 0.0F, 4.5F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.T5_CRYSTAL_SHARD.get());}),
    CHUNCHUNMARU(800, 0.0F, 2.5F, 0, 14, () -> { return Ingredient.fromItems(Items.IRON_INGOT);}),
    CORNSWORD(800, 0.0F, 3.7F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    JADEBLADE(800, 0.0F, 3.5F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    EBONYBLADE(800, 0.0F, 3.7F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    CRESCENTCUTLASS(800, 0.0F, 3.7F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    FLAMENCOSWORD(800, 0.0F, 3.7F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    MORPHIUMROSEBLADE(800, 0.0F, 3.7F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    SLAPSTICK(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    SKELETALSWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    SACREDSWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    GRASSBLADE(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    CRYSTALLINESWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    FORTUNESWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    ENDEROUSSWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    FATESLAYER(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    DEMONICSWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    BEASTBLADE(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    SCISSORSWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    ROOTRIPPER(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    BUTTERSWORD(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    SEASLASHER(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    FEYBLADE(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    JESTERBESTER(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    VIBRANTRAPIER(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    SNAKEFANG(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    HEATHOOK(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),
    NEEDLEBLADE(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());}),

    BASE_BOW(800, 0.0F, 0F, 0, 14, () -> { return Ingredient.fromItems(RegistryHandler.MORPHIUM_INGOT.get());})
    ;


    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;



    DungItemTiers(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
