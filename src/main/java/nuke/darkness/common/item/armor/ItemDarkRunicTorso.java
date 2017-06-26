package nuke.darkness.common.item.armor;

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
import nuke.darkness.client.util.*;
import nuke.darkness.common.*;
import nuke.darkness.common.reg.*;

public class ItemDarkRunicTorso extends ItemArmorDarkRunicBasic {

	public ItemDarkRunicTorso() {
		super(DItems.ArmorMaterials.DARKRUNIC_CLOTH, 0, EntityEquipmentSlot.CHEST, "darkrunic_torso");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(ChatFormatting.BOLD + TextUtil.localizeEffect("tooltip.darkness:darkrunic_torso"));
	}
}