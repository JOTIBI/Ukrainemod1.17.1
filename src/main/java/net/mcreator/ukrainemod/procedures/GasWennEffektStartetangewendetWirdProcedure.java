package net.mcreator.ukrainemod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class GasWennEffektStartetangewendetWirdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (5); index0++) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), 1);
		}
	}
}
