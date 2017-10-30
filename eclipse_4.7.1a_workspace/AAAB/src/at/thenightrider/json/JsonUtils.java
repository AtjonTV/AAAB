package at.thenightrider.json;

import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONObject;

public class JsonUtils {

	public static String getJsonStringFromFile(String file)
	{
		try
		{
			Scanner scanner;
			InputStream in = FileHandle.getInputStreamFromFile(file);
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
		if(file == null)
			System.err.print("Error in at.thenightrider.json.JsonUtils.java:29 [Given string is empty]");
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
