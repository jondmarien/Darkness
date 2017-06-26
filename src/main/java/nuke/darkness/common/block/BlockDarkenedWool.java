package nuke.darkness.common.block;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import nuke.darkness.common.*;
import nuke.darkness.core.*;

public class BlockDarkenedWool extends Block {

	public static final IProperty<Boolean> HAS_ENDER_PEARL = PropertyBool.create("has_ender_pearl");

	public BlockDarkenedWool() {
		super(Material.CLOTH);
		BlockBasic.setBlockName(this, "darkened_wool");
		setDefaultState(blockState.getBaseState().withProperty(HAS_ENDER_PEARL, false));
		setCreativeTab(Darkness.darknessTab);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, HAS_ENDER_PEARL);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(HAS_ENDER_PEARL, meta > 0);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(HAS_ENDER_PEARL) ? 1: 0;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ) {
		final ItemStack held = player.getHeldItem(hand);

		if (!held.isEmpty() && held.getItem() == Items.ENDER_PEARL && !state.getValue(HAS_ENDER_PEARL)) { // if the hand isnt empty, if the item that is held is an ender pearl and if the
																											// property bool is NOT false
			if (!player.capabilities.isCreativeMode) { // if the player is not in creative mode
				held.shrink(1); // decrease stack by 1
			}
			world.setBlockState(pos, state.withProperty(HAS_ENDER_PEARL, true)); // set the block state to have the property bool become true
			return true;
		}

		return super.onBlockActivated(world, pos, state, player, hand, face, hitX, hitY, hitZ);
	}

	@Override
	public int quantityDropped(Random random) {
		return 1;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		super.getDrops(drops, world, pos, state, fortune);

		if (state.getValue(HAS_ENDER_PEARL)) {
			drops.add(new ItemStack(Items.ENDER_PEARL));
		}
	}
}