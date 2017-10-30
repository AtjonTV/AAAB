package at.atjontv.minecraft.aaab.Game;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import at.atjontv.minecraft.aaab.Main;

public class Listeners implements Listener{

	public Listeners(Main plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		String[] uuids = at.thenightrider.json.Manager.getBlacklist(Main.DB_NEWEST);
		if(uuids == null)
			System.err.print("Error in at.atjontv.minecraft.aaab.Game.Listeners.java:20 [Given object is null]");
		else
		{
			for (String uuid : uuids) {
				System.out.println(uuid);
			}
		}
	}
	
}
