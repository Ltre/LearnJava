package com.ltre.annotation;

import com.ltre.annotation.TestAnno;

public class Starter {
    
    public static void main (String[] args) {
        TestAnno.myMeth();
        System.out.println("------------------------------------");
        TestAnno.myMeth("test", 19);
        System.out.println("------------------------------------");
        TestAnno2.myMeth();
        System.out.println("------------------------------------");
        Maker.myMeth();
        System.out.println("------------------------------------");
        Single.myMeth();
        System.out.println("------------------------------------");
        TypeAnnotation.myMeth(10);
    }
    
}
