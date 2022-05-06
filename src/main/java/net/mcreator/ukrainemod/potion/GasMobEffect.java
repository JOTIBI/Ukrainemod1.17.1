
package net.mcreator.ukrainemod.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.ukrainemod.procedures.GasWennEffektStartetangewendetWirdProcedure;

public class GasMobEffect extends MobEffect {
	public GasMobEffect() {
		super(MobEffectCategory.HARMFUL, -16724941);
		setRegistryName("gas");
	}

	@Override
	public String getDescriptionId() {
		return "effect.ukrainemod.gas";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GasWennEffektStartetangewendetWirdProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
