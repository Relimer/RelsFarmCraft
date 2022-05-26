package net.relimer.relsfarmcraft.screen.slot;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.relimer.relsfarmcraft.block.entity.SeedMakerBlockEntity;

public class ModWaterSlot extends Slot {
    public ModWaterSlot(Inventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return SeedMakerBlockEntity.canUseAsFuel(stack) || SeedMakerBlockEntity.canUseAsFuel(stack) && ModWaterSlot.isBucket(stack);
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return ModWaterSlot.isBucket(stack) ? 1 : super.getMaxItemCount(stack);
    }

    public static boolean isBucket(ItemStack stack) {
        return stack.isOf(Items.BUCKET);
    }



}