package com.gla.wrapperclass;
import java.util.*;

public class Performance {
    public static void main(String[] args) {
        int n = 1000000;

        long t1 = System.currentTimeMillis();
        int[] arr = new int[n];
        int sum1=0;
        for(int i=0;i<n;i++){
            arr[i]=i;
            sum1+=arr[i];
        }
        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        int sum2=0;
        for(int i=0;i<n;i++){
            list.add(i);
            sum2+=list.get(i);
        }
        long t4 = System.currentTimeMillis();

        System.out.println("Array: "+(t2-t1));
        System.out.println("List: "+(t4-t3));
    }
}