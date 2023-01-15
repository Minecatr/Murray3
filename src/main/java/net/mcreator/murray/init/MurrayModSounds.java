
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.murray.MurrayMod;

public class MurrayModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MurrayMod.MODID);
	public static final RegistryObject<SoundEvent> COPICAT = REGISTRY.register("copicat",
			() -> new SoundEvent(new ResourceLocation("murray", "copicat")));
	public static final RegistryObject<SoundEvent> CORRUPTION_FIELDS = REGISTRY.register("corruption_fields",
			() -> new SoundEvent(new ResourceLocation("murray", "corruption_fields")));
	public static final RegistryObject<SoundEvent> XZSWAP = REGISTRY.register("xzswap",
			() -> new SoundEvent(new ResourceLocation("murray", "xzswap")));
	public static final RegistryObject<SoundEvent> FORCEFIELD = REGISTRY.register("forcefield",
			() -> new SoundEvent(new ResourceLocation("murray", "forcefield")));
}
