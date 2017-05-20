package nuke.darkness.models.armor;

import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.relauncher.*;

/**
 * Model & Texture of Robes by Ingoleth
 */
@SideOnly(Side.CLIENT)
public class ModelDarkRunicRobes extends ModelBiped {
	public ModelRenderer armorFront;
	public ModelRenderer armorBack;
	public ModelRenderer armorLeft;
	public ModelRenderer armorRight;
	public ModelRenderer armorFrontTail;
	public ModelRenderer armorFrontTop;
	public ModelRenderer armorBackTop;
	public ModelRenderer armorBackTail;
	public ModelRenderer armorFrontTail2;
	public ModelRenderer armorBackTail2;
	public ModelRenderer armorTopLeft;
	public ModelRenderer Shouldertop;
	public ModelRenderer armorRightSleeveLeft;
	public ModelRenderer armorRightSleeveRight;
	public ModelRenderer armorRightSleeveFront;
	public ModelRenderer armorRightSleeveBack;
	public ModelRenderer armorRightShoulderRight;
	public ModelRenderer armorRightShoulderLeft;
	public ModelRenderer armorRightShoulderFront;
	public ModelRenderer armorRightShoulderBack;
	public ModelRenderer armorRightSleeve;
	public ModelRenderer armorRightSleeve2;
	public ModelRenderer armorTopRight;
	public ModelRenderer armorLeftShoulderTop;
	public ModelRenderer armorLeftSleeveLeft;
	public ModelRenderer armorLeftSleeveRight;
	public ModelRenderer armorLeftSleeveFront;
	public ModelRenderer armorLeftSleeveBack;
	public ModelRenderer armorLeftShoulderRight;
	public ModelRenderer armorLeftShoulderLeft;
	public ModelRenderer armorLeftShoulderFront;
	public ModelRenderer armorLeftShoulderBack;
	public ModelRenderer armorLeftSleeve;
	public ModelRenderer armorLeftSleeve2;
	public ModelRenderer armorTopCover;
	public ModelRenderer armorBackTop2;
	public ModelRenderer armorBackTop3;
	public ModelRenderer armorBackTop4;
	public ModelRenderer armorBackTop5;
	public ModelRenderer armorBackTop6;
	public ModelRenderer armorBackTop7;

	public ModelDarkRunicRobes() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.armorFront = new ModelRenderer(this, 19, 18);
		this.armorFront.setRotationPoint(-4.0F, 0.0F, -2.5F);
		this.armorFront.addBox(0.0F, 0.0F, 0.0F, 8, 12, 1);
		this.armorBack = new ModelRenderer(this, 19, 18);
		this.armorBack.setRotationPoint(-4.0F, 0.0F, 1.5F);
		this.armorBack.addBox(0.0F, 0.0F, 0.0F, 8, 12, 1);
		this.armorLeft = new ModelRenderer(this, 23, 0);
		this.armorLeft.setRotationPoint(-4.5F, 0.0F, -2.0F);
		this.armorLeft.addBox(0.0F, 0.0F, 0.0F, 1, 12, 4);
		this.armorRight = new ModelRenderer(this, 23, 0);
		this.armorRight.setRotationPoint(3.5F, 0.0F, -2.0F);
		this.armorRight.addBox(0.0F, 0.0F, 0.0F, 1, 12, 4);
		this.armorFrontTail = new ModelRenderer(this, 2, 20);
		this.armorFrontTail.setRotationPoint(-3.0F, 4.0F, -3.0F);
		this.armorFrontTail.addBox(0.0F, 0.0F, 0.0F, 6, 10, 1);
		this.armorFrontTop = new ModelRenderer(this, 43, 0);
		this.armorFrontTop.setRotationPoint(-4.5F, 0.01F, -3.0F);
		this.armorFrontTop.addBox(0.0F, 0.0F, 0.0F, 9, 4, 1);
		this.armorBackTop = new ModelRenderer(this, 43, 0);
		this.armorBackTop.setRotationPoint(-4.5F, 0.01F, 2.0F);
		this.armorBackTop.addBox(0.0F, 0.0F, 0.0F, 9, 4, 1);
		this.armorBackTail = new ModelRenderer(this, 2, 20);
		this.armorBackTail.setRotationPoint(-3.0F, 4.0F, 2.0F);
		this.armorBackTail.addBox(0.0F, 0.0F, 0.0F, 6, 10, 1);
		this.armorFrontTail2 = new ModelRenderer(this, 3, 14);
		this.armorFrontTail2.setRotationPoint(-3.01F, 14.0F, -2.0F);
		this.armorFrontTail2.addBox(0.0F, 0.0F, -1.0F, 6, 3, 1);
		this.setRotationAngles(this.armorFrontTail2, -0.2617993877991494F, 0.0F, 0.0F);
		this.armorBackTail2 = new ModelRenderer(this, 3, 14);
		this.armorBackTail2.setRotationPoint(-3.01F, 14.0F, 2.0F);
		this.armorBackTail2.addBox(0.0F, 0.0F, 0.0F, 6, 3, 1);
		this.setRotationAngles(this.armorBackTail2, 0.2617993877991494F, 0.0F, 0.0F);
		this.armorTopLeft = new ModelRenderer(this, 33, 0);
		this.armorTopLeft.setRotationPoint(-5.0F, 0.01F, -2.0F);
		this.armorTopLeft.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4);
		this.Shouldertop = new ModelRenderer(this, 46, 26);
		this.Shouldertop.setRotationPoint(9.0F, 1.7F, 0.0F);
		this.Shouldertop.addBox(-1.0F, -2.0F, -2.0F, 4, 1, 4);
		this.Shouldertop.mirror = true;
		this.armorRightSleeveLeft = new ModelRenderer(this, 45, 49);
		this.armorRightSleeveLeft.setRotationPoint(-0.3000002F, 4.2F, 0.0F);
		this.armorRightSleeveLeft.addBox(-1.0F, -2.0F, -2.0F, 1, 8, 4);
		this.armorRightSleeveLeft.mirror = true;
		this.Shouldertop.addChild(this.armorRightSleeveLeft);
		this.armorRightSleeveRight = new ModelRenderer(this, 45, 49);
		this.armorRightSleeveRight.setRotationPoint(3.3000002F, 4.2F, 0.0F);
		this.armorRightSleeveRight.addBox(-1.0F, -2.0F, -2.0F, 1, 8, 4);
		this.armorRightSleeveRight.mirror = true;
		this.Shouldertop.addChild(this.armorRightSleeveRight);
		this.armorRightSleeveFront = new ModelRenderer(this, 42, 38);
		this.armorRightSleeveFront.setRotationPoint(0.0F, 4.2F, -0.3F);
		this.armorRightSleeveFront.addBox(-1.0F, -2.0F, -2.0F, 4, 8, 1);
		this.armorRightSleeveFront.mirror = true;
		this.Shouldertop.addChild(this.armorRightSleeveFront);
		this.armorRightSleeveBack = new ModelRenderer(this, 30, 41);
		this.armorRightSleeveBack.setRotationPoint(0.0F, 4.3F, 3.5F);
		this.armorRightSleeveBack.addBox(-1.0F, -2.0F, -2.2F, 4, 3, 1);
		this.armorRightSleeveBack.mirror = true;
		this.Shouldertop.addChild(this.armorRightSleeveBack);
		this.armorRightShoulderRight = new ModelRenderer(this, 38, 29);
		this.armorRightShoulderRight.setRotationPoint(3.6000004F, 0.29999995F, 0.0F);
		this.armorRightShoulderRight.addBox(-1.0F, -2.0F, -2.0F, 1, 4, 4);
		this.armorRightShoulderRight.mirror = true;
		this.Shouldertop.addChild(this.armorRightShoulderRight);
		this.armorRightShoulderLeft = new ModelRenderer(this, 38, 29);
		this.armorRightShoulderLeft.setRotationPoint(-0.6000004F, 0.29999995F, 0.0F);
		this.armorRightShoulderLeft.addBox(-1.0F, -2.0F, -2.0F, 1, 4, 4);
		this.armorRightShoulderLeft.mirror = true;
		this.Shouldertop.addChild(this.armorRightShoulderLeft);
		this.armorRightShoulderFront = new ModelRenderer(this, 51, 12);
		this.armorRightShoulderFront.setRotationPoint(0.0F, 0.29999995F, -0.6F);
		this.armorRightShoulderFront.addBox(-1.0F, -2.0F, -2.0F, 4, 4, 1);
		this.armorRightShoulderFront.mirror = true;
		this.Shouldertop.addChild(this.armorRightShoulderFront);
		this.armorRightShoulderBack = new ModelRenderer(this, 51, 12);
		this.armorRightShoulderBack.setRotationPoint(0.0F, 0.29999995F, 3.6F);
		this.armorRightShoulderBack.addBox(-1.0F, -2.0F, -2.0F, 4, 4, 1);
		this.armorRightShoulderBack.mirror = true;
		this.Shouldertop.addChild(this.armorRightShoulderBack);
		this.armorRightSleeve = new ModelRenderer(this, 40, 23);
		this.armorRightSleeve.setRotationPoint(0.0F, 9.2F, 4.2F);
		this.armorRightSleeve.addBox(-1.0F, -2.0F, -2.2F, 4, 3, 1);
		this.armorRightSleeve.mirror = true;
		this.Shouldertop.addChild(this.armorRightSleeve);
		this.armorRightSleeve2 = new ModelRenderer(this, 40, 16);
		this.armorRightSleeve2.setRotationPoint(0.01F, 7.2F, 3.0F);
		this.armorRightSleeve2.addBox(-1.0F, -3.0F, -1.0F, 4, 3, 1);
		this.armorRightSleeve2.mirror = true;
		this.setRotationAngles(this.armorRightSleeve2, 0.2546435571738906F, 0.0F, 0.0F);
		this.Shouldertop.addChild(this.armorRightSleeve2);
		this.armorTopRight = new ModelRenderer(this, 33, 0);
		this.armorTopRight.setRotationPoint(4.0F, 0.01F, -2.0F);
		this.armorTopRight.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4);
		this.armorLeftShoulderTop = new ModelRenderer(this, 46, 26);
		this.armorLeftShoulderTop.setRotationPoint(-11.0F, 1.7F, 0.0F);
		this.armorLeftShoulderTop.addBox(-1.0F, -2.0F, -2.0F, 4, 1, 4);
		this.armorLeftShoulderTop.mirror = true;
		this.armorLeftSleeveLeft = new ModelRenderer(this, 45, 49);
		this.armorLeftSleeveLeft.setRotationPoint(-0.3000002F, 4.2F, 0.0F);
		this.armorLeftSleeveLeft.addBox(-1.0F, -2.0F, -2.0F, 1, 8, 4);
		this.armorLeftSleeveLeft.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftSleeveLeft);
		this.armorLeftSleeveRight = new ModelRenderer(this, 45, 49);
		this.armorLeftSleeveRight.setRotationPoint(3.3000002F, 4.2F, 0.0F);
		this.armorLeftSleeveRight.addBox(-1.0F, -2.0F, -2.0F, 1, 8, 4);
		this.armorLeftSleeveRight.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftSleeveRight);
		this.armorLeftSleeveFront = new ModelRenderer(this, 42, 38);
		this.armorLeftSleeveFront.setRotationPoint(0.0F, 4.2F, -0.3F);
		this.armorLeftSleeveFront.addBox(-1.0F, -2.0F, -2.0F, 4, 8, 1);
		this.armorLeftSleeveFront.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftSleeveFront);
		this.armorLeftSleeveBack = new ModelRenderer(this, 30, 41);
		this.armorLeftSleeveBack.setRotationPoint(0.0F, 4.3F, 3.5F);
		this.armorLeftSleeveBack.addBox(-1.0F, -2.0F, -2.2F, 4, 3, 1);
		this.armorLeftSleeveBack.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftSleeveBack);
		this.armorLeftShoulderRight = new ModelRenderer(this, 38, 29);
		this.armorLeftShoulderRight.setRotationPoint(3.6000004F, 0.29999995F, 0.0F);
		this.armorLeftShoulderRight.addBox(-1.0F, -2.0F, -2.0F, 1, 4, 4);
		this.armorLeftShoulderRight.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftShoulderRight);
		this.armorLeftShoulderLeft = new ModelRenderer(this, 38, 29);
		this.armorLeftShoulderLeft.setRotationPoint(-0.6000004F, 0.29999995F, 0.0F);
		this.armorLeftShoulderLeft.addBox(-1.0F, -2.0F, -2.0F, 1, 4, 4);
		this.armorLeftShoulderLeft.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftShoulderLeft);
		this.armorLeftShoulderFront = new ModelRenderer(this, 51, 12);
		this.armorLeftShoulderFront.setRotationPoint(0.0F, 0.29999995F, -0.6F);
		this.armorLeftShoulderFront.addBox(-1.0F, -2.0F, -2.0F, 4, 4, 1);
		this.armorLeftShoulderFront.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftShoulderFront);
		this.armorLeftShoulderBack = new ModelRenderer(this, 51, 12);
		this.armorLeftShoulderBack.setRotationPoint(0.0F, 0.29999995F, 3.6F);
		this.armorLeftShoulderBack.addBox(-1.0F, -2.0F, -2.0F, 4, 4, 1);
		this.armorLeftShoulderBack.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftShoulderBack);
		this.armorLeftSleeve = new ModelRenderer(this, 40, 23);
		this.armorLeftSleeve.setRotationPoint(0.0F, 9.2F, 4.2F);
		this.armorLeftSleeve.addBox(-1.0F, -2.0F, -2.2F, 4, 3, 1);
		this.armorLeftSleeve.mirror = true;
		this.armorLeftShoulderTop.addChild(this.armorLeftSleeve);
		this.armorLeftSleeve2 = new ModelRenderer(this, 40, 16);
		this.armorLeftSleeve2.setRotationPoint(0.01F, 7.2F, 3.0F);
		this.armorLeftSleeve2.addBox(-1.0F, -3.0F, -1.0F, 4, 3, 1);
		this.armorLeftSleeve2.mirror = true;
		this.setRotationAngles(this.armorLeftSleeve2, 0.2546435571738906F, 0.0F, 0.0F);
		this.armorLeftShoulderTop.addChild(this.armorLeftSleeve2);
		this.armorTopCover = new ModelRenderer(this, 0, 33);
		this.armorTopCover.setRotationPoint(-4.0F, -0.1F, -2.0F);
		this.armorTopCover.addBox(0.0F, 0.0F, 0.0F, 8, 1, 4);
		this.armorBackTop2 = new ModelRenderer(this, 46, 0);
		this.armorBackTop2.setRotationPoint(-3.5F, -1.01F, 3.0F);
		this.armorBackTop2.addBox(0.0F, 0.0F, 0.0F, 7, 4, 1);
		this.armorBackTop3 = new ModelRenderer(this, 47, 0);
		this.armorBackTop3.setRotationPoint(-3.5F, -1.0F, 4.0F);
		this.armorBackTop3.addBox(-2.0F, 0.0F, -1.0F, 2, 4, 1);
		this.setRotationAngles(this.armorBackTop3, 0.0F, -1.2217304763960306F, 0.0F);
		this.armorBackTop4 = new ModelRenderer(this, 46, 0);
		this.armorBackTop4.setRotationPoint(3.5F, -1.0F, 4.0F);
		this.armorBackTop4.addBox(0.0F, 0.0F, -1.0F, 2, 4, 1);
		this.setRotationAngles(this.armorBackTop4, 0.0F, 1.2217304763960306F, 0.0F);
		this.armorBackTop5 = new ModelRenderer(this, 20, 40);
		this.armorBackTop5.setRotationPoint(-1.5F, 3.0F, 2.5F);
		this.armorBackTop5.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1);
		this.setRotationAngles(this.armorBackTop5, -0.13613568498450906F, 0.0F, 0.0F);
		this.armorBackTop6 = new ModelRenderer(this, 20, 40);
		this.armorBackTop6.setRotationPoint(-1.5F, -1.0F, 3.5F);
		this.armorBackTop6.addBox(0.0F, 0.0F, 0.0F, 3, 4, 1);
		this.armorBackTop7 = new ModelRenderer(this, 20, 40);
		this.armorBackTop7.setRotationPoint(-1.5F, 3.0F, 4.5F);
		this.armorBackTop7.addBox(0.0F, 0.0F, -1.0F, 3, 2, 1);
		this.setRotationAngles(this.armorBackTop7, -0.7853981633974483F, 0.0F, 0.0F);
	}

	@Override
	public void render( Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw,
	        float rotationPitch, float scale )
	{
		this.armorFront.render(scale);
		this.armorBack.render(scale);
		this.armorLeft.render(scale);
		this.armorRight.render(scale);
		this.armorFrontTail.render(scale);
		this.armorFrontTop.render(scale);
		this.armorBackTop.render(scale);
		this.armorBackTail.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.armorFrontTail2.offsetX, this.armorFrontTail2.offsetY,
		        this.armorFrontTail2.offsetZ);
		GlStateManager.translate(this.armorFrontTail2.rotationPointX * scale,
		        this.armorFrontTail2.rotationPointY * scale, this.armorFrontTail2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.armorFrontTail2.offsetX, -this.armorFrontTail2.offsetY,
		        -this.armorFrontTail2.offsetZ);
		GlStateManager.translate(-this.armorFrontTail2.rotationPointX * scale,
		        -this.armorFrontTail2.rotationPointY * scale, -this.armorFrontTail2.rotationPointZ * scale);
		this.armorFrontTail2.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.armorBackTail2.offsetX, this.armorBackTail2.offsetY, this.armorBackTail2.offsetZ);
		GlStateManager.translate(this.armorBackTail2.rotationPointX * scale, this.armorBackTail2.rotationPointY * scale,
		        this.armorBackTail2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.armorBackTail2.offsetX, -this.armorBackTail2.offsetY,
		        -this.armorBackTail2.offsetZ);
		GlStateManager.translate(-this.armorBackTail2.rotationPointX * scale,
		        -this.armorBackTail2.rotationPointY * scale, -this.armorBackTail2.rotationPointZ * scale);
		this.armorBackTail2.render(scale);
		GlStateManager.popMatrix();
		this.armorTopLeft.render(scale);
		this.Shouldertop.render(scale);
		this.armorTopRight.render(scale);
		this.armorLeftShoulderTop.render(scale);
		this.armorTopCover.render(scale);
		this.armorBackTop2.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.armorBackTop3.offsetX, this.armorBackTop3.offsetY, this.armorBackTop3.offsetZ);
		GlStateManager.translate(this.armorBackTop3.rotationPointX * scale, this.armorBackTop3.rotationPointY * scale,
		        this.armorBackTop3.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.armorBackTop3.offsetX, -this.armorBackTop3.offsetY, -this.armorBackTop3.offsetZ);
		GlStateManager.translate(-this.armorBackTop3.rotationPointX * scale, -this.armorBackTop3.rotationPointY * scale,
		        -this.armorBackTop3.rotationPointZ * scale);
		this.armorBackTop3.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.armorBackTop4.offsetX, this.armorBackTop4.offsetY, this.armorBackTop4.offsetZ);
		GlStateManager.translate(this.armorBackTop4.rotationPointX * scale, this.armorBackTop4.rotationPointY * scale,
		        this.armorBackTop4.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.armorBackTop4.offsetX, -this.armorBackTop4.offsetY, -this.armorBackTop4.offsetZ);
		GlStateManager.translate(-this.armorBackTop4.rotationPointX * scale, -this.armorBackTop4.rotationPointY * scale,
		        -this.armorBackTop4.rotationPointZ * scale);
		this.armorBackTop4.render(scale);
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.armorBackTop5.offsetX, this.armorBackTop5.offsetY, this.armorBackTop5.offsetZ);
		GlStateManager.translate(this.armorBackTop5.rotationPointX * scale, this.armorBackTop5.rotationPointY * scale,
		        this.armorBackTop5.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.armorBackTop5.offsetX, -this.armorBackTop5.offsetY, -this.armorBackTop5.offsetZ);
		GlStateManager.translate(-this.armorBackTop5.rotationPointX * scale, -this.armorBackTop5.rotationPointY * scale,
		        -this.armorBackTop5.rotationPointZ * scale);
		this.armorBackTop5.render(scale);
		GlStateManager.popMatrix();
		this.armorBackTop6.render(scale);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.armorBackTop7.offsetX, this.armorBackTop7.offsetY, this.armorBackTop7.offsetZ);
		GlStateManager.translate(this.armorBackTop7.rotationPointX * scale, this.armorBackTop7.rotationPointY * scale,
		        this.armorBackTop7.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.armorBackTop7.offsetX, -this.armorBackTop7.offsetY, -this.armorBackTop7.offsetZ);
		GlStateManager.translate(-this.armorBackTop7.rotationPointX * scale, -this.armorBackTop7.rotationPointY * scale,
		        -this.armorBackTop7.rotationPointZ * scale);
		this.armorBackTop7.render(scale);
		GlStateManager.popMatrix();
	}

	private void setRotationAngles( ModelRenderer modelRenderer, float x, float y, float z ) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}