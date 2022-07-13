// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellongfallboots extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modellongfallboots() {
		textureWidth = 64;
		textureHeight = 32;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 19).addBox(-1.0F, 5.0F, 2.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(6, 28).addBox(-1.0F, 16.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 19).addBox(-0.8F, 5.0F, 2.0F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(6, 28).addBox(-0.8F, 16.0F, -1.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}