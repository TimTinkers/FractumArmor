package us.teamtinker.armor.armors;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GraylineCrown extends ModelBiped {

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
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;

	public GraylineCrown(float f) {
		super(f, 0, 128, 128);

		Shape1 = new ModelRenderer(this, 0, 46);
		Shape1.addBox(-4F, -9F, 3F, 8, 1, 1);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 52);
		Shape2.addBox(-4F, -9F, -4F, 1, 1, 8);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 65);
		Shape3.addBox(-3F, -9F, -4F, 7, 1, 1);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 69);
		Shape4.addBox(3F, -9F, -3F, 1, 1, 6);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 79);
		Shape5.addBox(3F, -10F, 3F, 1, 1, 1);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 33);
		Shape6.addBox(-4F, -10F, -4F, 1, 1, 1);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 37);
		Shape7.addBox(3F, -10F, -4F, 1, 1, 1);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 42);
		Shape8.addBox(-4F, -10F, 3F, 1, 1, 1);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 83);
		Shape9.addBox(-2F, -10F, -4F, 1, 1, 1);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 37, 0);
		Shape10.addBox(1F, -10F, -4F, 1, 1, 1);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 62);
		Shape11.addBox(3F, -10F, -1F, 1, 1, 1);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 87);
		Shape12.addBox(3F, -10F, 0F, 1, 1, 1);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 37, 4);
		Shape13.addBox(-4F, -10F, 0F, 1, 1, 1);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 46, 0);
		Shape14.addBox(-4F, -10F, -1F, 1, 1, 1);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 91);
		Shape15.addBox(0F, -10F, 3F, 1, 1, 1);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(128, 128);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 7, 33);
		Shape16.addBox(-1F, -10F, 3F, 1, 1, 1);
		Shape16.setRotationPoint(0F, 0F, 0F);
		Shape16.setTextureSize(128, 128);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 7, 37);
		Shape17.addBox(0F, -11F, -4F, 1, 1, 1);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(128, 128);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelRenderer(this, 7, 42);
		Shape18.addBox(-1F, -11F, -4F, 1, 1, 1);
		Shape18.setRotationPoint(0F, 0F, 0F);
		Shape18.setTextureSize(128, 128);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		
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
		this.bipedHead.addChild(Shape15);
		this.bipedHead.addChild(Shape16);
		this.bipedHead.addChild(Shape17);
		this.bipedHead.addChild(Shape18);
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
