package at.atjontv.minecraft.aaab.Objects;
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
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
