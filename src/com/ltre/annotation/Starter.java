package com.ltre.annotation;

import com.ltre.annotation.TestAnno;

public class Starter {
    
    public static void main (String[] args) {
        TestAnno.myMeth();
        TestAnno.myMeth("test", 19);
        System.out.println("------------------------------------");
        TestAnno2.myMeth();
    }
    
}
