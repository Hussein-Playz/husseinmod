package uk.infy.luna.mcsmld.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class TrueCard extends Item {
    public TrueCard() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }

}
