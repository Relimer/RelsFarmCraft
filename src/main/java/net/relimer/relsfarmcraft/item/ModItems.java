package net.relimer.relsfarmcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.ModBlocks;


public class ModItems {
    public static final Item GRAPE_TEA_BAG = registerItem("grape_tea_bag",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item GLASS_JAM_JAR = registerItem("glass_jam_jar",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.STRAWBERRY)));
    public static final Item GRAPES = registerItem("grapes",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPES)));
    public static final Item FERMENTED_GRAPES = registerItem("fermented_grapes",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));


    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINES, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));


    public static final Item DRIED_GRAPES = registerItem("dried_grapes",
            new Item(new FabricItemSettings().food(ModFoodComponents.DRIED_GRAPES).group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item GRAPE_JAM = registerItem("grape_jam",
            new ConsumableJamJarItem(new FabricItemSettings().recipeRemainder(GLASS_JAM_JAR).food(ModFoodComponents.GRAPE_JAM).group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(16)));
    public static final Item SPICED_GRAPE_JAM = registerItem("spiced_grape_jam",
            new ConsumableJamJarItem(new FabricItemSettings().recipeRemainder(GLASS_JAM_JAR).food(ModFoodComponents.SPICED_GRAPE_JAM).group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(16)));
    public static final Item GRAPE_JAM_TART = registerItem("grape_jam_tart",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_JAM_TART)));
    public static final Item GRAPE_PIE = registerItem("grape_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_PIE)));
    public static final Item GRAPE_SORBET = registerItem("grape_sorbet",
            new StewItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_SORBET).maxCount(1)));
    public static final Item GRAPE_DOUGHNUT = registerItem("grape_doughnut",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_DOUGHNUT)));
    public static final Item DRIED_GRAPE_COOKIE = registerItem("dried_grape_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.DRIED_GRAPE_COOKIE)));
    public static final Item GRAPE_COMPOTE = registerItem("grape_compote",
            new StewItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_COMPOTE).maxCount(1)));
    public static final Item HONEYED_GRAPES = registerItem("honeyed_grapes",
            new HoneyedItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.HONEYED_GRAPES)));
    public static final Item GRAPE_JELLY = registerItem("grape_jelly",
            new HungerItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_JELLY)));

    public static final Item GRAPE_JUICE = registerItem("grape_juice",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_JUICE).maxCount(1)));
    public static final Item GRAPE_TEA = registerItem("grape_tea",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_TEA).maxCount(1)));
    public static final Item GRAPE_WINE = registerItem("grape_wine",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_WINE).maxCount(1)));
    public static final Item SPICED_GRAPE_WINE = registerItem("spiced_grape_wine",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.SPICED_GRAPE_WINE).maxCount(1)));

    public static final Item GRAPE_CAKE = registerItem("grape_cake",
            new BlockItem(ModBlocks.GRAPE_CAKE, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RelsFarmCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RelsFarmCraft.LOGGER.info("Registering Mod Items for " + RelsFarmCraft.MOD_ID);
    }

}
