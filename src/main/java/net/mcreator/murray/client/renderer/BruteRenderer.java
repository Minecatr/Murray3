
package net.mcreator.murray.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.murray.entity.BruteEntity;
import net.mcreator.murray.client.model.Modelirongolem_V2;

public class BruteRenderer extends MobRenderer<BruteEntity, Modelirongolem_V2<BruteEntity>> {
	public BruteRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem_V2(context.bakeLayer(Modelirongolem_V2.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BruteEntity entity) {
		return new ResourceLocation("murray:textures/entities/brute.png");
	}
}
