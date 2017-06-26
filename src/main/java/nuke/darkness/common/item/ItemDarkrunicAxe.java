package nuke.darkness.common.item;

import net.minecraft.item.*;
import nuke.darkness.core.*;

public class ItemDarkrunicAxe extends ItemAxe {
	public ItemDarkrunicAxe(ToolMaterial mat, String name) {
		super(mat);
		ItemBasic.setItemName(this, name);
		setCreativeTab(Darkness.darknessTab);
	}
}