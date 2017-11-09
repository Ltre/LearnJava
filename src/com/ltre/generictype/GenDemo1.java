package com.ltre.generictype;

public class GenDemo1 {

    public static void myMeth(){
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value: " + v);
        Gen<String> strOb = new Gen<String> ("Sb Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
    
}


class Gen<T> {
    
    T ob;
    
    Gen(T o) {
        ob = o;
    }
    
    T getOb() {
        return ob;
    }
    
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
    
}