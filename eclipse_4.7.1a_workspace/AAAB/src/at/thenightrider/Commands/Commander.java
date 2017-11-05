package at.thenightrider.Commands;

import at.atjontv.minecraft.aaab.Main;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 1pm
 */

public class Commander {

	protected Main pluginMain;
	
	public Commander(Main main)
	{
		this.pluginMain = main;
	}
	
	public void Enable()
	{
		this.pluginMain.getCommand("aaab").setExecutor(new CMD_Update());
	}
	
}
