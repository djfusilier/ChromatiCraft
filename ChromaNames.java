/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft;

import net.minecraft.util.StatCollector;

public class ChromaNames {

	private static final String[] blockNames = {

	};

	public static final String[] fluidNames = {
		"fluid.chroma", "fluid.endere", "fluid.potioncrystal"
	};

	public static final String[] clusterNames = {
		"crystal.redgroup", "crystal.greengroup", "crystal.orangegroup", "crystal.whitegroup",
		"crystal.bunch0", "crystal.bunch1", "crystal.bunch2", "crystal.bunch3",
		"crystal.cluster0", "crystal.cluster1", "crystal.core", "crystal.star", "crystal.multi"
	};

	public static final String[] craftingNames = {
		"chromacraft.void", "chromacraft.lens", "chromacraft.focus", "chromacraft.mirror", "chromacraft.rawcrystal",
		"chromacraft.energycore", "chromacraft.crystaldust", "chromacraft.transformcore", "chromacraft.elementunit",
		"chromacraft.iridcrystal", "chromacraft.iridchunk", "chromacraft.ingot", "chromacraft.chassis0", "chromacraft.chassis1",
		"chromacraft.chassis2", "chromacraft.chassis3", "chromacraft.ingot2", "chromacraft.ingot3", "chromacraft.ingot4", "chromacraft.ingot5",
		"chromacraft.ingot6", "chromacraft.ingot7", "chromacraft.ingot8", "chromacraft.hivoid", "chromacraft.hitransformcore",
		"chromacraft.hienergycore", "chromacraft.teledust", "chromacraft.icydust", "chromacraft.energydust", "chromacraft.etherberries",
		"chromacraft.voiddust", "chromacraft.livingessence"
	};

	public static final String[] tieredNames = {
		"chromacraft.chromadust", "chromacraft.auradust", "chromacraft.puredust", "chromacraft.focusdust", "chromacraft.elementdust",
		"chromacraft.beacondust", "chromacraft.bindingcrystal", "chromacraft.resodust", "chromacraft.enderdust", "chromacraft.waterdust",
		"chromacraft.firaxite", "chromacraft.lumadust", "chromacraft.echocrystal", "chromacraft.cavern", "chromacraft.burrow",
		"chromacraft.ocean", "chromacraft.fireessence", "chromacraft.thermiticcrystal", "chromacraft.endcrystal", "chromacraft.spacedust",
		"chromacraft.desert"
	};

	public static final String[] dimGenNames = {
		"chromaitem.dimgen.miasma", "chromaitem.dimgen.floatstone", "chromaitem.dimgen.aqua"
	};

	public static final String[] storageNames = {
		"Nula", "Daya", "Divi", "Sami", "Vier", "Lima", "Aru"
	};

	public static final String[] miscNames = {
		"chromamisc.silktouch", "chromamisc.speed", "chromamisc.efficiency"
	};

	public static final String[] modInteractNames = {
		"chromamod.crystalwand", "chromamod.firaxcap", "chromamod.watercap", "chromamod.endercap", "chromamod.finalcap"
	};

	public static final String[] coloredModInteractNames = {
		"chromamod.comb",
	};

	private static String getName(String[] names, int i) {
		return StatCollector.translateToLocal(names[i]);
	}
}
