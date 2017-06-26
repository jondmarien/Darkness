package nuke.darkness.common.item;

import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.item.iface.*;

public class ItemRuneSwitchable extends ItemRune implements IEnergizable {

	public ItemRuneSwitchable() {
		super();
	}

	@Override
	public boolean getEnergized(ItemStack stack) {
		return !stack.isEmpty() && MiscUtils.hasNBT(stack).getTagCompound().getBoolean("idle");
	}

	@Override
	public ItemStack setEnergizedState(ItemStack stack, boolean energized) {
		if (!stack.isEmpty()) {
			MiscUtils.hasNBT(stack).getTagCompound().setBoolean("idle", energized);
			return stack;
		}

		return stack;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);

		if (!world.isRemote && !isIdle(stack)) {

			if (player.isSneaking()) setEnergizedState(stack, !getEnergized(stack));

			if (getEnergized(stack)) return super.onItemRightClick(world, player, hand);

		}

		return super.onItemRightClick(world, player, hand);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);

		return onRuneUse(player.getHeldItem(hand), player, world, pos, face, hitX, hitY, hitZ) ? EnumActionResult.SUCCESS: EnumActionResult.FAIL;

	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if (!world.isRemote && entity instanceof EntityPlayerMP && getEnergized(stack)) {
			onRuneUpdate(stack, world, (EntityPlayer) entity, slot, selected);
		}
	}

	public boolean onRuneUse(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing face, float hitX, float hitY, float hitZ) {
		return false;
	}

	public void onRuneUpdate(ItemStack stack, World world, EntityPlayer player, int slot, boolean selected) {
	}
}