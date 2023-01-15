
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

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

@Mod.EventBusSubscriber
public class MurrayModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MurrayMod.MODID);
	public static final RegistryObject<Feature<?>> ENDERIUM_INFUSED_STONE = REGISTRY.register("enderium_infused_stone",
			EnderiumInfusedStoneFeature::feature);
	public static final RegistryObject<Feature<?>> DEPOSIT = REGISTRY.register("deposit", DepositFeature::feature);
	public static final RegistryObject<Feature<?>> MAGNETITE_ORE = REGISTRY.register("magnetite_ore", MagnetiteOreFeature::feature);
	public static final RegistryObject<Feature<?>> EXIT_RIFT = REGISTRY.register("exit_rift", ExitRiftFeature::feature);
	public static final RegistryObject<Feature<?>> PURPLE_DEPOSIT = REGISTRY.register("purple_deposit", PurpleDepositFeature::feature);
	public static final RegistryObject<Feature<?>> PURPLE_FACTORY = REGISTRY.register("purple_factory", PurpleFactoryFeature::feature);
	public static final RegistryObject<Feature<?>> BOSS_TOWER_1 = REGISTRY.register("boss_tower_1", BossTower1Feature::feature);
	public static final RegistryObject<Feature<?>> BOSS_TOWER_2 = REGISTRY.register("boss_tower_2", BossTower2Feature::feature);
	public static final RegistryObject<Feature<?>> FINAL_BOSS_TOWER = REGISTRY.register("final_boss_tower", FinalBossTowerFeature::feature);
	public static final RegistryObject<Feature<?>> MINI_FUTURISTIC_CITY = REGISTRY.register("mini_futuristic_city",
			MiniFuturisticCityFeature::feature);
	public static final RegistryObject<Feature<?>> POP_UP_HOUSE_STRUCTURE = REGISTRY.register("pop_up_house_structure",
			PopUpHouseStructureFeature::feature);
}
