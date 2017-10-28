package at.atjontv.minecraft.aaab;

import at.atjontv.minecraft.aaab.Enums.*;
import at.atjontv.minecraft.aaab.Managers.*;

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
						break;
					}
					else
					{
						Download_Manager.Download("http://github.atvg-studios.at/global_package.json"/* This is not the real json for this project*/,
								Main.DB_VERSION);
					}
				}
				else
				{
					FileSystem_Manager.Create(FileSystem_TypeEnum.DIRECTORY, Main.DB_ROOT);
				}
			}
			else
			{
				FileSystem_Manager.Create(FileSystem_TypeEnum.DIRECTORY, Main.FILE_ROOT);
			}
		}
		
		System.out.println("OK");
	}
}
