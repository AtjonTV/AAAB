package at.atjontv.minecraft.aaab.Annotations;

@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="09.11.2017")
public @interface Creator {
    String createdBy() default "";
    String createdOn() default "";
}