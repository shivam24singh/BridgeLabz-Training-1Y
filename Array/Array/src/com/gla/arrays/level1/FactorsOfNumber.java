package com.gla.arrays.level1;
import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] factors = new int[10];
        int f=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                factors[f]=i;
                f++;
            }
        }
        System.out.println("Factors of "+a);
        for (int j=0;j<f;j++){
            System.out.println(factors[j]);
        }
    }
}
