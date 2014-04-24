package us.teamtinker.armor.armors;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BaseFlag extends ModelBiped {
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;

	public BaseFlag(float f) {
		super(f, 0, 128, 128);
		
		Shape1 = new ModelRenderer(this, 68, 0);
		Shape1.addBox(-4F, 1F, 3F, 2, 10, 2);
		Shape1.setRotationPoint(0F, 0F, -1F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 58, 35);
		Shape2.addBox(-4F, -26F, 4F, 1, 37, 1);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 11, 58);
		Shape3.addBox(-3F, -26F, 4F, 17, 14, 1);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 45);
		Shape4.addBox(-4.5F, -27F, 3.5F, 2, 1, 2);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		
		this.bipedBody.addChild(Shape1);
		this.bipedBody.addChild(Shape2);
		this.bipedBody.addChild(Shape3);
		this.bipedBody.addChild(Shape4);
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
