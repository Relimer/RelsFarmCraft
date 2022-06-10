package net.relimer.relsfarmcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.relimer.relsfarmcraft.block.ModBlocks;
import net.relimer.relsfarmcraft.entity.ModEntityTypes;
import net.relimer.relsfarmcraft.entity.client.GrapeSlimeEntityRenderer;
import net.relimer.relsfarmcraft.entity.client.StrawberrySlimeEntityRenderer;
import net.relimer.relsfarmcraft.screen.slot.ModScreenHandlers;
import net.relimer.relsfarmcraft.screen.slot.SeedMakerScreen;

public class RelsFarmCraftClient implements ClientModInitializer {
      @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_VINES_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEED_MAKER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_JELLY_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_JELLY_BLOCK, RenderLayer.getTranslucent());

        ScreenRegistry.register(ModScreenHandlers.SEED_MAKER_SCREEN_HANDLER, SeedMakerScreen::new);

        EntityRendererRegistry.register(ModEntityTypes.GRAPE_SLIME, GrapeSlimeEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypes.STRAWBERRY_SLIME, StrawberrySlimeEntityRenderer::new);
    }
}

