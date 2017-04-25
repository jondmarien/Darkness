package nuke.darkness.gui.containers;

import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fluids.capability.*;

public abstract class DarknessSlot extends Slot {
	final Container container;

	public DarknessSlot(Container container, IInventory inv, int id, int x, int y) {
		super(inv, id, x, y);
		this.container = container;
	}

	@Override
	public boolean isItemValid( ItemStack itemStack ) {
		return true;
	}

	/*
	 * New class named output
	 */
	public static class Output extends DarknessSlot {
		public Output(Container container, IInventory inv, int id, int x, int y) {
			super(container, inv, id, x, y);
		}

		@Override
		public boolean isItemValid( ItemStack itemStack ) {
			return false;
		}

		@Override
		public void onSlotChange( ItemStack p_75220_1_, ItemStack p_75220_2_ ) {
			super.onSlotChange(p_75220_1_, p_75220_2_);
		}
	}
	public static class FluidContainer extends DarknessSlot {
		boolean empty;

		public FluidContainer(Container container, IInventory inv, int id, int x, int y, boolean empty) {
			super(container, inv, id, x, y);
			this.empty = empty;
		}

		@Override
		public boolean isItemValid( ItemStack itemStack ) {
			IFluidHandler handler = FluidUtil.getFluidHandler(itemStack);
			if (handler == null || handler.getTankProperties() == null) return false;
			IFluidTankProperties[] tank = handler.getTankProperties();
			if (tank == null || tank.length < 1 || tank[0] == null) return false;
			if (empty) return tank[0].getContents() == null;
			else return tank[0].getContents() != null;
		}
	}

	public static class ItemDisplay extends DarknessSlot {
		public ItemDisplay(Container container, IInventory inv, int id, int x, int y) {
			super(container, inv, id, x, y);
		}

		@Override
		public boolean isItemValid( ItemStack itemStack ) {
			return false;
		}

		@Override
		public boolean canTakeStack( EntityPlayer player ) {
			return false;
		}
	}

	public static class ContainerCallback extends DarknessSlot {
		public ContainerCallback(Container container, IInventory inv, int id, int x, int y) {
			super(container, inv, id, x, y);
		}

		@Override
		public boolean isItemValid( ItemStack itemStack ) {
			if (this.container instanceof ICallbackContainer)
			    return ((ICallbackContainer) this.container).canInsert(itemStack, slotNumber, this);
			return true;
		}

		@Override
		public boolean canTakeStack( EntityPlayer player ) {
			if (this.container instanceof ICallbackContainer)
			    return ((ICallbackContainer) this.container).canTake(this.getStack(), slotNumber, this);
			return true;
		}
	}
	public interface ICallbackContainer {
		boolean canInsert( ItemStack stack, int slotNum, Slot slot);

		boolean canTake( ItemStack stack, int slotNum, Slot slot);
	}
}