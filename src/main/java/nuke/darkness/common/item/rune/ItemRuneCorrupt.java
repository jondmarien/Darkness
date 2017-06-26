package nuke.darkness.common.item.rune;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import nuke.darkness.client.util.*;

public class ItemRuneCorrupt extends ItemRuneSwitchableBase {

	public ItemRuneCorrupt() {
		super("corrupt");
		setMaxStackSize(1);
	}

	@Override
	public void onRuneUpdate(ItemStack stack, World world, EntityPlayer player, int slot, boolean selected) {
		if (MiscUtils.isFakePlayer(player)) return;
		player.addExperienceLevel(5);
		Vars.LOGGER.info("Corrupt rune Tex Update");
		super.onRuneUpdate(stack, world, player, slot, selected);
	}
}