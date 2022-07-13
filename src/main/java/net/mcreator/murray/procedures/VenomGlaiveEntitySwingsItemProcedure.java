package net.mcreator.murray.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.entity.GreenPlasmaEntity;

public class VenomGlaiveEntitySwingsItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.round(Math.random() * 3) == 3) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				GreenPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 1, 0);
			}
		}
	}
}
