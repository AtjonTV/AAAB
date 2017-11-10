package at.atjontv.minecraft.aaab.Managers;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;
import eu.atjontv.minecraft.aaab.LanguagePack.E_Langs;
import eu.atjontv.minecraft.aaab.LanguagePack.Lang_English;
import eu.atjontv.minecraft.aaab.LanguagePack.Lang_German;

@Creator(createdBy="AtjonTV", createdOn="11.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="11.11.2017")
@UnderConstruction(priority=Priority.SUPERHIGH)
public class M_Language {

	protected static E_Langs selectedLang;
	
	public static void setSelectedLang(E_Langs lang)
	{
		selectedLang = lang;
	}
	
	public static E_Langs getSelectedLang()
	{
		return selectedLang;
	}
	
	// TODO: Add every entry from the Language Pack, so it can be accessed easiely.
	public static String getLangText(String key)
	{
		switch(key)
		{
		case "no_permission":
			if(getSelectedLang() == E_Langs.GERMAN)
				return Lang_German.getNo_permission();
			else if (getSelectedLang() == E_Langs.ENGLISH)
				return Lang_English.getNo_permission();
			else
				return "";
		default:
			return "";
		}
	}
	
}
