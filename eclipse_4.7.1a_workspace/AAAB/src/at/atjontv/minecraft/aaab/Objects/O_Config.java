package at.atjontv.minecraft.aaab.Objects;

import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;
import at.thenightrider.Enums.E_Colors;

@Product(type=Types.CLASS, name="O_Config")
@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="10.11.2017")
public class O_Config {

	protected boolean enabled = false;
	protected String database_version = "";
	protected String database_location = "";
	protected E_Colors prefix_color = E_Colors.GOLD;
	protected E_Colors prefix_s_color = E_Colors.GRAY;
	protected String prefix_text = "AAAB";
	protected char prefix_s_b_char = '[';
	protected char prefix_s_e_char = ']';
	protected String[][] local_whitelist = null;
	
	public O_Config()
	{
		
	}
	
	
	@Product(type=Types.FUNCTION, name="O_Config")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public O_Config(boolean enabled, String database_version, String database_location, E_Colors prefix_color,
			E_Colors prefix_s_color, String prefix_text, char prefix_s_b_char, char prefix_s_e_char,
			String[][] local_whitelist) {
		super();
		this.enabled = enabled;
		this.database_version = database_version;
		this.database_location = database_location;
		this.prefix_color = prefix_color;
		this.prefix_s_color = prefix_s_color;
		this.prefix_text = prefix_text;
		this.prefix_s_b_char = prefix_s_b_char;
		this.prefix_s_e_char = prefix_s_e_char;
		this.local_whitelist = local_whitelist;
	}


	@Product(type=Types.FUNCTION, name="isEnabled")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public boolean isEnabled() {
		return enabled;
	}

	@Product(type=Types.FUNCTION, name="setEnabled")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Product(type=Types.FUNCTION, name="getDatabase_version")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String getDatabase_version() {
		return database_version;
	}

	@Product(type=Types.FUNCTION, name="setDatabase_version")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setDatabase_version(String database_version) {
		this.database_version = database_version;
	}

	@Product(type=Types.FUNCTION, name="getDatabase_location")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String getDatabase_location() {
		return database_location;
	}

	@Product(type=Types.FUNCTION, name="setDatabase_location")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setDatabase_location(String database_location) {
		this.database_location = database_location;
	}

	@Product(type=Types.FUNCTION, name="getPrefix_color")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public E_Colors getPrefix_color() {
		return prefix_color;
	}

	@Product(type=Types.FUNCTION, name="setPrefix_color")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setPrefix_color(E_Colors prefix_color) {
		this.prefix_color = prefix_color;
	}

	@Product(type=Types.FUNCTION, name="getPrefix_s_color")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public E_Colors getPrefix_s_color() {
		return prefix_s_color;
	}

	@Product(type=Types.FUNCTION, name="setPrefix_s_color")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setPrefix_s_color(E_Colors prefix_s_color) {
		this.prefix_s_color = prefix_s_color;
	}

	@Product(type=Types.FUNCTION, name="getPrefix_text")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String getPrefix_text() {
		return prefix_text;
	}

	@Product(type=Types.FUNCTION, name="setPrefix_text")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setPrefix_text(String prefix_text) {
		this.prefix_text = prefix_text;
	}

	@Product(type=Types.FUNCTION, name="getPrefix_s_b_char")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public char getPrefix_s_b_char() {
		return prefix_s_b_char;
	}

	@Product(type=Types.FUNCTION, name="setPrefix_s_b_char")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setPrefix_s_b_char(char prefix_s_b_char) {
		this.prefix_s_b_char = prefix_s_b_char;
	}

	@Product(type=Types.FUNCTION, name="getPrefix_s_e_char")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public char getPrefix_s_e_char() {
		return prefix_s_e_char;
	}

	@Product(type=Types.FUNCTION, name="setPrefix_s_e_char")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setPrefix_s_e_char(char prefix_s_e_char) {
		this.prefix_s_e_char = prefix_s_e_char;
	}

	@Product(type=Types.FUNCTION, name="getLocal_whitelist")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public String[][] getLocal_whitelist() {
		return local_whitelist;
	}

	@Product(type=Types.FUNCTION, name="setLocal_whitelist")
	@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public void setLocal_whitelist(String[][] local_whitelist) {
		this.local_whitelist = local_whitelist;
	}
	
}
