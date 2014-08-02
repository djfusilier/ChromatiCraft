/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.GUI;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import org.lwjgl.opengl.GL11;

import Reika.ChromatiCraft.Base.GuiChromaBase;
import Reika.ChromatiCraft.Container.ContainerCollector;
import Reika.ChromatiCraft.TileEntity.TileEntityCollector;
import Reika.DragonAPI.Libraries.IO.ReikaLiquidRenderer;

public class GuiCollector extends GuiChromaBase {

	private TileEntityCollector coll;

	public GuiCollector(EntityPlayer ep, TileEntityCollector tile) {
		super(new ContainerCollector(ep, tile), tile);
		player = ep;
		coll = tile;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		super.drawGuiContainerForegroundLayer(par1, par2);

		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		int level = coll.getInputLevel();
		if (level > 0) {
			Fluid f = coll.getFluidInInput();
			Icon ico = f.getStillIcon();
			ReikaLiquidRenderer.bindFluidTexture(f);
			GL11.glColor3f(1, 1, 1);
			int h = 54 * level / coll.getCapacity();
			this.drawTexturedModelRectFromIcon(35, 70-h, ico, 16, h);
		}

		level = coll.getOutputLevel();
		if (level > 0) {
			Fluid f = FluidRegistry.getFluid("chroma");
			Icon ico = f.getStillIcon();
			ReikaLiquidRenderer.bindFluidTexture(f);
			GL11.glColor3f(1, 1, 1);
			int h = 54 * level / coll.getCapacity();
			this.drawTexturedModelRectFromIcon(125, 70-h, ico, 16, h);
		}
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int a, int b) {
		super.drawGuiContainerBackgroundLayer(f, a, b);
		int j = (width - xSize) / 2;
		int k = (height - ySize) / 2;

		int h = coll.getProgressScaled(46);
		this.drawTexturedModalRect(j+66, k+21, 179, 3, h, 44);
	}

	@Override
	public String getGuiTexture() {
		return "collector";
	}

}