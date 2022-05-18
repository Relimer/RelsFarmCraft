package net.relimer.relsfarmcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.custom.OnionCropBlock;
import net.relimer.relsfarmcraft.block.custom.StrawberryBushBlock;
import net.relimer.relsfarmcraft.item.ModItemGroup;

public class ModBlocks {
    public static final Block ONION_CROP = registerBlockWithoutItem("onion_crop",
            new OnionCropBlock(FabricBlockSettings.copy(Blocks.CARROTS).nonOpaque()), ModItemGroup.RELSFARMCRAFTGROUP);
    public static final Block STRAWBERRY_BUSH = registerBlockWithoutItem("strawberry_bush",
            new StrawberryBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()), ModItemGroup.RELSFARMCRAFTGROUP);

    private  static  Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(RelsFarmCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(RelsFarmCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(RelsFarmCraft.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        RelsFarmCraft.LOGGER.info("Registering ModBlocks for " + RelsFarmCraft.MOD_ID);
    }
}
