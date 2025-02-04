package uk.infy.luna.mcsmld;

import com.brandon3055.brandonscore.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uk.infy.luna.mcsmld.setup.Registration;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import uk.infy.luna.mcsmld.setup.LunaItems;
import com.brandon3055.brandonscore.lib.CustomTabHandling;
import com.brandon3055.draconicevolution.api.modules.items.ModuleItem;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.item.BlockItem;
import net.minecraftforge.registries.ForgeRegistries;

@Mod("hussein")
public class HusseinPlayzYT {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "hussein";

    public static CommonProxy proxy;
    public static final String ID = "hussein";

    public HusseinPlayzYT() {
        LunaItems.init();
//        Registration.register();
          Registration.addModuleProvider("hussein");


        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(HusseinPlayzYT::registerTabs);

    }
//    public static void init() {
//        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
//        modBus.addListener(HusseinPlayzYT::registerTabs);
//    }

    private static void registerTabs(RegisterEvent event) {
        event.register(Registries.CREATIVE_MODE_TAB, (helper) -> {
            List<ItemStack> itemsIcons = new ArrayList();
            helper.register(new ResourceLocation("hussein", "items"), CreativeModeTab.builder().title(Component.translatable("itemGroup.hussein.items")).displayItems((params, output) -> {
                for(ResourceLocation key : ForgeRegistries.ITEMS.getKeys()) {
                    if (key.getNamespace().equals("hussein")) {
                        Item item = (Item)ForgeRegistries.ITEMS.getValue(key);
                        if (!(item instanceof CustomTabHandling) && item != null && !(item instanceof BlockItem) && !(item instanceof ModuleItem)) {
                            output.accept(item);
                            itemsIcons.add(new ItemStack(item));
                        }
                    }
                }

            }).withTabFactory((builder) -> new HusseinPlayzYT.CyclingTab(builder, itemsIcons)).build());
        });
    }

    private static class CyclingTab extends CreativeModeTab {
        private final List<ItemStack> stacks;

        public CyclingTab(CreativeModeTab.Builder builder, List<ItemStack> stacks) {
            super(builder);
            this.stacks = stacks;
        }

        public ItemStack getIconItem() {
            int idx = (int)(System.currentTimeMillis() / 1200L) % this.stacks.size();
            return (ItemStack)this.stacks.get(idx);
        }
    }
    }

