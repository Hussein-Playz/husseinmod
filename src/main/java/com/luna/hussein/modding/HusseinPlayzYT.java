package com.luna.hussein.modding;

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
import appeng.api.ids.AECreativeTabIds;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.luna.hussein.modding.setup.ModItems;
import com.luna.hussein.modding.setup.Registration;

import java.lang.reflect.Field;

@Mod("hussein")
public class HusseinPlayzYT {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String ID = "hussein";

    public HusseinPlayzYT() {

        Registration.register();


        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener((RegisterEvent event) -> {
            LOGGER.info("Creating Creative Mode Tab");
            if(event.getRegistryKey() == Registries.CREATIVE_MODE_TAB){
                registerTab(event.getVanillaRegistry());
            }
        });

    }

    public static void registerTab(Registry<CreativeModeTab> registry) {
        var tab = CreativeModeTab.builder()
                .icon(() -> new ItemStack(ModItems.TRUE_CARD.get()))
                .displayItems((itemDisplayParameters, output) -> {

                            for (Field field : ModItems.class.getFields()) {
                                if (field.getType() != RegistryObject.class) continue;

                                try {
                                    RegistryObject<Item> item = (RegistryObject<Item>) field.get(null);
                                    output.accept(new ItemStack(item.get()));
                                } catch (IllegalAccessException e) {
                                }
                            }

                        }
                )
                .title(Component.translatable("item_group." + ID + ".tab"))
                .build();
        Registry.register(registry, new ResourceLocation(ID, "hussein"), tab);
    }

}
