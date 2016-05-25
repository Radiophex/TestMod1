package wes.firstmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyRecipes {
	
	public static void addRecipes()
	{
		
		GameRegistry.addRecipe(new ItemStack(Blocks.GOLD_BLOCK, 20),"A A"," A ","A A",'A',Blocks.DIRT);
		
		GameRegistry.addRecipe(new ItemStack(Blocks.OBSIDIAN),"AAA","AAA","AAA", 'A', Items.COOKIE);
		
		GameRegistry.addRecipe(new ItemStack(Items.APPLE, 4), "AA ", "AA ", 'A', Blocks.COBBLESTONE);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIAMOND_BLOCK), Items.COAL, Items.LAVA_BUCKET, new ItemStack(Blocks.WOOL, 1, 2));
		
	}

}
