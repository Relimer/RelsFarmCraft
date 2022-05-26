package net.relimer.relsfarmcraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.render.RenderLayer;
import net.relimer.relsfarmcraft.block.ModBlocks;
import net.relimer.relsfarmcraft.screen.slot.ModScreenHandlers;
import net.relimer.relsfarmcraft.screen.slot.SeedMakerScreen;

public class RelsFarmCraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ONION_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_VINES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_VINES_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SEED_MAKER, RenderLayer.getCutout());

        ScreenRegistry.register(ModScreenHandlers.SEED_MAKER_SCREEN_HANDLER, SeedMakerScreen::new);
    }
}

