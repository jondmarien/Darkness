package nuke.darkness.common.items.runes;

import java.util.*;

import javax.annotation.*;

import org.apache.commons.lang3.text.*;

import net.minecraft.client.renderer.*;
import net.minecraft.client.util.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.api.items.*;
import nuke.darkness.client.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class ItemRuneSwitchableBase extends ItemRuneSwitchable implements IMeshHelper {

	protected final String tooltip;
	private final String name;

	public ItemRuneSwitchableBase(String name, boolean addToTab) {
		super();

		setUnlocalizedName(References.MODID + ".rune." + name);
		setRegistryName(Darkness.prependModID(name));
		if(addToTab) setCreativeTab(Darkness.darknessTab);
		//GameRegistry.register(this);

		this.name = name;
		this.tooltip = "tooltip.darkness.rune." + name + ".";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		super.addInformation(stack, player, tooltip, advanced);

		if (!stack.hasTagCompound()) return;

		tooltip.add("tooltip.darkness." + (getEnergized(stack) ? "energized": "de-energized"));

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
}