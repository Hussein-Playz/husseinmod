package com.luna.hussein.modding.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.luna.hussein.modding.HusseinPlayzYT;

/**
 * RSInfinityBoosterDataGen
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:48 pm
 */
@Mod.EventBusSubscriber(modid = HusseinPlayzYT.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

    private DataGenerators() {
    }

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        generator.addProvider(true, (DataProvider.Factory<RecipeGenerator>) p_253851_ -> new RecipeGenerator(generator.getPackOutput()));
    }
}
