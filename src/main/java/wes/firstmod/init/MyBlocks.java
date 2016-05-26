package wes.firstmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import wes.firstmod.FirstMod;

public class MyBlocks
{

	public static Block cheese_block;
	
	public static void register()
	{
		
		Block cheese_blockName = cheese_block.setRegistryName("cheese_block");
		GameRegistry.register(cheese_blockName);
		
	}
		
	public static void init()
	{

		cheese_block = new BlockMaker(Material.CLOTH, 1F, 2F, 1F).setUnlocalizedName("cheese_block");
		
	}
	
	public static void registerRender(Block block, String blockName)
	{
		
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(FirstMod.MODID + ":" + blockName, "inventory"));
		
	}
	
	public static void registerRenders()
	{
		
		registerRender(cheese_block, "cheese_block");
		
	}
		
}
