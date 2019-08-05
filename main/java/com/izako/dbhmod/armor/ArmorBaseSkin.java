package com.izako.dbhmod.armor;

import com.izako.dbhmod.SDBH;
import com.izako.dbhmod.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorBaseSkin extends ItemArmor{

		

	private String armorName;
	private String name;
	private ArmorMaterial mat;

	public ArmorBaseSkin(String name, String armorName, ArmorMaterial material, int renderType)
	{
		super(material, 1, renderType);
		this.setMaxStackSize(1);
		this.mat = material;
		this.name = name;
		this.armorName = armorName;
		this.setUnlocalizedName(name);
		ModItems.ITEMS.add(this);
	}

	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot)
	{
		ModelBiped armorModel = new ModelBiped(0.05F);

		if (armorModel != null)
		{
			armorModel.bipedHead.showModel = armorSlot == 0;
			armorModel.bipedHeadwear.showModel = false;
			armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
			armorModel.bipedRightArm.showModel = armorSlot == 1;
			armorModel.bipedLeftArm.showModel = armorSlot == 1;
			armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
			armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;

			armorModel.isSneak = entityLiving.isSneaking();
			armorModel.isRiding = entityLiving.isRiding();
			armorModel.isChild = entityLiving.isChild();

			armorModel.heldItemRight = 0;
			armorModel.aimedBow = false;

			EntityPlayer player = (EntityPlayer) entityLiving;

			ItemStack held_item = player.getEquipmentInSlot(0);

			if (held_item != null)
			{
				armorModel.heldItemRight = 1;

				if (player.getItemInUseCount() > 0)
				{

					EnumAction enumaction = held_item.getItemUseAction();

					if (enumaction == EnumAction.bow)
					{
						armorModel.aimedBow = true;
					} else if (enumaction == EnumAction.block)
					{
						armorModel.heldItemRight = 3;
					}

				}

			}
		}

		return armorModel;
	}

	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon(SDBH.PROJECT_ID + ":" + name);
	}


	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
	{
		return String.format("%s:textures/armor/%s_%d.png", SDBH.PROJECT_ID, armorName, slot == 2 ? 2 : 1);

	
	}}



