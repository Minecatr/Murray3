// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmoltron_mech extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm_r1;
	private final ModelRenderer rightArm_r2;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer leftArm_r2;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;
	private final ModelRenderer getArmForSideHandSide;
	private final ModelRenderer modelrenderer;

	public Modelmoltron_mech() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.5F, 2.0F);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(0, 28).addBox(-20.0F, -13.0F, 5.0F, 40.0F, 20.0F, 32.0F, 0.0F, false);
		body.setTextureOffset(72, 6).addBox(-11.0F, -9.0F, -3.0F, 22.0F, 14.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(7, 153).addBox(-12.0F, -20.0F, 15.0F, 24.0F, 7.0F, 20.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(0.0F, -32.0F, 0.0F);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setRotationPoint(0.0F, 32.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, -0.2618F, 0.0F, 0.0F);
		rightArm_r1.setTextureOffset(83, 82).addBox(-36.0F, -16.0F, -4.0F, 11.0F, 22.0F, 12.0F, 0.0F, false);

		rightArm_r2 = new ModelRenderer(this);
		rightArm_r2.setRotationPoint(0.0F, 32.0F, 0.0F);
		rightArm.addChild(rightArm_r2);
		setRotationAngle(rightArm_r2, 0.2618F, 0.0F, 0.0F);
		rightArm_r2.setTextureOffset(31, 80).addBox(-34.0F, -34.0F, 0.0F, 14.0F, 24.0F, 12.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(0.0F, -32.0F, 0.0F);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setRotationPoint(0.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, -0.2618F, 0.0F, 0.0F);
		leftArm_r1.setTextureOffset(83, 118).addBox(25.0F, -16.0F, -4.0F, 11.0F, 22.0F, 12.0F, 0.0F, false);

		leftArm_r2 = new ModelRenderer(this);
		leftArm_r2.setRotationPoint(0.0F, 32.0F, 0.0F);
		leftArm.addChild(leftArm_r2);
		setRotationAngle(leftArm_r2, 0.2618F, 0.0F, 0.0F);
		leftArm_r2.setTextureOffset(31, 116).addBox(20.0F, -34.0F, 0.0F, 14.0F, 24.0F, 12.0F, 0.0F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightLeg.setTextureOffset(144, 48).addBox(-20.0F, 4.0F, -4.5F, 12.0F, 20.0F, 12.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftLeg.setTextureOffset(192, 48).addBox(9.0F, 4.0F, -4.5F, 12.0F, 20.0F, 12.0F, 0.0F, false);

		getArmForSideHandSide = new ModelRenderer(this);
		getArmForSideHandSide.setRotationPoint(0.0F, 0.0F, 0.0F);

		modelrenderer = new ModelRenderer(this);
		modelrenderer.setRotationPoint(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		getArmForSideHandSide.render(matrixStack, buffer, packedLight, packedOverlay);
		modelrenderer.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}