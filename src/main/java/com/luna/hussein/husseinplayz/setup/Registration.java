package com.luna.hussein.husseinplayz.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.luna.hussein.husseinplayz.HusseinPlayzYT;

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