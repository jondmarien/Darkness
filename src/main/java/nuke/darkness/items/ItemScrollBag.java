package nuke.darkness.items;

import java.util.*;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;
import nuke.darkness.*;

public class ItemScrollBag extends ItemBase {
	public ItemScrollBag() {
		super("scroll_bag", true);
		this.setMaxStackSize(1);
	}

	@Override
	public void addInformation( ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced ) {
		tooltip.add(TextFormatting.BOLD + "Store your scrolls.");
		super.addInformation(stack, player, tooltip, advanced);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick( World world, EntityPlayer player, EnumHand hand ) {
		if (world.isRemote) player.openGui(Darkness.instance, 1, world, player.getPosition().getX(),
		        player.getPosition().getY(), player.getPosition().getZ());

		References.LOGGER.info("Opened Bag!!");

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}
}