package com.thegamerlegion.elegantdungeons.items;

import com.thegamerlegion.elegantdungeons.ElegantDungeons;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class KeyItem extends Item {
    public KeyItem() {
        super( new Item.Properties()
                .group(ElegantDungeons.TAB)
                .maxStackSize(1));
    }
}