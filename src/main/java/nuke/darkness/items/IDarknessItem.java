package nuke.darkness.items;

import net.minecraft.item.*;

public interface IDarknessItem {
	public double getDarkness(ItemStack stack);
	public double getDarknessCapacity(ItemStack stack);
	
	public void setDarkness(ItemStack stack, double val);
	public void setDarknessCapacity(ItemStack stack, double val);
	
	public double addAmount(ItemStack stack, double val, boolean add);
	public double removeAmount(ItemStack stack, double val, boolean remove);
}