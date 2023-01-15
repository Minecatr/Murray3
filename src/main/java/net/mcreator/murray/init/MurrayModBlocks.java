
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.murray.block.XrayBlock;
import net.mcreator.murray.block.WoodenSolarPanelBlock;
import net.mcreator.murray.block.VexCrateBlock;
import net.mcreator.murray.block.VenusStoneBlock;
import net.mcreator.murray.block.TreeInABoxBlock;
import net.mcreator.murray.block.TrailIceBlock;
import net.mcreator.murray.block.TheSunInABoxBlock;
import net.mcreator.murray.block.TechManiaPortalBlock;
import net.mcreator.murray.block.SilicaBlock;
import net.mcreator.murray.block.ScaffoldBlock;
import net.mcreator.murray.block.SandwormBlock;
import net.mcreator.murray.block.RiftBlock;
import net.mcreator.murray.block.PopupHouseBlock;
import net.mcreator.murray.block.PoorlyMadeLadderBlock;
import net.mcreator.murray.block.ParticleBlock;
import net.mcreator.murray.block.OrnateCrateBlock;
import net.mcreator.murray.block.OneWayDoorBlock;
import net.mcreator.murray.block.OneWayBlock;
import net.mcreator.murray.block.MiniMillBlock;
import net.mcreator.murray.block.MiniMill2Block;
import net.mcreator.murray.block.MagnetiteOreBlock;
import net.mcreator.murray.block.MagnetiteBlockBlock;
import net.mcreator.murray.block.MagneticDisassemblerBlock;
import net.mcreator.murray.block.MagnetBBlock;
import net.mcreator.murray.block.MagnetABlock;
import net.mcreator.murray.block.KingBlock;
import net.mcreator.murray.block.JarnumleaveBlock;
import net.mcreator.murray.block.FutureWallBlock;
import net.mcreator.murray.block.FutureTilesBlock;
import net.mcreator.murray.block.FutureGlassBlock;
import net.mcreator.murray.block.FutureFloorBlock;
import net.mcreator.murray.block.FutureBricksBlock;
import net.mcreator.murray.block.ForcefieldBlockBlock;
import net.mcreator.murray.block.EnderiumInfusedStoneBlock;
import net.mcreator.murray.block.DrillBlock;
import net.mcreator.murray.block.DepositBlock;
import net.mcreator.murray.block.CorruptionGrassBlock;
import net.mcreator.murray.block.CorruptedCrateBlock;
import net.mcreator.murray.block.CorruptParticleBlock;
import net.mcreator.murray.block.ComputerBlock;
import net.mcreator.murray.block.CNDBlock;
import net.mcreator.murray.block.BruteCrateBlock;
import net.mcreator.murray.block.AdvancedComputerBlock;
import net.mcreator.murray.block.ActiveCorruptionGrassBlock;
import net.mcreator.murray.MurrayMod;

public class MurrayModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MurrayMod.MODID);
	public static final RegistryObject<Block> TECH_MANIA_PORTAL = REGISTRY.register("tech_mania_portal", () -> new TechManiaPortalBlock());
	public static final RegistryObject<Block> TRAIL_ICE = REGISTRY.register("trail_ice", () -> new TrailIceBlock());
	public static final RegistryObject<Block> ENDERIUM_INFUSED_STONE = REGISTRY.register("enderium_infused_stone",
			() -> new EnderiumInfusedStoneBlock());
	public static final RegistryObject<Block> CORRUPTION_GRASS = REGISTRY.register("corruption_grass", () -> new CorruptionGrassBlock());
	public static final RegistryObject<Block> ACTIVE_CORRUPTION_GRASS = REGISTRY.register("active_corruption_grass",
			() -> new ActiveCorruptionGrassBlock());
	public static final RegistryObject<Block> SILICA = REGISTRY.register("silica", () -> new SilicaBlock());
	public static final RegistryObject<Block> PARTICLE = REGISTRY.register("particle", () -> new ParticleBlock());
	public static final RegistryObject<Block> KING = REGISTRY.register("king", () -> new KingBlock());
	public static final RegistryObject<Block> CORRUPT_PARTICLE = REGISTRY.register("corrupt_particle", () -> new CorruptParticleBlock());
	public static final RegistryObject<Block> RIFT = REGISTRY.register("rift", () -> new RiftBlock());
	public static final RegistryObject<Block> DRILL = REGISTRY.register("drill", () -> new DrillBlock());
	public static final RegistryObject<Block> DEPOSIT = REGISTRY.register("deposit", () -> new DepositBlock());
	public static final RegistryObject<Block> CORRUPTED_CRATE = REGISTRY.register("corrupted_crate", () -> new CorruptedCrateBlock());
	public static final RegistryObject<Block> BRUTE_CRATE = REGISTRY.register("brute_crate", () -> new BruteCrateBlock());
	public static final RegistryObject<Block> ORNATE_CRATE = REGISTRY.register("ornate_crate", () -> new OrnateCrateBlock());
	public static final RegistryObject<Block> VEX_CRATE = REGISTRY.register("vex_crate", () -> new VexCrateBlock());
	public static final RegistryObject<Block> COMPUTER = REGISTRY.register("computer", () -> new ComputerBlock());
	public static final RegistryObject<Block> MAGNETITE_ORE = REGISTRY.register("magnetite_ore", () -> new MagnetiteOreBlock());
	public static final RegistryObject<Block> MAGNETITE_BLOCK = REGISTRY.register("magnetite_block", () -> new MagnetiteBlockBlock());
	public static final RegistryObject<Block> MAGNET_A = REGISTRY.register("magnet_a", () -> new MagnetABlock());
	public static final RegistryObject<Block> MAGNET_B = REGISTRY.register("magnet_b", () -> new MagnetBBlock());
	public static final RegistryObject<Block> VENUS_STONE = REGISTRY.register("venus_stone", () -> new VenusStoneBlock());
	public static final RegistryObject<Block> ADVANCED_COMPUTER = REGISTRY.register("advanced_computer", () -> new AdvancedComputerBlock());
	public static final RegistryObject<Block> MAGNETIC_DISASSEMBLER = REGISTRY.register("magnetic_disassembler",
			() -> new MagneticDisassemblerBlock());
	public static final RegistryObject<Block> WOODEN_SOLAR_PANEL = REGISTRY.register("wooden_solar_panel", () -> new WoodenSolarPanelBlock());
	public static final RegistryObject<Block> MINI_MILL = REGISTRY.register("mini_mill", () -> new MiniMillBlock());
	public static final RegistryObject<Block> MINI_MILL_2 = REGISTRY.register("mini_mill_2", () -> new MiniMill2Block());
	public static final RegistryObject<Block> THE_SUN_IN_A_BOX = REGISTRY.register("the_sun_in_a_box", () -> new TheSunInABoxBlock());
	public static final RegistryObject<Block> TREE_IN_A_BOX = REGISTRY.register("tree_in_a_box", () -> new TreeInABoxBlock());
	public static final RegistryObject<Block> SCAFFOLD = REGISTRY.register("scaffold", () -> new ScaffoldBlock());
	public static final RegistryObject<Block> ONE_WAY = REGISTRY.register("one_way", () -> new OneWayBlock());
	public static final RegistryObject<Block> ONE_WAY_DOOR = REGISTRY.register("one_way_door", () -> new OneWayDoorBlock());
	public static final RegistryObject<Block> FORCEFIELD_BLOCK = REGISTRY.register("forcefield_block", () -> new ForcefieldBlockBlock());
	public static final RegistryObject<Block> CND = REGISTRY.register("cnd", () -> new CNDBlock());
	public static final RegistryObject<Block> JARNUMLEAVE = REGISTRY.register("jarnumleave", () -> new JarnumleaveBlock());
	public static final RegistryObject<Block> POORLY_MADE_LADDER = REGISTRY.register("poorly_made_ladder", () -> new PoorlyMadeLadderBlock());
	public static final RegistryObject<Block> FUTURE_FLOOR = REGISTRY.register("future_floor", () -> new FutureFloorBlock());
	public static final RegistryObject<Block> FUTURE_WALL = REGISTRY.register("future_wall", () -> new FutureWallBlock());
	public static final RegistryObject<Block> FUTURE_BRICKS = REGISTRY.register("future_bricks", () -> new FutureBricksBlock());
	public static final RegistryObject<Block> FUTURE_GLASS = REGISTRY.register("future_glass", () -> new FutureGlassBlock());
	public static final RegistryObject<Block> FUTURE_TILES = REGISTRY.register("future_tiles", () -> new FutureTilesBlock());
	public static final RegistryObject<Block> XRAY = REGISTRY.register("xray", () -> new XrayBlock());
	public static final RegistryObject<Block> SANDWORM = REGISTRY.register("sandworm", () -> new SandwormBlock());
	public static final RegistryObject<Block> POPUP_HOUSE = REGISTRY.register("popup_house", () -> new PopupHouseBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			JarnumleaveBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			JarnumleaveBlock.itemColorLoad(event);
		}
	}
}
