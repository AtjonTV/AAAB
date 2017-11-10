package eu.atjontv.minecraft.aaab.LanguagePack;

import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Creator(createdBy="AtjonTV", createdOn="10.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="11.11.2017")
@UnderConstruction(priority=Priority.SUPERHIGH)
public class Lang_English {

	protected static String no_permission = "You don't have permission to do this!";
	protected static String db_update_success = "Successfully Updated the Database!";
	protected static String db_update_nosuccess = "Cloud not Update the Database!";
	protected static String db_uptodate = "The Database is up-to-date!";
	protected static String checking_modules = "Checking Modules ...";
	protected static String module_listeners = "Module 'Listeners' in 'at.atjontv.minecraft.aaab.Game' enabled.";
	protected static String design_warning = "This list does not look as good as in the Console";
	protected static String save_config_error = "Fatal error in 'at.atjontv.minecraft.aaab.Managers.M_Config.saveConfig()' [Given Parameters are null or emtpy]!";
	protected static String get_jsonstringfromfile_error = "Fatal error in 'at.thenightrider.Json.JsonUtils.getJsonStringFromFile()' [Given Parameters are null or emtpy]!";
	protected static String get_jsonobjectfromfile_error = "Fatal error in 'at.thenightrider.Json.JsonUtils.getJsonObjectFromFile()' [Given Parameters are null or emtpy]!";
	protected static String get_inputstreamfromfile_error ="Fatal error in 'at.thenightrider.Json.FileHandle.getInputStreamFromFile()' [File Could not be Found]!";
	protected static String on_playerjoin_error = "Fatal error in 'at.atjontv.minecraft.aaab.Game.Listeners.onPlayerJoin()' [A value is null or empty]!";
	protected static String blacklist_info = "Blacklist Check :: The player @p is on the Blacklist!";
	protected static String userbanned = "Blacklist Check :: The player @p was Banned!";
	
	public static String getNo_permission() {
		return no_permission;
	}
	public static String getDb_update_success() {
		return db_update_success;
	}
	public static String getDb_update_nosuccess() {
		return db_update_nosuccess;
	}
	public static String getDb_uptodate() {
		return db_uptodate;
	}
	public static String getChecking_modules() {
		return checking_modules;
	}
	public static String getModule_listeners() {
		return module_listeners;
	}
	public static String getDesign_warning() {
		return design_warning;
	}
	public static String getSave_config_error() {
		return save_config_error;
	}
	public static String getGet_jsonstringfromfile_error() {
		return get_jsonstringfromfile_error;
	}
	public static String getGet_jsonobjectfromfile_error() {
		return get_jsonobjectfromfile_error;
	}
	public static String getGet_inputstreamfromfile_error() {
		return get_inputstreamfromfile_error;
	}
	public static String getOn_playerjoin_error() {
		return on_playerjoin_error;
	}
	public static String getBlacklist_info() {
		return blacklist_info;
	}
	public static String getUserbanned() {
		return userbanned;
	}
}
