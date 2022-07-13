
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.murray.block.entity.TheSunInABoxBlockEntity;
import net.mcreator.murray.block.entity.MiniMillBlockEntity;
import net.mcreator.murray.block.entity.MiniMill2BlockEntity;
import net.mcreator.murray.block.entity.MagneticDisassemblerBlockEntity;
import net.mcreator.murray.block.entity.CNDBlockEntity;
import net.mcreator.murray.block.entity.AdvancedComputerBlockEntity;
import net.mcreator.murray.MurrayMod;

public class MurrayModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MurrayMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ADVANCED_COMPUTER = register("advanced_computer", MurrayModBlocks.ADVANCED_COMPUTER,
			AdvancedComputerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MAGNETIC_DISASSEMBLER = register("magnetic_disassembler",
			MurrayModBlocks.MAGNETIC_DISASSEMBLER, MagneticDisassemblerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINI_MILL = register("mini_mill", MurrayModBlocks.MINI_MILL, MiniMillBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINI_MILL_2 = register("mini_mill_2", MurrayModBlocks.MINI_MILL_2,
			MiniMill2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> THE_SUN_IN_A_BOX = register("the_sun_in_a_box", MurrayModBlocks.THE_SUN_IN_A_BOX,
			TheSunInABoxBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CND = register("cnd", MurrayModBlocks.CND, CNDBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
