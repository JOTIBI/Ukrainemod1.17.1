package net.mcreator.ukrainemod.procedures;

import net.minecraft.world.entity.Entity;

public class GassWennMobSpielerMitBlockKollidiertProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		GasWennEffektStartetangewendetWirdProcedure.execute(entity);
	}
}
