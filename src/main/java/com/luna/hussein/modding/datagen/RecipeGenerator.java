
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

import java.util.function.Consumer;

/**
 * RecipeGenerator
 *
 * @author Hexeption admin@hexeption.co.uk
 * @since 14/02/2021 - 06:35 pm
 */
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
