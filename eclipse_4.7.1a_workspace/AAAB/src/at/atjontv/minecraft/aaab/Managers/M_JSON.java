package at.atjontv.minecraft.aaab.Managers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import at.atjontv.minecraft.aaab.Objects.O_Version;

public class M_JSON {

	public M_JSON()
	{
		
	}
	
	public O_Version makeVersion(String file)
	{
        JSONParser parser = new JSONParser();
        try {
        	O_Version ver;
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            String version = (String) jsonObject.get("version");
            String database = (String) jsonObject.get("database");
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
	
}
