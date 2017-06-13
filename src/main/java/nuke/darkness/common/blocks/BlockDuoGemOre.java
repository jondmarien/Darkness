package nuke.darkness.common.blocks;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import nuke.darkness.common.*;

public class BlockDuoGemOre extends BlockBase {
	public BlockDuoGemOre() {
		super(Material.ROCK, "ore_duo", "pickaxe", 1, 2.0F, 13.0F, SoundType.STONE, true);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Content.gem_duo;
	}

	@Override
	public int quantityDroppedWithBonus(int fortune, Random random) {
		return super.quantityDroppedWithBonus(fortune, random);
	}

	@Override
	public int quantityDropped(Random random) {
		return 3 + random.nextInt(2) + 1;
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		if (this.getItemDropped(state, RANDOM, fortune) != Item.getItemFromBlock(this)) { return 2 + RANDOM.nextInt(7); }
		return 0;
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}

	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) {
		return new ItemStack(Content.ore_duo);
	}
}