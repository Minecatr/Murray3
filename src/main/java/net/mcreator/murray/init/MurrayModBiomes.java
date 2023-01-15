
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.murray.world.biome.SteelFieldsBiome;
import net.mcreator.murray.world.biome.MeltingFieldsBiome;
import net.mcreator.murray.world.biome.CorruptFieldsBiome;
import net.mcreator.murray.MurrayMod;

public class MurrayModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MurrayMod.MODID);
	public static final RegistryObject<Biome> CORRUPT_FIELDS = REGISTRY.register("corrupt_fields", CorruptFieldsBiome::createBiome);
	public static final RegistryObject<Biome> MELTING_FIELDS = REGISTRY.register("melting_fields", MeltingFieldsBiome::createBiome);
	public static final RegistryObject<Biome> STEEL_FIELDS = REGISTRY.register("steel_fields", SteelFieldsBiome::createBiome);
}
