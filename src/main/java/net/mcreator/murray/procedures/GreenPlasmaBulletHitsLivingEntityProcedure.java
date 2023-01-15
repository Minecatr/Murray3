package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.murray.MurrayMod;

public class GreenPlasmaBulletHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		MurrayMod.queueServerWork(10, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
			MurrayMod.queueServerWork(10, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
				MurrayMod.queueServerWork(10, () -> {
					if (entity instanceof LivingEntity _entity)
						_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
					MurrayMod.queueServerWork(10, () -> {
						if (entity instanceof LivingEntity _entity)
							_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
						MurrayMod.queueServerWork(10, () -> {
							if (entity instanceof LivingEntity _entity)
								_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
							MurrayMod.queueServerWork(10, () -> {
								if (entity instanceof LivingEntity _entity)
									_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
								MurrayMod.queueServerWork(10, () -> {
									if (entity instanceof LivingEntity _entity)
										_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
									MurrayMod.queueServerWork(10, () -> {
										if (entity instanceof LivingEntity _entity)
											_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
										MurrayMod.queueServerWork(10, () -> {
											if (entity instanceof LivingEntity _entity)
												_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
											MurrayMod.queueServerWork(10, () -> {
												if (entity instanceof LivingEntity _entity)
													_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
												MurrayMod.queueServerWork(10, () -> {
													if (entity instanceof LivingEntity _entity)
														_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
													MurrayMod.queueServerWork(10, () -> {
														if (entity instanceof LivingEntity _entity)
															_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
														MurrayMod.queueServerWork(10, () -> {
															if (entity instanceof LivingEntity _entity)
																_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
															MurrayMod.queueServerWork(10, () -> {
																if (entity instanceof LivingEntity _entity)
																	_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
																MurrayMod.queueServerWork(10, () -> {
																	if (entity instanceof LivingEntity _entity)
																		_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
																	MurrayMod.queueServerWork(10, () -> {
																		if (entity instanceof LivingEntity _entity)
																			_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
																		MurrayMod.queueServerWork(10, () -> {
																			if (entity instanceof LivingEntity _entity)
																				_entity.hurt(new DamageSource("poison").bypassArmor(), (float) 0.5);
																			MurrayMod.queueServerWork(10, () -> {
																				if (entity instanceof LivingEntity _entity)
																					_entity.hurt(new DamageSource("poison").bypassArmor(),
																							(float) 0.5);
																				MurrayMod.queueServerWork(10, () -> {
																					if (entity instanceof LivingEntity _entity)
																						_entity.hurt(new DamageSource("poison").bypassArmor(),
																								(float) 0.5);
																					MurrayMod.queueServerWork(10, () -> {
																						if (entity instanceof LivingEntity _entity)
																							_entity.hurt(new DamageSource("poison").bypassArmor(),
																									(float) 0.5);
																					});
																				});
																			});
																		});
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
	}
}
