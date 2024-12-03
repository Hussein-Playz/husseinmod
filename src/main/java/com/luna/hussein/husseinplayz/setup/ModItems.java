package com.luna.hussein.husseinplayz.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import com.luna.hussein.husseinplayz.item.DimensionCard;
import com.luna.hussein.husseinplayz.item.InfinityCard;
import com.luna.hussein.husseinplayz.item.TrueCard;

/**
 * ModItems
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 08:50 am
 */
public class ModItems {

    public static final RegistryObject<Item> INFINITY_CARD = Registration.ITEMS.register("infinity_card", InfinityCard::new);
    public static final RegistryObject<Item> DIMENSION_CARD = Registration.ITEMS.register("dimension_card", DimensionCard::new);
    public static final RegistryObject<Item> TRUE_CARD = Registration.ITEMS.register("true_card", TrueCard::new);
    static void register() {

    }

}
