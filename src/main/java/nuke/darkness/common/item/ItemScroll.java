package nuke.darkness.common.item;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;

public class ItemScroll extends ItemBasic {

	public ItemScroll() {
		super("scroll");
		setMaxStackSize(8);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		final ItemStack held = player.getHeldItem(hand);
		
		if(!world.isRemote && player.isSneaking()) {
			held.shrink(1);
			player.sendMessage(new TextComponentTranslation("tooltip.darkness:scroll.used"));
		}
		
		return super.onItemRightClick(world, player, hand);
	}
}