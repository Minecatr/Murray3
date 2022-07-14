
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.murray.world.features.ores.MagnetiteOreFeature;
import net.mcreator.murray.world.features.ores.EnderiumInfusedStoneFeature;
import net.mcreator.murray.world.features.ores.DepositFeature;
import net.mcreator.murray.world.features.PurpleFactoryFeature;
import net.mcreator.murray.world.features.PurpleDepositFeature;
import net.mcreator.murray.world.features.PopUpHouseStructureFeature;
import net.mcreator.murray.world.features.MiniFuturisticCityFeature;
import net.mcreator.murray.world.features.FinalBossTowerFeature;
import net.mcreator.murray.world.features.ExitRiftFeature;
import net.mcreator.murray.world.features.BossTower2Feature;
import net.mcreator.murray.world.features.BossTower1Feature;
import net.mcreator.murray.MurrayMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MurrayModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MurrayMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> ENDERIUM_INFUSED_STONE = register("enderium_infused_stone", EnderiumInfusedStoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EnderiumInfusedStoneFeature.GENERATE_BIOMES,
					EnderiumInfusedStoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEPOSIT = register("deposit", DepositFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DepositFeature.GENERATE_BIOMES, DepositFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGNETITE_ORE = register("magnetite_ore", MagnetiteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MagnetiteOreFeature.GENERATE_BIOMES, MagnetiteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EXIT_RIFT = register("exit_rift", ExitRiftFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.RAW_GENERATION, ExitRiftFeature.GENERATE_BIOMES, ExitRiftFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLE_DEPOSIT = register("purple_deposit", PurpleDepositFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, PurpleDepositFeature.GENERATE_BIOMES, PurpleDepositFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PURPLE_FACTORY = register("purple_factory", PurpleFactoryFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, PurpleFactoryFeature.GENERATE_BIOMES, PurpleFactoryFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BOSS_TOWER_1 = register("boss_tower_1", BossTower1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BossTower1Feature.GENERATE_BIOMES, BossTower1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BOSS_TOWER_2 = register("boss_tower_2", BossTower2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BossTower2Feature.GENERATE_BIOMES, BossTower2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> FINAL_BOSS_TOWER = register("final_boss_tower", FinalBossTowerFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FinalBossTowerFeature.GENERATE_BIOMES,
					FinalBossTowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MINI_FUTURISTIC_CITY = register("mini_futuristic_city", MiniFuturisticCityFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MiniFuturisticCityFeature.GENERATE_BIOMES,
					MiniFuturisticCityFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POP_UP_HOUSE_STRUCTURE = register("pop_up_house_structure", PopUpHouseStructureFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PopUpHouseStructureFeature.GENERATE_BIOMES,
					PopUpHouseStructureFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
