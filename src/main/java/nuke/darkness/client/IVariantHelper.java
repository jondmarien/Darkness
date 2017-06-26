package nuke.darkness.client;

import java.util.*;

import org.apache.commons.lang3.tuple.*;

import net.minecraft.util.*;

public interface IVariantHelper extends IStringSerializable {
	List<Pair<Integer, String>> getVariants();
	
	/**
	 * get metadata of the variant 
	 * @return metadata value
	 */
	int getMeta();
}