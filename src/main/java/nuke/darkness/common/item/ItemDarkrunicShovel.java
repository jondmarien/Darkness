package nuke.darkness.common.item;

import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import nuke.darkness.core.*;

public class ItemDarkrunicShovel extends ItemSpade {
	public ItemDarkrunicShovel(ToolMaterial mat, String name) {
		super(mat);
		ItemBasic.setItemName(this, name);
		setCreativeTab(Darkness.darknessTab);
	}
}