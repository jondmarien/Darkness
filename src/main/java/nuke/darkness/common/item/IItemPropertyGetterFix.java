package nuke.darkness.common.item;

import javax.annotation.*;

import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.relauncher.*;

/**
 * Written by Choonster
 * @author Choonster
 * @see "MeshDefinitionFix"
 */
public interface IItemPropertyGetterFix extends IItemPropertyGetter {
	float applyPropertyGetter(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn);

	static IItemPropertyGetterFix create(final IItemPropertyGetterFix lambda) {
		return lambda;
	}

	@Override
	@SideOnly(Side.CLIENT)
	default float apply(final ItemStack stack, @Nullable final World worldIn, @Nullable final EntityLivingBase entityIn) {
		return applyPropertyGetter(stack, worldIn, entityIn);
	}
}