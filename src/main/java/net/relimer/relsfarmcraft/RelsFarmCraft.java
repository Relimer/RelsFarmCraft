package net.relimer.relsfarmcraft;

import net.fabricmc.api.ModInitializer;
import net.relimer.relsfarmcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RelsFarmCraft implements ModInitializer {
	public static final String MOD_ID = "relsfarmcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
