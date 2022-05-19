package net.relimer.relsfarmcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.custom.GrapeVinesBodyBlock;
import net.relimer.relsfarmcraft.block.custom.GrapeVinesHeadBlock;
import net.relimer.relsfarmcraft.block.custom.OnionCropBlock;
import net.relimer.relsfarmcraft.block.custom.StrawberryBushBlock;
import net.relimer.relsfarmcraft.item.ModItemGroup;

public class ModBlocks {
    public static final Block ONION_CROP = registerBlockWithoutItem("onion_crop",
            new OnionCropBlock(FabricBlockSettings.copy(Blocks.CARROTS).nonOpaque()), ModItemGroup.RELSFARMCRAFTGROUP);
    public static final Block STRAWBERRY_BUSH = registerBlockWithoutItem("strawberry_bush",
            new StrawberryBushBlock(FabricBlockSettings.copy(Blocks.SWEET_BERRY_BUSH).nonOpaque()), ModItemGroup.RELSFARMCRAFTGROUP);
    public static final Block GRAPE_VINES = registerBlockWithoutItem("grape_vines",
            new GrapeVinesHeadBlock(AbstractBlock.Settings.of(Material.PLANT).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES)), ModItemGroup.RELSFARMCRAFTGROUP);
    public static final Block GRAPE_VINES_PLANT = registerBlockWithoutItem("grape_vines_plant",
            new GrapeVinesBodyBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES)), ModItemGroup.RELSFARMCRAFTGROUP);


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
