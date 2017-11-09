package at.atjontv.minecraft.aaab.Annotations;

public @interface UnderConstruction {
	public enum Priority { LOW, MEDIUM, HIGH }
	String value() default "Object is Under Construction.";
    Priority priority() default Priority.MEDIUM;
    String createdBy() default "AtjonTV";
    String lastChanged() default "09.11.2017";
}
