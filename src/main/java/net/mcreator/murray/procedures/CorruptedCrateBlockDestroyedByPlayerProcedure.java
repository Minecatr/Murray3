package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class CorruptedCrateBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (Math.round(Math.random() * 10)); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		for (int index1 = 0; index1 < (int) (Math.round(Math.random() * 5)); index1++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Skeleton(EntityType.SKELETON, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
		for (int index2 = 0; index2 < (int) (Math.round(Math.random() * 5)); index2++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Spider(EntityType.SPIDER, _level);
				entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
