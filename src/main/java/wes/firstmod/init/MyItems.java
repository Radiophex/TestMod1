package wes.firstmod.init;

import wes.firstmod.FirstMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyItems
{
	
	public static Item cheese;
	
	/*public static void preInit()
	{
		
		
		
	}*/
	
	public static void register()
	{
		
		Item cheeseName = cheese.setRegistryName("cheese");
		cheese = new Item().setUnlocalizedName("cheese");
		GameRegistry.register(cheeseName);
		
	}
		
	public static void init()
	{
		
		//cheese = new Item().setUnlocalizedName("cheese");
		cheese = new FoodMaker("cheese", 2, 0.2f, false);
		
	}
	
	public static void registerRender(Item item, String itemName)
	{
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(FirstMod.MODID + ":" + itemName, "inventory"));
		
	}
	
	public static void registerRenders()
	{
		
		registerRender(cheese, "cheese");
		
	}

}
