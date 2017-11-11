package at.atjontv.minecraft.aaab.Annotations;

public @interface UnderConstruction {
	public enum Priority { SUPERLOW, LOW, MEDIUM, HIGH, SUPERHIGH }
	String value() default "Object is Under Construction.";
    Priority priority() default Priority.MEDIUM;
}
