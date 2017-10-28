package at.atjontv.minecraft.aaab.Managers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import at.atjontv.minecraft.aaab.Enums.*;

public class FileSystem_Manager {

	public static boolean Exists(FileSystem_TypeEnum type, String name)
	{
		if(type == FileSystem_TypeEnum.FILE)
		{
			File f = new File(name);
			if(f.exists() && !f.isDirectory())
				return true;
			else
				return false;
		}
		else if (type == FileSystem_TypeEnum.DIRECTORY)
		{
			File f = new File(name);
			if(f.exists() && f.isDirectory())
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static boolean Create(FileSystem_TypeEnum type, String name)
	{
		if(type == FileSystem_TypeEnum.FILE && !Exists(type, name))
		{
			File f = new File(name);
			try
			{
				if(f.createNewFile())
					return true;
				else
					return false;
			}
			catch(IOException er)
			{
				er.printStackTrace();
			}
		}
		else if (type == FileSystem_TypeEnum.DIRECTORY && !Exists(type, name))
		{
			Path path = Paths.get(name);
			try
			{
				Files.createDirectories(path);
				if(Exists(type, name))
					return true;
				else
					return false;
			}
			catch(IOException er)
			{
				er.printStackTrace();
			}
		}
		else
			return false;
		return false;
	}
	
}
