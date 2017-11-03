package com.ltre.learnjava.annotation;

import java.lang.reflect.Method;

public class TestAnno {

    @MyAnno(str = "MyAnno Example", val = 100)
    public static void myMeth() {
        System.out.println("myMeth run");
        TestAnno ob = new TestAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno an = m.getAnnotation(MyAnno.class);
            System.out.println(an.str() + ", " + an.val());
        } catch (NoSuchMethodException e) {
            System.out.println(e);
        }
    }
    
}
