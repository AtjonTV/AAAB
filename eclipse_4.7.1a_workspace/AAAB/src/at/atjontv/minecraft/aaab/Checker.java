package at.atjontv.minecraft.aaab;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Managers.*;
import at.atjontv.minecraft.aaab.Objects.O_Version;

public class Checker {
		
	public Checker()
	{
		System.out.println("Module Checker in at.atjontv.minecraft.aaab enabled.");
		
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
					{
						M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.TEMP_ROOT);
					}
					
					// IF DB VERSION exists do work else create
					if(M_FileSystem.Exists(E_FolderFile.FILE, Main.DB_VERSION))
					{
						// if a old version exists delete it
						if(M_FileSystem.Exists(E_FolderFile.FILE, Main.TEMP_ROOT+"version_old.json"))
							M_FileSystem.Delete(E_FolderFile.FILE, Main.TEMP_ROOT+"version_old.json");
						// otherwise move the existing version to the tmp folder
						M_FileSystem.Move(E_FolderFile.FILE, Main.DB_VERSION, Main.TEMP_ROOT+"version_old.json");
						// download the newest version file
						M_Download.Download("https://raw.githubusercontent.com/AtjonTV/AAAB/db/version.json",
								Main.DB_VERSION);
						// make a manager object
						M_JSON mjs = new M_JSON();
						// get version objects from json files
						O_Version old_version = mjs.makeVersion(Main.TEMP_ROOT+"version_old.json");
						O_Version new_version = mjs.makeVersion(Main.DB_VERSION);
						
						// get version from json (as hex) and parse it to int
						int verid_o = Integer.parseInt(old_version.getVersion(), 16 );
						int verid_n = Integer.parseInt(new_version.getVersion(), 16 );
						
						// compare if the existing version is older then the new, if true download the new version;
						if(verid_n > verid_o)
						{
							M_Download.Download(new_version.getDatabase(), Main.DBS_ROOT+"database_"+new_version.getVersion()+".json");
						}
						else // Otherwise everything is ok and good to go
							break;
					}
					else
					{
						M_Download.Download("https://raw.githubusercontent.com/AtjonTV/AAAB/db/version.json",
								Main.DB_VERSION);
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
