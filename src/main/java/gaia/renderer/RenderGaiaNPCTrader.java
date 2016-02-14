package gaia.renderer;

import gaia.model.ModelGaiaNPCTrader;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaNPCTrader extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation("gaia", "textures/models/Trader.png");

	public RenderGaiaNPCTrader() {
		super(new ModelGaiaNPCTrader(), 0.5F);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return texture;
	}
}
