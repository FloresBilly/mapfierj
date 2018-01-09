package io.ermdev.mapfierj;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
public @interface ConvertTo {

    Class<?> value();

    Class<? extends TypeConverterAdapter> converter() default NoConverter.class;

    String[] scanPackages() default "";
}
