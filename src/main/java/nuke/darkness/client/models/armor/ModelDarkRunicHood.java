package nuke.darkness.client.models.armor;

import net.minecraft.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.entity.*;
import net.minecraftforge.fml.relauncher.*;

/*
 * Model by Ingoleth
 */
@SideOnly(Side.CLIENT)
public class ModelDarkRunicHood extends ModelBiped {
	public ModelRenderer hoodRightCloth1;
	public ModelRenderer hoodTopCloth;
	public ModelRenderer hoodLeftCloth1;
	public ModelRenderer hoodFrontOutlineRight1;
	public ModelRenderer hoodFrontOutlineLeft1;
	public ModelRenderer hoodFrontOutlineLeft2;
	public ModelRenderer hoodFrontOutlineLeft3;
	public ModelRenderer hoodFrontOutlineRight3;
	public ModelRenderer hoodFrontOutlineRight2;
	public ModelRenderer hoodRightOutlineBottom;
	public ModelRenderer hoodLeftOutlineBottom;
	public ModelRenderer hoodLeftOutlineTop;
	public ModelRenderer hoodRightOutlineTop;
	public ModelRenderer hoodBackOutlineTop;
	public ModelRenderer hoodBackOutlineRight1;
	public ModelRenderer hoodBackOutlineRight3;
	public ModelRenderer hoodBackOutlineLeft3;
	public ModelRenderer hoodBackOutlineRight2;
	public ModelRenderer hoodBackOutlineLeft2;
	public ModelRenderer hoodRightCloth2;
	public ModelRenderer hoodRightCloth3;
	public ModelRenderer hoodLeftCloth2;
	public ModelRenderer hoodLeftCLoth2;
	public ModelRenderer hoodBackOutlineBottom;
	public ModelRenderer hoodBackCloth1;
	public ModelRenderer hoodBackCloth2;
	public ModelRenderer hoodFrontOutlineTop;
	public ModelRenderer hoodTopOutline;
	public ModelRenderer hoodFold;
	public ModelRenderer hoodBackOutlineLeft1;
	public ModelRenderer hoodLeftOutlineTop2;
	public ModelRenderer hoodRightOutlineTop2;

	public ModelDarkRunicHood() {
		this.textureWidth = 64;
		this.textureHeight = 64;

		this.hoodRightCloth1 = new ModelRenderer(this, 0, 37);
		this.hoodRightCloth1.setRotationPoint(3.5F, -8.0F, -3.99F);
		this.hoodRightCloth1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 8);
		this.hoodTopCloth = new ModelRenderer(this, 0, 54);
		this.hoodTopCloth.setRotationPoint(-3.0F, -8.5F, -3.0F);
		this.hoodTopCloth.addBox(0.0F, 0.0F, -1.0F, 6, 1, 10);
		this.hoodLeftCloth1 = new ModelRenderer(this, 0, 37);
		this.hoodLeftCloth1.setRotationPoint(-4.5F, -8.0F, -3.99F);
		this.hoodLeftCloth1.addBox(0.0F, 0.0F, 0.0F, 1, 8, 8);
		this.hoodFrontOutlineRight1 = new ModelRenderer(this, 23, 34);
		this.hoodFrontOutlineRight1.setRotationPoint(4.0F, -8.0F, -5.0F);
		this.hoodFrontOutlineRight1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
		this.hoodFrontOutlineLeft1 = new ModelRenderer(this, 23, 34);
		this.hoodFrontOutlineLeft1.setRotationPoint(-5.0F, -8.0F, -5.0F);
		this.hoodFrontOutlineLeft1.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
		this.hoodFrontOutlineLeft2 = new ModelRenderer(this, 23, 22);
		this.hoodFrontOutlineLeft2.setRotationPoint(-5.0F, -5.0F, -5.0F);
		this.hoodFrontOutlineLeft2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		
		this.setRotationAngles(this.hoodFrontOutlineLeft2, 0.25132740562928074F, 0.0F, 0.0F);
		this.hoodFrontOutlineLeft3 = new ModelRenderer(this, 28, 27);
		this.hoodFrontOutlineLeft3.setRotationPoint(-5.0F, -3.4F, -5.5F);
		this.hoodFrontOutlineLeft3.addBox(0.0F, 0.0F, 1.0F, 1, 4, 1);
		this.hoodFrontOutlineRight3 = new ModelRenderer(this, 28, 27);
		this.hoodFrontOutlineRight3.setRotationPoint(4.0F, -3.4F, -5.5F);
		this.hoodFrontOutlineRight3.addBox(0.0F, 0.0F, 1.0F, 1, 4, 1);
		this.hoodFrontOutlineRight2 = new ModelRenderer(this, 23, 21);
		this.hoodFrontOutlineRight2.setRotationPoint(4.0F, -5.0F, -5.0F);
		this.hoodFrontOutlineRight2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1);
		
		this.setRotationAngles(this.hoodFrontOutlineRight2, 0.2513273889845239F, 0.0F, 0.0F);
		this.hoodRightOutlineBottom = new ModelRenderer(this, 21, 35);
		this.hoodRightOutlineBottom.setRotationPoint(4.0F, -0.4F, -4.5F);
		this.hoodRightOutlineBottom.addBox(0.0F, 0.0F, 1.0F, 1, 1, 8);
		this.hoodLeftOutlineBottom = new ModelRenderer(this, 21, 35);
		this.hoodLeftOutlineBottom.setRotationPoint(-5.0F, -0.4F, -4.5F);
		this.hoodLeftOutlineBottom.addBox(0.0F, 0.0F, 1.0F, 1, 1, 8);
		this.hoodLeftOutlineTop = new ModelRenderer(this, 27, 2);
		this.hoodLeftOutlineTop.setRotationPoint(-4.0F, -9.0F, -6.0F);
		this.hoodLeftOutlineTop.addBox(0.0F, 0.0F, 1.0F, 1, 1, 12);
		this.hoodRightOutlineTop = new ModelRenderer(this, 27, 2);
		this.hoodRightOutlineTop.setRotationPoint(4.0F, -8.01F, -6.0F);
		this.hoodRightOutlineTop.addBox(0.0F, 0.0F, 1.0F, 1, 1, 12);
		this.hoodBackOutlineTop = new ModelRenderer(this, 33, 39);
		this.hoodBackOutlineTop.setRotationPoint(-3.0F, -9.0F, 5.0F);
		this.hoodBackOutlineTop.addBox(0.0F, 0.0F, 1.0F, 6, 1, 1);
		this.hoodBackOutlineRight1 = new ModelRenderer(this, 28, 22);
		this.hoodBackOutlineRight1.setRotationPoint(4.0F, -2.7F, 3.5F);
		this.hoodBackOutlineRight1.addBox(0.0F, 0.0F, 1.0F, 1, 3, 1);
		this.hoodBackOutlineRight3 = new ModelRenderer(this, 34, 22);
		this.hoodBackOutlineRight3.setRotationPoint(4.0F, -8.0F, 5.0F);
		this.hoodBackOutlineRight3.addBox(0.0F, 0.0F, 1.0F, 1, 3, 1);
		this.hoodBackOutlineLeft3 = new ModelRenderer(this, 34, 22);
		this.hoodBackOutlineLeft3.setRotationPoint(-5.0F, -8.0F, 5.0F);
		this.hoodBackOutlineLeft3.addBox(0.0F, 0.0F, 1.0F, 1, 3, 1);
		this.hoodBackOutlineRight2 = new ModelRenderer(this, 23, 27);
		this.hoodBackOutlineRight2.setRotationPoint(4.0F, -2.4F, 4.5F);
		this.hoodBackOutlineRight2.addBox(0.0F, -4.33F, 0.0F, 1, 4, 1);
		
		this.setRotationAngles(this.hoodBackOutlineRight2, -0.4845034043483675F, 0.0F, 0.0F);
		this.hoodBackOutlineLeft2 = new ModelRenderer(this, 23, 27);
		this.hoodBackOutlineLeft2.setRotationPoint(-5.0F, -2.4F, 4.5F);
		this.hoodBackOutlineLeft2.addBox(0.0F, -4.33F, 0.0F, 1, 4, 1);
		
		this.setRotationAngles(this.hoodBackOutlineLeft2, -0.4845034043483675F, 0.0F, 0.0F);
		this.hoodRightCloth2 = new ModelRenderer(this, 1, 15);
		this.hoodRightCloth2.setRotationPoint(3.5F, -8.0F, 4.0F);
		this.hoodRightCloth2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
		this.hoodRightCloth3 = new ModelRenderer(this, 6, 18);
		this.hoodRightCloth3.setRotationPoint(3.5F, -8.0F, 5.0F);
		this.hoodRightCloth3.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
		this.hoodLeftCloth2 = new ModelRenderer(this, 6, 18);
		this.hoodLeftCloth2.setRotationPoint(-4.5F, -8.0F, 5.0F);
		this.hoodLeftCloth2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
		this.hoodLeftCLoth2 = new ModelRenderer(this, 1, 15);
		this.hoodLeftCLoth2.setRotationPoint(-4.5F, -8.0F, 4.0F);
		this.hoodLeftCLoth2.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
		this.hoodBackOutlineBottom = new ModelRenderer(this, 33, 35);
		this.hoodBackOutlineBottom.setRotationPoint(-4.0F, -0.4F, 3.5F);
		this.hoodBackOutlineBottom.addBox(0.0F, 0.0F, 1.0F, 8, 1, 1);
		this.hoodBackCloth1 = new ModelRenderer(this, 0, 25);
		this.hoodBackCloth1.setRotationPoint(-4.0F, -8.0F, 4.5F);
		this.hoodBackCloth1.addBox(0.0F, 0.0F, 1.0F, 8, 3, 1);
		this.hoodBackCloth2 = new ModelRenderer(this, 0, 30);
		this.hoodBackCloth2.setRotationPoint(-4.0F, -5.0F, 6.5F);
		this.hoodBackCloth2.addBox(0.0F, 0.0F, -1.0F, 8, 5, 1);
		
		this.setRotationAngles(this.hoodBackCloth2, -0.2780309551690189F, 0.0F, 0.0F);
		this.hoodFrontOutlineTop = new ModelRenderer(this, 33, 32);
		this.hoodFrontOutlineTop.setRotationPoint(-3.0F, -9.0F, -6.0F);
		this.hoodFrontOutlineTop.addBox(0.0F, 0.0F, 1.0F, 6, 1, 1);
		this.hoodTopOutline = new ModelRenderer(this, 42, 19);
		this.hoodTopOutline.setRotationPoint(-0.5F, -9.0F, -5.0F);
		this.hoodTopOutline.addBox(0.0F, 0.0F, 1.0F, 1, 1, 10);
		this.hoodFold = new ModelRenderer(this, 0, 37);
		this.hoodFold.setRotationPoint(-4.7F, -8.0F, -3.99F);
		this.hoodFold.addBox(0.0F, -1.0F, 0.7F, 1, 2, 8);
		
		this.setRotationAngles(this.hoodFold, 0.0F, 1.5707963267948966F, 0.10402162408465232F);
		this.hoodBackOutlineLeft1 = new ModelRenderer(this, 28, 22);
		this.hoodBackOutlineLeft1.setRotationPoint(-5.0F, -2.7F, 3.5F);
		this.hoodBackOutlineLeft1.addBox(0.0F, 0.0F, 1.0F, 1, 3, 1);
		this.hoodLeftOutlineTop2 = new ModelRenderer(this, 27, 2);
		this.hoodLeftOutlineTop2.setRotationPoint(-5.0F, -8.01F, -6.0F);
		this.hoodLeftOutlineTop2.addBox(0.0F, 0.0F, 1.0F, 1, 1, 12);
		this.hoodRightOutlineTop2 = new ModelRenderer(this, 27, 2);
		this.hoodRightOutlineTop2.setRotationPoint(3.0F, -9.0F, -6.0F);
		this.hoodRightOutlineTop2.addBox(0.0F, 0.0F, 1.0F, 1, 1, 12);
	}

	@Override
	public void render( Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw,
	        float rotationPitch, float scale )
	{
		this.hoodRightCloth1.render(scale);
		this.hoodTopCloth.render(scale);
		this.hoodLeftCloth1.render(scale);
		this.hoodFrontOutlineRight1.render(scale);
		this.hoodFrontOutlineLeft1.render(scale);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.hoodFrontOutlineLeft2.offsetX, this.hoodFrontOutlineLeft2.offsetY,
		        this.hoodFrontOutlineLeft2.offsetZ);
		GlStateManager.translate(this.hoodFrontOutlineLeft2.rotationPointX * scale,
		        this.hoodFrontOutlineLeft2.rotationPointY * scale, this.hoodFrontOutlineLeft2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.hoodFrontOutlineLeft2.offsetX, -this.hoodFrontOutlineLeft2.offsetY,
		        -this.hoodFrontOutlineLeft2.offsetZ);
		GlStateManager.translate(-this.hoodFrontOutlineLeft2.rotationPointX * scale,
		        -this.hoodFrontOutlineLeft2.rotationPointY * scale, -this.hoodFrontOutlineLeft2.rotationPointZ * scale);
		this.hoodFrontOutlineLeft2.render(scale);
		
		GlStateManager.popMatrix();
		
		this.hoodFrontOutlineLeft3.render(scale);
		
		this.hoodFrontOutlineRight3.render(scale);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.hoodFrontOutlineRight2.offsetX, this.hoodFrontOutlineRight2.offsetY,
		        this.hoodFrontOutlineRight2.offsetZ);
		GlStateManager.translate(this.hoodFrontOutlineRight2.rotationPointX * scale,
		        this.hoodFrontOutlineRight2.rotationPointY * scale, this.hoodFrontOutlineRight2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.hoodFrontOutlineRight2.offsetX, -this.hoodFrontOutlineRight2.offsetY,
		        -this.hoodFrontOutlineRight2.offsetZ);
		GlStateManager.translate(-this.hoodFrontOutlineRight2.rotationPointX * scale,
		        -this.hoodFrontOutlineRight2.rotationPointY * scale,
		        -this.hoodFrontOutlineRight2.rotationPointZ * scale);
		this.hoodFrontOutlineRight2.render(scale);
		
		GlStateManager.popMatrix();
		
		this.hoodRightOutlineBottom.render(scale);
		this.hoodLeftOutlineBottom.render(scale);
		this.hoodLeftOutlineTop.render(scale);
		this.hoodRightOutlineTop.render(scale);
		this.hoodBackOutlineTop.render(scale);
		this.hoodBackOutlineRight1.render(scale);
		this.hoodBackOutlineRight3.render(scale);
		this.hoodBackOutlineLeft3.render(scale);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.hoodBackOutlineRight2.offsetX, this.hoodBackOutlineRight2.offsetY,
		        this.hoodBackOutlineRight2.offsetZ);
		GlStateManager.translate(this.hoodBackOutlineRight2.rotationPointX * scale,
		        this.hoodBackOutlineRight2.rotationPointY * scale, this.hoodBackOutlineRight2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 0.8F, 1.0F);
		GlStateManager.translate(-this.hoodBackOutlineRight2.offsetX, -this.hoodBackOutlineRight2.offsetY,
		        -this.hoodBackOutlineRight2.offsetZ);
		GlStateManager.translate(-this.hoodBackOutlineRight2.rotationPointX * scale,
		        -this.hoodBackOutlineRight2.rotationPointY * scale, -this.hoodBackOutlineRight2.rotationPointZ * scale);
		this.hoodBackOutlineRight2.render(scale);
		
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.hoodBackOutlineLeft2.offsetX, this.hoodBackOutlineLeft2.offsetY,
		        this.hoodBackOutlineLeft2.offsetZ);
		GlStateManager.translate(this.hoodBackOutlineLeft2.rotationPointX * scale,
		        this.hoodBackOutlineLeft2.rotationPointY * scale, this.hoodBackOutlineLeft2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 0.8F, 1.0F);
		GlStateManager.translate(-this.hoodBackOutlineLeft2.offsetX, -this.hoodBackOutlineLeft2.offsetY,
		        -this.hoodBackOutlineLeft2.offsetZ);
		GlStateManager.translate(-this.hoodBackOutlineLeft2.rotationPointX * scale,
		        -this.hoodBackOutlineLeft2.rotationPointY * scale, -this.hoodBackOutlineLeft2.rotationPointZ * scale);
		this.hoodBackOutlineLeft2.render(scale);
		
		GlStateManager.popMatrix();
		
		this.hoodRightCloth2.render(scale);
		this.hoodRightCloth3.render(scale);
		this.hoodLeftCloth2.render(scale);
		this.hoodLeftCLoth2.render(scale);
		this.hoodBackOutlineBottom.render(scale);
		this.hoodBackCloth1.render(scale);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.hoodBackCloth2.offsetX, this.hoodBackCloth2.offsetY, this.hoodBackCloth2.offsetZ);
		GlStateManager.translate(this.hoodBackCloth2.rotationPointX * scale, this.hoodBackCloth2.rotationPointY * scale,
		        this.hoodBackCloth2.rotationPointZ * scale);
		GlStateManager.scale(1.0F, 1.0F, 1.0F);
		GlStateManager.translate(-this.hoodBackCloth2.offsetX, -this.hoodBackCloth2.offsetY,
		        -this.hoodBackCloth2.offsetZ);
		GlStateManager.translate(-this.hoodBackCloth2.rotationPointX * scale,
		        -this.hoodBackCloth2.rotationPointY * scale, -this.hoodBackCloth2.rotationPointZ * scale);
		this.hoodBackCloth2.render(scale);
		
		GlStateManager.popMatrix();
		
		this.hoodFrontOutlineTop.render(scale);
		this.hoodTopOutline.render(scale);
		
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.hoodFold.offsetX, this.hoodFold.offsetY, this.hoodFold.offsetZ);
		GlStateManager.translate(this.hoodFold.rotationPointX * scale, this.hoodFold.rotationPointY * scale,
		        this.hoodFold.rotationPointZ * scale);
		GlStateManager.scale(0.5F, 1.0F, 1.0F);
		GlStateManager.translate(-this.hoodFold.offsetX, -this.hoodFold.offsetY, -this.hoodFold.offsetZ);
		GlStateManager.translate(-this.hoodFold.rotationPointX * scale, -this.hoodFold.rotationPointY * scale,
		        -this.hoodFold.rotationPointZ * scale);
		this.hoodFold.render(scale);
		GlStateManager.popMatrix();
		
		this.hoodBackOutlineLeft1.render(scale);
		this.hoodLeftOutlineTop2.render(scale);
		this.hoodRightOutlineTop2.render(scale);
	}

	private void setRotationAngles( ModelRenderer modelRenderer, float x, float y, float z ) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}