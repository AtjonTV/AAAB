package at.atjontv.minecraft.aaab.Objects;

public class VersionObj {

	protected String version;
	protected String database;

	public VersionObj(String version, String database) {
		this.version = version;
		this.database = database;
	}
	
	public String getVersion() { return this.version; }
	public String getDatabase() { return this.database; }
	
}
