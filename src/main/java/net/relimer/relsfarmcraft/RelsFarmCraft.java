package net.relimer.relsfarmcraft;

import net.fabricmc.api.ModInitializer;
import net.relimer.relsfarmcraft.block.ModBlocks;
import net.relimer.relsfarmcraft.block.entity.ModBlockEntities;
import net.relimer.relsfarmcraft.effect.ModEffects;
import net.relimer.relsfarmcraft.item.ModFuelItems;
import net.relimer.relsfarmcraft.item.ModItems;
import net.relimer.relsfarmcraft.recipe.ModRecipes;
import net.relimer.relsfarmcraft.screen.slot.ModScreenHandlers;
import net.relimer.relsfarmcraft.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RelsFarmCraft implements ModInitializer {
	public static final String MOD_ID = "relsfarmcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModRegistries.registerModStuffs();

		ModEffects.registerEffects();

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModBlockEntities.registerAllBlockEntities();

		ModRecipes.registerRecipes();

		ModScreenHandlers.registerAllScreenHandlers();
		ModFuelItems.registerFuelItems();

	}
}
