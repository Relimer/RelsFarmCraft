package net.relimer.relsfarmcraft.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(RelsFarmCraft.MOD_ID, SeedMakerRecipe.Serializer.ID),
                SeedMakerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(RelsFarmCraft.MOD_ID, SeedMakerRecipe.Type.ID),
                SeedMakerRecipe.Type.INSTANCE);
    }
}
