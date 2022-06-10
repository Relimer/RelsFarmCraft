/*
 * Decompiled with CFR 0.0.9 (FabricMC cc05e23f).
 */
package net.relimer.relsfarmcraft.entity.client;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.relimer.relsfarmcraft.entity.custom.GrapeSlimeEntity;
import net.relimer.relsfarmcraft.entity.custom.StrawberrySlimeEntity;

@Environment(value=EnvType.CLIENT)
public class StrawberrySlimeEntityRenderer
        extends MobEntityRenderer<StrawberrySlimeEntity, StrawberrySlimeEntityModel<StrawberrySlimeEntity>> {
    private static final Identifier TEXTURE = new Identifier("relsfarmcraft:textures/entity/slime/strawberry_slime.png");

    public StrawberrySlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new StrawberrySlimeEntityModel<>(context.getPart(EntityModelLayers.SLIME)), 0.25f);
        this.addFeature(new StrawberrySlimeOverlayFeatureRenderer<>(this, context.getModelLoader()));
    }

    @Override
    public void render(StrawberrySlimeEntity strawberrySlimeEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        this.shadowRadius = 0.25f * (float)strawberrySlimeEntity.getSize();
        super.render(strawberrySlimeEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    protected void scale(StrawberrySlimeEntity strawberrySlimeEntity, MatrixStack matrixStack, float f) {
        float g = 0.999f;
        matrixStack.scale(0.999f, 0.999f, 0.999f);
        matrixStack.translate(0.0, 0.001f, 0.0);
        float h = strawberrySlimeEntity.getSize();
        float i = MathHelper.lerp(f, strawberrySlimeEntity.lastStretch, strawberrySlimeEntity.stretch) / (h * 0.5f + 1.0f);
        float j = 1.0f / (i + 1.0f);
        matrixStack.scale(j * h, 1.0f / j * h, j * h);
    }

    @Override
    public Identifier getTexture(StrawberrySlimeEntity strawberrySlimeEntity) {
        return TEXTURE;
    }
}





