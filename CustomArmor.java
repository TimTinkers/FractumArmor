package us.teamtinker.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomArmor extends ItemArmor {

	public CustomArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		String itemName = getUnlocalizedName().substring(
				getUnlocalizedName().lastIndexOf(".") + 1);
		this.itemIcon = par1IconRegister.registerIcon(itemName);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		if (stack.getItem().equals(Armor.skrawlesHat)) {
			return "teamtinkerarmor:textures/items/skrawlesHat.png";
		}
		if (stack.getItem().equals(Armor.winterfellChest)) {
			return "teamtinkerarmor:textures/items/winterfellChest.png";
		}
		//if (stack.getItem().equals(Armor.graylineCrown)) {
		//	return "teamtinkerarmor:textures/items/graylineCrown.png";
		//}
		if (stack.getItem().equals(Armor.aetherPlate)) {
			return "teamtinkerarmor:textures/items/aetherPlate.png";
		}
		if (stack.getItem().equals(Armor.netherPlate)) {
			return "teamtinkerarmor:textures/items/netherPlate.png";
		}
		if (stack.getItem().equals(Armor.manorChest)) {
			return "teamtinkerarmor:textures/items/manorChest.png";
		}
		if (stack.getItem().equals(Armor.losalamosChest)) {
			return "teamtinkerarmor:textures/items/losalamosChest.png";
		}
		if (stack.getItem().equals(Armor.graylineChest)) {
			return "teamtinkerarmor:textures/items/graylineChest.png";
		}
		if (stack.getItem().equals(Armor.castellumChest)) {
			return "teamtinkerarmor:textures/items/castellumChest.png";
		}
		if (stack.getItem().equals(Armor.seacrestChest)) {
			return "teamtinkerarmor:textures/items/seacrestChest.png";
		}
		if (stack.getItem().equals(Armor.rovolChest)) {
			return "teamtinkerarmor:textures/items/rovolChest.png";
		}
		if (stack.getItem().equals(Armor.yamaChest)) {
			return "teamtinkerarmor:textures/items/yamaChest.png";
		}
		if (stack.getItem().equals(Armor.damoclesChest)) {
			return "teamtinkerarmor:textures/items/damoclesChest.png";
		}
		if (stack.getItem().equals(Armor.italyChest)) {
			return "teamtinkerarmor:textures/items/italyChest.png";
		}
		if (stack.getItem().equals(Armor.winterfellFlag)) {
			return "teamtinkerarmor:textures/items/winterfellFlag.png";
		}
		if (stack.getItem().equals(Armor.graylineFlag)) {
			return "teamtinkerarmor:textures/items/graylineFlag.png";
		}
		if (stack.getItem().equals(Armor.castellumFlag)) {
			return "teamtinkerarmor:textures/items/castellumFlag.png";
		}
		if (stack.getItem().equals(Armor.seacrestFlag)) {
			return "teamtinkerarmor:textures/items/seacrestFlag.png";
		}
		if (stack.getItem().equals(Armor.manorFlag)) {
			return "teamtinkerarmor:textures/items/manorFlag.png";
		}
		if (stack.getItem().equals(Armor.losalamosFlag)) {
			return "teamtinkerarmor:textures/items/losalamosFlag.png";
		}
		if (stack.getItem().equals(Armor.rovolFlag)) {
			return "teamtinkerarmor:textures/items/rovolFlag.png";
		}
		if (stack.getItem().equals(Armor.yamaFlag)) {
			return "teamtinkerarmor:textures/items/yamaFlag.png";
		}
		if (stack.getItem().equals(Armor.italyFlag)) {
			return "teamtinkerarmor:textures/items/italyFlag.png";
		}
		if (stack.getItem().equals(Armor.damoclesFlag)) {
			return "teamtinkerarmor:textures/items/damoclesFlag.png";
		}
		if (stack.getItem().equals(Armor.halo)) {
			return "teamtinkerarmor:textures/items/halo.png";
		}
		if (stack.getItem().equals(Armor.horns)) {
			return "teamtinkerarmor:textures/items/horns.png";
		}
		//if (stack.getItem().equals(Armor.castellumVisor)) {
		//	return "teamtinkerarmor:textures/items/castellumVisor.png";
		//}
		return null;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
			ItemStack itemStack, int armorSlot) {
		ModelBiped armorModel = null;
		if (itemStack != null) {
			if (itemStack.getItem() instanceof CustomArmor) {
				if (itemStack.getItem().equals(Armor.skrawlesHat)) {
					armorModel = Armor.proxy.getArmorModel(0);
				}
				if (itemStack.getItem().equals(Armor.winterfellChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				//if (itemStack.getItem().equals(Armor.graylineCrown)) {
				//	armorModel = Armor.proxy.getArmorModel(2);
				//}
				if (itemStack.getItem().equals(Armor.aetherPlate)) {
					armorModel = Armor.proxy.getArmorModel(3);
				}
				if (itemStack.getItem().equals(Armor.netherPlate)) {
					armorModel = Armor.proxy.getArmorModel(3);
				}
				if (itemStack.getItem().equals(Armor.manorChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.graylineChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.losalamosChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.rovolChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.castellumChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.seacrestChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.yamaChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.damoclesChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.italyChest)) {
					armorModel = Armor.proxy.getArmorModel(1);
				}
				if (itemStack.getItem().equals(Armor.winterfellFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.castellumFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.graylineFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.manorFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.losalamosFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.rovolFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.yamaFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.damoclesFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.seacrestFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.italyFlag)) {
					armorModel = Armor.proxy.getArmorModel(4);
				}
				if (itemStack.getItem().equals(Armor.halo)) {
					armorModel = Armor.proxy.getArmorModel(5);
				}
				if (itemStack.getItem().equals(Armor.horns)) {
					armorModel = Armor.proxy.getArmorModel(6);
				}
				//if (itemStack.getItem().equals(Armor.castellumVisor)) {
				//	armorModel = Armor.proxy.getArmorModel(7);
				//}
			}
		}
		if (armorModel != null) {
			armorModel.bipedHead.showModel = armorSlot == 0;
			armorModel.bipedHeadwear.showModel = armorSlot == 0;
			armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
			armorModel.bipedRightArm.showModel = armorSlot == 1;
			armorModel.bipedLeftArm.showModel = armorSlot == 1;
			armorModel.bipedRightLeg.showModel = armorSlot == 2
					|| armorSlot == 3;
			armorModel.bipedLeftLeg.showModel = armorSlot == 2
					|| armorSlot == 3;

			armorModel.isSneak = entityLiving.isSneaking();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isChild = entityLiving.isChild();
			armorModel.heldItemRight = entityLiving.getCurrentItemOrArmor(0) != null ? 1
					: 0;
			if (entityLiving instanceof EntityPlayer) {
				armorModel.aimedBow = ((EntityPlayer) entityLiving)
						.getItemInUseDuration() > 2;
			}
			return armorModel;
		}
		return null;
	}
}
