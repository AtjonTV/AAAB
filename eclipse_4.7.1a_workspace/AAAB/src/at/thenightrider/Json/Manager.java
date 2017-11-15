package at.thenightrider.Json;

import org.json.JSONArray;
import org.json.JSONObject;
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="TheNightRider", createdOn="30.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
public class Manager {

	public Manager()
	{
		
	}
	
	public static String[][] getBlacklist(String file)
	{
		JSONObject objRoot = JsonUtils.getJsonObjectFromFile(file);
		if(objRoot == null)
			System.err.print("Error in at.thenightrider.json.Manager.java:20 [Given object is null]");
		else
		{
			JSONArray blacklist = (JSONArray) objRoot.get("blacklist");
			
			String[] names = new String[blacklist.length()];
			String[] uuids = new String[blacklist.length()];
			String[] reason = new String[blacklist.length()];
			
			for(int i = 0; i < blacklist.length(); i++)
			{
				JSONObject userObj = blacklist.getJSONObject(i);
				names[i] = userObj.getString("name");
				uuids[i] = userObj.getString("uuid");
				reason[i] = userObj.getString("reason");
			}
			
			String[][] final_blacklist = new String[blacklist.length()][3];
			
			for(int i = 0; i < blacklist.length(); i++)
			{
				final_blacklist[i][0] = names[i];
				final_blacklist[i][1] = uuids[i];
				final_blacklist[i][2] = reason[i];
			}
			
			return final_blacklist;
		}
		return null;
	}
}
