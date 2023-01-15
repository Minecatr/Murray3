
package net.mcreator.murray.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.murray.entity.MoltronRocketEntity;
import net.mcreator.murray.client.model.ModelmoltronRocket_v2;

public class MoltronRocketRenderer extends MobRenderer<MoltronRocketEntity, ModelmoltronRocket_v2<MoltronRocketEntity>> {
	public MoltronRocketRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelmoltronRocket_v2(context.bakeLayer(ModelmoltronRocket_v2.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoltronRocketEntity entity) {
		return new ResourceLocation("murray:textures/entities/moltron_rocket.png");
	}
}
