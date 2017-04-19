package nuke.darkness;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.item.ItemArmor.*;
import net.minecraft.util.text.*;
import net.minecraftforge.common.util.*;
import net.minecraftforge.fluids.*;
import nuke.darkness.blocks.*;
import nuke.darkness.blocks.fluids.*;
import nuke.darkness.fluids.*;
import nuke.darkness.items.*;

public class ModStuffs {
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static ArrayList<Item> items = new ArrayList<Item>();

	public static ToolMaterial tool_mat_darkrunic;
	public static ArmorMaterial armor_mat_darkrunic_cloth;

	public static EnumRarity tool_rarity_darkrunic;

	public static Block block_test, block_molten_dark_runic, block_rune;

	public static Fluid fluid_molten_darkrunic;

	public static Item bag, sword_darkrunic, pickaxe_darkrunic, axe_darkrunic, hoe_darkrunic, shovel_darkrunic,
	        ingot_darkrunic, droplet_darkrunic;

	public static void init() {
		// Tool Materials
		tool_mat_darkrunic = EnumHelper.addToolMaterial(Darkness.prependModID("darkrunic"), 4, 290, 6.3f, 2.1f, 20);
		armor_mat_darkrunic_cloth = EnumHelper.addArmorMaterial(Darkness.prependModID("darkrunic_cloth"),
		        Darkness.prependModID("darkrunic_cloth"), 20, new int[]
		        { 2, 4, 6, 3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		tool_rarity_darkrunic = EnumHelper.addRarity("rare", TextFormatting.DARK_PURPLE, "Rare");

		// Blocks
		blocks.add(block_test = (new BlockTest(Material.ROCK, "block_test", "pickaxe", 1, 1.0F, 10.0F, SoundType.STONE,
		        true)).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16));
		blocks.add(block_rune = (new BlockRune(Material.ROCK, "block_rune", "pickaxe", 1, 1.0F, 11.0F, SoundType.STONE,
		        true).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16)));

		// Items
		items.add(bag = new ItemScrollBag());

		items.add(droplet_darkrunic = new ItemBase("droplet_darkrunic", true));
		items.add(ingot_darkrunic = new ItemBase("ingot_darkrunic", true));
		items.add(sword_darkrunic = new ItemSwordBase(tool_mat_darkrunic, "sword_darkrunic", true));
		items.add(pickaxe_darkrunic = new ItemPickaxeBase(tool_mat_darkrunic, "pickaxe_darkrunic", true));
		items.add(axe_darkrunic = new ItemAxeBase(tool_mat_darkrunic, "axe_darkrunic", true));
		items.add(hoe_darkrunic = new ItemHoeBase(tool_mat_darkrunic, "hoe_darkrunic", true));
		items.add(shovel_darkrunic = new ItemShovelBase(tool_mat_darkrunic, "shovel_darkrunic", true));

		//Fluids
		FluidRegistry.registerFluid(fluid_molten_darkrunic = new FluidMoltenDarkRunic());
		blocks.add(block_molten_dark_runic = (new BlockMoltenDarkRunic("darkrunic", true)));
		FluidRegistry.addBucketForFluid(fluid_molten_darkrunic);

		//Repair Materials
		tool_mat_darkrunic.setRepairItem(new ItemStack(ingot_darkrunic));
		armor_mat_darkrunic_cloth.repairMaterial = new ItemStack(Items.STRING, 1);
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