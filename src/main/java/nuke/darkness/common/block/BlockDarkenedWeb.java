package nuke.darkness.common.block;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;
import nuke.darkness.core.*;

public class BlockDarkenedWeb extends BlockWeb {

	public BlockDarkenedWeb() {
		super();
		BlockBasic.setBlockName(this, "darkened_web");
		setCreativeTab(Darkness.darknessTab);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return super.getItemDropped(state, rand, fortune); // TODO: Change to Darkened String
	}
}