package us.teamtinker.armor.armors;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AetherPlate extends ModelBiped {
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape19;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape17;
	ModelRenderer Shape18;

	public AetherPlate(float f) {
		super(f, 0, 128, 128);

		Shape1 = new ModelRenderer(this, 72, 0);
		Shape1.addBox(-3F, 1F, 1F, 6, 2, 2);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 89, 0);
		Shape2.addBox(-5F, 0F, 3F, 2, 2, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 95, 0);
		Shape3.addBox(3F, 0F, 3F, 2, 2, 1);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape19 = new ModelRenderer(this, 0, 39);
		Shape19.addBox(5F, 2F, 1F, 9, 6, 1);
		Shape19.setRotationPoint(0F, 0F, 0F);
		Shape19.setTextureSize(128, 128);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, -0.2792527F, -0.3316126F);
		Shape4 = new ModelRenderer(this, 0, 46);
		Shape4.addBox(-13F, 2F, 1F, 9, 6, 1);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0.2792527F, 0.3316126F);
		Shape5 = new ModelRenderer(this, 0, 53);
		Shape5.addBox(10.33333F, -0.6F, 8.866667F, 1, 3, 10);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0.2094395F, 0.2617994F, 0F);
		Shape6 = new ModelRenderer(this, 0, 66);
		Shape6.addBox(-10.46667F, -0.4F, 7.6F, 1, 3, 10);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0.2094395F, -0.2617994F, 0F);
		Shape7 = new ModelRenderer(this, 37, 40);
		Shape7.addBox(-1F, -2F, -3F, 4, 11, 1);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 47, 40);
		Shape8.addBox(-1F, -3F, -2F, 4, 1, 4);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 63, 40);
		Shape9.addBox(3F, -2F, -2F, 1, 11, 4);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 73, 40);
		Shape10.addBox(-1F, -2F, 2F, 4, 11, 1);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 47, 56);
		Shape11.addBox(-3F, -3F, -2F, 4, 1, 4);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 37, 56);
		Shape12.addBox(-3F, -2F, -3F, 4, 11, 1);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 63, 56);
		Shape13.addBox(-4F, -2F, -2F, 1, 11, 4);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 73, 56);
		Shape14.addBox(-3F, -2F, 2F, 4, 11, 1);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 80);
		Shape15.addBox(-4F, 0F, -3F, 2, 19, 1);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(128, 128);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 6, 80);
		Shape17.addBox(2F, 0F, -3F, 2, 19, 1);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(128, 128);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 40, 80);
		Shape18.addBox(-4F, 0F, 2F, 8, 19, 1);
		Shape18.setRotationPoint(0F, 0F, 0F);
		Shape18.setTextureSize(128, 128);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);

		this.bipedBody.addChild(Shape1);
		this.bipedBody.addChild(Shape2);
		this.bipedBody.addChild(Shape3);
		this.bipedBody.addChild(Shape4);
		this.bipedBody.addChild(Shape5);
		this.bipedBody.addChild(Shape6);
		this.bipedBody.addChild(Shape19);
		this.bipedBody.addChild(Shape15);
		this.bipedBody.addChild(Shape17);
		this.bipedBody.addChild(Shape18);

		this.bipedLeftArm.addChild(Shape7);
		this.bipedLeftArm.addChild(Shape8);
		this.bipedLeftArm.addChild(Shape9);
		this.bipedLeftArm.addChild(Shape10);

		this.bipedRightArm.addChild(Shape11);
		this.bipedRightArm.addChild(Shape12);
		this.bipedRightArm.addChild(Shape13);
		this.bipedRightArm.addChild(Shape14);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}