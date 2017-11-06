package at.thenightrider.Commands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import at.atjontv.minecraft.aaab.Checker;
import at.atjontv.minecraft.aaab.Main;
import at.thenightrider.Enums.E_Colors;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 9pm
 */

public class Commander implements Listener{
	
	protected Main pluginMain;
	
	public Commander(Main main)
	{
		System.out.println("Module 'Commander' in at.thenightrider.Commands enabled.");
		this.pluginMain = main;
		this.pluginMain.getServer().getPluginManager().registerEvents(this, main);
	}
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent e)
	{
		Player p = e.getPlayer();
		boolean doit = false;
		
		if(e.getMessage().startsWith((char)37+""))
		{
			doit = true;
			e.setCancelled(true);
		}
		
		if(doit)
		{
			if(!p.hasPermission("aaab.admin"))
			{
				doit = false;
			}
			
			if(doit && e.getMessage().equalsIgnoreCase((char)37+"aaab update") || e.getMessage().equalsIgnoreCase((char)37+"aaab -u"))
			{
				String successMessage = Main.PLUGIN_PREFIX+ E_Colors.GREEN.toString()+" Successfully Updated the Database!";
				String errorMessage =Main.PLUGIN_PREFIX+ E_Colors.RED.toString()+" Could not Updated the Database!";
				Checker ch = new Checker(false);
				if(ch.DoCheck())
					p.sendMessage(successMessage);
				else
					p.sendMessage(errorMessage);
			}
			
			if(doit && e.getMessage().equalsIgnoreCase((char)37+"aaab info"))
			{
				p.sendMessage(E_Colors.AQUA.toString()+"#---------------------------#");
				p.sendMessage(E_Colors.AQUA.toString()+"#        Alt Account Auto Ban v2       #");
				p.sendMessage(E_Colors.AQUA.toString()+"#     AAAB v2 [v"+this.pluginMain.getDescription().getVersion()+"]      #");
				p.sendMessage(E_Colors.AQUA.toString()+"#---------------------------#");
				p.sendMessage(E_Colors.AQUA.toString()+"#  AAAB by "+E_Colors.RED.toString()+"AtjonTV"+E_Colors.AQUA.toString()+" and others:    #");
				p.sendMessage(E_Colors.AQUA.toString()+"# "+E_Colors.RED.toString()+"TheNightRider,                             "+E_Colors.AQUA.toString()+"#");
				p.sendMessage(E_Colors.AQUA.toString()+"#---------------------------#");
				p.sendMessage(E_Colors.AQUA.toString()+"#        AAAB's Official Website:        #");
				p.sendMessage(E_Colors.AQUA.toString()+"#     "+E_Colors.GREEN.toString()+"http://l.beeit.org/rEKe9X"+E_Colors.AQUA.toString()+"       #");
				p.sendMessage(E_Colors.AQUA.toString()+"#---------------------------#");
				p.sendMessage(E_Colors.AQUA.toString()+"#          AAAB is Open Source:         #");
				p.sendMessage(E_Colors.AQUA.toString()+"#     "+E_Colors.GREEN.toString()+"http://l.beeit.org/iuny38"+E_Colors.AQUA.toString()+"        #");
				p.sendMessage(E_Colors.AQUA.toString()+"#---------------------------#");
				p.sendMessage(E_Colors.AQUA.toString()+"# Updates can be found on here:  #");
				p.sendMessage(E_Colors.AQUA.toString()+"#      "+E_Colors.GREEN.toString()+"http://l.beeit.org/lkD5KN"+E_Colors.AQUA.toString()+"       #");
				p.sendMessage(E_Colors.AQUA.toString()+"#                          or                        #");
				p.sendMessage(E_Colors.AQUA.toString()+"#      "+E_Colors.GREEN.toString()+"http://l.beeit.org/Ox1MJa"+E_Colors.AQUA.toString()+"      #");
				p.sendMessage(E_Colors.AQUA.toString()+"#---------------------------#");
				p.sendMessage(E_Colors.AQUA.toString()+" ~~ This list does not look as good as in the console ~~");
			}
		}
	}
}