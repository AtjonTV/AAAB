package at.atjontv.minecraft.aaab.Managers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.CLASS, name="M_FileSystem")
@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public class M_FileSystem {

	@Product(type=Types.FUNCTION, name="Exists")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="29.10.2017")
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
	
	@Product(type=Types.FUNCTION, name="Create")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="29.10.2017")
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
	
	@Product(type=Types.FUNCTION, name="Move")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="29.10.2017")
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

	@Product(type=Types.FUNCTION, name="Delete")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="29.10.2017")
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
	
	@Product(type=Types.FUNCTION, name="getInputStreamFromFile")
	@Creator(createdBy="TheNightRider", createdOn="30.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
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
