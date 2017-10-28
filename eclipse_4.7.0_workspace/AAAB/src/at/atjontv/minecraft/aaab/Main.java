package at.atjontv.minecraft.aaab;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
		
	public static String FILE_ROOT = "plugins/AAAB/";
	public static String TEMP_ROOT = FILE_ROOT+"tmp/";
	public static String DB_ROOT = FILE_ROOT+"db/";
	public static String DBS_ROOT = DB_ROOT+"dbs/";
	public static String DB_VERSION = DB_ROOT+"version.json";
	public static String DB_FILE = DBS_ROOT+"database.json";
	
	@Override
	public void onEnable() {
		new Checker();
	}
	
}