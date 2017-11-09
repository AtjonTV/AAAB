package at.atjontv.minecraft.aaab;

import org.bukkit.Bukkit;

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
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
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
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#------------------------------#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#    Alt Account Auto Ban v2   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#   AAAB v2 [v"+this.getDescription().getVersion()+"]   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#------------------------------#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"# AAAB by "+E_Colors.RED.toString()+"AtjonTV"+E_Colors.AQUA.toString()+" and others:  #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"# "+E_Colors.RED.toString()+"TheNightRider,               "+E_Colors.AQUA.toString()+"#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#------------------------------#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#   AAAB's Official Website:   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#  "+E_Colors.GREEN.toString()+"http://l.beeit.org/rEKe9X"+E_Colors.AQUA.toString()+"   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#------------------------------#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#     AAAB is Open Source:     #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#  "+E_Colors.GREEN.toString()+"http://l.beeit.org/iuny38"+E_Colors.AQUA.toString()+"   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#------------------------------#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"# Updates can be found on here:#");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#  "+E_Colors.GREEN.toString()+"http://l.beeit.org/lkD5KN"+E_Colors.AQUA.toString()+"   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#              or              #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#  "+E_Colors.GREEN.toString()+"http://l.beeit.org/Ox1MJa"+E_Colors.AQUA.toString()+"   #");
		Bukkit.getConsoleSender().sendMessage(E_Colors.AQUA.toString()+"#------------------------------#");
		Bukkit.getConsoleSender().sendMessage(PLUGIN_PREFIX+" Checking Modules ..");
		new Checker(true);
		new Listeners(this);
		new Commander(this);
	}
}