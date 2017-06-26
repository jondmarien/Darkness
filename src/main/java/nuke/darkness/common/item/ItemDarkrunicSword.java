package nuke.darkness.common.item;

import net.minecraft.item.*;
import nuke.darkness.core.*;

public class ItemDarkrunicSword extends ItemSword {
	public ItemDarkrunicSword(ToolMaterial material, String name) {
		super(material);
		ItemBasic.setItemName(this, name);
		setCreativeTab(Darkness.darknessTab);
	}
}