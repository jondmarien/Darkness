package nuke.darkness.common.items.runes;

import javax.annotation.*;

import net.minecraft.entity.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import nuke.darkness.client.util.*;

public class ItemRuneCorrupt extends ItemRuneSwitchableBase {

	public ItemRuneCorrupt() {
		super("corrupt", true);
		setMaxStackSize(1);
	}

	@Override
	public void onRuneUpdate(ItemStack stack, World world, EntityPlayer player, int slot, boolean selected) {
		if (MiscUtils.isFakePlayer(player)) return;
		player.addExperienceLevel(5);
		References.LOGGER.info("corrupt rune update");
		super.onRuneUpdate(stack, world, player, slot, selected);
	}
}