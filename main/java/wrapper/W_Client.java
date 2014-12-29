package wrapper;

import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import cpw.mods.fml.common.Loader;

// バージョン差分吸収をおこなう。
public class W_Client
{
	private static W_IClient instance = getInstance();
	
	private static W_IClient getInstance()
	{
		if(Loader.MC_VERSION.equalsIgnoreCase("1.7.2"))
		{
			return new wrapper.mc172.W_CClient();
		}
		else if(Loader.MC_VERSION.equalsIgnoreCase("1.7.10"))
		{
			return new wrapper.mc1710.W_CClient();
		}
		return null;
	}
	
	public static void renderSkeletonHead(TileEntitySkullRenderer skullRenderer,
			float x, float y, float z,
			int p_147530_4_, float p_147530_5_, int p_147530_6_,
			String p_147530_7_)
	{
		instance.renderSkeletonHead(skullRenderer, x, y, z, p_147530_4_, p_147530_5_, p_147530_6_, p_147530_7_);
	}
}
