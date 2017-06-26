package nuke.darkness.common.items;

import com.google.common.collect.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.*;
import nuke.darkness.core.*;

public class ItemAxeBase extends ItemTool implements IModeledObject {

	public ItemAxeBase(ToolMaterial tmat, String name, boolean addToTab) {
		super(tmat, Sets.newHashSet(new Block[] { Blocks.PLANKS }));
		setUnlocalizedName(References.MODID + "." + name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		setHarvestLevel("axe", this.toolMaterial.getHarvestLevel());
		this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 4.0f;
		this.attackSpeed = -2.7f;
		//GameRegistry.register(this);
	}

	public ItemAxeBase(ToolMaterial tmat, EnumRarity rarity, String name, boolean addToTab) {
		super(tmat, Sets.newHashSet(new Block[] { Blocks.PLANKS }));
		setUnlocalizedName(References.MODID + "." + name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		setHarvestLevel("axe", this.toolMaterial.getHarvestLevel());
		this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 4.0f;
		this.attackSpeed = -2.7f;
		//GameRegistry.register(this);
	}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material mat = state.getMaterial();
		return mat != Material.WOOD && mat != Material.PLANTS && mat != Material.VINE ? super.getStrVsBlock(stack, state): this.efficiencyOnProperMaterial;
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}