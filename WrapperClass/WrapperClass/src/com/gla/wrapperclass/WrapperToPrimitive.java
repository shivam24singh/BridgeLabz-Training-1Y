package com.gla.wrapperclass;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double d = 45.67;

        double d1 = d;       // auto-unboxing
        int i = (int)d1;     // casting

        System.out.println(d1);
        System.out.println(i);
    }
}