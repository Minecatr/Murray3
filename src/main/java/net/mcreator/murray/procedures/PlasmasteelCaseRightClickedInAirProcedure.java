package net.mcreator.murray.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.murray.init.MurrayModItems;

public class PlasmasteelCaseRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).shrink(1);
		if (world.isClientSide())
			Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
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
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
								SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				{
					Entity _entity = entity;
					if (_entity instanceof Player _player) {
						_player.getInventory().armor.set(0, new ItemStack(MurrayModItems.PLASMASTEEL_BOOTS.get()));
						_player.getInventory().setChanged();
					} else if (_entity instanceof LivingEntity _living) {
						_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(MurrayModItems.PLASMASTEEL_BOOTS.get()));
					}
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, new BlockPos(x, y, z),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
										SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
									(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
						{
							Entity _entity = entity;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(1, new ItemStack(MurrayModItems.PLASMASTEEL_LEGGINGS.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(MurrayModItems.PLASMASTEEL_LEGGINGS.get()));
							}
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
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, new BlockPos(x, y, z),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")), SoundSource.NEUTRAL,
												1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
												SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof Level _level && !_level.isClientSide()) {
									ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
											(entity instanceof LivingEntity _entGetArmor
													? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
													: ItemStack.EMPTY));
									entityToSpawn.setPickUpDelay(10);
									_level.addFreshEntity(entityToSpawn);
								}
								{
									Entity _entity = entity;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, new ItemStack(MurrayModItems.PLASMASTEEL_CHESTPLATE.get()));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(MurrayModItems.PLASMASTEEL_CHESTPLATE.get()));
									}
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
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, new BlockPos(x, y, z),
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
														SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z,
														ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
														SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										if (world instanceof Level _level && !_level.isClientSide()) {
											ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z,
													(entity instanceof LivingEntity _entGetArmor
															? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
															: ItemStack.EMPTY));
											entityToSpawn.setPickUpDelay(10);
											_level.addFreshEntity(entityToSpawn);
										}
										{
											Entity _entity = entity;
											if (_entity instanceof Player _player) {
												_player.getInventory().armor.set(3, new ItemStack(MurrayModItems.PLASMASTEEL_HELMET.get()));
												_player.getInventory().setChanged();
											} else if (_entity instanceof LivingEntity _living) {
												_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(MurrayModItems.PLASMASTEEL_HELMET.get()));
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, 5);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, 5);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 5);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
	}
}
