package at.thenightrider.Json;

import at.atjontv.minecraft.aaab.Enums.E_FolderFile;
import at.atjontv.minecraft.aaab.Managers.*;

import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONObject;
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="TheNightRider", createdOn="30.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public class JsonUtils {

	public static String getJsonStringFromFile(String file)
	{
		if(!M_FileSystem.Exists(E_FolderFile.FILE, file))
		{
			System.err.print("Error in at.thenightrider.json.JsonUtils.java:17 [Given string is empty]");
			return null;
		}
		try
		{
			Scanner scanner;
			InputStream in = M_FileSystem.getInputStreamFromFile(file);
			if(in == null)
			{
				System.err.print("Error in at.thenightrider.json.JsonUtils.java:26 [Given filestream is null]");
				return null;
			}
			scanner = new Scanner(in);
			String json = scanner.useDelimiter("\\Z").next();
			scanner.close();
			in.close();
			return json;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public static JSONObject getJsonObjectFromFile(String file)
	{
		if(!M_FileSystem.Exists(E_FolderFile.FILE, file))
		{
			System.err.print("Error in at.thenightrider.json.JsonUtils.java:43 [Given file does not exist]");
			return null;
		}
		if(file == null)
			System.err.print("Error in at.thenightrider.json.JsonUtils.java:47 [Given string is empty]");
		else
			return new JSONObject(getJsonStringFromFile(file));
		return null;
	}
	
	public static boolean objectExists(JSONObject jsonObjects, String key)
	{
		Object o;
		try {
			o = jsonObjects.get(key);
		}
		catch(Exception e)
		{
			return false;
		}
		return o != null;
	}
	
}
