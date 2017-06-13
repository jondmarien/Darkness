package nuke.darkness.common.items;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class ItemRuneDuo extends ItemBase {

	public ItemRuneDuo() {
		super("rune_duo", true);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if ( ! world.isRemote && player.isSneaking() && world.isRainingAt(new BlockPos(player.getPosition()))) {
			world.setWorldTime(0);
			world.setRainStrength(0);
		}
		return super.onItemRightClick(world, player, hand);
	}
}