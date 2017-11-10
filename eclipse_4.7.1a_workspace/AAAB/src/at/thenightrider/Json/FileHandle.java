package at.thenightrider.Json;

import java.io.FileInputStream;
import java.io.InputStream;

import at.atjontv.minecraft.aaab.Enums.E_FolderFile;
import at.atjontv.minecraft.aaab.Managers.M_FileSystem;
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="TheNightRider", createdOn="30.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
public class FileHandle {

	public static InputStream getInputStreamFromFile(String file)
	{
		if(!M_FileSystem.Exists(E_FolderFile.FILE, file))
		{
			System.err.print("Error in at.thenightrider.json.FileHandle.java:14 [Given file could not be found]");
			return null;
		}
		try
		{
			InputStream instr = new FileInputStream(file);
			return instr;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
