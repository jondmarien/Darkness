package nuke.darkness.client.models;

import java.util.*;
import java.util.function.*;

import net.minecraft.block.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.block.statemap.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.client.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.block.*;
import nuke.darkness.common.reg.*;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Vars.MODID)
public class DModelManager {
	public static final DModelManager INSTANCE = new DModelManager();
	private final Set<Item> itemsReged = new HashSet<>();

	private DModelManager() {
	}

	@SubscribeEvent
	public static void registerAllModels(ModelRegistryEvent event) {
		INSTANCE.regBlockModels();
		INSTANCE.regItemModels();
	}

	private void regBlockModels() {
		regBlockItemModel(DBlocks.DARKENED_WOOL.getDefaultState().withProperty(BlockDarkenedWool.HAS_ENDER_PEARL, false));
	}

	private void regItemModels() {
		DItems.RegHandler.ITEMS.stream().filter(item -> !itemsReged.contains(item)).forEach(this::regItemModel);
	}

	private void regBlockItemModel(IBlockState ibs) {
		Block block = ibs.getBlock();
		Item item = Item.getItemFromBlock(block);

		if (item != Items.AIR) regItemModel(item, new ModelResourceLocation(block.getRegistryName(), propertyStringMapper.getPropertyString(ibs.getProperties())));
	}

	private void regBlockItemModelForMeta(IBlockState ibs, int meta) {
		Item item = Item.getItemFromBlock(ibs.getBlock());

		if (item != Items.AIR) regItemModelForMeta(item, meta, propertyStringMapper.getPropertyString(ibs.getProperties()));
	}

	private <T extends Comparable<T>> void regVariantBlockItemModels(IBlockState ibs, IProperty<T> prop, ToIntFunction<T> getMeta) {
		prop.getAllowedValues().forEach(value -> regBlockItemModelForMeta(ibs.withProperty(prop, value), getMeta.applyAsInt(value)));
	}

	private <T extends IVariantHelper&Comparable<T>> void regVariantBlockItemModels(IBlockState ibs, IProperty<T> prop) {
		regVariantBlockItemModels(ibs, prop, IVariantHelper::getMeta);
	}

	private void regItemModel(Item item) {
		regItemModel(item, item.getRegistryName().toString());
	}

	private void regItemModel(Item item, String modelLoc) {
		ModelResourceLocation modelLoc2 = new ModelResourceLocation(modelLoc, "inventory");
		regItemModel(item, modelLoc2);
	}

	private void regItemModel(Item item, ModelResourceLocation modelLoc2) {
		ModelBakery.registerItemVariants(item, modelLoc2);
		regItemModel(item, MeshDefinitionFix.create(stack -> modelLoc2));
	}

	private void regItemModel(Item item, ItemMeshDefinition meshDef) {
		itemsReged.add(item);
		ModelLoader.setCustomMeshDefinition(item, meshDef);
	}

	private <T extends IVariantHelper> void regVariantItemModels(Item item, String varName, T[] values) {
		for (T value : values) {
			regItemModelForMeta(item, value.getMeta(), varName + "=" + value.getName());
		}
	}

	private void regItemModelForMeta(Item item, int meta, String variant) {
		regItemModelForMeta(item, meta, new ModelResourceLocation(item.getRegistryName(), variant));
	}

	private void regItemModelForMeta(Item item, int meta, ModelResourceLocation modelLoc) {
		itemsReged.add(item);
		ModelLoader.setCustomModelResourceLocation(item, meta, modelLoc);
	}

	private final StateMapperBase propertyStringMapper = new StateMapperBase() {
		@Override
		protected ModelResourceLocation getModelResourceLocation(final IBlockState state) {
			return new ModelResourceLocation("minecraft:air");
		}
	};
}