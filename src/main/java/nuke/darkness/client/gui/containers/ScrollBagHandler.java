package nuke.darkness.client.gui.containers;

import java.util.*;
import java.util.function.*;

import net.minecraft.item.*;

public class ScrollBagHandler {
	private static final List<Predicate<ItemStack>> scrolls = new ArrayList<>();

	//TODO: Change ItemTool to ItemScroll once implemented
	static {
		scrolls.add(( s ) -> (s.getItem() instanceof ItemTool));
	}

	public static boolean isScroll( ItemStack is ) {
		for (Predicate<ItemStack> p : scrolls)
			if (p.test(is)) return true;
		return false;
	}

	public static void addScrollType( Predicate<ItemStack> in ) {
		scrolls.add(in);
	}
}