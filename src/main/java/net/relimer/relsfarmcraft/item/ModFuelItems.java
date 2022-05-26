package net.relimer.relsfarmcraft.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Items;

public class ModFuelItems {
    public static void registerFuelItems() {
        FuelRegistry.INSTANCE.add(Items.WATER_BUCKET,1600);
    }
}

