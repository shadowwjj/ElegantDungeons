package com.thegamerlegion.elegantdungeons.items;

import com.lazy.baubles.api.BaubleType;
import com.lazy.baubles.api.IBauble;
import com.lazy.baubles.api.cap.BaublesCapabilities;
import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class BaubleItem extends Item {

    public BaubleItem() {
        super(new Item.Properties().group(ElegantDungeons.TAB));
    }

    @Nullable
    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
        IBauble iBauble = () -> BaubleType.RING;
        return new ICapabilityProvider() {
            private final LazyOptional<IBauble> opt = LazyOptional.of(() -> iBauble);

            @Nonnull
            @Override
            public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
                return BaublesCapabilities.ITEM_BAUBLE.orEmpty(cap, opt);
            }
        };
    }
}
