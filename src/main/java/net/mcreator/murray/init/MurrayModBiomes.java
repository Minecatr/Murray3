
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

import net.minecraft.world.level.biome.Biome;

import net.mcreator.murray.world.biome.MeltingFieldsBiome;
import net.mcreator.murray.world.biome.CorruptFieldsBiome;
import net.mcreator.murray.MurrayMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MurrayModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MurrayMod.MODID);
	public static final RegistryObject<Biome> CORRUPT_FIELDS = REGISTRY.register("corrupt_fields", () -> CorruptFieldsBiome.createBiome());
	public static final RegistryObject<Biome> MELTING_FIELDS = REGISTRY.register("melting_fields", () -> MeltingFieldsBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CorruptFieldsBiome.init();
			MeltingFieldsBiome.init();
		});
	}
}
