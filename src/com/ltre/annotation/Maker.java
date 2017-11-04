package com.ltre.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface MyMaker {}


public class Maker {
    
    @MyMaker
    public static void myMeth() {
        Maker ob = new Maker();
        try {
            Method e = ob.getClass().getMethod("myMeth");
            if (e.isAnnotationPresent(MyMaker.class)) {
                System.out.println("MyMaker is present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }
    
}

