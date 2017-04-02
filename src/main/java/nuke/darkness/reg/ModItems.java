package nuke.darkness.reg;

import java.util.*;

import net.minecraft.item.*;
import nuke.darkness.items.*;

public class ModItems {

	public static ArrayList<Item> items = new ArrayList<Item>();

	public static Item item_test;

	public static void init() {
		//items.add(item_test = (new ItemTest(Material.ROCK, "block_test", "pickaxe", 1, 1.0F, 10.0F, SoundType.STONE, true)).setLightOpacity(16));
		
	}

	public static void registerRenderer() {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof IModeledItem) {
				((IModeledItem) items.get(i)).initModel();
			}
		}
	}
}