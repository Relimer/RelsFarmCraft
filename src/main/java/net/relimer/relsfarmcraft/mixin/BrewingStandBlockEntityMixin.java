package net.relimer.relsfarmcraft.mixin;

import net.minecraft.block.entity.BrewingStandBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.relimer.relsfarmcraft.util.ModBrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(BrewingStandBlockEntity.class)
public class BrewingStandBlockEntityMixin {
    /*@Overwrite
    private static boolean canCraft(DefaultedList<ItemStack> slots) {
        ItemStack itemStack = slots.get(3);
        if (itemStack.isEmpty()) {
            return false;
        }
        if (!BrewingRecipeRegistry.isValidIngredient(itemStack) || !ModBrewingRecipeRegistry.isValidIngredient(itemStack)) {
            return false;
        }
        for (int i = 0; i < 3; ++i) {
            ItemStack itemStack2 = slots.get(i);
            if (itemStack2.isEmpty() || !BrewingRecipeRegistry.hasRecipe(itemStack2, itemStack)) continue;
            return true;
        }
        return false;
    }

    @Overwrite
    private static void craft(World world, BlockPos pos, DefaultedList<ItemStack> slots) {
        ItemStack itemStack = slots.get(3);
        for (int i = 0; i < 3; ++i) {
            slots.set(i, BrewingRecipeRegistry.craft(itemStack, slots.get(i)));
            slots.set(i, ModBrewingRecipeRegistry.craft(itemStack, slots.get(i)));
        }
        itemStack.decrement(1);
        if (itemStack.getItem().hasRecipeRemainder()) {
            ItemStack itemStack2 = new ItemStack(itemStack.getItem().getRecipeRemainder());
            if (itemStack.isEmpty()) {
                itemStack = itemStack2;
            } else {
                ItemScatterer.spawn(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), itemStack2);
            }
        }
        slots.set(3, itemStack);
        world.syncWorldEvent(WorldEvents.BREWING_STAND_BREWS, pos, 0);
    }
    @Overwrite
    public boolean isValid(int slot, ItemStack stack) {
        if (slot == 3) {
            return BrewingRecipeRegistry.isValidIngredient(stack) || ModBrewingRecipeRegistry.isValidIngredient(stack);
        }
        return false;
    }*/
}
