package at.thenightrider.json;

import java.io.InputStream;

public class FileHandle {

	public static InputStream getInputStreamFromFile(String file)
	{
		try
		{
			InputStream instr = FileHandle.class.getResourceAsStream(file);
			return instr;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
}
