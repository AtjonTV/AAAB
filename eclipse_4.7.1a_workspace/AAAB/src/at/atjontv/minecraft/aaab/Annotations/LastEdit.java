package at.atjontv.minecraft.aaab.Annotations;

import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Product(type=Types.ANNOTATION, name="LastEdit")
@Creator(createdBy="AtjonTV", createdOn="09.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public @interface LastEdit {
    String changedBy() default "";
    String lastChanged() default "";
}
