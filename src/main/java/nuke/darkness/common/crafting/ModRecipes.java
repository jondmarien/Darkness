package nuke.darkness.common.crafting;

import net.minecraft.block.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.oredict.*;
import nuke.darkness.*;
import nuke.darkness.common.*;

public class ModRecipes {

	public static void oreDict() {
		OreDictionary.registerOre("dropletDarkRunic", DarknessContent.droplet_darkrunic);
		OreDictionary.registerOre("ingotDarkRunic", DarknessContent.ingot_darkrunic);
		OreDictionary.registerOre("blockDarkRunic", DarknessContent.block_rune_null);
		OreDictionary.registerOre("woolDarkened", DarknessContent.block_darkened_wool);
	}

	public static void init() {
		oreDict();

		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(DarknessContent.book_binding), true, new Object[] { 
		        		"Ss ", 
		        		"Ss ",
		        		"Ss ", 
		        		'S', Items.STICK, 
		        		's', Items.STRING }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(DarknessContent.compendium), true, new Object[]
		        { "Bb ", "Bb ", "Bb ", 'B', DarknessContent.book_binding, 'b', Items.WRITABLE_BOOK }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(DarknessContent.scroll_bag), true, new Object[]
		        { "   ", "LSL", " L ", 'L', Items.LEATHER, 'S', Items.STRING }));

		GameRegistry
		        .addRecipe(new ShapelessOreRecipe(new ItemStack(DarknessContent.darkened_string, 9), new Object[]
		        { DarknessContent.block_darkened_wool }));

		/*
		 * Material Sets
		 */
		ModRecipes.regMatSet("ingotDarkRunic", "dropletDarkRunic", "blockDarkRunic", DarknessContent.ingot_darkrunic,
		        DarknessContent.droplet_darkrunic, DarknessContent.block_rune_null, DarknessContent.pickaxe_darkrunic,
		        DarknessContent.axe_darkrunic, DarknessContent.sword_darkrunic, DarknessContent.shovel_darkrunic,
		        DarknessContent.hoe_darkrunic);
	}

	/**
	 *  If there ever are too many materials this is an easier way of creating the recipes for the whole material set
	 *  i.e. Block -> ingot (& reversed), ingot -> droplet (& reversed), tool set
	 * @param ingotKey
	 * @param dropletKey
	 * @param blockKey
	 * @param ingot
	 * @param droplet
	 * @param block
	 * @param pickaxe
	 * @param axe
	 * @param sword
	 * @param shovel
	 * @param hoe
	 */
	public static void regMatSet( String ingotKey, String dropletKey, String blockKey, Item ingot, Item droplet,
	        Block block, Item pickaxe, Item axe, Item sword, Item shovel, Item hoe )
	{
		/*
		 * Blocks -> Ingots (& reverse)
		 * Ingots -> Droplets (& reverse)
		 */
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(ingot), true, new Object[]
		        { "XXX", "XXX", "XXX", 'X', droplet }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(block), true, new Object[]
		        { "XXX", "XXX", "XXX", 'X', ingot }));

		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(droplet, 9), new Object[] { ingot }));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingot, 9), new Object[] { block }));

		/*
		 * Tools
		 */
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(pickaxe, 1), true, new Object[]
		        { "XXX", " S ", " S ", 'X', ingotKey, 'S', "stickWood" }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(axe, 1), true, new Object[]
		        { " XX", " SX", " S ", 'X', ingotKey, 'S', "stickWood" }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(axe, 1), true, new Object[]
		        { "XX ", "XS ", " S ", 'X', ingotKey, 'S', "stickWood" }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(sword, 1), true, new Object[]
		        { " X ", " X ", " S ", 'X', ingotKey, 'S', "stickWood" }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(shovel, 1), true, new Object[]
		        { " X ", " S ", " S ", 'X', ingotKey, 'S', "stickWood" }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(hoe, 1), true, new Object[]
		        { " XX", " S ", " S ", 'X', ingotKey, 'S', "stickWood" }));
		GameRegistry
		        .addRecipe(new ShapedOreRecipe(new ItemStack(hoe, 1), true, new Object[]
		        { "XX ", " S ", " S ", 'X', ingotKey, 'S', "stickWood" }));
	}
}