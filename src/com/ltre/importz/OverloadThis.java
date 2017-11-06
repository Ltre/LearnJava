package com.ltre.importz;

public class OverloadThis {
    
    int a;
    int b;
    
    public OverloadThis(int i, int j) {
        a = i;
        b = j;
    }
    
    public OverloadThis(int i) {
        this(i, i);
    }
    
    public OverloadThis() {
        this(0);
    }
    
    public static void myMeth() {
        OverloadThis o = new OverloadThis();
    }
    
}
