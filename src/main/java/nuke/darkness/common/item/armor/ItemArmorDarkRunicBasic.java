package nuke.darkness.common.item.armor;

import java.util.*;

import com.google.common.base.*;
import com.google.common.collect.*;

import net.minecraft.inventory.*;
import net.minecraft.item.*;
import nuke.darkness.common.item.*;
import nuke.darkness.core.*;

public class ItemArmorDarkRunicBasic extends ItemArmor {

	private static final Map<EntityEquipmentSlot, String> SLOT_NAMES;

	static {
		Map<EntityEquipmentSlot, String> slotNames = new HashMap<>();
		slotNames.put(EntityEquipmentSlot.HEAD, "Hood");
		slotNames.put(EntityEquipmentSlot.CHEST, "Torso");
		slotNames.put(EntityEquipmentSlot.LEGS, "Legs");

		SLOT_NAMES = Maps.immutableEnumMap(slotNames);
	}

	public ItemArmorDarkRunicBasic(ArmorMaterial mat, int renderIndex, EntityEquipmentSlot slot, String name) {
		super(mat, 0, slot); // TODO: Change renderIndex to -1 for custom render type

		Preconditions.checkArgument(SLOT_NAMES.containsKey(slot), "Invalid slot %s", slot);

		ItemBasic.setItemName(this, name + "_" + SLOT_NAMES.get(slot));
		setCreativeTab(Darkness.darknessTab);
	}
}