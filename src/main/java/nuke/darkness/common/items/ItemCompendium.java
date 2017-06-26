package nuke.darkness.common.items;

import java.util.*;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class ItemCompendium extends ItemBase {
	public ItemCompendium() {
		super("compendium", true);
		this.setMaxStackSize(1);
	}

	@Override
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.DARK_PURPLE + "Open to reveal the secrets of the darkness.");
		super.addInformation(stack, player, tooltip, advanced);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if (world.isRemote) player.openGui(Darkness.instance, 2, world, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ());

		References.LOGGER.info("Opened Compendium!");

		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}
}