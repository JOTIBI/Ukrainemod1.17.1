package net.mcreator.ukrainemod.procedures;

import net.minecraft.world.entity.Entity;

public class Test2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"teammsg Angriff!!!");
		}
	}
}
