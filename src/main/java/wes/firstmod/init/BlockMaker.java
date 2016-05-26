package wes.firstmod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMaker extends Block
{

	public BlockMaker (Material material, float hardness, float resistance, float lightLevel)
	{
		
		super(material);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightLevel(lightLevel);
		
	}
	
}
