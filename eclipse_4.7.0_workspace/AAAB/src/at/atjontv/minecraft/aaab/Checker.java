package at.atjontv.minecraft.aaab;

import com.google.gson.Gson;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Managers.*;
import at.atjontv.minecraft.aaab.Objects.VersionObj;

public class Checker {
		
	public Checker()
	{
		System.out.println("Module Checker in at.atjontv.minecraft.aaab enabled.");
		
		while(true)
		{
			if(FileSystem_Manager.Exists(FileSystem_TypeEnum.DIRECTORY, Main.FILE_ROOT))
			{
				if(FileSystem_Manager.Exists(FileSystem_TypeEnum.DIRECTORY, Main.DB_ROOT))
				{
					if(FileSystem_Manager.Exists(FileSystem_TypeEnum.FILE, Main.DB_VERSION))
					{
						if(FileSystem_Manager.Exists(FileSystem_TypeEnum.FILE, Main.TEMP_ROOT+"version_old.json"))
							FileSystem_Manager.Delete(FileSystem_TypeEnum.FILE, Main.TEMP_ROOT+"version_old.json");
						FileSystem_Manager.Move(FileSystem_TypeEnum.FILE, Main.DB_VERSION, Main.TEMP_ROOT+"version_old.json");
						Download_Manager.Download("https://raw.githubusercontent.com/AtjonTV/AAAB/db/version.json",
								Main.DB_VERSION);
						Gson g = new Gson();
						VersionObj old_version = g.fromJson(Main.TEMP_ROOT+"version_old.json", VersionObj.class);
						VersionObj new_version = g.fromJson(Main.DB_VERSION, VersionObj.class);
						
						int verid_o = Integer.parseInt(old_version.getVersion(), 16 );
						int verid_n = Integer.parseInt(new_version.getVersion(), 16 );
						
						if(verid_n > verid_o)
						{
							Download_Manager.Download(new_version.getDatabase(), Main.DBS_ROOT+"database_"+new_version.getVersion()+".json");
						}
						else
							break;
					}
					else
					{
						Download_Manager.Download("https://raw.githubusercontent.com/AtjonTV/AAAB/db/version.json",
								Main.DB_VERSION);
					}
				}
				else
				{
					FileSystem_Manager.Create(FileSystem_TypeEnum.DIRECTORY, Main.DB_ROOT);
				}
				
				if(!FileSystem_Manager.Exists(FileSystem_TypeEnum.DIRECTORY, Main.TEMP_ROOT))
				{
					FileSystem_Manager.Create(FileSystem_TypeEnum.DIRECTORY, Main.TEMP_ROOT);
				}
			}
			else
			{
				FileSystem_Manager.Create(FileSystem_TypeEnum.DIRECTORY, Main.FILE_ROOT);
			}
		}
	}
}
