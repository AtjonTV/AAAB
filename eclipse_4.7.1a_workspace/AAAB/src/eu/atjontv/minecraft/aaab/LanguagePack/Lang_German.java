package eu.atjontv.minecraft.aaab.LanguagePack;

import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Creator(createdBy="AtjonTV", createdOn="10.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="11.11.2017")
@UnderConstruction(priority=Priority.SUPERHIGH)
public class Lang_German {

	protected static String no_permission = "Du hast keine berechtigung um das zu tun!";
	protected static String db_update_success = "Datenbank-Upadte erfolgreich durchgeführt!";
	protected static String db_update_nosuccess = "Datenbank-Update ist fehlgeschlagen";
	protected static String db_uptodate = "Die Datenbank ist auf dem Neuesten Stand!";
	protected static String checking_modules = "Überprüfe Module ...";
	protected static String module_listeners = "Modul 'Listeners' in 'at.atjontv.minecraft.aaab.Game' aktiviert.";
	protected static String design_warning = "Diese liste sieht nicht so gut aus als in der Console";
	protected static String save_config_error = "Fataler Fehler in 'at.atjontv.minecraft.aaab.Managers.M_Config.saveConfig()' [Gegebene Parameter sind null oder leer]!";
	protected static String get_jsonstringfromfile_error = "Fataler Fehler in 'at.thenightrider.Json.JsonUtils.getJsonStringFromFile()' [Gegebene Parameter sind null oder leer]!";
	protected static String get_jsonobjectfromfile_error = "Fataler Fehler in 'at.thenightrider.Json.JsonUtils.getJsonObjectFromFile()' [Gegebene Parameter sind null oder leer]!";
	protected static String get_inputstreamfromfile_error ="Fataler Fehler in 'at.thenightrider.Json.FileHandle.getInputStreamFromFile()' [Datei konnte nicht gefunden werden]!";
	protected static String on_playerjoin_error = "Fataler Fehler in 'at.atjontv.minecraft.aaab.Game.Listeners.onPlayerJoin()' [Ein wert ist null oder leer]!";
	protected static String blacklist_info = "Blacklist Check :: Der Spieler @p ist auf der Blacklist!";
	protected static String userbanned = "Blacklist Check :: Der Spieler @p wurde Gebannt!";
	
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
