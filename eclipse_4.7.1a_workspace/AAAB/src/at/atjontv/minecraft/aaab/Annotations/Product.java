package at.atjontv.minecraft.aaab.Annotations;

import java.lang.annotation.Repeatable;

import at.atjontv.minecraft.aaab.Annotations.Product.Types;

@Repeatable(Products.class)
@Product(type=Types.ANNOTATION, name="Product")
@Creator(createdBy="AtjonTV", createdOn="13.11.2017")
@LastEdit(changedBy="AtjonTV", lastChanged="13.11.2017")
public @interface Product {
	public enum Types { CLASS, FUNCTION, VARIABLE, COMMENT, ANNOTATION, INTERFACE, ENUM, MODULE; }
	Types type() default Types.MODULE;
	String name() default "Class-Module";
}
