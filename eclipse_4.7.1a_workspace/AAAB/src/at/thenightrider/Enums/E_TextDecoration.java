package at.thenightrider.Enums;

import at.atjontv.minecraft.aaab.Main;
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="TheNightRider", createdOn="01.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
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
