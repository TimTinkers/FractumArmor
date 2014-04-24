package us.teamtinker.armor.client;

import net.minecraft.client.model.ModelBiped;
import us.teamtinker.armor.CommonProxy;
import us.teamtinker.armor.armors.AetherPlate;
import us.teamtinker.armor.armors.BaseFlag;
import us.teamtinker.armor.armors.CastellumVisor;
import us.teamtinker.armor.armors.GraylineCrown;
import us.teamtinker.armor.armors.Halo;
import us.teamtinker.armor.armors.Horns;
import us.teamtinker.armor.armors.SkrawlesHat;
import us.teamtinker.armor.armors.WinterfellChest;

public class ClientProxy extends CommonProxy {
	private static final SkrawlesHat skrawlesHat = new SkrawlesHat(1.0f);
	private static final WinterfellChest winterfellChest = new WinterfellChest(
			1.0f);
	private static final GraylineCrown graylineCrown = new GraylineCrown(1.0f);
	private static final AetherPlate aetherPlate = new AetherPlate(1.0f);
	private static final BaseFlag baseFlag = new BaseFlag(1.0f);
	private static final Halo halo = new Halo(1.0f);
	private static final Horns horns = new Horns(1.0f);
	private static final CastellumVisor visor = new CastellumVisor(1.0f);

	@Override
	public void registerRenderers() {
	}

	@Override
	public ModelBiped getArmorModel(int id) {
		switch (id) {
		case 0:
			return skrawlesHat;
		case 1:
			return winterfellChest;
		case 2:
			return graylineCrown;
		case 3:
			return aetherPlate;
		case 4:
			return baseFlag;
		case 5:
			return halo;
		case 6:
			return horns;
		case 7:
			return visor;
		default:
			break;
		}
		return skrawlesHat;
	}
}
