package at.atjontv.minecraft.aaab.Enums;
import at.atjontv.minecraft.aaab.Annotations.*;
import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.ENUM, name="E_ConfigFileAction")
@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public enum E_ConfigFileAction {
	OPEN,
	CRATE,
	OPEN_OR_CRATE
}
