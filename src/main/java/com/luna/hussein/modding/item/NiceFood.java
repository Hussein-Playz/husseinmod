package com.luna.hussein.modding.item;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;

public class NiceFood extends Item {
    public NiceFood() {
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(20) // Half max hunger restored
                        .saturationMod(6.4f) // Half max saturation restored
                        .alwaysEat() // Allows eating even if not hungry
                        .build())
                .stacksTo(1)); // Sets this item to be non-stackable
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        // Check if the entity is a player
        if (entity instanceof Player player) {
            // Restore hunger and saturation
            player.getFoodData().eat(10, 3.4f); // Half max hunger and saturation restored

            // Keep the item in inventory after eating
            return stack;
        }

        return super.finishUsingItem(stack, level, entity);
    }
}
