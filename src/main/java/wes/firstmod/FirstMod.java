package wes.firstmod;


import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import wes.firstmod.init.MyBlocks;
import wes.firstmod.init.MyItems;



@Mod(modid = FirstMod.MODID, version = FirstMod.VERSION)

public class FirstMod
{

	public static final String MODID = "firstmod";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		MyRecipes.addRecipes();
		
		MyItems.init();
		MyItems.register();
		MyItems.registerRenders();
		
		MyBlocks.init();
		MyBlocks.register();
		MyBlocks.registerRenders();
		
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
