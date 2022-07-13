
package net.mcreator.murray.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.murray.entity.PurpleSoldierEntity;

public class PurpleSoldierRenderer extends HumanoidMobRenderer<PurpleSoldierEntity, HumanoidModel<PurpleSoldierEntity>> {
	public PurpleSoldierRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(PurpleSoldierEntity entity) {
		return new ResourceLocation("murray:textures/70111152ca3b7f52c3dae86dc098bd448cd38ef4.png");
	}
}
