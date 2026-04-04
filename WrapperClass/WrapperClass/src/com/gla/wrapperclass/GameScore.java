package com.gla.wrapperclass;

public class GameScore {
    public static void main(String[] args) {
        Integer[] arr = {10,null,20,null,30};

        int count=0, sum=0;

        for(Integer x: arr){
            if(x == null) count++;
            else sum += x;
        }

        System.out.println("Null count: "+count);
        System.out.println("Sum: "+sum);
    }
}