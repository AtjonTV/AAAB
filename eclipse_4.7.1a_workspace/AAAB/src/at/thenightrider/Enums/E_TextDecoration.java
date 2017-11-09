package at.thenightrider.Enums;

import at.atjontv.minecraft.aaab.Main;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 1pm
 */

public enum E_TextDecoration {
	OBFUSCATED(Main.BUKKIT_COLOR_BEGIN+"k"),
	BOLD(Main.BUKKIT_COLOR_BEGIN+"l"),
	STRIKETHROUGH(Main.BUKKIT_COLOR_BEGIN+"m"),
	UNDERLINE(Main.BUKKIT_COLOR_BEGIN+"n"),
	ITALIC(Main.BUKKIT_COLOR_BEGIN+"o"),
	NONE(Main.BUKKIT_COLOR_BEGIN+"r");
	
	private final String value;
	
	E_TextDecoration(String colVal)
	{
		value = colVal;
	}
	
	public String getValue()
	{
		return value;
	}
}
