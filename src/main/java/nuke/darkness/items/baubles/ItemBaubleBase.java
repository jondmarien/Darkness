package nuke.darkness.items.baubles;

import baubles.api.*;
import baubles.api.cap.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.items.*;
import nuke.darkness.items.*;

public class ItemBaubleBase extends ItemBase implements IBauble {

	BaubleType type = BaubleType.HEAD;

	/**
	 * From Elucent's ItemBaubleBase, which I believe is from Vazkii's ItemBauble....so yeah. It's the same.
	 * https://github.com/Vazkii/Botania/blob/master/src/main/java/vazkii/botania/common/item/equipment/bauble/ItemBauble.java
	 */
	@Override
	public ActionResult<ItemStack> onItemRightClick( World world, EntityPlayer player, EnumHand hand ) {
		ItemStack stack = player.getHeldItem(hand);

		ItemStack toEquip = stack.copy();
		toEquip.setCount(1);

		if (canEquip(toEquip, player)) {
			if (world.isRemote) return ActionResult.newResult(EnumActionResult.SUCCESS, stack);

			IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
			for (int i = 0; i < baubles.getSlots(); i++) {
				if (baubles.isItemValidForSlot(i, toEquip, player)) {
					ItemStack stackInSlot = baubles.getStackInSlot(i);
					if (stackInSlot.isEmpty() || ((IBauble) stackInSlot.getItem()).canUnequip(stackInSlot, player)) {
						baubles.setStackInSlot(i, toEquip);
						stack.shrink(1);

						if (!stackInSlot.isEmpty()) {
							((IBauble) stackInSlot.getItem()).onUnequipped(stackInSlot, player);

							if (stack.isEmpty()) {
								return ActionResult.newResult(EnumActionResult.SUCCESS, stackInSlot);
							} else {
								ItemHandlerHelper.giveItemToPlayer(player, stackInSlot);
							}
						}
						return ActionResult.newResult(EnumActionResult.SUCCESS, stack);
					}
				}
			}
		}

		return ActionResult.newResult(EnumActionResult.PASS, stack);
	}

	public ItemBaubleBase(String name, BaubleType type, boolean addToTab) {
		super(name, addToTab);
	}

	@Override
	public BaubleType getBaubleType( ItemStack arg0 ) {
		return type;
	}
}