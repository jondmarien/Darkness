package nuke.darkness.common.items;

import net.minecraft.item.*;

public interface IGloomItem {
	public double getGloom(ItemStack stack);

	public double getGloomCapacity(ItemStack stack);

	public void setGloom(ItemStack stack, double val);

	public void setGloomCapacity(ItemStack stack, double val);

	public double addAmount(ItemStack stack, double val, boolean add);

	public double removeAmount(ItemStack stack, double val, boolean remove);
}