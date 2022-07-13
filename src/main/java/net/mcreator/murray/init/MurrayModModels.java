
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.murray.client.model.Modelmoltron_mech_v2;
import net.mcreator.murray.client.model.ModelmoltronRocket_v2;
import net.mcreator.murray.client.model.Modellaser_v2;
import net.mcreator.murray.client.model.Modelirongolem_V2;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MurrayModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelmoltronRocket_v2.LAYER_LOCATION, ModelmoltronRocket_v2::createBodyLayer);
		event.registerLayerDefinition(Modellaser_v2.LAYER_LOCATION, Modellaser_v2::createBodyLayer);
		event.registerLayerDefinition(Modelirongolem_V2.LAYER_LOCATION, Modelirongolem_V2::createBodyLayer);
		event.registerLayerDefinition(Modelmoltron_mech_v2.LAYER_LOCATION, Modelmoltron_mech_v2::createBodyLayer);
	}
}
