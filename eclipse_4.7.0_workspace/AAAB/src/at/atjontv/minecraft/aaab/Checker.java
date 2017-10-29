package at.atjontv.minecraft.aaab;

import com.google.gson.Gson;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Managers.*;
import at.atjontv.minecraft.aaab.Objects.O_Version;

public class Checker {
		
	public Checker()
	{
		System.out.println("Module Checker in at.atjontv.minecraft.aaab enabled.");
		
		while(true)
		{
			if(M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.FILE_ROOT))
			{
				if(M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.DB_ROOT))
				{
					if(M_FileSystem.Exists(E_FolderFile.FILE, Main.DB_VERSION))
					{
						if(M_FileSystem.Exists(E_FolderFile.FILE, Main.TEMP_ROOT+"version_old.json"))
							M_FileSystem.Delete(E_FolderFile.FILE, Main.TEMP_ROOT+"version_old.json");
						M_FileSystem.Move(E_FolderFile.FILE, Main.DB_VERSION, Main.TEMP_ROOT+"version_old.json");
						M_Download.Download("https://raw.githubusercontent.com/AtjonTV/AAAB/db/version.json",
								Main.DB_VERSION);
						Gson g = new Gson();
						O_Version old_version = g.fromJson(Main.TEMP_ROOT+"version_old.json", O_Version.class);
						O_Version new_version = g.fromJson(Main.DB_VERSION, O_Version.class);
						
						int verid_o = Integer.parseInt(old_version.getVersion(), 16 );
						int verid_n = Integer.parseInt(new_version.getVersion(), 16 );
						
						if(verid_n > verid_o)
						{
							M_Download.Download(new_version.getDatabase(), Main.DBS_ROOT+"database_"+new_version.getVersion()+".json");
						}
						else
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
				
				if(!M_FileSystem.Exists(E_FolderFile.DIRECTORY, Main.TEMP_ROOT))
				{
					M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.TEMP_ROOT);
				}
			}
			else
			{
				M_FileSystem.Create(E_FolderFile.DIRECTORY, Main.FILE_ROOT);
			}
		}
	}
}
