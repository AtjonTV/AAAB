package at.thenightrider.json;

import java.io.FileInputStream;
import java.io.InputStream;

import at.atjontv.minecraft.aaab.Enums.E_FolderFile;
import at.atjontv.minecraft.aaab.Managers.M_FileSystem;

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
		
		System.out.println("at.thenightrider.json.FileHandle.java:27 ; Returning null after try-catch");
		return null;
	}
	
}
