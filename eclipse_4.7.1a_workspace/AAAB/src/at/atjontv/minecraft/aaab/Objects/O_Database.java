package at.atjontv.minecraft.aaab.Objects;

/*
 * Last edited by AtjonTV
 * 5th November 2017 at 1pm
 */

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
