package com.ltre.generictype;

public class GenDemo2 {
    public static void myMeth(){
        TwoGen<Integer, String> tgObj = new TwoGen<>(123, "shabi");
        tgObj.showTypes();
        int i = tgObj.getOb1();
        System.out.println("Value: " + i);
        String s = tgObj.getOb2();
        System.out.println("Value: " + s);
    }
}


class TwoGen<T, V> {
    
    T ob1;
    V ob2;
    
    
    public TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    
    
    void showTypes() {
        System.out.println("Type of T is: " + ob1.getClass().getName());
        System.out.println("Type of V is: " + ob2.getClass().getName());
    }
    
    
    T getOb1() {
        return ob1;
    }
    
    
    V getOb2() {
        return ob2;
    }
    
}