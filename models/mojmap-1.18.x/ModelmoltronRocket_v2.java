// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelmoltronRocket_v2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "moltronrocket_v2"), "main");
	private final ModelPart bb_main;

	public ModelmoltronRocket_v2(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(80, 8)
						.addBox(-16.0F, -8.0F, -4.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 8)
						.addBox(8.0F, -8.0F, -4.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 8)
						.addBox(-4.0F, -8.0F, -16.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(80, 8)
						.addBox(-4.0F, -8.0F, 8.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-8.0F, -64.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(72, 4)
						.addBox(-6.0F, -80.0F, -6.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, -32.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-8.0F, -48.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}