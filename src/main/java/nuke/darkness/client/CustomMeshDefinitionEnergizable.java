package nuke.darkness.client;

import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import nuke.darkness.api.*;
import nuke.darkness.api.ifaces.*;

public class CustomMeshDefinitionEnergizable implements ItemMeshDefinition {
	private final String name;

	public CustomMeshDefinitionEnergizable(String name) {
		this.name = name;
	}

	@Override
	public ModelResourceLocation getModelLocation(ItemStack stack) {
		if (stack != null && stack.getItem() instanceof IEnergizable) {
			if (((IEnergizable) stack.getItem()).getEnergized(stack)) { return new ModelResourceLocation(new ResourceLocation(References.MODID, "item/" + name), "energize=true"); }
		}
		
		return new ModelResourceLocation(new ResourceLocation(References.MODID, "item/" + name), "energize=false");
	}
}