package at.atjontv.minecraft.aaab.Annotations;

public @interface UnderConstruction {
	public enum Priority { LOW, MEDIUM, HIGH }
	String value() default "Object is Under Construction.";
    Priority priority() default Priority.MEDIUM;
}
