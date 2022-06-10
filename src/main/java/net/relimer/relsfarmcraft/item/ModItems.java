package net.relimer.relsfarmcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.server.ServerMetadata;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.ModBlocks;
import net.relimer.relsfarmcraft.entity.ModEntityTypes;

import java.util.UUID;


public class ModItems {
    public static final Item GLASS_JAM_JAR = registerItem("glass_jam_jar",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY)));
    public static final Item FERMENTED_STRAWBERRY = registerItem("fermented_strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item DRIED_STRAWBERRY = registerItem("dried_strawberry",
            new Item(new FabricItemSettings().food(ModFoodComponents.DRIED_BERRY).group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item HONEYED_STRAWBERRY = registerItem("honeyed_strawberry",
            new HoneyedItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.HONEYED_BERRY)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item STRAWBERRY_TEA_BAG = registerItem("strawberry_tea_bag",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item STRAWBERRY_TEA = registerItem("strawberry_tea",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.STRAWBERRY_TEA).maxCount(1)));
    public static final Item STRAWBERRY_JUICE = registerItem("strawberry_juice",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_JUICE).maxCount(1)));
    public static final Item STRAWBERRY_WINE = registerItem("strawberry_wine",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_WINE).maxCount(1)));
    public static final Item SPICED_STRAWBERRY_WINE = registerItem("spiced_strawberry_wine",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.SPICED_STRAWBERRY_WINE).maxCount(1)));

    public static final Item STRAWBERRY_JAM = registerItem("strawberry_jam",
            new ConsumableJamJarItem(new FabricItemSettings().recipeRemainder(GLASS_JAM_JAR).food(ModFoodComponents.BERRY_JAM).group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(16)));
    public static final Item SPICED_STRAWBERRY_JAM = registerItem("spiced_strawberry_jam",
            new ConsumableJamJarItem(new FabricItemSettings().recipeRemainder(GLASS_JAM_JAR).food(ModFoodComponents.SPICED_STRAWBERRY_JAM).group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(16)));

    public static final Item STRAWBERRY_JAM_TART = registerItem("strawberry_jam_tart",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_JAM_TART)));
    public static final Item STRAWBERRY_PIE = registerItem("strawberry_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_PIE)));
    public static final Item STRAWBERRY_CAKE = registerItem("strawberry_cake",
            new BlockItem(ModBlocks.STRAWBERRY_CAKE, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(1)));
    public static final Item STRAWBERRY_DOUGHNUT = registerItem("strawberry_doughnut",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_DOUGHNUT)));
    public static final Item DRIED_STRAWBERRY_COOKIE = registerItem("dried_strawberry_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.DRIED_BERRY_COOKIE)));

    public static final Item STRAWBERRY_SORBET = registerItem("strawberry_sorbet",
            new StewItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_SORBET).maxCount(1)));
    public static final Item STRAWBERRY_COMPOTE = registerItem("strawberry_compote",
            new StewItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_COMPOTE).maxCount(1)));

    public static final Item STRAWBERRY_JELLY = registerItem("strawberry_jelly",
            new HungerItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_JELLY)));
    public static final Item STRAWBERRY_SLIME_SPAWN_EGG = registerItem("strawberry_slime_spawn_egg",
            new SpawnEggItem(ModEntityTypes.STRAWBERRY_SLIME, 0xe07878, 0xc64040,
                    new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));


    public static final Item GRAPES = registerItem("grapes",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY))/*.useOnEntity(new ItemStack(ModItems.GRAPES), PlayerEntity, LivingEntity, Hand.MAIN_HAND)*/);
    public static final Item FERMENTED_GRAPES = registerItem("fermented_grapes",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item DRIED_GRAPES = registerItem("dried_grapes",
            new Item(new FabricItemSettings().food(ModFoodComponents.DRIED_BERRY).group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item HONEYED_GRAPES = registerItem("honeyed_grapes",
            new HoneyedItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.HONEYED_BERRY)));

    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINES, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));
    public static final Item GRAPE_TEA_BAG = registerItem("grape_tea_bag",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item GRAPE_JAM = registerItem("grape_jam",
            new ConsumableJamJarItem(new FabricItemSettings().recipeRemainder(GLASS_JAM_JAR).food(ModFoodComponents.BERRY_JAM).group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(16)));
    public static final Item SPICED_GRAPE_JAM = registerItem("spiced_grape_jam",
            new ConsumableJamJarItem(new FabricItemSettings().recipeRemainder(GLASS_JAM_JAR).food(ModFoodComponents.SPICED_GRAPE_JAM).group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(16)));

    public static final Item GRAPE_JAM_TART = registerItem("grape_jam_tart",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_JAM_TART)));
    public static final Item GRAPE_PIE = registerItem("grape_pie",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_PIE)));
    public static final Item GRAPE_CAKE = registerItem("grape_cake",
            new BlockItem(ModBlocks.GRAPE_CAKE, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).maxCount(1)));
    public static final Item GRAPE_DOUGHNUT = registerItem("grape_doughnut",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_DOUGHNUT)));
    public static final Item DRIED_GRAPE_COOKIE = registerItem("dried_grape_cookie",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.DRIED_BERRY_COOKIE)));

    public static final Item GRAPE_SORBET = registerItem("grape_sorbet",
            new StewItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_SORBET).maxCount(1)));
    public static final Item GRAPE_COMPOTE = registerItem("grape_compote",
            new StewItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_COMPOTE).maxCount(1)));

    public static final Item GRAPE_JUICE = registerItem("grape_juice",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_JUICE).maxCount(1)));
    public static final Item GRAPE_TEA = registerItem("grape_tea",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPE_TEA).maxCount(1)));
    public static final Item GRAPE_WINE = registerItem("grape_wine",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_WINE).maxCount(1)));
    public static final Item SPICED_GRAPE_WINE = registerItem("spiced_grape_wine",
            new DrinkableBottleItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.SPICED_GRAPE_WINE).maxCount(1)));

    public static final Item GRAPE_JELLY = registerItem("grape_jelly",
            new HungerItem(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.BERRY_JELLY)));
    public static final Item GRAPE_SLIME_SPAWN_EGG = registerItem("grape_slime_spawn_egg",
            new SpawnEggItem(ModEntityTypes.GRAPE_SLIME, 0x634892, 0x493173,
                    new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RelsFarmCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RelsFarmCraft.LOGGER.info("Registering Mod Items for " + RelsFarmCraft.MOD_ID);
    }

}
