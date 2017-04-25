package nuke.darkness.crafting;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.oredict.*;
import nuke.darkness.*;

public class ModRecipes {

	public static void init() {
		// Ore Dictionary Registry
		OreDictionary.registerOre("dropletDarkRunic", ModContent.droplet_darkrunic);
		OreDictionary.registerOre("ingotDarkRunic", ModContent.ingot_darkrunic); 
		OreDictionary.registerOre("blockDarkRunic", ModContent.block_rune);
		OreDictionary.registerOre("woolDarkened", ModContent.block_darkened_wool);
		
		//Shaped Recipes
		//Blocks & Ores
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.block_rune), true, new Object[] {
				"XXX",
				"XXX",
				"XXX",
				'X', "ingotDarkRunic"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.ingot_darkrunic), true, new Object[] {
				"XXX",
				"XXX",
				"XXX",
				'X', "dropletDarkRunic"}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModContent.droplet_darkrunic, 9), new Object[]{
				"ingotDarkRunic"}));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModContent.ingot_darkrunic, 9), new Object[] {
				"blockDarkRunic"}));
		
		// Misc
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.book_binding), true, new Object[] {
				"Ss ",
				"Ss ",
				"Ss ",
				'S', Items.STICK,
				's', Items.STRING}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.compendium), true, new Object[] {
				"Bb ",
				"Bb ",
				"Bb ",
				'B', ModContent.book_binding,
				'b', Items.WRITABLE_BOOK}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.scroll_bag), true, new Object[] {
				"   ",
				"LSL",
				" L ",
				'L', Items.LEATHER,
				'S', Items.STRING}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModContent.darkened_string, 9), new Object[] {
				ModContent.block_darkened_wool}));
		
		// Tools
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.sword_darkrunic, 1), true, new Object[]{
				" D ",
				" D ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.pickaxe_darkrunic, 1), true, new Object[]{
				"DDD",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.shovel_darkrunic, 1), true, new Object[]{
				" D ",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.axe_darkrunic, 1),true, new Object[]{
				" DD",
				" SD",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.axe_darkrunic, 1), true, new Object[]{
				"DD ",
				"DS ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.hoe_darkrunic, 1), true, new Object[]{
				" DD",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModContent.hoe_darkrunic, 1), true, new Object[]{
				"DD ",
				" S ",
				" S ",
				'D', "ingotDarkRunic",
				'S', "stickWood"}));
		
		//Shapeless Recipes
		
		//Smelting Recipes
		GameRegistry.addSmelting(new ItemStack(ModContent.block_rune), new ItemStack(ModContent.ingot_darkrunic), 0.3f);
		
	}
}