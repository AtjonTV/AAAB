package at.atjontv.minecraft.aaab.Managers;

import at.atjontv.minecraft.aaab.Enums.E_ConfigFileAction;
import at.atjontv.minecraft.aaab.Objects.O_Config;

import org.json.JSONObject;

import at.atjontv.minecraft.aaab.Main;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="10.11.2017")
@UnderConstruction(priority = Priority.HIGH)
public class M_Config {

	public M_Config()
	{
		
	}
	
	public O_Config createConfig() {
		
		O_Config obj = new O_Config();
		obj.setDatabase_version(Main.DB_VERSION_STR);
		obj.setDatabase_location(Main.DB_NEWEST);
		obj.setEnabled(false);
		
		return obj;
	}
	
	public String getConfigAsJson(O_Config conf)
	{
		JSONObject obj = new JSONObject(conf);
		String str = obj.toString();
		return str;
	}
	
	public void saveConfig(E_ConfigFileAction action, O_Config config)
	{
		if(action == E_ConfigFileAction.OPEN_OR_CRATE)
		{
			
		}
		else if (action == E_ConfigFileAction.CRATE)
		{
			
		}
		else if (action == E_ConfigFileAction.OPEN)
		{
			
		}
		else
			System.out.println("Fatal error in 'at.atjontv.minecraft.aaab.Managers.M_Config (E_ConfigFileAction param not given.");
	}
	
}
