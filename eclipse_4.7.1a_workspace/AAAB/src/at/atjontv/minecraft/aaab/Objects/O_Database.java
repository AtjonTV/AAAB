package at.atjontv.minecraft.aaab.Objects;

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
