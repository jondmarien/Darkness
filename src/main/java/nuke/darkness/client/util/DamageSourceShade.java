package nuke.darkness.client.util;

import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;

public class DamageSourceShade extends DamageSource {

	public DamageSourceShade() {
		super("shade");
		setMagicDamage();
		setDifficultyScaled();
	}

	@Override
	public ITextComponent getDeathMessage(EntityLivingBase entityLivingBase) {
		return super.getDeathMessage(entityLivingBase);
	}
}