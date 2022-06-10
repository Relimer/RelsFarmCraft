package net.relimer.relsfarmcraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.SlimeEntityModel;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.entity.client.GrapeSlimeEntityModel;
import net.relimer.relsfarmcraft.entity.custom.GrapeSlimeEntity;
import net.relimer.relsfarmcraft.entity.custom.StrawberrySlimeEntity;

public class ModEntityTypes {
    public static final EntityType<GrapeSlimeEntity> GRAPE_SLIME = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(RelsFarmCraft.MOD_ID, "grape_slime"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, GrapeSlimeEntity::new)
                    .dimensions(EntityDimensions.changing(2.04f, 2.04f)).build());
    public static final EntityType<StrawberrySlimeEntity> STRAWBERRY_SLIME = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(RelsFarmCraft.MOD_ID, "strawberry_slime"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, StrawberrySlimeEntity::new)
                    .dimensions(EntityDimensions.changing(2.04f, 2.04f)).build());
}
