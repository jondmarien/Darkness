package nuke.darkness.reg;

import java.util.*;

import net.minecraft.item.*;
import nuke.darkness.items.*;

public class ModItems {

	public static ArrayList<Item> items = new ArrayList<Item>();

	public static Item item_test;

	public static void init() {
		items.add(item_test = (new ItemBase("item_test", true)));
		
	}

	public static void registerRenderer() {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof IModeledItem) {
				((IModeledItem) items.get(i)).initModel();
			}
		}
	}
}