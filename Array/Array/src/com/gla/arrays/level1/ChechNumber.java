package com.gla.arrays.level1;
import java.util.*;
public class ChechNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(num[i]>0){
                if(num[i]%2==0){
                    System.out.println("Positive and Even");
                }
                else{
                    System.out.println("Positive and Odd");
                }
            }
            else if(num[i]<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
        if(num[0]==num[4]){
            System.out.println("First and last elements are equal.");
        }
        else if(num[0]>num[4]){
            System.out.println("First element is greater than last.");
        }
        else {
                System.out.println("Last element is greater than first.");
        }
    }
}
