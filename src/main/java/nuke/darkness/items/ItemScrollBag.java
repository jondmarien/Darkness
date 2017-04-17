package nuke.darkness.items;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import nuke.darkness.*;

public class ItemScrollBag extends ItemBase {
	public ItemScrollBag() {
		super("scroll_bag", true);
		this.setMaxStackSize(1);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick( World world, EntityPlayer player, EnumHand hand ) {
		if (world.isRemote) player.openGui(Darkness.instance, 1, world, player.getPosition().getX(),
		        player.getPosition().getY(), player.getPosition().getZ());

		return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(hand));
	}
}