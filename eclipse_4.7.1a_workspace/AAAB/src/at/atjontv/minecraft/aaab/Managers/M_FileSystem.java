package at.atjontv.minecraft.aaab.Managers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Annotations.*;

@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
public class M_FileSystem {

	public static boolean Exists(E_FolderFile type, String name)
	{
		if(type == E_FolderFile.FILE)
		{
			File f = new File(name);
			if(f.exists() && !f.isDirectory())
				return true;
			else
				return false;
		}
		else if (type == E_FolderFile.DIRECTORY)
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
	
	public static boolean Create(E_FolderFile type, String name)
	{
		if(type == E_FolderFile.FILE && !Exists(type, name))
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
		else if (type == E_FolderFile.DIRECTORY && !Exists(type, name))
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
	
	public static boolean Move(E_FolderFile type, String source, String target)
	{
		if(type == E_FolderFile.FILE && Exists(type, source) && !Exists(type, target))
		{
			try {
				Files.move(Paths.get(source), Paths.get(target), StandardCopyOption.REPLACE_EXISTING);
				if(!Exists(type, source) && Exists(type, target))
					return true;
				else
					return false;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else if (type == E_FolderFile.DIRECTORY && Exists(type, source) && !Exists(type, target))
		{
			try {
				Files.move(Paths.get(source), Paths.get(target), StandardCopyOption.REPLACE_EXISTING);
				if(!Exists(type, source) && Exists(type, target))
					return true;
				else
					return false;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
			return false;
		return false;
	}

	public static boolean Delete(E_FolderFile type, String name)
	{
		if(type == E_FolderFile.FILE)
		{
			try
			{
				Path p = Paths.get(name);
				Files.delete(p);
				if(!Exists(type, name))
					return true;
				else
					return false;
			}
			catch(Exception er)
			{
				er.printStackTrace();
			}
		}
		else if (type == E_FolderFile.DIRECTORY)
		{
			try
			{
				Path p = Paths.get(name);
				Files.delete(p);
				if(!Exists(type, name))
					return true;
				else
					return false;
			}
			catch(Exception er)
			{
				er.printStackTrace();
			}
		}
		else
			return false;
		return false;
	}
}
