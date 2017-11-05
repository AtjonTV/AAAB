package at.atjontv.minecraft.aaab;

/*
 * This software is licensed under OSPL (Open Source Project License Version 1.1 by ATVG-Studios)
 * [ License: http://atvg-studios.at/OSPLv1.1 ]
 * 
 * 
 * 	Copyright 2015-2017 ATVG-Studios/AtjonTV (Thomas Obernosterer)
 * 
 */

import org.bukkit.plugin.java.JavaPlugin;

import at.atjontv.minecraft.aaab.Game.Listeners;
import at.thenightrider.Commands.Commander;
import at.thenightrider.Enums.E_Colors;

public class Main extends JavaPlugin{
		
	// die version.json welche information über  die datenbank datei gibt, muss hier angegeben werden.
	//public static String GIT = "https://raw.githubusercontent.com/TheNightRider/AAAB/db/version.json";
	public static String GIT = "https://raw.githubusercontent.com/AtjonTV/AAAB/db/version.json";
	
	public static String FILE_ROOT = "plugins/AAAB/";
	public static String TEMP_ROOT = FILE_ROOT+"tmp/";
	public static String DB_ROOT = FILE_ROOT+"db/";
	public static String DBS_ROOT = DB_ROOT+"dbs/";
	public static String DB_VERSION = DB_ROOT+"version.json";
	public static String DB_FILE = DBS_ROOT+"database.json";
	public static String DB_NEWEST = "";
	
	protected static char paragraph = (char)167;
	public static String BUKKIT_COLOR_BEGIN = paragraph+"";
	public static String PLUGIN_PREFIX = E_Colors.GRAY.toString()+"["+E_Colors.GOLD.toString()+"AAAB"+E_Colors.GRAY.toString()+"]";
	
	@Override
	public void onEnable() {
		new Checker(true);
		new Listeners(this);
		(new Commander(this)).Enable();
	}
}