package at.atjontv.minecraft.aaab.Game;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import at.atjontv.minecraft.aaab.Checker;
import at.atjontv.minecraft.aaab.Main;

public class Listeners implements Listener{

	protected String[][] _users;
	protected int count = 0;
	
	public Listeners(Main plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
<<<<<<< HEAD
		this._users = at.thenightrider.Json.Manager.getBlacklist(Main.DB_NEWEST);
=======
		this._users = at.thenightrider.json.Manager.getBlacklist(Main.DB_NEWEST);
>>>>>>> 54b5a263949326910a7fa9a578b83c1582d3557d
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		if(this._users == null)
			System.err.print("Error in at.atjontv.minecraft.aaab.Game.Listeners.java:23 [Given object is null]");
		else
		{
			// Loop durch das 2D array welches die daten der blacklist enthält
			count++;
			for(int i = 0; i < this._users.length; i++)
			{
				if(this._users[i][1].equalsIgnoreCase(e.getPlayer().getUniqueId().toString()) || 
						this._users[i][0].equalsIgnoreCase(e.getPlayer().getName()))
				{
					System.out.println("Blacklist Check :: The player "+e.getPlayer().getName()+" is on the Blacklist");
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ban "+e.getPlayer().getName()+" "+this._users[i][2]);
				}
			}
			
			// Nach allen 30 joins soll die config geupdatet werden.
			if(count >= 30)
			{
				Checker c = new Checker(false);
				c.DoCheck();
				count = 0;
			}
		}
	}
	
}
