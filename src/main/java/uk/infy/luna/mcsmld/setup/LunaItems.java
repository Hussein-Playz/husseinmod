package uk.infy.luna.mcsmld.setup;

import uk.infy.luna.mcsmld.item.NiceFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import uk.infy.luna.mcsmld.item.DimensionCard;
import uk.infy.luna.mcsmld.item.InfinityCard;
import uk.infy.luna.mcsmld.item.TrueCard;
import com.brandon3055.draconicevolution.api.crafting.FusionRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static uk.infy.luna.mcsmld.HusseinPlayzYT.MODID;

public class LunaItems {

//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

//    public static final DeferredRegister<BlockEntityType<?>> TILES_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);
//    public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MODID);
//
//    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);
//    public static final DeferredRegister<WorldEntityType<?>> WORLD_ENTITY_TYPES = DeferredRegister.create(WorldEntityHandler.ENTITY_TYPE, MODID);

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, MODID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIAL = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MODID);
//    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MODID);

//    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, MODID);
//    public static final RegistryObject<Item> INFINITY_CARD = Registration.ITEMS.register("infinity_card", InfinityCard::new);
//    public static final RegistryObject<Item> DIMENSION_CARD = Registration.ITEMS.register("dimension_card", DimensionCard::new);
//    public static final RegistryObject<Item> TRUE_CARD = Registration.ITEMS.register("true_card", TrueCard::new);
//    public static final RegistryObject<Item> NICE_FOOD = Registration.ITEMS.register("nice_food", NiceFood::new);
    public static void init() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
//        BLOCKS.register(eventBus);
//        TILES_ENTITIES.register(eventBus);
//        MENU_TYPES.register(eventBus);
//        ENTITY_TYPES.register(eventBus);
//        WORLD_ENTITY_TYPES.register(eventBus);
//        RECIPE_SERIAL.register(eventBus);
//        ENCHANTMENTS.register(eventBus);
//        FEATURES.register(eventBus);
        ITEMS.register(eventBus);
        RECIPE_TYPES.register(eventBus);
    }
//    static void register() {
//
//    }

    //#################################################################
    // Items
    //#################################################################

    //@formatter:off
    //Components
//    public static RegistryObject<Item> INFINITY_CARD = ITEMS.register("infinity_card",() -> new Item(new Item.Properties()));
//    public static  RegistryObject<Item> DIMENSION_CARD = ITEMS.register("dimension_card",() -> new Item(new Item.Properties()));
//    public static  RegistryObject<Item> TRUE_CARD = ITEMS.register("true_card",() -> new Item(new Item.Properties()));
//    public static  RegistryObject<Item> NICE_FOOD = ITEMS.register("nice_food",() -> new Item(new Item.Properties()));
    static {
        INFINITY_CARD = ITEMS.register("infinity_card", InfinityCard::new);
        DIMENSION_CARD = ITEMS.register("dimension_card", DimensionCard::new);
        TRUE_CARD = ITEMS.register("true_card",TrueCard::new);
        NICE_FOOD = ITEMS.register("nice_food", NiceFood::new);
    }
    public static RegistryObject<Item> INFINITY_CARD;
    public static RegistryObject<Item> DIMENSION_CARD;
    public static RegistryObject<Item> TRUE_CARD;
    public static RegistryObject<Item> NICE_FOOD;

    //#################################################################
    // Recipe Types
    //#################################################################

    static {
        Registration.FUSION_RECIPE_SERIALIZER = RECIPE_SERIAL.register("fusion_crafting", FusionRecipe.Serializer::new);
        Registration.FUSION_RECIPE_TYPE = RECIPE_TYPES.register("fusion_crafting", () -> RecipeType.simple(new ResourceLocation(MODID, "fusion_crafting")));
    }
}
