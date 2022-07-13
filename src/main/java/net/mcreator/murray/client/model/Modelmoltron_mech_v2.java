package net.mcreator.murray.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmoltron_mech_v2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("murray", "modelmoltron_mech_v_2"), "main");
	public final ModelPart body;
	public final ModelPart rightArm;
	public final ModelPart leftArm;
	public final ModelPart rightLeg;
	public final ModelPart leftLeg;
	public final ModelPart getArmForSideHandSide;
	public final ModelPart modelrenderer;

	public Modelmoltron_mech_v2(ModelPart root) {
		this.body = root.getChild("body");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.rightLeg = root.getChild("rightLeg");
		this.leftLeg = root.getChild("leftLeg");
		this.getArmForSideHandSide = root.getChild("getArmForSideHandSide");
		this.modelrenderer = root.getChild("modelrenderer");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 28).addBox(-20.0F, -13.0F, 5.0F, 40.0F, 20.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(72, 6)
						.addBox(-11.0F, -9.0F, -3.0F, 22.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(7, 153).addBox(-12.0F, -20.0F, 15.0F,
								24.0F, 7.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(0.0F, -32.0F, 0.0F));
		PartDefinition rightArm_r1 = rightArm.addOrReplaceChild("rightArm_r1",
				CubeListBuilder.create().texOffs(83, 82).addBox(-36.0F, -16.0F, -4.0F, 11.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 32.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition rightArm_r2 = rightArm.addOrReplaceChild("rightArm_r2",
				CubeListBuilder.create().texOffs(31, 80).addBox(-34.0F, -34.0F, 0.0F, 14.0F, 24.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 32.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offset(0.0F, -32.0F, 0.0F));
		PartDefinition leftArm_r1 = leftArm.addOrReplaceChild("leftArm_r1",
				CubeListBuilder.create().texOffs(83, 118).addBox(25.0F, -16.0F, -4.0F, 11.0F, 22.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 32.0F, 0.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition leftArm_r2 = leftArm.addOrReplaceChild("leftArm_r2",
				CubeListBuilder.create().texOffs(31, 116).addBox(20.0F, -34.0F, 0.0F, 14.0F, 24.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 32.0F, 0.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg",
				CubeListBuilder.create().texOffs(144, 48).addBox(-20.0F, 4.0F, -4.5F, 12.0F, 20.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg",
				CubeListBuilder.create().texOffs(192, 48).addBox(9.0F, 4.0F, -4.5F, 12.0F, 20.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition getArmForSideHandSide = partdefinition.addOrReplaceChild("getArmForSideHandSide", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition modelrenderer = partdefinition.addOrReplaceChild("modelrenderer", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		getArmForSideHandSide.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		modelrenderer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
