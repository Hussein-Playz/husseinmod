
package com.luna.hussein.husseinplayz.datagen;

import appeng.core.definitions.AEItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import com.luna.hussein.husseinplayz.setup.ModItems;

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
                .save(p_251297_, new ResourceLocation(com.luna.hussein.husseinplayz.HusseinPlayzYT.ID, "infinity_card"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIMENSION_CARD.get())
                .pattern("RNR").pattern("NEN").pattern("RNR")
                .define('R', ModItems.INFINITY_CARD.get())
                .define('E', Items.ENDER_EYE)
                .define('N', Items.NETHER_STAR)
                .unlockedBy("has_item", has(ModItems.INFINITY_CARD.get()))
                .save(p_251297_, new ResourceLocation(com.luna.hussein.husseinplayz.HusseinPlayzYT.ID, "dimension_card"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TRUE_CARD.get())
                .pattern(" E ")
                .pattern(" D ")
                .pattern("DDD")
                .define('E', Items.DRAGON_EGG) // Top-middle ingredient
                .define('D', new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation("ae2:item_storage_cell_64k"))).getItem())       // Bottom row ingredient
                .define('C', ModItems.DIMENSION_CARD.get()) // Center ingredient
                .unlockedBy("has_dimension_card", has(ModItems.DIMENSION_CARD.get())) // Unlock condition
                .save(p_251297_, new ResourceLocation(com.luna.hussein.husseinplayz.HusseinPlayzYT.ID, "true_card"));
    }

}
