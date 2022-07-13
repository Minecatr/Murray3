
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MurrayModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("murray", "copicat"), new SoundEvent(new ResourceLocation("murray", "copicat")));
		REGISTRY.put(new ResourceLocation("murray", "corruption_fields"), new SoundEvent(new ResourceLocation("murray", "corruption_fields")));
		REGISTRY.put(new ResourceLocation("murray", "xzswap"), new SoundEvent(new ResourceLocation("murray", "xzswap")));
		REGISTRY.put(new ResourceLocation("murray", "forcefield"), new SoundEvent(new ResourceLocation("murray", "forcefield")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
