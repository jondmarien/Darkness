package nuke.darkness.common.items.runes;

import javax.annotation.*;

import net.minecraft.entity.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.*;

public class ItemRuneCorrupt extends ItemRuneBase {

	public ItemRuneCorrupt() {
		super("rune_corrupt", true);
		setMaxStackSize(1);
		addPropertyOverride(new ResourceLocation("enabled"), new IItemPropertyGetter() {
			@Override
			public float apply(ItemStack stack, @Nullable World world, @Nullable EntityLivingBase entity) {
				return 0;
			}
		});
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if (!world.isRemote && player.isSneaking()) {
			world.spawnEntity(new EntityCreeper(world)); // TODO: Remove spawn creeper and add change texture
		}
		return super.onItemRightClick(world, player, hand);
	}
}