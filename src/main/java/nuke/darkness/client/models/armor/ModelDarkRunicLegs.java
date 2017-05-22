package nuke.darkness.client.models.armor;

import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.relauncher.*;

/**
 * Model & Texture of Robes by Ingoleth
 */
@SideOnly(Side.CLIENT)
public class ModelDarkRunicLegs extends ModelBiped {
	public ModelRenderer robeRightSide1;
	public ModelRenderer robeLeftSide1;
	public ModelRenderer robeFront;
	public ModelRenderer robeBack;
	public ModelRenderer robeLeftSide2;
	public ModelRenderer robeLeftSide3;
	public ModelRenderer robeBackRight1;
	public ModelRenderer robeBackRight2;
	public ModelRenderer robeBackRight4;
	public ModelRenderer robeBackRight3;
	public ModelRenderer robeFrontLeft1;
	public ModelRenderer robeFrontLeft2;
	public ModelRenderer robeFrontRight1;
	public ModelRenderer robeFrontRight2;
	public ModelRenderer robeRightSide2;
	public ModelRenderer robeRightSide3;
	public ModelRenderer robeBackLeft1;
	public ModelRenderer robeBackLeft2;
	public ModelRenderer Cuboid9;
	public ModelRenderer Cuboid8;

	public ModelDarkRunicLegs() {
		this.textureWidth = 32;
		this.textureHeight = 32;

		this.robeRightSide1 = new ModelRenderer(this, 8, 19);
		this.robeRightSide1.setRotationPoint(3.5F, 12.0F, -2.0F);
		this.robeRightSide1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 4);
		this.robeLeftSide1 = new ModelRenderer(this, 8, 19);
		this.robeLeftSide1.setRotationPoint(-4.5F, 12.0F, -2.0F);
		this.robeLeftSide1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 4);
		this.robeFront = new ModelRenderer(this, 1, 1);
		this.robeFront.setRotationPoint(-4.0F, 12.0F, -2.5F);
		this.robeFront.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1);
		this.robeBack = new ModelRenderer(this, 0, 27);
		this.robeBack.setRotationPoint(-4.0F, 12.0F, 1.5F);
		this.robeBack.addBox(0.0F, 0.0F, 0.0F, 8, 2, 1);
		this.robeLeftSide2 = new ModelRenderer(this, 21, 11);
		this.robeLeftSide2.setRotationPoint(-2.5F, 14.0F, -2.0F);
		this.robeLeftSide2.addBox(-2.0F, 0.0F, 0.0F, 1, 9, 4);
		this.setRotationAngles(this.robeLeftSide2, 0.0F, 0.0F, 0.13962634015954636F);

		this.robeLeftSide3 = new ModelRenderer(this, 20, 25);
		this.robeLeftSide3.setRotationPoint(-1.0005207F, 9.0F, 0.01F);
		this.robeLeftSide3.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 4);
		this.setRotationAngles(this.robeLeftSide3, 0.0F, 0.0F, 0.5235987755982988F);

		this.robeLeftSide2.addChild(this.robeLeftSide3);
		this.robeBackRight1 = new ModelRenderer(this, 1, 4);
		this.robeBackRight1.setRotationPoint(0.0F, 14.0F, 1.5F);
		this.robeBackRight1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1);
		this.setRotationAngles(this.robeBackRight1, 0.0F, 0.0F, -0.08726646259971647F);

		this.robeBackRight2 = new ModelRenderer(this, 1, 10);
		this.robeBackRight2.setRotationPoint(0.0F, 4.0F, -1.0F);
		this.robeBackRight2.addBox(0.0F, 0.0F, 1.0F, 4, 4, 1);
		this.setRotationAngles(this.robeBackRight2, 0.17453292519943295F, 0.0F, 0.0F);

		this.robeBackRight1.addChild(this.robeBackRight2);
		this.robeBackRight4 = new ModelRenderer(this, 23, 5);
		this.robeBackRight4.setRotationPoint(4.0F, 4.0F, 0.99F);
		this.robeBackRight4.addBox(-3.0F, -1.0F, 0.0F, 3, 1, 1);
		this.setRotationAngles(this.robeBackRight4, 0.0F, 0.0F, -0.5235987755982988F);

		this.robeBackRight2.addChild(this.robeBackRight4);
		this.robeBackRight3 = new ModelRenderer(this, 1, 22);
		this.robeBackRight3.setRotationPoint(3.0F, 5.0F, 1.0F);
		this.robeBackRight3.addBox(-3.0F, -1.0F, 0.0F, 2, 2, 1);
		this.robeBackRight2.addChild(this.robeBackRight3);
		this.robeFrontLeft1 = new ModelRenderer(this, 12, 4);
		this.robeFrontLeft1.setRotationPoint(0.0F, 14.0F, -1.5F);
		this.robeFrontLeft1.addBox(-4.0F, 0.0F, -1.0F, 4, 9, 1);
		this.setRotationAngles(this.robeFrontLeft1, -0.10471975511965977F, 0.0F, 0.03490658503988659F);

		this.robeFrontLeft2 = new ModelRenderer(this, 10, 16);
		this.robeFrontLeft2.setRotationPoint(-3.99F, 9.0F, 0.0F);
		this.robeFrontLeft2.addBox(0.0F, 0.0F, -1.0F, 4, 1, 1);
		this.setRotationAngles(this.robeFrontLeft2, -0.5235987755982988F, 0.0F, 0.0F);

		this.robeFrontLeft1.addChild(this.robeFrontLeft2);
		this.robeFrontRight1 = new ModelRenderer(this, 12, 4);
		this.robeFrontRight1.setRotationPoint(0.0F, 14.0F, -1.5F);
		this.robeFrontRight1.addBox(0.0F, 0.0F, -1.0F, 4, 9, 1);
		this.setRotationAngles(this.robeFrontRight1, -0.10471975511965977F, 0.0F, -0.03490658503988659F);

		this.robeFrontRight2 = new ModelRenderer(this, 10, 16);
		this.robeFrontRight2.setRotationPoint(0.01F, 9.0F, 0.0F);
		this.robeFrontRight2.addBox(0.0F, 0.0F, -1.0F, 4, 1, 1);
		this.setRotationAngles(this.robeFrontRight2, -0.5235987755982988F, 0.0F, 0.0F);

		this.robeFrontRight1.addChild(this.robeFrontRight2);
		this.robeRightSide2 = new ModelRenderer(this, 21, 11);
		this.robeRightSide2.setRotationPoint(2.5F, 14.0F, 2.0F);
		this.robeRightSide2.addBox(-2.0F, 0.0F, 0.0F, 1, 9, 4);
		this.setRotationAngles(this.robeRightSide2, 0.0F, 3.141592653589793F, -0.13962634015954636F);

		this.robeRightSide3 = new ModelRenderer(this, 20, 25);
		this.robeRightSide3.setRotationPoint(-1.0005207F, 9.0F, 0.01F);
		this.robeRightSide3.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 4);
		this.setRotationAngles(this.robeRightSide3, 0.0F, 0.0F, 0.5235987755982988F);

		this.robeRightSide2.addChild(this.robeRightSide3);
		this.robeBackLeft1 = new ModelRenderer(this, 1, 4);
		this.robeBackLeft1.setRotationPoint(0.0F, 14.0F, 0.5F);
		this.robeBackLeft1.addBox(-4.0F, 0.0F, 1.0F, 4, 4, 1);
		this.setRotationAngles(this.robeBackLeft1, 0.0F, 0.0F, 0.08726646259971647F);

		this.robeBackLeft2 = new ModelRenderer(this, 1, 10);
		this.robeBackLeft2.setRotationPoint(-4.0F, 4.0F, 0.0F);
		this.robeBackLeft2.addBox(0.0F, 0.0F, 1.0F, 4, 4, 1);
		this.setRotationAngles(this.robeBackLeft2, 0.17453292519943295F, 0.0F, 0.0F);

		this.robeBackLeft1.addChild(this.robeBackLeft2);
		this.Cuboid9 = new ModelRenderer(this, 1, 16);
		this.Cuboid9.setRotationPoint(0.0F, 4.0F, 0.99F);
		this.Cuboid9.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
		this.setRotationAngles(this.Cuboid9, 0.0F, 0.0F, -1.0471975511965976F);

		this.robeBackLeft2.addChild(this.Cuboid9);
		this.Cuboid8 = new ModelRenderer(this, 1, 22);
		this.Cuboid8.setRotationPoint(2.0F, 4.0F, 1.0F);
		this.Cuboid8.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
		this.robeBackLeft2.addChild(this.Cuboid8);
	}

	@Override
	public void render( Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw,
	        float rotationPitch, float scale )
	{
		this.robeRightSide1.render(scale);
		this.robeLeftSide1.render(scale);
		this.robeFront.render(scale);
		this.robeBack.render(scale);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.robeLeftSide2.offsetX, this.robeLeftSide2.offsetY, this.robeLeftSide2.offsetZ);
		GlStateManager.translate(this.robeLeftSide2.rotationPointX * scale, this.robeLeftSide2.rotationPointY * scale,
		        this.robeLeftSide2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.robeLeftSide2.offsetX, -this.robeLeftSide2.offsetY, -this.robeLeftSide2.offsetZ);
		GlStateManager.translate(-this.robeLeftSide2.rotationPointX * scale, -this.robeLeftSide2.rotationPointY * scale,
		        -this.robeLeftSide2.rotationPointZ * scale);
		this.robeLeftSide2.render(scale);

		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.robeBackRight1.offsetX, this.robeBackRight1.offsetY, this.robeBackRight1.offsetZ);
		GlStateManager.translate(this.robeBackRight1.rotationPointX * scale, this.robeBackRight1.rotationPointY * scale,
		        this.robeBackRight1.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.robeBackRight1.offsetX, -this.robeBackRight1.offsetY,
		        -this.robeBackRight1.offsetZ);
		GlStateManager.translate(-this.robeBackRight1.rotationPointX * scale,
		        -this.robeBackRight1.rotationPointY * scale, -this.robeBackRight1.rotationPointZ * scale);
		this.robeBackRight1.render(scale);

		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.robeFrontLeft1.offsetX, this.robeFrontLeft1.offsetY, this.robeFrontLeft1.offsetZ);
		GlStateManager.translate(this.robeFrontLeft1.rotationPointX * scale, this.robeFrontLeft1.rotationPointY * scale,
		        this.robeFrontLeft1.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.robeFrontLeft1.offsetX, -this.robeFrontLeft1.offsetY,
		        -this.robeFrontLeft1.offsetZ);
		GlStateManager.translate(-this.robeFrontLeft1.rotationPointX * scale,
		        -this.robeFrontLeft1.rotationPointY * scale, -this.robeFrontLeft1.rotationPointZ * scale);
		this.robeFrontLeft1.render(scale);

		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.robeFrontRight1.offsetX, this.robeFrontRight1.offsetY,
		        this.robeFrontRight1.offsetZ);
		GlStateManager.translate(this.robeFrontRight1.rotationPointX * scale,
		        this.robeFrontRight1.rotationPointY * scale, this.robeFrontRight1.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.robeFrontRight1.offsetX, -this.robeFrontRight1.offsetY,
		        -this.robeFrontRight1.offsetZ);
		GlStateManager.translate(-this.robeFrontRight1.rotationPointX * scale,
		        -this.robeFrontRight1.rotationPointY * scale, -this.robeFrontRight1.rotationPointZ * scale);
		this.robeFrontRight1.render(scale);

		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.robeRightSide2.offsetX, this.robeRightSide2.offsetY, this.robeRightSide2.offsetZ);
		GlStateManager.translate(this.robeRightSide2.rotationPointX * scale, this.robeRightSide2.rotationPointY * scale,
		        this.robeRightSide2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.robeRightSide2.offsetX, -this.robeRightSide2.offsetY,
		        -this.robeRightSide2.offsetZ);
		GlStateManager.translate(-this.robeRightSide2.rotationPointX * scale,
		        -this.robeRightSide2.rotationPointY * scale, -this.robeRightSide2.rotationPointZ * scale);
		this.robeRightSide2.render(scale);

		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.robeBackLeft1.offsetX, this.robeBackLeft1.offsetY, this.robeBackLeft1.offsetZ);
		GlStateManager.translate(this.robeBackLeft1.rotationPointX * scale, this.robeBackLeft1.rotationPointY * scale,
		        this.robeBackLeft1.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.robeBackLeft1.offsetX, -this.robeBackLeft1.offsetY, -this.robeBackLeft1.offsetZ);
		GlStateManager.translate(-this.robeBackLeft1.rotationPointX * scale, -this.robeBackLeft1.rotationPointY * scale,
		        -this.robeBackLeft1.rotationPointZ * scale);
		this.robeBackLeft1.render(scale);

		GlStateManager.popMatrix();
	}

	private void setRotationAngles( ModelRenderer modelRenderer, float x, float y, float z ) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}