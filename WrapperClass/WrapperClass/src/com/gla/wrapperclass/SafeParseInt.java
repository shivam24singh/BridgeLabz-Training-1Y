package com.gla.wrapperclass;

public class SafeParseInt {
    public static int safeParseInt(String s){
        try{
            return Integer.parseInt(s);
        }catch(Exception e){
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(safeParseInt("123"));
        System.out.println(safeParseInt("abc"));
        System.out.println(safeParseInt("45.6"));
        System.out.println(safeParseInt("0"));
    }
}