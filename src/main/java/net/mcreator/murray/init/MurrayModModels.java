
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.murray.client.model.Modelshuriken_v2;
import net.mcreator.murray.client.model.Modelpsbraclet;
import net.mcreator.murray.client.model.ModelplasmasteelMk5Main;
import net.mcreator.murray.client.model.ModelplasmasteelMk4Main;
import net.mcreator.murray.client.model.Modelmoltron_mech_v2;
import net.mcreator.murray.client.model.ModelmoltronRocket_v2;
import net.mcreator.murray.client.model.Modellaser_v2;
import net.mcreator.murray.client.model.Modelirongolem_V2;
import net.mcreator.murray.client.model.ModelMagicSword;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MurrayModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modellaser_v2.LAYER_LOCATION, Modellaser_v2::createBodyLayer);
		event.registerLayerDefinition(Modelirongolem_V2.LAYER_LOCATION, Modelirongolem_V2::createBodyLayer);
		event.registerLayerDefinition(ModelMagicSword.LAYER_LOCATION, ModelMagicSword::createBodyLayer);
		event.registerLayerDefinition(Modelshuriken_v2.LAYER_LOCATION, Modelshuriken_v2::createBodyLayer);
		event.registerLayerDefinition(ModelmoltronRocket_v2.LAYER_LOCATION, ModelmoltronRocket_v2::createBodyLayer);
		event.registerLayerDefinition(ModelplasmasteelMk4Main.LAYER_LOCATION, ModelplasmasteelMk4Main::createBodyLayer);
		event.registerLayerDefinition(ModelplasmasteelMk5Main.LAYER_LOCATION, ModelplasmasteelMk5Main::createBodyLayer);
		event.registerLayerDefinition(Modelmoltron_mech_v2.LAYER_LOCATION, Modelmoltron_mech_v2::createBodyLayer);
		event.registerLayerDefinition(Modelpsbraclet.LAYER_LOCATION, Modelpsbraclet::createBodyLayer);
	}
}
