package net.relimer.relsfarmcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.ModBlocks;


public class ModItems {
    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.STRAWBERRY)));
    public static final Item GRAPES = registerItem("grapes",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.GRAPES)));
    public static final Item ONION = registerItem("onion",
            new Item(new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP).food(ModFoodComponents.ONION)));
    public static final Item ONION_SEEDS = registerItem("onion_seeds",
            new AliasedBlockItem(ModBlocks.ONION_CROP, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item GRAPE_SEEDS = registerItem("grape_seeds",
            new AliasedBlockItem(ModBlocks.GRAPE_VINES, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH, new FabricItemSettings().group(ModItemGroup.RELSFARMCRAFTGROUP)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RelsFarmCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RelsFarmCraft.LOGGER.info("Registering Mod Items for " + RelsFarmCraft.MOD_ID);
    }

}
