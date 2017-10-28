package at.atjontv.minecraft.aaab.Managers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import at.atjontv.minecraft.aaab.Enums.FileSystem_TypeEnum;

public class Download_Manager {

	public static boolean Download(String uri, String loc)
	{
		try{
			URL website = new URL(uri);
			InputStream in = website.openStream();
			Files.copy(in, Paths.get(loc), StandardCopyOption.REPLACE_EXISTING);
			in.close();
		    if(FileSystem_Manager.Exists(FileSystem_TypeEnum.FILE, loc))
		    	return true;
		    else
		    	return false;
		}
		catch(IOException er)
		{
			er.printStackTrace();
		}
		return false;
	}
	
}
