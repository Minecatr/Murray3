
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.murray.item.XZswapItem;
import net.mcreator.murray.item.WoodArmorItem;
import net.mcreator.murray.item.WaterArmorItem;
import net.mcreator.murray.item.VexxesGunItem;
import net.mcreator.murray.item.VenomGlaiveItem;
import net.mcreator.murray.item.UltraNetherAxeItem;
import net.mcreator.murray.item.UltraEndBowItem;
import net.mcreator.murray.item.TrueNetheriteItem;
import net.mcreator.murray.item.TrueEnderiumItem;
import net.mcreator.murray.item.TeleportAbilityItem;
import net.mcreator.murray.item.TechManiaItem;
import net.mcreator.murray.item.StoneArmorItem;
import net.mcreator.murray.item.SteelNuggetItem;
import net.mcreator.murray.item.SteelIngotItem;
import net.mcreator.murray.item.SteelArmorItem;
import net.mcreator.murray.item.SpeedChipItem;
import net.mcreator.murray.item.ShurikenItem;
import net.mcreator.murray.item.ShadowItem;
import net.mcreator.murray.item.RedPlasmaItem;
import net.mcreator.murray.item.RainbowItem;
import net.mcreator.murray.item.RacerItem;
import net.mcreator.murray.item.PurplePlasmaItem;
import net.mcreator.murray.item.PlasmasteelMk2Item;
import net.mcreator.murray.item.PlasmasteelItem;
import net.mcreator.murray.item.PlasmasteelCaseItem;
import net.mcreator.murray.item.PlasmaKatanaItem;
import net.mcreator.murray.item.ParachuteItem;
import net.mcreator.murray.item.OrangePlasmaItem;
import net.mcreator.murray.item.NinjaItem;
import net.mcreator.murray.item.NetherGemItem;
import net.mcreator.murray.item.MoltronRocketItemItem;
import net.mcreator.murray.item.MinecoinItem;
import net.mcreator.murray.item.MinecatItem;
import net.mcreator.murray.item.MechStrikeItem;
import net.mcreator.murray.item.MagnetiteSwordItem;
import net.mcreator.murray.item.MagnetiteIngotItem;
import net.mcreator.murray.item.MagnetiteArmorItem;
import net.mcreator.murray.item.LightningPlasmaItem;
import net.mcreator.murray.item.LavaArmorItem;
import net.mcreator.murray.item.JarnumfruitItem;
import net.mcreator.murray.item.HotMatterItem;
import net.mcreator.murray.item.HeartsteelItem;
import net.mcreator.murray.item.HeartstealerItem;
import net.mcreator.murray.item.HastefruitItem;
import net.mcreator.murray.item.GreenPlasmaMk2Item;
import net.mcreator.murray.item.GreenPlasmaItem;
import net.mcreator.murray.item.FrostPickaxeItem;
import net.mcreator.murray.item.FrostItem;
import net.mcreator.murray.item.ForcefieldItem;
import net.mcreator.murray.item.FlightEnablerItem;
import net.mcreator.murray.item.FlightChipItem;
import net.mcreator.murray.item.FireChipItem;
import net.mcreator.murray.item.ExplosiveShurikenItem;
import net.mcreator.murray.item.EnergyChipItem;
import net.mcreator.murray.item.EnderiumIngotItem;
import net.mcreator.murray.item.EnderiumArmorItem;
import net.mcreator.murray.item.EnderGemItem;
import net.mcreator.murray.item.ElectristeelItem;
import net.mcreator.murray.item.DefenseChipItem;
import net.mcreator.murray.item.ChompSpitItem;
import net.mcreator.murray.item.ChompItem;
import net.mcreator.murray.item.ChipItem;
import net.mcreator.murray.item.CactusArmorItem;
import net.mcreator.murray.item.BluePlasmaItem;
import net.mcreator.murray.item.BlowAbilityItem;
import net.mcreator.murray.item.AttackChipItem;
import net.mcreator.murray.MurrayMod;

public class MurrayModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MurrayMod.MODID);
	public static final RegistryObject<Item> PLASMASTEEL_HELMET = REGISTRY.register("plasmasteel_helmet", () -> new PlasmasteelItem.Helmet());
	public static final RegistryObject<Item> PLASMASTEEL_CHESTPLATE = REGISTRY.register("plasmasteel_chestplate",
			() -> new PlasmasteelItem.Chestplate());
	public static final RegistryObject<Item> PLASMASTEEL_LEGGINGS = REGISTRY.register("plasmasteel_leggings", () -> new PlasmasteelItem.Leggings());
	public static final RegistryObject<Item> PLASMASTEEL_BOOTS = REGISTRY.register("plasmasteel_boots", () -> new PlasmasteelItem.Boots());
	public static final RegistryObject<Item> MINECAT_HELMET = REGISTRY.register("minecat_helmet", () -> new MinecatItem.Helmet());
	public static final RegistryObject<Item> VENOM_GLAIVE = REGISTRY.register("venom_glaive", () -> new VenomGlaiveItem());
	public static final RegistryObject<Item> FROST_HELMET = REGISTRY.register("frost_helmet", () -> new FrostItem.Helmet());
	public static final RegistryObject<Item> FROST_CHESTPLATE = REGISTRY.register("frost_chestplate", () -> new FrostItem.Chestplate());
	public static final RegistryObject<Item> FROST_LEGGINGS = REGISTRY.register("frost_leggings", () -> new FrostItem.Leggings());
	public static final RegistryObject<Item> FROST_BOOTS = REGISTRY.register("frost_boots", () -> new FrostItem.Boots());
	public static final RegistryObject<Item> FROST_PICKAXE = REGISTRY.register("frost_pickaxe", () -> new FrostPickaxeItem());
	public static final RegistryObject<Item> RACER_HELMET = REGISTRY.register("racer_helmet", () -> new RacerItem.Helmet());
	public static final RegistryObject<Item> RACER_CHESTPLATE = REGISTRY.register("racer_chestplate", () -> new RacerItem.Chestplate());
	public static final RegistryObject<Item> RACER_LEGGINGS = REGISTRY.register("racer_leggings", () -> new RacerItem.Leggings());
	public static final RegistryObject<Item> RACER_BOOTS = REGISTRY.register("racer_boots", () -> new RacerItem.Boots());
	public static final RegistryObject<Item> CHOMP = REGISTRY.register("chomp", () -> new ChompItem());
	public static final RegistryObject<Item> ELECTRISTEEL_HELMET = REGISTRY.register("electristeel_helmet", () -> new ElectristeelItem.Helmet());
	public static final RegistryObject<Item> ELECTRISTEEL_CHESTPLATE = REGISTRY.register("electristeel_chestplate",
			() -> new ElectristeelItem.Chestplate());
	public static final RegistryObject<Item> ELECTRISTEEL_LEGGINGS = REGISTRY.register("electristeel_leggings",
			() -> new ElectristeelItem.Leggings());
	public static final RegistryObject<Item> ELECTRISTEEL_BOOTS = REGISTRY.register("electristeel_boots", () -> new ElectristeelItem.Boots());
	public static final RegistryObject<Item> HEARTSTEEL_HELMET = REGISTRY.register("heartsteel_helmet", () -> new HeartsteelItem.Helmet());
	public static final RegistryObject<Item> HEARTSTEEL_CHESTPLATE = REGISTRY.register("heartsteel_chestplate",
			() -> new HeartsteelItem.Chestplate());
	public static final RegistryObject<Item> HEARTSTEEL_LEGGINGS = REGISTRY.register("heartsteel_leggings", () -> new HeartsteelItem.Leggings());
	public static final RegistryObject<Item> HEARTSTEEL_BOOTS = REGISTRY.register("heartsteel_boots", () -> new HeartsteelItem.Boots());
	public static final RegistryObject<Item> HEARTSTEALER = REGISTRY.register("heartstealer", () -> new HeartstealerItem());
	public static final RegistryObject<Item> SHADOW_HELMET = REGISTRY.register("shadow_helmet", () -> new ShadowItem.Helmet());
	public static final RegistryObject<Item> SHADOW_CHESTPLATE = REGISTRY.register("shadow_chestplate", () -> new ShadowItem.Chestplate());
	public static final RegistryObject<Item> SHADOW_LEGGINGS = REGISTRY.register("shadow_leggings", () -> new ShadowItem.Leggings());
	public static final RegistryObject<Item> SHADOW_BOOTS = REGISTRY.register("shadow_boots", () -> new ShadowItem.Boots());
	public static final RegistryObject<Item> NINJA_HELMET = REGISTRY.register("ninja_helmet", () -> new NinjaItem.Helmet());
	public static final RegistryObject<Item> NINJA_CHESTPLATE = REGISTRY.register("ninja_chestplate", () -> new NinjaItem.Chestplate());
	public static final RegistryObject<Item> NINJA_LEGGINGS = REGISTRY.register("ninja_leggings", () -> new NinjaItem.Leggings());
	public static final RegistryObject<Item> NINJA_BOOTS = REGISTRY.register("ninja_boots", () -> new NinjaItem.Boots());
	public static final RegistryObject<Item> PLASMA_KATANA = REGISTRY.register("plasma_katana", () -> new PlasmaKatanaItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate",
			() -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> CACTUS_ARMOR_HELMET = REGISTRY.register("cactus_armor_helmet", () -> new CactusArmorItem.Helmet());
	public static final RegistryObject<Item> CACTUS_ARMOR_CHESTPLATE = REGISTRY.register("cactus_armor_chestplate",
			() -> new CactusArmorItem.Chestplate());
	public static final RegistryObject<Item> CACTUS_ARMOR_LEGGINGS = REGISTRY.register("cactus_armor_leggings", () -> new CactusArmorItem.Leggings());
	public static final RegistryObject<Item> CACTUS_ARMOR_BOOTS = REGISTRY.register("cactus_armor_boots", () -> new CactusArmorItem.Boots());
	public static final RegistryObject<Item> STONE_ARMOR_HELMET = REGISTRY.register("stone_armor_helmet", () -> new StoneArmorItem.Helmet());
	public static final RegistryObject<Item> STONE_ARMOR_CHESTPLATE = REGISTRY.register("stone_armor_chestplate",
			() -> new StoneArmorItem.Chestplate());
	public static final RegistryObject<Item> STONE_ARMOR_LEGGINGS = REGISTRY.register("stone_armor_leggings", () -> new StoneArmorItem.Leggings());
	public static final RegistryObject<Item> STONE_ARMOR_BOOTS = REGISTRY.register("stone_armor_boots", () -> new StoneArmorItem.Boots());
	public static final RegistryObject<Item> WOOD_ARMOR_HELMET = REGISTRY.register("wood_armor_helmet", () -> new WoodArmorItem.Helmet());
	public static final RegistryObject<Item> WOOD_ARMOR_CHESTPLATE = REGISTRY.register("wood_armor_chestplate", () -> new WoodArmorItem.Chestplate());
	public static final RegistryObject<Item> WOOD_ARMOR_LEGGINGS = REGISTRY.register("wood_armor_leggings", () -> new WoodArmorItem.Leggings());
	public static final RegistryObject<Item> WOOD_ARMOR_BOOTS = REGISTRY.register("wood_armor_boots", () -> new WoodArmorItem.Boots());
	public static final RegistryObject<Item> LAVA_ARMOR_HELMET = REGISTRY.register("lava_armor_helmet", () -> new LavaArmorItem.Helmet());
	public static final RegistryObject<Item> LAVA_ARMOR_CHESTPLATE = REGISTRY.register("lava_armor_chestplate", () -> new LavaArmorItem.Chestplate());
	public static final RegistryObject<Item> LAVA_ARMOR_LEGGINGS = REGISTRY.register("lava_armor_leggings", () -> new LavaArmorItem.Leggings());
	public static final RegistryObject<Item> LAVA_ARMOR_BOOTS = REGISTRY.register("lava_armor_boots", () -> new LavaArmorItem.Boots());
	public static final RegistryObject<Item> WATER_ARMOR_HELMET = REGISTRY.register("water_armor_helmet", () -> new WaterArmorItem.Helmet());
	public static final RegistryObject<Item> WATER_ARMOR_CHESTPLATE = REGISTRY.register("water_armor_chestplate",
			() -> new WaterArmorItem.Chestplate());
	public static final RegistryObject<Item> WATER_ARMOR_LEGGINGS = REGISTRY.register("water_armor_leggings", () -> new WaterArmorItem.Leggings());
	public static final RegistryObject<Item> WATER_ARMOR_BOOTS = REGISTRY.register("water_armor_boots", () -> new WaterArmorItem.Boots());
	public static final RegistryObject<Item> RAINBOW_HELMET = REGISTRY.register("rainbow_helmet", () -> new RainbowItem.Helmet());
	public static final RegistryObject<Item> RAINBOW_CHESTPLATE = REGISTRY.register("rainbow_chestplate", () -> new RainbowItem.Chestplate());
	public static final RegistryObject<Item> RAINBOW_LEGGINGS = REGISTRY.register("rainbow_leggings", () -> new RainbowItem.Leggings());
	public static final RegistryObject<Item> RAINBOW_BOOTS = REGISTRY.register("rainbow_boots", () -> new RainbowItem.Boots());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_HELMET = REGISTRY.register("enderium_armor_helmet", () -> new EnderiumArmorItem.Helmet());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_CHESTPLATE = REGISTRY.register("enderium_armor_chestplate",
			() -> new EnderiumArmorItem.Chestplate());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_LEGGINGS = REGISTRY.register("enderium_armor_leggings",
			() -> new EnderiumArmorItem.Leggings());
	public static final RegistryObject<Item> ENDERIUM_ARMOR_BOOTS = REGISTRY.register("enderium_armor_boots", () -> new EnderiumArmorItem.Boots());
	public static final RegistryObject<Item> TRUE_NETHERITE_HELMET = REGISTRY.register("true_netherite_helmet", () -> new TrueNetheriteItem.Helmet());
	public static final RegistryObject<Item> TRUE_NETHERITE_CHESTPLATE = REGISTRY.register("true_netherite_chestplate",
			() -> new TrueNetheriteItem.Chestplate());
	public static final RegistryObject<Item> TRUE_NETHERITE_LEGGINGS = REGISTRY.register("true_netherite_leggings",
			() -> new TrueNetheriteItem.Leggings());
	public static final RegistryObject<Item> TRUE_NETHERITE_BOOTS = REGISTRY.register("true_netherite_boots", () -> new TrueNetheriteItem.Boots());
	public static final RegistryObject<Item> ULTRA_NETHER_AXE = REGISTRY.register("ultra_nether_axe", () -> new UltraNetherAxeItem());
	public static final RegistryObject<Item> TRUE_ENDERIUM_HELMET = REGISTRY.register("true_enderium_helmet", () -> new TrueEnderiumItem.Helmet());
	public static final RegistryObject<Item> TRUE_ENDERIUM_CHESTPLATE = REGISTRY.register("true_enderium_chestplate",
			() -> new TrueEnderiumItem.Chestplate());
	public static final RegistryObject<Item> TRUE_ENDERIUM_LEGGINGS = REGISTRY.register("true_enderium_leggings",
			() -> new TrueEnderiumItem.Leggings());
	public static final RegistryObject<Item> TRUE_ENDERIUM_BOOTS = REGISTRY.register("true_enderium_boots", () -> new TrueEnderiumItem.Boots());
	public static final RegistryObject<Item> ULTRA_END_BOW = REGISTRY.register("ultra_end_bow", () -> new UltraEndBowItem());
	public static final RegistryObject<Item> MAGNETITE_ARMOR_HELMET = REGISTRY.register("magnetite_armor_helmet",
			() -> new MagnetiteArmorItem.Helmet());
	public static final RegistryObject<Item> MAGNETITE_ARMOR_CHESTPLATE = REGISTRY.register("magnetite_armor_chestplate",
			() -> new MagnetiteArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGNETITE_ARMOR_LEGGINGS = REGISTRY.register("magnetite_armor_leggings",
			() -> new MagnetiteArmorItem.Leggings());
	public static final RegistryObject<Item> MAGNETITE_ARMOR_BOOTS = REGISTRY.register("magnetite_armor_boots", () -> new MagnetiteArmorItem.Boots());
	public static final RegistryObject<Item> MAGNETITE_SWORD = REGISTRY.register("magnetite_sword", () -> new MagnetiteSwordItem());
	public static final RegistryObject<Item> PLASMASTEEL_MK_2_HELMET = REGISTRY.register("plasmasteel_mk_2_helmet",
			() -> new PlasmasteelMk2Item.Helmet());
	public static final RegistryObject<Item> PLASMASTEEL_MK_2_CHESTPLATE = REGISTRY.register("plasmasteel_mk_2_chestplate",
			() -> new PlasmasteelMk2Item.Chestplate());
	public static final RegistryObject<Item> PLASMASTEEL_MK_2_LEGGINGS = REGISTRY.register("plasmasteel_mk_2_leggings",
			() -> new PlasmasteelMk2Item.Leggings());
	public static final RegistryObject<Item> PLASMASTEEL_MK_2_BOOTS = REGISTRY.register("plasmasteel_mk_2_boots",
			() -> new PlasmasteelMk2Item.Boots());
	public static final RegistryObject<Item> RED_PLASMA = REGISTRY.register("red_plasma", () -> new RedPlasmaItem());
	public static final RegistryObject<Item> LIGHTNING_PLASMA = REGISTRY.register("lightning_plasma", () -> new LightningPlasmaItem());
	public static final RegistryObject<Item> ORANGE_PLASMA = REGISTRY.register("orange_plasma", () -> new OrangePlasmaItem());
	public static final RegistryObject<Item> GREEN_PLASMA = REGISTRY.register("green_plasma", () -> new GreenPlasmaItem());
	public static final RegistryObject<Item> BLUE_PLASMA = REGISTRY.register("blue_plasma", () -> new BluePlasmaItem());
	public static final RegistryObject<Item> PURPLE_PLASMA = REGISTRY.register("purple_plasma", () -> new PurplePlasmaItem());
	public static final RegistryObject<Item> SHURIKEN = REGISTRY.register("shuriken", () -> new ShurikenItem());
	public static final RegistryObject<Item> EXPLOSIVE_SHURIKEN = REGISTRY.register("explosive_shuriken", () -> new ExplosiveShurikenItem());
	public static final RegistryObject<Item> GREEN_PLASMA_MK_2 = REGISTRY.register("green_plasma_mk_2", () -> new GreenPlasmaMk2Item());
	public static final RegistryObject<Item> VEXXES_GUN = REGISTRY.register("vexxes_gun", () -> new VexxesGunItem());
	public static final RegistryObject<Item> BLOW_ABILITY = REGISTRY.register("blow_ability", () -> new BlowAbilityItem());
	public static final RegistryObject<Item> TELEPORT_ABILITY = REGISTRY.register("teleport_ability", () -> new TeleportAbilityItem());
	public static final RegistryObject<Item> CHOMP_SPIT = REGISTRY.register("chomp_spit", () -> new ChompSpitItem());
	public static final RegistryObject<Item> PLASMASTEEL_CASE = REGISTRY.register("plasmasteel_case", () -> new PlasmasteelCaseItem());
	public static final RegistryObject<Item> MECH_STRIKE = REGISTRY.register("mech_strike", () -> new MechStrikeItem());
	public static final RegistryObject<Item> FLIGHT_ENABLER = REGISTRY.register("flight_enabler", () -> new FlightEnablerItem());
	public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new SteelNuggetItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> ENDERIUM_INGOT = REGISTRY.register("enderium_ingot", () -> new EnderiumIngotItem());
	public static final RegistryObject<Item> NETHER_GEM = REGISTRY.register("nether_gem", () -> new NetherGemItem());
	public static final RegistryObject<Item> ENDER_GEM = REGISTRY.register("ender_gem", () -> new EnderGemItem());
	public static final RegistryObject<Item> ATTACK_CHIP = REGISTRY.register("attack_chip", () -> new AttackChipItem());
	public static final RegistryObject<Item> FIRE_CHIP = REGISTRY.register("fire_chip", () -> new FireChipItem());
	public static final RegistryObject<Item> SPEED_CHIP = REGISTRY.register("speed_chip", () -> new SpeedChipItem());
	public static final RegistryObject<Item> ENERGY_CHIP = REGISTRY.register("energy_chip", () -> new EnergyChipItem());
	public static final RegistryObject<Item> DEFENSE_CHIP = REGISTRY.register("defense_chip", () -> new DefenseChipItem());
	public static final RegistryObject<Item> FLIGHT_CHIP = REGISTRY.register("flight_chip", () -> new FlightChipItem());
	public static final RegistryObject<Item> CHIP = REGISTRY.register("chip", () -> new ChipItem());
	public static final RegistryObject<Item> MINECOIN = REGISTRY.register("minecoin", () -> new MinecoinItem());
	public static final RegistryObject<Item> MAGNETITE_INGOT = REGISTRY.register("magnetite_ingot", () -> new MagnetiteIngotItem());
	public static final RegistryObject<Item> MOLTRON_ROCKET_ITEM = REGISTRY.register("moltron_rocket_item", () -> new MoltronRocketItemItem());
	public static final RegistryObject<Item> HOT_MATTER = REGISTRY.register("hot_matter", () -> new HotMatterItem());
	public static final RegistryObject<Item> FORCEFIELD = REGISTRY.register("forcefield", () -> new ForcefieldItem());
	public static final RegistryObject<Item> X_ZSWAP = REGISTRY.register("x_zswap", () -> new XZswapItem());
	public static final RegistryObject<Item> HASTEFRUIT = REGISTRY.register("hastefruit", () -> new HastefruitItem());
	public static final RegistryObject<Item> JARNUMFRUIT = REGISTRY.register("jarnumfruit", () -> new JarnumfruitItem());
	public static final RegistryObject<Item> PARACHUTE = REGISTRY.register("parachute", () -> new ParachuteItem());
	public static final RegistryObject<Item> TECH_MANIA = REGISTRY.register("tech_mania", () -> new TechManiaItem());
	public static final RegistryObject<Item> MOLTRON_MECH = REGISTRY.register("moltron_mech_spawn_egg",
			() -> new ForgeSpawnEggItem(MurrayModEntities.MOLTRON_MECH, -65536, -16777216,
					new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC)));
	public static final RegistryObject<Item> MOLTRON_ROCKET = REGISTRY.register("moltron_rocket_spawn_egg",
			() -> new ForgeSpawnEggItem(MurrayModEntities.MOLTRON_ROCKET, -65536, -1, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC)));
	public static final RegistryObject<Item> PURPLE_SOLDIER = REGISTRY.register("purple_soldier_spawn_egg",
			() -> new ForgeSpawnEggItem(MurrayModEntities.PURPLE_SOLDIER, -3407617, -16777216,
					new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC)));
	public static final RegistryObject<Item> ORNATE = REGISTRY.register("ornate_spawn_egg",
			() -> new ForgeSpawnEggItem(MurrayModEntities.ORNATE, -3407617, -6750004, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC)));
	public static final RegistryObject<Item> VEXX = REGISTRY.register("vexx_spawn_egg",
			() -> new ForgeSpawnEggItem(MurrayModEntities.VEXX, -16777216, -3407617, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC)));
	public static final RegistryObject<Item> BRUTE = REGISTRY.register("brute_spawn_egg",
			() -> new ForgeSpawnEggItem(MurrayModEntities.BRUTE, -3407617, -6750004, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC)));
	public static final RegistryObject<Item> TRAIL_ICE = block(MurrayModBlocks.TRAIL_ICE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> ENDERIUM_INFUSED_STONE = block(MurrayModBlocks.ENDERIUM_INFUSED_STONE,
			MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> CORRUPTION_GRASS = block(MurrayModBlocks.CORRUPTION_GRASS, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> ACTIVE_CORRUPTION_GRASS = block(MurrayModBlocks.ACTIVE_CORRUPTION_GRASS,
			MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> SILICA = block(MurrayModBlocks.SILICA, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> PARTICLE = block(MurrayModBlocks.PARTICLE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> KING = block(MurrayModBlocks.KING, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> CORRUPT_PARTICLE = block(MurrayModBlocks.CORRUPT_PARTICLE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> RIFT = block(MurrayModBlocks.RIFT, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> DRILL = block(MurrayModBlocks.DRILL, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> DEPOSIT = block(MurrayModBlocks.DEPOSIT, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> CORRUPTED_CRATE = block(MurrayModBlocks.CORRUPTED_CRATE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> BRUTE_CRATE = block(MurrayModBlocks.BRUTE_CRATE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> ORNATE_CRATE = block(MurrayModBlocks.ORNATE_CRATE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> VEX_CRATE = block(MurrayModBlocks.VEX_CRATE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> COMPUTER = block(MurrayModBlocks.COMPUTER, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MAGNETITE_ORE = block(MurrayModBlocks.MAGNETITE_ORE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MAGNETITE_BLOCK = block(MurrayModBlocks.MAGNETITE_BLOCK, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MAGNET_A = block(MurrayModBlocks.MAGNET_A, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MAGNET_B = block(MurrayModBlocks.MAGNET_B, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> VENUS_STONE = block(MurrayModBlocks.VENUS_STONE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> ADVANCED_COMPUTER = block(MurrayModBlocks.ADVANCED_COMPUTER, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MAGNETIC_DISASSEMBLER = block(MurrayModBlocks.MAGNETIC_DISASSEMBLER, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> WOODEN_SOLAR_PANEL = block(MurrayModBlocks.WOODEN_SOLAR_PANEL, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MINI_MILL = block(MurrayModBlocks.MINI_MILL, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> MINI_MILL_2 = block(MurrayModBlocks.MINI_MILL_2, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> THE_SUN_IN_A_BOX = block(MurrayModBlocks.THE_SUN_IN_A_BOX, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> TREE_IN_A_BOX = block(MurrayModBlocks.TREE_IN_A_BOX, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> SCAFFOLD = block(MurrayModBlocks.SCAFFOLD, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> ONE_WAY = block(MurrayModBlocks.ONE_WAY, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> ONE_WAY_DOOR = block(MurrayModBlocks.ONE_WAY_DOOR, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> FORCEFIELD_BLOCK = block(MurrayModBlocks.FORCEFIELD_BLOCK, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> CND = block(MurrayModBlocks.CND, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> JARNUMLEAVE = block(MurrayModBlocks.JARNUMLEAVE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> POORLY_MADE_LADDER = block(MurrayModBlocks.POORLY_MADE_LADDER, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> FUTURE_FLOOR = block(MurrayModBlocks.FUTURE_FLOOR, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> FUTURE_WALL = block(MurrayModBlocks.FUTURE_WALL, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> FUTURE_BRICKS = block(MurrayModBlocks.FUTURE_BRICKS, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> FUTURE_GLASS = block(MurrayModBlocks.FUTURE_GLASS, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> FUTURE_TILES = block(MurrayModBlocks.FUTURE_TILES, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> XRAY = block(MurrayModBlocks.XRAY, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> SANDWORM = block(MurrayModBlocks.SANDWORM, MurrayModTabs.TAB_MURRAY_3_BLOCKS);
	public static final RegistryObject<Item> POPUP_HOUSE = block(MurrayModBlocks.POPUP_HOUSE, MurrayModTabs.TAB_MURRAY_3_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
