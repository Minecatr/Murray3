
package net.mcreator.murray.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.murray.entity.MoltronMechEntity;
import net.mcreator.murray.client.model.Modelmoltron_mech_v2;

public class MoltronMechRenderer extends MobRenderer<MoltronMechEntity, Modelmoltron_mech_v2<MoltronMechEntity>> {
	public MoltronMechRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoltron_mech_v2(context.bakeLayer(Modelmoltron_mech_v2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoltronMechEntity entity) {
		return new ResourceLocation("murray:textures/entities/moltron_mech.png");
	}
}
