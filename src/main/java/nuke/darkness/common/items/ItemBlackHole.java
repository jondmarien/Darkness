package nuke.darkness.common.items;

import java.util.*;

import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.shade.*;
import nuke.darkness.core.*;

public class ItemBlackHole extends ItemBase implements IInventoryShadeBlackhole, IHeldShadeBlackhole, IShadeItem {

	public ShadeCapabilityStorage shade = new ShadeCapabilityStorage();

	public ItemBlackHole() {
		super("black_hole", true);
		this.setMaxStackSize(1);
		this.setHasSubtypes(true);
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
		return EnumAction.BOW;
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tab, NonNullList<ItemStack> subItems) {
		ItemStack empty = new ItemStack(this, 1);
		initNBT(empty);
		setShade(empty, 0.0);
		setShadeCapacity(empty, 10000.0);
		subItems.add(empty);

		ItemStack full = new ItemStack(this, 1);
		initNBT(full);
		setShade(full, 10000.0);
		setShadeCapacity(full, 10000.0);
		subItems.add(full);
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean isSelected) {
		if (!stack.hasTagCompound()) {
			initNBT(stack);
			setShade(stack, 0.0);
			setShadeCapacity(stack, 10000.0);
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		if (ShadeInventoryUtil.getShadeTotal(player) >= 100.0 || player.capabilities.isCreativeMode) {
			ShadeInventoryUtil.removeShade(player, 100.0);
			player.setActiveHand(hand);
			if (KeybindHandler.charge.isKeyDown() && !(ShadeInventoryUtil.getShadeTotal(player) == 1000.0)) {
				addAmount(stack, 100, true); // TODO: Tick Refill more than once
			}
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
		}

		return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		// TODO: spawn particles
		return super.onDroppedByPlayer(item, player);
	}

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return slotChanged || oldStack.getItem() != newStack.getItem();
	}

	@Override
	public boolean showDurabilityBar(ItemStack stack) {
		if (stack.hasTagCompound()) {
			if (getShade(stack) < getShadeCapacity(stack)) return true;
		}
		return false;
	}

	@Override
	public double getDurabilityForDisplay(ItemStack stack) {
		if (stack.hasTagCompound()) return (getShadeCapacity(stack) - getShade(stack)) / getShadeCapacity(stack);

		return 0.0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		tooltip.add("Hold C to absorb shade. (WIP)");
		if (stack.hasTagCompound()) tooltip.add("" + getShade(stack) + "/" + getShadeCapacity(stack));
	}

	public void initNBT(ItemStack stack) {
		stack.setTagCompound(new NBTTagCompound());
		setShade(stack, 0.0);
		setShadeCapacity(stack, 10000.0);
	}

	@Override
	public double getShade(ItemStack stack) {
		if (!stack.hasTagCompound()) initNBT(stack);
		return stack.getTagCompound().getDouble(Darkness.prependModID("shade"));
	}

	@Override
	public double getShadeCapacity(ItemStack stack) {
		if (!stack.hasTagCompound()) initNBT(stack);
		return stack.getTagCompound().getDouble(Darkness.prependModIDCapacity("shade"));
	}

	@Override
	public void setShade(ItemStack stack, double val) {
		if (!stack.hasTagCompound()) initNBT(stack);
		stack.getTagCompound().setDouble(Darkness.prependModID("shade"), val);
	}

	@Override
	public void setShadeCapacity(ItemStack stack, double val) {
		if (!stack.hasTagCompound()) initNBT(stack);
		stack.getTagCompound().setDouble(Darkness.prependModIDCapacity("shade"), val);
	}

	@Override
	public double addAmount(ItemStack stack, double val, boolean add) {
		if (!stack.hasTagCompound()) initNBT(stack);

		double shade = stack.getTagCompound().getDouble(Darkness.prependModID("shade"));
		double capacity = stack.getTagCompound().getDouble(Darkness.prependModIDCapacity("shade"));

		System.out.println(shade + ", " + val + ", " + capacity + ", " + add);

		if (shade + val > capacity) {
			double added = capacity - shade;
			if (add) {
				setShade(stack, capacity);
				shade = capacity;
			}
			return added;
		}
		if (add) setShade(stack, shade + val);

		return val;
	}

	@Override
	public double removeAmount(ItemStack stack, double val, boolean remove) {
		if (!stack.hasTagCompound()) initNBT(stack);

		double shade = stack.getTagCompound().getDouble(Darkness.prependModID("shade"));
		double capacity = stack.getTagCompound().getDouble(Darkness.prependModIDCapacity("shade"));

		if (shade - val < 0) {
			double removed = shade;
			if (remove) setShade(stack, 0);
			return removed;
		}
		if (remove) setShade(stack, shade - val);

		return val;
	}
}