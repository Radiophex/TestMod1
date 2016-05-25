package wes.firstmod.init;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodMaker extends ItemFood
{
	
	private PotionEffect[] effects;
	
	public FoodMaker(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect... effects)
	{
		
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(unlocalizedName);
		this.effects = effects;
		
	}

}
