package at.atjontv.minecraft.aaab.Objects;

import at.atjontv.minecraft.aaab.Annotations.*;
import at.thenightrider.Enums.E_Colors;

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



	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getDatabase_version() {
		return database_version;
	}

	public void setDatabase_version(String database_version) {
		this.database_version = database_version;
	}

	public String getDatabase_location() {
		return database_location;
	}

	public void setDatabase_location(String database_location) {
		this.database_location = database_location;
	}

	public E_Colors getPrefix_color() {
		return prefix_color;
	}

	public void setPrefix_color(E_Colors prefix_color) {
		this.prefix_color = prefix_color;
	}

	public E_Colors getPrefix_s_color() {
		return prefix_s_color;
	}

	public void setPrefix_s_color(E_Colors prefix_s_color) {
		this.prefix_s_color = prefix_s_color;
	}

	public String getPrefix_text() {
		return prefix_text;
	}

	public void setPrefix_text(String prefix_text) {
		this.prefix_text = prefix_text;
	}

	public char getPrefix_s_b_char() {
		return prefix_s_b_char;
	}

	public void setPrefix_s_b_char(char prefix_s_b_char) {
		this.prefix_s_b_char = prefix_s_b_char;
	}

	public char getPrefix_s_e_char() {
		return prefix_s_e_char;
	}

	public void setPrefix_s_e_char(char prefix_s_e_char) {
		this.prefix_s_e_char = prefix_s_e_char;
	}

	public String[][] getLocal_whitelist() {
		return local_whitelist;
	}

	public void setLocal_whitelist(String[][] local_whitelist) {
		this.local_whitelist = local_whitelist;
	}
	
}
