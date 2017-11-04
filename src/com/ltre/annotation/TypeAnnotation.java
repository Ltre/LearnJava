package com.ltre.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


@Target(ElementType.TYPE_USE)
@interface TypeAnno {}


@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}


@Target(ElementType.TYPE_USE)
@interface Unique {}


@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}


@Target(ElementType.TYPE_PARAMETER)
@interface Whatx {
    String description();
}


@Target(ElementType.FIELD)
@interface EmptyOk {}


@Target(ElementType.METHOD)
@interface Recommend {}



public class TypeAnnotation<@Whatx(description = "Generic data type") T> {
    
    public @Unique TypeAnnotation() {}
    
    @TypeAnno String str;
    
    @EmptyOk String test;
    
    
    public int f(@TypeAnno TypeAnnotation<T> this, int x) {
        return 10;
    }
    
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }
    
    
    public @Recommend Integer f3(String str) {
        return str.length();
    }
    
    
    public void f4() throws @TypeAnno NullPointerException {
        System.out.println("the fuck f4() executed.");
    }
    
    
    String @MaxLen(10) [] @NotZeroLen [] w;
    
    
    @TypeAnno Integer[] vec;
    
    
    public static void myMeth(int i) {
        TypeAnnotation<@TypeAnno Integer> ob = new TypeAnnotation<@TypeAnno Integer>();
        @Unique TypeAnnotation<Integer> ob2 = new @Unique TypeAnnotation<Integer>();
        Object x = new Integer(10);
        Integer y;
        y = (@TypeAnno Integer) x;
    }
    
}
