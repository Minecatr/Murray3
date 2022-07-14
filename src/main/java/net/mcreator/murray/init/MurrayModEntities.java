
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.entity.VexxesGunEntity;
import net.mcreator.murray.entity.VexxEntity;
import net.mcreator.murray.entity.UltraEndBowEntity;
import net.mcreator.murray.entity.TeleportAbilityEntity;
import net.mcreator.murray.entity.ShurikenEntity;
import net.mcreator.murray.entity.RedPlasmaEntity;
import net.mcreator.murray.entity.PurpleSoldierEntity;
import net.mcreator.murray.entity.PurplePlasmaEntity;
import net.mcreator.murray.entity.OrnateEntity;
import net.mcreator.murray.entity.OrangePlasmaEntity;
import net.mcreator.murray.entity.MoltronRocketEntity;
import net.mcreator.murray.entity.MoltronMechEntity;
import net.mcreator.murray.entity.LightningPlasmaEntity;
import net.mcreator.murray.entity.GreenPlasmaMk2Entity;
import net.mcreator.murray.entity.GreenPlasmaEntity;
import net.mcreator.murray.entity.ExplosiveShurikenEntity;
import net.mcreator.murray.entity.ChompSpitEntity;
import net.mcreator.murray.entity.BruteEntity;
import net.mcreator.murray.entity.BluePlasmaEntity;
import net.mcreator.murray.entity.BlowAbilityEntity;
import net.mcreator.murray.MurrayMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MurrayModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MurrayMod.MODID);
	public static final RegistryObject<EntityType<UltraEndBowEntity>> ULTRA_END_BOW = register("projectile_ultra_end_bow",
			EntityType.Builder.<UltraEndBowEntity>of(UltraEndBowEntity::new, MobCategory.MISC).setCustomClientFactory(UltraEndBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedPlasmaEntity>> RED_PLASMA = register("projectile_red_plasma",
			EntityType.Builder.<RedPlasmaEntity>of(RedPlasmaEntity::new, MobCategory.MISC).setCustomClientFactory(RedPlasmaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LightningPlasmaEntity>> LIGHTNING_PLASMA = register("projectile_lightning_plasma",
			EntityType.Builder.<LightningPlasmaEntity>of(LightningPlasmaEntity::new, MobCategory.MISC)
					.setCustomClientFactory(LightningPlasmaEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OrangePlasmaEntity>> ORANGE_PLASMA = register("projectile_orange_plasma",
			EntityType.Builder.<OrangePlasmaEntity>of(OrangePlasmaEntity::new, MobCategory.MISC).setCustomClientFactory(OrangePlasmaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GreenPlasmaEntity>> GREEN_PLASMA = register("projectile_green_plasma",
			EntityType.Builder.<GreenPlasmaEntity>of(GreenPlasmaEntity::new, MobCategory.MISC).setCustomClientFactory(GreenPlasmaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BluePlasmaEntity>> BLUE_PLASMA = register("projectile_blue_plasma",
			EntityType.Builder.<BluePlasmaEntity>of(BluePlasmaEntity::new, MobCategory.MISC).setCustomClientFactory(BluePlasmaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PurplePlasmaEntity>> PURPLE_PLASMA = register("projectile_purple_plasma",
			EntityType.Builder.<PurplePlasmaEntity>of(PurplePlasmaEntity::new, MobCategory.MISC).setCustomClientFactory(PurplePlasmaEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShurikenEntity>> SHURIKEN = register("projectile_shuriken",
			EntityType.Builder.<ShurikenEntity>of(ShurikenEntity::new, MobCategory.MISC).setCustomClientFactory(ShurikenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosiveShurikenEntity>> EXPLOSIVE_SHURIKEN = register("projectile_explosive_shuriken",
			EntityType.Builder.<ExplosiveShurikenEntity>of(ExplosiveShurikenEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ExplosiveShurikenEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GreenPlasmaMk2Entity>> GREEN_PLASMA_MK_2 = register("projectile_green_plasma_mk_2",
			EntityType.Builder.<GreenPlasmaMk2Entity>of(GreenPlasmaMk2Entity::new, MobCategory.MISC).setCustomClientFactory(GreenPlasmaMk2Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VexxesGunEntity>> VEXXES_GUN = register("projectile_vexxes_gun",
			EntityType.Builder.<VexxesGunEntity>of(VexxesGunEntity::new, MobCategory.MISC).setCustomClientFactory(VexxesGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlowAbilityEntity>> BLOW_ABILITY = register("projectile_blow_ability",
			EntityType.Builder.<BlowAbilityEntity>of(BlowAbilityEntity::new, MobCategory.MISC).setCustomClientFactory(BlowAbilityEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TeleportAbilityEntity>> TELEPORT_ABILITY = register("projectile_teleport_ability",
			EntityType.Builder.<TeleportAbilityEntity>of(TeleportAbilityEntity::new, MobCategory.MISC)
					.setCustomClientFactory(TeleportAbilityEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ChompSpitEntity>> CHOMP_SPIT = register("projectile_chomp_spit",
			EntityType.Builder.<ChompSpitEntity>of(ChompSpitEntity::new, MobCategory.MISC).setCustomClientFactory(ChompSpitEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MoltronMechEntity>> MOLTRON_MECH = register("moltron_mech",
			EntityType.Builder.<MoltronMechEntity>of(MoltronMechEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoltronMechEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<MoltronRocketEntity>> MOLTRON_ROCKET = register("moltron_rocket",
			EntityType.Builder.<MoltronRocketEntity>of(MoltronRocketEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MoltronRocketEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<PurpleSoldierEntity>> PURPLE_SOLDIER = register("purple_soldier",
			EntityType.Builder.<PurpleSoldierEntity>of(PurpleSoldierEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleSoldierEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OrnateEntity>> ORNATE = register("ornate",
			EntityType.Builder.<OrnateEntity>of(OrnateEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(OrnateEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VexxEntity>> VEXX = register("vexx",
			EntityType.Builder.<VexxEntity>of(VexxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(VexxEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BruteEntity>> BRUTE = register("brute",
			EntityType.Builder.<BruteEntity>of(BruteEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BruteEntity::new)

					.sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MoltronMechEntity.init();
			MoltronRocketEntity.init();
			PurpleSoldierEntity.init();
			OrnateEntity.init();
			VexxEntity.init();
			BruteEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOLTRON_MECH.get(), MoltronMechEntity.createAttributes().build());
		event.put(MOLTRON_ROCKET.get(), MoltronRocketEntity.createAttributes().build());
		event.put(PURPLE_SOLDIER.get(), PurpleSoldierEntity.createAttributes().build());
		event.put(ORNATE.get(), OrnateEntity.createAttributes().build());
		event.put(VEXX.get(), VexxEntity.createAttributes().build());
		event.put(BRUTE.get(), BruteEntity.createAttributes().build());
	}
}
