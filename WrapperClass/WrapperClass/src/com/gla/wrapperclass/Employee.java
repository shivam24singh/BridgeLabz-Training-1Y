package com.gla.wrapperclass;
import java.util.*;

public class Employee {
    public static void main(String[] args) {
        int[] arr = {25,30,18,40};

        ArrayList<Integer> list = new ArrayList<>();

        for(int x: arr){
            list.add(x);
        }

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}