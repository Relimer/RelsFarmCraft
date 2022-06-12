/*
 * Decompiled with CFR 0.0.9 (FabricMC cc05e23f).
 */
package net.relimer.relsfarmcraft.entity.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.entity.Entity;

@Environment(value=EnvType.CLIENT)
public class CranberrySlimeEntityModel<T extends Entity>
        extends SinglePartEntityModel<T> {
    private final ModelPart root;

    public CranberrySlimeEntityModel(ModelPart root) {
        this.root = root;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
    }

    @Override
    public ModelPart getPart() {
        return this.root;
    }
}

