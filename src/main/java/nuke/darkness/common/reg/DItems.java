package nuke.darkness.common.reg;

import java.util.*;

import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.common.util.*;
import net.minecraftforge.event.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.registry.GameRegistry.*;
import net.minecraftforge.registries.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.item.*;
import nuke.darkness.common.item.armor.*;
import nuke.darkness.common.item.rune.*;
import nuke.darkness.core.*;

@ObjectHolder(Vars.MODID)
public class DItems {
	public static class ArmorMaterials {
		public static ItemArmor.ArmorMaterial DARKRUNIC_CLOTH = EnumHelper.addArmorMaterial(Darkness.resourcePrefix("darkrunic_cloth"), Darkness.resourcePrefix("darkrunic_cloth"), 20, new int[] {
				2,
				4,
				6,
				3
		}, 20, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);
	}

	public static class ToolMaterials {
		public static Item.ToolMaterial DARKRUNIC = EnumHelper.addToolMaterial("darkrunic", 4, 290, 6.3f, 2.1f, 20);
	}

	public static final ItemCompendium COMPENDIUM = new ItemCompendium();

	public static final ItemBlackHole BLACKHOLE = new ItemBlackHole();

	public static final ItemBasic BOOK_BINDING = new ItemBasic("book_binding");

	public static final ItemBasic DARKENED_STRING = new ItemBasic("darkrunic_string");

	public static final ItemDarkrunicAxe DARKRUNIC_AXE = new ItemDarkrunicAxe(ToolMaterials.DARKRUNIC, "darkrunic_axe");

	public static final ItemBasic DARKRUNIC_DROPLET = new ItemBasic("darkrunic_droplet");

	public static final ItemDarkrunicHoe DARKRUNIC_HOE = new ItemDarkrunicHoe(ToolMaterials.DARKRUNIC, "darkrunic_hoe");

	public static final ItemDarkRunicHood DARKRUNIC_HOOD = new ItemDarkRunicHood();

	public static final ItemBasic DARKRUNIC_INGOT = new ItemBasic("darkrunic_ingot");

	public static final ItemDarkRunicLegs DARKRUNIC_LEGS = new ItemDarkRunicLegs();

	public static final ItemDarkrunicPickaxe DARKRUNIC_PICKAXE = new ItemDarkrunicPickaxe(ToolMaterials.DARKRUNIC, "darkrunic_pickaxe");

	public static final ItemDarkrunicShovel DARKRUNIC_SHOVEL = new ItemDarkrunicShovel(ToolMaterials.DARKRUNIC, "darkrunic_shovel");

	public static final ItemDarkrunicSword DARKRUNIC_SWORD = new ItemDarkrunicSword(ToolMaterials.DARKRUNIC, "darkrunic_sword");

	public static final ItemDarkRunicTorso DARKRUNIC_TORSO = new ItemDarkRunicTorso();

	public static final ItemRuneCorrupt RUNE_CORRUPT = new ItemRuneCorrupt();

	public static final ItemScroll SCROLL = new ItemScroll();

	public static final ItemScrollBag SCROLL_BAG = new ItemScrollBag();

	public static final ItemBasic SLATE = new ItemBasic("slate");

	private static void initItems() {
		ToolMaterials.DARKRUNIC.setRepairItem(new ItemStack(DARKRUNIC_INGOT));
		ArmorMaterials.DARKRUNIC_CLOTH.setRepairItem(new ItemStack(DARKENED_STRING));
	}

	@Mod.EventBusSubscriber(modid = Vars.MODID)
	public static class RegHandler {
		public static Set<Item> ITEMS = new HashSet<>();

		public static void regItems(RegistryEvent.Register<Item> e) {
			final Item[] items = {
					COMPENDIUM,
					BLACKHOLE,
					BOOK_BINDING,
					DARKENED_STRING,
					DARKRUNIC_AXE,
					DARKRUNIC_DROPLET,
					DARKRUNIC_HOE,
					DARKRUNIC_HOOD,
					DARKRUNIC_INGOT,
					DARKRUNIC_LEGS,
					DARKRUNIC_PICKAXE,
					DARKRUNIC_SHOVEL,
					DARKRUNIC_SWORD,
					DARKRUNIC_TORSO,
					RUNE_CORRUPT,
					SCROLL,
					SCROLL_BAG,
					SLATE
			};

			IForgeRegistry<Item> reg = e.getRegistry();

			for (Item i : items) {
				reg.register(i);
				ITEMS.add(i);
			}

			initItems();
		}
	}
}