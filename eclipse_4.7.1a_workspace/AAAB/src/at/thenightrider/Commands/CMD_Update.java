package at.thenightrider.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import at.atjontv.minecraft.aaab.Checker;
import at.atjontv.minecraft.aaab.Main;
import at.thenightrider.Enums.E_Colors;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 1pm
 */

public class CMD_Update implements CommandExecutor{

	public CMD_Update()
	{
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = null;
		if(sender instanceof Player)
			p = (Player) sender;
		if(p == null)
		{
			return false;
		}
		
		if(command.getName().equalsIgnoreCase("aaab update") || command.getName().equalsIgnoreCase("aaab -u"))
		{
			String successMessage = Main.PLUGIN_PREFIX+ E_Colors.GREEN.toString()+"Successfully Updated the Database!";
			String errorMessage =Main.PLUGIN_PREFIX+ E_Colors.RED.toString()+"Could not Updated the Database!";
			Checker ch = new Checker(false);
			if(ch.DoCheck())
				p.sendMessage(successMessage);
			else
				p.sendMessage(errorMessage);
		}
		
		return true;
	}
	
}
