package com.luna.hussein.husseinplayz;

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
import com.luna.hussein.husseinplayz.setup.ModItems;
import com.luna.hussein.husseinplayz.setup.Registration;

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
                .icon(() -> new ItemStack(ModItems.INFINITY_CARD.get()))
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
