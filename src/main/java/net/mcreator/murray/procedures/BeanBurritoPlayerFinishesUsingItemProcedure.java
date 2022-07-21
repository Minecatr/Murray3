package net.mcreator.murray.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.murray.entity.OrangePlasmaEntity;

public class BeanBurritoPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 600, 1, (false), (true)));
		if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
			OrangePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 0, 1);
		}
	}
}
