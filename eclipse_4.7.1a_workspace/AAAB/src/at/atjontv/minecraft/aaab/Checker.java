package at.atjontv.minecraft.aaab;

import org.bukkit.Bukkit;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Managers.*;
import at.atjontv.minecraft.aaab.Objects.O_Version;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.MODULE, name="Checker")
@Product(type=Types.CLASS, name="Checker")
@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public class Checker {
		
	@Product(type=Types.FUNCTION, name="Checker")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public Checker(boolean run)
	{
		System.out.println("Module 'Checker' in at.atjontv.minecraft.aaab enabled.");
		
		if(run)
			 DoCheck();
	}
	
	@Product(type=Types.FUNCTION, name="DoCheck")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public boolean DoCheck()
	{
		/*
		 * Permanent Loop
		 */
		while(true)
		{
			// If the FILE ROOT exists check subfolders else create
			if(M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.FILE_ROOT))
			{
				// if DB ROOT exists check subfolders else create
				if(M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.DB_ROOT))
				{
					// if DBS ROOT does not exist create
					if(!M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.DBS_ROOT))
						M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.DBS_ROOT);
					
					// if the tmp folder does not exist create
					if(!M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.TEMP_ROOT))
						M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.TEMP_ROOT);
					
					// IF DB VERSION exists do work else create
					if(M_FileSystem.Exists(E_FolderFile.FILE, Main.DB_VERSION))
					{
						// if a old version exists delete it
						if(M_FileSystem.Exists(E_FolderFile.FILE, Main.TEMP_ROOT+"version_old.json"))
							M_FileSystem.Delete(E_FolderFile.FILE, Main.TEMP_ROOT+"version_old.json");
						// otherwise move the existing version to the tmp folder
						M_FileSystem.Move(E_FolderFile.FILE, Main.DB_VERSION, Main.TEMP_ROOT+"version_old.json");
						// download the newest version file
						M_Download.Download(Main.GIT, Main.DB_VERSION);
						// make a manager object
						M_JSON mjs = new M_JSON();
						// get version objects from json files
						O_Version old_version = mjs.makeVersion(Main.TEMP_ROOT+"version_old.json");
						O_Version new_version = mjs.makeVersion(Main.DB_VERSION);
						
						// get version from json (as hex) and parse it to int
						int verid_o = Integer.parseInt(old_version.getVersion(), 16 );
						int verid_n = Integer.parseInt(new_version.getVersion(), 16 );
						
						// Set the newest version
						Main.DB_NEWEST = Main.DBS_ROOT+"database_"+new_version.getVersion()+".json";
						
						// compare if the existing version is older then the new, if true download the new version;
						if(verid_n > verid_o)
						{
							M_Download.Download(new_version.getDatabase(), Main.DB_NEWEST);
						}
						else // Otherwise everything is ok and good to go
						{
							Main.DB_VERSION_STR = new_version.getVersion();
							Bukkit.getConsoleSender().sendMessage(Main.PLUGIN_PREFIX+" Database is up to date.");
							return true;
						}
					}
					else
					{
						M_Download.Download(Main.GIT, Main.DB_VERSION);
					}
				}
				else
				{
					M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.DB_ROOT);
				}
				
			}
			else
			{
				M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.FILE_ROOT);
			}
		}
	}
}
