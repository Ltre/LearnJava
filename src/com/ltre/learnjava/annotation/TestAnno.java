package com.ltre.learnjava.annotation;

public class TestAnno {

    @MyAnno(str = "MyAnno Example", val = 100)
    public static void myMeth() {
        System.out.println("myMeth run");
    }
    
}
