package at.atjontv.minecraft.aaab.Objects;

public class O_Version {

	protected String version;
	protected String database;

	public O_Version(String version, String database) {
		this.version = version;
		this.database = database;
	}
	
	public String getVersion() { return this.version; }
	public String getDatabase() { return this.database; }
	
}
