package net.relimer.relsfarmcraft.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.relimer.relsfarmcraft.entity.ModEntityTypes;
import net.relimer.relsfarmcraft.entity.custom.GrapeSlimeEntity;
import net.relimer.relsfarmcraft.entity.custom.StrawberrySlimeEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntityTypes.GRAPE_SLIME, GrapeSlimeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntityTypes.STRAWBERRY_SLIME, StrawberrySlimeEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntityTypes.CRANBERRY_SLIME, StrawberrySlimeEntity.setAttributes());
    }
}
