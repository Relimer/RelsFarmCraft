package net.relimer.relsfarmcraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.relimer.relsfarmcraft.RelsFarmCraft;

public class ModItemGroup {
    public static final ItemGroup RELSFARMCRAFTGROUP = FabricItemGroupBuilder.build(new Identifier(RelsFarmCraft.MOD_ID, "relsfarmcraftgroup"),
            () -> new ItemStack(ModItems.STRAWBERRY));
}
