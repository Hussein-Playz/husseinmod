
package com.luna.hussein.modding.datagen;

import appeng.core.definitions.AEItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import com.luna.hussein.modding.HusseinPlayzYT;
import com.luna.hussein.modding.setup.ModItems;
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
import codechicken.lib.datagen.recipe.FurnaceRecipeBuilder;
//import codechicken.lib.datagen.recipe.RecipeProvider;
import codechicken.lib.datagen.recipe.ShapelessRecipeBuilder;
import com.brandon3055.brandonscore.api.TechLevel;
import com.brandon3055.draconicevolution.api.modules.Module;
import com.brandon3055.draconicevolution.init.DEContent;
import com.brandon3055.draconicevolution.init.DEModules;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.INFINITY_CARD.get())
                .pattern("ERE").pattern("RSR").pattern("NNN")
                .define('E', Items.ENDER_EYE)
                .define('R', AEItems.WIRELESS_BOOSTER.asItem())
                .define('S', Items.NETHER_STAR)
                .define('N', Items.NETHERITE_INGOT)
                .unlockedBy("has_item", has(Items.NETHERITE_INGOT))
                .save(p_251297_, new ResourceLocation(HusseinPlayzYT.ID, "infinity_card"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIMENSION_CARD.get())
                .pattern("RNR").pattern("NEN").pattern("RNR")
                .define('R', ModItems.INFINITY_CARD.get())
                .define('E', Items.ENDER_EYE)
                .define('N', Items.NETHER_STAR)
                .unlockedBy("has_item", has(ModItems.INFINITY_CARD.get()))
                .save(p_251297_, new ResourceLocation(HusseinPlayzYT.ID, "dimension_card"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TRUE_CARD.get())
                .pattern(" N ").pattern("RER").pattern(" R ")
                .define('R', AEItems.ITEM_CELL_64K)
                .define('E', ModItems.DIMENSION_CARD.get())
                .define('N', Items.DRAGON_EGG)
                .unlockedBy("has_item", has(ModItems.DIMENSION_CARD.get()))
                .save(p_251297_, new ResourceLocation(HusseinPlayzYT.ID, "true_card"));
    }

}
