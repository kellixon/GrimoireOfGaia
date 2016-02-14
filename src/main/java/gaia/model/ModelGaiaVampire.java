package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaVampire extends ModelBase{

	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer mantle;
	ModelRenderer bodytop;
	ModelRenderer bodymiddle;
	ModelRenderer bodymiddlebutton;
	ModelRenderer bodybottom;
	ModelRenderer cloak1;
	ModelRenderer cloak2;
	ModelRenderer cloak3;
	ModelRenderer cloak4;
	ModelRenderer rightshoulder;
	ModelRenderer rightarm;
	ModelRenderer leftshoulder;
	ModelRenderer leftarm;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	ModelRenderer waist;
	ModelRenderer waist1;
	ModelRenderer waist2;
	ModelRenderer waist3;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public ModelGaiaVampire() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3F, -9F, -3F, 6, 6, 6);
		this.head.setRotationPoint(0F, -5F, 0F);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 36, 0);
		this.headaccessory.addBox(-3.5F, -9.5F, -3.5F, 7, 7, 7);
		this.headaccessory.setRotationPoint(0F, -5F, 0F);
		this.headaccessory.setTextureSize(64, 32);
		this.headaccessory.mirror = true;
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.mantle = new ModelRenderer(this, 36, 14);
		this.mantle.addBox(-5F, -6F, -2F, 10, 7, 6);
		this.mantle.setRotationPoint(0F, -8F, 0F);
		this.mantle.setTextureSize(64, 32);
		this.mantle.mirror = true;
		this.setRotation(mantle, 0F, 0F, 0F);
		this.bodytop = new ModelRenderer(this, 0, 12);
		this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 5, 3);
		this.bodytop.setRotationPoint(0F, -8F, 0F);
		this.bodytop.setTextureSize(64, 32);
		this.bodytop.mirror = true;
		this.setRotation(bodytop, -0.0872665F, 0F, 0F);
		this.bodymiddle = new ModelRenderer(this, 0, 20);
		this.bodymiddle.addBox(-2F, 4.5F, -1.5F, 4, 3, 2);
		this.bodymiddle.setRotationPoint(0F, -8F, 0F);
		this.bodymiddle.setTextureSize(64, 32);
		this.bodymiddle.mirror = true;
		this.setRotation(bodymiddle, 0F, 0F, 0F);
		this.bodymiddlebutton = new ModelRenderer(this, 0, 20);
		this.bodymiddlebutton.addBox(-0.5F, 5F, -1.6F, 1, 2, 0);
		this.bodymiddlebutton.setRotationPoint(0F, -8F, 0F);
		this.bodymiddlebutton.setTextureSize(64, 32);
		this.bodymiddlebutton.mirror = true;
		this.setRotation(bodymiddlebutton, 0F, 0F, 0F);
		this.bodybottom = new ModelRenderer(this, 0, 25);
		this.bodybottom.addBox(-2.5F, 7F, -2.5F, 5, 3, 3);
		this.bodybottom.setRotationPoint(0F, -8F, 0F);
		this.bodybottom.setTextureSize(64, 32);
		this.bodybottom.mirror = true;
		this.setRotation(bodybottom, 0.0872665F, 0F, 0F);
		this.cloak1 = new ModelRenderer(this, 36, 27);
		this.cloak1.addBox(-6.5F, 0F, 0.5F, 13, 4, 3);
		this.cloak1.setRotationPoint(0F, -8F, 0F);
		this.cloak1.setTextureSize(64, 32);
		this.cloak1.mirror = true;
		this.setRotation(cloak1, 0.1570796F, 0F, 0F);
		this.cloak2 = new ModelRenderer(this, 36, 34);
		this.cloak2.addBox(-7F, 4F, 0F, 14, 6, 4);
		this.cloak2.setRotationPoint(0F, -8F, 0F);
		this.cloak2.setTextureSize(64, 32);
		this.cloak2.mirror = true;
		this.setRotation(cloak2, 0.122173F, 0F, 0F);
		this.cloak3 = new ModelRenderer(this, 36, 44);
		this.cloak3.addBox(-7.5F, 10F, -1F, 15, 8, 6);
		this.cloak3.setRotationPoint(0F, -8F, 0F);
		this.cloak3.setTextureSize(64, 32);
		this.cloak3.mirror = true;
		this.setRotation(cloak3, 0.0872665F, 0F, 0F);
		this.cloak4 = new ModelRenderer(this, 78, 0);
		this.cloak4.addBox(-8F, 18F, -1.5F, 16, 5, 7);
		this.cloak4.setRotationPoint(0F, -8F, 0F);
		this.cloak4.setTextureSize(64, 32);
		this.cloak4.mirror = true;
		this.setRotation(cloak4, 0.0349066F, 0F, 0F);
		this.rightshoulder = new ModelRenderer(this, 78, 12);
		this.rightshoulder.addBox(-3F, -1F, -2F, 4, 4, 4);
		this.rightshoulder.setRotationPoint(-2.5F, -6.5F, 0F);
		this.rightshoulder.setTextureSize(64, 32);
		this.rightshoulder.mirror = true;
		this.setRotation(rightshoulder, 0.0872665F, 0F, 0.0872665F);
		this.rightarm = new ModelRenderer(this, 16, 12);
		this.rightarm.addBox(-2F, -1F, -1F, 2, 10, 2);
		this.rightarm.setRotationPoint(-2.5F, -6.5F, 0F);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(rightarm, 0.0872665F, 0F, 0.0872665F);
		this.leftshoulder = new ModelRenderer(this, 78, 12);
		this.leftshoulder.addBox(-3F, -1F, -2F, 4, 4, 4);
		this.leftshoulder.setRotationPoint(4.5F, -6.5F, 0F);
		this.leftshoulder.setTextureSize(64, 32);
		this.leftshoulder.mirror = true;
		this.setRotation(leftshoulder, 0.0872665F, 0F, -0.0872665F);
		this.leftarm = new ModelRenderer(this, 16, 12);
		this.leftarm.addBox(0F, -1F, -1F, 2, 10, 2);
		this.leftarm.setRotationPoint(2.5F, -6.5F, 0F);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(leftarm, 0.0872665F, 0F, -0.0872665F);
		this.rightchest = new ModelRenderer(this, 0, 31);
		this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.rightchest.setRotationPoint(-1.3F, -6F, -1.5F);
		this.rightchest.setTextureSize(64, 32);
		this.rightchest.mirror = true;
		this.setRotation(rightchest, 0.7853982F, 0.1745329F, 0.0872665F);
		this.leftchest = new ModelRenderer(this, 8, 31);
		this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.leftchest.setRotationPoint(1.3F, -6F, -1.5F);
		this.leftchest.setTextureSize(64, 32);
		this.leftchest.mirror = true;
		this.setRotation(leftchest, 0.7853982F, -0.1745329F, -0.0872665F);
		this.waist = new ModelRenderer(this, 78, 20);
		this.waist.addBox(-3.5F, 6F, -2.5F, 7, 7, 5);
		this.waist.setRotationPoint(0F, -8F, 0F);
		this.waist.setTextureSize(64, 32);
		this.waist.mirror = true;
		this.setRotation(waist, 0F, 0F, 0F);
		this.waist1 = new ModelRenderer(this, 78, 32);
		this.waist1.addBox(-3F, 9F, -2F, 6, 4, 4);
		this.waist1.setRotationPoint(0F, -8F, 0F);
		this.waist1.setTextureSize(64, 32);
		this.waist1.mirror = true;
		this.setRotation(waist1, 0F, 0F, 0F);
		this.waist2 = new ModelRenderer(this, 78, 40);
		this.waist2.addBox(-4F, 12F, -1.5F, 8, 5, 5);
		this.waist2.setRotationPoint(0F, -8F, 0F);
		this.waist2.setTextureSize(64, 32);
		this.waist2.mirror = true;
		this.setRotation(waist2, 0F, 0F, 0F);
		this.waist3 = new ModelRenderer(this, 78, 50);
		this.waist3.addBox(-5F, 17F, -1F, 10, 5, 6);
		this.waist3.setRotationPoint(0F, -8F, 0F);
		this.waist3.setTextureSize(64, 32);
		this.waist3.mirror = true;
		this.setRotation(waist3, 0F, 0F, 0F);
		this.rightleg = new ModelRenderer(this, 24, 12);
		this.rightleg.addBox(-1F, 0F, -1F, 2, 13, 2);
		this.rightleg.setRotationPoint(-1.5F, 2F, 0F);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(rightleg, 0.0872665F, 0F, -0.0349066F);
		this.leftleg = new ModelRenderer(this, 24, 12);
		this.leftleg.addBox(-1F, 0F, -1F, 2, 13, 2);
		this.leftleg.setRotationPoint(1.5F, 2F, 0F);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(leftleg, -0.0872665F, 0F, 0.0349066F);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
		this.headaccessory.render(par7);
		this.mantle.render(par7);
		this.bodytop.render(par7);
		this.bodymiddle.render(par7);
		this.bodymiddlebutton.render(par7);
		this.bodybottom.render(par7);
		this.cloak1.render(par7);
		this.cloak2.render(par7);
		this.cloak3.render(par7);
		this.cloak4.render(par7);
		this.rightshoulder.render(par7);
		this.rightarm.render(par7);
		this.leftshoulder.render(par7);
		this.leftarm.render(par7);
		this.rightchest.render(par7);
		this.leftchest.render(par7);
		this.waist.render(par7);
		this.waist1.render(par7);
		this.waist2.render(par7);
		this.waist3.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		this.headaccessory.rotateAngleY = this.head.rotateAngleY;
		this.headaccessory.rotateAngleX = this.head.rotateAngleX;
		this.cloak1.rotateAngleZ = MathHelper.cos(par1 * 0.6162F) * 0.1F * par2;
		this.cloak2.rotateAngleZ = MathHelper.cos(par1 * 0.6262F) * 0.1F * par2;
		this.cloak3.rotateAngleZ = MathHelper.cos(par1 * 0.6362F) * 0.1F * par2;
		this.cloak4.rotateAngleZ = MathHelper.cos(par1 * 0.6462F) * 0.1F * par2;
	}
}
