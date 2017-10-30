package at.atjontv.minecraft.aaab.Game;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import at.atjontv.minecraft.aaab.Main;

public class Listeners implements Listener{

	protected String[][] _users;
	
	public Listeners(Main plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		this._users = at.thenightrider.json.Manager.getBlacklist(Main.DB_NEWEST);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{
		if(this._users == null)
			System.err.print("Error in at.atjontv.minecraft.aaab.Game.Listeners.java:23 [Given object is null]");
		else
		{
			for(int i = 0; i < this._users.length; i++)
			{
				if(this._users[i][1].toLowerCase() == e.getPlayer().getUniqueId().toString().toLowerCase() || this._users[i][0].toLowerCase() == e.getPlayer().getName().toLowerCase())
				{
					System.out.println("Blacklist Check :: The player "+e.getPlayer().getName()+" in on the Blacklist");
					Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "ban "+e.getPlayer().getName()+" You got banned by AAAB, Reason: "+this._users[i][2]+"\n\n["+"Blacklist: "+i+"::"+this._users[i][0]+"::"+this._users[i][1]+"::"+this._users[i][2]+"]");
				}
			}
			
			for(int i = 0; i < this._users.length; i++)
			{
				System.out.println("Blacklist: "+i+"::"+this._users[i][0]+"::"+this._users[i][1]+"::"+this._users[i][2]);
			}
		}
	}
	
}
