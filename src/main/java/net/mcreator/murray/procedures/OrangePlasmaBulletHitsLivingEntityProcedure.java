package net.mcreator.murray.procedures;

import net.minecraft.world.entity.Entity;

public class OrangePlasmaBulletHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
