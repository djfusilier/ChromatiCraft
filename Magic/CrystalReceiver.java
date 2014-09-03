/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Magic;

import Reika.ChromatiCraft.Registry.CrystalElement;

public interface CrystalReceiver extends CrystalNetworkTile {

	public void receiveElement(CrystalElement e, int amt);

	public void onPathBroken();

	public int getReceiveRange();

	//public void markSource(WorldLocation loc);

}