
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.murray.client.gui.MagneticDissasemblerGuiScreen;
import net.mcreator.murray.client.gui.InvestingScreen;
import net.mcreator.murray.client.gui.CNDGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MurrayModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MurrayModMenus.INVESTING, InvestingScreen::new);
			MenuScreens.register(MurrayModMenus.MAGNETIC_DISSASEMBLER_GUI, MagneticDissasemblerGuiScreen::new);
			MenuScreens.register(MurrayModMenus.CNDGUI, CNDGUIScreen::new);
		});
	}
}
