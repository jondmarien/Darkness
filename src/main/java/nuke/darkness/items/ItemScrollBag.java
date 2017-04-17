package nuke.darkness.items;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class ItemScrollBag extends ItemBase {
	public ItemScrollBag(String name, boolean addToTab) {
		super(name, addToTab);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick( World worldIn, EntityPlayer playerIn, EnumHand handIn ) {
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}