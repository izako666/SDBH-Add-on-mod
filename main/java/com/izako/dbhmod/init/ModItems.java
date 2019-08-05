package com.izako.dbhmod.init;

import java.util.ArrayList;
import java.util.List;

import com.izako.dbhmod.armor.ArmorBaseSkin;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static List<Item> ITEMS = new ArrayList<Item>();
	public static ArmorMaterial WARENAI = EnumHelper.addArmorMaterial("warenai", 30, new int[]{3, 8, 6, 3}, 10);
	public static final ArmorMaterial GI = EnumHelper.addArmorMaterial("gi", 25, new int[]{3, 5, 5, 5}, 20);
	public static  ArmorBaseSkin TH = new ArmorBaseSkin("th1", "t1", GI, 0);
	public static  ArmorBaseSkin TC = new ArmorBaseSkin("tc1", "t1", GI, 1);
	public static  ArmorBaseSkin TL = new ArmorBaseSkin("tl1", "t1", GI, 2);
	public static  ArmorBaseSkin TS = new ArmorBaseSkin("ts1", "t1", GI, 3);
	public static  ArmorBaseSkin TH_2 = new ArmorBaseSkin("th2", "t2", GI, 0);
	public static  ArmorBaseSkin TC_2 = new ArmorBaseSkin("tc2", "t2", GI, 1);
	public static  ArmorBaseSkin TL_2 = new ArmorBaseSkin("tl2", "t2", GI, 2);
	public static  ArmorBaseSkin TS_2 = new ArmorBaseSkin("ts2", "t2", GI, 3);
	public static  ArmorBaseSkin TH_3 = new ArmorBaseSkin("th3", "t3", GI, 0);
	public static  ArmorBaseSkin TC_3 = new ArmorBaseSkin("tc3", "t3", GI, 1);
	public static  ArmorBaseSkin TL_3 = new ArmorBaseSkin("tl3", "t3", GI, 2);
	public static  ArmorBaseSkin TS_3 = new ArmorBaseSkin("ts3", "t3", GI, 3);
	public static  ArmorBaseSkin TH_4 = new ArmorBaseSkin("th4", "t4",GI, 0);
	public static  ArmorBaseSkin TC_4 = new ArmorBaseSkin("tc4", "t4",GI, 1);
	public static  ArmorBaseSkin TL_4 = new ArmorBaseSkin("tl4", "t4",GI, 2);
	public static  ArmorBaseSkin TS_4 = new ArmorBaseSkin("ts4","t4", GI, 3);
	public static  ArmorBaseSkin TH_5 = new ArmorBaseSkin("th5", "t5",GI, 0);
	public static  ArmorBaseSkin TC_5 = new ArmorBaseSkin("tc5", "t5",GI, 1);
	public static  ArmorBaseSkin TL_5 = new ArmorBaseSkin("tl5", "t5",GI, 2);
	public static  ArmorBaseSkin TS_5 = new ArmorBaseSkin("ts5", "t5",GI, 3);
	public static  ArmorBaseSkin TH_6 = new ArmorBaseSkin("th6", "t6",GI, 0);
	public static  ArmorBaseSkin TC_6 = new ArmorBaseSkin("tc6", "t6",GI, 1);
	public static  ArmorBaseSkin TL_6 = new ArmorBaseSkin("tl6", "t6",GI, 2);
	public static  ArmorBaseSkin TS_6 = new ArmorBaseSkin("ts6", "t6",GI, 3);
	public static  ArmorBaseSkin TH_7 = new ArmorBaseSkin("th7", "t7",GI, 0);
	public static  ArmorBaseSkin TC_7 = new ArmorBaseSkin("tc7", "t7",GI, 1);
	public static  ArmorBaseSkin TL_7 = new ArmorBaseSkin("tl7", "t7",GI, 2);
	public static  ArmorBaseSkin TS_7 = new ArmorBaseSkin("ts7", "t7",GI, 3);
	public static  ArmorBaseSkin TH_8 = new ArmorBaseSkin("th8", "t8",GI, 0);
	public static  ArmorBaseSkin TC_8 = new ArmorBaseSkin("tc8", "t8",GI, 1);
	public static  ArmorBaseSkin TL_8 = new ArmorBaseSkin("tl8", "t8",GI, 2);
	public static  ArmorBaseSkin TS_8 = new ArmorBaseSkin("ts8", "t8",GI, 3);
	public static  ArmorBaseSkin TH_9 = new ArmorBaseSkin("th9", "t9",GI, 0);
	public static  ArmorBaseSkin TC_9 = new ArmorBaseSkin("tc9", "t9",GI, 1);
	public static  ArmorBaseSkin TL_9 = new ArmorBaseSkin("tl9", "t9",GI, 2);
	public static  ArmorBaseSkin TS_9 = new ArmorBaseSkin("ts9", "t9",GI, 3);
	public static  ArmorBaseSkin TH_10 = new ArmorBaseSkin("th10", "t10",GI, 0);
	public static  ArmorBaseSkin TC_10 = new ArmorBaseSkin("tc10", "t10",GI, 1);
	public static  ArmorBaseSkin TL_10 = new ArmorBaseSkin("tl10", "t10",GI, 2);
	public static  ArmorBaseSkin TS_10 = new ArmorBaseSkin("ts10", "t10",GI, 3);
	public static  ArmorBaseSkin TH_11 = new ArmorBaseSkin("th11", "t11",WARENAI, 0);
	public static  ArmorBaseSkin TC_11= new ArmorBaseSkin("tc11", "t11",WARENAI, 1);
	public static  ArmorBaseSkin TL_11 = new ArmorBaseSkin("tl11", "t11",WARENAI, 2);
	public static  ArmorBaseSkin TS_11 = new ArmorBaseSkin("ts11", "t11",WARENAI, 3);
	public static  ArmorBaseSkin TH_12 = new ArmorBaseSkin("th12", "t12",WARENAI, 0);
	public static  ArmorBaseSkin TC_12 = new ArmorBaseSkin("tc12", "t12",WARENAI, 1);
	public static  ArmorBaseSkin TL_12 = new ArmorBaseSkin("tl12", "t12",WARENAI, 2);
	public static  ArmorBaseSkin TS_12 = new ArmorBaseSkin("ts12", "t12",WARENAI, 3);
	public static  ArmorBaseSkin TH_13 = new ArmorBaseSkin("th13", "t13",WARENAI, 0);
	public static  ArmorBaseSkin TC_13 = new ArmorBaseSkin("tc13", "t13",WARENAI, 1);
	public static  ArmorBaseSkin TL_13 = new ArmorBaseSkin("tl13", "t13",WARENAI, 2);
	public static  ArmorBaseSkin TS_13 = new ArmorBaseSkin("ts13", "t13",WARENAI, 3);
	public static  ArmorBaseSkin TH_14 = new ArmorBaseSkin("th14", "t14",WARENAI, 0);
	public static  ArmorBaseSkin TC_14 = new ArmorBaseSkin("tc14", "t14",WARENAI, 1);
	public static  ArmorBaseSkin TL_14 = new ArmorBaseSkin("tl14", "t14",WARENAI, 2);
	public static  ArmorBaseSkin TS_14 = new ArmorBaseSkin("ts14", "t14",WARENAI, 3);
	public static  ArmorBaseSkin TH_15 = new ArmorBaseSkin("th15", "t15",WARENAI, 0);
	public static  ArmorBaseSkin TC_15 = new ArmorBaseSkin("tc15", "t15",WARENAI, 1);
	public static  ArmorBaseSkin TL_15 = new ArmorBaseSkin("tl15", "t15",WARENAI, 2);
	public static  ArmorBaseSkin TS_15 = new ArmorBaseSkin("ts15", "t15",WARENAI, 3);
	public static  ArmorBaseSkin TH_16 = new ArmorBaseSkin("th16","t16",WARENAI, 0);
	public static  ArmorBaseSkin TC_16 = new ArmorBaseSkin("tc16", "t16",WARENAI, 1);
	public static  ArmorBaseSkin TL_16 = new ArmorBaseSkin("tl16", "t16",WARENAI, 2);
	public static  ArmorBaseSkin TS_16 = new ArmorBaseSkin("ts16", "t16",WARENAI, 3);
	public static  ArmorBaseSkin TH_17 = new ArmorBaseSkin("th17", "t17",WARENAI, 0);
	public static  ArmorBaseSkin TC_17 = new ArmorBaseSkin("tc17", "t17",WARENAI, 1);
	public static  ArmorBaseSkin TL_17 = new ArmorBaseSkin("tl17", "t17",WARENAI, 2);
	public static  ArmorBaseSkin TS_17 = new ArmorBaseSkin("ts17", "t17",WARENAI, 3);
	public static  ArmorBaseSkin TH_18 = new ArmorBaseSkin("th18","t18", WARENAI, 0);
	public static  ArmorBaseSkin TC_18 = new ArmorBaseSkin("tc18","t18", WARENAI, 1);
	public static  ArmorBaseSkin TL_18 = new ArmorBaseSkin("tl18", "t18",WARENAI, 2);
	public static  ArmorBaseSkin TS_18 = new ArmorBaseSkin("ts18", "t18",WARENAI, 3);
	public static  ArmorBaseSkin TH_19 = new ArmorBaseSkin("th19", "t19",WARENAI, 0);
	public static  ArmorBaseSkin TC_19 = new ArmorBaseSkin("tc19", "t19",WARENAI, 1);
	public static  ArmorBaseSkin TL_19 = new ArmorBaseSkin("tl19", "t19",WARENAI, 2);
	public static  ArmorBaseSkin TS_19 = new ArmorBaseSkin("ts19", "t19",WARENAI, 3);
	public static  ArmorBaseSkin TH_20 = new ArmorBaseSkin("th20", "t20",WARENAI, 0);
	public static  ArmorBaseSkin TC_20 = new ArmorBaseSkin("tc20", "t20",WARENAI, 1);
	public static  ArmorBaseSkin TL_20 = new ArmorBaseSkin("tl20", "t20",WARENAI, 2);
	public static  ArmorBaseSkin TS_20 = new ArmorBaseSkin("ts20","t20", WARENAI, 3);
	public static void register() {
	 for(Item item : ModItems.ITEMS) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
	 }
	}
	

}
