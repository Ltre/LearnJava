package com.ltre.generictype;

public class GenDemo3 {
    
    public static void myMeth() {
        
    }
    
}


class Stats<T extends Number> {
    
    T[] nums;
    
    Stats(T[] o) {
        nums = o;
    }
    
    
    double average() {
        double sum = 0;
        for (T n : nums) {
            sum += n.doubleValue();
        }
        return sum / nums.length;
    }
    
}