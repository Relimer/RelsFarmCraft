/*
 * Decompiled with CFR 0.0.9 (FabricMC cc05e23f).
 */
package net.relimer.relsfarmcraft.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.loot.LootTables;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.relimer.relsfarmcraft.RelsFarmCraft;
import net.relimer.relsfarmcraft.block.ModBlocks;


public class GrapeSlimeEntity
extends SlimeEntity {
    public GrapeSlimeEntity(EntityType<? extends SlimeEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f);
    }

    @Override
    public boolean canSpawn(WorldView world) {
        return world.doesNotIntersectEntities(this) && !world.containsFluid(this.getBoundingBox());
    }

    @Override
    protected ParticleEffect getParticles() {
        return new BlockStateParticleEffect(ParticleTypes.BLOCK, ModBlocks.GRAPE_JELLY_BLOCK.getDefaultState());
    }

    @Override
    protected Identifier getLootTableId() {
        return !this.isSmall() ? LootTables.EMPTY : this.getType().getLootTableId();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        if (this.isSmall()) {
            return SoundEvents.ENTITY_MAGMA_CUBE_HURT_SMALL;
        }
        return SoundEvents.ENTITY_MAGMA_CUBE_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        if (this.isSmall()) {
            return SoundEvents.ENTITY_MAGMA_CUBE_DEATH_SMALL;
        }
        return SoundEvents.ENTITY_MAGMA_CUBE_DEATH;
    }

    @Override
    protected SoundEvent getSquishSound() {
        if (this.isSmall()) {
            return SoundEvents.ENTITY_MAGMA_CUBE_SQUISH_SMALL;
        }
        return SoundEvents.ENTITY_MAGMA_CUBE_SQUISH;
    }

    @Override
    protected SoundEvent getJumpSound() {
        return SoundEvents.ENTITY_MAGMA_CUBE_JUMP;
    }
}

