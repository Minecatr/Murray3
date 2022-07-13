
package net.mcreator.murray.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.murray.entity.OrnateEntity;

public class OrnateRenderer extends HumanoidMobRenderer<OrnateEntity, HumanoidModel<OrnateEntity>> {
	public OrnateRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(OrnateEntity entity) {
		return new ResourceLocation("murray:textures/7426615358c1c90acbe2ae23d3a3a2d6c2ace8c9.png");
	}
}
