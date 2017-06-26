package nuke.darkness.common.items.armor;

import java.util.*;

import com.mojang.realmsclient.gui.*;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.util.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.common.*;

public class ItemDarkRunicHood extends ItemArmorBase {

	public ItemDarkRunicHood() {
		super("darkrunic_hood", true, Content.armor_mat_darkrunic, 0, EntityEquipmentSlot.HEAD);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(ChatFormatting.BOLD + "Dark Runic Hood");
	}
}