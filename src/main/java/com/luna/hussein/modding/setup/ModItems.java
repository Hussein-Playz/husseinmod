package com.luna.hussein.modding.setup;

import com.luna.hussein.modding.item.NiceFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import com.luna.hussein.modding.item.DimensionCard;
import com.luna.hussein.modding.item.InfinityCard;
import com.luna.hussein.modding.item.TrueCard;
import com.brandon3055.draconicevolution.api.DraconicAPI;
import com.brandon3055.draconicevolution.api.crafting.IngredientStack;
import com.brandon3055.draconicevolution.client.ClientProxy;
import com.brandon3055.draconicevolution.client.DEParticles;
import com.brandon3055.draconicevolution.command.DECommands;
import com.brandon3055.draconicevolution.handlers.DEEventHandler;
import com.brandon3055.draconicevolution.handlers.DESounds;
import com.brandon3055.draconicevolution.handlers.LootEventHandler;
import com.brandon3055.draconicevolution.handlers.ModularArmorEventHandler;
import com.brandon3055.draconicevolution.handlers.ModuleEventHandler;
import com.brandon3055.draconicevolution.init.ClientInit;
import com.brandon3055.draconicevolution.init.DEContent;
import com.brandon3055.draconicevolution.init.DECreativeTabs;
import com.brandon3055.draconicevolution.init.DEModules;
import com.brandon3055.draconicevolution.init.DETags;
import com.brandon3055.draconicevolution.init.ModCapabilities;
import com.brandon3055.draconicevolution.integration.computers.ComputerCraftCompatEventHandler;
import com.brandon3055.draconicevolution.integration.equipment.EquipmentManager;
import com.brandon3055.draconicevolution.items.tools.Dislocator;
import com.brandon3055.draconicevolution.network.DraconicNetwork;

public class ModItems {

    public static final RegistryObject<Item> INFINITY_CARD = Registration.ITEMS.register("infinity_card", InfinityCard::new);
    public static final RegistryObject<Item> DIMENSION_CARD = Registration.ITEMS.register("dimension_card", DimensionCard::new);
    public static final RegistryObject<Item> TRUE_CARD = Registration.ITEMS.register("true_card", TrueCard::new);
    public static final RegistryObject<Item> NICE_FOOD = Registration.ITEMS.register("nice_food", NiceFood::new);

    static void register() {

    }

}
