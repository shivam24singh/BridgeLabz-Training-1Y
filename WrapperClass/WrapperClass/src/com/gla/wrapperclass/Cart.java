package com.gla.wrapperclass;

public class Cart {
    public static void main(String[] args) {
        String[] arr = {"250","499","abc","99"};

        int total = 0;

        for(String x: arr){
            try{
                total += Integer.parseInt(x);
            }catch(Exception e){
                System.out.println("Invalid: "+x);
            }
        }

        System.out.println("Total: "+total);
    }
}