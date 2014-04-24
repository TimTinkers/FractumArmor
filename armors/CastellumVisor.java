package us.teamtinker.armor.armors;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CastellumVisor extends ModelBiped {
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
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

	public CastellumVisor(float f) {
		super(f, 0, 128, 128);
		Shape1 = new ModelRenderer(this, 0, 40);
		Shape1.addBox(-4F, -2F, -5F, 8, 3, 1);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 50);
		Shape2.addBox(-1F, -8F, -5F, 2, 6, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 60);
		Shape3.addBox(-4F, -9F, -5F, 8, 1, 10);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 73);
		Shape4.addBox(-1F, -10F, -3F, 2, 1, 7);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 82);
		Shape5.addBox(-4F, -4F, -6F, 8, 3, 1);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 87);
		Shape6.addBox(4F, -4F, -5F, 1, 4, 9);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 101);
		Shape7.addBox(-5F, -4F, -5F, 1, 4, 9);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 115);
		Shape8.addBox(-4F, -8F, 4F, 8, 9, 1);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 58, 0);
		Shape9.addBox(4F, -8F, -5F, 1, 4, 9);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 80, 0);
		Shape10.addBox(-5F, -8F, -5F, 1, 4, 9);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 37, 0);
		Shape11.addBox(-4F, -8F, -6F, 8, 2, 1);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 60, 15);
		Shape12.addBox(-1F, -8F, 5F, 2, 8, 1);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 58, 26);
		Shape13.addBox(5F, -6F, -2F, 1, 3, 3);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 68, 15);
		Shape14.addBox(-6F, -6F, -2F, 1, 3, 3);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);

		this.bipedHead.addChild(Shape1);
		this.bipedHead.addChild(Shape2);
		this.bipedHead.addChild(Shape3);
		this.bipedHead.addChild(Shape4);
		this.bipedHead.addChild(Shape5);
		this.bipedHead.addChild(Shape6);
		this.bipedHead.addChild(Shape7);
		this.bipedHead.addChild(Shape8);
		this.bipedHead.addChild(Shape9);
		this.bipedHead.addChild(Shape10);
		this.bipedHead.addChild(Shape11);
		this.bipedHead.addChild(Shape12);
		this.bipedHead.addChild(Shape13);
		this.bipedHead.addChild(Shape14);
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