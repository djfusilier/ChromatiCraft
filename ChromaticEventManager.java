/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import Reika.ChromatiCraft.Items.ItemInventoryLinker;
import Reika.ChromatiCraft.Registry.ChromaItems;

public class ChromaticEventManager {

	public static final ChromaticEventManager instance = new ChromaticEventManager();

	private ChromaticEventManager() {

	}

	@ForgeSubscribe(priority = EventPriority.HIGHEST)
	public void sendLinkedItems(EntityItemPickupEvent ev) {
		EntityPlayer ep = ev.entityPlayer;
		EntityItem e = ev.item;
		ItemStack picked = e.getEntityItem();
		for (int i = 0; i < ep.inventory.mainInventory.length; i++) {
			ItemStack in = ep.inventory.mainInventory[i];
			if (in != null && in.itemID == ChromaItems.LINK.getShiftedID()) {
				ItemInventoryLinker iil = (ItemInventoryLinker)in.getItem();
				if (iil.linksItem(in, picked)) {
					if (iil.processItem(ep.worldObj, in, picked)) {
						e.playSound("random.pop", 0.5F, 1);
						e.setDead();
						ev.setCanceled(true);
						return;
					}
				}
			}
		}
	}

}