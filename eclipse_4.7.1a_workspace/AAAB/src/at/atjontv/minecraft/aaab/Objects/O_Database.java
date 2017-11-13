package at.atjontv.minecraft.aaab.Objects;

import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Product(type=Types.CLASS, name="O_Database")
@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
@UnderConstruction(priority = Priority.HIGH)

/**
 * Currently Deprecated due to the 'String[][] Json.Manager.getBlacklist(String file)' method 
 */
@Deprecated
public class O_Database {

	protected String[] blacklist;
	protected String[] whitelist;

	@Product(type=Types.FUNCTION, name="O_Database")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public O_Database(String[] blacklist, String[] whitelist) {
		this.blacklist = blacklist;
		this.whitelist = whitelist;
	}
	
	@Product(type=Types.FUNCTION, name="getBlacklist")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String[] getBlacklist() { return this.blacklist; }
	
	@Product(type=Types.FUNCTION, name="getWhitelist")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String[] getWhitelist() { return this.whitelist; }
	
}
