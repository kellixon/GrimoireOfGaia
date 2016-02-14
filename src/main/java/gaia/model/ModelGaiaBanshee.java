package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaBanshee extends ModelBase {
	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer hair1;
	ModelRenderer hair2;
	ModelRenderer hair3;
	ModelRenderer hair4;
	ModelRenderer bodytop;
	ModelRenderer bodymid;
	ModelRenderer bodymidbutton;
	ModelRenderer bodybottom;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	ModelRenderer rightarm;
	ModelRenderer rightlower;
	ModelRenderer leftarm;
	ModelRenderer leftarmlower;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer skirt1;
	ModelRenderer skirt2;
	ModelRenderer skirt3;
	ModelRenderer skirt4;

	public ModelGaiaBanshee() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
		this.head.setRotationPoint(0F, -6F, -1F);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 36, 0);
		this.headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
		this.headaccessory.setRotationPoint(0F, -6F, -1F);
		this.headaccessory.setTextureSize(64, 32);
		this.headaccessory.mirror = true;
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.hair1 = new ModelRenderer(this, 36, 14);
		this.hair1.addBox(-4F, -7.5F, -0.5F, 8, 7, 2);
		this.hair1.setRotationPoint(0F, -6F, -1F);
		this.hair1.setTextureSize(64, 32);
		this.hair1.mirror = true;
		this.setRotation(hair1, 0.0872665F, 0F, 0F);
		this.hair2 = new ModelRenderer(this, 36, 23);
		this.hair2.addBox(-5F, -8.5F, 1.5F, 10, 10, 4);
		this.hair2.setRotationPoint(0F, -6F, -1F);
		this.hair2.setTextureSize(64, 32);
		this.hair2.mirror = true;
		this.setRotation(hair2, 0.1745329F, 0F, 0F);
		this.hair3 = new ModelRenderer(this, 36, 37);
		this.hair3.addBox(-6F, -9.5F, 5.5F, 12, 12, 6);
		this.hair3.setRotationPoint(0F, -6F, -1F);
		this.hair3.setTextureSize(64, 32);
		this.hair3.mirror = true;
		this.setRotation(hair3, 0.1745329F, 0F, 0F);
		this.hair4 = new ModelRenderer(this, 6, 41);
		this.hair4.addBox(-4F, -7.5F, 5.5F, 8, 8, 14);
		this.hair4.setRotationPoint(0F, -6F, -1F);
		this.hair4.setTextureSize(64, 32);
		this.hair4.mirror = true;
		this.setRotation(hair4, 0.1745329F, 0F, 0F);
		this.bodytop = new ModelRenderer(this, 0, 12);
		this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 5, 3);
		this.bodytop.setRotationPoint(0F, -6F, -1F);
		this.bodytop.setTextureSize(64, 32);
		this.bodytop.mirror = true;
		this.setRotation(bodytop, 0F, 0F, 0F);
		this.bodymid = new ModelRenderer(this, 0, 20);
		this.bodymid.addBox(-2F, 4.5F, -1.5F, 4, 3, 2);
		this.bodymid.setRotationPoint(0F, -6F, -1F);
		this.bodymid.setTextureSize(64, 32);
		this.bodymid.mirror = true;
		this.setRotation(bodymid, 0.0872665F, 0F, 0F);
		this.bodymidbutton = new ModelRenderer(this, 0, 20);
		this.bodymidbutton.addBox(-0.5F, 5F, -1.6F, 1, 2, 0);
		this.bodymidbutton.setRotationPoint(0F, -6F, -1F);
		this.bodymidbutton.setTextureSize(64, 32);
		this.bodymidbutton.mirror = true;
		this.setRotation(bodymidbutton, 0.0872665F, 0F, 0F);
		this.bodybottom = new ModelRenderer(this, 0, 25);
		this.bodybottom.addBox(-2.5F, 7F, -3F, 5, 3, 3);
		this.bodybottom.setRotationPoint(0F, -6F, -1F);
		this.bodybottom.setTextureSize(64, 32);
		this.bodybottom.mirror = true;
		this.setRotation(bodybottom, 0.2617994F, 0F, 0F);
		this.rightchest = new ModelRenderer(this, 8, 31);
		this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.rightchest.setRotationPoint(1.3F, -4F, -2.5F);
		this.rightchest.setTextureSize(64, 32);
		this.rightchest.mirror = true;
		this.setRotation(rightchest, 0.8726646F, -0.1745329F, -0.0872665F);
		this.leftchest = new ModelRenderer(this, 0, 31);
		this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.leftchest.setRotationPoint(-1.3F, -4F, -2.5F);
		this.leftchest.setTextureSize(64, 32);
		this.leftchest.mirror = true;
		this.setRotation(leftchest, 0.8726646F, 0.1745329F, 0.0872665F);
		this.rightarm = new ModelRenderer(this, 16, 12);
		this.rightarm.addBox(-2F, -1F, -1F, 2, 10, 2);
		this.rightarm.setRotationPoint(-2.5F, -4.5F, -1F);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(rightarm, 0.3490659F, 0F, 0.2617994F);
		this.rightlower = new ModelRenderer(this, 72, 0);
		this.rightlower.addBox(-2.5F, 4F, -1.5F, 3, 6, 3);
		this.rightlower.setRotationPoint(-2.5F, -4.5F, -1F);
		this.rightlower.setTextureSize(64, 32);
		this.rightlower.mirror = true;
		this.setRotation(rightlower, 0.3490659F, 0F, 0.2617994F);
		this.leftarm = new ModelRenderer(this, 16, 12);
		this.leftarm.addBox(0F, -1F, -1F, 2, 10, 2);
		this.leftarm.setRotationPoint(2.5F, -4.5F, -1F);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(leftarm, 0.3490659F, 0F, -0.2617994F);
		this.leftarmlower = new ModelRenderer(this, 72, 0);
		this.leftarmlower.addBox(-0.5F, 4F, -1.5F, 3, 6, 3);
		this.leftarmlower.setRotationPoint(2.5F, -4.5F, -1F);
		this.leftarmlower.setTextureSize(64, 32);
		this.leftarmlower.mirror = true;
		this.setRotation(leftarmlower, 0.3490659F, 0F, -0.2617994F);
		this.rightleg = new ModelRenderer(this, 24, 12);
		this.rightleg.addBox(-1F, 0F, -1F, 2, 13, 2);
		this.rightleg.setRotationPoint(-1.5F, 4F, 0F);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(rightleg, 0.0872665F, 0F, 0F);
		this.leftleg = new ModelRenderer(this, 24, 12);
		this.leftleg.addBox(-1F, 0F, -1F, 2, 13, 2);
		this.leftleg.setRotationPoint(1.5F, 4F, 0F);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(leftleg, 0.1745329F, 0F, 0.0872665F);
		this.skirt1 = new ModelRenderer(this, 72, 9);
		this.skirt1.addBox(-3F, -1F, -2F, 6, 2, 6);
		this.skirt1.setRotationPoint(0F, 4F, 0F);
		this.skirt1.setTextureSize(64, 32);
		this.skirt1.mirror = true;
		this.setRotation(skirt1, 0.0872665F, 0F, 0F);
		this.skirt2 = new ModelRenderer(this, 72, 17);
		this.skirt2.addBox(-3.5F, 1F, -2.5F, 7, 3, 7);
		this.skirt2.setRotationPoint(0F, 4F, 0F);
		this.skirt2.setTextureSize(64, 32);
		this.skirt2.mirror = true;
		this.setRotation(skirt2, 0.1745329F, 0F, 0F);
		this.skirt3 = new ModelRenderer(this, 72, 27);
		this.skirt3.addBox(-4F, 4F, -3.5F, 8, 4, 8);
		this.skirt3.setRotationPoint(0F, 4F, 0F);
		this.skirt3.setTextureSize(64, 32);
		this.skirt3.mirror = true;
		this.setRotation(skirt3, 0.2617994F, 0F, 0F);
		this.skirt4 = new ModelRenderer(this, 72, 39);
		this.skirt4.addBox(-4.5F, 8F, -4.5F, 9, 6, 9);
		this.skirt4.setRotationPoint(0F, 4F, 0F);
		this.skirt4.setTextureSize(64, 32);
		this.skirt4.mirror = true;
		this.setRotation(skirt4, 0.3490659F, 0F, 0F);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
		this.headaccessory.render(par7);
		this.hair1.render(par7);
		this.hair2.render(par7);
		this.hair3.render(par7);
		this.hair4.render(par7);
		this.bodytop.render(par7);
		this.bodymid.render(par7);
		this.bodymidbutton.render(par7);
		this.bodybottom.render(par7);
		this.rightchest.render(par7);
		this.leftchest.render(par7);
		this.rightarm.render(par7);
		this.rightlower.render(par7);
		this.leftarm.render(par7);
		this.leftarmlower.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.skirt1.render(par7);
		this.skirt2.render(par7);
		this.skirt3.render(par7);
		this.skirt4.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		this.headaccessory.rotateAngleY = this.head.rotateAngleY;
		this.headaccessory.rotateAngleX = this.head.rotateAngleX;
		this.hair1.rotateAngleY = this.head.rotateAngleY;
		this.hair1.rotateAngleX = this.head.rotateAngleX;
		this.hair2.rotateAngleY = this.head.rotateAngleY;
		this.hair2.rotateAngleX = this.head.rotateAngleX;
		this.hair3.rotateAngleY = this.head.rotateAngleY;
		this.hair3.rotateAngleX = this.head.rotateAngleX;
		this.hair4.rotateAngleY = this.head.rotateAngleY;
		this.hair4.rotateAngleX = this.head.rotateAngleX;
		this.skirt1.rotateAngleZ = MathHelper.cos(par1 * 0.6162F) * 0.1F * par2;
		this.skirt2.rotateAngleZ = MathHelper.cos(par1 * 0.6262F) * 0.1F * par2;
		this.skirt3.rotateAngleZ = MathHelper.cos(par1 * 0.6362F) * 0.1F * par2;
		this.skirt4.rotateAngleZ = MathHelper.cos(par1 * 0.6462F) * 0.1F * par2;
	}
}
