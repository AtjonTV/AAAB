package at.atjontv.minecraft.aaab.Objects;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.CLASS, name="O_Version")
@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public class O_Version {

	protected String version;
	protected String database;

	@Product(type=Types.FUNCTION, name="O_Version")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public O_Version(String version, String database) {
		this.version = version;
		this.database = database;
	}
	
	@Product(type=Types.FUNCTION, name="getVersion")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String getVersion() { return this.version; }
	
	@Product(type=Types.FUNCTION, name="getDatabase")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String getDatabase() { return this.database; }
	
}
