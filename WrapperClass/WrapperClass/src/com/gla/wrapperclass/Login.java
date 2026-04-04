package com.gla.wrapperclass;

public class Login {
    public static boolean check(String s){
        try{
            int age = Integer.parseInt(s);
            return age >= 18;
        }catch(Exception e){
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check("20"));
        System.out.println(check("abc"));
    }
}