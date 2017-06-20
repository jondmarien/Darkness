package nuke.darkness.client;

import java.util.*;

import javax.annotation.*;

import net.minecraft.client.renderer.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.relauncher.*;

public interface IMeshHelper {
	@SideOnly(Side.CLIENT)
	ItemMeshDefinition getMeshDefinition();

	List<String> getVariants();

	@Nullable
	ResourceLocation getCustomLocation();
}