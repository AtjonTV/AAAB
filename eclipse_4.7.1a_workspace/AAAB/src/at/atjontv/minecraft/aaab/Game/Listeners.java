package at.atjontv.minecraft.aaab.Game;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import at.atjontv.minecraft.aaab.Main;
import at.atjontv.minecraft.aaab.Managers.M_JSON;
import at.atjontv.minecraft.aaab.Objects.O_Database;

public class Listeners implements Listener{

	public Listeners(Main plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		M_JSON mjs = new M_JSON();
		O_Database dbo = mjs.makeDatabase(Main.DB_NEWEST);
		if(dbo != null)
		{
			String[] db = dbo.getBlacklist();
			for(int i = 0; i < db.length; i++)
			{
				System.out.println(db[i]);
			}
			System.out.print("not null");
		}
		System.out.print("null");
		System.out.print("done");
	}
	
}
