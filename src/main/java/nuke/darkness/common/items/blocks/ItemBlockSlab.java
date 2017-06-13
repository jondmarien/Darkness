package nuke.darkness.common.items.blocks;

import javax.annotation.Nullable;

import net.minecraft.block.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.creativetab.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.common.items.*;
import nuke.darkness.core.*;

public class ItemBlockSlab extends ItemBlock implements IModeledItem {

	Block doubleSlab;
	CreativeTabs darkTab;

	public ItemBlockSlab(Block block, Block doubleSlabBlock) {
		super(block);
		doubleSlab = doubleSlabBlock;
		setRegistryName(block.getRegistryName());
		darkTab = Darkness.darknessTab;
		GameRegistry.register(this);
	}

	public void decrementHeldStack(EntityPlayer player, ItemStack stack, EnumHand hand) {
		if ( ! player.capabilities.isCreativeMode) {
			stack.shrink(1);
			if (stack.getCount() == 0) {
				player.setItemStackToSlot(hand == EnumHand.MAIN_HAND ? EntityEquipmentSlot.MAINHAND: EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
			}
		}
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		ItemStack stack = player.getHeldItem(hand);

		if (stack.getCount() == 0) {
			return EnumActionResult.FAIL;
		} else if ( ! player.canPlayerEdit(pos.offset(facing), facing, stack)) {
			return EnumActionResult.FAIL;
		} else {
			IBlockState ibs = world.getBlockState(pos);

			if (ibs.getBlock() == getBlock()) {
				BlockSlab.EnumBlockHalf ebh = ibs.getValue(BlockSlab.HALF);

				if (facing == EnumFacing.UP && ebh == BlockSlab.EnumBlockHalf.BOTTOM || facing == EnumFacing.DOWN && ebh == BlockSlab.EnumBlockHalf.TOP) {
					IBlockState ibs1 = this.doubleSlab.getDefaultState();

					if (world.checkNoEntityCollision(this.doubleSlab.getBoundingBox(ibs1, world, pos)) && world.setBlockState(pos, ibs1, 3)) {
						world.playSound(pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, this.doubleSlab.getSoundType(ibs, world, pos, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 0, null)).getPlaceSound(),
								SoundCategory.BLOCKS, (this.doubleSlab.getSoundType(ibs, world, pos, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 0, null)).getVolume() + 1.0f) / 2.0f,
								this.doubleSlab.getSoundType(ibs, world, pos, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 0, null)).getPitch() * 0.8f, true);
						stack.shrink(1);
					}
					return EnumActionResult.SUCCESS;
				}
			}
		}

		return this.tryPlace(stack, world, pos.offset(facing)) || (super.onItemUse(player, world, pos, hand, facing, hitX, hitY, hitZ) == EnumActionResult.SUCCESS ? true: false) ? EnumActionResult.SUCCESS: EnumActionResult.FAIL;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack) {
		BlockPos blockpos = pos;
		IBlockState ibs = world.getBlockState(pos);

		if (ibs.getBlock() == getBlock()) {
			boolean flag = ibs.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.TOP;

			if (side == EnumFacing.UP && ! flag || side == EnumFacing.DOWN && flag) return true;
		}

		pos = pos.offset(side);
		IBlockState ibs1 = world.getBlockState(pos);
		return ibs1.getBlock() == getBlock() || super.canPlaceBlockOnSide(world, blockpos, side, player, stack);
	}

	@Override
	public int getMetadata(int dmg) {
		return dmg;
	}

	@Override
	public CreativeTabs getCreativeTab() {
		return darkTab;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}

	private boolean tryPlace(ItemStack stack, World world, BlockPos pos) {
		IBlockState ibs = world.getBlockState(pos);
		@Nullable
		Entity entity = null;
		if (ibs.getBlock() == getBlock()) {
			IBlockState ibs1 = this.doubleSlab.getDefaultState();
			if (world.checkNoEntityCollision(this.doubleSlab.getBoundingBox(ibs, world, pos)) && world.setBlockState(pos, ibs1, 3)) {
				world.playSound(pos.getX() + 0.5f, pos.getY() + 0.5f, pos.getZ() + 0.5f, this.doubleSlab.getSoundType(ibs, world, pos, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 0, null)).getPlaceSound(),
						SoundCategory.BLOCKS, (this.doubleSlab.getSoundType(ibs, world, pos, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 0, null)).getVolume() + 1.0f) / 2.0f,
						this.doubleSlab.getSoundType(ibs, world, pos, world.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 0, null)).getPitch() * 0.8f, true);
				stack.shrink(1);
			}
			return true;
		}
		return false;
	}
}