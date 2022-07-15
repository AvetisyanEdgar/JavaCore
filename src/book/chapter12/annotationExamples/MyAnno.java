package book.chapter12.annotationExamples;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default  "Test";

    int val() default 9000;
}
