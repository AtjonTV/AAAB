package at.thenightrider.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class Manager {

	public Manager()
	{
		
	}
	
	public static String[] getBlacklist(String file)
	{
		JSONObject objRoot = JsonUtils.getJsonObjectFromFile(file);
		if(objRoot == null)
			System.err.print("Error in at.thenightrider.json.Manager.java:16 [Given object is null]");
		else
		{
			JSONArray blacklist = (JSONArray) objRoot.get("blacklist");
			
			String[] uuids = new String[blacklist.length()];
			
			for(int i = 0; i < blacklist.length(); i++)
			{
				JSONObject userObj = blacklist.getJSONObject(i);
				uuids[i] = userObj.getString("uuid");
			}
			return uuids;
		}
		return null;
	}
}
