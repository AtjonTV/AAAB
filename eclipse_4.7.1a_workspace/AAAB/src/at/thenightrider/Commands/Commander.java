package at.thenightrider.Commands;

import at.atjontv.minecraft.aaab.Main;

public class Commander {

	protected Main pluginMain;
	
	public Commander(Main main)
	{
		this.pluginMain = main;
	}
	
	public void Enable()
	{
		this.pluginMain.getServer().getPluginManager().registerEvents(new CMD_Update(), this.pluginMain);
	}
	
}
