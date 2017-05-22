package nuke.darkness.common.items;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class ItemRuneTri extends ItemBase {

	public ItemRuneTri() {
		super("rune_tri", true);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick( World world, EntityPlayer player, EnumHand hand) {
		if(!world.isRemote && player.isSneaking()){
			//world.setWorldTime(world.getWorldTime());
			world.setWorldTime(12500);
		}
		return super.onItemRightClick(world, player, hand);
	}

}