package nuke.darkness.common.item;

import java.util.*;

import net.minecraft.client.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class ItemScrollBag extends ItemBasic {

	public ItemScrollBag() {
		super("compendium");
		setMaxStackSize(1);
	}

	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(TextFormatting.DARK_PURPLE + TextUtil.localizeEffect("tooltip.darkness:scrollbag"));

		super.addInformation(stack, world, tooltip, flag);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		//if (!world.isRemote) player.openGui(Darkness.instance, 1, world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());
		//TODO: Open Gui
		Vars.LOGGER.info("Opened Scrollbag");

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}
}