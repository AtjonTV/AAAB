package at.thenightrider.Enums;

import at.atjontv.minecraft.aaab.*;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 1pm
 */

public enum E_Colors {
	BLACK(Main.BUKKIT_COLOR_BEGIN+"0"),
	DARK_BLUE(Main.BUKKIT_COLOR_BEGIN+"1"),
	DARK_GREEN(Main.BUKKIT_COLOR_BEGIN+"2"),
	DARK_AQUA(Main.BUKKIT_COLOR_BEGIN+"3"),
	DARK_RED(Main.BUKKIT_COLOR_BEGIN+"4"),
	DARK_PURPLE(Main.BUKKIT_COLOR_BEGIN+"5"),
	GOLD(Main.BUKKIT_COLOR_BEGIN+"6"),
	GRAY(Main.BUKKIT_COLOR_BEGIN+"7"),
	DARK_GRAY(Main.BUKKIT_COLOR_BEGIN+"8"),
	BLUE(Main.BUKKIT_COLOR_BEGIN+"9"),
	GREEN(Main.BUKKIT_COLOR_BEGIN+"a"),
	AQUA(Main.BUKKIT_COLOR_BEGIN+"b"),
	RED(Main.BUKKIT_COLOR_BEGIN+"c"),
	LIGHT_PURPLE(Main.BUKKIT_COLOR_BEGIN+"d"),
	YELLOW(Main.BUKKIT_COLOR_BEGIN+"e"),
	WHITE(Main.BUKKIT_COLOR_BEGIN+"f");
	
	private final String value;
	
	E_Colors(String colVal)
	{
		value = colVal;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return value;
	}
}