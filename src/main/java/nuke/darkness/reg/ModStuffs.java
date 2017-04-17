package nuke.darkness.reg;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.util.text.*;
import net.minecraftforge.common.util.*;
import nuke.darkness.*;
import nuke.darkness.blocks.*;
import nuke.darkness.items.*;

public class ModStuffs {
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static ArrayList<Item> items = new ArrayList<Item>();

	public static ToolMaterial tool_mat_ness;

	public static EnumRarity tool_rarity_ness;

	public static Block block_test;

	public static Item item_test, sword_ness, pickaxe_ness, axe_ness, hoe_ness, shovel_ness, ingot_ness;

	public static void init() {
		// Tool Materials
		tool_mat_ness = EnumHelper.addToolMaterial(Darkness.prependModID("test"), 2, 180, 5.5f, 1.5f, 20);
		tool_rarity_ness = EnumHelper.addRarity("special", TextFormatting.AQUA, "Special");

		// Blocks
		blocks.add(block_test = (new BlockTest(Material.ROCK, "block_test", "pickaxe", 1, 1.0F, 10.0F, SoundType.STONE,
		        true)).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16));

		// Items
		items.add(item_test = new ItemBase("item_test", true));

		items.add(ingot_ness = new ItemBase("ingot_ness", true));

		items.add(sword_ness = new ItemSwordBase(tool_mat_ness, "sword_ness", true));
		items.add(pickaxe_ness = new ItemPickaxeBase(tool_mat_ness, "pickaxe_ness", true));
		items.add(axe_ness = new ItemAxeBase(tool_mat_ness, "axe_ness", true));
		items.add(hoe_ness = new ItemHoeBase(tool_mat_ness, "hoe_ness", true));
		items.add(shovel_ness = new ItemShovelBase(tool_mat_ness, "shovel_ness", true));

		//Repair Materials
		tool_mat_ness.setRepairItem(new ItemStack(ingot_ness));
	}

	public static void registerRenderer() {
		for (int i = 0; i < blocks.size(); i++) {
			if (blocks.get(i) instanceof IModeledBlock) {
				((IModeledBlock) blocks.get(i)).initModel();
			}
		}

		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof IModeledItem) {
				((IModeledItem) items.get(i)).initModel();
			}
		}
	}
}