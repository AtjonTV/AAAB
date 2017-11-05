package at.thenightrider.Managers;

import at.atjontv.minecraft.aaab.Main;
import at.thenightrider.Enums.E_Colors;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 1pm
 */

/**
 * Formatter should not be used due to the recreated enum. 
 */
@Deprecated
public class Formatter {

	public Formatter()
	{
		
	}
	
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
