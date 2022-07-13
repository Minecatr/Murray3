package net.mcreator.murray.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModItems;
import net.mcreator.murray.entity.TeleportAbilityEntity;
import net.mcreator.murray.entity.RedPlasmaEntity;
import net.mcreator.murray.entity.PurplePlasmaEntity;
import net.mcreator.murray.entity.OrangePlasmaEntity;
import net.mcreator.murray.entity.MoltronRocketEntity;
import net.mcreator.murray.entity.MoltronMechEntity;
import net.mcreator.murray.entity.LightningPlasmaEntity;
import net.mcreator.murray.entity.GreenPlasmaEntity;
import net.mcreator.murray.entity.ExplosiveShurikenEntity;
import net.mcreator.murray.entity.BluePlasmaEntity;

public class Murray3MainOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.PLASMASTEEL_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.PLASMASTEEL_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.PLASMASTEEL_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.PLASMASTEEL_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				OrangePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 4, 1, 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.MINECAT_HELMET.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				TeleportAbilityEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 4, 0, 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.FROST_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.FROST_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.FROST_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.FROST_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				BluePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 2, 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.SHADOW_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.SHADOW_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.SHADOW_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.SHADOW_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PurplePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 5, (float) 0.5, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PurplePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 4, (float) 0.5, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PurplePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, (float) 0.5, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PurplePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, (float) 0.5, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				PurplePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, (float) 0.5, 0);
			}
		}
		if ((entity.getVehicle()) instanceof MoltronMechEntity) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				RedPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, 5, 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.NINJA_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.NINJA_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.NINJA_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.NINJA_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				ExplosiveShurikenEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 3, 1, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				ExplosiveShurikenEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				ExplosiveShurikenEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 1, 1, 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.HEARTSTEEL_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.HEARTSTEEL_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.HEARTSTEEL_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.HEARTSTEEL_BOOTS.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200, 4, (false), (true)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 4, (false), (true)));
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.ELECTRISTEEL_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				LightningPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 0, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				LightningPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), -2, 0, 0);
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.RAINBOW_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.RAINBOW_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.RAINBOW_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.RAINBOW_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				RedPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
						OrangePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
								LightningPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
							}
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private LevelAccessor world;

								public void start(LevelAccessor world, int waitTicks) {
									this.waitTicks = waitTicks;
									MinecraftForge.EVENT_BUS.register(this);
									this.world = world;
								}

								@SubscribeEvent
								public void tick(TickEvent.ServerTickEvent event) {
									if (event.phase == TickEvent.Phase.END) {
										this.ticks += 1;
										if (this.ticks >= this.waitTicks)
											run();
									}
								}

								private void run() {
									if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
										GreenPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
									}
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
												BluePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
											}
											new Object() {
												private int ticks = 0;
												private float waitTicks;
												private LevelAccessor world;

												public void start(LevelAccessor world, int waitTicks) {
													this.waitTicks = waitTicks;
													MinecraftForge.EVENT_BUS.register(this);
													this.world = world;
												}

												@SubscribeEvent
												public void tick(TickEvent.ServerTickEvent event) {
													if (event.phase == TickEvent.Phase.END) {
														this.ticks += 1;
														if (this.ticks >= this.waitTicks)
															run();
													}
												}

												private void run() {
													if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
														PurplePlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 1, 0);
													}
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 4);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 4);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 4);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 4);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 4);
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.ELECTRISTEEL_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_BOOTS.get()) {
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				LightningPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 2, 0, 0);
			}
			if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
				LightningPlasmaEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), -2, 0, 0);
			}
		}
		if ((entity.getVehicle()) instanceof MoltronRocketEntity) {
			(entity.getVehicle()).setDeltaMovement(new Vec3(0, 3, 0));
			if (entity.getY() > 1000 && (entity.level.dimension()) == (Level.OVERWORLD)) {
				if ((entity.getVehicle()) instanceof LivingEntity _entity)
					_entity.setHealth(0);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0, (false), (false)));
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("murray:venus"));
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
								nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(MurrayModItems.MOLTRON_ROCKET_ITEM.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 500, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 500, z, _ent.getYRot(), _ent.getXRot());
				}
			} else if (entity.getY() > 1000
					&& (entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("murray:venus")))) {
				if ((entity.getVehicle()) instanceof LivingEntity _entity)
					_entity.setHealth(0);
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0, (false), (false)));
				if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
					ResourceKey<Level> destinationType = Level.OVERWORLD;
					if (_player.level.dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
								nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(MurrayModItems.MOLTRON_ROCKET_ITEM.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(x, 500, z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, 500, z, _ent.getYRot(), _ent.getXRot());
				}
			}
		}
	}
}
