package at.thenightrider.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import at.atjontv.minecraft.aaab.Checker;
import at.thenightrider.Enums.E_Colors;
import at.thenightrider.Managers.Formatter;

public class CMD_Update implements Listener, CommandExecutor{

	public CMD_Update()
	{
		
	}
	
	@EventHandler
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
			Formatter f = new Formatter();
			String successMessage = f.breakerFormat(new String[]{ "[", "AAAB", "]", "\\s", "Successfully Updated the Database!" }, new E_Colors[]{ E_Colors.GRAY, E_Colors.GOLD, E_Colors.GRAY, E_Colors.GREEN });
			String errorMessage = f.breakerFormat(new String[]{ "[", "AAAB", "]", "\\s", "Could not Updated the Database!" }, new E_Colors[]{ E_Colors.GRAY, E_Colors.GOLD, E_Colors.GRAY, E_Colors.RED });
			Checker ch = new Checker(false);
			if(ch.DoCheck())
				p.sendMessage(successMessage);
			else
				p.sendMessage(errorMessage);
		}
		
		return true;
	}
	
}
