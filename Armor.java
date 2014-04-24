package us.teamtinker.armor;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "TeamTinkerArmor", name = "TeamTinkerArmor", version = "0.0.3")
@NetworkMod(clientSideRequired = true)
public class Armor {

	public static Item skrawlesHat;
	public static Item winterfellChest;
	//public static Item graylineCrown;
	public static Item aetherPlate;
	public static Item netherPlate;
	public static Item manorChest;
	public static Item losalamosChest;
	public static Item graylineChest;
	public static Item castellumChest;
	public static Item seacrestChest;
	public static Item rovolChest;
	public static Item yamaChest;
	public static Item damoclesChest;
	public static Item italyChest;
	public static Item winterfellFlag;
	public static Item graylineFlag;
	public static Item castellumFlag;
	public static Item losalamosFlag;
	public static Item manorFlag;
	public static Item damoclesFlag;
	public static Item seacrestFlag;
	public static Item italyFlag;
	public static Item rovolFlag;
	public static Item yamaFlag;
	public static Item halo;
	public static Item horns;
	//public static Item castellumVisor;

	// The instance of your mod that Forge uses.
	@Instance(value = "TeamTinkerArmor")
	public static Armor instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "us.teamtinker.armor.client.ClientProxy", serverSide = "us.teamtinker.armor.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		skrawlesHat = new CustomArmor(20000, EnumArmorMaterial.IRON, 4, 0)
				.setUnlocalizedName("a.leather_helmet");
		LanguageRegistry.addName(skrawlesHat, "A Lost Hero's Hat");
		winterfellChest = new CustomArmor(20001, EnumArmorMaterial.DIAMOND, 4,
				1).setUnlocalizedName("a.diamond_chestplate");
		LanguageRegistry.addName(winterfellChest, "Winter's Chestplate");
		//graylineCrown = new CustomArmor(20002, EnumArmorMaterial.GOLD, 4, 0)
		//		.setUnlocalizedName("a.gold_helmet");
		//LanguageRegistry.addName(graylineCrown, "The Crown of Grayline");
		aetherPlate = new CustomArmor(20003, EnumArmorMaterial.CHAIN, 4, 1)
				.setUnlocalizedName("a.leather_chestplate");
		LanguageRegistry.addName(aetherPlate, "The Path of Aetherism");
		netherPlate = new CustomArmor(20004, EnumArmorMaterial.CHAIN, 4, 1)
				.setUnlocalizedName("b.leather_chestplate");
		LanguageRegistry.addName(netherPlate, "The Path of Netherism");

		// Chests
		manorChest = new CustomArmor(20005, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("b.diamond_chestplate");
		LanguageRegistry.addName(manorChest, "The Apple's Chestplate");

		losalamosChest = new CustomArmor(20006, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("c.diamond_chestplate");
		LanguageRegistry.addName(losalamosChest, "The Consortium's Chestplate");
		graylineChest = new CustomArmor(20007, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("d.diamond_chestplate");
		LanguageRegistry.addName(graylineChest, "The Crown's Chestplate");
		castellumChest = new CustomArmor(20008, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("e.diamond_chestplate");
		LanguageRegistry.addName(castellumChest, "The Sun's Chestplate");
		seacrestChest = new CustomArmor(20009, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("f.diamond_chestplate");
		LanguageRegistry.addName(seacrestChest, "The Ocean's Chestplate");
		rovolChest = new CustomArmor(20010, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("g.diamond_chestplate");
		LanguageRegistry.addName(rovolChest, "The Mountain's Chestplate");
		yamaChest = new CustomArmor(20011, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("h.diamond_chestplate");
		LanguageRegistry.addName(yamaChest, "Spring's Chestplate");
		damoclesChest = new CustomArmor(20012, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("i.diamond_chestplate");
		LanguageRegistry.addName(damoclesChest, "Bravery's Chestplate");
		italyChest = new CustomArmor(20013, EnumArmorMaterial.DIAMOND, 4, 1)
				.setUnlocalizedName("j.diamond_chestplate");
		LanguageRegistry.addName(italyChest, "A Merchant's Chestplate");

		// Flag
		winterfellFlag = new CustomArmor(20014, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("a.diamond_leggings");
		LanguageRegistry.addName(winterfellFlag, "Winter's Flag");
		losalamosFlag = new CustomArmor(20015, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("b.diamond_leggings");
		LanguageRegistry.addName(losalamosFlag, "The Consortium's Flag");
		castellumFlag = new CustomArmor(20016, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("c.diamond_leggings");
		LanguageRegistry.addName(castellumFlag, "The Sun's Flag");
		seacrestFlag = new CustomArmor(20017, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("d.diamond_leggings");
		LanguageRegistry.addName(seacrestFlag, "The Ocean's Flag");
		manorFlag = new CustomArmor(20018, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("e.diamond_leggings");
		LanguageRegistry.addName(manorFlag, "The Apple's Flag");
		rovolFlag = new CustomArmor(20019, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("f.diamond_leggings");
		LanguageRegistry.addName(rovolFlag, "The Mountain's Flag");
		yamaFlag = new CustomArmor(20020, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("g.diamond_leggings");
		LanguageRegistry.addName(yamaFlag, "Spring's Flag");
		damoclesFlag = new CustomArmor(20021, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("h.diamond_leggings");
		LanguageRegistry.addName(damoclesFlag, "Bravery's Flag");
		italyFlag = new CustomArmor(20022, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("i.diamond_leggings");
		LanguageRegistry.addName(italyFlag, "A Merchant's Flag");
		graylineFlag = new CustomArmor(20023, EnumArmorMaterial.DIAMOND, 4, 2)
				.setUnlocalizedName("j.diamond_leggings");
		LanguageRegistry.addName(graylineFlag, "The Crown's Flag");

		halo = new CustomArmor(20024, EnumArmorMaterial.GOLD, 4, 0)
				.setUnlocalizedName("aa.gold_helmet");
		LanguageRegistry.addName(halo, "Aether's Light");
		horns = new CustomArmor(20025, EnumArmorMaterial.GOLD, 4, 0)
				.setUnlocalizedName("ab.gold_helmet");
		LanguageRegistry.addName(horns, "Nether's Shadow");

		//castellumVisor = new CustomArmor(20026, EnumArmorMaterial.DIAMOND, 4, 0)
		//		.setUnlocalizedName("ac.diamond_helmet");
		//LanguageRegistry.addName(castellumVisor, "The Sun's Helmet");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}
