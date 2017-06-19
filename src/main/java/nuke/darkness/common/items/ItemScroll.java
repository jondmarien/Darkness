package nuke.darkness.common.items;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class ItemScroll extends ItemBase {

	public ItemScroll() {
		super("scroll", true);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		return super.onItemRightClick(world, player, hand);
	}

}