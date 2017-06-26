package nuke.darkness.common.item.rune;

import java.util.*;

import javax.annotation.*;

import org.apache.commons.lang3.text.*;

import net.minecraft.client.renderer.*;
import net.minecraft.client.util.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.client.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.item.*;
import nuke.darkness.core.*;

public class ItemRuneSwitchableBase extends ItemRuneSwitchable implements IMeshHelper {

	protected final String tooltip;
	private final String name;

	public ItemRuneSwitchableBase(String name) {
		setItemName(this, name);
		setCreativeTab(Darkness.darknessTab);

		this.name = name;
		this.tooltip = "tooltip.darkness.rune." + name + ".";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag flag) {
		if (!stack.hasTagCompound()) return;

		tooltip.add("tooltip.darkness." + (getEnergized(stack) ? "energized": "de-energized"));

		super.addInformation(stack, player, tooltip, flag);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemMeshDefinition getMeshDefinition() {
		return new CustomMeshDefinitionEnergizable("ItemRune" + WordUtils.capitalize(name));
	}

	@Nullable
	@Override
	public ResourceLocation getCustomLocation() {
		return null;
	}

	@Override
	public List<String> getVariants() {
		List<String> end = new ArrayList<String>();

		end.add("energize=false");
		end.add("energize=true");

		return end;
	}

	public static void setItemName(Item item, String name) {
		item.setRegistryName(Vars.MODID, name);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}