package at.atjontv.software.AES;

import at.atjontv.minecraft.aaab.Annotations.Creator;
import at.atjontv.minecraft.aaab.Annotations.LastEdit;
import at.atjontv.minecraft.aaab.Annotations.Product;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction;
import at.atjontv.minecraft.aaab.Annotations.UnderConstruction.Priority;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.CLASS, name="AES_Runtime")
@Creator(createdBy="AtjonTV", createdOn="13.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
@UnderConstruction(priority=Priority.HIGH)
public class AES_Runtime {

	protected AES_Version version;
	
	@Product(type=Types.FUNCTION, name="AES_Runtime")
	@Creator(createdBy="AtjonTV", createdOn="13.11.2017")
	@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
	public AES_Runtime(AES_Version ver)
	{
		this.version = ver;
	}
	
	
	
}
