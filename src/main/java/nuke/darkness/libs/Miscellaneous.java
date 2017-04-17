package nuke.darkness.libs;

import net.minecraft.entity.item.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.items.*;
import net.minecraftforge.oredict.*;

public class Miscellaneous {
	public static ItemStack getRepairItem( ItemStack stack ) {
		// for Axes
		if (stack.getItem() instanceof ItemTool) {
			ItemStack is = ((ItemTool) stack.getItem()).getToolMaterial().getRepairItemStack();
			if (is.getItemDamage() == OreDictionary.WILDCARD_VALUE) {
				is.setItemDamage(0);
			}
			return is;
		}
		// for Swords
		if (stack.getItem() instanceof ItemSword) {
			ItemStack is = ToolMaterial.valueOf(((ItemSword) stack.getItem()).getToolMaterialName())
			        .getRepairItemStack();
			if (is.getItemDamage() == OreDictionary.WILDCARD_VALUE) {
				is.setItemDamage(0);
			}
			return is;
		}
		// for Armor
		if (stack.getItem() instanceof ItemArmor) {
			ItemStack is = ((ItemArmor) stack.getItem()).getArmorMaterial().getRepairItemStack();
			if (is.getItemDamage() == OreDictionary.WILDCARD_VALUE) {
				is.setItemDamage(0);
			}
			return is;
		}
		return ItemStack.EMPTY;
	}

	public static EnumFacing getOppositeFace( EnumFacing face ) {
		if (face == EnumFacing.DOWN) return EnumFacing.UP;
		else if (face == EnumFacing.UP) return EnumFacing.DOWN;
		else return face.getOpposite();
	}
	
	public static EnumFacing getOppositeHorizontalFace( EnumFacing face ) {
		if (face == EnumFacing.DOWN) return EnumFacing.DOWN;
		else if (face == EnumFacing.UP) return EnumFacing.UP;
		else return face.getOpposite();
	}

	public static EnumFacing getOppositeVerticalFace( EnumFacing face ) {
		if (face == EnumFacing.DOWN) return EnumFacing.UP;
		else if (face == EnumFacing.UP) return EnumFacing.DOWN;
		else return face;
	}

	public static int getResourceCount( ItemStack stack ) {
		int count = 0;
		if (stack.getItem() instanceof ItemArmor) {
			if (((ItemArmor) stack.getItem()).armorType == EntityEquipmentSlot.HEAD) {
				count = 5;
			}
			if (((ItemArmor) stack.getItem()).armorType == EntityEquipmentSlot.CHEST) {
				count = 8;
			}
			if (((ItemArmor) stack.getItem()).armorType == EntityEquipmentSlot.LEGS) {
				count = 7;
			}
			if (((ItemArmor) stack.getItem()).armorType == EntityEquipmentSlot.FEET) {
				count = 4;
			}
		}
		if (stack.getItem() instanceof ItemSword) {
			count = 2;
		}
		if (stack.getItem() instanceof ItemBow) {
			count = 3;
		}
		if (stack.getItem() instanceof ItemTool) {
			if (stack.getItem() instanceof ItemPickaxe
			        || stack.getItem().getHarvestLevel(stack, "pickaxe", null, null) > -1)
			{
				count = 3;
			}
			if (stack.getItem() instanceof ItemAxe || stack.getItem().getHarvestLevel(stack, "axe", null, null) > -1) {
				count = 3;
			}
			if (stack.getItem() instanceof ItemHoe) {
				count = 2;
			}
			if (stack.getItem() instanceof ItemSpade) {
				count = 1;
			}
			count = 1;
		}
		if (count > 0) { return (int) ((float) count
		        * (1.0f - (float) stack.getItemDamage() / (float) stack.getMaxDamage())); }
		return -1;
	}

	public static void spawnInventoryWorld( World world, double x, double y, double z, IItemHandler inventory ) {
		if (inventory != null && !world.isRemote) {
			for (int i = 0; i < inventory.getSlots(); i++) {
				if (inventory.getStackInSlot(i) != ItemStack.EMPTY) {
					world.spawnEntity(new EntityItem(world, x, y, z, inventory.getStackInSlot(i)));
				}
			}
		}
	}

	public static boolean matchOreDict( ItemStack stackOne, ItemStack stackTwo ) {
		int[] keysOne = OreDictionary.getOreIDs(stackOne);
		int[] keysTwo = OreDictionary.getOreIDs(stackTwo);
		for (int i = 0; i < keysOne.length; i++) {
			for (int j = 0; j < keysTwo.length; j++) {
				if (keysOne[i] == keysTwo[j]) return true;
			}
		}
		return false;
	}

	public static int intColor( int r, int g, int b ) {
		return (r * 65536 + g * 256 + b);
	}
}