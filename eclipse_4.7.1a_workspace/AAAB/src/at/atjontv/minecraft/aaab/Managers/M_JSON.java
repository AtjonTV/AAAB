package at.atjontv.minecraft.aaab.Managers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import at.atjontv.minecraft.aaab.Enums.E_FolderFile;
import at.atjontv.minecraft.aaab.Objects.*;
import at.atjontv.minecraft.aaab.Objects.O_Version;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="10.11.2017")
public class M_JSON {

	public M_JSON()
	{
		
	}
	
	public O_Version makeVersion(String file)
	{
		if(!M_FileSystem.Exists(E_FolderFile.FILE, file))
			return null;
		
        JSONParser parser = new JSONParser();
        try {
        	O_Version ver;
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            String version = (String) jsonObject.get("version");
            String database = (String) jsonObject.get("db_file");
            ver = new O_Version(version, database);
            return ver;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
		return null;
	}
	
	/**
	 * Currently Deprecated due to the 'String[][] Json.Manager.getBlacklist(String file)' method 
	 */
	@Deprecated
	public O_Database makeDatabase(String file)
	{
		if(!M_FileSystem.Exists(E_FolderFile.FILE, file))
			return null;
		return null;
	}
	
	@UnderConstruction(priority=Priority.HIGH)
	@Deprecated
	public O_Config makeConfig(String file)
	{
		if(!M_FileSystem.Exists(E_FolderFile.FILE, file))
			return null;
		
		return null;
	}
	
}
