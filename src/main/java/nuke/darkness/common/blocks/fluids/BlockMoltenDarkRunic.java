package nuke.darkness.common.blocks.fluids;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.block.statemap.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fluids.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.common.*;
import nuke.darkness.common.blocks.*;
import nuke.darkness.core.*;

public class BlockMoltenDarkRunic extends BlockFluidClassic implements IModeledBlock {
	public static FluidStack fstack = new FluidStack(Content.fluid_molten_darkrunic, 1000);

	public BlockMoltenDarkRunic(String name, boolean addToTab) {
		super(Content.fluid_molten_darkrunic, Material.AIR);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) this.setCreativeTab(Darkness.darknessTab);
		this.setQuantaPerBlock(7);
		Content.fluid_molten_darkrunic.setBlock(this);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getBlockState().getBaseState().withProperty(LEVEL, meta);
	}

	@Override
	public void initModel() {
		Block block = Content.block_molten_dark_runic;
		Item item = Item.getItemFromBlock(block);

		ModelBakery.registerItemVariants(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Darkness.prependModID("fluid"), fstack.getFluid().getName()));
		ModelLoader.setCustomStateMapper(block, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState p_178132_1_) {
				return new ModelResourceLocation(Darkness.prependModID("fluid"), fstack.getFluid().getName());
			}
		});
	}
}