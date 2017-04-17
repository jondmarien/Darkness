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

	public static ToolMaterial tool_mat_darkrunic;

	public static EnumRarity tool_rarity_darkrunic;

	public static Block block_test;

	public static Item sword_darkrunic, pickaxe_darkrunic, axe_darkrunic, hoe_darkrunic, shovel_darkrunic, ingot_darkrunic;

	public static void init() {
		// Tool Materials
		tool_mat_darkrunic = EnumHelper.addToolMaterial(Darkness.prependModID("test"), 2, 180, 5.5f, 1.5f, 20);
		tool_rarity_darkrunic = EnumHelper.addRarity("special", TextFormatting.AQUA, "Special");

		// Blocks
		blocks.add(block_test = (new BlockTest(Material.ROCK, "block_test", "pickaxe", 1, 1.0F, 10.0F, SoundType.STONE,
		        true)).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16));

		// Items
		items.add(ingot_darkrunic = new ItemBase("ingot_darkrunic", true));

		items.add(sword_darkrunic = new ItemSwordBase(tool_mat_darkrunic, "sword_darkrunic", true));
		items.add(pickaxe_darkrunic = new ItemPickaxeBase(tool_mat_darkrunic, "pickaxe_darkrunic", true));
		items.add(axe_darkrunic = new ItemAxeBase(tool_mat_darkrunic, "axe_darkrunic", true));
		items.add(hoe_darkrunic = new ItemHoeBase(tool_mat_darkrunic, "hoe_darkrunic", true));
		items.add(shovel_darkrunic = new ItemShovelBase(tool_mat_darkrunic, "shovel_darkrunic", true));

		//Repair Materials
		tool_mat_darkrunic.setRepairItem(new ItemStack(ingot_darkrunic));
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