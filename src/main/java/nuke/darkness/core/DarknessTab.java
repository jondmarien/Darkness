package nuke.darkness.core;

import net.minecraft.creativetab.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.reg.*;

public class DarknessTab extends CreativeTabs {
	private ItemStack scroll;

	public DarknessTab() {
		super("darkness.general");
		scroll = new ItemStack(Items.APPLE); //TODO: change to scroll
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return scroll;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void displayAllRelevantItems(NonNullList<ItemStack> items) {
		super.displayAllRelevantItems(items);
	}
}