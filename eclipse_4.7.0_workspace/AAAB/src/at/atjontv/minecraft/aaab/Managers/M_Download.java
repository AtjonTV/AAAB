package at.atjontv.minecraft.aaab.Managers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import at.atjontv.minecraft.aaab.Enums.E_FolderFile;

public class M_Download {

	public static boolean Download(String uri, String loc)
	{
		try{
			URL website = new URL(uri);
			InputStream in = website.openStream();
			Files.copy(in, Paths.get(loc), StandardCopyOption.REPLACE_EXISTING);
			in.close();
		    if(M_FileSystem.Exists(E_FolderFile.FILE, loc))
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
