package com.luna.hussein.modding.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import com.luna.hussein.modding.HusseinPlayzYT;

public class TrueCard extends Item {
    public TrueCard() {
        super(new Item.Properties().durability(0));
    }

    @Override
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }
}
