package nuke.darkness.items;

import java.util.*;

import net.minecraft.creativetab.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.*;
import nuke.darkness.gloom.*;
import nuke.darkness.util.*;

public class ItemBlackHole extends ItemBase implements IInventoryGloomCapsule, IHeldGloomCapsule, IGloomItem {

	public GloomCapabilityStorage darkness = new GloomCapabilityStorage();

	public ItemBlackHole() {
		super("black_hole", true);
		this.setMaxStackSize(1);
		this.setHasSubtypes(true);
	}

	@Override
	public EnumAction getItemUseAction( ItemStack stack ) {
		return EnumAction.BOW;
	}

	@Override
	public void getSubItems( Item item, CreativeTabs tab, NonNullList<ItemStack> subItems ) {
		ItemStack empty = new ItemStack(this, 1);
		initNBT(empty);
		setGloom(empty, 0.0);
		setGloomCapacity(empty, 10000.0);
		subItems.add(empty);

		ItemStack full = new ItemStack(this, 1);
		initNBT(full);
		setGloom(full, 10000.0);
		setGloomCapacity(full, 10000.0);
		subItems.add(full);
	}

	@Override
	public void onUpdate( ItemStack stack, World world, Entity entity, int slot, boolean isSelected ) {
		if (!stack.hasTagCompound()) {
			initNBT(stack);
			setGloom(stack, 0.0);
			setGloomCapacity(stack, 10000.0);
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick( World world, EntityPlayer player, EnumHand hand ) {
		ItemStack stack = player.getHeldItem(hand);
		if (GloomEnergyUtil.getGloomTotal(player) >= 100.0 || player.capabilities.isCreativeMode) {
			GloomEnergyUtil.removeGloom(player, 100.0);
			player.setActiveHand(hand);
			if (KeybindHandler.charge.isKeyDown() && !(GloomEnergyUtil.getGloomTotal(player) == 1000.0)) {
				
			}
			//TODO: set refill
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
		}

		return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
	}
	
	@Override
	public boolean onDroppedByPlayer( ItemStack item, EntityPlayer player ) {
		//TODO: spawn particles 
		return super.onDroppedByPlayer(item, player);
	}
	
	@Override
	public void onUsingTick( ItemStack stack, EntityLivingBase player, int count ) {
		//TODO: set refill 
		super.onUsingTick(stack, player, count);
	}

	@Override
	public boolean shouldCauseReequipAnimation( ItemStack oldStack, ItemStack newStack, boolean slotChanged ) {
		return slotChanged || oldStack.getItem() != newStack.getItem();
	}

	@Override
	public boolean showDurabilityBar( ItemStack stack ) {
		if (stack.hasTagCompound()) {
			if (getGloom(stack) < getGloomCapacity(stack)) return true;
		}
		return false;
	}

	@Override
	public double getDurabilityForDisplay( ItemStack stack ) {
		if (stack.hasTagCompound())
		    return (getGloomCapacity(stack) - getGloom(stack)) / getGloomCapacity(stack);

		return 0.0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation( ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced ) {
		tooltip.add("Shift and hold right click to absorb darkness. (WIP)");
		//tooltip.add("Hold 'C' to absorb darkness. (WIP)");
		if (stack.hasTagCompound()) tooltip.add("" + getGloom(stack) + "/" + getGloomCapacity(stack));
	}

	public void initNBT( ItemStack stack ) {
		stack.setTagCompound(new NBTTagCompound());
		setGloom(stack, 0.0);
		setGloomCapacity(stack, 10000.0);
	}

	@Override
	public double getGloom( ItemStack stack ) {
		if (!stack.hasTagCompound()) initNBT(stack);
		return stack.getTagCompound().getDouble(Darkness.prependModID("darkness"));
	}

	@Override
	public double getGloomCapacity( ItemStack stack ) {
		if (!stack.hasTagCompound()) initNBT(stack);
		return stack.getTagCompound().getDouble(Darkness.prependModIDCapacity("darkness"));
	}

	@Override
	public void setGloom( ItemStack stack, double val ) {
		if (!stack.hasTagCompound()) initNBT(stack);
		stack.getTagCompound().setDouble(Darkness.prependModID("darkness"), val);
	}

	@Override
	public void setGloomCapacity( ItemStack stack, double val ) {
		if (!stack.hasTagCompound()) initNBT(stack);
		stack.getTagCompound().setDouble(Darkness.prependModIDCapacity("darkness"), val);
	}

	@Override
	public double addAmount( ItemStack stack, double val, boolean add ) {
		if (!stack.hasTagCompound()) initNBT(stack);

		double darkness = stack.getTagCompound().getDouble(Darkness.prependModID("darkness"));
		double capacity = stack.getTagCompound().getDouble(Darkness.prependModIDCapacity("darkness"));

		if (darkness + val > capacity) {
			double added = capacity - darkness;
			if (add) {
				setGloom(stack, capacity);
				darkness = capacity;
			}
			return added;
		}
		if (add) setGloom(stack, darkness + val);

		return val;
	}

	@Override
	public double removeAmount( ItemStack stack, double val, boolean remove ) {
		if (!stack.hasTagCompound()) initNBT(stack);

		double darkness = stack.getTagCompound().getDouble(Darkness.prependModID("darkness"));
		double capacity = stack.getTagCompound().getDouble(Darkness.prependModIDCapacity("darkness"));

		if (darkness - val < 0) {
			double removed = darkness;
			if (remove) setGloom(stack, 0);
			return removed;
		}
		if (remove) setGloom(stack, darkness - val);

		return val;
	}
}