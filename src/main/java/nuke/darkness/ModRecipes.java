package nuke.darkness;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.oredict.*;

public class ModRecipes {

	public static void init() {
		// Ore Dictionary Registry
		OreDictionary.registerOre("dropletDarkRunic", ModStuffs.droplet_darkrunic);
		OreDictionary.registerOre("ingotDarkRunic", ModStuffs.ingot_darkrunic); 
		OreDictionary.registerOre("blockDarkRunic", ModStuffs.block_rune);
		
		//Shaped Recipes
		//Blocks & Ores
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.block_rune), true, new Object[] {
				"XXX",
				"XXX",
				"XXX",
				'X', "ingotDarkRunic"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.ingot_darkrunic), true, new Object[] {
				"XXX",
				"XXX",
				"XXX",
				'X', "dropletDarkRunic"}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModStuffs.droplet_darkrunic, 9), new Object[]{
				"ingotDarkRunic"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModStuffs.ingot_darkrunic, 9), new Object[] {
				"blockDarkRunic"}));
		
		// Misc
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.book_binding), true, new Object[] {
				"Ss ",
				"Ss ",
				"Ss ",
				'S', Items.STICK,
				's', Items.STRING}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.compendium), true, new Object[] {
				"Bb ",
				"Bb ",
				"Bb ",
				'B', ModStuffs.book_binding,
				'b', Items.WRITABLE_BOOK}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.scroll_bag), true, new Object[] {
				"   ",
				"LSL",
				" L ",
				'L', Items.LEATHER,
				'S', Items.STRING}));
		// Tools
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.sword_darkrunic, 1), true, new Object[]{
				" D ",
				" D ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.pickaxe_darkrunic, 1), true, new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.shovel_darkrunic, 1), true, new Object[]{
				" D ",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.axe_darkrunic, 1),true, new Object[]{
				" DD",
				" SD",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.axe_darkrunic, 1), true, new Object[]{
				"DD ",
				"DS ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.hoe_darkrunic, 1), true, new Object[]{
				" DD",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModStuffs.hoe_darkrunic, 1), true, new Object[]{
				"DD ",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		
		//Shapeless Recipes
		
		//Smelting Recipes
		GameRegistry.addSmelting(new ItemStack(ModStuffs.block_rune), new ItemStack(ModStuffs.ingot_darkrunic), 0.3f);
		
	}
}