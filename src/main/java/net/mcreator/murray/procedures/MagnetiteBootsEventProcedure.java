package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class MagnetiteBootsEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 10, 1, (false), (false)));
		}
	}
}
