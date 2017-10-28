package at.atjontv.minecraft.aaab;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
		
	public static String FILE_ROOT = "plugins/AAAB/";
	public static String DB_ROOT = FILE_ROOT+"db/";
	public static String DB_VERSION = DB_ROOT+"version.json";
	public static String DB_FILE = DB_ROOT+"database.json";
	
	@Override
	public void onEnable() {
		new Checker();
	}
	
}