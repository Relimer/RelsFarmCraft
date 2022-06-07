package net.relimer.relsfarmcraft.screen.slot;

import com.google.common.collect.Maps;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.relimer.relsfarmcraft.block.entity.SeedMakerBlockEntity;

import java.util.Map;

public class ModWaterSlot extends Slot {
    public ModWaterSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return ModWaterSlot.canUseAsFuel(stack) || ModWaterSlot.canUseAsFuel(stack) && ModWaterSlot.isBucket(stack);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return ModWaterSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.isOf(Items.BUCKET);
    }

    public static Map<Item, Integer> createFuelTimeMap() {
        Map<Item, Integer> map = Maps.newLinkedHashMap();
        addFuel(map, Items.WATER_BUCKET, 300);
        return map;
    }
    private static void addFuel(Map<Item, Integer> fuelTimes, ItemConvertible item, int fuelTime) {
        Item item2 = item.asItem();
        fuelTimes.put(item2, fuelTime);
    }
    public static boolean canUseAsFuel(ItemStack stack) {
        return ModWaterSlot.createFuelTimeMap().containsKey(stack.getItem());
    }



}
