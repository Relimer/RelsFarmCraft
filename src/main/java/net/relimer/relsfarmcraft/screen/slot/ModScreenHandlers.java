package net.relimer.relsfarmcraft.screen.slot;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.relimer.relsfarmcraft.RelsFarmCraft;

public class ModScreenHandlers {
    public static ScreenHandlerType<SeedMakerScreenHandler> SEED_MAKER_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        SEED_MAKER_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(RelsFarmCraft.MOD_ID, "seed_maker"),
                        SeedMakerScreenHandler::new);
    }
}
