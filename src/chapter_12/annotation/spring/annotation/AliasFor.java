package chapter_12.annotation.spring.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface AliasFor {

    @AliasFor("attribute")
    String value() default "";


    @AliasFor("value")
    String attribute() default "";


    Class<? extends Annotation> annotation() default Annotation.class;

}
