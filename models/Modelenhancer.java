// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelenhancer extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelenhancer() {
		textureWidth = 64;
		textureHeight = 32;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(16, 25).addBox(-1.0F, 3.0F, -2.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 25).addBox(-0.8F, 3.0F, -2.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
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