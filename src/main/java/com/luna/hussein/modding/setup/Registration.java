package com.luna.hussein.modding.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.luna.hussein.modding.HusseinPlayzYT;
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

/**
 * Registration
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 22/12/2021 - 08:50 am
 */
public class Registration {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HusseinPlayzYT.ID);

    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);

        ModItems.register();
    }

}
