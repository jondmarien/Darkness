package nuke.darkness.common.item;

import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import nuke.darkness.core.*;

public class ItemDarkrunicPickaxe extends ItemPickaxe {
	public ItemDarkrunicPickaxe(ToolMaterial mat, String name) {
		super(mat);
		ItemBasic.setItemName(this, name);
		setCreativeTab(Darkness.darknessTab);
	}
}