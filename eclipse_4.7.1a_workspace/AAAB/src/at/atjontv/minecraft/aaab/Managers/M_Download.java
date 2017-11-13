package at.atjontv.minecraft.aaab.Managers;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import at.atjontv.minecraft.aaab.Enums.E_FolderFile;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;

@Product(type=Types.CLASS, name="M_Download")
@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
@UnderConstruction(priority = Priority.HIGH)
public class M_Download {

	@Product(type=Types.FUNCTION, name="Download")
	@Creator(createdBy="AtjonTV", createdOn="29.10.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
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
