package com.ltre.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class")
@MyAnno(str = "TestAnno2", val = 99)
public class TestAnno2 {

    @What(description = "An annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        TestAnno2 an = new TestAnno2();
        try {
            Annotation[] annos = an.getClass().getAnnotations();
            System.out.println("All annotations for TestAnno2:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();
            Method m = an.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("All annotations for myMeth:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }
    
}
