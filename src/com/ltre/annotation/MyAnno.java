package com.ltre.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * A simple annotation type
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {

    String str();
    
    int val();
    
}
