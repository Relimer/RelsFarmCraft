package net.relimer.relsfarmcraft.block.entity;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.ModBlocks;
import net.relimer.relsfarmcraft.screen.slot.ModWaterSlot;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModBlockEntities {
    public static BlockEntityType<SeedMakerBlockEntity> SEED_MAKER;

    public static void registerAllBlockEntities() {
        SEED_MAKER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(RelsFarmCraft.MOD_ID, "seed_maker"),
                FabricBlockEntityTypeBuilder.create(SeedMakerBlockEntity::new,
                        ModBlocks.SEED_MAKER).build(null));
    }
}
