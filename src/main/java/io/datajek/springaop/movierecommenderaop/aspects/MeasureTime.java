package io.datajek.springaop.movierecommenderaop.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // annotation information to be available at runtime
@Target(ElementType.METHOD) // restrict the use of this annotation to methods only.
public @interface MeasureTime {

}