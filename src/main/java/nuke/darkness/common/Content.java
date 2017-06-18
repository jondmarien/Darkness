package nuke.darkness.common;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.item.Item.*;
import net.minecraft.item.ItemArmor.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraftforge.common.util.*;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.blocks.*;
import nuke.darkness.common.blocks.fluids.*;
import nuke.darkness.common.fluids.*;
import nuke.darkness.common.items.*;
import nuke.darkness.common.items.armor.*;
import nuke.darkness.common.world.*;
import nuke.darkness.core.*;

public class Content {
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static ArrayList<Item> items = new ArrayList<Item>();
	public static ArrayList<ItemArmor> armor = new ArrayList<ItemArmor>();

	public static WorldGenOres world_gen_ores;

	public static ToolMaterial tool_mat_darkrunic, tool_mat_darkerrunic, tool_mat_darkestrunic;
	public static ArmorMaterial armor_mat_darkrunic;
	public static EnumRarity tool_rarity_darkrunic, tool_rarity_darkerrunic, tool_rarity_darkestrunic;

	public static DamageSource damage_shade;

	public static Fluid fluid_molten_darkrunic;

	public static Block block_rune_null, block_molten_dark_runic, block_darkened_web, block_darkened_wool;
	//public static Block ore_duo, ore_tri;

	//public static Item rune_duo, rune_tri;
	//public static Item gem_duo, gem_tri;
	
	public static Item slate_blank, rune_corrupt;

	public static Item compendium, book_binding, scroll_bag, darkened_string, black_hole;

	public static Item sword_darkrunic, pickaxe_darkrunic, axe_darkrunic, hoe_darkrunic, shovel_darkrunic, ingot_darkrunic, droplet_darkrunic;

	public static ItemArmor darkrunic_hood, darkrunic_torso, darkrunic_legs;

	public static void init() {
		// Shade (Darkness) Damage
		damage_shade = new DamageGloom();

		// Tool Materials
		tool_mat_darkrunic = EnumHelper.addToolMaterial(Darkness.prependModID("darkrunic"), 4, 290, 6.3f, 2.1f, 20);
		armor_mat_darkrunic = EnumHelper.addArmorMaterial(Darkness.prependModID("darkrunic_cloth"), Darkness.prependModID("darkrunic_cloth"), 20, new int[] { 2, 4, 6, 3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
		tool_rarity_darkrunic = EnumHelper.addRarity("rare", TextFormatting.DARK_PURPLE, "Rare");

		// Blocks
		blocks.add(block_rune_null = new BlockRune(Material.ROCK, "block_rune_null", "pickaxe", 1, 1.0F, 11.0F, SoundType.STONE, true).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16));
		blocks.add(block_darkened_web = new BlockDarkenedWeb(Material.WEB, "block_darkened_web", "sword", 1, 1.0F, 1.0F, SoundType.CLOTH, true).setIsFullCube(false).setIsOpaqueCube(false).setLightOpacity(0));
		blocks.add(block_darkened_wool = new BlockDarkenedWool(Material.CLOTH, "block_darkened_wool", "sword", 1, 1.0F, 1.0F, SoundType.CLOTH, true).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16));

		//blocks.add(ore_tri = new BlockTriGemOre().setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16).setCreativeTab(Darkness.darknessTab));
		//blocks.add(ore_duo = new BlockBase(Material.ROCK, "ore_duo", "pickaxe", 1, 2.0F, 13.0F, SoundType.STONE, true).setIsFullCube(true).setIsOpaqueCube(true).setLightOpacity(16).setCreativeTab(Darkness.darknessTab));

		// Items
		items.add(compendium = new ItemCompendium());
		items.add(scroll_bag = new ItemScrollBag());
		items.add(black_hole = new ItemBlackHole());

		items.add(book_binding = new ItemBase("book_binding", true));
		items.add(darkened_string = new ItemBase("darkened_string", true));

		items.add(droplet_darkrunic = new ItemBase("droplet_darkrunic", true));
		items.add(ingot_darkrunic = new ItemBase("ingot_darkrunic", true));
		items.add(sword_darkrunic = new ItemSwordBase(tool_mat_darkrunic, "sword_darkrunic", true));
		items.add(pickaxe_darkrunic = new ItemPickaxeBase(tool_mat_darkrunic, "pickaxe_darkrunic", true));
		items.add(axe_darkrunic = new ItemAxeBase(tool_mat_darkrunic, "axe_darkrunic", true));
		items.add(hoe_darkrunic = new ItemHoeBase(tool_mat_darkrunic, "hoe_darkrunic", true));
		items.add(shovel_darkrunic = new ItemShovelBase(tool_mat_darkrunic, "shovel_darkrunic", true));

		//items.add(gem_duo = new ItemBase("gem_duo", true));
		//items.add(gem_tri = new ItemBase("gem_tri", true));

		//items.add(rune_duo = new ItemRuneDuo());
		//items.add(rune_tri = new ItemRuneTri());
		
		items.add(slate_blank = new ItemBase("slate_blank", true));
		items.add(rune_corrupt = new ItemBase("rune_corrupt", true));

		// Armor
		armor.add(darkrunic_hood = new ItemDarkRunicHood());
		armor.add(darkrunic_torso = new ItemDarkRunicTorso());
		armor.add(darkrunic_legs = new ItemDarkRunicLegs());

		// Fluids
		FluidRegistry.registerFluid(fluid_molten_darkrunic = new FluidMoltenDarkRunic());
		blocks.add(block_molten_dark_runic = (new BlockMoltenDarkRunic("darkrunic", true)));
		FluidRegistry.addBucketForFluid(fluid_molten_darkrunic);

		// Repair Materials
		tool_mat_darkrunic.setRepairItem(new ItemStack(ingot_darkrunic));
		armor_mat_darkrunic.repairMaterial = new ItemStack(darkened_string, 1);

		world_gen_ores = new WorldGenOres();
		GameRegistry.registerWorldGenerator(world_gen_ores, 1);
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

		for (int i = 0; i < armor.size(); i++) {
			if (armor.get(i) instanceof IModeledItem) {
				((IModeledItem) armor.get(i)).initModel();
			}
		}
	}
}