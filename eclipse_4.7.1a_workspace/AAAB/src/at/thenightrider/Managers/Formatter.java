package at.thenightrider.Managers;

import at.atjontv.minecraft.aaab.Main;
import at.thenightrider.Enums.E_Colors;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Creator(createdBy="TheNightRider", createdOn="01.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="10.11.2017")
@UnderConstruction(priority=Priority.LOW)
public class Formatter {

	public Formatter()
	{
		
	}
	
	@Creator(createdBy="AtjonTV",createdOn="10.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="10.11.2017")
	public String varintextFormat(String text, String key, String replacement)
	{
		String txt = text.replace(key, replacement);
		return txt;
	}
	
	@Creator(createdBy="AtjonTV",createdOn="10.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="10.11.2017")
	public String playerintextFormat(String text, String replacement)
	{
		String txt = text.replace("@p", replacement);
		return txt;
	}
	
	@Deprecated
	public String breakerFormat(String[] in, E_Colors[] colorInOrder)
	{
		String finalStr = "";
		
		for(int i = 0; i < in.length; i++)
		{
			if(in[i].equalsIgnoreCase("\\s"))
				finalStr += " ";
			else
				finalStr += Main.BUKKIT_COLOR_BEGIN+getColor(colorInOrder[0]) + in[i];
		}
		
		return finalStr;
	}
	
	@Deprecated
	public String getColor(E_Colors color)
	{
		switch(color)
		{
		case BLACK:
			return "0";
		case DARK_BLUE:
			return "1";
		case DARK_GREEN:
			return "2";
		case DARK_AQUA:
			return "3";
		case DARK_RED:
			return "4";
		case DARK_PURPLE:
			return "5";
		case GOLD:
			return "6";
		case GRAY:
			return "7";
		case DARK_GRAY:
			return "8";
		case BLUE:
			return "9";
		case GREEN:
			return "a";
		case AQUA:
			return "b";
		case RED:
			return "c";
		case LIGHT_PURPLE:
			return "d";
		case YELLOW:
			return "e";
		case WHITE:
			return "f";
		default:
			return "7";
		}
	}
}
