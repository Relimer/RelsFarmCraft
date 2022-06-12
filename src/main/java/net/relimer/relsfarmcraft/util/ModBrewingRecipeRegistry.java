package net.relimer.relsfarmcraft.util;

import com.google.common.collect.Lists;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.recipe.Ingredient;

import java.util.List;

public class ModBrewingRecipeRegistry extends BrewingRecipeRegistry {
    public static final List<ModBrewingRecipeRegistry.PotionRecipeItem> POTION_RECIPE_ITEMS = Lists.newArrayList();

    public static boolean isValidIngredient(ItemStack stack) {
        return ModBrewingRecipeRegistry.isPotionRecipeItemIngredient(stack);
    }

    protected static boolean isPotionRecipeItemIngredient(ItemStack stack) {
        int j = POTION_RECIPE_ITEMS.size();
        for (int i = 0; i < j; ++i) {
            if (!ModBrewingRecipeRegistry.POTION_RECIPE_ITEMS.get((int)i).ingredient.test(stack)) continue;
            return true;
        }
        return false;
    }

    public static boolean isBrewable(Item item) {
        int j = POTION_RECIPE_ITEMS.size();
        for (int i = 0; i < j; ++i) {
            if (ModBrewingRecipeRegistry.POTION_RECIPE_ITEMS.get((int)i).output != item) continue;
            return true;
        }
        return false;
    }

    public static ItemStack craft(ItemStack ingredient, ItemStack input) {
        if (!input.isEmpty()) {
            PotionRecipeItem recipe;
            int i;
            Potion potion = PotionUtil.getPotion(input);
            Item item = input.getItem();
            int j = POTION_RECIPE_ITEMS.size();
            for (i = 0; i < j; ++i) {
                recipe = POTION_RECIPE_ITEMS.get(i);
                if (recipe.input != potion || !recipe.ingredient.test(ingredient)) continue;
                return new ItemStack((ItemConvertible)recipe.output);
            }
        }
        return input;
    }

    public static void registerPotionRecipeItem(Potion input, Item item, Item output) {
        POTION_RECIPE_ITEMS.add(new ModBrewingRecipeRegistry.PotionRecipeItem(input, Ingredient.ofItems(item), output));
    }

    record PotionRecipeItem(Potion input, Ingredient ingredient, Item output) {
    }
}
