package nuke.darkness.guide;

import java.util.*;

import javax.annotation.*;

import amerifrance.guideapi.api.*;
import amerifrance.guideapi.api.impl.*;
import amerifrance.guideapi.api.impl.abstraction.*;
import amerifrance.guideapi.category.*;
import amerifrance.guideapi.entry.*;
import amerifrance.guideapi.page.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.*;
import net.minecraftforge.oredict.*;
import nuke.darkness.*;

@GuideBook
public class Compendium implements IGuideBook {

	public static Book compendium;

	@Nonnull
	@Override
	public Book buildBook() {
		Map<ResourceLocation, EntryAbstract> entries = new LinkedHashMap<ResourceLocation, EntryAbstract>();
		List<CategoryAbstract> categories = new ArrayList<CategoryAbstract>();
		List<IPage> pageOne = new ArrayList<IPage>();
		List<IPage> pageTwo = new ArrayList<IPage>();

		pageOne.add(new PageText("Intro Page"));
		pageTwo.add(
		        new PageIRecipe(new ShapedOreRecipe(new ItemStack(ModContent.sword_darkrunic, 1), true, new Object[]
		        { " D ", " D ", " S ", 'D', "ingotDarkRunic", 'S', "stickWood" })));
		pageTwo.add(new PageFurnaceRecipe("oreGold"));

		entries.put(new ResourceLocation("intro", "entry_one"),
		        new EntryItemStack(pageOne, "Entry One", new ItemStack(ModContent.axe_darkrunic)));
		entries.put(new ResourceLocation("info", "entry_two"),
		        new EntryItemStack(pageOne, "Entry Two", new ItemStack(ModContent.sword_darkrunic)));

		categories.add(new CategoryItemStack(entries, "Lore", new ItemStack(Items.PAPER)));

		compendium = new Book();
		compendium.setTitle("The Dark Compendium");
		compendium.setDisplayName("The Dark Compendium");
		compendium.setAuthor("The Dark Author");
		compendium.setCategoryList(categories);
		compendium.setRegistryName(new ResourceLocation("darkness", "compendium"));
		compendium.setSpawnWithBook(true);

		return compendium;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void handleModel( ItemStack bookStack ) {
		GuideAPI.setModel(compendium);
	}

	@Override
	public void handlePost( ItemStack bookStack ) {
		GameRegistry.addShapelessRecipe(bookStack, ModContent.book_binding, ModContent.droplet_darkrunic,
		        ModContent.darkened_string);
	}
}