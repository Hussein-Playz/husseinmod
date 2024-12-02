package com.luna.hussein.husseinplayz.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * DimensionCard
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 11:19 am
 */
public class TrueCard extends Item {
    public TrueCard() {
        super(new Item.Properties().durability(0));
    }

    @Override
    public boolean isFoil(ItemStack p_41453_) {
        return true;
    }
}
