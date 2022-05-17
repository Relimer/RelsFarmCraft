package net.relimer.relsfarmcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;


public class ModItems {
    public static final Item STRAWBERRY = registerItem("strawberry",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RelsFarmCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RelsFarmCraft.LOGGER.info("Registering Mod Items for " + RelsFarmCraft.MOD_ID);
    }

}
