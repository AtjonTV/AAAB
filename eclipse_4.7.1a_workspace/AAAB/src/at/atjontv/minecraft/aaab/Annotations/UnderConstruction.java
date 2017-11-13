package at.atjontv.minecraft.aaab.Annotations;

import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.ANNOTATION, name="UnderConstruct")
@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public @interface UnderConstruction {
	public enum Priority { SUPERLOW, LOW, MEDIUM, HIGH, SUPERHIGH }
	String value() default "Object is Under Construction.";
    Priority priority() default Priority.MEDIUM;
}
