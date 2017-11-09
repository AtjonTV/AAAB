package at.atjontv.minecraft.aaab.Objects;

import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
@UnderConstruction(priority = Priority.HIGH)

/**
 * Currently Deprecated due to the 'String[][] Json.Manager.getBlacklist(String file)' method 
 */
@Deprecated
public class O_Database {

	protected String[] blacklist;
	protected String[] whitelist;

	public O_Database(String[] blacklist, String[] whitelist) {
		this.blacklist = blacklist;
		this.whitelist = whitelist;
	}
	
	public String[] getBlacklist() { return this.blacklist; }
	public String[] getWhitelist() { return this.whitelist; }
	
}
