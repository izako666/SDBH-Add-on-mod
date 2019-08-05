package com.izako.dbhmod;

import net.minecraft.init.Blocks;

import com.izako.dbhmod.init.ModItems;
import com.izako.dbhmod.proxy.ServerProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SDBH.PROJECT_ID, name = SDBH.PROJECT_NAME, version = SDBH.PROJECT_VERSION, acceptedMinecraftVersions = "[1.7.10]")
public class SDBH
{
	
	@SidedProxy(clientSide = "com.izako.dbhmod.proxy.ClientProxy", serverSide = "com.izako.dbhmod.proxy.ServerProxy")
	public static ServerProxy proxy;
public static final String
	
	PROJECT_ID = "dbhmod",
	PROJECT_NAME = "SDBH Add-on mod",
	PROJECT_VERSION = "0.1",
	PROJECT_MCVERSION = "1.7.10";
	 @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
		 ModItems.register();
			
	    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
		
    }
}
