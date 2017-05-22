package nuke.darkness.client.util;

import net.minecraft.entity.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;

public class DamageGloom extends DamageSource {

	public DamageGloom() {
		super("gloom");
		setMagicDamage();
		setDifficultyScaled();
	}
	
	@Override
	public ITextComponent getDeathMessage( EntityLivingBase entityLivingBase ) {
		return super.getDeathMessage(entityLivingBase);
	}
}